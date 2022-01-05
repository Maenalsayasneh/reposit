package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ProfileUpcomingEventBinding implements a {
    public final ConstraintLayout a;
    public final RSVPButton b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final TextView g;

    public ProfileUpcomingEventBinding(ConstraintLayout constraintLayout, RSVPButton rSVPButton, TextView textView, TextView textView2, View view, TextView textView3, TextView textView4, Barrier barrier) {
        this.a = constraintLayout;
        this.b = rSVPButton;
        this.c = textView;
        this.d = textView2;
        this.e = view;
        this.f = textView3;
        this.g = textView4;
    }

    public static ProfileUpcomingEventBinding bind(View view) {
        int i = R.id.bell_icon;
        RSVPButton rSVPButton = (RSVPButton) view.findViewById(R.id.bell_icon);
        if (rSVPButton != null) {
            i = R.id.event_club;
            TextView textView = (TextView) view.findViewById(R.id.event_club);
            if (textView != null) {
                i = R.id.event_day;
                TextView textView2 = (TextView) view.findViewById(R.id.event_day);
                if (textView2 != null) {
                    i = R.id.event_divider;
                    View findViewById = view.findViewById(R.id.event_divider);
                    if (findViewById != null) {
                        i = R.id.event_time;
                        TextView textView3 = (TextView) view.findViewById(R.id.event_time);
                        if (textView3 != null) {
                            i = R.id.event_title;
                            TextView textView4 = (TextView) view.findViewById(R.id.event_title);
                            if (textView4 != null) {
                                i = R.id.event_title_barrier;
                                Barrier barrier = (Barrier) view.findViewById(R.id.event_title_barrier);
                                if (barrier != null) {
                                    return new ProfileUpcomingEventBinding((ConstraintLayout) view, rSVPButton, textView, textView2, findViewById, textView3, textView4, barrier);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ProfileUpcomingEventBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.profile_upcoming_event, (ViewGroup) null, false));
    }
}
