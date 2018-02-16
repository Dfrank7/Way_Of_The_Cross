package com.example.dfrank.wotc;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dfrank.wotc.adapter.FragmentAdapter;
import com.example.dfrank.wotc.fragments.Five;
import com.example.dfrank.wotc.fragments.Four;
import com.example.dfrank.wotc.fragments.One;
import com.example.dfrank.wotc.fragments.Seven;
import com.example.dfrank.wotc.fragments.Six;
import com.example.dfrank.wotc.fragments.Three;
import com.example.dfrank.wotc.fragments.Two;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager viewPager;

    @BindView(R.id.tab) TabLayout tabLayout;

    List<Fragment> fragments =new ArrayList<>();
    List<String> titles = new ArrayList<>();
    private void adddata(Fragment fragment, String string){
        fragments.add(fragment);
        titles.add(string);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        prepareData();
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void prepareData(){
        adddata(new One(), "Fiesrt station");
        adddata(new Two(), "Secon station");
        adddata(new Three(), "Thied station");
        adddata(new Four(), "Fouth station");
        adddata(new Five(), "Fifth station");
        adddata(new Six(), "Six station");
        adddata(new Seven(), "Seven station");
    }

}
