package h0.i.j;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {
    public static final int c = ViewConfiguration.getTapTimeout();
    public float[] Y1 = {0.0f, 0.0f};
    public float[] Z1 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int a2;
    public int b2;
    public float[] c2 = {0.0f, 0.0f};
    public final C0050a d;
    public float[] d2 = {0.0f, 0.0f};
    public float[] e2 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public final Interpolator q = new AccelerateInterpolator();
    public final View x;
    public Runnable y;

    /* renamed from: h0.i.j.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    public static class C0050a {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e = Long.MIN_VALUE;
        public long f = 0;
        public int g = 0;
        public int h = 0;
        public long i = -1;
        public float j;
        public int k;

        public final float a(long j2) {
            long j3 = this.e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.i;
            if (j4 < 0 || j2 < j4) {
                return a.b(((float) (j2 - j3)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (a.b(((float) (j2 - j4)) / ((float) this.k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    /* compiled from: AutoScrollHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.i2) {
                if (aVar.g2) {
                    aVar.g2 = false;
                    C0050a aVar2 = aVar.d;
                    Objects.requireNonNull(aVar2);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.e = currentAnimationTimeMillis;
                    aVar2.i = -1;
                    aVar2.f = currentAnimationTimeMillis;
                    aVar2.j = 0.5f;
                    aVar2.g = 0;
                    aVar2.h = 0;
                }
                C0050a aVar3 = a.this.d;
                if ((aVar3.i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.i + ((long) aVar3.k)) || !a.this.e()) {
                    a.this.i2 = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.h2) {
                    aVar4.h2 = false;
                    Objects.requireNonNull(aVar4);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.x.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - aVar3.f)) * ((a * 4.0f) + (-4.0f * a * a));
                    aVar3.g = (int) (aVar3.c * f);
                    int i = (int) (f * aVar3.d);
                    aVar3.h = i;
                    ((c) a.this).k2.scrollListBy(i);
                    View view = a.this.x;
                    AtomicInteger atomicInteger = q.a;
                    view.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0050a aVar = new C0050a();
        this.d = aVar;
        this.x = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.e2;
        float f3 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.d2;
        float f4 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.a2 = 1;
        float[] fArr3 = this.Z1;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.Y1;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.c2;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.b2 = c;
        aVar.a = 500;
        aVar.b = 500;
    }

    public static float b(float f, float f3, float f4) {
        return f > f4 ? f4 : f < f3 ? f3 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.Y1
            r0 = r0[r4]
            float[] r1 = r3.Z1
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.Interpolator r6 = r3.q
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.Interpolator r6 = r3.q
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.c2
            r0 = r0[r4]
            float[] r1 = r3.d2
            r1 = r1[r4]
            float[] r2 = r3.e2
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.j.a.a(int, float, float, float):float");
    }

    public final float c(float f, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.a2;
        if (i == 0 || i == 1) {
            if (f < f3) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f3);
                }
                return (!this.i2 || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f3);
        }
    }

    public final void d() {
        int i = 0;
        if (this.g2) {
            this.i2 = false;
            return;
        }
        C0050a aVar = this.d;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.e);
        int i4 = aVar.b;
        if (i3 > i4) {
            i = i4;
        } else if (i3 >= 0) {
            i = i3;
        }
        aVar.k = i;
        aVar.j = aVar.a(currentAnimationTimeMillis);
        aVar.i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r9 = this;
            h0.i.j.a$a r0 = r9.d
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            h0.i.j.c r4 = (h0.i.j.c) r4
            android.widget.ListView r4 = r4.k2
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.j.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.j2
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.h2 = r2
            r5.f2 = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.x
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.x
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            h0.i.j.a$a r7 = r5.d
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.i2
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            java.lang.Runnable r6 = r5.y
            if (r6 != 0) goto L_0x0061
            h0.i.j.a$b r6 = new h0.i.j.a$b
            r6.<init>()
            r5.y = r6
        L_0x0061:
            r5.i2 = r2
            r5.g2 = r2
            boolean r6 = r5.f2
            if (r6 != 0) goto L_0x0078
            int r6 = r5.b2
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.x
            java.lang.Runnable r0 = r5.y
            long r3 = (long) r6
            java.util.concurrent.atomic.AtomicInteger r6 = h0.i.i.q.a
            r7.postOnAnimationDelayed(r0, r3)
            goto L_0x007d
        L_0x0078:
            java.lang.Runnable r6 = r5.y
            r6.run()
        L_0x007d:
            r5.f2 = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.j.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
