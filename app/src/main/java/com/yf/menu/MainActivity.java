package com.yf.menu;

import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

import com.yf.easyui.EasyDialog;
import com.yf.easyui.widgets.EmptyView;
import com.yf.menu.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private ListView lv_data;
    private MyAdapter mAdapter;
    private EmptyView emptyView;
    private List<Integer> data = new ArrayList<Integer>();

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        lv_data = (ListView) findViewById(R.id.lv_data);
        emptyView = new EmptyView(this, lv_data);
        mAdapter = new MyAdapter(data, this);
        lv_data.setAdapter(mAdapter);
        emptyView.showEmptyView(R.drawable.ic_empty,"没有数据...");
//        弹框 菊花加载
//        EasyDialog.builder().setStyle(2).show(getSupportFragmentManager(), "");

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
