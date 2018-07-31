package com.sojoline.model.request;

/********************************
 * Created by lvshicheng on 2017/4/25.
 ********************************/
public class StartChargingRequest extends SimpleRequest {

  public String substationId;
  public String areaId;
  public String cpId;
  public String cpinterfaceId;
  public String chargingMode;
  public float settingNumber;
  public String command;
}
