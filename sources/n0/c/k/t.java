package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.i;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class t extends y0<Float, float[], s> implements KSerializer<float[]> {
    public static final t c = new t();

    public t() {
        super(u.b);
    }

    public int e(Object obj) {
        float[] fArr = (float[]) obj;
        i.e(fArr, "$this$collectionSize");
        return fArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        s sVar = (s) obj;
        i.e(cVar, "decoder");
        i.e(sVar, "builder");
        float F = cVar.F(this.b, i);
        w0.c(sVar, 0, 1, (Object) null);
        float[] fArr = sVar.a;
        int i2 = sVar.b;
        sVar.b = i2 + 1;
        fArr[i2] = F;
    }

    public Object i(Object obj) {
        float[] fArr = (float[]) obj;
        i.e(fArr, "$this$toBuilder");
        return new s(fArr);
    }

    public Object l() {
        return new float[0];
    }

    public void m(d dVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        i.e(dVar, "encoder");
        i.e(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.m(this.b, i2, fArr[i2]);
        }
    }
}
