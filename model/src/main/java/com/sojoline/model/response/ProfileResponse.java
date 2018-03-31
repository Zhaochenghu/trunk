package com.sojoline.model.response;

import com.google.gson.annotations.SerializedName;
import com.sojoline.model.bean.ProfileBean;

/********************************
 * Created by lvshicheng on 2017/3/1.
 ********************************/
public class ProfileResponse extends BaseResponse {

  @SerializedName("content")
  public ProfileBean profile;
}
