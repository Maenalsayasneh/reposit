package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.clubhouse.backchannel.R;
import h0.e0.a;
import java.util.Objects;

public final class FragmentBackchannelContainerBinding implements a {
    public final FragmentContainerView a;

    public FragmentBackchannelContainerBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.a = fragmentContainerView;
    }

    public static FragmentBackchannelContainerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new FragmentBackchannelContainerBinding(fragmentContainerView, fragmentContainerView);
    }

    public static FragmentBackchannelContainerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_container, (ViewGroup) null, false));
    }
}
