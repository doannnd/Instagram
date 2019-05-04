package com.nguyendinhdoan.instagram.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Class gor storing fragment
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = SectionsPagerAdapter.class.getSimpleName();
    private static final int HOME_TAB_COUNT = 3;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "getItem() called with: position = [" + position + "]");
        switch (position) {
            case 0:
                return CameraFragment.newInstance();
            case 1:
                return MainFragment.newInstance();
            case 2:
                return MessengerFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return HOME_TAB_COUNT;
    }

}
