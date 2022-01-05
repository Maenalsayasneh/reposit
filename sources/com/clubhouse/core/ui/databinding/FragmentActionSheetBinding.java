package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class FragmentActionSheetBinding implements a {
    public final EpoxyRecyclerView a;
    public final TextView b;
    public final TextView c;

    public FragmentActionSheetBinding(ConstraintLayout constraintLayout, EpoxyRecyclerView epoxyRecyclerView, TextView textView, TextView textView2, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding) {
        this.a = epoxyRecyclerView;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = com.clubhouse.core.ui.R.id.grab_handle;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.core.ui.databinding.FragmentActionSheetBinding bind(android.view.View r8) {
        /*
            int r0 = com.clubhouse.core.ui.R.id.action_list
            android.view.View r1 = r8.findViewById(r0)
            r4 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r4 = (com.airbnb.epoxy.EpoxyRecyclerView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = com.clubhouse.core.ui.R.id.action_sheet_description
            android.view.View r1 = r8.findViewById(r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = com.clubhouse.core.ui.R.id.action_sheet_title
            android.view.View r1 = r8.findViewById(r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0037
            int r0 = com.clubhouse.core.ui.R.id.grab_handle
            android.view.View r1 = r8.findViewById(r0)
            if (r1 == 0) goto L_0x0037
            com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding r7 = com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding.bind(r1)
            com.clubhouse.core.ui.databinding.FragmentActionSheetBinding r0 = new com.clubhouse.core.ui.databinding.FragmentActionSheetBinding
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.core.ui.databinding.FragmentActionSheetBinding.bind(android.view.View):com.clubhouse.core.ui.databinding.FragmentActionSheetBinding");
    }

    public static FragmentActionSheetBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_action_sheet, (ViewGroup) null, false));
    }
}
