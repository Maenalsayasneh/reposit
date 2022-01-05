package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentClubMemberSearchBinding implements a {
    public final ImageView a;
    public final Button b;
    public final View c;
    public final FrameLayout d;
    public final EpoxyRecyclerView e;
    public final EditText f;

    public FragmentClubMemberSearchBinding(ConstraintLayout constraintLayout, ImageView imageView, Button button, View view, FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView, EditText editText, Toolbar toolbar, TextView textView) {
        this.a = imageView;
        this.b = button;
        this.c = view;
        this.d = frameLayout;
        this.e = epoxyRecyclerView;
        this.f = editText;
    }

    public static FragmentClubMemberSearchBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.cancel;
            Button button = (Button) view.findViewById(R.id.cancel);
            if (button != null) {
                i = R.id.divider;
                View findViewById = view.findViewById(R.id.divider);
                if (findViewById != null) {
                    i = R.id.loading;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                    if (frameLayout != null) {
                        i = R.id.members_list;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.members_list);
                        if (epoxyRecyclerView != null) {
                            i = R.id.search;
                            EditText editText = (EditText) view.findViewById(R.id.search);
                            if (editText != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                if (toolbar != null) {
                                    i = R.id.toolbar_title;
                                    TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
                                    if (textView != null) {
                                        return new FragmentClubMemberSearchBinding((ConstraintLayout) view, imageView, button, findViewById, frameLayout, epoxyRecyclerView, editText, toolbar, textView);
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

    public static FragmentClubMemberSearchBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_club_member_search, (ViewGroup) null, false));
    }
}
