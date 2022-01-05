package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentAccountBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;

    public FragmentAccountBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, FrameLayout frameLayout, Toolbar toolbar, TextView textView3, TextView textView4) {
        this.a = imageView;
        this.b = textView;
        this.c = textView2;
        this.d = frameLayout;
        this.e = textView4;
    }

    public static FragmentAccountBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.deactivate;
            TextView textView = (TextView) view.findViewById(R.id.deactivate);
            if (textView != null) {
                i = R.id.instagram;
                TextView textView2 = (TextView) view.findViewById(R.id.instagram);
                if (textView2 != null) {
                    i = R.id.loading;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                    if (frameLayout != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                        if (toolbar != null) {
                            i = R.id.toolbar_title;
                            TextView textView3 = (TextView) view.findViewById(R.id.toolbar_title);
                            if (textView3 != null) {
                                i = R.id.twitter;
                                TextView textView4 = (TextView) view.findViewById(R.id.twitter);
                                if (textView4 != null) {
                                    return new FragmentAccountBinding((LinearLayout) view, imageView, textView, textView2, frameLayout, toolbar, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_account, (ViewGroup) null, false));
    }
}
