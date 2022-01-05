package i0.e.b.a3.a;

import kotlin.Result;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;
import n0.a.i0;
import n0.a.v;

/* compiled from: ReleaseCompletable.kt */
public final class b {
    public final i0<Integer> a = a.g((f1) null, 1);

    public static void a(b bVar, Result result, int i) {
        int i2 = i & 1;
        Result result2 = null;
        if (i2 != 0) {
            result2 = new Result((Object) null);
        }
        Object obj = result2.c;
        v vVar = (v) bVar.a;
        Throwable a2 = Result.a(obj);
        if (a2 == null) {
            vVar.H(obj);
        } else {
            vVar.G(a2);
        }
    }
}
