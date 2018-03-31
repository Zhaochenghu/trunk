package com.sojoline.presenter.usercase;

import com.sojoline.model.dagger.ApiComponentHolder;
import com.sojoline.model.request.ForgotPwdRequest;
import com.sojoline.model.response.SimpleResponse;

import cn.com.leanvision.baseframe.model.usercase.UserCase;
import cn.com.leanvision.baseframe.rx.transformers.SchedulersCompat;
import rx.Observable;

/********************************
 * Created by lvshicheng on 2017/7/4.
 ********************************/
public class ForgotPwdCase extends UserCase<SimpleResponse, ForgotPwdRequest> {

    @Override
    public Observable<SimpleResponse> interactor(ForgotPwdRequest params) {
        return ApiComponentHolder.sApiComponent
            .apiService()
            .forgotPwd(params)
            .take(1)
            .compose(SchedulersCompat.<SimpleResponse>applyNewSchedulers());
    }
}
