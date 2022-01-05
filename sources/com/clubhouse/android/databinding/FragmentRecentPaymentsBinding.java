package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentRecentPaymentsBinding implements a {
    public final ImageView a;
    public final FrameLayout b;
    public final EpoxyRecyclerView c;

    public FragmentRecentPaymentsBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar, TextView textView) {
        this.a = imageView;
        this.b = frameLayout;
        this.c = epoxyRecyclerView;
    }

    public static FragmentRecentPaymentsBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.loading;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
            if (frameLayout != null) {
                i = R.id.recent_payments;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.recent_payments);
                if (epoxyRecyclerView != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                    if (toolbar != null) {
                        i = R.id.toolbar_title;
                        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
                        if (textView != null) {
                            return new FragmentRecentPaymentsBinding((LinearLayout) view, imageView, frameLayout, epoxyRecyclerView, toolbar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentRecentPaymentsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_recent_payments, (ViewGroup) null, false));
    }
}
