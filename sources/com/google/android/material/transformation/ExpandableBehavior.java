package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.i.i.q;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ i0.h.a.c.o.a q;

        public a(View view, int i, i0.h.a.c.o.a aVar) {
            this.c = view;
            this.d = i;
            this.q = aVar;
        }

        public boolean onPreDraw() {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.d) {
                i0.h.a.c.o.a aVar = this.q;
                expandableBehavior.C((View) aVar, this.c, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public final boolean B(boolean z) {
        if (z) {
            int i = this.a;
            return i == 0 || i == 2;
        } else if (this.a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public abstract boolean C(View view, View view2, boolean z, boolean z2);

    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        i0.h.a.c.o.a aVar = (i0.h.a.c.o.a) view2;
        if (!B(aVar.a())) {
            return false;
        }
        this.a = aVar.a() ? 1 : 2;
        return C((View) aVar, view, aVar.a(), true);
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        i0.h.a.c.o.a aVar;
        AtomicInteger atomicInteger = q.a;
        if (!view.isLaidOut()) {
            List<View> f = coordinatorLayout.f(view);
            int size = f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = f.get(i2);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (i0.h.a.c.o.a) view2;
                    break;
                }
                i2++;
            }
            if (aVar != null && B(aVar.a())) {
                int i3 = aVar.a() ? 1 : 2;
                this.a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, aVar));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
