package s0.a.a.w2;

import java.io.IOException;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.x0;
import s0.a.a.z;

public class p extends m {
    public k c;
    public b d;
    public o q;
    public v x;
    public s0.a.a.b y;

    public p(b bVar, e eVar, v vVar, byte[] bArr) throws IOException {
        this.c = new k(bArr != null ? s0.a.g.b.b : s0.a.g.b.a);
        this.d = bVar;
        this.q = new x0(eVar);
        this.x = vVar;
        this.y = bArr == null ? null : new o0(bArr);
    }

    public p(s sVar) {
        Enumeration E = sVar.E();
        k B = k.B(E.nextElement());
        this.c = B;
        int I = B.I();
        if (I < 0 || I > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        this.d = b.s(E.nextElement());
        this.q = o.B(E.nextElement());
        int i = -1;
        while (E.hasMoreElements()) {
            z zVar = (z) E.nextElement();
            int i2 = zVar.c;
            if (i2 > i) {
                if (i2 == 0) {
                    this.x = v.D(zVar, false);
                } else if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (I >= 1) {
                    this.y = o0.E(zVar, false);
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i = i2;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
    }

    public static p s(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj != null) {
            return new p(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(5);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        v vVar = this.x;
        if (vVar != null) {
            fVar.a(new e1(false, 0, vVar));
        }
        s0.a.a.b bVar = this.y;
        if (bVar != null) {
            fVar.a(new e1(false, 1, bVar));
        }
        return new b1(fVar);
    }

    public o t() {
        return new x0(this.q.c);
    }

    public e u() throws IOException {
        return r.x(this.q.c);
    }
}
