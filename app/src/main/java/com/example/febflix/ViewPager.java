package com.example.febflix;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class ViewPager extends AppCompatActivity {

    private TabLayout tabLayout;
    private View viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager((androidx.viewpager.widget.ViewPager) viewPager);

        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new ComedyFragment(),"Comedy");
        vpAdapter.addFragment(new RomanceFragment(),"Romance");
        vpAdapter.addFragment(new ThrillerFragment(),"Thriller");
        ((androidx.viewpager.widget.ViewPager) viewPager).setAdapter(vpAdapter);
    }


}
