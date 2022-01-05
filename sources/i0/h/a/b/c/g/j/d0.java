package i0.h.a.b.c.g.j;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.k.b.b;
import i0.h.a.b.k.d;
import i0.h.a.b.k.g;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class d0 extends b implements c.a, c.b {
    public static a.C0131a<? extends g, i0.h.a.b.k.a> a = d.c;
    public final Context b;
    public final Handler c;
    public final a.C0131a<? extends g, i0.h.a.b.k.a> d;
    public Set<Scope> e;
    public i0.h.a.b.c.i.c f;
    public g g;
    public g0 h;

    public d0(Context context, Handler handler, i0.h.a.b.c.i.c cVar) {
        a.C0131a<? extends g, i0.h.a.b.k.a> aVar = a;
        this.b = context;
        this.c = handler;
        v.A(cVar, "ClientSettings must not be null");
        this.f = cVar;
        this.e = cVar.b;
        this.d = aVar;
    }

    public final void L(int i) {
        this.g.g();
    }

    public final void d0(ConnectionResult connectionResult) {
        ((f.c) this.h).b(connectionResult);
    }

    public final void j0(Bundle bundle) {
        this.g.m(this);
    }
}
