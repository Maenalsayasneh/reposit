package i0.h.a.b.c.g.j;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.h;
import i0.h.a.b.m.i;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class n0<ResultT> extends k0 {
    public final n<a.b, ResultT> b;
    public final h<ResultT> c;
    public final a d;

    public n0(int i, n<a.b, ResultT> nVar, h<ResultT> hVar, a aVar) {
        super(i);
        this.c = hVar;
        this.b = nVar;
        this.d = aVar;
        if (i == 2 && nVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void b(Status status) {
        h<ResultT> hVar = this.c;
        Objects.requireNonNull(this.d);
        hVar.a(v.i0(status));
    }

    public final void c(f.a<?> aVar) throws DeadObjectException {
        try {
            n<a.b, ResultT> nVar = this.b;
            ((i0) nVar).d.a.a(aVar.b, this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            Status a = p.a(e2);
            h<ResultT> hVar = this.c;
            Objects.requireNonNull(this.d);
            hVar.a(v.i0(a));
        } catch (RuntimeException e3) {
            this.c.a(e3);
        }
    }

    public final void d(q0 q0Var, boolean z) {
        h<ResultT> hVar = this.c;
        q0Var.b.put(hVar, Boolean.valueOf(z));
        b0<TResult> b0Var = hVar.a;
        r0 r0Var = new r0(q0Var, hVar);
        Objects.requireNonNull(b0Var);
        b0Var.c(i.a, r0Var);
    }

    public final void e(Exception exc) {
        this.c.a(exc);
    }

    public final Feature[] f(f.a<?> aVar) {
        return this.b.a;
    }

    public final boolean g(f.a<?> aVar) {
        return this.b.b;
    }
}
