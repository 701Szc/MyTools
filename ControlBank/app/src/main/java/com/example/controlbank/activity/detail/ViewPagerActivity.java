package com.example.controlbank.activity.detail;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;
import com.example.controlbank.adapter.MyPagerAdapter;
import com.example.controlbank.module.BodyValue;
import com.example.mysdk.adutil.Utils;

import java.util.ArrayList;



public class ViewPagerActivity extends BaseActivity {

    private ViewPager mViewPager;
    private Context mContext;
    private ArrayList<BodyValue> pageLists;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_layout);
        mContext = getApplicationContext();
//        填充数据
        pageLists = initData();
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setPageMargin(Utils.dip2px(mContext,12));
        mViewPager.setAdapter(new MyPagerAdapter(mContext,pageLists));
        //                    实现左右两边无限滑动  当前处于500位置  所以取余可以无限滑动
        //                    一开始就让我们的ViewPager处于一个比较靠中间的Item
        mViewPager.setCurrentItem(pageLists.size() * 100);

    }

    private ArrayList<BodyValue> initData() {
        ArrayList<BodyValue> values = new ArrayList<>();
        for(int i = 0; i <3; i++){
            BodyValue itemValue = new BodyValue();
            switch(i){
                case 0:
//                    传图片的中间变量
                    ArrayList picList1 = new ArrayList();
                    itemValue.title = "7天搞定Node.js微信公众号";
                    itemValue.info = "【专治各种疑问】什么是收费课?";
                    itemValue.price = "当前价格:128.00@当前价格:268.00";
                    itemValue.text = "842人在学";
                    picList1.add(R.drawable.pageview_one);
                    picList1.add(R.drawable.pageview_two);
                    picList1.add(R.drawable.pageview_three);
                    itemValue.picLists = picList1;
                    values.add(itemValue);
                    break;

                case 1:
                    ArrayList picList2 = new ArrayList();
                    itemValue.title = "前端到后台ThinkPHP开发整站";
                    itemValue.info = "【专治各种疑问】为什么要收费?";
                    itemValue.price = "当前价格:128.00@当前价格:268.00";
                    itemValue.text = "1353人在学";
                    picList2.add(R.drawable.pageview_four);
                    picList2.add(R.drawable.pageview_five);
                    picList2.add(R.drawable.pageview_six);
                    itemValue.picLists = picList2;
                    values.add(itemValue);
                    break;

                case 2:
                    ArrayList picList3 = new ArrayList();
                    itemValue.title = "组件方式开发WebAPP全站";
                    itemValue.info = "【专治各种疑问】为什么要收费?";
                    itemValue.price = "当前价格:128.00@当前价格:268.00";
                    itemValue.text = "345人在学";
                    picList3.add(R.drawable.pageview_seven);
                    picList3.add(R.drawable.pageview_eight);
                    picList3.add(R.drawable.pageview_nine);
                    itemValue.picLists = picList3;
                    values.add(itemValue);
                    break;
            }
        }
        return values;
    }


}
