package s0.a.a;

import java.io.IOException;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class w0 extends r implements y {
    public final byte[] c;

    public w0(byte[] bArr) {
        this.c = bArr;
    }

    public String e() {
        return j.a(this.c);
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof w0)) {
            return false;
        }
        return Arrays.equals(this.c, ((w0) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 18, this.c);
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
