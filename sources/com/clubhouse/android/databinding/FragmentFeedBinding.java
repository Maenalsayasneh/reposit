package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentFeedBinding implements a {
    public final ImageView a;
    public final View b;
    public final ImageView c;
    public final ImpressionTrackingEpoxyRecyclerView d;
    public final TextView e;
    public final SwipeRefreshLayout f;
    public final Button g;

    public FragmentFeedBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ImageView imageView2, ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, TextView textView, SwipeRefreshLayout swipeRefreshLayout, Button button) {
        this.a = imageView;
        this.b = view;
        this.c = imageView2;
        this.d = impressionTrackingEpoxyRecyclerView;
        this.e = textView;
        this.f = swipeRefreshLayout;
        this.g = button;
    }

    public static FragmentFeedBinding bind(View view) {
        int i = R.id.backchannel;
        ImageView imageView = (ImageView) view.findViewById(R.id.backchannel);
        if (imageView != null) {
            i = R.id.bottom_shadow;
            View findViewById = view.findViewById(R.id.bottom_shadow);
            if (findViewById != null) {
                i = R.id.buddy_list_toggle;
                ImageView imageView2 = (ImageView) view.findViewById(R.id.buddy_list_toggle);
                if (imageView2 != null) {
                    i = R.id.channel_list;
                    ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = (ImpressionTrackingEpoxyRecyclerView) view.findViewById(R.id.channel_list);
                    if (impressionTrackingEpoxyRecyclerView != null) {
                        i = R.id.empty_view;
                        TextView textView = (TextView) view.findViewById(R.id.empty_view);
                        if (textView != null) {
                            i = R.id.refresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresh);
                            if (swipeRefreshLayout != null) {
                                i = R.id.start_room;
                                Button button = (Button) view.findViewById(R.id.start_room);
                                if (button != null) {
                                    return new FragmentFeedBinding((ConstraintLayout) view, imageView, findViewById, imageView2, impressionTrackingEpoxyRecyclerView, textView, swipeRefreshLayout, button);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentFeedBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_feed, (ViewGroup) null, false));
    }
}
