package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
import h0.e0.a;

public final class StripeChallengeZoneMultiSelectViewBinding implements a {
    public final ThreeDS2TextView label;
    private final LinearLayout rootView;
    public final LinearLayout selectGroup;

    private StripeChallengeZoneMultiSelectViewBinding(LinearLayout linearLayout, ThreeDS2TextView threeDS2TextView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.label = threeDS2TextView;
        this.selectGroup = linearLayout2;
    }

    public static StripeChallengeZoneMultiSelectViewBinding bind(View view) {
        int i = R.id.label;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) view.findViewById(i);
        if (threeDS2TextView != null) {
            i = R.id.select_group;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                return new StripeChallengeZoneMultiSelectViewBinding((LinearLayout) view, threeDS2TextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeZoneMultiSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeChallengeZoneMultiSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_zone_multi_select_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
