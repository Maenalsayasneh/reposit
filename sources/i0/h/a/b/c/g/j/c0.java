package i0.h.a.b.c.g.j;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.m.h;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class c0<T> extends k0 {
    public final h<T> b;

    public c0(int i, h<T> hVar) {
        super(i);
        this.b = hVar;
    }

    public void b(Status status) {
        this.b.a(new ApiException(status));
    }

    public final void c(f.a<?> aVar) throws DeadObjectException {
        try {
            h(aVar);
        } catch (DeadObjectException e) {
            this.b.a(new ApiException(p.a(e)));
            throw e;
        } catch (RemoteException e2) {
            this.b.a(new ApiException(p.a(e2)));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public void e(Exception exc) {
        this.b.a(exc);
    }

    public abstract void h(f.a<?> aVar) throws RemoteException;
}
