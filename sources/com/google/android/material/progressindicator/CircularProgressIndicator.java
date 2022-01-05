package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R;
import i0.h.a.c.r.b;
import i0.h.a.c.r.c;
import i0.h.a.c.r.d;
import i0.h.a.c.r.g;
import i0.h.a.c.r.h;
import i0.h.a.c.r.i;
import i0.h.a.c.r.o;

public final class CircularProgressIndicator extends b<h> {
    public static final int g2 = R.style.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, g2);
        Context context2 = getContext();
        h hVar = (h) this.d;
        setIndeterminateDrawable(new o(context2, hVar, new d(hVar), new g(hVar)));
        Context context3 = getContext();
        h hVar2 = (h) this.d;
        setProgressDrawable(new i(context3, hVar2, new d(hVar2)));
    }

    public c b(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((h) this.d).i;
    }

    public int getIndicatorInset() {
        return ((h) this.d).h;
    }

    public int getIndicatorSize() {
        return ((h) this.d).g;
    }

    public void setIndicatorDirection(int i) {
        ((h) this.d).i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.d;
        if (((h) s).h != i) {
            ((h) s).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        S s = this.d;
        if (((h) s).g != i) {
            ((h) s).g = i;
            ((h) s).a();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((h) this.d).a();
    }
}
