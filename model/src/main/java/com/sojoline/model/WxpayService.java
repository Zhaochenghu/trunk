package com.sojoline.model;

import com.sojoline.model.request.WxOrderQueryRequest;
import com.sojoline.model.request.WxOrderRequest;
import com.sojoline.model.response.AliOrderResponse;
import com.sojoline.model.response.WxOrderQueryResponse;
import com.sojoline.model.response.WxOrderResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/********************************
 * Created by lvshicheng on 2017/6/27.
 ********************************/
public interface WxpayService {

    @POST("wx/pay/unifiedprder/cs0001")
    Observable<WxOrderResponse> placeAnOrder(@Body WxOrderRequest request);

    @POST("wx/pay/orderquery/cs0001")
    Observable<WxOrderQueryResponse> queryOrder(@Body WxOrderQueryRequest request);

    @POST("wx/alipay/unifiedprder/cs0001")
    Observable<AliOrderResponse> placeAnOrderAlipay(@Body WxOrderRequest request);

    @POST("cs/v1/app/alipay/confirm")
    Observable<WxOrderQueryResponse> queryOrderAlipay(@Body WxOrderQueryRequest request);
}
