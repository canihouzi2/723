package com.example.lenovo.myapplication.view.interfaces;

import com.example.lenovo.myapplication.model.bean.LogBean;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public interface ICountView {
    public interface IloginView extends IBeasView{
        void Success(LogBean logBean);
        void Error(int errCode,String errMsg);
    }
}
