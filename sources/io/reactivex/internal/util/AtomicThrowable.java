package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

public final class AtomicThrowable extends AtomicReference<Throwable> {
    public boolean a(Throwable th) {
        Throwable th2;
        Throwable th3;
        Throwable th4 = ExceptionHelper.a;
        do {
            th2 = (Throwable) get();
            if (th2 == ExceptionHelper.a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!compareAndSet(th2, th3));
        return true;
    }

    public Throwable b() {
        Throwable th = ExceptionHelper.a;
        Throwable th2 = (Throwable) get();
        Throwable th3 = ExceptionHelper.a;
        return th2 != th3 ? (Throwable) getAndSet(th3) : th2;
    }
}
