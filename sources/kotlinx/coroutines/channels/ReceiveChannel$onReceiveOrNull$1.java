package kotlinx.coroutines.channels;

import m0.n.a.p;
import n0.a.f2.n;
import n0.a.j2.b;
import n0.a.j2.c;

/* compiled from: Channel.kt */
public final class ReceiveChannel$onReceiveOrNull$1 implements b<E> {
    public final /* synthetic */ n<E> c;

    public ReceiveChannel$onReceiveOrNull$1(n<? extends E> nVar) {
        this.c = nVar;
    }

    public <R> void d(c<? super R> cVar, p<? super E, ? super m0.l.c<? super R>, ? extends Object> pVar) {
        this.c.h().d(cVar, new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(pVar, (m0.l.c<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1>) null));
    }
}
