package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class BuddyListSectionHeaderBinding implements a {
    public final Button a;
    public final TextView b;

    public BuddyListSectionHeaderBinding(ConstraintLayout constraintLayout, Button button, TextView textView) {
        this.a = button;
        this.b = textView;
    }

    public static BuddyListSectionHeaderBinding bind(View view) {
        int i = R.id.show_all;
        Button button = (Button) view.findViewById(R.id.show_all);
        if (button != null) {
            i = R.id.title;
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                return new BuddyListSectionHeaderBinding((ConstraintLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BuddyListSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.buddy_list_section_header, (ViewGroup) null, false));
    }
}
