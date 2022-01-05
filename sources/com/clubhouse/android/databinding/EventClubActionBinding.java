package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class EventClubActionBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;

    public EventClubActionBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
    }

    public static EventClubActionBinding bind(View view) {
        int i = R.id.body;
        TextView textView = (TextView) view.findViewById(R.id.body);
        if (textView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            if (imageView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) view.findViewById(R.id.title);
                if (textView2 != null) {
                    return new EventClubActionBinding((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventClubActionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_club_action, (ViewGroup) null, false));
    }
}
