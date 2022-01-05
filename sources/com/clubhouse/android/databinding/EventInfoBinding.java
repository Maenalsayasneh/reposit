package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.app.R;
import h0.e0.a;

public final class EventInfoBinding implements a {
    public final ConstraintLayout a;
    public final RSVPButton b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public EventInfoBinding(ConstraintLayout constraintLayout, RSVPButton rSVPButton, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = constraintLayout;
        this.b = rSVPButton;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
    }

    public static EventInfoBinding bind(View view) {
        int i = R.id.bell_icon;
        RSVPButton rSVPButton = (RSVPButton) view.findViewById(R.id.bell_icon);
        if (rSVPButton != null) {
            i = R.id.edit;
            TextView textView = (TextView) view.findViewById(R.id.edit);
            if (textView != null) {
                i = R.id.menu;
                ImageView imageView = (ImageView) view.findViewById(R.id.menu);
                if (imageView != null) {
                    i = R.id.subtitle_club;
                    TextView textView2 = (TextView) view.findViewById(R.id.subtitle_club);
                    if (textView2 != null) {
                        i = R.id.subtitle_from;
                        TextView textView3 = (TextView) view.findViewById(R.id.subtitle_from);
                        if (textView3 != null) {
                            i = R.id.time;
                            TextView textView4 = (TextView) view.findViewById(R.id.time);
                            if (textView4 != null) {
                                i = R.id.title;
                                TextView textView5 = (TextView) view.findViewById(R.id.title);
                                if (textView5 != null) {
                                    return new EventInfoBinding((ConstraintLayout) view, rSVPButton, textView, imageView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_info, (ViewGroup) null, false));
    }
}
