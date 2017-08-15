package com.yf.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yyf on 2017/8/15.
 */

public class MyAdapter extends BaseAdapter {
    private List<Integer> data;
    private Context mContext;

    public MyAdapter(List<Integer> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            holder = new ViewHolder();
            view = View.inflate(mContext, R.layout.recyclerview_item, null);
        }
        holder.tv_item = view.findViewById(R.id.tv_item);
        holder.tv_item.setText(data.get(i).toString());
        return view;
    }

    private class ViewHolder {
        private TextView tv_item;
    }
}
