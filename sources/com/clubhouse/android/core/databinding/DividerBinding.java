package com.clubhouse.android.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.core.R;
import h0.e0.a;
import java.util.Objects;

public final class DividerBinding implements a {
    public final View a;

    public DividerBinding(View view) {
        this.a = view;
    }

    public static DividerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new DividerBinding(view);
    }

    public static DividerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.divider, (ViewGroup) null, false));
    }
}
