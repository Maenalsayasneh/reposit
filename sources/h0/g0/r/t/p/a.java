package h0.g0.r.t.p;

import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.DirectExecutor;
import java.util.Objects;

/* compiled from: SettableFuture */
public final class a<V> extends AbstractFuture<V> {
    public boolean j(V v) {
        if (v == null) {
            v = AbstractFuture.x;
        }
        if (!AbstractFuture.q.b(this, (Object) null, v)) {
            return false;
        }
        AbstractFuture.c(this);
        return true;
    }

    public boolean k(Throwable th) {
        Objects.requireNonNull(th);
        if (!AbstractFuture.q.b(this, (Object) null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.c(this);
        return true;
    }

    public boolean l(i0.h.b.a.a.a<? extends V> aVar) {
        AbstractFuture.f fVar;
        AbstractFuture.Failure failure;
        Objects.requireNonNull(aVar);
        Object obj = this.y;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!AbstractFuture.q.b(this, (Object) null, AbstractFuture.f(aVar))) {
                    return false;
                }
                AbstractFuture.c(this);
            } else {
                fVar = new AbstractFuture.f(this, aVar);
                if (AbstractFuture.q.b(this, (Object) null, fVar)) {
                    try {
                        aVar.a(fVar, DirectExecutor.INSTANCE);
                    } catch (Throwable unused) {
                        failure = AbstractFuture.Failure.a;
                    }
                } else {
                    obj = this.y;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.c)) {
            return false;
        }
        aVar.cancel(((AbstractFuture.c) obj).c);
        return false;
        AbstractFuture.q.b(this, fVar, failure);
        return true;
    }
}
