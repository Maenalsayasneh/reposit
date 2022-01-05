package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.l;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;

public final class ObservableZip<T, R> extends l<R> {
    public final o<? extends T>[] c;
    public final e<? super Object[], ? extends R> d;
    public final int q;
    public final boolean x;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements k0.b.w.a {
        public volatile boolean Y1;
        public final p<? super R> c;
        public final e<? super Object[], ? extends R> d;
        public final a<T, R>[] q;
        public final T[] x;
        public final boolean y;

        public ZipCoordinator(p<? super R> pVar, e<? super Object[], ? extends R> eVar, int i, boolean z) {
            this.c = pVar;
            this.d = eVar;
            this.q = new a[i];
            this.x = new Object[i];
            this.y = z;
        }

        public void a() {
            for (a<T, R> aVar : this.q) {
                aVar.d.clear();
            }
            for (a<T, R> aVar2 : this.q) {
                DisposableHelper.dispose(aVar2.y);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                io.reactivex.internal.operators.observable.ObservableZip$a<T, R>[] r0 = r1.q
                k0.b.p<? super R> r2 = r1.c
                T[] r3 = r1.x
                boolean r4 = r1.y
                r5 = 1
                r6 = r5
            L_0x0013:
                int r7 = r0.length
                r9 = 0
                r10 = 0
                r11 = 0
            L_0x0017:
                if (r9 >= r7) goto L_0x0088
                r12 = r0[r9]
                r13 = r3[r11]
                if (r13 != 0) goto L_0x0070
                boolean r13 = r12.q
                k0.b.z.f.a<T> r14 = r12.d
                java.lang.Object r14 = r14.poll()
                if (r14 != 0) goto L_0x002b
                r15 = r5
                goto L_0x002c
            L_0x002b:
                r15 = 0
            L_0x002c:
                boolean r8 = r1.Y1
                if (r8 == 0) goto L_0x0035
                r16.a()
            L_0x0033:
                r8 = r5
                goto L_0x0065
            L_0x0035:
                if (r13 == 0) goto L_0x0064
                if (r4 == 0) goto L_0x004c
                if (r15 == 0) goto L_0x0064
                java.lang.Throwable r8 = r12.x
                r1.Y1 = r5
                r16.a()
                if (r8 == 0) goto L_0x0048
                r2.onError(r8)
                goto L_0x0033
            L_0x0048:
                r2.onComplete()
                goto L_0x0033
            L_0x004c:
                java.lang.Throwable r8 = r12.x
                if (r8 == 0) goto L_0x0059
                r1.Y1 = r5
                r16.a()
                r2.onError(r8)
                goto L_0x0033
            L_0x0059:
                if (r15 == 0) goto L_0x0064
                r1.Y1 = r5
                r16.a()
                r2.onComplete()
                goto L_0x0033
            L_0x0064:
                r8 = 0
            L_0x0065:
                if (r8 == 0) goto L_0x0068
                return
            L_0x0068:
                if (r15 != 0) goto L_0x006d
                r3[r11] = r14
                goto L_0x0083
            L_0x006d:
                int r10 = r10 + 1
                goto L_0x0083
            L_0x0070:
                boolean r8 = r12.q
                if (r8 == 0) goto L_0x0083
                if (r4 != 0) goto L_0x0083
                java.lang.Throwable r8 = r12.x
                if (r8 == 0) goto L_0x0083
                r1.Y1 = r5
                r16.a()
                r2.onError(r8)
                return
            L_0x0083:
                int r11 = r11 + 1
                int r9 = r9 + 1
                goto L_0x0017
            L_0x0088:
                if (r10 == 0) goto L_0x0092
                int r6 = -r6
                int r6 = r1.addAndGet(r6)
                if (r6 != 0) goto L_0x0013
                return
            L_0x0092:
                k0.b.y.e<? super java.lang.Object[], ? extends R> r7 = r1.d     // Catch:{ all -> 0x00aa }
                java.lang.Object r8 = r3.clone()     // Catch:{ all -> 0x00aa }
                java.lang.Object r7 = r7.apply(r8)     // Catch:{ all -> 0x00aa }
                java.lang.String r8 = "The zipper returned a null value"
                java.util.Objects.requireNonNull(r7, r8)     // Catch:{ all -> 0x00aa }
                r2.b(r7)
                r7 = 0
                java.util.Arrays.fill(r3, r7)
                goto L_0x0013
            L_0x00aa:
                r0 = move-exception
                i0.j.f.p.h.c4(r0)
                r16.a()
                r2.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator.b():void");
        }

        public void dispose() {
            if (!this.Y1) {
                this.Y1 = true;
                for (a<T, R> aVar : this.q) {
                    DisposableHelper.dispose(aVar.y);
                }
                if (getAndIncrement() == 0) {
                    for (a<T, R> aVar2 : this.q) {
                        aVar2.d.clear();
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.Y1;
        }
    }

    public static final class a<T, R> implements p<T> {
        public final ZipCoordinator<T, R> c;
        public final k0.b.z.f.a<T> d;
        public volatile boolean q;
        public Throwable x;
        public final AtomicReference<k0.b.w.a> y = new AtomicReference<>();

        public a(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.c = zipCoordinator;
            this.d = new k0.b.z.f.a<>(i);
        }

        public void a(k0.b.w.a aVar) {
            DisposableHelper.setOnce(this.y, aVar);
        }

        public void b(T t) {
            this.d.offer(t);
            this.c.b();
        }

        public void onComplete() {
            this.q = true;
            this.c.b();
        }

        public void onError(Throwable th) {
            this.x = th;
            this.q = true;
            this.c.b();
        }
    }

    public ObservableZip(o<? extends T>[] oVarArr, Iterable<? extends o<? extends T>> iterable, e<? super Object[], ? extends R> eVar, int i, boolean z) {
        this.c = oVarArr;
        this.d = eVar;
        this.q = i;
        this.x = z;
    }

    public void u(p<? super R> pVar) {
        o<? extends T>[] oVarArr = this.c;
        Objects.requireNonNull(oVarArr);
        int length = oVarArr.length;
        if (length == 0) {
            EmptyDisposable.complete((p<?>) pVar);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(pVar, this.d, length, this.x);
        int i = this.q;
        a<T, R>[] aVarArr = zipCoordinator.q;
        int length2 = aVarArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            aVarArr[i2] = new a<>(zipCoordinator, i);
        }
        zipCoordinator.lazySet(0);
        zipCoordinator.c.a(zipCoordinator);
        for (int i3 = 0; i3 < length2 && !zipCoordinator.Y1; i3++) {
            oVarArr[i3].c(aVarArr[i3]);
        }
    }
}
