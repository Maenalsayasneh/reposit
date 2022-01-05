package io.reactivex.internal.operators.observable;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;
import k0.b.z.c.b;
import k0.b.z.c.d;
import k0.b.z.e.c.a;

public final class ObservableFlatMap<T, U> extends a<T, U> {
    public final e<? super T, ? extends o<? extends U>> d;
    public final boolean q;
    public final int x;
    public final int y;

    public static final class InnerObserver<T, U> extends AtomicReference<k0.b.w.a> implements p<U> {
        public final long c;
        public final MergeObserver<T, U> d;
        public volatile boolean q;
        public volatile k0.b.z.c.e<U> x;
        public int y;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.c = j;
            this.d = mergeObserver;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.setOnce(this, aVar) && (aVar instanceof b)) {
                b bVar = (b) aVar;
                int requestFusion = bVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.y = requestFusion;
                    this.x = bVar;
                    this.q = true;
                    this.d.e();
                } else if (requestFusion == 2) {
                    this.y = requestFusion;
                    this.x = bVar;
                }
            }
        }

        public void b(U u) {
            if (this.y == 0) {
                MergeObserver<T, U> mergeObserver = this.d;
                if (mergeObserver.get() != 0 || !mergeObserver.compareAndSet(0, 1)) {
                    k0.b.z.c.e eVar = this.x;
                    if (eVar == null) {
                        eVar = new k0.b.z.f.a(mergeObserver.Z1);
                        this.x = eVar;
                    }
                    eVar.offer(u);
                    if (mergeObserver.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    mergeObserver.q.b(u);
                    if (mergeObserver.decrementAndGet() == 0) {
                        return;
                    }
                }
                mergeObserver.f();
                return;
            }
            this.d.e();
        }

        public void onComplete() {
            this.q = true;
            this.d.e();
        }

        public void onError(Throwable th) {
            if (this.d.c2.a(th)) {
                MergeObserver<T, U> mergeObserver = this.d;
                if (!mergeObserver.y) {
                    mergeObserver.d();
                }
                this.q = true;
                this.d.e();
                return;
            }
            RxJavaPlugins.onError(th);
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements k0.b.w.a, p<T> {
        public static final InnerObserver<?, ?>[] c = new InnerObserver[0];
        public static final InnerObserver<?, ?>[] d = new InnerObserver[0];
        public final int Y1;
        public final int Z1;
        public volatile d<U> a2;
        public volatile boolean b2;
        public final AtomicThrowable c2 = new AtomicThrowable();
        public volatile boolean d2;
        public final AtomicReference<InnerObserver<?, ?>[]> e2;
        public k0.b.w.a f2;
        public long g2;
        public long h2;
        public int i2;
        public Queue<o<? extends U>> j2;
        public int k2;
        public final p<? super U> q;
        public final e<? super T, ? extends o<? extends U>> x;
        public final boolean y;

        public MergeObserver(p<? super U> pVar, e<? super T, ? extends o<? extends U>> eVar, boolean z, int i, int i3) {
            this.q = pVar;
            this.x = eVar;
            this.y = z;
            this.Y1 = i;
            this.Z1 = i3;
            if (i != Integer.MAX_VALUE) {
                this.j2 = new ArrayDeque(i);
            }
            this.e2 = new AtomicReference<>(c);
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.f2, aVar)) {
                this.f2 = aVar;
                this.q.a(this);
            }
        }

        public void b(T t) {
            if (!this.b2) {
                try {
                    Object apply = this.x.apply(t);
                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                    o oVar = (o) apply;
                    if (this.Y1 != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.k2;
                            if (i == this.Y1) {
                                this.j2.offer(oVar);
                                return;
                            }
                            this.k2 = i + 1;
                        }
                    }
                    h(oVar);
                } catch (Throwable th) {
                    h.c4(th);
                    this.f2.dispose();
                    onError(th);
                }
            }
        }

        public boolean c() {
            if (this.d2) {
                return true;
            }
            Throwable th = (Throwable) this.c2.get();
            if (this.y || th == null) {
                return false;
            }
            d();
            Throwable b = this.c2.b();
            if (b != ExceptionHelper.a) {
                this.q.onError(b);
            }
            return true;
        }

        public boolean d() {
            InnerObserver<?, ?>[] innerObserverArr;
            this.f2.dispose();
            InnerObserver<?, ?>[] innerObserverArr2 = (InnerObserver[]) this.e2.get();
            InnerObserver<?, ?>[] innerObserverArr3 = d;
            if (innerObserverArr2 == innerObserverArr3 || (innerObserverArr = (InnerObserver[]) this.e2.getAndSet(innerObserverArr3)) == innerObserverArr3) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : innerObserverArr) {
                Objects.requireNonNull(innerObserver);
                DisposableHelper.dispose(innerObserver);
            }
            return true;
        }

        public void dispose() {
            Throwable b;
            if (!this.d2) {
                this.d2 = true;
                if (d() && (b = this.c2.b()) != null && b != ExceptionHelper.a) {
                    RxJavaPlugins.onError(b);
                }
            }
        }

        public void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        public void f() {
            int i;
            int i3;
            p<? super U> pVar = this.q;
            int i4 = 1;
            while (!c()) {
                d<U> dVar = this.a2;
                if (dVar != null) {
                    while (!c()) {
                        U poll = dVar.poll();
                        if (poll != null) {
                            pVar.b(poll);
                        }
                    }
                    return;
                }
                boolean z = this.b2;
                d<U> dVar2 = this.a2;
                InnerObserver[] innerObserverArr = (InnerObserver[]) this.e2.get();
                int length = innerObserverArr.length;
                int i5 = 0;
                if (this.Y1 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.j2.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((dVar2 == null || dVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.h2;
                        int i6 = this.i2;
                        if (length <= i6 || innerObserverArr[i6].c != j) {
                            if (length <= i6) {
                                i6 = 0;
                            }
                            for (int i7 = 0; i7 < length && innerObserverArr[i6].c != j; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.i2 = i6;
                            this.h2 = innerObserverArr[i6].c;
                        }
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < length) {
                            if (!c()) {
                                InnerObserver innerObserver = innerObserverArr[i6];
                                k0.b.z.c.e<U> eVar = innerObserver.x;
                                if (eVar != null) {
                                    while (true) {
                                        try {
                                            U poll2 = eVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            pVar.b(poll2);
                                            if (c()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            h.c4(th);
                                            DisposableHelper.dispose(innerObserver);
                                            this.c2.a(th);
                                            if (!c()) {
                                                g(innerObserver);
                                                i9++;
                                                i3 = i6 + 1;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = innerObserver.q;
                                k0.b.z.c.e<U> eVar2 = innerObserver.x;
                                if (z2 && (eVar2 == null || eVar2.isEmpty())) {
                                    g(innerObserver);
                                    if (!c()) {
                                        i9++;
                                    } else {
                                        return;
                                    }
                                }
                                i3 = i6 + 1;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.i2 = i6;
                        this.h2 = innerObserverArr[i6].c;
                        i5 = i9;
                    }
                    if (i5 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.Y1 != Integer.MAX_VALUE) {
                        while (true) {
                            int i10 = i5 - 1;
                            if (i5 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                o poll3 = this.j2.poll();
                                if (poll3 == null) {
                                    this.k2--;
                                } else {
                                    h(poll3);
                                }
                            }
                            i5 = i10;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable b = this.c2.b();
                    if (b == ExceptionHelper.a) {
                        return;
                    }
                    if (b == null) {
                        pVar.onComplete();
                        return;
                    } else {
                        pVar.onError(b);
                        return;
                    }
                }
            }
        }

        public void g(InnerObserver<T, U> innerObserver) {
            InnerObserver<T, U>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = (InnerObserver[]) this.e2.get();
                int length = innerObserverArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerObserverArr[i] == innerObserver) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerObserverArr2 = c;
                        } else {
                            InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[(length - 1)];
                            System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                            System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                            innerObserverArr2 = innerObserverArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.e2.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (decrementAndGet() == 0) goto L_0x006c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(k0.b.o<? extends U> r8) {
            /*
                r7 = this;
            L_0x0000:
                boolean r0 = r8 instanceof java.util.concurrent.Callable
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x008e
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0060 }
                if (r8 != 0) goto L_0x0012
                goto L_0x006c
            L_0x0012:
                int r3 = r7.get()
                if (r3 != 0) goto L_0x002a
                boolean r3 = r7.compareAndSet(r1, r2)
                if (r3 == 0) goto L_0x002a
                k0.b.p<? super U> r3 = r7.q
                r3.b(r8)
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L_0x005c
                goto L_0x006c
            L_0x002a:
                k0.b.z.c.d<U> r3 = r7.a2
                if (r3 != 0) goto L_0x0043
                int r3 = r7.Y1
                if (r3 != r0) goto L_0x003a
                k0.b.z.f.a r3 = new k0.b.z.f.a
                int r4 = r7.Z1
                r3.<init>(r4)
                goto L_0x0041
            L_0x003a:
                io.reactivex.internal.queue.SpscArrayQueue r3 = new io.reactivex.internal.queue.SpscArrayQueue
                int r4 = r7.Y1
                r3.<init>(r4)
            L_0x0041:
                r7.a2 = r3
            L_0x0043:
                boolean r8 = r3.offer(r8)
                if (r8 != 0) goto L_0x0054
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r3 = "Scalar queue full?!"
                r8.<init>(r3)
                r7.onError(r8)
                goto L_0x006c
            L_0x0054:
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L_0x005c
                r8 = r1
                goto L_0x006d
            L_0x005c:
                r7.f()
                goto L_0x006c
            L_0x0060:
                r8 = move-exception
                i0.j.f.p.h.c4(r8)
                io.reactivex.internal.util.AtomicThrowable r3 = r7.c2
                r3.a(r8)
                r7.e()
            L_0x006c:
                r8 = r2
            L_0x006d:
                if (r8 == 0) goto L_0x00c2
                int r8 = r7.Y1
                if (r8 == r0) goto L_0x00c2
                monitor-enter(r7)
                java.util.Queue<k0.b.o<? extends U>> r8 = r7.j2     // Catch:{ all -> 0x008b }
                java.lang.Object r8 = r8.poll()     // Catch:{ all -> 0x008b }
                k0.b.o r8 = (k0.b.o) r8     // Catch:{ all -> 0x008b }
                if (r8 != 0) goto L_0x0084
                int r0 = r7.k2     // Catch:{ all -> 0x008b }
                int r0 = r0 - r2
                r7.k2 = r0     // Catch:{ all -> 0x008b }
                r1 = r2
            L_0x0084:
                monitor-exit(r7)     // Catch:{ all -> 0x008b }
                if (r1 == 0) goto L_0x0000
                r7.e()
                goto L_0x00c2
            L_0x008b:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x008b }
                throw r8
            L_0x008e:
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver
                long r3 = r7.g2
                r5 = 1
                long r5 = r5 + r3
                r7.g2 = r5
                r0.<init>(r7, r3)
            L_0x009a:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r3 = r7.e2
                java.lang.Object r3 = r3.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r3 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r3
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r4 = d
                if (r3 != r4) goto L_0x00aa
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                goto L_0x00bd
            L_0x00aa:
                int r4 = r3.length
                int r5 = r4 + 1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r5]
                java.lang.System.arraycopy(r3, r1, r5, r1, r4)
                r5[r4] = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r4 = r7.e2
                boolean r3 = r4.compareAndSet(r3, r5)
                if (r3 == 0) goto L_0x009a
                r1 = r2
            L_0x00bd:
                if (r1 == 0) goto L_0x00c2
                r8.c(r0)
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.h(k0.b.o):void");
        }

        public boolean isDisposed() {
            return this.d2;
        }

        public void onComplete() {
            if (!this.b2) {
                this.b2 = true;
                e();
            }
        }

        public void onError(Throwable th) {
            if (this.b2) {
                RxJavaPlugins.onError(th);
            } else if (this.c2.a(th)) {
                this.b2 = true;
                e();
            } else {
                RxJavaPlugins.onError(th);
            }
        }
    }

    public ObservableFlatMap(o<T> oVar, e<? super T, ? extends o<? extends U>> eVar, boolean z, int i, int i2) {
        super(oVar);
        this.d = eVar;
        this.q = z;
        this.x = i;
        this.y = i2;
    }

    public void u(p<? super U> pVar) {
        if (!h.q4(this.c, pVar, this.d)) {
            this.c.c(new MergeObserver(pVar, this.d, this.q, this.x, this.y));
        }
    }
}
