package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentRecentSpeakersBinding implements a {
    public final ImageView a;
    public final EpoxyRecyclerView b;
    public final ProgressBar c;

    public FragmentRecentSpeakersBinding(ConstraintLayout constraintLayout, ImageView imageView, EpoxyRecyclerView epoxyRecyclerView, ProgressBar progressBar, Toolbar toolbar) {
        this.a = imageView;
        this.b = epoxyRecyclerView;
        this.c = progressBar;
    }

    public static FragmentRecentSpeakersBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.list;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.list);
            if (epoxyRecyclerView != null) {
                i = R.id.loading;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                if (progressBar != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                    if (toolbar != null) {
                        return new FragmentRecentSpeakersBinding((ConstraintLayout) view, imageView, epoxyRecyclerView, progressBar, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentRecentSpeakersBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_recent_speakers, (ViewGroup) null, false));
    }
}
