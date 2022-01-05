package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.i;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class g extends y0<Boolean, boolean[], f> implements KSerializer<boolean[]> {
    public static final g c = new g();

    public g() {
        super(h.b);
    }

    public int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i.e(zArr, "$this$collectionSize");
        return zArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        f fVar = (f) obj;
        i.e(cVar, "decoder");
        i.e(fVar, "builder");
        boolean s = cVar.s(this.b, i);
        w0.c(fVar, 0, 1, (Object) null);
        boolean[] zArr = fVar.a;
        int i2 = fVar.b;
        fVar.b = i2 + 1;
        zArr[i2] = s;
    }

    public Object i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i.e(zArr, "$this$toBuilder");
        return new f(zArr);
    }

    public Object l() {
        return new boolean[0];
    }

    public void m(d dVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        i.e(dVar, "encoder");
        i.e(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.r(this.b, i2, zArr[i2]);
        }
    }
}
