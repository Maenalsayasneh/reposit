package io.reactivex.internal.disposables;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.w.a;

public enum DisposableHelper implements a {
    DISPOSED;

    public static boolean dispose(AtomicReference<a> atomicReference) {
        a andSet;
        a aVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (aVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(a aVar) {
        return aVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<a> atomicReference, a aVar) {
        a aVar2;
        do {
            aVar2 = atomicReference.get();
            if (aVar2 == DISPOSED) {
                if (aVar == null) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(aVar2, aVar));
        return true;
    }

    public static void reportDisposableSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<a> atomicReference, a aVar) {
        a aVar2;
        do {
            aVar2 = atomicReference.get();
            if (aVar2 == DISPOSED) {
                if (aVar == null) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(aVar2, aVar));
        if (aVar2 == null) {
            return true;
        }
        aVar2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<a> atomicReference, a aVar) {
        Objects.requireNonNull(aVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, aVar)) {
            return true;
        }
        aVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<a> atomicReference, a aVar) {
        if (atomicReference.compareAndSet((Object) null, aVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        aVar.dispose();
        return false;
    }

    public static boolean validate(a aVar, a aVar2) {
        if (aVar2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        } else if (aVar == null) {
            return true;
        } else {
            aVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
