package com.example.controlbank.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;
import com.example.controlbank.activity.detail.AutoScrollViewPageActivity;
import com.example.controlbank.activity.detail.AutoScrollViewPagerActivity;
import com.example.controlbank.activity.detail.ButtonActivity;
import com.example.controlbank.activity.detail.DialogActivity;
import com.example.controlbank.activity.detail.ImageActivity;
import com.example.controlbank.activity.detail.TextActivity;
import com.example.controlbank.activity.detail.VideoPlayActivity;
import com.example.controlbank.activity.detail.ViewPagerActivity;

public class ListViewActivity extends BaseActivity {

    private ListView listView;
    private String[] data = {"Button","TextView","ImageView","ViewPager","AutoScrollViewPagers","VideoPlay","Dialog"};
    private final int BUTTONACTIVITY = 0;
    private final int TEXTVIEWACTIVITY = 1;
    private final int IMAGEVIEE  = 2;
    private final int VIEWPAGER = 3;//横向滚动view
    private final int AUTOSCROLLVIEWPAGER = 4;//自动横向滚动
    private final int VIDEOPLAY = 5;//自动横向滚动
    private final int DIALOG = 6;//自动横向滚动




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case BUTTONACTIVITY:
                        Intent intent_btn = new Intent(ListViewActivity.this,ButtonActivity.class);
                        startActivity(intent_btn);
                        break;

                    case TEXTVIEWACTIVITY:
                        Intent intent_text = new Intent(ListViewActivity.this, TextActivity.class);
                        startActivity(intent_text);
                        break;

                    case IMAGEVIEE:
                        Intent intent_img = new Intent(ListViewActivity.this, ImageActivity.class);
                        startActivity(intent_img);
                        break;

                    case VIEWPAGER:
                        Intent intent_viewpager = new Intent(ListViewActivity.this, ViewPagerActivity.class);
                        startActivity(intent_viewpager);
                        break;

                    case AUTOSCROLLVIEWPAGER:
                        Intent intent_autoViewPager = new Intent(ListViewActivity.this, AutoScrollViewPagerActivity.class);
                        startActivity(intent_autoViewPager);
                        break;

                    case VIDEOPLAY:
                        Intent intent_VideoPLay = new Intent(ListViewActivity.this, VideoPlayActivity.class);
                        startActivity(intent_VideoPLay);
                        break;

                    case DIALOG:
                        Intent intent_Dialog = new Intent(ListViewActivity.this, DialogActivity.class);
                        startActivity(intent_Dialog);
                        break;
                }
            }
        });

    }


}
