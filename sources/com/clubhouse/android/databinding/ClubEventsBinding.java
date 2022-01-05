package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public final class ClubEventsBinding implements a {
    public final TextView a;
    public final View b;
    public final ScrollingPagerIndicator c;
    public final EpoxyRecyclerView d;
    public final TextView e;

    public ClubEventsBinding(ConstraintLayout constraintLayout, TextView textView, View view, ScrollingPagerIndicator scrollingPagerIndicator, EpoxyRecyclerView epoxyRecyclerView, TextView textView2) {
        this.a = textView;
        this.b = view;
        this.c = scrollingPagerIndicator;
        this.d = epoxyRecyclerView;
        this.e = textView2;
    }

    public static ClubEventsBinding bind(View view) {
        int i = R.id.no_scheduled_rooms;
        TextView textView = (TextView) view.findViewById(R.id.no_scheduled_rooms);
        if (textView != null) {
            i = R.id.up_next_divider;
            View findViewById = view.findViewById(R.id.up_next_divider);
            if (findViewById != null) {
                i = R.id.up_next_events_indicator;
                ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) view.findViewById(R.id.up_next_events_indicator);
                if (scrollingPagerIndicator != null) {
                    i = R.id.up_next_events_list;
                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.up_next_events_list);
                    if (epoxyRecyclerView != null) {
                        i = R.id.up_next_subtitle;
                        TextView textView2 = (TextView) view.findViewById(R.id.up_next_subtitle);
                        if (textView2 != null) {
                            return new ClubEventsBinding((ConstraintLayout) view, textView, findViewById, scrollingPagerIndicator, epoxyRecyclerView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubEventsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_events, (ViewGroup) null, false));
    }
}
