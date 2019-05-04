package com.nguyendinhdoan.instagram.likes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nguyendinhdoan.instagram.R;

public class LikesFragment extends Fragment {

    private static final String TAG = LikesFragment.class.getSimpleName();

    public static LikesFragment newInstance() {

        Bundle args = new Bundle();

        LikesFragment fragment = new LikesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_likes, container, false);
    }
}
