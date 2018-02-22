package com.example.dfrank.wotc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;

/**
 * Created by dfrank on 2/22/18.
 */

public class About extends AppCompatActivity {
    @BindView(R.id.aboutWOTC)
    TextView about;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
}
