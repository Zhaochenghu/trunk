package com.sojoline.presenter.main;

import com.sojoline.model.bean.StationDetailBean;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/********************************
 * Created by lvshicheng on 2017/4/26.
 ********************************/
public interface StationDetailContract {

  interface View extends LvIBaseView {

    void getSummarySuccess(StationDetailBean stationDetailBean);

  }

  interface Presenter<R> extends LvIBasePresenter<R> {

    void getSubstationSummary(String stationId);

    boolean isViewActive();

    R getView();
  }
}
