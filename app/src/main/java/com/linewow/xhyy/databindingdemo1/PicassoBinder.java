package com.linewow.xhyy.databindingdemo1;

import android.databinding.BindingAdapter;
import android.nfc.Tag;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by LXR on 2016/9/10.
 */
public class PicassoBinder {
    @BindingAdapter("bind:imagePath")
    public static void load1(ImageView view,String path){
        Picasso.with(view.getContext()).load(path).placeholder(R.mipmap.ic_launcher).fit().into(view);
    }
}
