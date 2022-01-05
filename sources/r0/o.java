package r0;

import java.io.IOException;
import java.io.InputStream;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: JvmOkio.kt */
public final class o implements y {
    public final InputStream c;
    public final z d;

    public o(InputStream inputStream, z zVar) {
        i.e(inputStream, "input");
        i.e(zVar, "timeout");
        this.c = inputStream;
        this.d = zVar;
    }

    public void close() {
        this.c.close();
    }

    public z d() {
        return this.d;
    }

    public long q0(f fVar, long j) {
        i.e(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.d.f();
                u E = fVar.E(1);
                int read = this.c.read(E.a, E.c, (int) Math.min(j, (long) (8192 - E.c)));
                if (read != -1) {
                    E.c += read;
                    long j2 = (long) read;
                    fVar.d += j2;
                    return j2;
                } else if (E.b != E.c) {
                    return -1;
                } else {
                    fVar.c = E.a();
                    v.a(E);
                    return -1;
                }
            } catch (AssertionError e) {
                if (a.s2(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
        }
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("source(");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }
}
