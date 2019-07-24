package com.example.controlbank.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.controlbank.R;
import com.example.controlbank.view.BaseFragment;



public class ImageViewFragment extends BaseFragment implements View.OnClickListener {

    private View mContentView;

    public ImageViewFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext = getActivity();
        mContentView = inflater.inflate(R.layout.fragment_list_image,container,false);
        return  mContentView;

    }

    @Override
    public void onClick(View view) {

    }
}
