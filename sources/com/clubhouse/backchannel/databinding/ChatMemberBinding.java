package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.e0.a;

public final class ChatMemberBinding implements a {
    public final View a;
    public final TextView b;
    public final AvatarView c;
    public final View d;
    public final ImageView e;
    public final TextView f;
    public final ImageView g;

    public ChatMemberBinding(View view, TextView textView, AvatarView avatarView, View view2, ImageView imageView, TextView textView2, ImageView imageView2) {
        this.a = view;
        this.b = textView;
        this.c = avatarView;
        this.d = view2;
        this.e = imageView;
        this.f = textView2;
        this.g = imageView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = com.clubhouse.backchannel.R.id.divider;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.backchannel.databinding.ChatMemberBinding bind(android.view.View r10) {
        /*
            int r0 = com.clubhouse.backchannel.R.id.admin
            android.view.View r1 = r10.findViewById(r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0047
            int r0 = com.clubhouse.backchannel.R.id.avatar
            android.view.View r1 = r10.findViewById(r0)
            r5 = r1
            com.clubhouse.android.shared.ui.AvatarView r5 = (com.clubhouse.android.shared.ui.AvatarView) r5
            if (r5 == 0) goto L_0x0047
            int r0 = com.clubhouse.backchannel.R.id.divider
            android.view.View r6 = r10.findViewById(r0)
            if (r6 == 0) goto L_0x0047
            int r0 = com.clubhouse.backchannel.R.id.end_badge
            android.view.View r1 = r10.findViewById(r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0047
            int r0 = com.clubhouse.backchannel.R.id.name
            android.view.View r1 = r10.findViewById(r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0047
            int r0 = com.clubhouse.backchannel.R.id.remove
            android.view.View r1 = r10.findViewById(r0)
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x0047
            com.clubhouse.backchannel.databinding.ChatMemberBinding r0 = new com.clubhouse.backchannel.databinding.ChatMemberBinding
            r2 = r0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0047:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.databinding.ChatMemberBinding.bind(android.view.View):com.clubhouse.backchannel.databinding.ChatMemberBinding");
    }
}
