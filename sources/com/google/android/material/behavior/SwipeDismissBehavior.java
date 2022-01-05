package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.i.i.g0.b;
import h0.i.i.q;
import h0.k.a.e;
import java.util.concurrent.atomic.AtomicInteger;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public e a;
    public b b;
    public boolean c;
    public int d = 2;
    public float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final e.c h = new a();

    public class a extends e.c {
        public int a;
        public int b = -1;

        public a() {
        }

        public int a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            AtomicInteger atomicInteger = q.a;
            boolean z = view.getLayoutDirection() == 1;
            int i5 = SwipeDismissBehavior.this.d;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.a - view.getWidth();
                    i4 = view.getWidth() + this.a;
                } else if (z) {
                    i3 = this.a;
                    width = view.getWidth();
                } else {
                    i3 = this.a - view.getWidth();
                    i4 = this.a;
                }
                return Math.min(Math.max(i3, i), i4);
            } else if (z) {
                i3 = this.a - view.getWidth();
                i4 = this.a;
                return Math.min(Math.max(i3, i), i4);
            } else {
                i3 = this.a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return Math.min(Math.max(i3, i), i4);
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int c(View view) {
            return view.getWidth();
        }

        public void e(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void f(int i) {
            b bVar = SwipeDismissBehavior.this.b;
            if (bVar != null) {
                bVar.b(i);
            }
        }

        public void g(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f) + ((float) this.a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.g) + ((float) this.a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.C(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.c.e)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003c
                java.util.concurrent.atomic.AtomicInteger r4 = h0.i.i.q.a
                int r4 = r8.getLayoutDirection()
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.d
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x002c
            L_0x0021:
                if (r5 != 0) goto L_0x0030
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x002a:
                if (r1 <= 0) goto L_0x002e
            L_0x002c:
                r9 = r2
                goto L_0x0058
            L_0x002e:
                r9 = r3
                goto L_0x0058
            L_0x0030:
                if (r5 != r2) goto L_0x002e
                if (r4 == 0) goto L_0x0037
                if (r1 <= 0) goto L_0x002e
                goto L_0x003b
            L_0x0037:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
            L_0x003b:
                goto L_0x002c
            L_0x003c:
                int r9 = r8.getLeft()
                int r0 = r7.a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.e
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002e
                goto L_0x002c
            L_0x0058:
                if (r9 == 0) goto L_0x0066
                int r9 = r8.getLeft()
                int r0 = r7.a
                if (r9 >= r0) goto L_0x0064
                int r0 = r0 - r10
                goto L_0x0069
            L_0x0064:
                int r0 = r0 + r10
                goto L_0x0069
            L_0x0066:
                int r0 = r7.a
                r2 = r3
            L_0x0069:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                h0.k.a.e r9 = r9.a
                int r10 = r8.getTop()
                boolean r9 = r9.t(r0, r10)
                if (r9 == 0) goto L_0x0084
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.concurrent.atomic.AtomicInteger r10 = h0.i.i.q.a
                r8.postOnAnimation(r9)
                goto L_0x008f
            L_0x0084:
                if (r2 == 0) goto L_0x008f
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.b
                if (r9 == 0) goto L_0x008f
                r9.a(r8)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        public boolean i(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.B(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i);
    }

    public class c implements Runnable {
        public final View c;
        public final boolean d;

        public c(View view, boolean z) {
            this.c = view;
            this.d = z;
        }

        public void run() {
            b bVar;
            e eVar = SwipeDismissBehavior.this.a;
            if (eVar != null && eVar.i(true)) {
                View view = this.c;
                AtomicInteger atomicInteger = q.a;
                view.postOnAnimation(this);
            } else if (this.d && (bVar = SwipeDismissBehavior.this.b) != null) {
                bVar.a(this.c);
            }
        }
    }

    public static float C(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar = this.a;
        if (eVar == null) {
            return false;
        }
        eVar.n(motionEvent);
        return true;
    }

    public boolean B(View view) {
        return true;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.q(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return this.a.u(motionEvent);
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        AtomicInteger atomicInteger = q.a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            q.m(1048576, v);
            q.j(v, 0);
            if (B(v)) {
                q.n(v, b.a.f, (CharSequence) null, new i0.h.a.c.d.a(this));
            }
        }
        return false;
    }
}
