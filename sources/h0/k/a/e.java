package h0.k.a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import h0.i.i.q;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewDragHelper */
public class e {
    public static final Interpolator a = new a();
    public int b;
    public int c;
    public int d = -1;
    public float[] e;
    public float[] f;
    public float[] g;
    public float[] h;
    public int[] i;
    public int[] j;
    public int[] k;
    public int l;
    public VelocityTracker m;
    public float n;
    public float o;
    public int p;
    public final int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public final Runnable w = new b();

    /* compiled from: ViewDragHelper */
    public class a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            e.this.s(0);
        }
    }

    /* compiled from: ViewDragHelper */
    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view, int i) {
        }

        public abstract void f(int i);

        public abstract void g(View view, int i, int i2, int i3, int i4);

        public abstract void h(View view, float f, float f2);

        public abstract boolean i(View view, int i);
    }

    public e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.q = i2;
            this.p = i2;
            this.c = viewConfiguration.getScaledTouchSlop();
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, a);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public void a() {
        this.d = -1;
        float[] fArr = this.e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.d = i2;
            this.s.e(view, i2);
            s(1);
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        P0.append(this.v);
        P0.append(")");
        throw new IllegalArgumentException(P0.toString());
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.i[i2] & i3) != i3 || (0 & i3) == 0 || (this.k[i2] & i3) == i3 || (this.j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.c;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.s);
        }
        if ((this.j[i2] & i3) != 0 || abs <= ((float) this.c)) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.c(view) > 0;
        boolean z2 = this.s.d(view) > 0;
        if (z && z2) {
            float f4 = f3 * f3;
            int i2 = this.c;
            if (f4 + (f2 * f2) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f2) > ((float) this.c)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f3) <= ((float) this.c)) {
            return false;
        } else {
            return true;
        }
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 > 0.0f ? f4 : -f4;
        }
        return f2;
    }

    public final int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 > 0 ? i4 : -i4;
        }
        return i2;
    }

    public final void g(int i2) {
        float[] fArr = this.e;
        if (fArr != null) {
            int i3 = this.l;
            boolean z = true;
            int i4 = 1 << i2;
            if ((i4 & i3) == 0) {
                z = false;
            }
            if (z) {
                fArr[i2] = 0.0f;
                this.f[i2] = 0.0f;
                this.g[i2] = 0.0f;
                this.h[i2] = 0.0f;
                this.i[i2] = 0;
                this.j[i2] = 0;
                this.k[i2] = 0;
                this.l = (~i4) & i3;
            }
        }
    }

    public final int h(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    public boolean i(boolean z) {
        if (this.b == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                AtomicInteger atomicInteger = q.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                AtomicInteger atomicInteger2 = q.a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.g(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    s(0);
                }
            }
        }
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public final void j(float f2, float f3) {
        this.u = true;
        this.s.h(this.t, f2, f3);
        this.u = false;
        if (this.b == 1) {
            s(0);
        }
    }

    public View k(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            Objects.requireNonNull(this.s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            s(0);
            return false;
        }
        View view = this.t;
        int f6 = f(i4, (int) this.o, (int) this.n);
        int f7 = f(i5, (int) this.o, (int) this.n);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f2 = (float) abs3;
            f3 = (float) i8;
        } else {
            f2 = (float) abs;
            f3 = (float) i9;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        int h2 = h(i6, f6, this.s.c(view));
        float h3 = ((float) h(i7, f7, this.s.d(view))) * (f5 / f4);
        this.r.startScroll(left, top, i6, i7, (int) (h3 + (((float) h2) * f8)));
        s(2);
        return true;
    }

    public final boolean m(int i2) {
        if ((this.l & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void n(MotionEvent motionEvent) {
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent2);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent2.getPointerId(0);
            View k2 = k((int) x, (int) y);
            q(x, y, pointerId);
            v(k2, pointerId);
            if ((this.i[pointerId] & 0) != 0) {
                Objects.requireNonNull(this.s);
            }
        } else if (actionMasked == 1) {
            if (this.b == 1) {
                o();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.b == 1) {
                    j(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent2.getPointerId(actionIndex);
                float x2 = motionEvent2.getX(actionIndex);
                float y2 = motionEvent2.getY(actionIndex);
                q(x2, y2, pointerId2);
                if (this.b == 0) {
                    v(k((int) x2, (int) y2), pointerId2);
                    if ((this.i[pointerId2] & 0) != 0) {
                        Objects.requireNonNull(this.s);
                        return;
                    }
                    return;
                }
                int i4 = (int) x2;
                int i5 = (int) y2;
                View view = this.t;
                if (view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    v(this.t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent2.getPointerId(actionIndex);
                if (this.b == 1 && pointerId3 == this.d) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent2.getPointerId(i3);
                        if (pointerId4 != this.d) {
                            View k3 = k((int) motionEvent2.getX(i3), (int) motionEvent2.getY(i3));
                            View view2 = this.t;
                            if (k3 == view2 && v(view2, pointerId4)) {
                                i2 = this.d;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        o();
                    }
                }
                g(pointerId3);
            }
        } else if (this.b != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent2.getPointerId(i3);
                if (m(pointerId5)) {
                    float x3 = motionEvent2.getX(i3);
                    float y3 = motionEvent2.getY(i3);
                    float f2 = x3 - this.e[pointerId5];
                    float f3 = y3 - this.f[pointerId5];
                    p(f2, f3, pointerId5);
                    if (this.b != 1) {
                        View k4 = k((int) x3, (int) y3);
                        if (d(k4, f2, f3) && v(k4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            r(motionEvent);
        } else if (m(this.d)) {
            int findPointerIndex = motionEvent2.findPointerIndex(this.d);
            float x4 = motionEvent2.getX(findPointerIndex);
            float y4 = motionEvent2.getY(findPointerIndex);
            float[] fArr = this.g;
            int i6 = this.d;
            int i7 = (int) (x4 - fArr[i6]);
            int i8 = (int) (y4 - this.h[i6]);
            int left = this.t.getLeft() + i7;
            int top = this.t.getTop() + i8;
            int left2 = this.t.getLeft();
            int top2 = this.t.getTop();
            if (i7 != 0) {
                left = this.s.a(this.t, left, i7);
                AtomicInteger atomicInteger = q.a;
                this.t.offsetLeftAndRight(left - left2);
            }
            int i9 = left;
            if (i8 != 0) {
                top = this.s.b(this.t, top, i8);
                AtomicInteger atomicInteger2 = q.a;
                this.t.offsetTopAndBottom(top - top2);
            }
            int i10 = top;
            if (!(i7 == 0 && i8 == 0)) {
                this.s.g(this.t, i9, i10, i9 - left2, i10 - top2);
            }
            r(motionEvent);
        }
    }

    public final void o() {
        this.m.computeCurrentVelocity(1000, this.n);
        j(e(this.m.getXVelocity(this.d), this.o, this.n), e(this.m.getYVelocity(this.d), this.o, this.n));
    }

    public final void p(float f2, float f3, int i2) {
        int i3 = 1;
        if (!c(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.j;
            iArr[i2] = iArr[i2] | i3;
            Objects.requireNonNull(this.s);
        }
    }

    public final void q(float f2, float f3, int i2) {
        float[] fArr = this.e;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = fArr5;
            this.i = iArr;
            this.j = iArr2;
            this.k = iArr3;
        }
        float[] fArr9 = this.e;
        this.g[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f;
        this.h[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.i;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.v.getLeft() + this.p) {
            i3 = 1;
        }
        if (i6 < this.v.getTop() + this.p) {
            i3 |= 4;
        }
        if (i5 > this.v.getRight() - this.p) {
            i3 |= 2;
        }
        if (i6 > this.v.getBottom() - this.p) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.l |= 1 << i2;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.g[pointerId] = x;
                this.h[pointerId] = y;
            }
        }
    }

    public void s(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.b != i2) {
            this.b = i2;
            this.s.f(i2);
            if (this.b == 0) {
                this.t = null;
            }
        }
    }

    public boolean t(int i2, int i3) {
        if (this.u) {
            return l(i2, i3, (int) this.m.getXVelocity(this.d), (int) this.m.getYVelocity(this.d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.m
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.m = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.m
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0104
            if (r2 == r5) goto L_0x00ff
            if (r2 == r4) goto L_0x006f
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r4 = 6
            if (r2 == r4) goto L_0x0034
            goto L_0x0102
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.g(r1)
            goto L_0x0102
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.q(r7, r1, r2)
            int r3 = r0.b
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.i
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0102
            h0.k.a.e$c r1 = r0.s
            java.util.Objects.requireNonNull(r1)
            goto L_0x0102
        L_0x005e:
            if (r3 != r4) goto L_0x0102
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.k(r3, r1)
            android.view.View r3 = r0.t
            if (r1 != r3) goto L_0x0102
            r0.v(r1, r2)
            goto L_0x0102
        L_0x006f:
            float[] r2 = r0.e
            if (r2 == 0) goto L_0x0102
            float[] r2 = r0.f
            if (r2 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = r6
        L_0x007e:
            if (r3 >= r2) goto L_0x00fb
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.k(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r5
            goto L_0x00b1
        L_0x00b0:
            r8 = r6
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            h0.k.a.e$c r14 = r0.s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            h0.k.a.e$c r6 = r0.s
            int r6 = r6.b(r7, r15, r14)
            h0.k.a.e$c r14 = r0.s
            int r14 = r14.c(r7)
            h0.k.a.e$c r15 = r0.s
            int r15 = r15.d(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fb
            if (r15 <= 0) goto L_0x00e6
            if (r6 != r13) goto L_0x00e6
            goto L_0x00fb
        L_0x00e6:
            r0.p(r9, r10, r4)
            int r6 = r0.b
            if (r6 != r5) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.v(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007e
        L_0x00fb:
            r16.r(r17)
            goto L_0x0102
        L_0x00ff:
            r16.a()
        L_0x0102:
            r2 = 0
            goto L_0x0132
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.q(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.k(r2, r3)
            android.view.View r3 = r0.t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.b
            if (r3 != r4) goto L_0x0125
            r0.v(r2, r1)
        L_0x0125:
            int[] r2 = r0.i
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0132
            h0.k.a.e$c r1 = r0.s
            java.util.Objects.requireNonNull(r1)
        L_0x0132:
            int r1 = r0.b
            if (r1 != r5) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r5 = r2
        L_0x0138:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.k.a.e.u(android.view.MotionEvent):boolean");
    }

    public boolean v(View view, int i2) {
        if (view == this.t && this.d == i2) {
            return true;
        }
        if (view == null || !this.s.i(view, i2)) {
            return false;
        }
        this.d = i2;
        b(view, i2);
        return true;
    }
}
