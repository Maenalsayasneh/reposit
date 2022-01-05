package s0.a.e.b.b0.c;

import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class t3 extends h.b {
    public t3(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public t3(e eVar, g gVar, g gVar2, g[] gVarArr) {
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
        g a = o2.a(gVar3.j(gVar4));
        g b = gVar5.b();
        g l = b.j(o3).a(o2).l(a, o, o3);
        g j = gVar2.j(o3);
        g o4 = j.a(a).o();
        if (o4.i()) {
            return l.i() ? hVar.z() : eVar.m();
        }
        if (l.i()) {
            return new t3(eVar, l, eVar.c);
        }
        g j2 = l.o().j(j);
        g j3 = l.j(o4).j(o3);
        return new t3(eVar, j2, l.a(o4).o().l(a, b, j3), new g[]{j3});
    }

    public h a(h hVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        q3 q3Var;
        q3 q3Var2;
        q3 q3Var3;
        h hVar2 = hVar;
        if (m()) {
            return hVar2;
        }
        if (hVar.m()) {
            return this;
        }
        e eVar = this.b;
        q3 q3Var4 = (q3) this.c;
        q3 q3Var5 = (q3) hVar2.c;
        if (q3Var4.i()) {
            return q3Var5.i() ? eVar.m() : hVar2.a(this);
        }
        q3 q3Var6 = (q3) this.d;
        q3 q3Var7 = (q3) this.e[0];
        q3 q3Var8 = (q3) hVar2.d;
        q3 q3Var9 = (q3) hVar2.k(0);
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] m = q3Var7.h() ? null : p3.m(q3Var7.g);
        if (m == null) {
            jArr = q3Var5.g;
            jArr2 = q3Var8.g;
        } else {
            p3.l(q3Var5.g, m, jArr5);
            p3.l(q3Var8.g, m, jArr7);
            jArr2 = jArr7;
            jArr = jArr5;
        }
        long[] m2 = q3Var9.h() ? null : p3.m(q3Var9.g);
        long[] jArr8 = q3Var4.g;
        if (m2 == null) {
            jArr3 = q3Var6.g;
        } else {
            p3.l(jArr8, m2, jArr4);
            p3.l(q3Var6.g, m2, jArr6);
            jArr8 = jArr4;
            jArr3 = jArr6;
        }
        p3.a(jArr3, jArr2, jArr6);
        p3.a(jArr8, jArr, jArr7);
        if (h3.d2(jArr7)) {
            return h3.d2(jArr6) ? z() : eVar.m();
        }
        if (q3Var5.i()) {
            h q = q();
            q3 q3Var10 = (q3) q.c;
            g j = q.j();
            g d = j.a(q3Var8).d(q3Var10);
            q3Var = (q3) d.o().a(d).a(q3Var10);
            if (q3Var.i()) {
                return new t3(eVar, q3Var, eVar.c);
            }
            q3Var3 = (q3) d.j(q3Var10.a(q3Var)).a(q3Var).a(j).d(q3Var).a(q3Var);
            q3Var2 = (q3) eVar.k(c.b);
        } else {
            p3.o(jArr7, jArr7);
            long[] m3 = p3.m(jArr6);
            p3.l(jArr8, m3, jArr4);
            p3.l(jArr, m3, jArr5);
            q3 q3Var11 = new q3(jArr4);
            p3.j(jArr4, jArr5, jArr4);
            if (q3Var11.i()) {
                return new t3(eVar, q3Var11, eVar.c);
            }
            q3 q3Var12 = new q3(jArr6);
            p3.l(jArr7, m3, jArr6);
            if (m2 != null) {
                long[] jArr9 = q3Var12.g;
                p3.l(jArr9, m2, jArr9);
            }
            long[] jArr10 = new long[18];
            p3.a(jArr5, jArr7, jArr7);
            p3.p(jArr7, jArr10);
            p3.a(q3Var6.g, q3Var7.g, jArr7);
            p3.k(jArr7, q3Var12.g, jArr10);
            q3 q3Var13 = new q3(jArr7);
            p3.n(jArr10, jArr7);
            if (m != null) {
                long[] jArr11 = q3Var12.g;
                p3.l(jArr11, m, jArr11);
            }
            q3Var = q3Var11;
            q3Var3 = q3Var13;
            q3Var2 = q3Var12;
        }
        return new t3(eVar, q3Var, q3Var3, new g[]{q3Var2});
    }

    public h b() {
        return new t3((e) null, d(), e());
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
        return new t3(this.b, gVar, gVar2.a(gVar3), new g[]{gVar3});
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
        g o = h ? gVar3 : gVar3.o();
        g a = h ? gVar2.o().a(gVar2) : gVar2.a(gVar3).j(gVar2);
        if (a.i()) {
            return new t3(eVar, a, eVar.c);
        }
        g o2 = a.o();
        g j = h ? a : a.j(o);
        g o3 = gVar2.a(gVar).o();
        if (!h) {
            gVar3 = o.o();
        }
        return new t3(eVar, o2, o3.a(a).a(o).j(o3).a(gVar3).a(o2).a(j), new g[]{j});
    }
}
