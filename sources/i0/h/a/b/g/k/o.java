package i0.h.a.b.g.k;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import h0.b0.v;
import i0.h.a.b.m.h;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class o extends n {
    public final h<Boolean> a;

    public o(h<Boolean> hVar) {
        this.a = hVar;
    }

    public final void q(Status status, boolean z, Bundle bundle) {
        v.X1(status, Boolean.valueOf(z), this.a);
    }

    public final void y(int i, boolean z, Bundle bundle) {
        v.X1(new Status(i, (String) null), Boolean.valueOf(z), this.a);
    }
}
