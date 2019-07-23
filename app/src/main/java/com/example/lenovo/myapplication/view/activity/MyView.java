package com.example.lenovo.myapplication.view.activity;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.lenovo.myapplication.R;

/**
 * data:2019/7/22
 * author:金豪(Lenovo)
 * function:
 */
public class MyView extends View {

    private int measuredWidth;
    private int measuredHeight;
    private int top1=0;
    private  int  integer;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        integer = typedArray.getInteger(R.styleable.MyView_myview, 0);
        invalidate();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getTop1() {
        return top1;
    }

    public void setTop1(int top1) {
        this.top1 = top1;
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measuredHeight = getMeasuredHeight();
        measuredWidth = getMeasuredWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        if (top1<50){
            paint.setColor(Color.BLUE);
        }
        paint.setColor(Color.GREEN);
        canvas.drawCircle(measuredWidth/2,measuredHeight/2-105,50,paint);
        Paint paint1=new Paint();
        paint1.setColor(Color.GREEN);
        Paint paint2=new Paint();
        paint2.setColor(Color.RED);
        //paint2.setColor(Color.argb(99,88,88,88));
       paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawRect(measuredWidth/2-18,100,measuredWidth/2+18,measuredHeight/2-100,paint1);
        canvas.drawRect(measuredWidth/2-15,top1+150,measuredWidth/2+15,measuredHeight/2-146,paint2);

        for (int i = 0; i < 20; i++) {
            canvas.drawLine(measuredWidth/2-45,measuredHeight/2-146-(i*15),measuredWidth/2-20,measuredHeight/2-146-(i*15),paint);

        }
    }
}
