package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UpdatesRepo", f = "UpdatesRepo.kt", l = {35}, m = "getReleaseNotes")
/* compiled from: UpdatesRepo.kt */
public final class UpdatesRepo$getReleaseNotes$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ UpdatesRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesRepo$getReleaseNotes$1(UpdatesRepo updatesRepo, m0.l.c<? super UpdatesRepo$getReleaseNotes$1> cVar) {
        super(cVar);
        this.d = updatesRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.b(0, 0, this);
    }
}
