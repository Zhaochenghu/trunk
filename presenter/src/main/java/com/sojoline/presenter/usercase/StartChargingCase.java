package com.sojoline.presenter.usercase;

import com.sojoline.model.dagger.ApiComponentHolder;
import com.sojoline.model.request.StartChargingRequest;
import com.sojoline.model.response.ChargingResponse;
import com.sojoline.model.response.SimpleResponse;

import cn.com.leanvision.baseframe.model.usercase.UserCase;
import cn.com.leanvision.baseframe.rx.transformers.SchedulersCompat;
import rx.Observable;

/********************************
 * Created by lvshicheng on 2017/4/25.
 ********************************/
public class StartChargingCase extends UserCase<ChargingResponse, StartChargingRequest> {

  @Override
  public Observable<ChargingResponse> interactor(StartChargingRequest params) {
    return ApiComponentHolder.sApiComponent.apiService()
        .startCharging(params)
        .take(1)
        .compose(SchedulersCompat.<ChargingResponse>applyNewSchedulers());
  }
}
