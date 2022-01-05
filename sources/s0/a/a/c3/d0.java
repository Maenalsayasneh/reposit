package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;

public class d0 extends m {
    public o0 c;

    public d0(o0 o0Var) {
        this.c = o0Var;
    }

    public static d0 s(Object obj) {
        if (obj instanceof d0) {
            return (d0) obj;
        }
        if (obj != null) {
            return new d0(o0.D(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb;
        byte b;
        byte[] B = this.c.B();
        if (B.length == 1) {
            sb = a.P0("KeyUsage: 0x");
            b = B[0] & 255;
        } else {
            sb = a.P0("KeyUsage: 0x");
            b = (B[0] & 255) | ((B[1] & 255) << 8);
        }
        return a.R(b, sb);
    }
}
