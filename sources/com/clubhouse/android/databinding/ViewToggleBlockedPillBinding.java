package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ViewToggleBlockedPillBinding implements a {
    public final TextView a;
    public final CardView b;

    public ViewToggleBlockedPillBinding(FrameLayout frameLayout, TextView textView, CardView cardView) {
        this.a = textView;
        this.b = cardView;
    }

    public static ViewToggleBlockedPillBinding bind(View view) {
        int i = R.id.blocked_text;
        TextView textView = (TextView) view.findViewById(R.id.blocked_text);
        if (textView != null) {
            i = R.id.pill;
            CardView cardView = (CardView) view.findViewById(R.id.pill);
            if (cardView != null) {
                return new ViewToggleBlockedPillBinding((FrameLayout) view, textView, cardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewToggleBlockedPillBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_toggle_blocked_pill, (ViewGroup) null, false));
    }
}
