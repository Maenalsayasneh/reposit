package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubEventBinding implements a {
    public final EpoxyRecyclerView a;

    public ClubEventBinding(FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView) {
        this.a = epoxyRecyclerView;
    }

    public static ClubEventBinding bind(View view) {
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.club_event);
        if (epoxyRecyclerView != null) {
            return new ClubEventBinding((FrameLayout) view, epoxyRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.club_event)));
    }

    public static ClubEventBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_event, (ViewGroup) null, false));
    }
}
