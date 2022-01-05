package io.reactivex.internal.operators.observable;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.o;
import k0.b.p;
import k0.b.q;
import k0.b.z.c.b;
import k0.b.z.c.e;
import k0.b.z.e.c.a;
import k0.b.z.g.i;

public final class ObservableObserveOn<T> extends a<T, T> {
    public final q d;
    public final boolean q;
    public final int x;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements p<T>, Runnable {
        public k0.b.w.a Y1;
        public Throwable Z1;
        public volatile boolean a2;
        public volatile boolean b2;
        public final p<? super T> c;
        public int c2;
        public final q.c d;
        public boolean d2;
        public final boolean q;
        public final int x;
        public e<T> y;

        public ObserveOnObserver(p<? super T> pVar, q.c cVar, boolean z, int i) {
            this.c = pVar;
            this.d = cVar;
            this.q = z;
            this.x = i;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.Y1, aVar)) {
                this.Y1 = aVar;
                if (aVar instanceof b) {
                    b bVar = (b) aVar;
                    int requestFusion = bVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.c2 = requestFusion;
                        this.y = bVar;
                        this.a2 = true;
                        this.c.a(this);
                        d();
                        return;
                    } else if (requestFusion == 2) {
                        this.c2 = requestFusion;
                        this.y = bVar;
                        this.c.a(this);
                        return;
                    }
                }
                this.y = new k0.b.z.f.a(this.x);
                this.c.a(this);
            }
        }

        public void b(T t) {
            if (!this.a2) {
                if (this.c2 != 2) {
                    this.y.offer(t);
                }
                d();
            }
        }

        public boolean c(boolean z, boolean z2, p<? super T> pVar) {
            if (this.b2) {
                this.y.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.Z1;
                if (this.q) {
                    if (!z2) {
                        return false;
                    }
                    this.b2 = true;
                    if (th != null) {
                        pVar.onError(th);
                    } else {
                        pVar.onComplete();
                    }
                    this.d.dispose();
                    return true;
                } else if (th != null) {
                    this.b2 = true;
                    this.y.clear();
                    pVar.onError(th);
                    this.d.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.b2 = true;
                    pVar.onComplete();
                    this.d.dispose();
                    return true;
                }
            }
        }

        public void clear() {
            this.y.clear();
        }

        public void d() {
            if (getAndIncrement() == 0) {
                this.d.b(this);
            }
        }

        public void dispose() {
            if (!this.b2) {
                this.b2 = true;
                this.Y1.dispose();
                this.d.dispose();
                if (!this.d2 && getAndIncrement() == 0) {
                    this.y.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.b2;
        }

        public boolean isEmpty() {
            return this.y.isEmpty();
        }

        public void onComplete() {
            if (!this.a2) {
                this.a2 = true;
                d();
            }
        }

        public void onError(Throwable th) {
            if (this.a2) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.Z1 = th;
            this.a2 = true;
            d();
        }

        public T poll() throws Exception {
            return this.y.poll();
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.d2 = true;
            return 2;
        }

        public void run() {
            if (this.d2) {
                int i = 1;
                while (!this.b2) {
                    boolean z = this.a2;
                    Throwable th = this.Z1;
                    if (this.q || !z || th == null) {
                        this.c.b(null);
                        if (z) {
                            this.b2 = true;
                            Throwable th2 = this.Z1;
                            if (th2 != null) {
                                this.c.onError(th2);
                            } else {
                                this.c.onComplete();
                            }
                            this.d.dispose();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.b2 = true;
                        this.c.onError(this.Z1);
                        this.d.dispose();
                        return;
                    }
                }
                return;
            }
            e<T> eVar = this.y;
            p<? super T> pVar = this.c;
            int i2 = 1;
            while (!c(this.a2, eVar.isEmpty(), pVar)) {
                while (true) {
                    boolean z2 = this.a2;
                    try {
                        T poll = eVar.poll();
                        boolean z3 = poll == null;
                        if (!c(z2, z3, pVar)) {
                            if (z3) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                pVar.b(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        h.c4(th3);
                        this.b2 = true;
                        this.Y1.dispose();
                        eVar.clear();
                        pVar.onError(th3);
                        this.d.dispose();
                        return;
                    }
                }
            }
        }
    }

    public ObservableObserveOn(o<T> oVar, q qVar, boolean z, int i) {
        super(oVar);
        this.d = qVar;
        this.q = z;
        this.x = i;
    }

    public void u(p<? super T> pVar) {
        q qVar = this.d;
        if (qVar instanceof i) {
            this.c.c(pVar);
            return;
        }
        this.c.c(new ObserveOnObserver(pVar, qVar.a(), this.q, this.x));
    }
}
