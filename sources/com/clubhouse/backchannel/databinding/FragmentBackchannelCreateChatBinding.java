package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h0.e0.a;

public final class FragmentBackchannelCreateChatBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final FloatingActionButton c;
    public final FrameLayout d;
    public final ProgressBar e;
    public final EpoxyRecyclerView f;
    public final EditText g;
    public final Toolbar h;

    public FragmentBackchannelCreateChatBinding(ConstraintLayout constraintLayout, ImageView imageView, FloatingActionButton floatingActionButton, FrameLayout frameLayout, ProgressBar progressBar, EpoxyRecyclerView epoxyRecyclerView, EditText editText, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = floatingActionButton;
        this.d = frameLayout;
        this.e = progressBar;
        this.f = epoxyRecyclerView;
        this.g = editText;
        this.h = toolbar;
    }

    public static FragmentBackchannelCreateChatBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.create;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(i);
            if (floatingActionButton != null) {
                i = R.id.full_screen_loading;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                    if (progressBar != null) {
                        i = R.id.results;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(i);
                        if (epoxyRecyclerView != null) {
                            i = R.id.search;
                            EditText editText = (EditText) view.findViewById(i);
                            if (editText != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(i);
                                if (toolbar != null) {
                                    return new FragmentBackchannelCreateChatBinding((ConstraintLayout) view, imageView, floatingActionButton, frameLayout, progressBar, epoxyRecyclerView, editText, toolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBackchannelCreateChatBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_create_chat, (ViewGroup) null, false));
    }
}
