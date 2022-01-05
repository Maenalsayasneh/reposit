package com.google.android.material.switchmaterial;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import i0.h.a.b.c.m.b;
import i0.h.a.c.n.a;

public class SwitchMaterial extends SwitchCompat {
    public static final int I2 = R.style.Widget_MaterialComponents_CompoundButton_Switch;
    public static final int[][] J2 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public final a K2;
    public ColorStateList L2;
    public ColorStateList M2;
    public boolean N2;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = com.google.android.material.R.attr.switchStyle
            int r4 = I2
            android.content.Context r7 = i0.h.a.c.a0.a.a.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            android.content.Context r0 = r6.getContext()
            i0.h.a.c.n.a r7 = new i0.h.a.c.n.a
            r7.<init>(r0)
            r6.K2 = r7
            int[] r2 = com.google.android.material.R.styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r0, r7)
            r6.N2 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.L2 == null) {
            int L = b.L(this, R.attr.colorSurface);
            int L3 = b.L(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.K2.a) {
                dimension += b.Q(this);
            }
            int a = this.K2.a(L, dimension);
            int[][] iArr = J2;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = b.b0(L, L3, 1.0f);
            iArr2[1] = a;
            iArr2[2] = b.b0(L, L3, 0.38f);
            iArr2[3] = a;
            this.L2 = new ColorStateList(iArr, iArr2);
        }
        return this.L2;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.M2 == null) {
            int[][] iArr = J2;
            int[] iArr2 = new int[iArr.length];
            int L = b.L(this, R.attr.colorSurface);
            int L3 = b.L(this, R.attr.colorControlActivated);
            int L4 = b.L(this, R.attr.colorOnSurface);
            iArr2[0] = b.b0(L, L3, 0.54f);
            iArr2[1] = b.b0(L, L4, 0.32f);
            iArr2[2] = b.b0(L, L3, 0.12f);
            iArr2[3] = b.b0(L, L4, 0.12f);
            this.M2 = new ColorStateList(iArr, iArr2);
        }
        return this.M2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.N2 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.N2 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.N2 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }
}
