package com.yf.menu;

import android.support.v4.app.DialogFragment;
import android.view.Gravity;

import com.yf.easyui.EasyDialog;
import com.yf.easyui.base.DialogInterface;
import com.yf.menu.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {
        //弹框 菊花加载
        EasyDialog.builder().setStyle(2).show(getSupportFragmentManager(), "");


//        EasyDialog easyDialog = new EasyDialog();
//        easyDialog.setStyle(0);
//        easyDialog.show(getSupportFragmentManager(), "");


//        EasyDialog.builder()
//                .setDialogTitleText("标题")
//                .setDialogContent("我是内容", Gravity.LEFT)
//                .setCancelButtonText("取消")
//                .setOkButtonText("确定")
//                .setOnclickListener(new DialogInterface() {
//                    @Override
//                    public void onClick(DialogFragment dialog, int which) {
//                        if (which == 0) { //取消
//                            dialog.dismiss();
//                        } else if (which == 1) {//确定
//
//                        }
//                    }
//                })
//                .show(getSupportFragmentManager(), "");
    }
}
