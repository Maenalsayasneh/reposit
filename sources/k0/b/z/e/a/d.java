package k0.b.z.e.a;

import i0.j.f.p.h;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import k0.b.a;
import k0.b.c;
import k0.b.e;

/* compiled from: CompletableMergeDelayErrorIterable */
public final class d extends a {
    public final Iterable<? extends e> a;

    public d(Iterable<? extends e> iterable) {
        this.a = iterable;
    }

    public void e(c cVar) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        cVar.a(compositeDisposable);
        try {
            Iterator<? extends e> it = this.a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            Throwable b = atomicThrowable.b();
                            if (b == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(b);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!compositeDisposable.isDisposed()) {
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                            e eVar = (e) next;
                            if (!compositeDisposable.isDisposed()) {
                                atomicInteger.getAndIncrement();
                                eVar.a(new c(cVar, compositeDisposable, atomicThrowable, atomicInteger));
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            h.c4(th);
                            atomicThrowable.a(th);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    h.c4(th2);
                    atomicThrowable.a(th2);
                }
            }
        } catch (Throwable th3) {
            h.c4(th3);
            cVar.onError(th3);
        }
    }
}
