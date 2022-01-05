package i0.h.c.t;

import android.content.Context;
import android.content.Intent;
import i0.h.a.b.c.m.b;
import i0.h.a.b.m.a;
import i0.h.a.b.m.g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class j implements a {
    public final Context a;
    public final Intent b;

    public j(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public Object a(g gVar) {
        return (!b.U() || ((Integer) gVar.j()).intValue() != 402) ? gVar : o.a(this.a, this.b).g(m.c, n.a);
    }
}
