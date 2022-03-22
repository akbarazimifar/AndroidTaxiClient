package com.example.yelloclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.yelloclient.databinding.FragmentVoteAfterOrderBinding;

public class FragmentVoteAfterOrder extends BaseFragment {

    private @NonNull
    FragmentVoteAfterOrderBinding _b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        _b = FragmentVoteAfterOrderBinding.inflate(inflater, container, false);
        _b.rb1.setOnClickListener(this);
        _b.rb2.setOnClickListener(this);
        _b.rb3.setOnClickListener(this);
        _b.rb4.setOnClickListener(this);
        _b.rb5.setOnClickListener(this);
        return _b.getRoot();
    }

    @Override
    public void onClick(View v) {

    }
}