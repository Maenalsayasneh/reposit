package r0;

import java.io.IOException;
import m0.n.b.i;

/* compiled from: ForwardingSource.kt */
public abstract class k implements y {
    public final y c;

    public k(y yVar) {
        i.e(yVar, "delegate");
        this.c = yVar;
    }

    public void close() throws IOException {
        this.c.close();
    }

    public z d() {
        return this.c.d();
    }

    public long q0(f fVar, long j) throws IOException {
        i.e(fVar, "sink");
        return this.c.q0(fVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.c + ')';
    }
}
