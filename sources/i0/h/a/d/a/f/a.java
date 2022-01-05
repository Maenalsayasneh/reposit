package i0.h.a.d.a.f;

import i0.h.a.d.a.j.c;
import n0.a.m;

/* compiled from: TaskUtils.kt */
public final class a<ResultT> implements c<T> {
    public final /* synthetic */ m a;

    public a(m mVar) {
        this.a = mVar;
    }

    public final void onSuccess(T t) {
        this.a.resumeWith(t);
    }
}
