package m0.s;

import i0.j.f.p.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.l.c;
import m0.l.e;
import m0.n.b.s.a;

/* compiled from: SequenceBuilder.kt */
public final class i<T> extends j<T> implements Iterator<T>, c<m0.i>, a {
    public int c;
    public T d;
    public c<? super m0.i> q;

    public Object a(T t, c<? super m0.i> cVar) {
        this.d = t;
        this.c = 3;
        this.q = cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineSingletons == coroutineSingletons) {
            m0.n.b.i.e(cVar, "frame");
        }
        if (coroutineSingletons == coroutineSingletons) {
            return coroutineSingletons;
        }
        return m0.i.a;
    }

    public final Throwable d() {
        int i = this.c;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected state of the iterator: ");
        P0.append(this.c);
        return new IllegalStateException(P0.toString());
    }

    public e getContext() {
        return EmptyCoroutineContext.c;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.c;
            i iVar = null;
            if (i != 0) {
                if (i == 1) {
                    m0.n.b.i.c(iVar);
                    if (iVar.hasNext()) {
                        this.c = 2;
                        return true;
                    }
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
            }
            this.c = 5;
            c<? super m0.i> cVar = this.q;
            m0.n.b.i.c(cVar);
            this.q = iVar;
            cVar.resumeWith(m0.i.a);
        }
    }

    public T next() {
        int i = this.c;
        if (i != 0 && i != 1) {
            T t = null;
            if (i == 2) {
                this.c = 1;
                m0.n.b.i.c(t);
                return t.next();
            } else if (i == 3) {
                this.c = 0;
                T t2 = this.d;
                this.d = t;
                return t2;
            } else {
                throw d();
            }
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        h.d4(obj);
        this.c = 4;
    }
}
