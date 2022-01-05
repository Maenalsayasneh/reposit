package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.R;
import h0.e0.a;

public final class StripeChallengeSubmitDialogBinding implements a {
    public final CircularProgressIndicator progressBar;
    private final FrameLayout rootView;

    private StripeChallengeSubmitDialogBinding(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = frameLayout;
        this.progressBar = circularProgressIndicator;
    }

    public static StripeChallengeSubmitDialogBinding bind(View view) {
        int i = R.id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(i);
        if (circularProgressIndicator != null) {
            return new StripeChallengeSubmitDialogBinding((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeSubmitDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeChallengeSubmitDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_submit_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
