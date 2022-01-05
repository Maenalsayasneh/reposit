package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UpdatesRepo", f = "UpdatesRepo.kt", l = {27}, m = "checkForUpdates")
/* compiled from: UpdatesRepo.kt */
public final class UpdatesRepo$checkForUpdates$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UpdatesRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesRepo$checkForUpdates$1(UpdatesRepo updatesRepo, m0.l.c<? super UpdatesRepo$checkForUpdates$1> cVar) {
        super(cVar);
        this.q = updatesRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
