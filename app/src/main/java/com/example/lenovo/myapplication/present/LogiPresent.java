package com.example.lenovo.myapplication.present;

import com.example.lenovo.myapplication.application.Constant;
import com.example.lenovo.myapplication.model.bean.LogBean;
import com.example.lenovo.myapplication.model.http.HttpUtls;
import com.example.lenovo.myapplication.view.interfaces.ICountView;

import java.util.HashMap;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public class LogiPresent extends BeasPresent<ICountView.IloginView> {
    public void Logi(HashMap<String,String> map){
        String log="user/v1/login";
        HttpUtls.getUtls().postData(Constant.URL + log, new HttpUtls.CallBack<LogBean>() {
            @Override
            public void Success(LogBean bean) {
               getView().Success(bean);
            }

            @Override
            public void Error(String errMessge) {

            }
        },LogBean.class,map);
    }
    public void Resin(HashMap<String,String> map){
          String rse="user/v1/register";
        HttpUtls.getUtls().postData(Constant.URL + rse, new HttpUtls.CallBack<LogBean>() {
            @Override
            public void Success(LogBean bean) {
                getView().Success(bean);
            }

            @Override
            public void Error(String errMessge) {

            }
        },LogBean.class,map);
    }
}
