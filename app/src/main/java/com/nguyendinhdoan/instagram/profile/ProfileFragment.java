package com.nguyendinhdoan.instagram.profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.nguyendinhdoan.instagram.R;
import com.nguyendinhdoan.instagram.share.ShareFragment;

public class ProfileFragment extends Fragment {

    private static final String TAG = ShareFragment.class.getSimpleName();

    private Toolbar profileToolbar;

    public static ProfileFragment newInstance() {
        Log.d(TAG, "newInstance: started.");
        Bundle args = new Bundle();
        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: started.");
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        profileToolbar = view.findViewById(R.id.profile_toolbar);
        setupToolbar();
    }

    private void setupToolbar() {
        Log.d(TAG, "setupToolbar: setting...");
        ((AppCompatActivity) getActivity()).setSupportActionBar(profileToolbar);
        // hide the default title
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Log.d(TAG, "onCreateOptionsMenu: started.");
        inflater.inflate(R.menu.profile_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile_menu: {
                break;
            }
        }
        return true;
    }
}
