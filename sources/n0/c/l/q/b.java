package n0.c.l.q;

import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import m0.d;
import m0.e;
import m0.f;
import m0.h;
import m0.n.b.i;

/* compiled from: TreeJsonEncoder.kt */
public final class b extends n0.c.j.b {
    public final n0.c.m.b a;
    public final /* synthetic */ AbstractJsonTreeEncoder b;
    public final /* synthetic */ String c;

    public b(AbstractJsonTreeEncoder abstractJsonTreeEncoder, String str) {
        this.b = abstractJsonTreeEncoder;
        this.c = str;
        this.a = abstractJsonTreeEncoder.d.b.k;
    }

    public void C(long j) {
        J(f.a(j));
    }

    public final void J(String str) {
        i.e(str, "s");
        this.b.O(this.c, new n0.c.l.i(str, false));
    }

    public n0.c.m.b a() {
        return this.a;
    }

    public void i(short s) {
        J(h.a(s));
    }

    public void j(byte b2) {
        J(d.a(b2));
    }

    public void x(int i) {
        J(e.a(i));
    }
}
