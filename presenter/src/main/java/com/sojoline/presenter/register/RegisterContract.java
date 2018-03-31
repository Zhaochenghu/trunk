package com.sojoline.presenter.register;

import com.sojoline.model.request.RegisterRequest;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/**
 * Created by Administrator on 2017/3/1 0001.
 */

public interface RegisterContract {
    interface View extends LvIBaseView {
        void registerSuccess();

        void getCaptchaSuccess();

        void getCaptchaFailed();
    }

    interface presenter extends LvIBasePresenter<View> {
        void hpRegister(RegisterRequest request);

        void hpCaptcha(String phoneNum);

        View getView();

        boolean isViewActive();
    }
}
