package s0.a.a.g2;

import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class c extends m {
    public o c;
    public n d;

    public c(s sVar) {
        Enumeration E = sVar.E();
        this.c = (o) E.nextElement();
        this.d = (n) E.nextElement();
    }

    public c(byte[] bArr, n nVar) {
        this.c = new x0(bArr);
        this.d = nVar;
    }

    public static c s(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
