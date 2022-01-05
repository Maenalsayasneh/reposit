package h0.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Fade */
public class c extends e0 {

    /* compiled from: Fade */
    public class a extends m {
        public final /* synthetic */ View a;

        public a(c cVar, View view) {
            this.a = view;
        }

        public void c(j jVar) {
            View view = this.a;
            c0 c0Var = w.a;
            c0Var.e(view, 1.0f);
            c0Var.a(this.a);
            jVar.y(this);
        }
    }

    /* compiled from: Fade */
    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            w.a.e(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.a;
            AtomicInteger atomicInteger = q.a;
            if (view.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, (Paint) null);
            }
        }
    }

    public c(int i) {
        if ((i & -4) == 0) {
            this.u2 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = (java.lang.Float) r4.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator O(android.view.ViewGroup r2, android.view.View r3, h0.b0.r r4, h0.b0.r r5) {
        /*
            r1 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.a
            java.lang.String r5 = "android:fade:transitionAlpha"
            java.lang.Object r4 = r4.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0014
            float r4 = r4.floatValue()
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r4
        L_0x001d:
            android.animation.Animator r2 = r1.Q(r3, r2, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.c.O(android.view.ViewGroup, android.view.View, h0.b0.r, h0.b0.r):android.animation.Animator");
    }

    public Animator P(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        w.a.c(view);
        Float f = (Float) rVar.a.get("android:fade:transitionAlpha");
        return Q(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    public final Animator Q(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        w.a.e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.b, new float[]{f2});
        ofFloat.addListener(new b(view));
        b(new a(this, view));
        return ofFloat;
    }

    public void i(r rVar) {
        M(rVar);
        rVar.a.put("android:fade:transitionAlpha", Float.valueOf(w.a(rVar.b)));
    }

    public c() {
    }
}
