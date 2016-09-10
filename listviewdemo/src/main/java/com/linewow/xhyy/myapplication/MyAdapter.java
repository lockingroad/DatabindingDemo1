package com.linewow.xhyy.myapplication;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.linewow.xhyy.myapplication.databinding.ItemListviewBinding;

/**
 * Created by LXR on 2016/9/10.
 */
public class MyAdapter extends BaseAdapter {
    private ObservableArrayList<AndroidInfo>androidInfos;
    private LayoutInflater layoutInflater;

    public MyAdapter(ObservableArrayList<AndroidInfo> androidInfos) {
        this.androidInfos = androidInfos;
    }

    @Override
    public int getCount() {
        return androidInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return androidInfos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater= LayoutInflater.from(viewGroup.getContext());
        ItemListviewBinding binding=DataBindingUtil.inflate(layoutInflater,R.layout.item_listview,viewGroup,false);
        binding.setInfo(androidInfos.get(i));
       return  binding.getRoot();
    }
}
