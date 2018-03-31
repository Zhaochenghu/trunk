package com.sojoline.presenter.usercase;

import com.sojoline.model.dagger.ApiComponentHolder;
import com.sojoline.model.request.RegisterRequest;
import com.sojoline.model.response.RegisterResponse;

import cn.com.leanvision.baseframe.model.usercase.UserCase;
import cn.com.leanvision.baseframe.rx.transformers.SchedulersCompat;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/1 0001.
 */

public class RegisterCase extends UserCase<RegisterResponse, RegisterRequest> {

  @Override
  public Observable<RegisterResponse> interactor(RegisterRequest params) {
    return ApiComponentHolder.sApiComponent
        .apiService()
        .register(params)
        .take(1)
        .compose(SchedulersCompat.<RegisterResponse>applyNewSchedulers());
  }
}
