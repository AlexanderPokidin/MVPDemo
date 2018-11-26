package com.pokidin.a.mvpdemo.presenter;

import android.view.View;

import com.pokidin.a.mvpdemo.contracts.MainActivityContract;
import com.pokidin.a.mvpdemo.models.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View view) {
        mView = view;

        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
