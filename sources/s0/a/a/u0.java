package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class u0 extends r implements y {
    public final byte[] c;

    public u0(String str) {
        Objects.requireNonNull(str, "'string' cannot be null");
        this.c = j.c(str);
    }

    public u0(byte[] bArr) {
        this.c = bArr;
    }

    public static u0 B(Object obj) {
        if (obj == null || (obj instanceof u0)) {
            return (u0) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (u0) r.x((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(a.b0(e, a.P0("encoding error in getInstance: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public String e() {
        return j.a(this.c);
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof u0)) {
            return false;
        }
        return Arrays.equals(this.c, ((u0) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 22, this.c);
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
