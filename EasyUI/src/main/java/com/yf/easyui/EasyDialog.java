package com.yf.easyui;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yf.easyui.base.DialogInterface;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yyf on 2017/8/12.
 */

public class EasyDialog extends DialogFragment {
    private Button btn_cancel, btn_ok;
    private TextView tv_dialog_title, tv_content, tv_tip;
    private String cancelButtonText, okButtonText, dialogTitleText, dialogContent;
    private static EasyDialog instance;
    private DialogInterface dialogInterface;
    private int gravity = Gravity.CENTER;
    public static final int WHICK_OK = 1; // 确定按钮
    public static final int WHICK_CANCLE = 0; //取消按钮
    private int style = 1;
    private String tip;
    private static final String TAG = "EasyDialog";

    public static EasyDialog builder() {
        if (instance == null) {
            instance = new EasyDialog();
        }
        return instance;
    }

    public EasyDialog setStyle(int style) {
        this.style = style;
        return this;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        View view = null;
        if (style == 0) {
            view = inflater.inflate(R.layout.dialog_loading, container, false);
        } else if (style == 1) {
            view = inflater.inflate(R.layout.dialog_easy, container, false);
        } else if (style == 2) {
            view = inflater.inflate(R.layout.dialog_img, container, false);
        }
        initView(view, style);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (style == 0) {
            initLoadingText();
        } else if (style == 1) {
            initViewText();
        } else if (style == 2) {

        }
    }

    private void initView(View view, int style) {
        if (style == 0) {
            tv_tip = (TextView) view.findViewById(R.id.tv_tip);
        } else if (style == 1) {
            btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
            btn_ok = (Button) view.findViewById(R.id.btn_ok);
            tv_dialog_title = (TextView) view.findViewById(R.id.tv_dialog_title);
            tv_content = (TextView) view.findViewById(R.id.tv_content);
        } else if (style == 2) {

        }
    }

    private void initLoadingText() {
        if (!TextUtils.isEmpty(tip)) {
            tv_tip.setText(tip);
        }
    }


    private void initViewText() {
        if (!TextUtils.isEmpty(cancelButtonText)) {
            btn_cancel.setText(cancelButtonText);
        }
        if (!TextUtils.isEmpty(okButtonText)) {
            btn_ok.setText(okButtonText);
        }
        if (!TextUtils.isEmpty(dialogTitleText)) {
            tv_dialog_title.setText(dialogTitleText);
        }
        if (dialogInterface != null) {
            btn_ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialogInterface.onClick(EasyDialog.builder(), WHICK_OK);
                }
            });
            btn_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialogInterface.onClick(EasyDialog.builder(), WHICK_CANCLE);
                }
            });
        }
        if (!TextUtils.isEmpty(dialogContent)) {
            tv_content.setText(dialogContent);
            tv_content.setGravity(gravity);
        }
    }

    //设置loading提示语
    public EasyDialog setLoadingTip(String tip) {
        this.tip = tip;
        return this;
    }

    //设置标题文字
    public EasyDialog setDialogTitleText(String dialogTitleText) {
        this.dialogTitleText = dialogTitleText;
        return this;
    }

    //设置取消按钮文字
    public EasyDialog setCancelButtonText(String cancelButtonText) {
        this.cancelButtonText = cancelButtonText;
        return this;
    }

    //设置确定按钮文字
    public EasyDialog setOkButtonText(String okButtonText) {
        this.okButtonText = okButtonText;
        return this;
    }

    //设置按钮监听
    public EasyDialog setOnclickListener(DialogInterface dialogInterface) {
        this.dialogInterface = dialogInterface;
        return this;
    }

    //设置dialog内容
    public EasyDialog setDialogContent(String dialogContent, int gravity) {
        this.dialogContent = dialogContent;
        this.gravity = gravity;
        return this;
    }

    public void show(FragmentManager manager, String tag) {
        FragmentTransaction ft = manager.beginTransaction();
        ft.add(this, tag);
        ft.commitAllowingStateLoss();
    }
}
