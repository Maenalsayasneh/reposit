package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.a;
import k0.b.b;
import k0.b.c;
import k0.b.d;

public final class CompletableCreate extends a {
    public final d a;

    public static final class Emitter extends AtomicReference<k0.b.w.a> implements b, k0.b.w.a {
        public final c c;

        public Emitter(c cVar) {
            this.c = cVar;
        }

        public void a() {
            k0.b.w.a aVar;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (aVar = (k0.b.w.a) getAndSet(disposableHelper)) != disposableHelper) {
                try {
                    this.c.onComplete();
                } finally {
                    if (aVar != null) {
                        aVar.dispose();
                    }
                }
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((k0.b.w.a) get());
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{Emitter.class.getSimpleName(), super.toString()});
        }
    }

    public CompletableCreate(d dVar) {
        this.a = dVar;
    }

    public void e(c cVar) {
        boolean z;
        k0.b.w.a aVar;
        Emitter emitter = new Emitter(cVar);
        cVar.a(emitter);
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
