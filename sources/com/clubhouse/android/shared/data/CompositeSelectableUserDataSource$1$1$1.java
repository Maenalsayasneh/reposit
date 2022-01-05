package com.clubhouse.android.shared.data;

import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$1$1$1", f = "CompositeSelectableUserDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: CompositeSelectableUserDataSource.kt */
public final class CompositeSelectableUserDataSource$1$1$1 extends SuspendLambda implements p<j, m0.l.c<? super a<m>>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CompositeSelectableUserDataSource d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeSelectableUserDataSource$1$1$1(CompositeSelectableUserDataSource compositeSelectableUserDataSource, m0.l.c<? super CompositeSelectableUserDataSource$1$1$1> cVar) {
        super(2, cVar);
        this.d = compositeSelectableUserDataSource;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CompositeSelectableUserDataSource$1$1$1 compositeSelectableUserDataSource$1$1$1 = new CompositeSelectableUserDataSource$1$1$1(this.d, cVar);
        compositeSelectableUserDataSource$1$1$1.c = obj;
        return compositeSelectableUserDataSource$1$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        CompositeSelectableUserDataSource$1$1$1 compositeSelectableUserDataSource$1$1$1 = new CompositeSelectableUserDataSource$1$1$1(this.d, (m0.l.c) obj2);
        compositeSelectableUserDataSource$1$1$1.c = (j) obj;
        return compositeSelectableUserDataSource$1$1$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        m mVar = (m) ((j) this.c);
        CompositeSelectableUserDataSource compositeSelectableUserDataSource = this.d;
        return new a(mVar, compositeSelectableUserDataSource.a(compositeSelectableUserDataSource.d, mVar.g.getId().intValue()));
    }
}
