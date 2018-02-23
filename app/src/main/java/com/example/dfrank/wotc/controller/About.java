package com.example.dfrank.wotc.controller;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dfrank.wotc.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dfrank on 2/22/18.
 */

public class About extends AppCompatActivity {
    @BindView(R.id.textView) TextView about;
    @BindView(R.id.developed) TextView develped;
    @BindView(R.id.name) TextView name;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        ButterKnife.bind(this);
        about.setText(R.string.AboutWOTC);
        develped.setText(R.string.developed);
        name.setText("Oladipo Siyanbola");
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startImplicitIntent();
            }
        });
    }
    private void startImplicitIntent(){
        Intent intent = null;
//        try {
//            this.getPackageManager().getPackageInfo("com.twitter.android", 0);
//            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=dfrank300"));
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/dfrank300"));
//        }
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/dfrank300"));

        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;

        if (isIntentSafe){
            this.startActivity(intent);
        }else {
            Toast.makeText(this, "No app available", Toast.LENGTH_SHORT).show();
        }
    }
}
