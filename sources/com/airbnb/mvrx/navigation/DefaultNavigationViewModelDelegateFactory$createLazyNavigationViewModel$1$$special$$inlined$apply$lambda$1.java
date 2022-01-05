package com.airbnb.mvrx.navigation;

import i0.b.b.q;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.navigation.DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$1$1", f = "MavericksExtensions.kt", l = {}, m = "invokeSuspend")
/* compiled from: MavericksExtensions.kt */
public final class DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$$special$$inlined$apply$lambda$1 extends SuspendLambda implements p<S, m0.l.c<? super i>, Object> {
    public final /* synthetic */ DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$$special$$inlined$apply$lambda$1(m0.l.c cVar, DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1 defaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1) {
        super(2, cVar);
        this.c = defaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$$special$$inlined$apply$lambda$1(cVar, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1 defaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1 = this.c;
        new DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$$special$$inlined$apply$lambda$1(cVar, defaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        ((q) defaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1.c).B0();
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ((q) this.c.c).B0();
        return i.a;
    }
}
