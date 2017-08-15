package com.yf.easyui.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.yf.easyui.R;

/**
 * Created by yyf on 2017/8/15.
 */

public class EmptyView {
    private AbsListView mListView;
    private View emptyView;
    private ImageView iv_empty;
    private TextView tv_empty;

    public EmptyView(Context mContext, AbsListView mListView) {
        this.mListView = mListView;
        emptyView = View.inflate(mContext, R.layout.layout_empty, null);
        iv_empty = (ImageView) emptyView.findViewById(R.id.iv_empty);
        tv_empty = (TextView) emptyView.findViewById(R.id.tv_empty);

        ViewGroup viewGroup = (ViewGroup) mListView.getParent();
        viewGroup.addView(emptyView);
    }

    public void showData() {
        emptyView.setVisibility(View.GONE);
        mListView.setVisibility(View.VISIBLE);
    }


    /**
     * @param resId    图片资源id
     * @param emptyTip 文字提示
     */
    public void showEmptyView(int resId, String emptyTip) {
        mListView.setVisibility(View.GONE);
        iv_empty.setImageResource(resId);
        if (!TextUtils.isEmpty(emptyTip)) {
            tv_empty.setText(emptyTip);
        }
    }
}
