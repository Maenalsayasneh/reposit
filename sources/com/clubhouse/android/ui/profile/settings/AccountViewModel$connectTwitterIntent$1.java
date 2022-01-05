package com.clubhouse.android.ui.profile.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.ui.profile.settings.AccountViewModel", f = "AccountViewModel.kt", l = {194}, m = "connectTwitterIntent")
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$connectTwitterIntent$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AccountViewModel q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$connectTwitterIntent$1(AccountViewModel accountViewModel, m0.l.c<? super AccountViewModel$connectTwitterIntent$1> cVar) {
        super(cVar);
        this.q = accountViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.q(this);
    }
}
