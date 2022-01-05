package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import h0.e0.a;

public final class StripeChallengeFragmentBinding implements a {
    public final BrandZoneView caBrandZone;
    public final ChallengeZoneView caChallengeZone;
    public final InformationZoneView caInformationZone;
    private final ScrollView rootView;

    private StripeChallengeFragmentBinding(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.rootView = scrollView;
        this.caBrandZone = brandZoneView;
        this.caChallengeZone = challengeZoneView;
        this.caInformationZone = informationZoneView;
    }

    public static StripeChallengeFragmentBinding bind(View view) {
        int i = R.id.ca_brand_zone;
        BrandZoneView brandZoneView = (BrandZoneView) view.findViewById(i);
        if (brandZoneView != null) {
            i = R.id.ca_challenge_zone;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) view.findViewById(i);
            if (challengeZoneView != null) {
                i = R.id.ca_information_zone;
                InformationZoneView informationZoneView = (InformationZoneView) view.findViewById(i);
                if (informationZoneView != null) {
                    return new StripeChallengeFragmentBinding((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeChallengeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
