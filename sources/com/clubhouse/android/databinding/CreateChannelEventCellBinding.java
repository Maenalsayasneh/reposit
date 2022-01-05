package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class CreateChannelEventCellBinding implements a {
    public final LinearLayout a;
    public final TextView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final Button f;

    public CreateChannelEventCellBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView2, TextView textView3, Button button) {
        this.a = linearLayout;
        this.b = textView;
        this.c = linearLayout3;
        this.d = textView2;
        this.e = textView3;
        this.f = button;
    }

    public static CreateChannelEventCellBinding bind(View view) {
        int i = R.id.club_name;
        TextView textView = (TextView) view.findViewById(R.id.club_name);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.event_cell;
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.event_cell);
            if (linearLayout2 != null) {
                i = R.id.event_time;
                TextView textView2 = (TextView) view.findViewById(R.id.event_time);
                if (textView2 != null) {
                    i = R.id.event_title;
                    TextView textView3 = (TextView) view.findViewById(R.id.event_title);
                    if (textView3 != null) {
                        i = R.id.start_different_room;
                        Button button = (Button) view.findViewById(R.id.start_different_room);
                        if (button != null) {
                            return new CreateChannelEventCellBinding(linearLayout, textView, linearLayout, linearLayout2, textView2, textView3, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CreateChannelEventCellBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.create_channel_event_cell, (ViewGroup) null, false));
    }
}
