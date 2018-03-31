package com.sojoline.presenter.profile;

import com.sojoline.model.bean.ProfileBean;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/********************************
 * Created by lvshicheng on 2017/3/6.
 ********************************/
public interface ProfileContract {

  interface View extends LvIBaseView{

    void getProfileSuccess(ProfileBean profileBean);

    void getProfileFailed(String msg);
  }

  interface Presenter extends LvIBasePresenter<View> {

    void getProfile();
  }
}
