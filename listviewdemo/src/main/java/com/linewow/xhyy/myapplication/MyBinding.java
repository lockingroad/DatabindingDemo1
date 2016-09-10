package com.linewow.xhyy.myapplication;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by LXR on 2016/9/10.
 */
public class MyBinding {
    @BindingAdapter("bind:setadapter")
    public static void fuckAdapter(ListView listView, ObservableArrayList<AndroidInfo> androidInfos){
        ListAdapter adapter=listView.getAdapter();
        if(adapter==null){
            MyAdapter myAdapter=new MyAdapter(androidInfos);
            listView.setAdapter(myAdapter);
            Log.e("bind","为空");
        }else{
            Log.e("bind","不为空");
            ((MyAdapter)adapter).notifyDataSetChanged();
        }
    }
}
