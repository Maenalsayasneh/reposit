package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class HallwayEventDividerBinding implements a {
    public final View a;
    public final View b;

    public HallwayEventDividerBinding(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public static HallwayEventDividerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new HallwayEventDividerBinding(view, view);
    }

    public static HallwayEventDividerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.hallway_event_divider, (ViewGroup) null, false));
    }
}
