package k0.b.b0;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import k0.b.p;
import k0.b.w.a;

/* compiled from: SerializedObserver */
public final class c<T> implements p<T>, a {
    public final p<? super T> c;
    public a d;
    public boolean q;
    public k0.b.z.h.a<Object> x;
    public volatile boolean y;

    public c(p<? super T> pVar) {
        this.c = pVar;
    }

    public void a(a aVar) {
        if (DisposableHelper.validate(this.d, aVar)) {
            this.d = aVar;
            this.c.a(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r6.c.b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = r6.x;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r7 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        r6.q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        r6.x = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        r3 = r6.c;
        r7 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r7 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0055, code lost:
        if (r4 >= 4) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0057, code lost:
        r5 = r7[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0059, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        if (io.reactivex.internal.util.NotificationLite.acceptFull((java.lang.Object) r5, r3) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r7 = r7[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        if (r2 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.y
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r7 != 0) goto L_0x0017
            k0.b.w.a r7 = r6.d
            r7.dispose()
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
            r6.onError(r7)
            return
        L_0x0017:
            monitor-enter(r6)
            boolean r0 = r6.y     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return
        L_0x001e:
            boolean r0 = r6.q     // Catch:{ all -> 0x0072 }
            r1 = 4
            if (r0 == 0) goto L_0x0037
            k0.b.z.h.a<java.lang.Object> r0 = r6.x     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x002e
            k0.b.z.h.a r0 = new k0.b.z.h.a     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            r6.x = r0     // Catch:{ all -> 0x0072 }
        L_0x002e:
            java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.next(r7)     // Catch:{ all -> 0x0072 }
            r0.a(r7)     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return
        L_0x0037:
            r0 = 1
            r6.q = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            k0.b.p<? super T> r2 = r6.c
            r2.b(r7)
        L_0x0040:
            monitor-enter(r6)
            k0.b.z.h.a<java.lang.Object> r7 = r6.x     // Catch:{ all -> 0x006f }
            r2 = 0
            if (r7 != 0) goto L_0x004a
            r6.q = r2     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x006e
        L_0x004a:
            r3 = 0
            r6.x = r3     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            k0.b.p<? super T> r3 = r6.c
            java.lang.Object[] r7 = r7.a
        L_0x0052:
            if (r7 == 0) goto L_0x006c
            r4 = r2
        L_0x0055:
            if (r4 >= r1) goto L_0x0067
            r5 = r7[r4]
            if (r5 != 0) goto L_0x005c
            goto L_0x0067
        L_0x005c:
            boolean r5 = io.reactivex.internal.util.NotificationLite.acceptFull((java.lang.Object) r5, r3)
            if (r5 == 0) goto L_0x0064
            r2 = r0
            goto L_0x006c
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0055
        L_0x0067:
            r7 = r7[r1]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L_0x0052
        L_0x006c:
            if (r2 == 0) goto L_0x0040
        L_0x006e:
            return
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            throw r7
        L_0x0072:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.b0.c.b(java.lang.Object):void");
    }

    public void dispose() {
        this.d.dispose();
    }

    public boolean isDisposed() {
        return this.d.isDisposed();
    }

    public void onComplete() {
        if (!this.y) {
            synchronized (this) {
                if (!this.y) {
                    if (this.q) {
                        k0.b.z.h.a<Object> aVar = this.x;
                        if (aVar == null) {
                            aVar = new k0.b.z.h.a<>(4);
                            this.x = aVar;
                        }
                        aVar.a(NotificationLite.complete());
                        return;
                    }
                    this.y = true;
                    this.q = true;
                    this.c.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        io.reactivex.plugins.RxJavaPlugins.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r3.c.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.y
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.y     // Catch:{ all -> 0x003e }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = r2
            goto L_0x0031
        L_0x0011:
            boolean r0 = r3.q     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002d
            r3.y = r2     // Catch:{ all -> 0x003e }
            k0.b.z.h.a<java.lang.Object> r0 = r3.x     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0023
            k0.b.z.h.a r0 = new k0.b.z.h.a     // Catch:{ all -> 0x003e }
            r2 = 4
            r0.<init>(r2)     // Catch:{ all -> 0x003e }
            r3.x = r0     // Catch:{ all -> 0x003e }
        L_0x0023:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)     // Catch:{ all -> 0x003e }
            java.lang.Object[] r0 = r0.a     // Catch:{ all -> 0x003e }
            r0[r1] = r4     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return
        L_0x002d:
            r3.y = r2     // Catch:{ all -> 0x003e }
            r3.q = r2     // Catch:{ all -> 0x003e }
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0038
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            return
        L_0x0038:
            k0.b.p<? super T> r0 = r3.c
            r0.onError(r4)
            return
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.b0.c.onError(java.lang.Throwable):void");
    }
}
