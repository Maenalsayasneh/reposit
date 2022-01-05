package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.g;
import k0.b.h;
import k0.b.i;
import k0.b.j;
import k0.b.w.a;

public final class MaybeCreate<T> extends g<T> {
    public final j<T> a;

    public static final class Emitter<T> extends AtomicReference<a> implements h<T>, a {
        public final i<? super T> c;

        public Emitter(i<? super T> iVar) {
            this.c = iVar;
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

    public MaybeCreate(j<T> jVar) {
        this.a = jVar;
    }

    public void c(i<? super T> iVar) {
        boolean z;
        a aVar;
        Emitter emitter = new Emitter(iVar);
        iVar.a(emitter);
        try {
            ((i0.j.e.f1.p.i) this.a).a(emitter);
        } catch (Throwable th) {
            if (aVar != null) {
                aVar.dispose();
            }
            throw th;
        }
    }
}
