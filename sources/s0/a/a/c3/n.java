package s0.a.a.c3;

import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;

public class n extends m {
    public s c;
    public o0 d;
    public b q;
    public o0 x;

    public n(s sVar) {
        this.c = sVar;
        if (sVar.size() == 3) {
            this.d = o0.s(sVar.D(0));
            this.q = b.s(sVar.D(1));
            this.x = o0.D(sVar.D(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static n s(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }
}
