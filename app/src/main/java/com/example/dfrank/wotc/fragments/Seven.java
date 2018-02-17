package com.example.dfrank.wotc.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dfrank.wotc.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by dfrank on 2/15/18.
 */

public class Seven extends Fragment {
    Unbinder unbinder;
    @BindView(R.id.title) TextView title;
    @BindView(R.id.images) ImageView imageView;
    @BindView(R.id.verse) TextView verse;
    @BindView(R.id.reply) TextView reply;
    @BindView(R.id.reading) TextView reading;
    @BindView(R.id.medidate) TextView medidate;
    @BindView(R.id.response) TextView response;

    public Seven(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.general, container,false);
        unbinder = ButterKnife.bind(this, view);
        Glide.with(this)
                .load(R.drawable.five)
                .into(imageView);
        verse.setText(R.string.verse);
        reply.setText(R.string.reply);
        reading.setText(R.string.secondReading);
        medidate.setText(R.string.medidate2);
        response.setText(R.string.response2);
        return view;
    }
}
