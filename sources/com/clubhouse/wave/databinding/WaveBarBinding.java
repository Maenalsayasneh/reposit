package com.clubhouse.wave.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.wave.R;
import h0.e0.a;

public final class WaveBarBinding implements a {
    public final ConstraintLayout a;
    public final Button b;
    public final View c;
    public final TextView d;

    public WaveBarBinding(ConstraintLayout constraintLayout, Button button, View view, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = button;
        this.c = view;
        this.d = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.clubhouse.wave.R.id.divider;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.clubhouse.wave.databinding.WaveBarBinding bind(android.view.View r8) {
        /*
            int r0 = com.clubhouse.wave.R.id.decline_button
            android.view.View r1 = r8.findViewById(r0)
            r4 = r1
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L_0x0033
            int r0 = com.clubhouse.wave.R.id.divider
            android.view.View r5 = r8.findViewById(r0)
            if (r5 == 0) goto L_0x0033
            int r0 = com.clubhouse.wave.R.id.expand
            android.view.View r1 = r8.findViewById(r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = com.clubhouse.wave.R.id.waved_at
            android.view.View r1 = r8.findViewById(r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0033
            com.clubhouse.wave.databinding.WaveBarBinding r0 = new com.clubhouse.wave.databinding.WaveBarBinding
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.wave.databinding.WaveBarBinding.bind(android.view.View):com.clubhouse.wave.databinding.WaveBarBinding");
    }

    public static WaveBarBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.wave_bar, (ViewGroup) null, false));
    }
}
