package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.i;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class n extends y0<Character, char[], m> implements KSerializer<char[]> {
    public static final n c = new n();

    public n() {
        super(o.b);
    }

    public int e(Object obj) {
        char[] cArr = (char[]) obj;
        i.e(cArr, "$this$collectionSize");
        return cArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        m mVar = (m) obj;
        i.e(cVar, "decoder");
        i.e(mVar, "builder");
        char p = cVar.p(this.b, i);
        w0.c(mVar, 0, 1, (Object) null);
        char[] cArr = mVar.a;
        int i2 = mVar.b;
        mVar.b = i2 + 1;
        cArr[i2] = p;
    }

    public Object i(Object obj) {
        char[] cArr = (char[]) obj;
        i.e(cArr, "$this$toBuilder");
        return new m(cArr);
    }

    public Object l() {
        return new char[0];
    }

    public void m(d dVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        i.e(dVar, "encoder");
        i.e(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.E(this.b, i2, cArr[i2]);
        }
    }
}
