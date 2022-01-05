package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentActivityBinding implements a {
    public final EpoxyRecyclerView a;
    public final ImageView b;
    public final SwipeRefreshLayout c;

    public FragmentActivityBinding(ConstraintLayout constraintLayout, EpoxyRecyclerView epoxyRecyclerView, ImageView imageView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        this.a = epoxyRecyclerView;
        this.b = imageView;
        this.c = swipeRefreshLayout;
    }

    public static FragmentActivityBinding bind(View view) {
        int i = R.id.activity_list;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.activity_list);
        if (epoxyRecyclerView != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) view.findViewById(R.id.back);
            if (imageView != null) {
                i = R.id.refresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresh);
                if (swipeRefreshLayout != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                    if (toolbar != null) {
                        return new FragmentActivityBinding((ConstraintLayout) view, epoxyRecyclerView, imageView, swipeRefreshLayout, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentActivityBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_activity, (ViewGroup) null, false));
    }
}
