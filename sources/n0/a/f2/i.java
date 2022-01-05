package n0.a.f2;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.UndeliveredElementException;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.h2.k;
import n0.a.h2.t;
import n0.a.j2.c;
import n0.a.j2.d;

/* compiled from: ConflatedChannel.kt */
public class i<E> extends AbstractChannel<E> {
    public final ReentrantLock x = new ReentrantLock();
    public Object y = a.a;

    public i(l<? super E, m0.i> lVar) {
        super(lVar);
    }

    /* JADX INFO: finally extract failed */
    public void B(boolean z) {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            UndeliveredElementException F = F(a.a);
            reentrantLock.unlock();
            super.B(z);
            if (F != null) {
                throw F;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Object D() {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            Object obj = this.y;
            t tVar = a.a;
            if (obj == tVar) {
                Object f = f();
                if (f == null) {
                    f = a.d;
                }
                return f;
            }
            this.y = tVar;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object E(c<?> cVar) {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            Object obj = this.y;
            t tVar = a.a;
            if (obj == tVar) {
                Object f = f();
                if (f == null) {
                    f = a.d;
                }
                return f;
            } else if (!cVar.e()) {
                Object obj2 = d.a;
                Object obj3 = d.b;
                reentrantLock.unlock();
                return obj3;
            } else {
                Object obj4 = this.y;
                this.y = tVar;
                reentrantLock.unlock();
                return obj4;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final UndeliveredElementException F(Object obj) {
        l<E, m0.i> lVar;
        Object obj2 = this.y;
        UndeliveredElementException undeliveredElementException = null;
        if (!(obj2 == a.a || (lVar = this.d) == null)) {
            undeliveredElementException = a.j0(lVar, obj2, (UndeliveredElementException) null, 2);
        }
        this.y = obj;
        return undeliveredElementException;
    }

    public String d() {
        StringBuilder P0 = i0.d.a.a.a.P0("(value=");
        P0.append(this.y);
        P0.append(')');
        return P0.toString();
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    public Object p(E e) {
        o q;
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            h<?> f = f();
            if (f == null) {
                if (this.y == a.a) {
                    do {
                        q = q();
                        if (q != null) {
                            if (q instanceof h) {
                                reentrantLock.unlock();
                                return q;
                            }
                        }
                    } while (q.o(e, (k.c) null) == null);
                    reentrantLock.unlock();
                    q.k(e);
                    return q.d();
                }
                UndeliveredElementException F = F(e);
                if (F == null) {
                    t tVar = a.b;
                    reentrantLock.unlock();
                    return tVar;
                }
                throw F;
            }
            reentrantLock.unlock();
            return f;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean x(m<? super E> mVar) {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            return super.x(mVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean y() {
        return false;
    }

    public final boolean z() {
        return this.y == a.a;
    }
}
