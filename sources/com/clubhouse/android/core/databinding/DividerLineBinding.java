package com.clubhouse.android.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clubhouse.android.core.R;
import h0.e0.a;
import java.util.Objects;

public final class DividerLineBinding implements a {
    public final FrameLayout a;

    public DividerLineBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout2;
    }

    public static DividerLineBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FrameLayout frameLayout = (FrameLayout) view;
        return new DividerLineBinding(frameLayout, frameLayout);
    }

    public static DividerLineBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.divider_line, (ViewGroup) null, false));
    }
}
