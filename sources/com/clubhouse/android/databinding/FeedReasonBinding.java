package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FeedReasonBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final View c;

    public FeedReasonBinding(ConstraintLayout constraintLayout, TextView textView, View view) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = view;
    }

    public static FeedReasonBinding bind(View view) {
        int i = R.id.reason;
        TextView textView = (TextView) view.findViewById(R.id.reason);
        if (textView != null) {
            i = R.id.reason_divider;
            View findViewById = view.findViewById(R.id.reason_divider);
            if (findViewById != null) {
                return new FeedReasonBinding((ConstraintLayout) view, textView, findViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FeedReasonBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_reason, (ViewGroup) null, false));
    }
}
