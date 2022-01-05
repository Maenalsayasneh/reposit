package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubDescriptionBinding implements a {
    public final TextView a;
    public final View b;
    public final ConstraintLayout c;

    public ClubDescriptionBinding(ConstraintLayout constraintLayout, TextView textView, View view, ConstraintLayout constraintLayout2, TextView textView2) {
        this.a = textView;
        this.b = view;
        this.c = constraintLayout2;
    }

    public static ClubDescriptionBinding bind(View view) {
        int i = R.id.description;
        TextView textView = (TextView) view.findViewById(R.id.description);
        if (textView != null) {
            i = R.id.description_divider;
            View findViewById = view.findViewById(R.id.description_divider);
            if (findViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.description_subtitle;
                TextView textView2 = (TextView) view.findViewById(R.id.description_subtitle);
                if (textView2 != null) {
                    return new ClubDescriptionBinding(constraintLayout, textView, findViewById, constraintLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_description, (ViewGroup) null, false));
    }
}
