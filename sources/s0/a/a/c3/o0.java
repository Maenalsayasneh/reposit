package s0.a.a.c3;

import i0.d.a.a.a;
import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.b3.c;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;
import s0.a.g.b;
import s0.a.g.g;

public class o0 extends m {
    public t0 Y1;
    public t0 Z1;
    public c a2;
    public m0 b2;
    public s c;
    public s0.a.a.o0 c2;
    public k d;
    public s0.a.a.o0 d2;
    public v e2;
    public k q;
    public b x;
    public c y;

    public o0(s sVar) {
        int i;
        boolean z;
        boolean z2;
        this.c = sVar;
        if (sVar.D(0) instanceof z) {
            this.d = k.C((z) sVar.D(0), true);
            i = 0;
        } else {
            this.d = new k(0);
            i = -1;
        }
        if (this.d.F(BigInteger.valueOf(0))) {
            z = false;
            z2 = true;
        } else if (this.d.F(BigInteger.valueOf(1))) {
            z2 = false;
            z = true;
        } else if (this.d.F(BigInteger.valueOf(2))) {
            z2 = false;
            z = false;
        } else {
            throw new IllegalArgumentException("version number not recognised");
        }
        this.q = k.B(sVar.D(i + 1));
        this.x = b.s(sVar.D(i + 2));
        this.y = c.s(sVar.D(i + 3));
        s sVar2 = (s) sVar.D(i + 4);
        this.Y1 = t0.t(sVar2.D(0));
        this.Z1 = t0.t(sVar2.D(1));
        this.a2 = c.s(sVar.D(i + 5));
        int i2 = i + 6;
        this.b2 = m0.s(sVar.D(i2));
        int size = (sVar.size() - i2) - 1;
        if (size == 0 || !z2) {
            while (size > 0) {
                z zVar = (z) sVar.D(i2 + size);
                int i3 = zVar.c;
                if (i3 == 1) {
                    this.c2 = s0.a.a.o0.E(zVar, false);
                } else if (i3 == 2) {
                    this.d2 = s0.a.a.o0.E(zVar, false);
                } else if (i3 != 3) {
                    StringBuilder P0 = a.P0("Unknown tag encountered in structure: ");
                    P0.append(zVar.c);
                    throw new IllegalArgumentException(P0.toString());
                } else if (!z) {
                    this.e2 = v.t(s.C(zVar, true));
                } else {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                size--;
            }
            return;
        }
        throw new IllegalArgumentException("version 1 certificate contains extra data");
    }

    public static o0 s(Object obj) {
        if (obj instanceof o0) {
            return (o0) obj;
        }
        if (obj != null) {
            return new o0(s.B(obj));
        }
        return null;
    }

    public r c() {
        if (g.a("org.bouncycastle.x509.allow_non-der_tbscert") == null) {
            return this.c;
        }
        if (g.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return this.c;
        }
        f fVar = new f(10);
        if (!this.d.F(b.a)) {
            fVar.a(new e1(true, 0, this.d));
        }
        fVar.a(this.q);
        fVar.a(this.x);
        fVar.a(this.y);
        f fVar2 = new f(2);
        fVar2.a(this.Y1);
        fVar2.a(this.Z1);
        fVar.a(new b1(fVar2));
        e eVar = this.a2;
        if (eVar == null) {
            eVar = new b1();
        }
        fVar.a(eVar);
        fVar.a(this.b2);
        s0.a.a.o0 o0Var = this.c2;
        if (o0Var != null) {
            fVar.a(new e1(false, 1, o0Var));
        }
        s0.a.a.o0 o0Var2 = this.d2;
        if (o0Var2 != null) {
            fVar.a(new e1(false, 2, o0Var2));
        }
        v vVar = this.e2;
        if (vVar != null) {
            fVar.a(new e1(true, 3, vVar));
        }
        return new b1(fVar);
    }
}
