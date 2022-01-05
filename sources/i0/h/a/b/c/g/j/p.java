package i0.h.a.b.c.g.j;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import i0.h.a.b.c.g.j.f;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class p {
    public final int a;

    public p(int i) {
        this.a = i;
    }

    public static Status a(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void b(Status status);

    public abstract void c(f.a<?> aVar) throws DeadObjectException;

    public abstract void d(q0 q0Var, boolean z);

    public abstract void e(Exception exc);
}
