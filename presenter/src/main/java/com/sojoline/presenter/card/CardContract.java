package com.sojoline.presenter.card;

import com.sojoline.model.request.CardRequest;
import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/********************************
 * Created by lvshicheng on 2017/4/11.
 ********************************/
public interface CardContract {

  interface View extends LvIBaseView {

    void bindCardSuccess();

    void unbindCardSuccess();
  }

  interface Presenter<R> extends LvIBasePresenter<R> {

    void bindCard(CardRequest request);

    void unbindCard(CardRequest request);
  }
}
