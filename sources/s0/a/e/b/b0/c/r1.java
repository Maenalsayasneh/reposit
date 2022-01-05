package s0.a.e.b.b0.c;

import i0.d.a.a.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class r1 extends h.b {
    public r1(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public r1(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        if (m()) {
            return hVar;
        }
        if (hVar.m()) {
            return z();
        }
        e eVar = this.b;
        g gVar = this.c;
        if (gVar.i()) {
            return hVar;
        }
        g gVar2 = hVar.c;
        g k = hVar.k(0);
        if (gVar2.i() || !k.h()) {
            return z().a(hVar);
        }
        g gVar3 = this.d;
        g gVar4 = this.e[0];
        g gVar5 = hVar.d;
        g o = gVar.o();
        g o2 = gVar3.o();
        g o3 = gVar4.o();
        g a = eVar.b.j(o3).a(o2).a(gVar3.j(gVar4));
        g b = gVar5.b();
        g l = eVar.b.a(b).j(o3).a(o2).l(a, o, o3);
        g j = gVar2.j(o3);
        g o4 = j.a(a).o();
        if (o4.i()) {
            return l.i() ? hVar.z() : eVar.m();
        }
        if (l.i()) {
            return new r1(eVar, l, eVar.c.n());
        }
        g j2 = l.o().j(j);
        g j3 = l.j(o4).j(o3);
        return new r1(eVar, j2, l.a(o4).o().l(a, b, j3), new g[]{j3});
    }

    public h a(h hVar) {
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        g gVar5;
        g gVar6;
        if (m()) {
            return hVar;
        }
        if (hVar.m()) {
            return this;
        }
        e eVar = this.b;
        g gVar7 = this.c;
        g gVar8 = hVar.c;
        if (gVar7.i()) {
            return gVar8.i() ? eVar.m() : hVar.a(this);
        }
        g gVar9 = this.d;
        g gVar10 = this.e[0];
        g gVar11 = hVar.d;
        g k = hVar.k(0);
        boolean h = gVar10.h();
        if (!h) {
            gVar2 = gVar8.j(gVar10);
            gVar = gVar11.j(gVar10);
        } else {
            gVar2 = gVar8;
            gVar = gVar11;
        }
        boolean h2 = k.h();
        if (!h2) {
            gVar7 = gVar7.j(k);
            gVar3 = gVar9.j(k);
        } else {
            gVar3 = gVar9;
        }
        g a = gVar3.a(gVar);
        g a2 = gVar7.a(gVar2);
        if (a2.i()) {
            return a.i() ? z() : eVar.m();
        }
        if (gVar8.i()) {
            h q = q();
            g gVar12 = q.c;
            g j = q.j();
            g d = j.a(gVar11).d(gVar12);
            gVar5 = a.s1(d, d, gVar12).a(eVar.b);
            if (gVar5.i()) {
                return new r1(eVar, gVar5, eVar.c.n());
            }
            gVar4 = d.j(gVar12.a(gVar5)).a(gVar5).a(j).d(gVar5).a(gVar5);
            gVar6 = eVar.k(c.b);
        } else {
            g o = a2.o();
            g j2 = a.j(gVar7);
            g j3 = a.j(gVar2);
            g j4 = j2.j(j3);
            if (j4.i()) {
                return new r1(eVar, j4, eVar.c.n());
            }
            g j5 = a.j(o);
            if (!h2) {
                j5 = j5.j(k);
            }
            gVar4 = j3.a(o).p(j5, gVar9.a(gVar10));
            gVar5 = j4;
            gVar6 = !h ? j5.j(gVar10) : j5;
        }
        return new r1(eVar, gVar5, gVar4, new g[]{gVar6});
    }

    public h b() {
        return new r1((e) null, d(), e());
    }

    public boolean f() {
        g gVar = this.c;
        if (!gVar.i() && this.d.s() != gVar.s()) {
            return true;
        }
        return false;
    }

    public g j() {
        g gVar = this.c;
        g gVar2 = this.d;
        if (m() || gVar.i()) {
            return gVar2;
        }
        g j = gVar2.a(gVar).j(gVar);
        g gVar3 = this.e[0];
        return !gVar3.h() ? j.d(gVar3) : j;
    }

    public h p() {
        if (m()) {
            return this;
        }
        g gVar = this.c;
        if (gVar.i()) {
            return this;
        }
        g gVar2 = this.d;
        g gVar3 = this.e[0];
        return new r1(this.b, gVar, gVar2.a(gVar3), new g[]{gVar3});
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        g gVar = this.c;
        if (gVar.i()) {
            return eVar.m();
        }
        g gVar2 = this.d;
        g gVar3 = this.e[0];
        boolean h = gVar3.h();
        g j = h ? gVar2 : gVar2.j(gVar3);
        g o = h ? gVar3 : gVar3.o();
        g gVar4 = eVar.b;
        if (!h) {
            gVar4 = gVar4.j(o);
        }
        g s1 = a.s1(gVar2, j, gVar4);
        if (s1.i()) {
            return new r1(eVar, s1, eVar.c.n());
        }
        g o2 = s1.o();
        g j2 = h ? s1 : s1.j(o);
        if (!h) {
            gVar = gVar.j(gVar3);
        }
        return new r1(eVar, o2, gVar.p(s1, j).a(o2).a(j2), new g[]{j2});
    }
}
