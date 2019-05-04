package com.nguyendinhdoan.instagram.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nguyendinhdoan.instagram.R;

public class MainFragment extends Fragment {

    private static final String TAG = MainFragment.class.getSimpleName();

    public static MainFragment newInstance() {
        Log.d(TAG, "newInstance: started.");
        Bundle args = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: started.");
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
