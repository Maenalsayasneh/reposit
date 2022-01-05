package i0.j.e.f1.p;

import android.view.View;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import java.util.Iterator;
import k0.b.h;
import k0.b.j;
import k0.b.w.a;

/* compiled from: Functions */
public final class i implements j<View> {
    public final /* synthetic */ Iterator a;

    public i(Iterator it) {
        this.a = it;
    }

    public void a(h<View> hVar) {
        a aVar;
        a aVar2;
        if (this.a.hasNext()) {
            Object next = this.a.next();
            MaybeCreate.Emitter emitter = (MaybeCreate.Emitter) hVar;
            Object obj = emitter.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (aVar2 = (a) emitter.getAndSet(disposableHelper)) != disposableHelper) {
                if (next == null) {
                    try {
                        emitter.c.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (aVar2 != null) {
                            aVar2.dispose();
                        }
                        throw th;
                    }
                } else {
                    emitter.c.onSuccess(next);
                }
                if (aVar2 != null) {
                    aVar2.dispose();
                    return;
                }
                return;
            }
            return;
        }
        MaybeCreate.Emitter emitter2 = (MaybeCreate.Emitter) hVar;
        Object obj2 = emitter2.get();
        DisposableHelper disposableHelper2 = DisposableHelper.DISPOSED;
        if (obj2 != disposableHelper2 && (aVar = (a) emitter2.getAndSet(disposableHelper2)) != disposableHelper2) {
            try {
                emitter2.c.onComplete();
            } finally {
                if (aVar != null) {
                    aVar.dispose();
                }
            }
        }
    }
}
