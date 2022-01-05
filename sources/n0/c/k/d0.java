package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.h;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class d0 extends y0<Integer, int[], c0> implements KSerializer<int[]> {
    public static final d0 c = new d0();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0() {
        super(e0.b);
        a.p3(h.a);
    }

    public int e(Object obj) {
        int[] iArr = (int[]) obj;
        i.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        c0 c0Var = (c0) obj;
        i.e(cVar, "decoder");
        i.e(c0Var, "builder");
        int k = cVar.k(this.b, i);
        w0.c(c0Var, 0, 1, (Object) null);
        int[] iArr = c0Var.a;
        int i2 = c0Var.b;
        c0Var.b = i2 + 1;
        iArr[i2] = k;
    }

    public Object i(Object obj) {
        int[] iArr = (int[]) obj;
        i.e(iArr, "$this$toBuilder");
        return new c0(iArr);
    }

    public Object l() {
        return new int[0];
    }

    public void m(d dVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        i.e(dVar, "encoder");
        i.e(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.q(this.b, i2, iArr[i2]);
        }
    }
}
