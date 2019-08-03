package com.example.controlbank.activity.detail;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;
import com.example.controlbank.view.CommonDialog;

public class DialogActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_layout);

        mContext = getApplicationContext();

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                CommonDialog dialog = new CommonDialog( DialogActivity.this ,"这是一个封装好的Dialog", "这是内容", "左部button", "右部button", new CommonDialog.DialogClickListener() {
                    @Override
                    public void onDialogClick() {
                        //时间监听处理
                        Toast.makeText(getApplicationContext(),"你点击了左边",Toast.LENGTH_LONG).show();
                    }
                });
                dialog.show();
                break;
        }

    }
}
