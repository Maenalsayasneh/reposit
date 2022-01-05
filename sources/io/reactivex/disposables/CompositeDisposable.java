package io.reactivex.disposables;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Objects;
import k0.b.w.a;
import k0.b.z.h.b;

public final class CompositeDisposable implements a, k0.b.z.a.a {
    public volatile boolean disposed;
    public b<a> resources;

    public CompositeDisposable() {
    }

    public boolean add(a aVar) {
        Objects.requireNonNull(aVar, "disposable is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    b<a> bVar = this.resources;
                    if (bVar == null) {
                        bVar = new b<>(16, 0.75f);
                        this.resources = bVar;
                    }
                    bVar.a(aVar);
                    return true;
                }
            }
        }
        aVar.dispose();
        return false;
    }

    public boolean addAll(a... aVarArr) {
        Objects.requireNonNull(aVarArr, "disposables is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    b<a> bVar = this.resources;
                    if (bVar == null) {
                        bVar = new b<>(aVarArr.length + 1, 0.75f);
                        this.resources = bVar;
                    }
                    for (a aVar : aVarArr) {
                        Objects.requireNonNull(aVar, "A Disposable in the disposables array is null");
                        bVar.a(aVar);
                    }
                    return true;
                }
            }
        }
        for (a dispose : aVarArr) {
            dispose.dispose();
        }
        return false;
    }

    public void clear() {
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    b<a> bVar = this.resources;
                    this.resources = null;
                    dispose(bVar);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean delete(k0.b.w.a r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.disposed
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.disposed     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return r1
        L_0x0012:
            k0.b.z.h.b<k0.b.w.a> r0 = r7.resources     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x004b
            T[] r2 = r0.d     // Catch:{ all -> 0x004d }
            int r3 = r0.a     // Catch:{ all -> 0x004d }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004d }
            int r4 = k0.b.z.h.b.b(r4)     // Catch:{ all -> 0x004d }
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004d }
            r6 = 1
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r8 = r1
            goto L_0x0046
        L_0x002a:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0035
            r0.c(r4, r2, r3)     // Catch:{ all -> 0x004d }
        L_0x0033:
            r8 = r6
            goto L_0x0046
        L_0x0035:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004d }
            if (r5 != 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0035
            r0.c(r4, r2, r3)     // Catch:{ all -> 0x004d }
            goto L_0x0033
        L_0x0046:
            if (r8 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return r6
        L_0x004b:
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return r1
        L_0x004d:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.CompositeDisposable.delete(k0.b.w.a):boolean");
    }

    public void dispose() {
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    this.disposed = true;
                    b<a> bVar = this.resources;
                    this.resources = null;
                    dispose(bVar);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public boolean remove(a aVar) {
        if (!delete(aVar)) {
            return false;
        }
        aVar.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int size() {
        /*
            r2 = this;
            boolean r0 = r2.disposed
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x000d:
            k0.b.z.h.b<k0.b.w.a> r0 = r2.resources     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0013
            int r1 = r0.b     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.CompositeDisposable.size():int");
    }

    public CompositeDisposable(a... aVarArr) {
        Objects.requireNonNull(aVarArr, "disposables is null");
        this.resources = new b<>(aVarArr.length + 1, 0.75f);
        for (a aVar : aVarArr) {
            Objects.requireNonNull(aVar, "A Disposable in the disposables array is null");
            this.resources.a(aVar);
        }
    }

    public CompositeDisposable(Iterable<? extends a> iterable) {
        Objects.requireNonNull(iterable, "disposables is null");
        this.resources = new b<>(16, 0.75f);
        for (a aVar : iterable) {
            Objects.requireNonNull(aVar, "A Disposable item in the disposables sequence is null");
            this.resources.a(aVar);
        }
    }

    public void dispose(b<a> bVar) {
        if (bVar != null) {
            ArrayList arrayList = null;
            for (T t : bVar.d) {
                if (t instanceof a) {
                    try {
                        ((a) t).dispose();
                    } catch (Throwable th) {
                        h.c4(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw ExceptionHelper.a((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }
}
