package com.nguyendinhdoan.instagram.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.nguyendinhdoan.instagram.HomeActivity;
import com.nguyendinhdoan.instagram.LikesActivity;
import com.nguyendinhdoan.instagram.ProfileActivity;
import com.nguyendinhdoan.instagram.R;
import com.nguyendinhdoan.instagram.SearchActivity;
import com.nguyendinhdoan.instagram.ShareActivity;

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void enabledNavigation(final Context context, BottomNavigationView bottomNavigationView) {
        Log.d(TAG, "enabledNavigation: beginning...");
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.ic_house: {
                        Intent intent = new Intent(context, HomeActivity.class);
                        context.startActivity(intent);
                        return true;
                    }
                    case R.id.ic_search: {
                        Intent intent = new Intent(context, SearchActivity.class);
                        context.startActivity(intent);
                        return true;
                    }

                    case R.id.ic_circle: {
                        Intent intent = new Intent(context, ShareActivity.class);
                        context.startActivity(intent);
                        return true;
                    }
                    case R.id.ic_alert: {
                        Intent intent = new Intent(context, LikesActivity.class);
                        context.startActivity(intent);
                        return true;
                    }
                    case R.id.ic_android: {
                        Intent intent = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent);
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
