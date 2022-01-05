package com.clubhouse.android.ui.onboarding;

import h0.b0.v;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberFragment$onCreate$8", f = "ValidateNumberFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment$onCreate$8 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ValidateNumberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberFragment$onCreate$8(ValidateNumberFragment validateNumberFragment, m0.l.c<? super ValidateNumberFragment$onCreate$8> cVar) {
        super(2, cVar);
        this.c = validateNumberFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ValidateNumberFragment$onCreate$8(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        ValidateNumberFragment validateNumberFragment = this.c;
        new ValidateNumberFragment$onCreate$8(validateNumberFragment, (m0.l.c) obj2);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        v.f2(validateNumberFragment, AnonymousClass1.c);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        v.f2(this.c, AnonymousClass1.c);
        return i.a;
    }
}
