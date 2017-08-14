package com.yf.easyui.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * Created by yyf on 2017/8/14.
 */

public class EasyProgressBar extends ProgressBar {
    private Paint mPaint;

    public EasyProgressBar(Context context) {
        this(context, null);
    }

    public EasyProgressBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EasyProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(1);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
    }

    private int cx = 50;
    private int radius = 50;

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(cx + radius / 2, cx, radius, mPaint);
//        RectF rect = new RectF(0, 0, 100, 10);
//        canvas.drawRoundRect(rect, 5, 5, mPaint);
    }
}
