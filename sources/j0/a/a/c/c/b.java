package j0.a.a.c.c;

import android.content.Context;
import h0.q.k0;
import h0.q.m0;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.a.a.c.c.c;

/* compiled from: ActivityRetainedComponentManager */
public class b implements m0.b {
    public final /* synthetic */ Context a;

    public b(c cVar, Context context) {
        this.a = context;
    }

    public <T extends k0> T create(Class<T> cls) {
        return new c.b(new l.c(((l.b) ((c.a) h.L0(this.a.getApplicationContext(), c.a.class)).i()).a, (l.a) null));
    }
}
