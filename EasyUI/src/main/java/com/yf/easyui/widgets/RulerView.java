package com.yf.easyui.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yyf on 2017/11/7.
 */

public class RulerView extends View {
    private Paint mPaint;

    public RulerView(Context context) {
        this(context, null);
    }

    public RulerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RulerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(1);
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i <= 20; i++) {
            if (i % 10 == 0) {
                canvas.drawRect(i * 20 + 10, 10, i * 20 + 11, 40, mPaint);
            } else {
                canvas.drawRect(i * 20 + 10, 10, i * 20 + 11, 30, mPaint);
            }
            canvas.drawText(String.valueOf(i), i * 20 + 5, 50, mPaint);
        }
    }
}
