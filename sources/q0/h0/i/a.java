package q0.h0.i;

import com.stripe.android.model.Stripe3ds2AuthParams;
import q0.v;
import r0.i;

/* compiled from: HeadersReader.kt */
public final class a {
    public long a = ((long) 262144);
    public final i b;

    public a(i iVar) {
        m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.b = iVar;
    }

    public final v a() {
        v.a aVar = new v.a();
        while (true) {
            String b2 = b();
            if (b2.length() == 0) {
                return aVar.d();
            }
            aVar.b(b2);
        }
    }

    public final String b() {
        String D = this.b.D(this.a);
        this.a -= (long) D.length();
        return D;
    }
}
