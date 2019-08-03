package com.example.controlbank.activity.detail;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;
import com.example.controlbank.imageloader.GlideImageLoader;
import com.example.mysdk.imageloader.ImageLoaderManager;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
/*
*
*       https://github.com/youth5201314/banner
* */
public class AutoScrollViewPagerActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoscroll_view_layout);
        List<Integer> imgLists = new ArrayList<>() ;
//        imgLists.add("http://img.mukewang.com/54bf7e1f000109c506000338-590-330.jpg");
//        imgLists.add("http://upload.techweb.com.cn/2015/0114/1421211858103.jpg");
//        imgLists.add("http://img1.cache.netease.com/catchpic/A/A0/A0153E1AEDA115EAE7061A0C7EBB69D2.jpg");
//        imgLists.add("http://image.tianjimedia.com/uploadImages/2015/202/27/57RF8ZHG8A4T_5020a2a4697650b89c394237ba9ffbb45fe8555a2cbec-6O6nmI_fw658.jpg");
        imgLists.add(R.drawable.pageview_one);
        imgLists.add(R.drawable.pageview_two);
        imgLists.add(R.drawable.pageview_three);
        imgLists.add(R.drawable.pageview_four);
        Banner banner = (Banner) findViewById(R.id.pager);

        //设置图片集合
        banner.setImages(imgLists)
                .setImageLoader(new GlideImageLoader())
                .start();

        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }


}
