package com.sojoline.presenter.recharge;

import com.sojoline.model.response.RechargeRecordResponse;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/**
 * <pre>
 *     author : 李小勇
 *     time   : 2017/08/11
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public interface RechargeContract {
	interface View extends LvIBaseView{
		void refreshRecordData(RechargeRecordResponse.Content content);
	}

	interface Presenter<R> extends LvIBasePresenter<R>{
		void getRecordData();
	}
}
