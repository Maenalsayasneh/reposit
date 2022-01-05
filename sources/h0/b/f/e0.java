package h0.b.f;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import h0.b.e.i.p;

/* compiled from: ForwardingListener */
public abstract class e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public Runnable Y1;
    public boolean Z1;
    public int a2;
    public final int[] b2 = new int[2];
    public final float c;
    public final int d;
    public final int q;
    public final View x;
    public Runnable y;

    /* compiled from: ForwardingListener */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = e0.this.x.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            e0 e0Var = e0.this;
            e0Var.a();
            View view = e0Var.x;
            if (view.isEnabled() && !view.isLongClickable() && e0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                e0Var.Z1 = true;
            }
        }
    }

    public e0(View view) {
        this.x = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.d = tapTimeout;
        this.q = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.Y1;
        if (runnable != null) {
            this.x.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.y;
        if (runnable2 != null) {
            this.x.removeCallbacks(runnable2);
        }
    }

    public abstract p b();

    public abstract boolean c();

    public boolean d() {
        p b3 = b();
        if (b3 == null || !b3.b()) {
            return true;
        }
        b3.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.Z1
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.x
            h0.b.e.i.p r4 = r11.b()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.j()
            h0.b.f.c0 r4 = (h0.b.f.c0) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.b2
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.b2
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.a2
            boolean r3 = r4.b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = r1
            goto L_0x005b
        L_0x005a:
            r13 = r2
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = r1
            goto L_0x0062
        L_0x0061:
            r13 = r2
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.d()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = r2
            goto L_0x0128
        L_0x006e:
            r13 = r1
            goto L_0x0128
        L_0x0071:
            android.view.View r3 = r11.x
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x007c
        L_0x0079:
            r13 = r2
            goto L_0x0106
        L_0x007c:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d8
            if (r4 == r1) goto L_0x00d4
            r5 = 2
            if (r4 == r5) goto L_0x008a
            if (r4 == r0) goto L_0x00d4
            goto L_0x0079
        L_0x008a:
            int r0 = r11.a2
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0079
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.c
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c5
            r13 = r1
            goto L_0x00c6
        L_0x00c5:
            r13 = r2
        L_0x00c6:
            if (r13 != 0) goto L_0x0079
            r11.a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            r13 = r1
            goto L_0x0106
        L_0x00d4:
            r11.a()
            goto L_0x0079
        L_0x00d8:
            int r13 = r13.getPointerId(r2)
            r11.a2 = r13
            java.lang.Runnable r13 = r11.y
            if (r13 != 0) goto L_0x00e9
            h0.b.f.e0$a r13 = new h0.b.f.e0$a
            r13.<init>()
            r11.y = r13
        L_0x00e9:
            java.lang.Runnable r13 = r11.y
            int r0 = r11.d
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.Y1
            if (r13 != 0) goto L_0x00fc
            h0.b.f.e0$b r13 = new h0.b.f.e0$b
            r13.<init>()
            r11.Y1 = r13
        L_0x00fc:
            java.lang.Runnable r13 = r11.Y1
            int r0 = r11.q
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x0079
        L_0x0106:
            if (r13 == 0) goto L_0x0110
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x0110
            r13 = r1
            goto L_0x0111
        L_0x0110:
            r13 = r2
        L_0x0111:
            if (r13 == 0) goto L_0x0128
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.x
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0128:
            r11.Z1 = r13
            if (r13 != 0) goto L_0x0130
            if (r12 == 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r1 = r2
        L_0x0130:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.e0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.Z1 = false;
        this.a2 = -1;
        Runnable runnable = this.y;
        if (runnable != null) {
            this.x.removeCallbacks(runnable);
        }
    }
}
