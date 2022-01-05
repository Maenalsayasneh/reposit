package h0.i.i;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import h0.i.i.q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WindowInsetsCompat */
public class d0 {
    public static final d0 a;
    public final j b;

    /* compiled from: WindowInsetsCompat */
    public static class c extends b {
        public c() {
        }

        public c(d0 d0Var) {
            super(d0Var);
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class d {
        public final d0 a;

        public d() {
            this(new d0((d0) null));
        }

        public final void a() {
        }

        public d0 b() {
            throw null;
        }

        public void c(h0.i.c.b bVar) {
            throw null;
        }

        public void d(h0.i.c.b bVar) {
            throw null;
        }

        public d(d0 d0Var) {
            this.a = d0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class e extends j {
        public static boolean c = false;
        public static Method d;
        public static Class<?> e;
        public static Class<?> f;
        public static Field g;
        public static Field h;
        public final WindowInsets i;
        public h0.i.c.b[] j;
        public h0.i.c.b k = null;
        public d0 l;
        public h0.i.c.b m;

        public e(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.i = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void v() {
            try {
                d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f = cls;
                g = cls.getDeclaredField("mVisibleInsets");
                h = e.getDeclaredField("mAttachInfo");
                g.setAccessible(true);
                h.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Failed to get visible insets. (Reflection error). ");
                P0.append(e2.getMessage());
                Log.e("WindowInsetsCompat", P0.toString(), e2);
            }
            c = true;
        }

        public void d(View view) {
            h0.i.c.b u = u(view);
            if (u == null) {
                u = h0.i.c.b.a;
            }
            w(u);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.m, ((e) obj).m);
        }

        public h0.i.c.b f(int i2) {
            return r(i2, false);
        }

        public final h0.i.c.b j() {
            if (this.k == null) {
                this.k = h0.i.c.b.b(this.i.getSystemWindowInsetLeft(), this.i.getSystemWindowInsetTop(), this.i.getSystemWindowInsetRight(), this.i.getSystemWindowInsetBottom());
            }
            return this.k;
        }

        public d0 l(int i2, int i3, int i4, int i5) {
            d dVar;
            d0 j2 = d0.j(this.i);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                dVar = new c(j2);
            } else if (i6 >= 29) {
                dVar = new b(j2);
            } else {
                dVar = new a(j2);
            }
            dVar.d(d0.f(j(), i2, i3, i4, i5));
            dVar.c(d0.f(h(), i2, i3, i4, i5));
            return dVar.b();
        }

        public boolean n() {
            return this.i.isRound();
        }

        public void o(h0.i.c.b[] bVarArr) {
            this.j = bVarArr;
        }

        public void p(d0 d0Var) {
            this.l = d0Var;
        }

        @SuppressLint({"WrongConstant"})
        public final h0.i.c.b r(int i2, boolean z) {
            h0.i.c.b bVar = h0.i.c.b.a;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = h0.i.c.b.a(bVar, s(i3, z));
                }
            }
            return bVar;
        }

        public h0.i.c.b s(int i2, boolean z) {
            int i3;
            d dVar;
            int i4 = 0;
            if (i2 != 1) {
                h0.i.c.b bVar = null;
                if (i2 != 2) {
                    if (i2 == 8) {
                        h0.i.c.b[] bVarArr = this.j;
                        if (bVarArr != null) {
                            bVar = bVarArr[g0.a.b.b.a.V(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        h0.i.c.b j2 = j();
                        h0.i.c.b t = t();
                        int i5 = j2.e;
                        if (i5 > t.e) {
                            return h0.i.c.b.b(0, 0, 0, i5);
                        }
                        h0.i.c.b bVar2 = this.m;
                        if (bVar2 == null || bVar2.equals(h0.i.c.b.a) || (i3 = this.m.e) <= t.e) {
                            return h0.i.c.b.a;
                        }
                        return h0.i.c.b.b(0, 0, 0, i3);
                    } else if (i2 == 16) {
                        return i();
                    } else {
                        if (i2 == 32) {
                            return g();
                        }
                        if (i2 == 64) {
                            return k();
                        }
                        if (i2 != 128) {
                            return h0.i.c.b.a;
                        }
                        d0 d0Var = this.l;
                        if (d0Var != null) {
                            dVar = d0Var.b.e();
                        } else {
                            dVar = e();
                        }
                        if (dVar == null) {
                            return h0.i.c.b.a;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        int safeInsetLeft = i6 >= 28 ? ((DisplayCutout) dVar.a).getSafeInsetLeft() : 0;
                        int safeInsetTop = i6 >= 28 ? ((DisplayCutout) dVar.a).getSafeInsetTop() : 0;
                        int safeInsetRight = i6 >= 28 ? ((DisplayCutout) dVar.a).getSafeInsetRight() : 0;
                        if (i6 >= 28) {
                            i4 = ((DisplayCutout) dVar.a).getSafeInsetBottom();
                        }
                        return h0.i.c.b.b(safeInsetLeft, safeInsetTop, safeInsetRight, i4);
                    }
                } else if (z) {
                    h0.i.c.b t2 = t();
                    h0.i.c.b h2 = h();
                    return h0.i.c.b.b(Math.max(t2.b, h2.b), 0, Math.max(t2.d, h2.d), Math.max(t2.e, h2.e));
                } else {
                    h0.i.c.b j3 = j();
                    d0 d0Var2 = this.l;
                    if (d0Var2 != null) {
                        bVar = d0Var2.b.h();
                    }
                    int i7 = j3.e;
                    if (bVar != null) {
                        i7 = Math.min(i7, bVar.e);
                    }
                    return h0.i.c.b.b(j3.b, 0, j3.d, i7);
                }
            } else if (z) {
                return h0.i.c.b.b(0, Math.max(t().c, j().c), 0, 0);
            } else {
                return h0.i.c.b.b(0, j().c, 0, 0);
            }
        }

        public final h0.i.c.b t() {
            d0 d0Var = this.l;
            if (d0Var != null) {
                return d0Var.b.h();
            }
            return h0.i.c.b.a;
        }

        public final h0.i.c.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!c) {
                    v();
                }
                Method method = d;
                if (!(method == null || f == null || g == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) g.get(h.get(invoke));
                        if (rect != null) {
                            return h0.i.c.b.b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Failed to get visible insets. (Reflection error). ");
                        P0.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", P0.toString(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void w(h0.i.c.b bVar) {
            this.m = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class f extends e {
        public h0.i.c.b n = null;

        public f(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public d0 b() {
            return d0.j(this.i.consumeStableInsets());
        }

        public d0 c() {
            return d0.j(this.i.consumeSystemWindowInsets());
        }

        public final h0.i.c.b h() {
            if (this.n == null) {
                this.n = h0.i.c.b.b(this.i.getStableInsetLeft(), this.i.getStableInsetTop(), this.i.getStableInsetRight(), this.i.getStableInsetBottom());
            }
            return this.n;
        }

        public boolean m() {
            return this.i.isConsumed();
        }

        public void q(h0.i.c.b bVar) {
            this.n = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class g extends f {
        public g(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public d0 a() {
            return d0.j(this.i.consumeDisplayCutout());
        }

        public d e() {
            DisplayCutout displayCutout = this.i.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new d(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!Objects.equals(this.i, gVar.i) || !Objects.equals(this.m, gVar.m)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.i.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class h extends g {
        public h0.i.c.b o = null;
        public h0.i.c.b p = null;
        public h0.i.c.b q = null;

        public h(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public h0.i.c.b g() {
            if (this.p == null) {
                this.p = h0.i.c.b.c(this.i.getMandatorySystemGestureInsets());
            }
            return this.p;
        }

        public h0.i.c.b i() {
            if (this.o == null) {
                this.o = h0.i.c.b.c(this.i.getSystemGestureInsets());
            }
            return this.o;
        }

        public h0.i.c.b k() {
            if (this.q == null) {
                this.q = h0.i.c.b.c(this.i.getTappableElementInsets());
            }
            return this.q;
        }

        public d0 l(int i, int i2, int i3, int i4) {
            return d0.j(this.i.inset(i, i2, i3, i4));
        }

        public void q(h0.i.c.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class i extends h {
        public static final d0 r = d0.j(WindowInsets.CONSUMED);

        public i(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public final void d(View view) {
        }

        public h0.i.c.b f(int i) {
            return h0.i.c.b.c(this.i.getInsets(k.a(i)));
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class j {
        public static final d0 a;
        public final d0 b;

        static {
            d dVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                dVar = new c();
            } else if (i >= 29) {
                dVar = new b();
            } else {
                dVar = new a();
            }
            a = dVar.b().b.a().b.b().b.c();
        }

        public j(d0 d0Var) {
            this.b = d0Var;
        }

        public d0 a() {
            return this.b;
        }

        public d0 b() {
            return this.b;
        }

        public d0 c() {
            return this.b;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (n() != jVar.n() || m() != jVar.m() || !Objects.equals(j(), jVar.j()) || !Objects.equals(h(), jVar.h()) || !Objects.equals(e(), jVar.e())) {
                return false;
            }
            return true;
        }

        public h0.i.c.b f(int i) {
            return h0.i.c.b.a;
        }

        public h0.i.c.b g() {
            return j();
        }

        public h0.i.c.b h() {
            return h0.i.c.b.a;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
        }

        public h0.i.c.b i() {
            return j();
        }

        public h0.i.c.b j() {
            return h0.i.c.b.a;
        }

        public h0.i.c.b k() {
            return j();
        }

        public d0 l(int i, int i2, int i3, int i4) {
            return a;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(h0.i.c.b[] bVarArr) {
        }

        public void p(d0 d0Var) {
        }

        public void q(h0.i.c.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class k {
        public static int a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = i.r;
        } else {
            a = j.a;
        }
    }

    public d0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.b = new i(this, windowInsets);
        } else if (i2 >= 29) {
            this.b = new h(this, windowInsets);
        } else if (i2 >= 28) {
            this.b = new g(this, windowInsets);
        } else {
            this.b = new f(this, windowInsets);
        }
    }

    public static h0.i.c.b f(h0.i.c.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.b - i2);
        int max2 = Math.max(0, bVar.c - i3);
        int max3 = Math.max(0, bVar.d - i4);
        int max4 = Math.max(0, bVar.e - i5);
        if (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) {
            return bVar;
        }
        return h0.i.c.b.b(max, max2, max3, max4);
    }

    public static d0 j(WindowInsets windowInsets) {
        return k(windowInsets, (View) null);
    }

    public static d0 k(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        d0 d0Var = new d0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            AtomicInteger atomicInteger = q.a;
            d0Var.b.p(q.d.a(view));
            d0Var.b.d(view.getRootView());
        }
        return d0Var;
    }

    public h0.i.c.b a(int i2) {
        return this.b.f(i2);
    }

    @Deprecated
    public int b() {
        return this.b.j().e;
    }

    @Deprecated
    public int c() {
        return this.b.j().b;
    }

    @Deprecated
    public int d() {
        return this.b.j().d;
    }

    @Deprecated
    public int e() {
        return this.b.j().c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return Objects.equals(this.b, ((d0) obj).b);
    }

    public boolean g() {
        return this.b.m();
    }

    @Deprecated
    public d0 h(int i2, int i3, int i4, int i5) {
        d dVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            dVar = new c(this);
        } else if (i6 >= 29) {
            dVar = new b(this);
        } else {
            dVar = new a(this);
        }
        dVar.d(h0.i.c.b.b(i2, i3, i4, i5));
        return dVar.b();
    }

    public int hashCode() {
        j jVar = this.b;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public WindowInsets i() {
        j jVar = this.b;
        if (jVar instanceof e) {
            return ((e) jVar).i;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat */
    public static class a extends d {
        public static Field b = null;
        public static boolean c = false;
        public static Constructor<WindowInsets> d = null;
        public static boolean e = false;
        public WindowInsets f;
        public h0.i.c.b g;

        public a() {
            this.f = e();
        }

        public static WindowInsets e() {
            if (!c) {
                try {
                    b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                c = true;
            }
            Field field = b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!e) {
                try {
                    d = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                e = true;
            }
            Constructor<WindowInsets> constructor = d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        public d0 b() {
            a();
            d0 j = d0.j(this.f);
            j.b.o((h0.i.c.b[]) null);
            j.b.q(this.g);
            return j;
        }

        public void c(h0.i.c.b bVar) {
            this.g = bVar;
        }

        public void d(h0.i.c.b bVar) {
            WindowInsets windowInsets = this.f;
            if (windowInsets != null) {
                this.f = windowInsets.replaceSystemWindowInsets(bVar.b, bVar.c, bVar.d, bVar.e);
            }
        }

        public a(d0 d0Var) {
            super(d0Var);
            this.f = d0Var.i();
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class b extends d {
        public final WindowInsets.Builder b;

        public b() {
            this.b = new WindowInsets.Builder();
        }

        public d0 b() {
            a();
            d0 j = d0.j(this.b.build());
            j.b.o((h0.i.c.b[]) null);
            return j;
        }

        public void c(h0.i.c.b bVar) {
            this.b.setStableInsets(bVar.d());
        }

        public void d(h0.i.c.b bVar) {
            this.b.setSystemWindowInsets(bVar.d());
        }

        public b(d0 d0Var) {
            super(d0Var);
            WindowInsets.Builder builder;
            WindowInsets i = d0Var.i();
            if (i != null) {
                builder = new WindowInsets.Builder(i);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }
    }

    public d0(d0 d0Var) {
        this.b = new j(this);
    }
}
