package i0.e.b.g3.t;

import i0.h.a.c.w.f;
import i0.h.a.c.w.n;
import m0.n.b.i;

/* compiled from: TooltipEdgeTreatment.kt */
public final class b extends f {
    public final float a;
    public final float b;

    public b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public void c(float f, float f2, float f3, n nVar) {
        i.e(nVar, "shapePath");
        float f4 = this.b * f3;
        float f5 = (this.a * f3) / 2.0f;
        nVar.d(f2 - f5, 0.0f);
        nVar.d(f2, -f4);
        nVar.d(f2 + f5, 0.0f);
        nVar.d(f, 0.0f);
    }
}
