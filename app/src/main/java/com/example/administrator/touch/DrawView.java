package com.example.administrator.touch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/3/22.
 */

public class DrawView extends View {
    //定义 x,y的位置
    private float currentx=50;
    private float currenty=50;
    //定义一个画笔
    Paint p=new Paint();
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    //定义画布的方法

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔颜色
        p.setColor(Color.BLUE);
        //画一个园
        canvas.drawCircle(currentx,currenty,15,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //
        this.currentx=event.getX();
        this.currenty=event.getY();
        //重绘组件
        this.invalidate();
        return true;
    }
}
