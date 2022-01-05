package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentClubNominationsBinding implements a {
    public final Button a;
    public final ImageView b;
    public final View c;
    public final ProgressBar d;
    public final EpoxyRecyclerView e;
    public final Button f;

    public FragmentClubNominationsBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, View view, ProgressBar progressBar, EpoxyRecyclerView epoxyRecyclerView, Button button2, Toolbar toolbar) {
        this.a = button;
        this.b = imageView;
        this.c = view;
        this.d = progressBar;
        this.e = epoxyRecyclerView;
        this.f = button2;
    }

    public static FragmentClubNominationsBinding bind(View view) {
        int i = R.id.approve_all;
        Button button = (Button) view.findViewById(R.id.approve_all);
        if (button != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) view.findViewById(R.id.back);
            if (imageView != null) {
                i = R.id.bottom_shadow;
                View findViewById = view.findViewById(R.id.bottom_shadow);
                if (findViewById != null) {
                    i = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                    if (progressBar != null) {
                        i = R.id.nominations_list;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.nominations_list);
                        if (epoxyRecyclerView != null) {
                            i = R.id.reject_all;
                            Button button2 = (Button) view.findViewById(R.id.reject_all);
                            if (button2 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                if (toolbar != null) {
                                    return new FragmentClubNominationsBinding((ConstraintLayout) view, button, imageView, findViewById, progressBar, epoxyRecyclerView, button2, toolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentClubNominationsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_club_nominations, (ViewGroup) null, false));
    }
}
