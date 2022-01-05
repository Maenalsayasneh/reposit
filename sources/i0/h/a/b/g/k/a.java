package i0.h.a.b.g.k;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import h0.b0.v;
import i0.h.a.b.m.h;
import i0.h.a.b.n.b;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class a extends n {
    public final h<PaymentData> a;

    public a(h<PaymentData> hVar) {
        this.a = hVar;
    }

    public final void R(Status status, PaymentData paymentData, Bundle bundle) {
        h<PaymentData> hVar = this.a;
        int i = b.c;
        if (status.I0()) {
            hVar.a.q(paymentData);
            return;
        }
        hVar.a.p(v.i0(status));
    }
}
