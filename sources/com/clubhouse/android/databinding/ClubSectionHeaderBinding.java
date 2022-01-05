package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubSectionHeaderBinding implements a {
    public final TextView a;

    public ClubSectionHeaderBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.a = textView;
    }

    public static ClubSectionHeaderBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            return new ClubSectionHeaderBinding((ConstraintLayout) view, constraintLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.title)));
    }

    public static ClubSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_section_header, (ViewGroup) null, false));
    }
}
