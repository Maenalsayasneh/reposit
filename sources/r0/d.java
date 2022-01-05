package r0;

import i0.d.a.a.a;
import java.io.IOException;
import m0.n.b.i;

/* compiled from: AsyncTimeout.kt */
public final class d implements y {
    public final /* synthetic */ b c;
    public final /* synthetic */ y d;

    public d(b bVar, y yVar) {
        this.c = bVar;
        this.d = yVar;
    }

    public void close() {
        b bVar = this.c;
        bVar.h();
        try {
            this.d.close();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.i();
        }
    }

    public z d() {
        return this.c;
    }

    public long q0(f fVar, long j) {
        i.e(fVar, "sink");
        b bVar = this.c;
        bVar.h();
        try {
            long q02 = this.d.q0(fVar, j);
            if (!bVar.i()) {
                return q02;
            }
            throw bVar.j((IOException) null);
        } catch (IOException e) {
            e = e;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.i();
        }
    }

    public String toString() {
        StringBuilder P0 = a.P0("AsyncTimeout.source(");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }
}
