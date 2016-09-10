package com.linewow.xhyy.databindingdemo1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.linewow.xhyy.databindingdemo1.BR;

import java.util.List;

/**
 * Created by LXR on 2016/9/10.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerHolder>{
    private List<Dog>dogs;
    private Context context;
    public MyRecyclerAdapter(List<Dog> dogs, Context context) {
        this.dogs = dogs;
        this.context = context;
    }
    @Override
    public MyRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.item_recycler,null);
        return new MyRecyclerHolder(view);
    }
    @Override
    public void onBindViewHolder(MyRecyclerHolder holder, int position) {
        holder.getBinding().setVariable(BR.dog,dogs.get(position));
        holder.getBinding().executePendingBindings();
    }
    @Override
    public int getItemCount() {
        return dogs.size();
    }
}
