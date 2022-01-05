package com.clubhouse.android.shared.data;

import h0.u.w;
import i0.e.b.f3.j.f;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.shared.data.RemoteSearchDataSource$fetchResults$1", f = "RemoteSearchDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: RemoteSearchDataSource.kt */
public final class RemoteSearchDataSource$fetchResults$1 extends SuspendLambda implements p<w<T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ f<Query, T> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteSearchDataSource$fetchResults$1(f<Query, T> fVar, m0.l.c<? super RemoteSearchDataSource$fetchResults$1> cVar) {
        super(2, cVar);
        this.d = fVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        RemoteSearchDataSource$fetchResults$1 remoteSearchDataSource$fetchResults$1 = new RemoteSearchDataSource$fetchResults$1(this.d, cVar);
        remoteSearchDataSource$fetchResults$1.c = obj;
        return remoteSearchDataSource$fetchResults$1;
    }

    public Object invoke(Object obj, Object obj2) {
        f<Query, T> fVar = this.d;
        RemoteSearchDataSource$fetchResults$1 remoteSearchDataSource$fetchResults$1 = new RemoteSearchDataSource$fetchResults$1(fVar, (m0.l.c) obj2);
        remoteSearchDataSource$fetchResults$1.c = (w) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        ((n0.a.g2.p) fVar.e).d((w) remoteSearchDataSource$fetchResults$1.c);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ((n0.a.g2.p) this.d.e).d((w) this.c);
        return i.a;
    }
}
