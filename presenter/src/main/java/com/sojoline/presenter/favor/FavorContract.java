package com.sojoline.presenter.favor;

import com.sojoline.presenter.LvIBasePresenter;
import com.sojoline.presenter.LvIBaseView;

/********************************
 * Created by lvshicheng on 2017/3/8.
 ********************************/
public interface FavorContract {

  interface View extends LvIBaseView{

    void saveFavorSuccess();

    void clearFavorSuccess();
  }

  interface Presenter<R> extends LvIBasePresenter<R> {

    void saveFavor(String stationId);

    void clearFavor(String stationId);
  }
}
