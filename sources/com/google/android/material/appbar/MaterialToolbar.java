package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R;
import i0.h.a.b.c.m.b;
import i0.h.a.c.w.g;

public class MaterialToolbar extends Toolbar {
    public static final int I2 = R.style.Widget_MaterialComponents_Toolbar;
    public Integer J2;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.toolbarStyle
            int r4 = I2
            android.content.Context r8 = i0.h.a.c.a0.a.a.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L_0x002a
            r1 = -1
            int r0 = r9.getColor(r0, r1)
            r7.setNavigationIconTint(r0)
        L_0x002a:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 == 0) goto L_0x0038
            boolean r0 = r9 instanceof android.graphics.drawable.ColorDrawable
            if (r0 != 0) goto L_0x0038
            goto L_0x0064
        L_0x0038:
            i0.h.a.c.w.g r0 = new i0.h.a.c.w.g
            r0.<init>()
            if (r9 == 0) goto L_0x0045
            android.graphics.drawable.ColorDrawable r9 = (android.graphics.drawable.ColorDrawable) r9
            int r6 = r9.getColor()
        L_0x0045:
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            r0.t(r9)
            i0.h.a.c.w.g$b r9 = r0.q
            i0.h.a.c.n.a r1 = new i0.h.a.c.n.a
            r1.<init>(r8)
            r9.b = r1
            r0.B()
            java.util.concurrent.atomic.AtomicInteger r8 = h0.i.i.q.a
            float r8 = r7.getElevation()
            r0.s(r8)
            r7.setBackground(r0)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            b.m0(this, (g) background);
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        b.l0(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (!(drawable == null || (num = this.J2) == null)) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.J2 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
