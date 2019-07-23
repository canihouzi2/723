package com.example.lenovo.myapplication.model.http;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.lenovo.myapplication.application.App;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public class HttpUtls<B> {
    //单列模式
    private HttpUtls(){}
    private static HttpUtls utls;
    public static HttpUtls getUtls(){
        if(utls==null){
            utls=new HttpUtls();
        }
            return utls;
    }
    //封装volley
    public void postData(String url, final CallBack callBack, final Class<B> bean,final HashMap<String,String> paragms){
     StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
           @Override
           public void onResponse(String response) {
               Gson gson=new Gson();
               B b = gson.fromJson(response, bean);
               callBack.Success(b);
           }
       }, new Response.ErrorListener() {
           @Override
           public void onErrorResponse(VolleyError error) {
           callBack.Error(error.getMessage());
           }
       }){
         @Override
         protected Map<String, String> getParams() throws AuthFailureError {
             return paragms;
         }
     };
        App.getRequestQueue().add(stringRequest);

    }
    public interface CallBack<B>{
        void Success(B bean);
        void Error(String errMessge);
    }
}
