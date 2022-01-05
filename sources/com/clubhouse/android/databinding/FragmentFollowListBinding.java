package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentFollowListBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final EpoxyRecyclerView c;
    public final ProgressBar d;
    public final TextView e;

    public FragmentFollowListBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, EpoxyRecyclerView epoxyRecyclerView, ProgressBar progressBar, Toolbar toolbar, TextView textView2) {
        this.a = imageView;
        this.b = textView;
        this.c = epoxyRecyclerView;
        this.d = progressBar;
        this.e = textView2;
    }

    public static FragmentFollowListBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.empty_text;
            TextView textView = (TextView) view.findViewById(R.id.empty_text);
            if (textView != null) {
                i = R.id.list;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.list);
                if (epoxyRecyclerView != null) {
                    i = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                    if (progressBar != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                        if (toolbar != null) {
                            i = R.id.toolbar_title;
                            TextView textView2 = (TextView) view.findViewById(R.id.toolbar_title);
                            if (textView2 != null) {
                                return new FragmentFollowListBinding((ConstraintLayout) view, imageView, textView, epoxyRecyclerView, progressBar, toolbar, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentFollowListBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_follow_list, (ViewGroup) null, false));
    }
}
