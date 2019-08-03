package com.example.controlbank.activity.detail;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;
import com.example.controlbank.adapter.AutoScrollAdapter;
import com.example.controlbank.tool.autoscrollviewpager.AutoScrollViewPager;
import com.example.controlbank.tool.viewpagerindictor.CirclePageIndicator;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AutoScrollViewPageActivity extends BaseActivity implements View.OnClickListener {

    private AutoScrollViewPager auto_view_pager;//自动滚动
    private Context mContext;
    private ArrayList<ImageView> imgLists;
    private CirclePageIndicator mPageIndictor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoscroll_view_layout);
        mContext = getApplicationContext();
        imgLists = initData();
        auto_view_pager = (AutoScrollViewPager)findViewById(R.id.pager);
//        mPageIndictor = (CirclePageIndicator)findViewById(R.id.pager_indictor_view);

        auto_view_pager.setAdapter(new AutoScrollAdapter(mContext,imgLists));
        //解决最后一个跳转到第一个闪动问题
        auto_view_pager.setCurrentItem((Integer.MAX_VALUE / 2 - Integer.MAX_VALUE / 2 % imgLists.size()));
        auto_view_pager.startAutoScroll();
        mPageIndictor.setViewPager(auto_view_pager);

    }

    private ArrayList initData() {
       ArrayList<ImageView> value = new ArrayList();

       for(int i = 0; i<4; i++){
           ImageView image = new ImageView(this);
           image.setScaleType(ImageView.ScaleType.FIT_XY);
//           AutoScrollviewModel itemValue = new AutoScrollviewModel();
           if(i == 0){
               image.setImageResource(R.drawable.pageview_one);
           }
           if(i == 1){
               image.setImageResource(R.drawable.pageview_two);
           }
           if(i == 2){
               image.setImageResource(R.drawable.pageview_three);
           }
           if(i == 3){
               image.setImageResource(R.drawable.pageview_four);
           }

           value.add(image);
       }
       return value;
    }


    @Override
    public void onClick(View view) {


    }
}
