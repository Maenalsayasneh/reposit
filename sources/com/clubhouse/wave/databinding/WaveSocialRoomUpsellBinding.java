package com.clubhouse.wave.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.wave.R;
import h0.e0.a;

public final class WaveSocialRoomUpsellBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final Button c;
    public final View d;
    public final ConstraintLayout e;

    public WaveSocialRoomUpsellBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, Button button, View view, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = button;
        this.d = view;
        this.e = constraintLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = com.clubhouse.wave.R.id.tooltip;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.wave.databinding.WaveSocialRoomUpsellBinding bind(android.view.View r9) {
        /*
            int r0 = com.clubhouse.wave.R.id.card
            android.view.View r1 = r9.findViewById(r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0034
            int r0 = com.clubhouse.wave.R.id.message
            android.view.View r1 = r9.findViewById(r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0034
            int r0 = com.clubhouse.wave.R.id.social_room
            android.view.View r1 = r9.findViewById(r0)
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            if (r6 == 0) goto L_0x0034
            int r0 = com.clubhouse.wave.R.id.tooltip
            android.view.View r7 = r9.findViewById(r0)
            if (r7 == 0) goto L_0x0034
            r8 = r9
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            com.clubhouse.wave.databinding.WaveSocialRoomUpsellBinding r9 = new com.clubhouse.wave.databinding.WaveSocialRoomUpsellBinding
            r2 = r9
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0034:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.wave.databinding.WaveSocialRoomUpsellBinding.bind(android.view.View):com.clubhouse.wave.databinding.WaveSocialRoomUpsellBinding");
    }

    public static WaveSocialRoomUpsellBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.wave_social_room_upsell, (ViewGroup) null, false));
    }
}
