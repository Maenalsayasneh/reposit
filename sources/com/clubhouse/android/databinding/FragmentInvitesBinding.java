package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentInvitesBinding implements a {
    public final ImageView a;
    public final EpoxyRecyclerView b;
    public final CardView c;
    public final ProgressBar d;
    public final EditText e;

    public FragmentInvitesBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, EpoxyRecyclerView epoxyRecyclerView, CardView cardView, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, EditText editText, ImageView imageView2, Toolbar toolbar, TextView textView5) {
        this.a = imageView;
        this.b = epoxyRecyclerView;
        this.c = cardView;
        this.d = progressBar;
        this.e = editText;
    }

    public static FragmentInvitesBinding bind(View view) {
        View view2 = view;
        int i = R.id.back;
        ImageView imageView = (ImageView) view2.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.invites_header;
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.invites_header);
            if (constraintLayout != null) {
                i = R.id.invites_intro;
                TextView textView = (TextView) view2.findViewById(R.id.invites_intro);
                if (textView != null) {
                    i = R.id.invites_list;
                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view2.findViewById(R.id.invites_list);
                    if (epoxyRecyclerView != null) {
                        i = R.id.lets_find;
                        CardView cardView = (CardView) view2.findViewById(R.id.lets_find);
                        if (cardView != null) {
                            i = R.id.lets_find_body;
                            TextView textView2 = (TextView) view2.findViewById(R.id.lets_find_body);
                            if (textView2 != null) {
                                i = R.id.lets_find_button;
                                TextView textView3 = (TextView) view2.findViewById(R.id.lets_find_button);
                                if (textView3 != null) {
                                    i = R.id.lets_find_title;
                                    TextView textView4 = (TextView) view2.findViewById(R.id.lets_find_title);
                                    if (textView4 != null) {
                                        i = R.id.loading;
                                        ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.loading);
                                        if (progressBar != null) {
                                            i = R.id.search;
                                            EditText editText = (EditText) view2.findViewById(R.id.search);
                                            if (editText != null) {
                                                i = R.id.search_contacts_picker;
                                                ImageView imageView2 = (ImageView) view2.findViewById(R.id.search_contacts_picker);
                                                if (imageView2 != null) {
                                                    i = R.id.toolbar;
                                                    Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                    if (toolbar != null) {
                                                        i = R.id.toolbar_title;
                                                        TextView textView5 = (TextView) view2.findViewById(R.id.toolbar_title);
                                                        if (textView5 != null) {
                                                            return new FragmentInvitesBinding((ConstraintLayout) view2, imageView, constraintLayout, textView, epoxyRecyclerView, cardView, textView2, textView3, textView4, progressBar, editText, imageView2, toolbar, textView5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static FragmentInvitesBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_invites, (ViewGroup) null, false));
    }
}
