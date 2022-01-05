package m0.r.t.a.r.m.x0;

import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.z0.b;
import m0.r.t.a.r.m.z0.d;
import m0.r.t.a.r.m.z0.f;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.i;
import m0.r.t.a.r.m.z0.j;

/* compiled from: NewKotlinTypeChecker.kt */
public final class k implements c {
    public static final k a = new k();

    public g a(f fVar) {
        return h.y(this, fVar);
    }

    public int b(f fVar) {
        return h.p(this, fVar);
    }

    public f c(m0.r.t.a.r.m.z0.k kVar) {
        return h.D1(this, kVar);
    }

    public j d(f fVar) {
        return h.t4(this, fVar);
    }

    public m0.r.t.a.r.m.z0.k e(j jVar) {
        return h.H1(this, jVar);
    }

    public boolean f(i iVar) {
        return h.x2(this, iVar);
    }

    public d g(f fVar) {
        return h.u(this, fVar);
    }

    public j h(g gVar) {
        return h.s4(this, gVar);
    }

    public boolean i(g gVar) {
        return h.p2(this, gVar);
    }

    public g j(g gVar, boolean z) {
        return h.F4(this, gVar, z);
    }

    public boolean k(j jVar) {
        return h.l2(this, jVar);
    }

    public f l(f fVar) {
        return h.F1(this, fVar);
    }

    public g m(d dVar) {
        return h.z4(this, dVar);
    }

    public i n(f fVar, int i) {
        return h.R0(this, fVar, i);
    }

    public g o(f fVar) {
        return h.O2(this, fVar);
    }

    public TypeVariance p(i iVar) {
        return h.L1(this, iVar);
    }

    public boolean q(f fVar) {
        return h.q2(this, fVar);
    }

    public boolean r(f fVar) {
        return h.s2(this, fVar);
    }

    public b s(g gVar) {
        return h.r(this, gVar);
    }

    public boolean t(g gVar, g gVar2) {
        return h.T1(this, gVar, gVar2);
    }

    public f u(i iVar) {
        return h.G1(this, iVar);
    }

    public boolean v(j jVar, j jVar2) {
        m0.n.b.i.e(this, "this");
        m0.n.b.i.e(jVar, "c1");
        m0.n.b.i.e(jVar2, "c2");
        if (!(jVar instanceof j0)) {
            throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
        } else if (jVar2 instanceof j0) {
            return m0.n.b.i.a(jVar, jVar2);
        } else {
            throw new IllegalArgumentException(a.J0(jVar2, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar2, ", ")).toString());
        }
    }

    public f w(f fVar) {
        return h.Q2(this, fVar);
    }

    public g x(d dVar) {
        return h.N2(this, dVar);
    }

    public boolean y(g gVar) {
        return h.v2(this, gVar);
    }

    public boolean z(f fVar, m0.r.t.a.r.g.b bVar) {
        return h.P1(this, fVar, bVar);
    }
}
