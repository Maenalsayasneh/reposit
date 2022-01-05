package com.clubhouse.android.shared.update;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.shared.update.UpdatesCoordinator", f = "UpdatesCoordinator.kt", l = {94}, m = "maybeShowReleaseNotes")
/* compiled from: UpdatesCoordinator.kt */
public final class UpdatesCoordinator$maybeShowReleaseNotes$1 extends ContinuationImpl {
    public Object c;
    public int d;
    public /* synthetic */ Object q;
    public final /* synthetic */ UpdatesCoordinator x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesCoordinator$maybeShowReleaseNotes$1(UpdatesCoordinator updatesCoordinator, m0.l.c<? super UpdatesCoordinator$maybeShowReleaseNotes$1> cVar) {
        super(cVar);
        this.x = updatesCoordinator;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.d(this);
    }
}
