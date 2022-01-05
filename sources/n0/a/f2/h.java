package n0.a.f2;

import i0.d.a.a.a;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import n0.a.h2.k;
import n0.a.h2.t;
import n0.a.o;

/* compiled from: AbstractChannel.kt */
public final class h<E> extends q implements o<E> {
    public final Throwable x;

    public h(Throwable th) {
        this.x = th;
    }

    public void H() {
    }

    public Object J() {
        return this;
    }

    public void K(h<?> hVar) {
    }

    public t L(k.c cVar) {
        t tVar = o.a;
        if (cVar != null) {
            cVar.c.e(cVar);
        }
        return tVar;
    }

    public final Throwable N() {
        Throwable th = this.x;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    public final Throwable P() {
        Throwable th = this.x;
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    public Object d() {
        return this;
    }

    public void k(E e) {
    }

    public t o(E e, k.c cVar) {
        return o.a;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Closed@");
        P0.append(m0.r.t.a.r.m.a1.a.M1(this));
        P0.append('[');
        P0.append(this.x);
        P0.append(']');
        return P0.toString();
    }
}
