package com.airbnb.mvrx;

import i0.b.b.q;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1", f = "ViewModelDelegateProvider.kt", l = {}, m = "invokeSuspend")
/* compiled from: ViewModelDelegateProvider.kt */
public final class DefaultViewModelDelegateFactory$createLazyViewModel$1$$special$$inlined$apply$lambda$1 extends SuspendLambda implements p<S, m0.l.c<? super i>, Object> {
    public final /* synthetic */ DefaultViewModelDelegateFactory$createLazyViewModel$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultViewModelDelegateFactory$createLazyViewModel$1$$special$$inlined$apply$lambda$1(m0.l.c cVar, DefaultViewModelDelegateFactory$createLazyViewModel$1 defaultViewModelDelegateFactory$createLazyViewModel$1) {
        super(2, cVar);
        this.c = defaultViewModelDelegateFactory$createLazyViewModel$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultViewModelDelegateFactory$createLazyViewModel$1$$special$$inlined$apply$lambda$1(cVar, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        DefaultViewModelDelegateFactory$createLazyViewModel$1 defaultViewModelDelegateFactory$createLazyViewModel$1 = this.c;
        new DefaultViewModelDelegateFactory$createLazyViewModel$1$$special$$inlined$apply$lambda$1(cVar, defaultViewModelDelegateFactory$createLazyViewModel$1);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        ((q) defaultViewModelDelegateFactory$createLazyViewModel$1.d).B0();
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ((q) this.c.d).B0();
        return i.a;
    }
}
