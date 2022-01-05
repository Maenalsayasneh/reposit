package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class EventHeaderBinding implements a {
    public final TextView a;

    public EventHeaderBinding(TextView textView, TextView textView2) {
        this.a = textView2;
    }

    public static EventHeaderBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new EventHeaderBinding(textView, textView);
    }

    public static EventHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_header, (ViewGroup) null, false));
    }
}
