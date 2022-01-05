package k0.b.z.d;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.p;
import k0.b.z.c.b;

/* compiled from: BasicFuseableObserver */
public abstract class a<T, R> implements p<T>, b<R> {
    public final p<? super R> c;
    public k0.b.w.a d;
    public b<T> q;
    public boolean x;
    public int y;

    public a(p<? super R> pVar) {
        this.c = pVar;
    }

    public final void a(k0.b.w.a aVar) {
        if (DisposableHelper.validate(this.d, aVar)) {
            this.d = aVar;
            if (aVar instanceof b) {
                this.q = (b) aVar;
            }
            this.c.a(this);
        }
    }

    public final int c(int i) {
        b<T> bVar = this.q;
        if (bVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = bVar.requestFusion(i);
        if (requestFusion != 0) {
            this.y = requestFusion;
        }
        return requestFusion;
    }

    public void clear() {
        this.q.clear();
    }

    public void dispose() {
        this.d.dispose();
    }

    public boolean isDisposed() {
        return this.d.isDisposed();
    }

    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.x) {
            this.x = true;
            this.c.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.x) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.x = true;
        this.c.onError(th);
    }
}
