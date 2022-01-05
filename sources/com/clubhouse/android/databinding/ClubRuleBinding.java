package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubRuleBinding implements a {
    public final View a;
    public final TextView b;
    public final TextView c;

    public ClubRuleBinding(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2) {
        this.a = view;
        this.b = textView;
        this.c = textView2;
    }

    public static ClubRuleBinding bind(View view) {
        int i = R.id.bullet;
        View findViewById = view.findViewById(R.id.bullet);
        if (findViewById != null) {
            i = R.id.description;
            TextView textView = (TextView) view.findViewById(R.id.description);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) view.findViewById(R.id.title);
                if (textView2 != null) {
                    return new ClubRuleBinding((ConstraintLayout) view, findViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubRuleBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_rule, (ViewGroup) null, false));
    }
}
