package com.google.android.material.checkbox;

import android.content.res.ColorStateList;
import com.google.android.material.R;
import h0.b.f.g;
import i0.h.a.b.c.m.b;

public class MaterialCheckBox extends g {
    public static final int x = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[][] y = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList Y1;
    public boolean Z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.checkboxStyle
            int r4 = x
            android.content.Context r8 = i0.h.a.c.a0.a.a.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialCheckBox_buttonTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L_0x0029
            android.content.res.ColorStateList r8 = i0.h.a.b.c.m.b.M(r8, r9, r0)
            r7.setButtonTintList(r8)
        L_0x0029:
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.Z1 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.Y1 == null) {
            int[][] iArr = y;
            int[] iArr2 = new int[iArr.length];
            int L = b.L(this, R.attr.colorControlActivated);
            int L2 = b.L(this, R.attr.colorSurface);
            int L3 = b.L(this, R.attr.colorOnSurface);
            iArr2[0] = b.b0(L2, L, 1.0f);
            iArr2[1] = b.b0(L2, L3, 0.54f);
            iArr2[2] = b.b0(L2, L3, 0.38f);
            iArr2[3] = b.b0(L2, L3, 0.38f);
            this.Y1 = new ColorStateList(iArr, iArr2);
        }
        return this.Y1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Z1 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.Z1 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
