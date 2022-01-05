package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.i;
import m0.n.b.o;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class e1 extends y0<Short, short[], d1> implements KSerializer<short[]> {
    public static final e1 c = new e1();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1() {
        super(f1.b);
        a.r3(o.a);
    }

    public int e(Object obj) {
        short[] sArr = (short[]) obj;
        i.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        d1 d1Var = (d1) obj;
        i.e(cVar, "decoder");
        i.e(d1Var, "builder");
        short w = cVar.w(this.b, i);
        w0.c(d1Var, 0, 1, (Object) null);
        short[] sArr = d1Var.a;
        int i2 = d1Var.b;
        d1Var.b = i2 + 1;
        sArr[i2] = w;
    }

    public Object i(Object obj) {
        short[] sArr = (short[]) obj;
        i.e(sArr, "$this$toBuilder");
        return new d1(sArr);
    }

    public Object l() {
        return new short[0];
    }

    public void m(d dVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        i.e(dVar, "encoder");
        i.e(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.A(this.b, i2, sArr[i2]);
        }
    }
}
