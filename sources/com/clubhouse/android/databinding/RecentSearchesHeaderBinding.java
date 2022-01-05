package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class RecentSearchesHeaderBinding implements a {
    public final Button a;

    public RecentSearchesHeaderBinding(ConstraintLayout constraintLayout, Button button, TextView textView) {
        this.a = button;
    }

    public static RecentSearchesHeaderBinding bind(View view) {
        int i = R.id.clear;
        Button button = (Button) view.findViewById(R.id.clear);
        if (button != null) {
            i = R.id.header;
            TextView textView = (TextView) view.findViewById(R.id.header);
            if (textView != null) {
                return new RecentSearchesHeaderBinding((ConstraintLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RecentSearchesHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.recent_searches_header, (ViewGroup) null, false));
    }
}
