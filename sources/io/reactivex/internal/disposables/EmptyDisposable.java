package io.reactivex.internal.disposables;

import k0.b.c;
import k0.b.i;
import k0.b.p;
import k0.b.t;
import k0.b.z.c.b;

public enum EmptyDisposable implements b<Object> {
    INSTANCE,
    NEVER;

    public static void complete(p<?> pVar) {
        pVar.a(INSTANCE);
        pVar.onComplete();
    }

    public static void error(Throwable th, p<?> pVar) {
        pVar.a(INSTANCE);
        pVar.onError(th);
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(i<?> iVar) {
        iVar.a(INSTANCE);
        iVar.onComplete();
    }

    public static void error(Throwable th, c cVar) {
        cVar.a(INSTANCE);
        cVar.onError(th);
    }

    public static void complete(c cVar) {
        cVar.a(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, t<?> tVar) {
        tVar.a(INSTANCE);
        tVar.onError(th);
    }

    public static void error(Throwable th, i<?> iVar) {
        iVar.a(INSTANCE);
        iVar.onError(th);
    }
}
