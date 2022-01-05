package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class FollowableListUserBinding implements a {
    public final TriStateButton a;
    public final ListUserAnatomyBinding b;

    public FollowableListUserBinding(ConstraintLayout constraintLayout, TriStateButton triStateButton, ListUserAnatomyBinding listUserAnatomyBinding) {
        this.a = triStateButton;
        this.b = listUserAnatomyBinding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = com.clubhouse.core.ui.R.id.user;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.core.ui.databinding.FollowableListUserBinding bind(android.view.View r3) {
        /*
            int r0 = com.clubhouse.core.ui.R.id.follow_button
            android.view.View r1 = r3.findViewById(r0)
            com.clubhouse.android.core.ui.TriStateButton r1 = (com.clubhouse.android.core.ui.TriStateButton) r1
            if (r1 == 0) goto L_0x001e
            int r0 = com.clubhouse.core.ui.R.id.user
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x001e
            com.clubhouse.core.ui.databinding.ListUserAnatomyBinding r0 = com.clubhouse.core.ui.databinding.ListUserAnatomyBinding.bind(r2)
            com.clubhouse.core.ui.databinding.FollowableListUserBinding r2 = new com.clubhouse.core.ui.databinding.FollowableListUserBinding
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2.<init>(r3, r1, r0)
            return r2
        L_0x001e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.core.ui.databinding.FollowableListUserBinding.bind(android.view.View):com.clubhouse.core.ui.databinding.FollowableListUserBinding");
    }

    public static FollowableListUserBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.followable_list_user, (ViewGroup) null, false));
    }
}
