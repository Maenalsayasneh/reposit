package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class FragmentSelectionBinding implements a {
    public final ImageView a;
    public final View b;
    public final ConstraintLayout c;
    public final EpoxyRecyclerView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public FragmentSelectionBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ConstraintLayout constraintLayout2, EpoxyRecyclerView epoxyRecyclerView, NestedScrollView nestedScrollView, TextView textView, TextView textView2, CardView cardView, Toolbar toolbar, TextView textView3) {
        this.a = imageView;
        this.b = view;
        this.c = constraintLayout2;
        this.d = epoxyRecyclerView;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.clubhouse.core.ui.R.id.bottom_shadow;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.core.ui.databinding.FragmentSelectionBinding bind(android.view.View r14) {
        /*
            int r0 = com.clubhouse.core.ui.R.id.back
            android.view.View r1 = r14.findViewById(r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.bottom_shadow
            android.view.View r5 = r14.findViewById(r0)
            if (r5 == 0) goto L_0x006b
            r6 = r14
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            int r0 = com.clubhouse.core.ui.R.id.selection_list
            android.view.View r1 = r14.findViewById(r0)
            r7 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r7 = (com.airbnb.epoxy.EpoxyRecyclerView) r7
            if (r7 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.selection_list_container
            android.view.View r1 = r14.findViewById(r0)
            r8 = r1
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            if (r8 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.selection_list_footer
            android.view.View r1 = r14.findViewById(r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.selection_list_header
            android.view.View r1 = r14.findViewById(r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.selection_list_root
            android.view.View r1 = r14.findViewById(r0)
            r11 = r1
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            if (r11 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.toolbar
            android.view.View r1 = r14.findViewById(r0)
            r12 = r1
            androidx.appcompat.widget.Toolbar r12 = (androidx.appcompat.widget.Toolbar) r12
            if (r12 == 0) goto L_0x006b
            int r0 = com.clubhouse.core.ui.R.id.toolbar_title
            android.view.View r1 = r14.findViewById(r0)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x006b
            com.clubhouse.core.ui.databinding.FragmentSelectionBinding r14 = new com.clubhouse.core.ui.databinding.FragmentSelectionBinding
            r2 = r14
            r3 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x006b:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.core.ui.databinding.FragmentSelectionBinding.bind(android.view.View):com.clubhouse.core.ui.databinding.FragmentSelectionBinding");
    }

    public static FragmentSelectionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_selection, (ViewGroup) null, false));
    }
}
