package k0.b.z.e.a;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import k0.b.w.a;

/* compiled from: CompletableMergeDelayErrorArray */
public final class c implements k0.b.c {
    public final k0.b.c c;
    public final CompositeDisposable d;
    public final AtomicThrowable q;
    public final AtomicInteger x;

    public c(k0.b.c cVar, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
        this.c = cVar;
        this.d = compositeDisposable;
        this.q = atomicThrowable;
        this.x = atomicInteger;
    }

    public void a(a aVar) {
        this.d.add(aVar);
    }

    public void b() {
        if (this.x.decrementAndGet() == 0) {
            Throwable b = this.q.b();
            if (b == null) {
                this.c.onComplete();
            } else {
                this.c.onError(b);
            }
        }
    }

    public void onComplete() {
        b();
    }

    public void onError(Throwable th) {
        if (this.q.a(th)) {
            b();
        } else {
            RxJavaPlugins.onError(th);
        }
    }
}
