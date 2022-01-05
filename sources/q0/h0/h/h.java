package q0.h0.h;

import com.stripe.android.model.Stripe3ds2AuthParams;
import q0.f0;
import q0.y;
import r0.i;

/* compiled from: RealResponseBody.kt */
public final class h extends f0 {
    public final String c;
    public final long d;
    public final i q;

    public h(String str, long j, i iVar) {
        m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c = str;
        this.d = j;
        this.q = iVar;
    }

    public long contentLength() {
        return this.d;
    }

    public y contentType() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        y.a aVar = y.c;
        return y.a.b(str);
    }

    public i source() {
        return this.q;
    }
}
