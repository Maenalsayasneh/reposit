package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class HallwayEventsBinding implements a {
    public final EpoxyRecyclerView a;

    public HallwayEventsBinding(CardView cardView, EpoxyRecyclerView epoxyRecyclerView) {
        this.a = epoxyRecyclerView;
    }

    public static HallwayEventsBinding bind(View view) {
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.hallway_events_list);
        if (epoxyRecyclerView != null) {
            return new HallwayEventsBinding((CardView) view, epoxyRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.hallway_events_list)));
    }

    public static HallwayEventsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.hallway_events, (ViewGroup) null, false));
    }
}
