package m0.r.t.a.r.m;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.i.b;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.z0.c;

/* compiled from: dynamicTypes.kt */
public final class n extends q implements c {
    public final f x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(m0.r.t.a.r.b.f r3, m0.r.t.a.r.c.r0.f r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "annotations"
            m0.n.b.i.e(r4, r0)
            m0.r.t.a.r.m.a0 r0 = r3.o()
            java.lang.String r1 = "builtIns.nothingType"
            m0.n.b.i.d(r0, r1)
            m0.r.t.a.r.m.a0 r3 = r3.p()
            java.lang.String r1 = "builtIns.nullableAnyType"
            m0.n.b.i.d(r3, r1)
            r2.<init>(r0, r3)
            r2.x = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.n.<init>(m0.r.t.a.r.b.f, m0.r.t.a.r.c.r0.f):void");
    }

    public boolean J0() {
        return false;
    }

    public v K0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public v0 M0(boolean z) {
        return this;
    }

    public v0 N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new n(a.F1(this.q), fVar);
    }

    public a0 P0() {
        return this.q;
    }

    public String Q0(DescriptorRenderer descriptorRenderer, b bVar) {
        i.e(descriptorRenderer, "renderer");
        i.e(bVar, "options");
        return "dynamic";
    }

    public f getAnnotations() {
        return this.x;
    }
}
