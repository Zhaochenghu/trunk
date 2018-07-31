package com.sojoline.model.request;

/********************************
 * Created by lvshicheng on 2017/3/1.
 ********************************/
public class LoginRequest extends SimpleRequest{

  public LoginRequest(String username, String password,String companyCode) {
    this.password = password;
    this.username = username;
    this.companyCode=companyCode;
  }

  public String username;
  public String password;
  public String companyCode;
}
