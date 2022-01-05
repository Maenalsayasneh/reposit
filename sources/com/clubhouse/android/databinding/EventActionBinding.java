package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class EventActionBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;

    public EventActionBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView2;
        this.c = textView;
    }

    public static EventActionBinding bind(View view) {
        int i = R.id.clicked_background;
        ImageView imageView = (ImageView) view.findViewById(R.id.clicked_background);
        if (imageView != null) {
            i = R.id.icon;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.icon);
            if (imageView2 != null) {
                i = R.id.title;
                TextView textView = (TextView) view.findViewById(R.id.title);
                if (textView != null) {
                    return new EventActionBinding((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventActionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_action, (ViewGroup) null, false));
    }
}
