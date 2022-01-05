package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentBuddyListBinding implements a {
    public final EpoxyRecyclerView a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final TextView d;
    public final SwipeRefreshLayout e;
    public final CardView f;
    public final FrameLayout g;

    public FragmentBuddyListBinding(SwipeRefreshLayout swipeRefreshLayout, EpoxyRecyclerView epoxyRecyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, SwipeRefreshLayout swipeRefreshLayout2, CardView cardView, FrameLayout frameLayout) {
        this.a = epoxyRecyclerView;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = textView;
        this.e = swipeRefreshLayout2;
        this.f = cardView;
        this.g = frameLayout;
    }

    public static FragmentBuddyListBinding bind(View view) {
        int i = R.id.buddy_list;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.buddy_list);
        if (epoxyRecyclerView != null) {
            i = R.id.empty_view;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.empty_view);
            if (linearLayout != null) {
                i = R.id.error_view;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.error_view);
                if (linearLayout2 != null) {
                    i = R.id.explore_button;
                    TextView textView = (TextView) view.findViewById(R.id.explore_button);
                    if (textView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                        i = R.id.retry_button;
                        CardView cardView = (CardView) view.findViewById(R.id.retry_button);
                        if (cardView != null) {
                            i = R.id.room_loading;
                            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.room_loading);
                            if (frameLayout != null) {
                                return new FragmentBuddyListBinding(swipeRefreshLayout, epoxyRecyclerView, linearLayout, linearLayout2, textView, swipeRefreshLayout, cardView, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBuddyListBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_buddy_list, (ViewGroup) null, false));
    }
}
