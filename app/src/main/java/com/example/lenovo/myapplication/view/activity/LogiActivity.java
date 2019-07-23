package com.example.lenovo.myapplication.view.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.model.bean.LogBean;
import com.example.lenovo.myapplication.present.LogiPresent;
import com.example.lenovo.myapplication.view.interfaces.ICountView;

import java.util.HashMap;

public class LogiActivity extends BeasActivity<LogiPresent> implements ICountView.IloginView {

    private EditText phone,pass;
    private Button but,but1;
    @Override
    int setLayout() {
        return R.layout.activity_logi;
    }

    @Override
    void initView() {
        but=findViewById(R.id.but);
        but1=findViewById(R.id.but1);
        pass=findViewById(R.id.pass);
        phone=findViewById(R.id.phone);
    }

    @Override
    LogiPresent setPresenter() {
        return new LogiPresent();
    }

    @Override
    void initData() {
          but.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  HashMap<String,String> pragms=new HashMap<>();
                  String phon = phone.getText().toString().trim();
                  String pwd = pass.getText().toString().trim();
                  pragms.put("phone",phon);
                  pragms.put("pwd",pwd);
                  presenter.Logi(pragms);
              }
          });
          but1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent=new Intent(LogiActivity.this,ResgActivity.class);
                  startActivity(intent);
              }
          });
    }

    @Override
    public void Success(LogBean logBean) {
         if (logBean!=null){
             Toast.makeText(this,logBean.getMessage(), Toast.LENGTH_SHORT).show();
              if ("0000".equals(logBean.getStatus())){
                  Intent intent=new Intent(LogiActivity.this,MainActivity.class);
                  startActivity(intent);
              }
         }
    }

    @Override
    public void Error(int errCode, String errMsg) {

    }
}
