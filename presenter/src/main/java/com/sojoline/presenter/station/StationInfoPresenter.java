package com.sojoline.presenter.station;

import com.sojoline.model.dagger.ApiComponentHolder;
import com.sojoline.model.request.StartChargingRequest;
import com.sojoline.model.response.ChargingResponse;
import com.sojoline.model.response.SimpleResponse;
import com.sojoline.model.response.StationInfoResponse;
import com.sojoline.presenter.usercase.ScanStationCase;
import com.sojoline.presenter.usercase.StartChargingCase;

import java.lang.ref.WeakReference;

import cn.com.leanvision.baseframe.rx.SimpleSubscriber;
import cn.com.leanvision.baseframe.rx.transformers.SchedulersCompat;
import rx.Subscription;

/********************************
 * Created by lvshicheng on 2017/4/21.
 ********************************/
public class StationInfoPresenter implements StationInfoContract.Presenter<StationInfoContract.View> {

  private WeakReference<StationInfoContract.View> wrView;
  private ScanStationCase   scanStationCase;
  private StartChargingCase startChargingCase;

  @Override
  public void attachView(StationInfoContract.View view) {
    wrView = new WeakReference<>(view);

    scanStationCase = new ScanStationCase();
    startChargingCase = new StartChargingCase();
  }

  @Override
  public void detachView() {
    wrView.clear();

    scanStationCase.unSubscribe();
    startChargingCase.unSubscribe();
  }

  @Override
  public void queryStation(String qrCode) {
    scanStationCase.createObservable(qrCode)
        .subscribe(new SimpleSubscriber<StationInfoResponse>() {

          @Override
          public void onStart() {
            if (isViewActive()) {
              getView().showLoading(null);
            }
          }

          @Override
          public void onError(Throwable e) {
            super.onError(e);
            if (isViewActive()) {
              getView().showNormal();
              getView().queryStationInfoFailed(null);
            }
          }

          @Override
          public void onNext(StationInfoResponse response) {
            if (isViewActive()) {
              getView().showNormal();
              if (response.isSuccess()) {
                getView().queryStationInfoSuccess(response.stationInfo);
              } else {
                getView().queryStationInfoFailed(response.msg);
              }
            }
          }
        });
  }

  @Override
  public void startCharging(StartChargingRequest request) {
    startChargingCase.createObservable(request)
        .subscribe(new SimpleSubscriber<ChargingResponse>() {

          @Override
          public void onError(Throwable e) {
            super.onError(e);
            if (isViewActive()) {
                getView().showNormal();
              getView().startChargingFailed(null);
            }
          }

          @Override
          public void onNext(ChargingResponse response) {
            if (isViewActive()) {
                getView().showNormal();
              if (response.isSuccess()) {
                getView().callBack(response.charging);
              } else {
                getView().startChargingFailed(response.msg);
              }
            }
          }

            @Override
            public void onStart() {
                super.onStart();
                if (isViewActive()) {
                    getView().showLoading(null);
                }
            }
        });
  }

  @Override
  public boolean isViewActive() {
    return wrView.get() != null;
  }

  @Override
  public StationInfoContract.View getView() {
    return wrView.get();
  }
}
