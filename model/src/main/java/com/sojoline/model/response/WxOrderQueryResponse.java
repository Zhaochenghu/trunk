package com.sojoline.model.response;

import com.google.gson.annotations.SerializedName;

/********************************
 * Created by lvshicheng on 2017/6/29.
 ********************************/
public class WxOrderQueryResponse extends BaseResponse {

    public int errcode = -1;
    public String trade_state;
    public String trade_state_desc;
    @SerializedName("content")
    public pay pay;

    public class pay{
        /**
         * "result": 1
         */
        public int result;
    }
    @Override
    public boolean isSuccess() {
        return errcode == 0;
    }
}
