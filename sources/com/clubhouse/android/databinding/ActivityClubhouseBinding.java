package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.clubhouse.app.R;
import com.clubhouse.wave.ui.WaveBarView;
import h0.e0.a;

public final class ActivityClubhouseBinding implements a {
    public final ConstraintLayout a;
    public final FragmentContainerView b;
    public final FragmentContainerView c;
    public final WaveBarView d;
    public final View e;

    public ActivityClubhouseBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, WaveBarView waveBarView, View view) {
        this.a = constraintLayout;
        this.b = fragmentContainerView;
        this.c = fragmentContainerView2;
        this.d = waveBarView;
        this.e = view;
    }

    public static ActivityClubhouseBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.channel_fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.channel_fragment_container);
        if (fragmentContainerView != null) {
            i = R.id.main_nav_host;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) view.findViewById(R.id.main_nav_host);
            if (fragmentContainerView2 != null) {
                i = R.id.wave_bar;
                WaveBarView waveBarView = (WaveBarView) view.findViewById(R.id.wave_bar);
                if (waveBarView != null) {
                    i = R.id.wave_bar_scrim;
                    View findViewById = view.findViewById(R.id.wave_bar_scrim);
                    if (findViewById != null) {
                        return new ActivityClubhouseBinding((ConstraintLayout) view, constraintLayout, fragmentContainerView, fragmentContainerView2, waveBarView, findViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityClubhouseBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_clubhouse, (ViewGroup) null, false));
    }
}
