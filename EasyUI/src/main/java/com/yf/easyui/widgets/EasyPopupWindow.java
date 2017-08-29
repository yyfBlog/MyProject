package com.yf.easyui.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.yf.easyui.R;

/**
 * Created by yyf on 2017/8/28.
 */

public class EasyPopupWindow {
    private PopupWindow popupWindow;
    private static EasyPopupWindow instance;

    private EasyPopupWindow(Context mContext) {
        popupWindow = new PopupWindow(mContext);
    }

    public static EasyPopupWindow getInstance(Context mContext) {
        if (instance == null) {
            instance = new EasyPopupWindow(mContext);
        }
        return instance;
    }

    //设置布局
    public EasyPopupWindow setContentView(View view) {
        popupWindow.setContentView(view);
        return this;
    }

    // 设置动画
    public EasyPopupWindow setAnimationStyle(int animationStyle) {
        popupWindow.setAnimationStyle(animationStyle);
        return this;
    }

    public EasyPopupWindow build() {
        //长度
        popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        // 高度
        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        //设置背景
        popupWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
        //设置点击屏幕外部会消失
        popupWindow.setOutsideTouchable(true);
        // 设置焦点
        popupWindow.setFocusable(true);
        return this;
    }

    //相对于某个控件的位置
    public void show(View view) {
        popupWindow.showAsDropDown(view);
    }

    //相对于某个控件的位置  x y  表示偏移量
    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void show(View view, int x, int y, int gravity) {
        popupWindow.showAsDropDown(view, x, y, gravity);
    }

    //相对于父控件的位置（例如正中央Gravity.CENTER，下方Gravity.BOTTOM等），可以设置偏移或无偏移
    public void showAtLocation(View view, int gravity, int x, int y) {
        popupWindow.showAtLocation(view, gravity, x, y);
    }
}
