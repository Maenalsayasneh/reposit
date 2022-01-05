package m0.n.b;

import java.util.Collection;
import java.util.Set;
import m0.n.a.c;
import m0.n.a.e;
import m0.n.a.f;
import m0.n.a.g;
import m0.n.a.h;
import m0.n.a.i;
import m0.n.a.j;
import m0.n.a.k;
import m0.n.a.l;
import m0.n.a.m;
import m0.n.a.n;
import m0.n.a.o;
import m0.n.a.p;
import m0.n.a.q;
import m0.n.a.s;
import m0.n.a.t;
import m0.n.a.u;
import m0.n.a.v;
import m0.n.a.w;
import m0.n.b.s.a;
import m0.n.b.s.b;
import m0.n.b.s.d;

/* compiled from: TypeIntrinsics */
public class r {
    public static Collection a(Object obj) {
        if (!(obj instanceof a) || (obj instanceof b)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                i.j(e, r.class.getName());
                throw e;
            }
        } else {
            e(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    public static Set b(Object obj) {
        if (!(obj instanceof a) || (obj instanceof d)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e) {
                i.j(e, r.class.getName());
                throw e;
            }
        } else {
            e(obj, "kotlin.collections.MutableSet");
            throw null;
        }
    }

    public static Object c(Object obj, int i) {
        if (obj == null || d(obj, i)) {
            return obj;
        }
        e(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean d(Object obj, int i) {
        int i2;
        if (obj instanceof m0.a) {
            if (obj instanceof g) {
                i2 = ((g) obj).getArity();
            } else if (obj instanceof m0.n.a.a) {
                i2 = 0;
            } else if (obj instanceof l) {
                i2 = 1;
            } else if (obj instanceof p) {
                i2 = 2;
            } else if (obj instanceof q) {
                i2 = 3;
            } else if (obj instanceof m0.n.a.r) {
                i2 = 4;
            } else if (obj instanceof s) {
                i2 = 5;
            } else if (obj instanceof t) {
                i2 = 6;
            } else if (obj instanceof u) {
                i2 = 7;
            } else if (obj instanceof v) {
                i2 = 8;
            } else if (obj instanceof w) {
                i2 = 9;
            } else if (obj instanceof m0.n.a.b) {
                i2 = 10;
            } else if (obj instanceof c) {
                i2 = 11;
            } else if (obj instanceof m0.n.a.d) {
                i2 = 12;
            } else if (obj instanceof e) {
                i2 = 13;
            } else if (obj instanceof f) {
                i2 = 14;
            } else if (obj instanceof g) {
                i2 = 15;
            } else if (obj instanceof h) {
                i2 = 16;
            } else if (obj instanceof i) {
                i2 = 17;
            } else if (obj instanceof j) {
                i2 = 18;
            } else if (obj instanceof k) {
                i2 = 19;
            } else if (obj instanceof m) {
                i2 = 20;
            } else if (obj instanceof n) {
                i2 = 21;
            } else {
                i2 = obj instanceof o ? 22 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(i0.d.a.a.a.o0(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        i.j(classCastException, r.class.getName());
        throw classCastException;
    }
}
