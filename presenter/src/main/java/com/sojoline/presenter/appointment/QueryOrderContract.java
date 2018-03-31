package com.sojoline.presenter.appointment;

import com.sojoline.model.response.OrderResponse;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/**
 * <pre>
 *     author : 李小勇
 *     time   : 2017/07/24
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public interface QueryOrderContract {
  interface View extends LvIBaseView{
    /**
     * 有预约
     * @param order
     */
    void querySuccess(OrderResponse.Order order);

    /**
     * 没有预约
     * @param msg
     */
    void noOrder(String msg);
  }

  interface Presenter<R> extends LvIBasePresenter<R>{
    void queryOrder();
  }
}
