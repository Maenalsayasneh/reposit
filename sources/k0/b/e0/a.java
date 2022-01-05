package k0.b.e0;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k0.b.p;
import k0.b.z.h.a;

/* compiled from: BehaviorSubject */
public final class a<T> extends c<T> {
    public static final Object[] c = new Object[0];
    public static final C0227a[] d = new C0227a[0];
    public static final C0227a[] q = new C0227a[0];
    public final ReadWriteLock Y1;
    public final Lock Z1;
    public final Lock a2;
    public final AtomicReference<Throwable> b2;
    public long c2;
    public final AtomicReference<Object> x;
    public final AtomicReference<C0227a<T>[]> y = new AtomicReference<>(d);

    /* renamed from: k0.b.e0.a$a  reason: collision with other inner class name */
    /* compiled from: BehaviorSubject */
    public static final class C0227a<T> implements k0.b.w.a, a.C0235a<Object> {
        public boolean Y1;
        public volatile boolean Z1;
        public long a2;
        public final p<? super T> c;
        public final a<T> d;
        public boolean q;
        public boolean x;
        public k0.b.z.h.a<Object> y;

        public C0227a(p<? super T> pVar, a<T> aVar) {
            this.c = pVar;
            this.d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r2.Y1 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.Z1
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.Y1
                if (r0 != 0) goto L_0x0037
                monitor-enter(r2)
                boolean r0 = r2.Z1     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r2.a2     // Catch:{ all -> 0x0034 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r4 = r2.x     // Catch:{ all -> 0x0034 }
                if (r4 == 0) goto L_0x002d
                k0.b.z.h.a<java.lang.Object> r4 = r2.y     // Catch:{ all -> 0x0034 }
                if (r4 != 0) goto L_0x0028
                k0.b.z.h.a r4 = new k0.b.z.h.a     // Catch:{ all -> 0x0034 }
                r5 = 4
                r4.<init>(r5)     // Catch:{ all -> 0x0034 }
                r2.y = r4     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r4.a(r3)     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r4 = 1
                r2.q = r4     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                r2.Y1 = r4
                goto L_0x0037
            L_0x0034:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                throw r3
            L_0x0037:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k0.b.e0.a.C0227a.a(java.lang.Object, long):void");
        }

        public void dispose() {
            if (!this.Z1) {
                this.Z1 = true;
                this.d.w(this);
            }
        }

        public boolean isDisposed() {
            return this.Z1;
        }

        public boolean test(Object obj) {
            return this.Z1 || NotificationLite.accept(obj, this.c);
        }
    }

    public a(T t) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.Y1 = reentrantReadWriteLock;
        this.Z1 = reentrantReadWriteLock.readLock();
        this.a2 = reentrantReadWriteLock.writeLock();
        AtomicReference<Object> atomicReference = new AtomicReference<>();
        this.x = atomicReference;
        this.b2 = new AtomicReference<>();
        Objects.requireNonNull(t, "defaultValue is null");
        atomicReference.lazySet(t);
    }

    public void a(k0.b.w.a aVar) {
        if (this.b2.get() != null) {
            aVar.dispose();
        }
    }

    public void b(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.b2.get() == null) {
            Object next = NotificationLite.next(t);
            x(next);
            for (C0227a a : (C0227a[]) this.y.get()) {
                a.a(next, this.c2);
            }
        }
    }

    public void onComplete() {
        if (this.b2.compareAndSet((Object) null, ExceptionHelper.a)) {
            Object complete = NotificationLite.complete();
            AtomicReference<C0227a<T>[]> atomicReference = this.y;
            C0227a[] aVarArr = q;
            C0227a[] aVarArr2 = (C0227a[]) atomicReference.getAndSet(aVarArr);
            if (aVarArr2 != aVarArr) {
                x(complete);
            }
            for (C0227a a : aVarArr2) {
                a.a(complete, this.c2);
            }
        }
    }

    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.b2.compareAndSet((Object) null, th)) {
            RxJavaPlugins.onError(th);
            return;
        }
        Object error = NotificationLite.error(th);
        AtomicReference<C0227a<T>[]> atomicReference = this.y;
        C0227a[] aVarArr = q;
        C0227a[] aVarArr2 = (C0227a[]) atomicReference.getAndSet(aVarArr);
        if (aVarArr2 != aVarArr) {
            x(error);
        }
        for (C0227a a : aVarArr2) {
            a.a(error, this.c2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (r0.test(r8) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r0.Z1 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r8 = r0.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r8 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        r0.x = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        r0.y = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0081, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0082, code lost:
        r8.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(k0.b.p<? super T> r8) {
        /*
            r7 = this;
            k0.b.e0.a$a r0 = new k0.b.e0.a$a
            r0.<init>(r8, r7)
            r8.a(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<k0.b.e0.a$a<T>[]> r1 = r7.y
            java.lang.Object r1 = r1.get()
            k0.b.e0.a$a[] r1 = (k0.b.e0.a.C0227a[]) r1
            k0.b.e0.a$a[] r2 = q
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0018
            r1 = r3
            goto L_0x002b
        L_0x0018:
            int r2 = r1.length
            int r5 = r2 + 1
            k0.b.e0.a$a[] r5 = new k0.b.e0.a.C0227a[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<k0.b.e0.a$a<T>[]> r2 = r7.y
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L_0x0008
            r1 = r4
        L_0x002b:
            if (r1 == 0) goto L_0x008c
            boolean r8 = r0.Z1
            if (r8 == 0) goto L_0x0036
            r7.w(r0)
            goto L_0x009f
        L_0x0036:
            boolean r8 = r0.Z1
            if (r8 == 0) goto L_0x003c
            goto L_0x009f
        L_0x003c:
            monitor-enter(r0)
            boolean r8 = r0.Z1     // Catch:{ all -> 0x0089 }
            if (r8 == 0) goto L_0x0043
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x009f
        L_0x0043:
            boolean r8 = r0.q     // Catch:{ all -> 0x0089 }
            if (r8 == 0) goto L_0x0049
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x009f
        L_0x0049:
            k0.b.e0.a<T> r8 = r0.d     // Catch:{ all -> 0x0089 }
            java.util.concurrent.locks.Lock r1 = r8.Z1     // Catch:{ all -> 0x0089 }
            r1.lock()     // Catch:{ all -> 0x0089 }
            long r5 = r8.c2     // Catch:{ all -> 0x0089 }
            r0.a2 = r5     // Catch:{ all -> 0x0089 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.x     // Catch:{ all -> 0x0089 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0089 }
            r1.unlock()     // Catch:{ all -> 0x0089 }
            if (r8 == 0) goto L_0x0061
            r1 = r4
            goto L_0x0062
        L_0x0061:
            r1 = r3
        L_0x0062:
            r0.x = r1     // Catch:{ all -> 0x0089 }
            r0.q = r4     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            if (r8 == 0) goto L_0x009f
            boolean r8 = r0.test(r8)
            if (r8 == 0) goto L_0x0070
            goto L_0x009f
        L_0x0070:
            boolean r8 = r0.Z1
            if (r8 == 0) goto L_0x0075
            goto L_0x009f
        L_0x0075:
            monitor-enter(r0)
            k0.b.z.h.a<java.lang.Object> r8 = r0.y     // Catch:{ all -> 0x0086 }
            if (r8 != 0) goto L_0x007e
            r0.x = r3     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x009f
        L_0x007e:
            r1 = 0
            r0.y = r1     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            r8.b(r0)
            goto L_0x0070
        L_0x0086:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r8
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r8
        L_0x008c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.b2
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.a
            if (r0 != r1) goto L_0x009c
            r8.onComplete()
            goto L_0x009f
        L_0x009c:
            r8.onError(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.e0.a.u(k0.b.p):void");
    }

    public void w(C0227a<T> aVar) {
        C0227a<T>[] aVarArr;
        C0227a[] aVarArr2;
        do {
            aVarArr = (C0227a[]) this.y.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (aVarArr[i] == aVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = d;
                    } else {
                        C0227a[] aVarArr3 = new C0227a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.y.compareAndSet(aVarArr, aVarArr2));
    }

    public void x(Object obj) {
        this.a2.lock();
        this.c2++;
        this.x.lazySet(obj);
        this.a2.unlock();
    }
}
