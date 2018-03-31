package com.sojoline.model.response;

import com.google.gson.annotations.SerializedName;
import com.sojoline.model.bean.CardBean;

import java.util.List;

/********************************
 * Created by lvshicheng on 2017/5/23.
 ********************************/
public class CardListResponse extends BaseResponse {

  @SerializedName("content")
  public List<CardBean> cardBeans;
}
