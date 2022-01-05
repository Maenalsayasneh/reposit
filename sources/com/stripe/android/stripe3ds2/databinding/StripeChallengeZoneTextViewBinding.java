package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.R;
import h0.e0.a;

public final class StripeChallengeZoneTextViewBinding implements a {
    public final TextInputLayout label;
    private final TextInputLayout rootView;
    public final TextInputEditText textEntry;

    private StripeChallengeZoneTextViewBinding(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText) {
        this.rootView = textInputLayout;
        this.label = textInputLayout2;
        this.textEntry = textInputEditText;
    }

    public static StripeChallengeZoneTextViewBinding bind(View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i = R.id.text_entry;
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(i);
        if (textInputEditText != null) {
            return new StripeChallengeZoneTextViewBinding((TextInputLayout) view, textInputLayout, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeChallengeZoneTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeChallengeZoneTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_zone_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextInputLayout getRoot() {
        return this.rootView;
    }
}
