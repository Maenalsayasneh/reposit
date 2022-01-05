package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class HallwayEventBinding implements a {
    public final TextView a;
    public final TextView b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;

    public HallwayEventBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4) {
        this.a = textView;
        this.b = textView2;
        this.c = constraintLayout2;
        this.d = textView3;
        this.e = textView4;
    }

    public static HallwayEventBinding bind(View view) {
        int i = R.id.club;
        TextView textView = (TextView) view.findViewById(R.id.club);
        if (textView != null) {
            i = R.id.confirmed_to_attend;
            TextView textView2 = (TextView) view.findViewById(R.id.confirmed_to_attend);
            if (textView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.time;
                TextView textView3 = (TextView) view.findViewById(R.id.time);
                if (textView3 != null) {
                    i = R.id.title;
                    TextView textView4 = (TextView) view.findViewById(R.id.title);
                    if (textView4 != null) {
                        return new HallwayEventBinding(constraintLayout, textView, textView2, constraintLayout, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HallwayEventBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.hallway_event, (ViewGroup) null, false));
    }
}
