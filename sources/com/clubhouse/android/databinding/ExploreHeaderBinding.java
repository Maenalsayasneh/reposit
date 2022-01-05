package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class ExploreHeaderBinding implements a {
    public final TextView a;

    public ExploreHeaderBinding(TextView textView, TextView textView2) {
        this.a = textView2;
    }

    public static ExploreHeaderBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new ExploreHeaderBinding(textView, textView);
    }

    public static ExploreHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_header, (ViewGroup) null, false));
    }
}
