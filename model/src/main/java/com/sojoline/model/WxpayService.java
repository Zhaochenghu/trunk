package com.sojoline.model;

import com.sojoline.model.request.WxOrderQueryRequest;
import com.sojoline.model.request.WxOrderRequest;
import com.sojoline.model.response.WxOrderQueryResponse;
import com.sojoline.model.response.WxOrderResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/********************************
 * Created by lvshicheng on 2017/6/27.
 ********************************/
public interface WxpayService {

    @POST("pay/unifiedprder/cs0001")
    Observable<WxOrderResponse> placeAnOrder(@Body WxOrderRequest request);

    @POST("pay/orderquery/cs0001")
    Observable<WxOrderQueryResponse> queryOrder(@Body WxOrderQueryRequest request);
}
