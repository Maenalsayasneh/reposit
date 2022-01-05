package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentClubBinding implements a {
    public final ImageView a;
    public final EpoxyRecyclerView b;
    public final FrameLayout c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;

    public FragmentClubBinding(ConstraintLayout constraintLayout, ImageView imageView, EpoxyRecyclerView epoxyRecyclerView, FrameLayout frameLayout, ImageView imageView2, ImageView imageView3, ImageView imageView4, Toolbar toolbar) {
        this.a = imageView;
        this.b = epoxyRecyclerView;
        this.c = frameLayout;
        this.d = imageView2;
        this.e = imageView3;
        this.f = imageView4;
    }

    public static FragmentClubBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.club;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.club);
            if (epoxyRecyclerView != null) {
                i = R.id.loading;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                if (frameLayout != null) {
                    i = R.id.menu_admin;
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.menu_admin);
                    if (imageView2 != null) {
                        i = R.id.menu_leader;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.menu_leader);
                        if (imageView3 != null) {
                            i = R.id.share;
                            ImageView imageView4 = (ImageView) view.findViewById(R.id.share);
                            if (imageView4 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                if (toolbar != null) {
                                    return new FragmentClubBinding((ConstraintLayout) view, imageView, epoxyRecyclerView, frameLayout, imageView2, imageView3, imageView4, toolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_club, (ViewGroup) null, false));
    }
}
