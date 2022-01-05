package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.NotificationRepo", f = "NotificationRepo.kt", l = {29}, m = "getSettings")
/* compiled from: NotificationRepo.kt */
public final class NotificationRepo$getSettings$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ NotificationRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationRepo$getSettings$1(NotificationRepo notificationRepo, m0.l.c<? super NotificationRepo$getSettings$1> cVar) {
        super(cVar);
        this.d = notificationRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
