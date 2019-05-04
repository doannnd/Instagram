package com.nguyendinhdoan.instagram;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.nguyendinhdoan.instagram.home.HomeFragment;
import com.nguyendinhdoan.instagram.likes.LikesFragment;
import com.nguyendinhdoan.instagram.profile.ProfileFragment;
import com.nguyendinhdoan.instagram.search.SearchFragment;
import com.nguyendinhdoan.instagram.share.ShareFragment;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: started.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        setupBottomNavigationBar(savedInstanceState);
    }

    /**
     * display bottom navigation bar with icon corresponding
     * show the animation when the icon checked
     */
    private void setupBottomNavigationBar(Bundle savedInstanceState) {
        Log.d(TAG, "setupBottomNavigationBar: setting.");
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        // default display home fragment first
        if (savedInstanceState == null) {
            Log.d(TAG, "setupBottomNavigationBar: home fragment displayed first");
            bottomNavigationView.setSelectedItemId(R.id.ic_house);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Log.d(TAG, "onNavigationItemSelected: started.");
        switch (menuItem.getItemId()) {
            case R.id.ic_house: {
                HomeFragment homeFragment = HomeFragment.newInstance();
                loadFragment(homeFragment);
                return true;
            }
            case R.id.ic_search: {
                SearchFragment searchFragment = SearchFragment.newInstance();
                loadFragment(searchFragment);
                return  true;
            }
            case R.id.ic_circle: {
                ShareFragment shareFragment = ShareFragment.newInstance();
                loadFragment(shareFragment);
                return true;
            }
            case R.id.ic_alert: {
                LikesFragment likesFragment = new LikesFragment();
                loadFragment(likesFragment);
                return true;
            }
            case R.id.ic_android: {
                ProfileFragment profileFragment = new ProfileFragment();
                loadFragment(profileFragment);
                return true;
            }
        }
        return false;
    }

    /**
     * load all fragment of bottom navigation bar.
     * @param fragment
     */
    private void loadFragment(Fragment fragment) {
        Log.d(TAG, "loadFragment() called with: fragment = [" + fragment + "]");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
