package h0.l.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import h0.l.a.a;
import h0.l.a.b;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: DynamicAnimation */
public abstract class b<T extends b<T>> implements a.b {
    public static final k a = new c("scaleX");
    public static final k b = new d("scaleY");
    public static final k c = new e("rotation");
    public static final k d = new f("rotationX");
    public static final k e = new g("rotationY");
    public static final k f = new a("alpha");
    public float g = 0.0f;
    public float h = Float.MAX_VALUE;
    public boolean i = false;
    public final Object j;
    public final c k;
    public boolean l = false;
    public float m = -3.4028235E38f;
    public long n = 0;
    public float o;
    public final ArrayList<i> p = new ArrayList<>();
    public final ArrayList<j> q = new ArrayList<>();

    /* compiled from: DynamicAnimation */
    public static class a extends k {
        public a(String str) {
            super(str, (C0055b) null);
        }

        public float a(Object obj) {
            return ((View) obj).getAlpha();
        }

        public void b(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* renamed from: h0.l.a.b$b  reason: collision with other inner class name */
    /* compiled from: DynamicAnimation */
    public static class C0055b extends k {
    }

    /* compiled from: DynamicAnimation */
    public static class c extends k {
        public c(String str) {
            super(str, (C0055b) null);
        }

        public float a(Object obj) {
            return ((View) obj).getScaleX();
        }

        public void b(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation */
    public static class d extends k {
        public d(String str) {
            super(str, (C0055b) null);
        }

        public float a(Object obj) {
            return ((View) obj).getScaleY();
        }

        public void b(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation */
    public static class e extends k {
        public e(String str) {
            super(str, (C0055b) null);
        }

        public float a(Object obj) {
            return ((View) obj).getRotation();
        }

        public void b(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation */
    public static class f extends k {
        public f(String str) {
            super(str, (C0055b) null);
        }

        public float a(Object obj) {
            return ((View) obj).getRotationX();
        }

        public void b(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation */
    public static class g extends k {
        public g(String str) {
            super(str, (C0055b) null);
        }

        public float a(Object obj) {
            return ((View) obj).getRotationY();
        }

        public void b(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation */
    public static class h {
        public float a;
        public float b;
    }

    /* compiled from: DynamicAnimation */
    public interface i {
        void a(b bVar, boolean z, float f, float f2);
    }

    /* compiled from: DynamicAnimation */
    public interface j {
        void a(b bVar, float f, float f2);
    }

    /* compiled from: DynamicAnimation */
    public static abstract class k extends c<View> {
        public k(String str, C0055b bVar) {
            super(str);
        }
    }

    public <K> b(K k2, c<K> cVar) {
        this.j = k2;
        this.k = cVar;
        if (cVar == c || cVar == d || cVar == e) {
            this.o = 0.1f;
        } else if (cVar == f) {
            this.o = 0.00390625f;
        } else if (cVar == a || cVar == b) {
            this.o = 0.00390625f;
        } else {
            this.o = 1.0f;
        }
    }

    public static <T> void d(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public boolean a(long j2) {
        long j3 = j2;
        long j4 = this.n;
        if (j4 == 0) {
            this.n = j3;
            e(this.h);
            return false;
        }
        long j5 = j3 - j4;
        this.n = j3;
        d dVar = (d) this;
        boolean z = true;
        if (dVar.t) {
            float f2 = dVar.s;
            if (f2 != Float.MAX_VALUE) {
                dVar.r.i = (double) f2;
                dVar.s = Float.MAX_VALUE;
            }
            dVar.h = (float) dVar.r.i;
            dVar.g = 0.0f;
            dVar.t = false;
        } else {
            if (dVar.s != Float.MAX_VALUE) {
                e eVar = dVar.r;
                double d2 = eVar.i;
                long j6 = j5 / 2;
                h c2 = eVar.c((double) dVar.h, (double) dVar.g, j6);
                e eVar2 = dVar.r;
                eVar2.i = (double) dVar.s;
                dVar.s = Float.MAX_VALUE;
                h c3 = eVar2.c((double) c2.a, (double) c2.b, j6);
                dVar.h = c3.a;
                dVar.g = c3.b;
            } else {
                h c4 = dVar.r.c((double) dVar.h, (double) dVar.g, j5);
                dVar.h = c4.a;
                dVar.g = c4.b;
            }
            float max = Math.max(dVar.h, dVar.m);
            dVar.h = max;
            float min = Math.min(max, Float.MAX_VALUE);
            dVar.h = min;
            float f3 = dVar.g;
            e eVar3 = dVar.r;
            Objects.requireNonNull(eVar3);
            if (((double) Math.abs(f3)) < eVar3.e && ((double) Math.abs(min - ((float) eVar3.i))) < eVar3.d) {
                dVar.h = (float) dVar.r.i;
                dVar.g = 0.0f;
            } else {
                z = false;
            }
        }
        float min2 = Math.min(this.h, Float.MAX_VALUE);
        this.h = min2;
        float max2 = Math.max(min2, this.m);
        this.h = max2;
        e(max2);
        if (z) {
            c(false);
        }
        return z;
    }

    public void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.l) {
            c(true);
        }
    }

    public final void c(boolean z) {
        this.l = false;
        a a2 = a.a();
        a2.b.remove(this);
        int indexOf = a2.c.indexOf(this);
        if (indexOf >= 0) {
            a2.c.set(indexOf, (Object) null);
            a2.g = true;
        }
        this.n = 0;
        this.i = false;
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            if (this.p.get(i2) != null) {
                this.p.get(i2).a(this, z, this.h, this.g);
            }
        }
        d(this.p);
    }

    public void e(float f2) {
        this.k.b(this.j, f2);
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            if (this.q.get(i2) != null) {
                this.q.get(i2).a(this, this.h, this.g);
            }
        }
        d(this.q);
    }
}
