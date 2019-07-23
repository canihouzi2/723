package com.example.lenovo.myapplication.application;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public class App extends Application {
   private static Context context;
    private static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
           context=this;
        requestQueue = Volley.newRequestQueue(App.context);
    }
    public static RequestQueue getRequestQueue(){
        return requestQueue;
    }
}
