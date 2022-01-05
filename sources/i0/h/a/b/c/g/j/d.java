package i0.h.a.b.c.g.j;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.a.b;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.g.h;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class d<R extends h, A extends a.b> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@RecentlyNonNull a<?> aVar, @RecentlyNonNull c cVar) {
        super(cVar);
        v.A(cVar, "GoogleApiClient must not be null");
        v.A(aVar, "Api must not be null");
    }

    public abstract void i(@RecentlyNonNull A a) throws RemoteException;

    public final void j(@RecentlyNonNull Status status) {
        v.u(!status.I0(), "Failed result must not be success");
        e(b(status));
    }
}
