package s0.a.a;

import java.io.IOException;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class h1 extends r implements y {
    public final byte[] c;

    public h1(byte[] bArr) {
        this.c = h3.I(bArr);
    }

    public String e() {
        return j.a(this.c);
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof h1)) {
            return false;
        }
        return Arrays.equals(this.c, ((h1) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 21, this.c);
    }

    public int u() {
        return a2.a(this.c.length) + 1 + this.c.length;
    }

    public boolean y() {
        return false;
    }
}
