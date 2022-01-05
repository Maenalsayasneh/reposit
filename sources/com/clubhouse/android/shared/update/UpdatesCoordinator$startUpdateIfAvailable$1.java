package com.clubhouse.android.shared.update;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.shared.update.UpdatesCoordinator", f = "UpdatesCoordinator.kt", l = {119}, m = "startUpdateIfAvailable")
/* compiled from: UpdatesCoordinator.kt */
public final class UpdatesCoordinator$startUpdateIfAvailable$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UpdatesCoordinator q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesCoordinator$startUpdateIfAvailable$1(UpdatesCoordinator updatesCoordinator, m0.l.c<? super UpdatesCoordinator$startUpdateIfAvailable$1> cVar) {
        super(cVar);
        this.q = updatesCoordinator;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return UpdatesCoordinator.c(this.q, this);
    }
}
