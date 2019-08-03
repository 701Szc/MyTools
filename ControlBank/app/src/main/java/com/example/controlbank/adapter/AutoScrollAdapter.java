package com.example.controlbank.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class AutoScrollAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList mData;


    public AutoScrollAdapter(Context context, ArrayList<ImageView> data){
        mContext = context;
        mData = data;
    }


    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       container.addView((View) mData.get(position % mData.size()));
        return mData.get(position % mData.size());
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
