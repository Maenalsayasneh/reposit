package n0.a.i2;

import n0.a.d0;
import n0.a.h2.u;

/* compiled from: Dispatcher.kt */
public final class a extends b {
    public static final a Z1;
    public static final d0 a2;

    static {
        a aVar = new a();
        Z1 = aVar;
        int i = u.a;
        a2 = new d(aVar, m0.r.t.a.r.m.a1.a.Q3("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    public a() {
        super(0, 0, (String) null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
