package com.clubhouse.android.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.clubhouse.android.core.R;
import h0.e0.a;
import java.util.Objects;

public final class FragmentDialogContainerBinding implements a {
    public FragmentDialogContainerBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
    }

    public static FragmentDialogContainerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new FragmentDialogContainerBinding(fragmentContainerView, fragmentContainerView);
    }

    public static FragmentDialogContainerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_dialog_container, (ViewGroup) null, false));
    }
}
