package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentFollowSuggestionsBinding implements a {
    public final View a;
    public final Button b;
    public final ImpressionTrackingEpoxyRecyclerView c;
    public final FrameLayout d;
    public final Button e;
    public final View f;

    public FragmentFollowSuggestionsBinding(ConstraintLayout constraintLayout, View view, Button button, ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, FrameLayout frameLayout, Button button2, TextView textView, View view2) {
        this.a = view;
        this.b = button;
        this.c = impressionTrackingEpoxyRecyclerView;
        this.d = frameLayout;
        this.e = button2;
        this.f = view2;
    }

    public static FragmentFollowSuggestionsBinding bind(View view) {
        int i = R.id.bottom_shadow;
        View findViewById = view.findViewById(R.id.bottom_shadow);
        if (findViewById != null) {
            i = R.id.continue_button;
            Button button = (Button) view.findViewById(R.id.continue_button);
            if (button != null) {
                i = R.id.follow_suggestions;
                ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = (ImpressionTrackingEpoxyRecyclerView) view.findViewById(R.id.follow_suggestions);
                if (impressionTrackingEpoxyRecyclerView != null) {
                    i = R.id.loading;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                    if (frameLayout != null) {
                        i = R.id.suggestion_toggle;
                        Button button2 = (Button) view.findViewById(R.id.suggestion_toggle);
                        if (button2 != null) {
                            i = R.id.title;
                            TextView textView = (TextView) view.findViewById(R.id.title);
                            if (textView != null) {
                                i = R.id.top_shadow;
                                View findViewById2 = view.findViewById(R.id.top_shadow);
                                if (findViewById2 != null) {
                                    return new FragmentFollowSuggestionsBinding((ConstraintLayout) view, findViewById, button, impressionTrackingEpoxyRecyclerView, frameLayout, button2, textView, findViewById2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentFollowSuggestionsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_follow_suggestions, (ViewGroup) null, false));
    }
}
