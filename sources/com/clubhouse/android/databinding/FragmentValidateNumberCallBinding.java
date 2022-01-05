package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentValidateNumberCallBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public FragmentValidateNumberCallBinding(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, Toolbar toolbar, TextView textView5, TextView textView6) {
        this.a = imageView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = textView6;
    }

    public static FragmentValidateNumberCallBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.loading;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
            if (progressBar != null) {
                i = R.id.permission_banner;
                TextView textView = (TextView) view.findViewById(R.id.permission_banner);
                if (textView != null) {
                    i = R.id.permission_body;
                    TextView textView2 = (TextView) view.findViewById(R.id.permission_body);
                    if (textView2 != null) {
                        i = R.id.permission_title;
                        TextView textView3 = (TextView) view.findViewById(R.id.permission_title);
                        if (textView3 != null) {
                            i = R.id.process_automatically;
                            TextView textView4 = (TextView) view.findViewById(R.id.process_automatically);
                            if (textView4 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                if (toolbar != null) {
                                    i = R.id.verifying_your_number;
                                    TextView textView5 = (TextView) view.findViewById(R.id.verifying_your_number);
                                    if (textView5 != null) {
                                        i = R.id.waiting_for_call_title;
                                        TextView textView6 = (TextView) view.findViewById(R.id.waiting_for_call_title);
                                        if (textView6 != null) {
                                            return new FragmentValidateNumberCallBinding((ConstraintLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, toolbar, textView5, textView6);
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

    public static FragmentValidateNumberCallBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_validate_number_call, (ViewGroup) null, false));
    }
}
