package k0.b.z.e.c;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;
import k0.b.l;
import k0.b.p;
import k0.b.z.d.b;

/* compiled from: ObservableFromIterable */
public final class i<T> extends l<T> {
    public final Iterable<? extends T> c;

    /* compiled from: ObservableFromIterable */
    public static final class a<T> extends b<T> {
        public boolean Y1;
        public final p<? super T> c;
        public final Iterator<? extends T> d;
        public volatile boolean q;
        public boolean x;
        public boolean y;

        public a(p<? super T> pVar, Iterator<? extends T> it) {
            this.c = pVar;
            this.d = it;
        }

        public void clear() {
            this.y = true;
        }

        public void dispose() {
            this.q = true;
        }

        public boolean isDisposed() {
            return this.q;
        }

        public boolean isEmpty() {
            return this.y;
        }

        public T poll() {
            if (this.y) {
                return null;
            }
            if (!this.Y1) {
                this.Y1 = true;
            } else if (!this.d.hasNext()) {
                this.y = true;
                return null;
            }
            T next = this.d.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.x = true;
            return 1;
        }
    }

    public i(Iterable<? extends T> iterable) {
        this.c = iterable;
    }

    public void u(p<? super T> pVar) {
        try {
            Iterator<? extends T> it = this.c.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete((p<?>) pVar);
                    return;
                }
                a aVar = new a(pVar, it);
                pVar.a(aVar);
                if (!aVar.x) {
                    while (!aVar.q) {
                        try {
                            Object next = aVar.d.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            aVar.c.b(next);
                            if (!aVar.q) {
                                try {
                                    if (!aVar.d.hasNext()) {
                                        if (!aVar.q) {
                                            aVar.c.onComplete();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    h.c4(th);
                                    aVar.c.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            h.c4(th2);
                            aVar.c.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                h.c4(th3);
                EmptyDisposable.error(th3, (p<?>) pVar);
            }
        } catch (Throwable th4) {
            h.c4(th4);
            EmptyDisposable.error(th4, (p<?>) pVar);
        }
    }
}
