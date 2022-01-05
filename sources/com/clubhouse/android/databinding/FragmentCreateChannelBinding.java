package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentCreateChannelBinding implements a {
    public final FrameLayout a;

    public FragmentCreateChannelBinding(FrameLayout frameLayout, ProgressBar progressBar, FrameLayout frameLayout2) {
        this.a = frameLayout2;
    }

    public static FragmentCreateChannelBinding bind(View view) {
        int i = R.id.loading;
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
        if (progressBar != null) {
            i = R.id.scene_root;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.scene_root);
            if (frameLayout != null) {
                return new FragmentCreateChannelBinding((FrameLayout) view, progressBar, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentCreateChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_create_channel, (ViewGroup) null, false));
    }
}
