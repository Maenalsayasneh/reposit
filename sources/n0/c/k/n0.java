package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.i;
import m0.n.b.k;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class n0 extends y0<Long, long[], m0> implements KSerializer<long[]> {
    public static final n0 c = new n0();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0() {
        super(o0.b);
        a.q3(k.a);
    }

    public int e(Object obj) {
        long[] jArr = (long[]) obj;
        i.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        m0 m0Var = (m0) obj;
        i.e(cVar, "decoder");
        i.e(m0Var, "builder");
        long h = cVar.h(this.b, i);
        w0.c(m0Var, 0, 1, (Object) null);
        long[] jArr = m0Var.a;
        int i2 = m0Var.b;
        m0Var.b = i2 + 1;
        jArr[i2] = h;
    }

    public Object i(Object obj) {
        long[] jArr = (long[]) obj;
        i.e(jArr, "$this$toBuilder");
        return new m0(jArr);
    }

    public Object l() {
        return new long[0];
    }

    public void m(d dVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        i.e(dVar, "encoder");
        i.e(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.D(this.b, i2, jArr[i2]);
        }
    }
}
