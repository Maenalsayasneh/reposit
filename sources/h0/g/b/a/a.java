package h0.g.b.a;

import h0.g.a.g.a.k;
import h0.g.a.g.a.m;
import h0.g.a.g.a.n;
import h0.g.b.b.p;

/* compiled from: StopLogic */
public class a extends p {
    public n a;
    public k b;
    public m c;

    public a() {
        n nVar = new n();
        this.a = nVar;
        this.c = nVar;
    }

    public float a() {
        return this.c.b();
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        n nVar = this.a;
        this.c = nVar;
        nVar.l = f;
        boolean z = f > f2;
        nVar.k = z;
        if (z) {
            nVar.d(-f3, f - f2, f5, f6, f4);
        } else {
            nVar.d(f3, f2 - f, f5, f6, f4);
        }
    }

    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
