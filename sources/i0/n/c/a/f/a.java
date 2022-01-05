package i0.n.c.a.f;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import i0.n.a.c;
import m0.n.b.i;
import t0.v;

/* compiled from: IgnoredApiCallback.kt */
public final class a<Data> implements i0.n.c.a.e.d.a<Data> {
    public final c a = h.M2(this);

    public void a(Data data, v<Data> vVar) {
        i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        c cVar = this.a;
        h.s0(cVar, "onSuccess called with data: " + data, (Throwable) null, 2, (Object) null);
    }

    public void onError(Throwable th) {
        i.e(th, "t");
        c cVar = this.a;
        cVar.error("onError called with throwable: " + th, (Throwable) null);
    }
}
