package com.clubhouse.android.ui.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.ui.profile.ProfileViewModel", f = "ProfileViewModel.kt", l = {397}, m = "connectTwitterIntent")
/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$connectTwitterIntent$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ProfileViewModel q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$connectTwitterIntent$1(ProfileViewModel profileViewModel, m0.l.c<? super ProfileViewModel$connectTwitterIntent$1> cVar) {
        super(cVar);
        this.q = profileViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.r(this);
    }
}
