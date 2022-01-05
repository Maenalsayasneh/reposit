package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import h0.i.i.g0.b;
import h0.i.i.q;
import h0.k.a.e;
import i0.h.a.c.q.l;
import i0.h.a.c.q.n;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int a = R.style.Widget_Design_BottomSheet_Modal;
    public e A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public WeakReference<V> H;
    public WeakReference<View> I;
    public final ArrayList<c> J = new ArrayList<>();
    public VelocityTracker K;
    public int L;
    public int M;
    public boolean N;
    public Map<View, Integer> O;
    public int P = -1;
    public final e.c Q = new b();
    public int b = 0;
    public boolean c = true;
    public float d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public g j;
    public int k;
    public boolean l;
    public k m;
    public boolean n;
    public BottomSheetBehavior<V>.defpackage.d o = null;
    public ValueAnimator p;
    public int q;
    public int r;
    public int s;
    public float t = 0.5f;
    public int u;
    public float v = -1.0f;
    public boolean w;
    public boolean x;
    public boolean y = true;
    public int z = 4;

    public class a implements Runnable {
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;

        public a(View view, int i) {
            this.c = view;
            this.d = i;
        }

        public void run() {
            BottomSheetBehavior.this.P(this.c, this.d);
        }
    }

    public class b extends e.c {
        public b() {
        }

        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        public int b(View view, int i, int i2) {
            int I = BottomSheetBehavior.this.I();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return g0.a.b.b.a.o(i, I, bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u);
        }

        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.w) {
                return bottomSheetBehavior.G;
            }
            return bottomSheetBehavior.u;
        }

        public void f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.y) {
                    bottomSheetBehavior.O(1);
                }
            }
        }

        public void g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.F(i2);
        }

        public void h(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 < 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.c) {
                    i = bottomSheetBehavior.r;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    int i4 = bottomSheetBehavior2.s;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                        BottomSheetBehavior.this.S(view, i3, i, true);
                    }
                    i = bottomSheetBehavior2.q;
                }
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.w && bottomSheetBehavior3.R(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (!(top2 > (bottomSheetBehavior4.I() + bottomSheetBehavior4.G) / 2)) {
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (bottomSheetBehavior5.c) {
                                i = bottomSheetBehavior5.r;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.q) < Math.abs(view.getTop() - BottomSheetBehavior.this.s)) {
                                i = BottomSheetBehavior.this.q;
                            } else {
                                i2 = BottomSheetBehavior.this.s;
                                i3 = 6;
                                BottomSheetBehavior.this.S(view, i3, i, true);
                            }
                        }
                    }
                    i = BottomSheetBehavior.this.G;
                    i3 = 5;
                    BottomSheetBehavior.this.S(view, i3, i, true);
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior6.c) {
                        int i5 = bottomSheetBehavior6.s;
                        if (top3 < i5) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior6.u)) {
                                i = BottomSheetBehavior.this.q;
                            } else {
                                i2 = BottomSheetBehavior.this.s;
                            }
                        } else if (Math.abs(top3 - i5) < Math.abs(top3 - BottomSheetBehavior.this.u)) {
                            i2 = BottomSheetBehavior.this.s;
                        } else {
                            i = BottomSheetBehavior.this.u;
                            BottomSheetBehavior.this.S(view, i3, i, true);
                        }
                        i3 = 6;
                        BottomSheetBehavior.this.S(view, i3, i, true);
                    } else if (Math.abs(top3 - bottomSheetBehavior6.r) < Math.abs(top3 - BottomSheetBehavior.this.u)) {
                        i = BottomSheetBehavior.this.r;
                    } else {
                        i = BottomSheetBehavior.this.u;
                        BottomSheetBehavior.this.S(view, i3, i, true);
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior7.c) {
                        i = bottomSheetBehavior7.u;
                    } else {
                        int top4 = view.getTop();
                        if (Math.abs(top4 - BottomSheetBehavior.this.s) < Math.abs(top4 - BottomSheetBehavior.this.u)) {
                            i2 = BottomSheetBehavior.this.s;
                            i3 = 6;
                        } else {
                            i = BottomSheetBehavior.this.u;
                        }
                    }
                    BottomSheetBehavior.this.S(view, i3, i, true);
                }
            }
            i3 = 3;
            BottomSheetBehavior.this.S(view, i3, i, true);
        }

        public boolean i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.z;
            if (i2 == 1 || bottomSheetBehavior.N) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.L == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.I;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.H;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    public static abstract class c {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    public class d implements Runnable {
        public final View c;
        public boolean d;
        public int q;

        public d(View view, int i) {
            this.c = view;
            this.q = i;
        }

        public void run() {
            e eVar = BottomSheetBehavior.this.A;
            if (eVar == null || !eVar.i(true)) {
                BottomSheetBehavior.this.O(this.q);
            } else {
                View view = this.c;
                AtomicInteger atomicInteger = q.a;
                view.postOnAnimation(this);
            }
            this.d = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public static <V extends View> BottomSheetBehavior<V> H(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public boolean A(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.z == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.A;
        if (eVar != null) {
            eVar.n(motionEvent);
        }
        if (actionMasked == 0) {
            this.L = -1;
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.K = null;
            }
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (this.A != null && actionMasked == 2 && !this.B) {
            float abs = Math.abs(((float) this.M) - motionEvent.getY());
            e eVar2 = this.A;
            if (abs > ((float) eVar2.c)) {
                eVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.B;
    }

    public void B(c cVar) {
        if (!this.J.contains(cVar)) {
            this.J.add(cVar);
        }
    }

    public final void C() {
        int D2 = D();
        if (this.c) {
            this.u = Math.max(this.G - D2, this.r);
        } else {
            this.u = this.G - D2;
        }
    }

    public final int D() {
        int i2;
        if (this.f) {
            return Math.min(Math.max(this.g, this.G - ((this.F * 9) / 16)), this.E);
        }
        if (this.l || (i2 = this.k) <= 0) {
            return this.e;
        }
        return Math.max(this.e, i2 + this.h);
    }

    public final void E(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.i) {
            this.m = k.b(context, attributeSet, R.attr.bottomSheetStyle, a, new i0.h.a.c.w.a((float) 0)).a();
            g gVar = new g(this.m);
            this.j = gVar;
            gVar.q.b = new i0.h.a.c.n.a(context);
            gVar.B();
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.j.setTint(typedValue.data);
                return;
            }
            this.j.t(colorStateList);
        }
    }

    public void F(int i2) {
        float f2;
        float f3;
        View view = (View) this.H.get();
        if (view != null && !this.J.isEmpty()) {
            int i3 = this.u;
            if (i2 > i3 || i3 == I()) {
                int i4 = this.u;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.G - i4);
            } else {
                int i5 = this.u;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - I());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.J.size(); i6++) {
                this.J.get(i6).onSlide(view, f4);
            }
        }
    }

    public View G(View view) {
        AtomicInteger atomicInteger = q.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View G2 = G(viewGroup.getChildAt(i2));
            if (G2 != null) {
                return G2;
            }
        }
        return null;
    }

    public int I() {
        return this.c ? this.r : this.q;
    }

    public final void J(V v2, b.a aVar, int i2) {
        q.n(v2, aVar, (CharSequence) null, new i0.h.a.c.g.c(this, i2));
    }

    public void K(boolean z2) {
        if (this.c != z2) {
            this.c = z2;
            if (this.H != null) {
                C();
            }
            O((!this.c || this.z != 6) ? this.z : 3);
            T();
        }
    }

    public void L(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            if (!z2 && this.z == 5) {
                N(4);
            }
            T();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f
            if (r4 != 0) goto L_0x0015
            r3.f = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f
            if (r1 != 0) goto L_0x0017
            int r1 = r3.e
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x001f
        L_0x0017:
            r3.f = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.W(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.M(int):void");
    }

    public void N(int i2) {
        if (i2 != this.z) {
            if (this.H != null) {
                Q(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.w && i2 == 5)) {
                this.z = i2;
            }
        }
    }

    public void O(int i2) {
        View view;
        if (this.z != i2) {
            this.z = i2;
            WeakReference<V> weakReference = this.H;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 3) {
                    V(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    V(false);
                }
                U(i2);
                for (int i3 = 0; i3 < this.J.size(); i3++) {
                    this.J.get(i3).onStateChanged(view, i2);
                }
                T();
            }
        }
    }

    public void P(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.u;
        } else if (i2 == 6) {
            int i5 = this.s;
            if (!this.c || i5 > (i4 = this.r)) {
                i3 = i5;
            } else {
                i2 = 3;
                i3 = i4;
            }
        } else if (i2 == 3) {
            i3 = I();
        } else if (!this.w || i2 != 5) {
            throw new IllegalArgumentException(i0.d.a.a.a.e0("Illegal state argument: ", i2));
        } else {
            i3 = this.G;
        }
        S(view, i2, i3, false);
    }

    public final void Q(int i2) {
        View view = (View) this.H.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                AtomicInteger atomicInteger = q.a;
                if (view.isAttachedToWindow()) {
                    view.post(new a(view, i2));
                    return;
                }
            }
            P(view, i2);
        }
    }

    public boolean R(View view, float f2) {
        if (this.x) {
            return true;
        }
        if (view.getTop() < this.u) {
            return false;
        }
        if (Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.u)) / ((float) D()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0.t(r5.getLeft(), r7) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            h0.k.a.e r0 = r4.A
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r8 == 0) goto L_0x0013
            int r8 = r5.getLeft()
            boolean r7 = r0.t(r8, r7)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0013:
            int r8 = r5.getLeft()
            r0.t = r5
            r3 = -1
            r0.d = r3
            boolean r7 = r0.l(r8, r7, r2, r2)
            if (r7 != 0) goto L_0x002d
            int r8 = r0.b
            if (r8 != 0) goto L_0x002d
            android.view.View r8 = r0.t
            if (r8 == 0) goto L_0x002d
            r8 = 0
            r0.t = r8
        L_0x002d:
            if (r7 == 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0059
            r7 = 2
            r4.O(r7)
            r4.U(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$d r7 = r4.o
            if (r7 != 0) goto L_0x0044
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            r7.<init>(r5, r6)
            r4.o = r7
        L_0x0044:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$d r7 = r4.o
            boolean r8 = r7.d
            if (r8 != 0) goto L_0x0056
            r7.q = r6
            java.util.concurrent.atomic.AtomicInteger r6 = h0.i.i.q.a
            r5.postOnAnimation(r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$d r5 = r4.o
            r5.d = r1
            goto L_0x005c
        L_0x0056:
            r7.q = r6
            goto L_0x005c
        L_0x0059:
            r4.O(r6)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.S(android.view.View, int, int, boolean):void");
    }

    public final void T() {
        View view;
        WeakReference<V> weakReference = this.H;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            q.m(524288, view);
            q.j(view, 0);
            q.m(262144, view);
            q.j(view, 0);
            q.m(1048576, view);
            q.j(view, 0);
            int i2 = this.P;
            if (i2 != -1) {
                q.m(i2, view);
                q.j(view, 0);
            }
            int i3 = 6;
            if (this.z != 6) {
                this.P = q.a(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new i0.h.a.c.g.c(this, 6));
            }
            if (this.w && this.z != 5) {
                J(view, b.a.f, 5);
            }
            int i4 = this.z;
            if (i4 == 3) {
                if (this.c) {
                    i3 = 4;
                }
                J(view, b.a.e, i3);
            } else if (i4 == 4) {
                if (this.c) {
                    i3 = 3;
                }
                J(view, b.a.d, i3);
            } else if (i4 == 6) {
                J(view, b.a.e, 4);
                J(view, b.a.d, 3);
            }
        }
    }

    public final void U(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.n != z2) {
                this.n = z2;
                if (this.j != null && (valueAnimator = this.p) != null) {
                    if (valueAnimator.isRunning()) {
                        this.p.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.p.setFloatValues(new float[]{1.0f - f2, f2});
                    this.p.start();
                }
            }
        }
    }

    public final void V(boolean z2) {
        WeakReference<V> weakReference = this.H;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.O == null) {
                        this.O = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.H.get() && z2) {
                        this.O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.O = null;
                }
            }
        }
    }

    public final void W(boolean z2) {
        View view;
        if (this.H != null) {
            C();
            if (this.z == 4 && (view = (View) this.H.get()) != null) {
                if (z2) {
                    Q(this.z);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void f(CoordinatorLayout.f fVar) {
        this.H = null;
        this.A = null;
    }

    public void i() {
        this.H = null;
        this.A = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r9.y
            if (r0 != 0) goto L_0x000e
            goto L_0x00d8
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0021
            r9.L = r4
            android.view.VelocityTracker r5 = r9.K
            if (r5 == 0) goto L_0x0021
            r5.recycle()
            r9.K = r3
        L_0x0021:
            android.view.VelocityTracker r5 = r9.K
            if (r5 != 0) goto L_0x002b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.K = r5
        L_0x002b:
            android.view.VelocityTracker r5 = r9.K
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0044
            if (r0 == r2) goto L_0x0039
            r11 = 3
            if (r0 == r11) goto L_0x0039
            goto L_0x0087
        L_0x0039:
            r9.N = r1
            r9.L = r4
            boolean r11 = r9.B
            if (r11 == 0) goto L_0x0087
            r9.B = r1
            return r1
        L_0x0044:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.M = r7
            int r7 = r9.z
            if (r7 == r5) goto L_0x0076
            java.lang.ref.WeakReference<android.view.View> r7 = r9.I
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0076
            int r8 = r9.M
            boolean r7 = r10.q(r7, r6, r8)
            if (r7 == 0) goto L_0x0076
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.L = r7
            r9.N = r2
        L_0x0076:
            int r7 = r9.L
            if (r7 != r4) goto L_0x0084
            int r4 = r9.M
            boolean r11 = r10.q(r11, r6, r4)
            if (r11 != 0) goto L_0x0084
            r11 = r2
            goto L_0x0085
        L_0x0084:
            r11 = r1
        L_0x0085:
            r9.B = r11
        L_0x0087:
            boolean r11 = r9.B
            if (r11 != 0) goto L_0x0096
            h0.k.a.e r11 = r9.A
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.u(r12)
            if (r11 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.I
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a1:
            if (r0 != r5) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r11 = r9.B
            if (r11 != 0) goto L_0x00d7
            int r11 = r9.z
            if (r11 == r2) goto L_0x00d7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.q(r3, r11, r0)
            if (r10 != 0) goto L_0x00d7
            h0.k.a.e r10 = r9.A
            if (r10 == 0) goto L_0x00d7
            int r10 = r9.M
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            h0.k.a.e r11 = r9.A
            int r11 = r11.c
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d7
            r1 = r2
        L_0x00d7:
            return r1
        L_0x00d8:
            r9.B = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        g gVar;
        AtomicInteger atomicInteger = q.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v2.getFitsSystemWindows()) {
            v2.setFitsSystemWindows(true);
        }
        if (this.H == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.l && !this.f) {
                q.c.c(v2, new i0.h.a.c.q.k(new i0.h.a.c.g.b(this), new n(v2.getPaddingStart(), v2.getPaddingTop(), v2.getPaddingEnd(), v2.getPaddingBottom())));
                if (v2.isAttachedToWindow()) {
                    v2.requestApplyInsets();
                } else {
                    v2.addOnAttachStateChangeListener(new l());
                }
            }
            this.H = new WeakReference<>(v2);
            if (this.i && (gVar = this.j) != null) {
                v2.setBackground(gVar);
            }
            g gVar2 = this.j;
            if (gVar2 != null) {
                float f2 = this.v;
                if (f2 == -1.0f) {
                    f2 = v2.getElevation();
                }
                gVar2.s(f2);
                boolean z2 = this.z == 3;
                this.n = z2;
                this.j.u(z2 ? 0.0f : 1.0f);
            }
            T();
            if (v2.getImportantForAccessibility() == 0) {
                v2.setImportantForAccessibility(1);
            }
        }
        if (this.A == null) {
            this.A = new e(coordinatorLayout.getContext(), coordinatorLayout, this.Q);
        }
        int top = v2.getTop();
        coordinatorLayout.s(v2, i2);
        this.F = coordinatorLayout.getWidth();
        this.G = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.E = height;
        this.r = Math.max(0, this.G - height);
        this.s = (int) ((1.0f - this.t) * ((float) this.G));
        C();
        int i3 = this.z;
        if (i3 == 3) {
            v2.offsetTopAndBottom(I());
        } else if (i3 == 6) {
            v2.offsetTopAndBottom(this.s);
        } else if (this.w && i3 == 5) {
            v2.offsetTopAndBottom(this.G);
        } else if (i3 == 4) {
            v2.offsetTopAndBottom(this.u);
        } else if (i3 == 1 || i3 == 2) {
            v2.offsetTopAndBottom(top - v2.getTop());
        }
        this.I = new WeakReference<>(G(v2));
        return true;
    }

    public boolean n(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.I;
        if (weakReference == null || view != weakReference.get() || this.z == 3) {
            return false;
        }
        return true;
    }

    public void p(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1) {
            WeakReference<View> weakReference = this.I;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v2.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < I()) {
                        iArr[1] = top - I();
                        AtomicInteger atomicInteger = q.a;
                        v2.offsetTopAndBottom(-iArr[1]);
                        O(3);
                    } else if (this.y) {
                        iArr[1] = i3;
                        AtomicInteger atomicInteger2 = q.a;
                        v2.offsetTopAndBottom(-i3);
                        O(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.u;
                    if (i5 > i6 && !this.w) {
                        iArr[1] = top - i6;
                        AtomicInteger atomicInteger3 = q.a;
                        v2.offsetTopAndBottom(-iArr[1]);
                        O(4);
                    } else if (this.y) {
                        iArr[1] = i3;
                        AtomicInteger atomicInteger4 = q.a;
                        v2.offsetTopAndBottom(-i3);
                        O(1);
                    } else {
                        return;
                    }
                }
                F(v2.getTop());
                this.C = i3;
                this.D = true;
            }
        }
    }

    public void r(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public void u(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = savedState.x;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.c = savedState.y;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.w = savedState.Y1;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.x = savedState.Z1;
            }
        }
        int i3 = savedState.q;
        if (i3 == 1 || i3 == 2) {
            this.z = 4;
        } else {
            this.z = i3;
        }
    }

    public Parcelable v(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public boolean x(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.C = 0;
        this.D = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public void z(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4;
        float f2;
        int i5 = 3;
        if (v2.getTop() == I()) {
            O(3);
            return;
        }
        WeakReference<View> weakReference = this.I;
        if (weakReference != null && view == weakReference.get() && this.D) {
            if (this.C > 0) {
                if (this.c) {
                    i3 = this.r;
                } else {
                    int top = v2.getTop();
                    int i6 = this.s;
                    if (top > i6) {
                        i3 = i6;
                    } else {
                        i3 = this.q;
                    }
                }
                S(v2, i5, i3, false);
                this.D = false;
            }
            if (this.w) {
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker == null) {
                    f2 = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.d);
                    f2 = this.K.getYVelocity(this.L);
                }
                if (R(v2, f2)) {
                    i3 = this.G;
                    i5 = 5;
                    S(v2, i5, i3, false);
                    this.D = false;
                }
            }
            if (this.C == 0) {
                int top2 = v2.getTop();
                if (!this.c) {
                    int i7 = this.s;
                    if (top2 < i7) {
                        if (top2 < Math.abs(top2 - this.u)) {
                            i3 = this.q;
                            S(v2, i5, i3, false);
                            this.D = false;
                        }
                        i3 = this.s;
                    } else if (Math.abs(top2 - i7) < Math.abs(top2 - this.u)) {
                        i3 = this.s;
                    } else {
                        i4 = this.u;
                    }
                } else if (Math.abs(top2 - this.r) < Math.abs(top2 - this.u)) {
                    i3 = this.r;
                    S(v2, i5, i3, false);
                    this.D = false;
                } else {
                    i4 = this.u;
                }
            } else if (this.c) {
                i4 = this.u;
            } else {
                int top3 = v2.getTop();
                if (Math.abs(top3 - this.s) < Math.abs(top3 - this.u)) {
                    i3 = this.s;
                } else {
                    i4 = this.u;
                }
            }
            i5 = 4;
            S(v2, i5, i3, false);
            this.D = false;
            i5 = 6;
            S(v2, i5, i3, false);
            this.D = false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean Y1;
        public boolean Z1;
        public final int q;
        public int x;
        public boolean y;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = parcel.readInt();
            this.x = parcel.readInt();
            boolean z = false;
            this.y = parcel.readInt() == 1;
            this.Y1 = parcel.readInt() == 1;
            this.Z1 = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.q);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y ? 1 : 0);
            parcel.writeInt(this.Y1 ? 1 : 0);
            parcel.writeInt(this.Z1 ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.q = bottomSheetBehavior.z;
            this.x = bottomSheetBehavior.e;
            this.y = bottomSheetBehavior.c;
            this.Y1 = bottomSheetBehavior.w;
            this.Z1 = bottomSheetBehavior.x;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.i = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        int i3 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i3);
        if (hasValue) {
            E(context, attributeSet, hasValue, i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, i3));
        } else {
            E(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.p = ofFloat;
        ofFloat.setDuration(500);
        this.p.addUpdateListener(new i0.h.a.c.g.a(this));
        this.v = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i4 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            M(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        } else {
            M(i2);
        }
        L(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.l = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        K(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.x = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.y = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.b = obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f2 = obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.t = f2;
        if (this.H != null) {
            this.s = (int) ((1.0f - f2) * ((float) this.G));
        }
        int i5 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i5, 0);
            if (dimensionPixelOffset >= 0) {
                this.q = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i6 = peekValue2.data;
            if (i6 >= 0) {
                this.q = i6;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        obtainStyledAttributes.recycle();
        this.d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
