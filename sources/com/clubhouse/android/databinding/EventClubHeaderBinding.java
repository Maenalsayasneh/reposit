package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class EventClubHeaderBinding implements a {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;

    public EventClubHeaderBinding(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = view;
        this.c = textView3;
    }

    public static EventClubHeaderBinding bind(View view) {
        int i = R.id.body;
        TextView textView = (TextView) view.findViewById(R.id.body);
        if (textView != null) {
            i = R.id.divider;
            View findViewById = view.findViewById(R.id.divider);
            if (findViewById != null) {
                i = R.id.title;
                TextView textView2 = (TextView) view.findViewById(R.id.title);
                if (textView2 != null) {
                    i = R.id.url;
                    TextView textView3 = (TextView) view.findViewById(R.id.url);
                    if (textView3 != null) {
                        return new EventClubHeaderBinding((ConstraintLayout) view, textView, findViewById, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventClubHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_club_header, (ViewGroup) null, false));
    }
}
