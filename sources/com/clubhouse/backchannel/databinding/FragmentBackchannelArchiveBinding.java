package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class FragmentBackchannelArchiveBinding implements a {
    public final ImageView a;
    public final EpoxyRecyclerView b;
    public final TextView c;
    public final ProgressBar d;
    public final Toolbar e;

    public FragmentBackchannelArchiveBinding(ConstraintLayout constraintLayout, ImageView imageView, EpoxyRecyclerView epoxyRecyclerView, TextView textView, ProgressBar progressBar, Toolbar toolbar) {
        this.a = imageView;
        this.b = epoxyRecyclerView;
        this.c = textView;
        this.d = progressBar;
        this.e = toolbar;
    }

    public static FragmentBackchannelArchiveBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.chats_list;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(i);
            if (epoxyRecyclerView != null) {
                i = R.id.empty_view;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                    if (progressBar != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(i);
                        if (toolbar != null) {
                            return new FragmentBackchannelArchiveBinding((ConstraintLayout) view, imageView, epoxyRecyclerView, textView, progressBar, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBackchannelArchiveBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_archive, (ViewGroup) null, false));
    }
}
