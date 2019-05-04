package com.nguyendinhdoan.instagram;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.nguyendinhdoan.instagram.utils.BottomNavigationViewHelper;

public class SearchActivity extends AppCompatActivity {

    private static final String TAG = SearchActivity.class.getSimpleName();
    private BottomNavigationView bottomNavigationView;
    private static final int ACTIVITY_NUM = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started.");


        setupBottomNavigationView();
    }

    private void setupBottomNavigationView() {
        bottomNavigationView = findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.enabledNavigation(this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
