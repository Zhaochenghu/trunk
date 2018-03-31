package com.sojoline.charging.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sojoline.charging.R;
import com.sojoline.charging.views.base.LvBaseFragment;

/********************************
 * Created by lvshicheng on 2017/2/27.
 ********************************/
public class SimpleTestFragment extends LvBaseFragment {

  public static SimpleTestFragment newInstance() {
    
    Bundle args = new Bundle();
    
    SimpleTestFragment fragment = new SimpleTestFragment();
    fragment.setArguments(args);
    return fragment;
  }
  
  @Override
  protected View createView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fgmt_test, container, false);
  }
}
