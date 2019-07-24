package com.example.controlbank.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.controlbank.R;
import com.example.controlbank.module.BodyValue;

import java.util.ArrayList;

public class MyPagerAdapter extends PagerAdapter {
    private Context mContext;
    private LayoutInflater mInflate;
    private ArrayList<BodyValue> mData;

    public MyPagerAdapter(Context context, ArrayList<BodyValue> list){
        mContext = context;
        mData = list;
        mInflate = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
    /*
    * 载入图片进去，用当前的position 除以 图片数组长度取余数是关键
    * */

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        final BodyValue value = mData.get(position % mData.size());
        View rootView = mInflate.inflate(R.layout.item_pager_layout,null);
        TextView titleView = (TextView) rootView.findViewById(R.id.title_view);
        TextView infoView = (TextView) rootView.findViewById(R.id.info_view);
        TextView gonggaoView = (TextView) rootView.findViewById(R.id.gonggao_view);
        TextView saleView = (TextView) rootView.findViewById(R.id.sale_num_view);
        ImageView[] imageViews = new ImageView[3];
        imageViews[0] = (ImageView) rootView.findViewById(R.id.image_one);
        imageViews[1] = (ImageView) rootView.findViewById(R.id.image_two);
        imageViews[2] = (ImageView) rootView.findViewById(R.id.image_three);
        /*
        * 绑定数据到View上
        * */
        titleView.setText(value.title);
        infoView.setText(value.price);
        gonggaoView.setText(value.info);
        saleView.setText(value.text);
        for(int i = 0; i < imageViews.length; i++){
            Log.e("Test", "value.picLists.get(i): "+ value.picLists.get(i) );
//            imageViews[i].setImageResource(value.picLists.get(i));
              imageViews[i].setImageResource((int)value.picLists.get(i));
        }
        container.addView(rootView,0);
        return rootView;
    }
}
