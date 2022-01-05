package s0.a.a;

import java.io.IOException;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class d1 extends r implements y {
    public byte[] c;

    public d1(byte[] bArr) {
        this.c = h3.I(bArr);
    }

    public String e() {
        return j.a(this.c);
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof d1)) {
            return false;
        }
        return Arrays.equals(this.c, ((d1) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 20, this.c);
    }

    public String toString() {
        return e();
    }

    public int u() {
        return a2.a(this.c.length) + 1 + this.c.length;
    }

    public boolean y() {
        return false;
    }
}
