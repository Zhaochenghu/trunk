package com.sojoline.model.response;

import com.google.gson.annotations.SerializedName;
import com.sojoline.model.bean.SubstationBean;

import java.util.List;

/********************************
 * Created by lvshicheng on 2017/3/8.
 ********************************/
public class SubstationsResponse extends BaseResponse {

  @SerializedName("content")
  public List<SubstationBean> substations;
}
