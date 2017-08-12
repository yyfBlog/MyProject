package com.yf.menu;

import com.yf.easyui.EasyDialog;
import com.yf.menu.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {
        EasyDialog easyDialog = new EasyDialog();
        easyDialog.setStyle(0);
        easyDialog.show(getSupportFragmentManager(), "");
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
