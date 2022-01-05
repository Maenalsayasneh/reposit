package io.reactivex.internal.operators.observable;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.b0.c;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;
import k0.b.z.c.b;
import k0.b.z.e.c.a;

public final class ObservableConcatMap<T, U> extends a<T, U> {
    public final e<? super T, ? extends o<? extends U>> d;
    public final int q;
    public final ErrorMode x;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements p<T>, k0.b.w.a {
        public final boolean Y1;
        public k0.b.z.c.e<T> Z1;
        public k0.b.w.a a2;
        public volatile boolean b2;
        public final p<? super R> c;
        public volatile boolean c2;
        public final e<? super T, ? extends o<? extends R>> d;
        public volatile boolean d2;
        public int e2;
        public final int q;
        public final AtomicThrowable x = new AtomicThrowable();
        public final DelayErrorInnerObserver<R> y;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<k0.b.w.a> implements p<R> {
            public final p<? super R> c;
            public final ConcatMapDelayErrorObserver<?, R> d;

            public DelayErrorInnerObserver(p<? super R> pVar, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.c = pVar;
                this.d = concatMapDelayErrorObserver;
            }

            public void a(k0.b.w.a aVar) {
                DisposableHelper.replace(this, aVar);
            }

            public void b(R r) {
                this.c.b(r);
            }

            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.d;
                concatMapDelayErrorObserver.b2 = false;
                concatMapDelayErrorObserver.c();
            }

            public void onError(Throwable th) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.d;
                if (concatMapDelayErrorObserver.x.a(th)) {
                    if (!concatMapDelayErrorObserver.Y1) {
                        concatMapDelayErrorObserver.a2.dispose();
                    }
                    concatMapDelayErrorObserver.b2 = false;
                    concatMapDelayErrorObserver.c();
                    return;
                }
                RxJavaPlugins.onError(th);
            }
        }

        public ConcatMapDelayErrorObserver(p<? super R> pVar, e<? super T, ? extends o<? extends R>> eVar, int i, boolean z) {
            this.c = pVar;
            this.d = eVar;
            this.q = i;
            this.Y1 = z;
            this.y = new DelayErrorInnerObserver<>(pVar, this);
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.a2, aVar)) {
                this.a2 = aVar;
                if (aVar instanceof b) {
                    b bVar = (b) aVar;
                    int requestFusion = bVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.e2 = requestFusion;
                        this.Z1 = bVar;
                        this.c2 = true;
                        this.c.a(this);
                        c();
                        return;
                    } else if (requestFusion == 2) {
                        this.e2 = requestFusion;
                        this.Z1 = bVar;
                        this.c.a(this);
                        return;
                    }
                }
                this.Z1 = new k0.b.z.f.a(this.q);
                this.c.a(this);
            }
        }

        public void b(T t) {
            if (this.e2 == 0) {
                this.Z1.offer(t);
            }
            c();
        }

        public void c() {
            if (getAndIncrement() == 0) {
                p<? super R> pVar = this.c;
                k0.b.z.c.e<T> eVar = this.Z1;
                AtomicThrowable atomicThrowable = this.x;
                while (true) {
                    if (!this.b2) {
                        if (this.d2) {
                            eVar.clear();
                            return;
                        } else if (this.Y1 || ((Throwable) atomicThrowable.get()) == null) {
                            boolean z = this.c2;
                            try {
                                T poll = eVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.d2 = true;
                                    Throwable b = atomicThrowable.b();
                                    if (b != null) {
                                        pVar.onError(b);
                                        return;
                                    } else {
                                        pVar.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        Object apply = this.d.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                        o oVar = (o) apply;
                                        if (oVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) oVar).call();
                                                if (call != null && !this.d2) {
                                                    pVar.b(call);
                                                }
                                            } catch (Throwable th) {
                                                h.c4(th);
                                                atomicThrowable.a(th);
                                            }
                                        } else {
                                            this.b2 = true;
                                            oVar.c(this.y);
                                        }
                                    } catch (Throwable th2) {
                                        h.c4(th2);
                                        this.d2 = true;
                                        this.a2.dispose();
                                        eVar.clear();
                                        atomicThrowable.a(th2);
                                        pVar.onError(atomicThrowable.b());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                h.c4(th3);
                                this.d2 = true;
                                this.a2.dispose();
                                atomicThrowable.a(th3);
                                pVar.onError(atomicThrowable.b());
                                return;
                            }
                        } else {
                            eVar.clear();
                            this.d2 = true;
                            pVar.onError(atomicThrowable.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.d2 = true;
            this.a2.dispose();
            DelayErrorInnerObserver<R> delayErrorInnerObserver = this.y;
            Objects.requireNonNull(delayErrorInnerObserver);
            DisposableHelper.dispose(delayErrorInnerObserver);
        }

        public boolean isDisposed() {
            return this.d2;
        }

        public void onComplete() {
            this.c2 = true;
            c();
        }

        public void onError(Throwable th) {
            if (this.x.a(th)) {
                this.c2 = true;
                c();
                return;
            }
            RxJavaPlugins.onError(th);
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements p<T>, k0.b.w.a {
        public k0.b.w.a Y1;
        public volatile boolean Z1;
        public volatile boolean a2;
        public volatile boolean b2;
        public final p<? super U> c;
        public int c2;
        public final e<? super T, ? extends o<? extends U>> d;
        public final InnerObserver<U> q;
        public final int x;
        public k0.b.z.c.e<T> y;

        public static final class InnerObserver<U> extends AtomicReference<k0.b.w.a> implements p<U> {
            public final p<? super U> c;
            public final SourceObserver<?, ?> d;

            public InnerObserver(p<? super U> pVar, SourceObserver<?, ?> sourceObserver) {
                this.c = pVar;
                this.d = sourceObserver;
            }

            public void a(k0.b.w.a aVar) {
                DisposableHelper.replace(this, aVar);
            }

            public void b(U u) {
                this.c.b(u);
            }

            public void onComplete() {
                SourceObserver<?, ?> sourceObserver = this.d;
                sourceObserver.Z1 = false;
                sourceObserver.c();
            }

            public void onError(Throwable th) {
                this.d.dispose();
                this.c.onError(th);
            }
        }

        public SourceObserver(p<? super U> pVar, e<? super T, ? extends o<? extends U>> eVar, int i) {
            this.c = pVar;
            this.d = eVar;
            this.x = i;
            this.q = new InnerObserver<>(pVar, this);
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.Y1, aVar)) {
                this.Y1 = aVar;
                if (aVar instanceof b) {
                    b bVar = (b) aVar;
                    int requestFusion = bVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.c2 = requestFusion;
                        this.y = bVar;
                        this.b2 = true;
                        this.c.a(this);
                        c();
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
            if (!this.b2) {
                if (this.c2 == 0) {
                    this.y.offer(t);
                }
                c();
            }
        }

        public void c() {
            if (getAndIncrement() == 0) {
                while (!this.a2) {
                    if (!this.Z1) {
                        boolean z = this.b2;
                        try {
                            T poll = this.y.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.a2 = true;
                                this.c.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.d.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                    o oVar = (o) apply;
                                    this.Z1 = true;
                                    oVar.c(this.q);
                                } catch (Throwable th) {
                                    h.c4(th);
                                    dispose();
                                    this.y.clear();
                                    this.c.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            h.c4(th2);
                            dispose();
                            this.y.clear();
                            this.c.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.y.clear();
            }
        }

        public void dispose() {
            this.a2 = true;
            InnerObserver<U> innerObserver = this.q;
            Objects.requireNonNull(innerObserver);
            DisposableHelper.dispose(innerObserver);
            this.Y1.dispose();
            if (getAndIncrement() == 0) {
                this.y.clear();
            }
        }

        public boolean isDisposed() {
            return this.a2;
        }

        public void onComplete() {
            if (!this.b2) {
                this.b2 = true;
                c();
            }
        }

        public void onError(Throwable th) {
            if (this.b2) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.b2 = true;
            dispose();
            this.c.onError(th);
        }
    }

    public ObservableConcatMap(o<T> oVar, e<? super T, ? extends o<? extends U>> eVar, int i, ErrorMode errorMode) {
        super(oVar);
        this.d = eVar;
        this.x = errorMode;
        this.q = Math.max(8, i);
    }

    public void u(p<? super U> pVar) {
        if (!h.q4(this.c, pVar, this.d)) {
            if (this.x == ErrorMode.IMMEDIATE) {
                this.c.c(new SourceObserver(new c(pVar), this.d, this.q));
            } else {
                this.c.c(new ConcatMapDelayErrorObserver(pVar, this.d, this.q, this.x == ErrorMode.END));
            }
        }
    }
}
