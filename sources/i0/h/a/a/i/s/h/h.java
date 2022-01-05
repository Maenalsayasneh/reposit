package i0.h.a.a.i.s.h;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import i0.h.a.a.i.t.a;

/* compiled from: Uploader */
public final /* synthetic */ class h implements a.C0128a {
    public final k a;
    public final BackendResponse b;
    public final Iterable c;
    public final i0.h.a.a.i.h d;
    public final int e;

    public h(k kVar, BackendResponse backendResponse, Iterable iterable, i0.h.a.a.i.h hVar, int i) {
        this.a = kVar;
        this.b = backendResponse;
        this.c = iterable;
        this.d = hVar;
        this.e = i;
    }

    public Object execute() {
        k kVar = this.a;
        BackendResponse backendResponse = this.b;
        Iterable iterable = this.c;
        i0.h.a.a.i.h hVar = this.d;
        int i = this.e;
        if (backendResponse.c() == BackendResponse.Status.TRANSIENT_ERROR) {
            kVar.c.x0(iterable);
            kVar.d.a(hVar, i + 1);
            return null;
        }
        kVar.c.h(iterable);
        if (backendResponse.c() == BackendResponse.Status.OK) {
            kVar.c.s(hVar, backendResponse.b() + kVar.g.a());
        }
        if (!kVar.c.t0(hVar)) {
            return null;
        }
        kVar.d.a(hVar, 1);
        return null;
    }
}
