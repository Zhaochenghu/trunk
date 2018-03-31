package com.sojoline.presenter.carinfo;

import com.sojoline.model.bean.CarCardBean;
import com.sojoline.model.bean.CarCardResponse;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

import java.util.HashMap;
import java.util.List;

/**
 * <pre>
 *     author : 李小勇
 *     time   : 2017/07/07
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public interface CarInfoContract {
    interface View extends LvIBaseView{
        void refreshCard(List<CarCardBean> list);
        void deleteSuccess();
        void bindCarSuccess();

        void unbindCarSuccess();
    }

    interface Presenter<R> extends LvIBasePresenter<R>{
        void queryBindCard(String carId);
        void deleteCar(HashMap<String, Object> request);
        void bindCar(HashMap<String,Object> request);

        void unbindCar(int bindId);
    }
}
