package com.clubhouse.android.ui.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel", f = "HalfProfileViewModel.kt", l = {302}, m = "connectTwitterIntent")
/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$connectTwitterIntent$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ HalfProfileViewModel q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$connectTwitterIntent$1(HalfProfileViewModel halfProfileViewModel, m0.l.c<? super HalfProfileViewModel$connectTwitterIntent$1> cVar) {
        super(cVar);
        this.q = halfProfileViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.r(this);
    }
}
