package com.linewow.xhyy.databindingdemo1;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.linewow.xhyy.databindingdemo1.databinding.ItemRecyclerBinding;

/**
 * Created by LXR on 2016/9/10.
 */
public class MyRecyclerHolder extends RecyclerView.ViewHolder {
    private ItemRecyclerBinding binding;
    public MyRecyclerHolder(View itemView) {
        super(itemView);
        binding= DataBindingUtil.bind(itemView);
    }
    public ItemRecyclerBinding getBinding() {
        return binding;
    }
}
