package i0.h.a.d.a.e;

import java.io.IOException;
import java.io.InputStream;

public final class s extends r {
    public final r c;
    public final long d;
    public final long q;

    public s(r rVar, long j, long j2) {
        this.c = rVar;
        long e = e(j);
        this.d = e;
        this.q = e(e + j2);
    }

    public final long a() {
        return this.q - this.d;
    }

    public final InputStream b(long j, long j2) throws IOException {
        long e = e(this.d);
        return this.c.b(e, e(j2 + e) - e);
    }

    public final void close() throws IOException {
    }

    public final long e(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.c.a() ? this.c.a() : j;
    }
}
