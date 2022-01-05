package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class FragmentHalfProfileContainerBinding implements a {
    public FragmentHalfProfileContainerBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
    }

    public static FragmentHalfProfileContainerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new FragmentHalfProfileContainerBinding(fragmentContainerView, fragmentContainerView);
    }

    public static FragmentHalfProfileContainerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_half_profile_container, (ViewGroup) null, false));
    }
}
