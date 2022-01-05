package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentDeactivateBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final ProgressBar c;

    public FragmentDeactivateBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ProgressBar progressBar, TextView textView6, TextView textView7, ScrollView scrollView, Toolbar toolbar, TextView textView8) {
        this.a = imageView;
        this.b = textView;
        this.c = progressBar;
    }

    public static FragmentDeactivateBinding bind(View view) {
        View view2 = view;
        int i = R.id.back;
        ImageView imageView = (ImageView) view2.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.deactivate;
            TextView textView = (TextView) view2.findViewById(R.id.deactivate);
            if (textView != null) {
                i = R.id.deactivate_details;
                TextView textView2 = (TextView) view2.findViewById(R.id.deactivate_details);
                if (textView2 != null) {
                    i = R.id.deactivate_title;
                    TextView textView3 = (TextView) view2.findViewById(R.id.deactivate_title);
                    if (textView3 != null) {
                        i = R.id.deactivation_permanent_details;
                        TextView textView4 = (TextView) view2.findViewById(R.id.deactivation_permanent_details);
                        if (textView4 != null) {
                            i = R.id.deactivation_permanent_title;
                            TextView textView5 = (TextView) view2.findViewById(R.id.deactivation_permanent_title);
                            if (textView5 != null) {
                                i = R.id.loading;
                                ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.loading);
                                if (progressBar != null) {
                                    i = R.id.reactivate_details;
                                    TextView textView6 = (TextView) view2.findViewById(R.id.reactivate_details);
                                    if (textView6 != null) {
                                        i = R.id.reactivate_title;
                                        TextView textView7 = (TextView) view2.findViewById(R.id.reactivate_title);
                                        if (textView7 != null) {
                                            i = R.id.scroll;
                                            ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scroll);
                                            if (scrollView != null) {
                                                i = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                if (toolbar != null) {
                                                    i = R.id.toolbar_title;
                                                    TextView textView8 = (TextView) view2.findViewById(R.id.toolbar_title);
                                                    if (textView8 != null) {
                                                        return new FragmentDeactivateBinding((ConstraintLayout) view2, imageView, textView, textView2, textView3, textView4, textView5, progressBar, textView6, textView7, scrollView, toolbar, textView8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentDeactivateBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_deactivate, (ViewGroup) null, false));
    }
}
