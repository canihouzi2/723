package com.example.lenovo.myapplication.view.activity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private MyView mv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mv_view = findViewById(R.id.mv_view);
        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(mv_view, "top1", 200, 0);
        objectAnimator.setDuration(3000);
        objectAnimator.start();
    }
}
