package com.example.controlbank.activity.detail;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;

public class ButtonActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list_button);
        initView();
    }

    private void initView() {
    }

    @Override
    public void onClick(View view) {

    }
}
