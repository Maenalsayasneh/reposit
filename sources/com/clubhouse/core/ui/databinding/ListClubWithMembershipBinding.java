package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class ListClubWithMembershipBinding implements a {
    public final ConstraintLayout a;
    public final ListClubAnatomyBinding b;
    public final Button c;
    public final Button d;

    public ListClubWithMembershipBinding(ConstraintLayout constraintLayout, Barrier barrier, ListClubAnatomyBinding listClubAnatomyBinding, Button button, Button button2) {
        this.a = constraintLayout;
        this.b = listClubAnatomyBinding;
        this.c = button;
        this.d = button2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.clubhouse.core.ui.R.id.club;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.core.ui.databinding.ListClubWithMembershipBinding bind(android.view.View r8) {
        /*
            int r0 = com.clubhouse.core.ui.R.id.button_barrier
            android.view.View r1 = r8.findViewById(r0)
            r4 = r1
            androidx.constraintlayout.widget.Barrier r4 = (androidx.constraintlayout.widget.Barrier) r4
            if (r4 == 0) goto L_0x0037
            int r0 = com.clubhouse.core.ui.R.id.club
            android.view.View r1 = r8.findViewById(r0)
            if (r1 == 0) goto L_0x0037
            com.clubhouse.core.ui.databinding.ListClubAnatomyBinding r5 = com.clubhouse.core.ui.databinding.ListClubAnatomyBinding.bind(r1)
            int r0 = com.clubhouse.core.ui.R.id.join_button
            android.view.View r1 = r8.findViewById(r0)
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            if (r6 == 0) goto L_0x0037
            int r0 = com.clubhouse.core.ui.R.id.member_button
            android.view.View r1 = r8.findViewById(r0)
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            if (r7 == 0) goto L_0x0037
            com.clubhouse.core.ui.databinding.ListClubWithMembershipBinding r0 = new com.clubhouse.core.ui.databinding.ListClubWithMembershipBinding
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
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.core.ui.databinding.ListClubWithMembershipBinding.bind(android.view.View):com.clubhouse.core.ui.databinding.ListClubWithMembershipBinding");
    }

    public static ListClubWithMembershipBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.list_club_with_membership, (ViewGroup) null, false));
    }
}
