package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class MeetTheNewBellBinding implements a {
    public MeetTheNewBellBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
    }

    public static MeetTheNewBellBinding bind(View view) {
        int i = R.id.body;
        TextView textView = (TextView) view.findViewById(R.id.body);
        if (textView != null) {
            i = R.id.meet_new_bell;
            ImageView imageView = (ImageView) view.findViewById(R.id.meet_new_bell);
            if (imageView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) view.findViewById(R.id.title);
                if (textView2 != null) {
                    return new MeetTheNewBellBinding((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MeetTheNewBellBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.meet_the_new_bell, (ViewGroup) null, false));
    }
}
