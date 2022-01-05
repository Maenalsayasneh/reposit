package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentInterestsBinding implements a {
    public final ImageView a;
    public final View b;
    public final ProgressBar c;
    public final LinearLayout d;
    public final TextView e;

    public FragmentInterestsBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ProgressBar progressBar, LinearLayout linearLayout, Toolbar toolbar, TextView textView, NestedScrollView nestedScrollView) {
        this.a = imageView;
        this.b = view;
        this.c = progressBar;
        this.d = linearLayout;
        this.e = textView;
    }

    public static FragmentInterestsBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.bottom_shadow;
            View findViewById = view.findViewById(R.id.bottom_shadow);
            if (findViewById != null) {
                i = R.id.loading;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                if (progressBar != null) {
                    i = R.id.main_topics_list;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.main_topics_list);
                    if (linearLayout != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                        if (toolbar != null) {
                            i = R.id.toolbar_title;
                            TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
                            if (textView != null) {
                                i = R.id.topics_list_container;
                                NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.topics_list_container);
                                if (nestedScrollView != null) {
                                    return new FragmentInterestsBinding((ConstraintLayout) view, imageView, findViewById, progressBar, linearLayout, toolbar, textView, nestedScrollView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentInterestsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_interests, (ViewGroup) null, false));
    }
}
