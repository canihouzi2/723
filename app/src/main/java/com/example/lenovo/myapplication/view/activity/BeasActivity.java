package com.example.lenovo.myapplication.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.myapplication.present.BeasPresent;
import com.example.lenovo.myapplication.view.interfaces.IBeasView;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public abstract class BeasActivity<P extends BeasPresent> extends AppCompatActivity implements IBeasView {
    public P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initView();
        presenter = setPresenter();
        presenter.attchView(this);
        initData();
    }
    abstract int setLayout();
    abstract void initView();
    abstract P setPresenter();
    abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettchView();
    }
}
