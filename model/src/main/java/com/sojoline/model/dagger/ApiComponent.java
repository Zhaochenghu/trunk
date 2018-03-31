package com.sojoline.model.dagger;

import com.sojoline.model.ApiService;
import com.sojoline.model.WxpayService;

import javax.inject.Singleton;

import dagger.Component;

/********************************
 * Created by lvshicheng on 2017/2/10.
 ********************************/
@Component(modules = {ApiModule.class})
@Singleton
public interface ApiComponent {

    ApiService apiService();

    WxpayService wxpayService();
}
