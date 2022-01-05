package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import com.stripe.android.stripe3ds2.R;
import h0.e0.a;

public final class StripeChallengeActivityBinding implements a {
    public final FragmentContainerView fragmentContainer;
    private final FrameLayout rootView;

    private StripeChallengeActivityBinding(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    public static StripeChallengeActivityBinding bind(View view) {
        int i = R.id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(i);
        if (fragmentContainerView != null) {
            return new StripeChallengeActivityBinding((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeChallengeActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
