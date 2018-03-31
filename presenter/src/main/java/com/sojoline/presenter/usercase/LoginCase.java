package com.sojoline.presenter.usercase;

import com.sojoline.model.dagger.ApiComponentHolder;
import com.sojoline.model.request.LoginRequest;
import com.sojoline.model.response.LoginResponse;

import cn.com.leanvision.baseframe.model.usercase.UserCase;
import cn.com.leanvision.baseframe.rx.transformers.SchedulersCompat;
import rx.Observable;

/********************************
 * Created by lvshicheng on 2017/2/27.
 ********************************/
public class LoginCase extends UserCase<LoginResponse, LoginRequest> {

    @Override
    public Observable<LoginResponse> interactor(LoginRequest params) {
        return ApiComponentHolder.sApiComponent
            .apiService()
            .login(params)
            .take(1)
            .compose(SchedulersCompat.<LoginResponse>applyNewSchedulers());
    }
}
