package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.NotificationRepo", f = "NotificationRepo.kt", l = {104}, m = "updateNotificationToken")
/* compiled from: NotificationRepo.kt */
public final class NotificationRepo$updateNotificationToken$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ NotificationRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationRepo$updateNotificationToken$1(NotificationRepo notificationRepo, m0.l.c<? super NotificationRepo$updateNotificationToken$1> cVar) {
        super(cVar);
        this.q = notificationRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.h(false, (String) null, this);
    }
}
