package com.example.dfrank.wotc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by dfrank on 2/22/18.
 */

public class Start extends Fragment {
    Unbinder unbinder;
    @BindView(R.id.images) ImageView imageView;
    @BindView(R.id.antiphon) TextView antiphon;
    @BindView(R.id.prayer) TextView prayer;
    public Start(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.start, container, false);
        unbinder = ButterKnife.bind(this, view);
        antiphon.setText(R.string.antiphon);
        prayer.setText(R.string.prayer);
        Glide.with(this)
                .load(R.drawable.eight)
                .into(imageView);
        return view;
    }
}
