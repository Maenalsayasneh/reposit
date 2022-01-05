package n0.a.f2;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import n0.a.d;
import n0.a.j2.b;

/* compiled from: ChannelCoroutine.kt */
public class e<E> extends d<i> implements d<E> {
    public final d<E> q;

    public e(m0.l.e eVar, d<E> dVar, boolean z, boolean z2) {
        super(eVar, z, z2);
        this.q = dVar;
    }

    public void L(Throwable th) {
        CancellationException q02 = JobSupport.q0(this, th, (String) null, 1, (Object) null);
        this.q.b(q02);
        K(q02);
    }

    public final void b(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(Q(), (Throwable) null, this);
            }
            CancellationException q02 = JobSupport.q0(this, cancellationException, (String) null, 1, (Object) null);
            this.q.b(q02);
            K(q02);
        }
    }

    public b<E> g() {
        return this.q.g();
    }

    public b<g<E>> h() {
        return this.q.h();
    }

    public b<E> j() {
        return this.q.j();
    }

    public Object m() {
        return this.q.m();
    }

    public Object n(c<? super g<? extends E>> cVar) {
        Object n = this.q.n(cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    public boolean o(Throwable th) {
        return this.q.o(th);
    }

    public boolean offer(E e) {
        return this.q.offer(e);
    }

    public void r(l<? super Throwable, i> lVar) {
        this.q.r(lVar);
    }

    public Object s(E e) {
        return this.q.s(e);
    }

    public Object t(E e, c<? super i> cVar) {
        return this.q.t(e, cVar);
    }

    public boolean u() {
        return this.q.u();
    }
}
