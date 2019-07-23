package com.example.lenovo.myapplication.present;

import com.example.lenovo.myapplication.view.interfaces.IBeasView;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public class BeasPresent <V extends IBeasView>{
    private V miBeasView;
    //綁定
    public void attchView(V iBeasView){
        this.miBeasView=iBeasView;
    }
    //解绑
    public void dettchView(){
        this.miBeasView=null;
    }
    //获取
    public V getView(){
        return miBeasView;
    }
}
