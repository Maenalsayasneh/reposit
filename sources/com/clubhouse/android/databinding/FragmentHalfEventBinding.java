package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentHalfEventBinding implements a {
    public final Button a;
    public final EpoxyRecyclerView b;
    public final EpoxyRecyclerView c;
    public final Button d;
    public final EpoxyRecyclerView e;

    public FragmentHalfEventBinding(NestedScrollView nestedScrollView, Button button, EpoxyRecyclerView epoxyRecyclerView, EpoxyRecyclerView epoxyRecyclerView2, Button button2, EpoxyRecyclerView epoxyRecyclerView3) {
        this.a = button;
        this.b = epoxyRecyclerView;
        this.c = epoxyRecyclerView2;
        this.d = button2;
        this.e = epoxyRecyclerView3;
    }

    public static FragmentHalfEventBinding bind(View view) {
        int i = R.id.ended_conversation;
        Button button = (Button) view.findViewById(R.id.ended_conversation);
        if (button != null) {
            i = R.id.event_actions_list;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.event_actions_list);
            if (epoxyRecyclerView != null) {
                i = R.id.event_club_actions_list;
                EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) view.findViewById(R.id.event_club_actions_list);
                if (epoxyRecyclerView2 != null) {
                    i = R.id.join_create_room_button;
                    Button button2 = (Button) view.findViewById(R.id.join_create_room_button);
                    if (button2 != null) {
                        i = R.id.single_event_list;
                        EpoxyRecyclerView epoxyRecyclerView3 = (EpoxyRecyclerView) view.findViewById(R.id.single_event_list);
                        if (epoxyRecyclerView3 != null) {
                            return new FragmentHalfEventBinding((NestedScrollView) view, button, epoxyRecyclerView, epoxyRecyclerView2, button2, epoxyRecyclerView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHalfEventBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_half_event, (ViewGroup) null, false));
    }
}
