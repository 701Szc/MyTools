package com.example.controlbank.view.fragment;

import com.example.controlbank.R;
import com.example.controlbank.view.BaseFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ButtonFragment extends BaseFragment implements View.OnClickListener {

    private View mContentView;

    public ButtonFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext = getActivity();
        mContentView  = inflater.inflate(R.layout.fragment_list_button,container,false);
        return mContentView;
    }

    @Override
    public void onClick(View view) {

    }


}
