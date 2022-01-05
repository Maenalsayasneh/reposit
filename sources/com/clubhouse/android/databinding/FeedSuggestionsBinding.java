package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FeedSuggestionsBinding implements a {
    public final ImpressionTrackingEpoxyRecyclerView a;
    public final TextView b;

    public FeedSuggestionsBinding(ConstraintLayout constraintLayout, ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, TextView textView) {
        this.a = impressionTrackingEpoxyRecyclerView;
        this.b = textView;
    }

    public static FeedSuggestionsBinding bind(View view) {
        int i = R.id.suggestion_list;
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = (ImpressionTrackingEpoxyRecyclerView) view.findViewById(R.id.suggestion_list);
        if (impressionTrackingEpoxyRecyclerView != null) {
            i = R.id.title;
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                return new FeedSuggestionsBinding((ConstraintLayout) view, impressionTrackingEpoxyRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FeedSuggestionsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_suggestions, (ViewGroup) null, false));
    }
}
