package s0.a.b.o0;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import s0.a.a.d3.f;
import s0.a.a.d3.h;
import s0.a.a.d3.j;
import s0.a.a.d3.m;
import s0.a.a.g2.a;
import s0.a.a.k;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.v;
import s0.a.a.v0;
import s0.a.a.w2.p;
import s0.a.a.w2.s;
import s0.a.a.x0;
import s0.a.b.k0.a0;
import s0.a.b.k0.b;
import s0.a.b.k0.b0;
import s0.a.b.k0.e0;
import s0.a.b.k0.h0;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;
import s0.a.b.k0.p1;
import s0.a.b.k0.q;
import s0.a.b.k0.s1;
import s0.a.b.k0.w;
import s0.a.b.k0.x;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.i;

public class d {
    public static Set a;

    static {
        HashSet hashSet = new HashSet(5);
        a = hashSet;
        hashSet.add(a.t);
        a.add(a.u);
        a.add(a.v);
        a.add(a.w);
        a.add(a.x);
    }

    public static p a(b bVar, v vVar) throws IOException {
        int i;
        f fVar;
        BigInteger bigInteger;
        n nVar;
        b bVar2 = bVar;
        v vVar2 = vVar;
        if (bVar2 instanceof k1) {
            l1 l1Var = (l1) bVar2;
            return new p(new s0.a.a.c3.b(s0.a.a.w2.n.n, v0.c), new s(l1Var.x, l1Var.Y1, l1Var.y, l1Var.Z1, l1Var.a2, l1Var.b2, l1Var.c2, l1Var.d2), vVar2, (byte[]) null);
        } else if (bVar2 instanceof q) {
            q qVar = (q) bVar2;
            s0.a.b.k0.p pVar = qVar.d;
            return new p(new s0.a.a.c3.b(m.N1, new s0.a.a.c3.q(pVar.q, pVar.d, pVar.c)), new k(qVar.q), vVar2, (byte[]) null);
        } else if (bVar2 instanceof b0) {
            b0 b0Var = (b0) bVar2;
            w wVar = b0Var.d;
            if (wVar == null) {
                fVar = new f((l) v0.c);
                bigInteger = b0Var.q;
            } else if (wVar instanceof x) {
                x xVar = (x) wVar;
                n nVar2 = xVar.n;
                s0.a.a.g2.f fVar2 = new s0.a.a.g2.f(nVar2, xVar.o, xVar.p);
                boolean contains = a.contains(nVar2);
                int i2 = 32;
                if (contains) {
                    nVar = a.m;
                } else {
                    boolean z = b0Var.q.bitLength() > 256;
                    n nVar3 = z ? s0.a.a.x2.a.h : s0.a.a.x2.a.g;
                    if (z) {
                        i2 = 64;
                    }
                    nVar = nVar3;
                }
                byte[] bArr = new byte[i2];
                byte[] byteArray = b0Var.q.toByteArray();
                if (byteArray.length < i2) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(byteArray, 0, bArr2, i2 - byteArray.length, byteArray.length);
                    byteArray = bArr2;
                }
                for (int i3 = 0; i3 != i2; i3++) {
                    bArr[0 + i3] = byteArray[(byteArray.length - 1) - i3];
                }
                return new p(new s0.a.a.c3.b(nVar, fVar2), new x0(bArr), (v) null, (byte[]) null);
            } else if (wVar instanceof a0) {
                fVar = new f(((a0) wVar).m);
                bigInteger = wVar.j;
            } else {
                f fVar3 = new f(new h(wVar.g, new j(wVar.i, false), wVar.j, wVar.k, wVar.a()));
                i = wVar.j.bitLength();
                fVar = fVar3;
                return new p(new s0.a.a.c3.b(m.h1, fVar), new s0.a.a.y2.a(i, b0Var.q, new o0(new i().a(wVar.i, b0Var.q).i(false)), fVar), vVar2, (byte[]) null);
            }
            i = bigInteger.bitLength();
            return new p(new s0.a.a.c3.b(m.h1, fVar), new s0.a.a.y2.a(i, b0Var.q, new o0(new i().a(wVar.i, b0Var.q).i(false)), fVar), vVar2, (byte[]) null);
        } else if (bVar2 instanceof s1) {
            s1 s1Var = (s1) bVar2;
            return new p(new s0.a.a.c3.b(s0.a.a.i2.a.c), new x0(h3.I(s1Var.d)), vVar2, h3.I(s1Var.a().d));
        } else if (bVar2 instanceof p1) {
            p1 p1Var = (p1) bVar2;
            return new p(new s0.a.a.c3.b(s0.a.a.i2.a.b), new x0(h3.I(p1Var.d)), vVar2, h3.I(p1Var.a().d));
        } else if (bVar2 instanceof h0) {
            h0 h0Var = (h0) bVar2;
            return new p(new s0.a.a.c3.b(s0.a.a.i2.a.e), new x0(h3.I(h0Var.d)), vVar2, h0Var.a().getEncoded());
        } else if (bVar2 instanceof e0) {
            e0 e0Var = (e0) bVar2;
            return new p(new s0.a.a.c3.b(s0.a.a.i2.a.d), new x0(h3.I(e0Var.d)), vVar2, e0Var.a().getEncoded());
        } else {
            throw new IOException("key parameters not recognized");
        }
    }
}
