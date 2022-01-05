package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class TopicTitleBinding implements a {
    public final TextView a;

    public TopicTitleBinding(TextView textView, TextView textView2) {
        this.a = textView2;
    }

    public static TopicTitleBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new TopicTitleBinding(textView, textView);
    }

    public static TopicTitleBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.topic_title, (ViewGroup) null, false));
    }
}
