package k0.b.e0;

import io.reactivex.internal.util.NotificationLite;
import k0.b.p;
import k0.b.z.h.a;

/* compiled from: SerializedSubject */
public final class b<T> extends c<T> implements a.C0235a<Object> {
    public final c<T> c;
    public boolean d;
    public a<Object> q;
    public volatile boolean x;

    public b(c<T> cVar) {
        this.c = cVar;
    }

    public void a(k0.b.w.a aVar) {
        boolean z = true;
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    if (this.d) {
                        a<Object> aVar2 = this.q;
                        if (aVar2 == null) {
                            aVar2 = new a<>(4);
                            this.q = aVar2;
                        }
                        aVar2.a(NotificationLite.disposable(aVar));
                        return;
                    }
                    this.d = true;
                    z = false;
                }
            }
        }
        if (z) {
            aVar.dispose();
            return;
        }
        this.c.a(aVar);
        w();
    }

    public void b(T t) {
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    if (this.d) {
                        a<Object> aVar = this.q;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.q = aVar;
                        }
                        aVar.a(NotificationLite.next(t));
                        return;
                    }
                    this.d = true;
                    this.c.b(t);
                    w();
                }
            }
        }
    }

    public void onComplete() {
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    this.x = true;
                    if (this.d) {
                        a<Object> aVar = this.q;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.q = aVar;
                        }
                        aVar.a(NotificationLite.complete());
                        return;
                    }
                    this.d = true;
                    this.c.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r1 == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        io.reactivex.plugins.RxJavaPlugins.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r3.c.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.x
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.x     // Catch:{ all -> 0x003c }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = r2
            goto L_0x002f
        L_0x0011:
            r3.x = r2     // Catch:{ all -> 0x003c }
            boolean r0 = r3.d     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x002d
            k0.b.z.h.a<java.lang.Object> r0 = r3.q     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0023
            k0.b.z.h.a r0 = new k0.b.z.h.a     // Catch:{ all -> 0x003c }
            r2 = 4
            r0.<init>(r2)     // Catch:{ all -> 0x003c }
            r3.q = r0     // Catch:{ all -> 0x003c }
        L_0x0023:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)     // Catch:{ all -> 0x003c }
            java.lang.Object[] r0 = r0.a     // Catch:{ all -> 0x003c }
            r0[r1] = r4     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            return
        L_0x002d:
            r3.d = r2     // Catch:{ all -> 0x003c }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0036
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            return
        L_0x0036:
            k0.b.e0.c<T> r0 = r3.c
            r0.onError(r4)
            return
        L_0x003c:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.e0.b.onError(java.lang.Throwable):void");
    }

    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.c);
    }

    public void u(p<? super T> pVar) {
        this.c.c(pVar);
    }

    public void w() {
        a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.q;
                if (aVar == null) {
                    this.d = false;
                    return;
                }
                this.q = null;
            }
            aVar.b(this);
        }
        while (true) {
        }
    }
}
