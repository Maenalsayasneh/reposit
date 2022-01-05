package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class TopicsHeaderBinding implements a {
    public TopicsHeaderBinding(TextView textView, TextView textView2) {
    }

    public static TopicsHeaderBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new TopicsHeaderBinding(textView, textView);
    }

    public static TopicsHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.topics_header, (ViewGroup) null, false));
    }
}
