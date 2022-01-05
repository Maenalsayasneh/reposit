package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R;
import h0.i.i.q;
import i0.h.a.c.r.b;
import i0.h.a.c.r.c;
import i0.h.a.c.r.i;
import i0.h.a.c.r.o;
import i0.h.a.c.r.p;
import i0.h.a.c.r.r;
import i0.h.a.c.r.t;
import i0.h.a.c.r.u;
import java.util.concurrent.atomic.AtomicInteger;

public final class LinearProgressIndicator extends b<u> {
    public static final int g2 = R.style.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, g2);
        Context context2 = getContext();
        u uVar = (u) this.d;
        setIndeterminateDrawable(new o(context2, uVar, new p(uVar), uVar.g == 0 ? new r(uVar) : new t(context2, uVar)));
        Context context3 = getContext();
        u uVar2 = (u) this.d;
        setProgressDrawable(new i(context3, uVar2, new p(uVar2)));
    }

    public c b(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public void c(int i, boolean z) {
        S s = this.d;
        if (s == null || ((u) s).g != 0 || !isIndeterminate()) {
            super.c(i, z);
        }
    }

    public int getIndeterminateAnimationType() {
        return ((u) this.d).g;
    }

    public int getIndicatorDirection() {
        return ((u) this.d).h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.d;
        u uVar = (u) s;
        boolean z2 = true;
        if (((u) s).h != 1) {
            AtomicInteger atomicInteger = q.a;
            if (!((getLayoutDirection() == 1 && ((u) this.d).h == 2) || (getLayoutDirection() == 0 && ((u) this.d).h == 3))) {
                z2 = false;
            }
        }
        uVar.i = z2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        o indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        i progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        if (((u) this.d).g != i) {
            if (!d() || !isIndeterminate()) {
                u uVar = (u) this.d;
                uVar.g = i;
                uVar.a();
                if (i == 0) {
                    o indeterminateDrawable = getIndeterminateDrawable();
                    r rVar = new r((u) this.d);
                    indeterminateDrawable.f2 = rVar;
                    rVar.a = indeterminateDrawable;
                } else {
                    o indeterminateDrawable2 = getIndeterminateDrawable();
                    t tVar = new t(getContext(), (u) this.d);
                    indeterminateDrawable2.f2 = tVar;
                    tVar.a = indeterminateDrawable2;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((u) this.d).a();
    }

    public void setIndicatorDirection(int i) {
        S s = this.d;
        ((u) s).h = i;
        u uVar = (u) s;
        boolean z = true;
        if (i != 1) {
            AtomicInteger atomicInteger = q.a;
            if (!((getLayoutDirection() == 1 && ((u) this.d).h == 2) || (getLayoutDirection() == 0 && i == 3))) {
                z = false;
            }
        }
        uVar.i = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((u) this.d).a();
        invalidate();
    }
}
