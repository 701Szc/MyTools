package com.example.controlbank.activity.detail;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;

public class ImageActivity extends BaseActivity implements View.OnClickListener{
/*
* UI
* */
    private ImageView grid1;
    private ImageView grid2;
    private ImageView grid3;
    private ImageView grid4;
    private ImageView grid5;
    private ImageView grid6;
    private TextView image_Page;
    private Button previousPage;
    private Button nextPage;

//
    private int page;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list_image);
        initView();
        currentPage();
    }



    private void initView() {
        grid1 = (ImageView)findViewById(R.id.grid1);
        grid2 = (ImageView)findViewById(R.id.grid2);
        grid3 = (ImageView)findViewById(R.id.grid3);
        grid4 = (ImageView)findViewById(R.id.grid4);
        grid5 = (ImageView)findViewById(R.id.grid5);
        grid6 = (ImageView)findViewById(R.id.grid6);
        image_Page = (TextView)findViewById(R.id.image_currentPage);
        previousPage = (Button)findViewById(R.id.image_previousPage);
        nextPage = (Button)findViewById(R.id.image_nextPage);
    }

    private void currentPage() {
        page =Integer.valueOf( image_Page.getText().toString().trim() );
        if (page == 1){
            grid1.setImageResource(R.drawable.loading_data_anim);
            AnimationDrawable animationDrawable = (AnimationDrawable) grid1.getDrawable();
            animationDrawable.start();
        }

    }

    @Override
    public void onClick(View view) {


    }
}
