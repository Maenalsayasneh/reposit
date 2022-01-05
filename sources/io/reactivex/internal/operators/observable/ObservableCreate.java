package io.reactivex.internal.operators.observable;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.l;
import k0.b.m;
import k0.b.n;
import k0.b.p;
import k0.b.w.a;

public final class ObservableCreate<T> extends l<T> {
    public final n<T> c;

    public static final class CreateEmitter<T> extends AtomicReference<a> implements m<T>, a {
        public final p<? super T> c;

        public CreateEmitter(p<? super T> pVar) {
            this.c = pVar;
        }

        public void a() {
            if (!isDisposed()) {
                try {
                    this.c.onComplete();
                } finally {
                    DisposableHelper.dispose(this);
                }
            }
        }

        public void b(T t) {
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!c(nullPointerException)) {
                    RxJavaPlugins.onError(nullPointerException);
                }
            } else if (!isDisposed()) {
                this.c.b(t);
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.c.onError(th);
                DisposableHelper.dispose(this);
                return true;
            } catch (Throwable th2) {
                DisposableHelper.dispose(this);
                throw th2;
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a) get());
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{CreateEmitter.class.getSimpleName(), super.toString()});
        }
    }

    public ObservableCreate(n<T> nVar) {
        this.c = nVar;
    }

    public void u(p<? super T> pVar) {
        CreateEmitter createEmitter = new CreateEmitter(pVar);
        pVar.a(createEmitter);
        try {
            this.c.a(createEmitter);
        } catch (Throwable th) {
            h.c4(th);
            if (!createEmitter.c(th)) {
                RxJavaPlugins.onError(th);
            }
        }
    }
}
