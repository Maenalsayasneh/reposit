package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentLanguagesBinding implements a {
    public final ImageView a;
    public final View b;
    public final EpoxyRecyclerView c;

    public FragmentLanguagesBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, EpoxyRecyclerView epoxyRecyclerView, NestedScrollView nestedScrollView, CardView cardView, Toolbar toolbar, TextView textView) {
        this.a = imageView;
        this.b = view;
        this.c = epoxyRecyclerView;
    }

    public static FragmentLanguagesBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.bottom_shadow;
            View findViewById = view.findViewById(R.id.bottom_shadow);
            if (findViewById != null) {
                i = R.id.languages_list;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.languages_list);
                if (epoxyRecyclerView != null) {
                    i = R.id.languages_list_container;
                    NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.languages_list_container);
                    if (nestedScrollView != null) {
                        i = R.id.languages_list_root;
                        CardView cardView = (CardView) view.findViewById(R.id.languages_list_root);
                        if (cardView != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                            if (toolbar != null) {
                                i = R.id.toolbar_title;
                                TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
                                if (textView != null) {
                                    return new FragmentLanguagesBinding((ConstraintLayout) view, imageView, findViewById, epoxyRecyclerView, nestedScrollView, cardView, toolbar, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentLanguagesBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_languages, (ViewGroup) null, false));
    }
}
