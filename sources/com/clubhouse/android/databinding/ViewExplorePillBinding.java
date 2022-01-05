package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ViewExplorePillBinding implements a {
    public final FrameLayout a;

    public ViewExplorePillBinding(FrameLayout frameLayout, CardView cardView, FrameLayout frameLayout2) {
        this.a = frameLayout2;
    }

    public static ViewExplorePillBinding bind(View view) {
        CardView cardView = (CardView) view.findViewById(R.id.pill);
        if (cardView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new ViewExplorePillBinding(frameLayout, cardView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.pill)));
    }

    public static ViewExplorePillBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_explore_pill, (ViewGroup) null, false));
    }
}
