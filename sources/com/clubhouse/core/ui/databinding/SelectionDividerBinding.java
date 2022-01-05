package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.core.ui.R;
import h0.e0.a;
import java.util.Objects;

public final class SelectionDividerBinding implements a {
    public final View a;
    public final View b;

    public SelectionDividerBinding(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public static SelectionDividerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new SelectionDividerBinding(view, view);
    }

    public static SelectionDividerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.selection_divider, (ViewGroup) null, false));
    }
}
