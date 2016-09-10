package com.linewow.xhyy.databindingdemo1;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import com.linewow.xhyy.databindingdemo1.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ClickControl clickControl;
    private ActivityMainBinding activityMainBinding;
    private List<Dog>dogs;
    private MyRecyclerAdapter adapter;
    private ObservableArrayList list;
    private ObservableArrayMap map;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        initView();
        initList();
    }

    private void initList() {
        dogs=new ArrayList<Dog>();
        dogs.add(new Dog("哈士奇"));
        dogs.add(new Dog("萨摩耶"));
        dogs.add(new Dog("阿拉斯加"));
        adapter=new MyRecyclerAdapter(dogs,MainActivity.this);
        activityMainBinding.mainRecycler.setAdapter(adapter);
        map=new ObservableArrayMap<String,String>();
        map.put("myKey","myValue");
        list=new ObservableArrayList();
        list.add("第一条信息");
        activityMainBinding.setMylist(list);
        activityMainBinding.setMymap(map);
        activityMainBinding.setPathInfo(new PicassoPathInfo("https://m.en1on1.com/upload/images/b7/6f/e0c5545ee0295adaa5466e0520b5BTeyRR_w1080.jpg"));
//        Picasso.with(MainActivity.this).load("https://m.en1on1.com/upload/images/b7/6f/e0c5545ee0295adaa5466e0520b5BTeyRR_w1080.jpg").placeholder(R.mipmap.ic_launcher).error(R.drawable.delete1).fit().into(activityMainBinding.mainImg);
    }

    private void initView() {
        activityMainBinding.setClickControl(new ClickControl());
        LinearLayoutManager manager=new LinearLayoutManager(MainActivity.this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        activityMainBinding.mainRecycler.setLayoutManager(manager);
        activityMainBinding.mainRecycler.setItemAnimator(new DefaultItemAnimator());
    }
}
