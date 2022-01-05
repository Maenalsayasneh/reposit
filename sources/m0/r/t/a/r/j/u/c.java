package m0.r.t.a.r.j.u;

import m0.r.t.a.r.j.u.d;

/* compiled from: MemberScope.kt */
public abstract class c {

    /* compiled from: MemberScope.kt */
    public static final class a extends c {
        public static final a a = new a();
        public static final int b = (d.i & (~(d.g | d.h)));

        static {
            d.a aVar = d.a;
        }

        public int a() {
            return b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends c {
        public static final b a = new b();

        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
