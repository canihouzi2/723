package com.example.jinhao723;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private Fragment fragment;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;
    private List<android.support.v4.app.Fragment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取id
        viewPager=findViewById(R.id.viewp);
        radioGroup=findViewById(R.id.group);
       fragment=new Fragment();
       fragment1=new Fragment1();
       fragment2=new Fragment2();
       fragment3=new Fragment3();
       fragment4=new Fragment4();
       list=new ArrayList<>();
       list.add(fragment);
       list.add(fragment1);
       list.add(fragment2);
       list.add(fragment3);
       list.add(fragment4);
       viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
           @Override
           public android.support.v4.app.Fragment getItem(int i) {
               return list.get(i);
           }

           @Override
           public int getCount() {
               return list.size();
           }
       });
       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){
                   case R.id.but:
                       viewPager.setCurrentItem(0);
                       break;
                   case R.id.but1:
                       viewPager.setCurrentItem(1);
                       break;
                   case R.id.but2:
                       viewPager.setCurrentItem(2);
                       break;
                   case R.id.but3:
                       viewPager.setCurrentItem(3);
                       break;
                   case R.id.but4:
                       viewPager.setCurrentItem(4);
                       break;
               }
           }
       });
    }
}
