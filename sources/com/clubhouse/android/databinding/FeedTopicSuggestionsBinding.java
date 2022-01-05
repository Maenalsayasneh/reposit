package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FeedTopicSuggestionsBinding implements a {
    public final LinearLayout a;
    public final TextView b;

    public FeedTopicSuggestionsBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    public static FeedTopicSuggestionsBinding bind(View view) {
        int i = R.id.main_topics_list;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.main_topics_list);
        if (linearLayout != null) {
            i = R.id.title;
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                return new FeedTopicSuggestionsBinding((ConstraintLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FeedTopicSuggestionsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_topic_suggestions, (ViewGroup) null, false));
    }
}
