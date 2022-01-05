package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class FragmentNavContainerBinding implements a {
    public FragmentNavContainerBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
    }

    public static FragmentNavContainerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new FragmentNavContainerBinding(fragmentContainerView, fragmentContainerView);
    }

    public static FragmentNavContainerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_nav_container, (ViewGroup) null, false));
    }
}
