package com.example.dfrank.wotc;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dfrank.wotc.adapter.FragmentAdapter;
import com.example.dfrank.wotc.controller.About;
import com.example.dfrank.wotc.fragments.Eight;
import com.example.dfrank.wotc.fragments.Eleven;
import com.example.dfrank.wotc.fragments.Five;
import com.example.dfrank.wotc.fragments.Four;
import com.example.dfrank.wotc.fragments.Fourteen;
import com.example.dfrank.wotc.fragments.Nine;
import com.example.dfrank.wotc.fragments.One;
import com.example.dfrank.wotc.fragments.Seven;
import com.example.dfrank.wotc.fragments.Six;
import com.example.dfrank.wotc.fragments.Start;
import com.example.dfrank.wotc.fragments.Ten;
import com.example.dfrank.wotc.fragments.Thirteen;
import com.example.dfrank.wotc.fragments.Three;
import com.example.dfrank.wotc.fragments.Twelve;
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
        adddata(new Start(), "Start");
        adddata(new One(), "First station");
        adddata(new Two(), "Second station");
        adddata(new Three(), "Third station");
        adddata(new Four(), "Fourth station");
        adddata(new Five(), "Fifth station");
        adddata(new Six(), "Sixth station");
        adddata(new Seven(), "Seventh station");
        adddata(new Eight(), "Eight station");
        adddata(new Nine(), "Ninth station");
        adddata(new Ten(), "Tenth station");
        adddata(new Eleven(),"Eleventh station");
        adddata(new Twelve(), "Twelfth station");
        adddata(new Thirteen(), "Thirteenth station");
        adddata(new Fourteen(), "Fourteenth station");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent intent = new Intent(this, About.class);
                startActivity(intent);
        }
        return true;
    }
}
