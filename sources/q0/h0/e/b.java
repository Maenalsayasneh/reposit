package q0.h0.e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import q0.h0.c;
import r0.f;
import r0.h;
import r0.i;
import r0.y;
import r0.z;

/* compiled from: CacheInterceptor.kt */
public final class b implements y {
    public boolean c;
    public final /* synthetic */ i d;
    public final /* synthetic */ c q;
    public final /* synthetic */ h x;

    public b(i iVar, c cVar, h hVar) {
        this.d = iVar;
        this.q = cVar;
        this.x = hVar;
    }

    public void close() throws IOException {
        if (!this.c && !c.h(this, 100, TimeUnit.MILLISECONDS)) {
            this.c = true;
            this.q.a();
        }
        this.d.close();
    }

    public z d() {
        return this.d.d();
    }

    public long q0(f fVar, long j) throws IOException {
        m0.n.b.i.e(fVar, "sink");
        try {
            long q02 = this.d.q0(fVar, j);
            if (q02 == -1) {
                if (!this.c) {
                    this.c = true;
                    this.x.close();
                }
                return -1;
            }
            fVar.f(this.x.c(), fVar.d - q02, q02);
            this.x.A();
            return q02;
        } catch (IOException e) {
            if (!this.c) {
                this.c = true;
                this.q.a();
            }
            throw e;
        }
    }
}
