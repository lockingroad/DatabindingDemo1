package com.linewow.xhyy.myapplication;

import android.databinding.ObservableArrayList;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LXR on 2016/8/20.
 */
public class AnroidInfoControl {
    public int count;
    public ObservableArrayList<AndroidInfo> list;
    public AnroidInfoControl() {
        list=new ObservableArrayList<>();
        for(int i=0;i<20;i++){
            list.add(new AndroidInfo("item"+(count++)));
        }
    }
    public void add(View view){
        List<AndroidInfo> list1=new ArrayList<AndroidInfo>();
        for(int i=0;i<5;i++){
            list1.add(new AndroidInfo("item"+(count++)));
        }
        list.addAll(list1);
    }
    public void remove(View view){
        if(!list.isEmpty()){
            count--;
            list.remove(count);
        }
    }
}
