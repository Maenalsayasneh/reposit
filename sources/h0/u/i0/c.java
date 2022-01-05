package h0.u.i0;

import androidx.paging.multicast.Multicaster$channelManager$2;
import androidx.paging.multicast.Multicaster$flow$1;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import kotlin.LazyThreadSafetyMode;
import m0.i;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.s;

/* compiled from: Multicaster.kt */
public final class c<T> {
    public final m0.c a;
    public final d<T> b;
    public final f0 c;
    public final d<T> d;
    public final boolean e;
    public final p<T, m0.l.c<? super i>, Object> f;
    public final boolean g;

    public c(f0 f0Var, int i, d dVar, boolean z, p pVar, boolean z2, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        z = (i2 & 8) != 0 ? false : z;
        z2 = (i2 & 32) != 0 ? false : z2;
        m0.n.b.i.e(f0Var, "scope");
        m0.n.b.i.e(dVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        m0.n.b.i.e(pVar, "onEach");
        this.c = f0Var;
        this.d = dVar;
        this.e = z;
        this.f = pVar;
        this.g = z2;
        this.a = h.G2(LazyThreadSafetyMode.SYNCHRONIZED, new Multicaster$channelManager$2(this, i));
        this.b = new s(new Multicaster$flow$1(this, (m0.l.c) null));
    }
}
