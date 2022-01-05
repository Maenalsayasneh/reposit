package s0.a.a.c3;

import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class r0 extends m {
    public s c;

    public r0(s sVar) {
        this.c = sVar;
    }

    public static r0 s(Object obj) {
        if (obj instanceof r0) {
            return (r0) obj;
        }
        if (obj != null) {
            return new r0(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }
}
