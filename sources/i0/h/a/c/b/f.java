package i0.h.a.c.b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;

/* compiled from: HeaderBehavior */
public abstract class f<V extends View> extends h<V> {
    public Runnable c;
    public OverScroller d;
    public boolean e;
    public int f = -1;
    public int g;
    public int h = -1;
    public VelocityTracker i;

    /* compiled from: HeaderBehavior */
    public class a implements Runnable {
        public final CoordinatorLayout c;
        public final V d;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.c = coordinatorLayout;
            this.d = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.d != null && (overScroller = f.this.d) != null) {
                if (overScroller.computeScrollOffset()) {
                    f fVar = f.this;
                    fVar.G(this.c, this.d, fVar.d.getCurrY());
                    this.d.postOnAnimation(this);
                    return;
                }
                f fVar2 = f.this;
                CoordinatorLayout coordinatorLayout = this.c;
                V v = this.d;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) fVar2;
                Objects.requireNonNull(baseBehavior);
                AppBarLayout appBarLayout = (AppBarLayout) v;
                baseBehavior.O(coordinatorLayout, appBarLayout);
                if (appBarLayout.d2) {
                    appBarLayout.c(appBarLayout.d(baseBehavior.K(coordinatorLayout)));
                }
            }
        }
    }

    public f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r23.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x005e
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00d7
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005b
        L_0x001c:
            int r0 = r23.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = r8
            goto L_0x0025
        L_0x0024:
            r0 = r9
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.g = r0
            goto L_0x005b
        L_0x0036:
            int r0 = r6.f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.g
            int r3 = r3 - r0
            r6.g = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.F(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = r9
            goto L_0x00e5
        L_0x005e:
            android.view.VelocityTracker r0 = r6.i
            if (r0 == 0) goto L_0x00d7
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.i
            int r5 = r6.f
            float r0 = r0.getYVelocity(r5)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            int r10 = r5.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.c
            if (r11 == 0) goto L_0x0087
            r2.removeCallbacks(r11)
            r6.c = r3
        L_0x0087:
            android.widget.OverScroller r11 = r6.d
            if (r11 != 0) goto L_0x0096
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.d = r11
        L_0x0096:
            android.widget.OverScroller r11 = r6.d
            r12 = 0
            int r13 = r20.B()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00c0
            i0.h.a.c.b.f$a r0 = new i0.h.a.c.b.f$a
            r0.<init>(r1, r2)
            r6.c = r0
            java.util.concurrent.atomic.AtomicInteger r1 = h0.i.i.q.a
            r2.postOnAnimation(r0)
            goto L_0x00d5
        L_0x00c0:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.O(r1, r5)
            boolean r2 = r5.d2
            if (r2 == 0) goto L_0x00d5
            android.view.View r0 = r0.K(r1)
            boolean r0 = r5.d(r0)
            r5.c(r0)
        L_0x00d5:
            r0 = r8
            goto L_0x00d8
        L_0x00d7:
            r0 = r9
        L_0x00d8:
            r6.e = r9
            r6.f = r4
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x00e5
            r1.recycle()
            r6.i = r3
        L_0x00e5:
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x00ec
            r1.addMovement(r7)
        L_0x00ec:
            boolean r1 = r6.e
            if (r1 != 0) goto L_0x00f4
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r8 = r9
        L_0x00f4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.b.f.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int E();

    public final int F(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return H(coordinatorLayout, v, E() - i2, i3, i4);
    }

    public int G(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return H(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int H(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.h
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.h = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f
            if (r0 != r3) goto L_0x0025
            return r4
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002c
            return r4
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.h
            if (r1 <= r5) goto L_0x0040
            r7.g = r0
            return r2
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x00a5
            r7.f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference<android.view.View> r5 = r5.p
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0071
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0071
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = r4
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x007e
            boolean r8 = r8.q(r9, r0, r1)
            if (r8 == 0) goto L_0x007e
            r8 = r2
            goto L_0x007f
        L_0x007e:
            r8 = r4
        L_0x007f:
            r7.e = r8
            if (r8 == 0) goto L_0x00a5
            r7.g = r1
            int r8 = r10.getPointerId(r4)
            r7.f = r8
            android.view.VelocityTracker r8 = r7.i
            if (r8 != 0) goto L_0x0095
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.i = r8
        L_0x0095:
            android.widget.OverScroller r8 = r7.d
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x00a5
            android.widget.OverScroller r8 = r7.d
            r8.abortAnimation()
            return r2
        L_0x00a5:
            android.view.VelocityTracker r8 = r7.i
            if (r8 == 0) goto L_0x00ac
            r8.addMovement(r10)
        L_0x00ac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.b.f.j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
