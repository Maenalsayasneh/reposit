package s0.a.a.c3;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;

public class m0 extends m {
    public b c;
    public o0 d;

    public m0(b bVar, e eVar) throws IOException {
        this.d = new o0(eVar);
        this.c = bVar;
    }

    public m0(b bVar, byte[] bArr) {
        this.d = new o0(bArr);
        this.c = bVar;
    }

    public m0(s sVar) {
        if (sVar.size() == 2) {
            Enumeration E = sVar.E();
            this.c = b.s(E.nextElement());
            this.d = o0.D(E.nextElement());
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public static m0 s(Object obj) {
        if (obj instanceof m0) {
            return (m0) obj;
        }
        if (obj != null) {
            return new m0(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }

    public r t() throws IOException {
        return r.x(this.d.C());
    }
}
