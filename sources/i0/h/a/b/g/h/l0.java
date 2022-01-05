package i0.h.a.b.g.h;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class l0 extends k0 {
    public l0(j0 j0Var) {
        super((j0) null);
    }

    public static <E> c0<E> c(Object obj, long j) {
        return (c0) d2.p(obj, j);
    }

    public final <E> void a(Object obj, Object obj2, long j) {
        c0 c = c(obj, j);
        c0 c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.a()) {
                c = c.i(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        d2.e(obj, j, c2);
    }

    public final void b(Object obj, long j) {
        c(obj, j).g();
    }
}
