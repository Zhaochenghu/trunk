package com.sojoline.presenter.collection;

import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/********************************
 * Created by lvshicheng on 2017/4/11.
 ********************************/
public interface CollectionContract {

  interface View extends LvIBaseView {

    void getFavorListSuccess();
  }

  interface Presenter<R> extends LvIBasePresenter<R> {

    void getFavorList();
  }
}
