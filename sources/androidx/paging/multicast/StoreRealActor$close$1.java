package androidx.paging.multicast;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.multicast.StoreRealActor", f = "StoreRealActor.kt", l = {74, 76}, m = "close")
/* compiled from: StoreRealActor.kt */
public final class StoreRealActor$close$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ StoreRealActor q;
    public Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreRealActor$close$1(StoreRealActor storeRealActor, m0.l.c cVar) {
        super(cVar);
        this.q = storeRealActor;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
