package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import com.google.android.material.tabs.TabLayout;
import h0.e0.a;

public final class FragmentBackchannelInboxBinding implements a {
    public final ImageView a;
    public final ImageView b;
    public final TextView c;
    public final EpoxyRecyclerView d;
    public final SwipeRefreshLayout e;
    public final ImageView f;
    public final TabLayout g;
    public final Toolbar h;

    public FragmentBackchannelInboxBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout, ImageView imageView3, TabLayout tabLayout, Toolbar toolbar) {
        this.a = imageView;
        this.b = imageView2;
        this.c = textView;
        this.d = epoxyRecyclerView;
        this.e = swipeRefreshLayout;
        this.f = imageView3;
        this.g = tabLayout;
        this.h = toolbar;
    }

    public static FragmentBackchannelInboxBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.create_chat;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                i = R.id.empty_view;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.inbox_list;
                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(i);
                    if (epoxyRecyclerView != null) {
                        i = R.id.refresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(i);
                        if (swipeRefreshLayout != null) {
                            i = R.id.settings;
                            ImageView imageView3 = (ImageView) view.findViewById(i);
                            if (imageView3 != null) {
                                i = R.id.tabs;
                                TabLayout tabLayout = (TabLayout) view.findViewById(i);
                                if (tabLayout != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) view.findViewById(i);
                                    if (toolbar != null) {
                                        return new FragmentBackchannelInboxBinding((ConstraintLayout) view, imageView, imageView2, textView, epoxyRecyclerView, swipeRefreshLayout, imageView3, tabLayout, toolbar);
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

    public static FragmentBackchannelInboxBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_inbox, (ViewGroup) null, false));
    }
}
