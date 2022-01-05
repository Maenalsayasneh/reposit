package com.clubhouse.android.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clubhouse.android.core.R;
import h0.e0.a;

public final class BottomSheetGrabHandleBinding implements a {
    public final View a;
    public final FrameLayout b;

    public BottomSheetGrabHandleBinding(FrameLayout frameLayout, View view, FrameLayout frameLayout2) {
        this.a = view;
        this.b = frameLayout2;
    }

    public static BottomSheetGrabHandleBinding bind(View view) {
        int i = R.id.grab_handle;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new BottomSheetGrabHandleBinding(frameLayout, findViewById, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetGrabHandleBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.bottom_sheet_grab_handle, (ViewGroup) null, false));
    }
}
