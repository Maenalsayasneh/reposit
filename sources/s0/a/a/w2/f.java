package s0.a.a.w2;

import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class f extends m {
    public b c;
    public o d;

    public f(b bVar, byte[] bArr) {
        this.c = bVar;
        this.d = new x0(bArr);
    }

    public f(s sVar) {
        Enumeration E = sVar.E();
        this.c = b.s(E.nextElement());
        this.d = o.B(E.nextElement());
    }

    public static f s(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(s.B(obj));
        }
        return null;
    }

    public r c() {
        s0.a.a.f fVar = new s0.a.a.f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
