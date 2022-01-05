package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentHostClubBinding implements a {
    public final ImageView a;
    public final EpoxyRecyclerView b;

    public FragmentHostClubBinding(ConstraintLayout constraintLayout, ImageView imageView, EpoxyRecyclerView epoxyRecyclerView, CardView cardView, Toolbar toolbar, TextView textView) {
        this.a = imageView;
        this.b = epoxyRecyclerView;
    }

    public static FragmentHostClubBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.hosts_club_list;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.hosts_club_list);
            if (epoxyRecyclerView != null) {
                i = R.id.hosts_club_list_root;
                CardView cardView = (CardView) view.findViewById(R.id.hosts_club_list_root);
                if (cardView != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                    if (toolbar != null) {
                        i = R.id.toolbar_title;
                        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
                        if (textView != null) {
                            return new FragmentHostClubBinding((ConstraintLayout) view, imageView, epoxyRecyclerView, cardView, toolbar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHostClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_host_club, (ViewGroup) null, false));
    }
}
