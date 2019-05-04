package com.nguyendinhdoan.instagram.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nguyendinhdoan.instagram.R;

public class HomeFragment extends Fragment {

    private static final String TAG = HomeFragment.class.getSimpleName();

    private final int[] homeTabIcons = new int[] {
            R.drawable.ic_camera,
            R.drawable.ic_instagram,
            R.drawable.ic_messenger
    };

    private TabLayout homeTabLayout;
    private ViewPager homeViewPager;

    public static HomeFragment newInstance() {
        Log.d(TAG, "newInstance: started.");
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: started.");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onViewCreated: started.");
        super.onViewCreated(view, savedInstanceState);

        homeViewPager = view.findViewById(R.id.home_view_pager);
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getChildFragmentManager());
        homeViewPager.setAdapter(adapter);

        homeTabLayout = view.findViewById(R.id.home_tab_layout);
        homeTabLayout.setupWithViewPager(homeViewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        Log.d(TAG, "setupTabIcons: setting...");
        homeTabLayout.getTabAt(0).setIcon(homeTabIcons[0]);
        homeTabLayout.getTabAt(1).setIcon(homeTabIcons[1]);
        homeTabLayout.getTabAt(2).setIcon(homeTabIcons[2]);
    }


}
