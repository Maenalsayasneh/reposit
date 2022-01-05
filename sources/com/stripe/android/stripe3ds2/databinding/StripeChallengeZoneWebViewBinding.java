package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;
import h0.e0.a;
import java.util.Objects;

public final class StripeChallengeZoneWebViewBinding implements a {
    private final View rootView;
    public final ThreeDS2WebView webView;

    private StripeChallengeZoneWebViewBinding(View view, ThreeDS2WebView threeDS2WebView) {
        this.rootView = view;
        this.webView = threeDS2WebView;
    }

    public static StripeChallengeZoneWebViewBinding bind(View view) {
        int i = R.id.web_view;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) view.findViewById(i);
        if (threeDS2WebView != null) {
            return new StripeChallengeZoneWebViewBinding(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeZoneWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_challenge_zone_web_view, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
