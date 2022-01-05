package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class EventNoHostClubBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;

    public EventNoHostClubBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = imageView;
    }

    public static EventNoHostClubBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.event_host_club_title;
        TextView textView = (TextView) view.findViewById(R.id.event_host_club_title);
        if (textView != null) {
            i = R.id.selected_icon;
            ImageView imageView = (ImageView) view.findViewById(R.id.selected_icon);
            if (imageView != null) {
                return new EventNoHostClubBinding((ConstraintLayout) view, constraintLayout, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventNoHostClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_no_host_club, (ViewGroup) null, false));
    }
}
