package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.r;
import k0.b.s;
import k0.b.t;
import k0.b.u;
import k0.b.w.a;

public final class SingleCreate<T> extends r<T> {
    public final u<T> a;

    public static final class Emitter<T> extends AtomicReference<a> implements s<T>, a {
        public final t<? super T> c;

        public Emitter(t<? super T> tVar) {
            this.c = tVar;
        }

        public void a(T t) {
            a aVar;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (aVar = (a) getAndSet(disposableHelper)) != disposableHelper) {
                if (t == null) {
                    try {
                        this.c.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (aVar != null) {
                            aVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.c.onSuccess(t);
                }
                if (aVar != null) {
                    aVar.dispose();
                }
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a) get());
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{Emitter.class.getSimpleName(), super.toString()});
        }
    }

    public SingleCreate(u<T> uVar) {
        this.a = uVar;
    }

    public void b(t<? super T> tVar) {
        boolean z;
        a aVar;
        Emitter emitter = new Emitter(tVar);
        tVar.a(emitter);
        try {
            this.a.a(emitter);
        } catch (Throwable th) {
            if (aVar != null) {
                aVar.dispose();
            }
            throw th;
        }
    }
}
