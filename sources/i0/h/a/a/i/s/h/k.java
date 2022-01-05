package i0.h.a.a.i.s.h;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import h0.b0.v;
import i0.h.a.a.i.h;
import i0.h.a.a.i.p.a;
import i0.h.a.a.i.p.e;
import i0.h.a.a.i.p.l;
import i0.h.a.a.i.s.i.c;
import i0.h.a.a.i.t.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: Uploader */
public class k {
    public final Context a;
    public final e b;
    public final c c;
    public final q d;
    public final Executor e;
    public final a f;
    public final i0.h.a.a.i.u.a g;

    public k(Context context, e eVar, c cVar, q qVar, Executor executor, a aVar, i0.h.a.a.i.u.a aVar2) {
        this.a = context;
        this.b = eVar;
        this.c = cVar;
        this.d = qVar;
        this.e = executor;
        this.f = aVar;
        this.g = aVar2;
    }

    public void a(h hVar, int i) {
        BackendResponse a2;
        l lVar = this.b.get(hVar.b());
        Iterable<i0.h.a.a.i.s.i.h> iterable = (Iterable) this.f.a(new g(this, hVar));
        if (iterable.iterator().hasNext()) {
            if (lVar == null) {
                v.S("Uploader", "Unknown backend for %s, deleting event batch for it...", hVar);
                a2 = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (i0.h.a.a.i.s.i.h a3 : iterable) {
                    arrayList.add(a3.a());
                }
                byte[] c2 = hVar.c();
                if (1 != 0) {
                    a2 = lVar.a(new i0.h.a.a.i.p.a(arrayList, c2, (a.C0126a) null));
                } else {
                    throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", ""));
                }
            }
            this.f.a(new h(this, a2, iterable, hVar, i));
        }
    }
}
