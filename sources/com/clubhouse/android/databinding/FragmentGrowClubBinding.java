package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentGrowClubBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ProgressBar e;
    public final EpoxyRecyclerView f;
    public final EditText g;

    public FragmentGrowClubBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, EpoxyRecyclerView epoxyRecyclerView, EditText editText, Toolbar toolbar) {
        this.a = imageView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = progressBar;
        this.f = epoxyRecyclerView;
        this.g = editText;
    }

    public static FragmentGrowClubBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.done;
            TextView textView = (TextView) view.findViewById(R.id.done);
            if (textView != null) {
                i = R.id.empty;
                TextView textView2 = (TextView) view.findViewById(R.id.empty);
                if (textView2 != null) {
                    i = R.id.invite_message;
                    TextView textView3 = (TextView) view.findViewById(R.id.invite_message);
                    if (textView3 != null) {
                        i = R.id.loading;
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                        if (progressBar != null) {
                            i = R.id.results_list;
                            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.results_list);
                            if (epoxyRecyclerView != null) {
                                i = R.id.search;
                                EditText editText = (EditText) view.findViewById(R.id.search);
                                if (editText != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                    if (toolbar != null) {
                                        return new FragmentGrowClubBinding((ConstraintLayout) view, imageView, textView, textView2, textView3, progressBar, epoxyRecyclerView, editText, toolbar);
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

    public static FragmentGrowClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_grow_club, (ViewGroup) null, false));
    }
}
