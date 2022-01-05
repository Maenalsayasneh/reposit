package s0.a.a.w2;

import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class l extends m {
    public static final b c = new b(n.Y, v0.c);
    public final o d;
    public final k q;
    public final k x;
    public final b y;

    public l(s sVar) {
        Enumeration E = sVar.E();
        this.d = (o) E.nextElement();
        this.q = (k) E.nextElement();
        if (E.hasMoreElements()) {
            Object nextElement = E.nextElement();
            if (nextElement instanceof k) {
                this.x = k.B(nextElement);
                nextElement = E.hasMoreElements() ? E.nextElement() : null;
            } else {
                this.x = null;
            }
            if (nextElement != null) {
                this.y = b.s(nextElement);
                return;
            }
        } else {
            this.x = null;
        }
        this.y = null;
    }

    public l(byte[] bArr, int i, int i2, b bVar) {
        this.d = new x0(h3.I(bArr));
        this.q = new k((long) i);
        this.x = i2 > 0 ? new k((long) i2) : null;
        this.y = bVar;
    }

    public static l s(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(4);
        fVar.a(this.d);
        fVar.a(this.q);
        k kVar = this.x;
        if (kVar != null) {
            fVar.a(kVar);
        }
        b bVar = this.y;
        if (bVar != null && !bVar.equals(c)) {
            fVar.a(this.y);
        }
        return new b1(fVar);
    }

    public BigInteger t() {
        return this.q.E();
    }

    public BigInteger u() {
        k kVar = this.x;
        if (kVar != null) {
            return kVar.E();
        }
        return null;
    }

    public b v() {
        b bVar = this.y;
        return bVar != null ? bVar : c;
    }
}
