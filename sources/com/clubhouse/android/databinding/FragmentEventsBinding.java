package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentEventsBinding implements a {
    public final ImageView a;
    public final ImageView b;
    public final TextView c;
    public final EpoxyRecyclerView d;
    public final SwipeRefreshLayout e;
    public final TextView f;

    public FragmentEventsBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, TextView textView2) {
        this.a = imageView;
        this.b = imageView2;
        this.c = textView;
        this.d = epoxyRecyclerView;
        this.e = swipeRefreshLayout;
        this.f = textView2;
    }

    public static FragmentEventsBinding bind(View view) {
        int i = R.id.add_edit_event;
        ImageView imageView = (ImageView) view.findViewById(R.id.add_edit_event);
        if (imageView != null) {
            i = R.id.back;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.back);
            if (imageView2 != null) {
                i = R.id.empty_view;
                TextView textView = (TextView) view.findViewById(R.id.empty_view);
                if (textView != null) {
                    i = R.id.events_list;
                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.events_list);
                    if (epoxyRecyclerView != null) {
                        i = R.id.refresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresh);
                        if (swipeRefreshLayout != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                            if (toolbar != null) {
                                i = R.id.toolbar_title;
                                TextView textView2 = (TextView) view.findViewById(R.id.toolbar_title);
                                if (textView2 != null) {
                                    return new FragmentEventsBinding((ConstraintLayout) view, imageView, imageView2, textView, epoxyRecyclerView, swipeRefreshLayout, toolbar, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentEventsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_events, (ViewGroup) null, false));
    }
}
