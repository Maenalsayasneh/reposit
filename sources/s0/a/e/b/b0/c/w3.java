package s0.a.e.b.b0.c;

import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class w3 extends h.b {
    public w3(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public w3(e eVar, g gVar, g gVar2, g[] gVarArr) {
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
        q3 q3Var = (q3) this.c;
        if (q3Var.i()) {
            return hVar;
        }
        q3 q3Var2 = (q3) hVar.c;
        q3 q3Var3 = (q3) hVar.k(0);
        if (q3Var2.i() || !q3Var3.h()) {
            return z().a(hVar);
        }
        q3 q3Var4 = (q3) this.d;
        q3 q3Var5 = (q3) this.e[0];
        q3 q3Var6 = (q3) hVar.d;
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        p3.o(q3Var.g, jArr);
        p3.o(q3Var4.g, jArr2);
        p3.o(q3Var5.g, jArr3);
        p3.j(q3Var4.g, q3Var5.g, jArr4);
        p3.c(jArr3, jArr2, jArr4);
        long[] m = p3.m(jArr3);
        p3.l(q3Var6.g, m, jArr3);
        p3.a(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        p3.k(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[18];
        p3.g(jArr, m, jArr6);
        p3.d(jArr5, jArr6, jArr5);
        p3.n(jArr5, jArr3);
        p3.l(q3Var2.g, m, jArr);
        p3.a(jArr, jArr4, jArr2);
        p3.o(jArr2, jArr2);
        if (h3.d2(jArr2)) {
            return h3.d2(jArr3) ? hVar.z() : eVar.m();
        }
        if (h3.d2(jArr3)) {
            return new w3(eVar, new q3(jArr3), v3.l);
        }
        q3 q3Var7 = new q3();
        p3.o(jArr3, q3Var7.g);
        long[] jArr7 = q3Var7.g;
        p3.j(jArr7, jArr, jArr7);
        q3 q3Var8 = new q3(jArr);
        p3.j(jArr3, jArr2, jArr);
        long[] jArr8 = q3Var8.g;
        p3.l(jArr8, m, jArr8);
        q3 q3Var9 = new q3(jArr2);
        p3.a(jArr3, jArr2, jArr2);
        long[] jArr9 = q3Var9.g;
        p3.o(jArr9, jArr9);
        for (int i = 0; i < 18; i++) {
            jArr5[i] = 0;
        }
        p3.k(q3Var9.g, jArr4, jArr5);
        p3.e(q3Var6.g, jArr4);
        p3.k(jArr4, q3Var8.g, jArr5);
        p3.n(jArr5, q3Var9.g);
        return new w3(eVar, q3Var7, q3Var9, new g[]{q3Var8});
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
            q3Var = (q3) d.o().a(d).a(q3Var10).b();
            if (q3Var.i()) {
                return new w3(eVar, q3Var, v3.l);
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
                return new w3(eVar, q3Var11, v3.l);
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
        return new w3(eVar, q3Var, q3Var3, new g[]{q3Var2});
    }

    public h b() {
        return new w3((e) null, d(), e());
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
        return new w3(this.b, gVar, gVar2.a(gVar3), new g[]{gVar3});
    }

    public h z() {
        long[] jArr;
        if (m()) {
            return this;
        }
        e eVar = this.b;
        q3 q3Var = (q3) this.c;
        if (q3Var.i()) {
            return eVar.m();
        }
        q3 q3Var2 = (q3) this.d;
        q3 q3Var3 = (q3) this.e[0];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] m = q3Var3.h() ? null : p3.m(q3Var3.g);
        long[] jArr4 = q3Var2.g;
        if (m == null) {
            jArr = q3Var3.g;
        } else {
            p3.l(jArr4, m, jArr2);
            p3.o(q3Var3.g, jArr3);
            jArr4 = jArr2;
            jArr = jArr3;
        }
        long[] jArr5 = new long[9];
        p3.o(q3Var2.g, jArr5);
        p3.c(jArr4, jArr, jArr5);
        if (h3.d2(jArr5)) {
            return new w3(eVar, new q3(jArr5), v3.l);
        }
        long[] jArr6 = new long[18];
        p3.k(jArr5, jArr4, jArr6);
        q3 q3Var4 = new q3(jArr2);
        p3.o(jArr5, jArr2);
        q3 q3Var5 = new q3(jArr5);
        if (m != null) {
            p3.j(jArr5, jArr, jArr5);
        }
        long[] jArr7 = q3Var.g;
        if (m != null) {
            p3.l(jArr7, m, jArr3);
            jArr7 = jArr3;
        }
        p3.p(jArr7, jArr6);
        p3.n(jArr6, jArr3);
        p3.c(q3Var4.g, q3Var5.g, jArr3);
        return new w3(eVar, q3Var4, new q3(jArr3), new g[]{q3Var5});
    }
}
