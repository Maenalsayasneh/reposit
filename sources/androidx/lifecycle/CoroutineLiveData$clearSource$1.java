package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {234}, m = "clearSource$lifecycle_livedata_ktx_release")
/* compiled from: CoroutineLiveData.kt */
public final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ CoroutineLiveData q;
    public Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$clearSource$1(CoroutineLiveData coroutineLiveData, m0.l.c cVar) {
        super(cVar);
        this.q = coroutineLiveData;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
