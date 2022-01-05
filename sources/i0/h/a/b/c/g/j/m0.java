package i0.h.a.b.c.g.j;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.m.h;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class m0 extends c0<Boolean> {
    public final i<?> c;

    public m0(i<?> iVar, h<Boolean> hVar) {
        super(4, hVar);
        this.c = iVar;
    }

    public final /* bridge */ /* synthetic */ void d(q0 q0Var, boolean z) {
    }

    public final Feature[] f(f.a<?> aVar) {
        if (aVar.f.get(this.c) == null) {
            return null;
        }
        throw null;
    }

    public final boolean g(f.a<?> aVar) {
        if (aVar.f.get(this.c) == null) {
            return false;
        }
        throw null;
    }

    public final void h(f.a<?> aVar) throws RemoteException {
        if (aVar.f.remove(this.c) == null) {
            this.b.b(Boolean.FALSE);
            return;
        }
        throw null;
    }
}
