package com.yf.menu;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.yf.easyui.widgets.EasyPopupWindow;
import com.yf.menu.base.BaseActivity;


public class MainActivity extends BaseActivity {
    private Button btn_bottom, btn_top, btn_left, btn_right;
    private View contentView;

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btn_bottom = (Button) findViewById(R.id.btn_bottom);
        btn_top = (Button) findViewById(R.id.btn_top);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        contentView = View.inflate(MainActivity.this, R.layout.layout_pop, null);

        btn_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EasyPopupWindow.getInstance(MainActivity.this).setContentView(contentView).build().show(view);
            }
        });

        btn_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EasyPopupWindow.getInstance(MainActivity.this).setContentView(contentView).build().showAtLocation(btn_top, Gravity.TOP, 0, (int) btn_top.getY() - btn_top.getHeight() / 2);
            }
        });

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EasyPopupWindow.getInstance(MainActivity.this).setContentView(contentView).build().showAtLocation(btn_left, Gravity.LEFT, 0, btn_left.getHeight() / 4);
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EasyPopupWindow.getInstance(MainActivity.this).setContentView(contentView).build().showAtLocation(btn_right, Gravity.RIGHT, 0, btn_right.getHeight() / 4);
            }
        });
    }
}
