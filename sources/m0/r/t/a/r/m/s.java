package m0.r.t.a.r.m;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.i.b;
import m0.r.t.a.r.m.x0.e;

/* compiled from: TypeWithEnhancement.kt */
public final class s extends q implements t0 {
    public final q x;
    public final v y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(q qVar, v vVar) {
        super(qVar.d, qVar.q);
        i.e(qVar, "origin");
        i.e(vVar, "enhancement");
        this.x = qVar;
        this.y = vVar;
    }

    public v0 B0() {
        return this.x;
    }

    public v E() {
        return this.y;
    }

    public v0 M0(boolean z) {
        return h.G4(this.x.M0(z), this.y.L0().M0(z));
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return h.G4(this.x.O0(fVar), this.y);
    }

    public a0 P0() {
        return this.x.P0();
    }

    public String Q0(DescriptorRenderer descriptorRenderer, b bVar) {
        i.e(descriptorRenderer, "renderer");
        i.e(bVar, "options");
        if (bVar.f()) {
            return descriptorRenderer.w(this.y);
        }
        return this.x.Q0(descriptorRenderer, bVar);
    }

    /* renamed from: R0 */
    public s N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new s((q) eVar.g(this.x), eVar.g(this.y));
    }
}
