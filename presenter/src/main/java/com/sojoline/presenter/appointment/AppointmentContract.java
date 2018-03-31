package com.sojoline.presenter.appointment;

import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

import java.util.Map;

/**
 * <pre>
 *     author : 李小勇
 *     time   : 2017/07/11
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public interface AppointmentContract {
    interface View extends LvIBaseView{
        void orderSuccess(String orderId);
        void cancelOrderSuccess();
    }

    interface Presenter<R> extends LvIBasePresenter<R>{
        void order(Map<String, Object> request);
        void cancelOrder(String orderId);
    }
}
