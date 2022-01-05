package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.i;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class q extends y0<Double, double[], p> implements KSerializer<double[]> {
    public static final q c = new q();

    public q() {
        super(r.b);
    }

    public int e(Object obj) {
        double[] dArr = (double[]) obj;
        i.e(dArr, "$this$collectionSize");
        return dArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        p pVar = (p) obj;
        i.e(cVar, "decoder");
        i.e(pVar, "builder");
        double A = cVar.A(this.b, i);
        w0.c(pVar, 0, 1, (Object) null);
        double[] dArr = pVar.a;
        int i2 = pVar.b;
        pVar.b = i2 + 1;
        dArr[i2] = A;
    }

    public Object i(Object obj) {
        double[] dArr = (double[]) obj;
        i.e(dArr, "$this$toBuilder");
        return new p(dArr);
    }

    public Object l() {
        return new double[0];
    }

    public void m(d dVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        i.e(dVar, "encoder");
        i.e(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.B(this.b, i2, dArr[i2]);
        }
    }
}
