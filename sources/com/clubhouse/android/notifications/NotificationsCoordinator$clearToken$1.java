package com.clubhouse.android.notifications;

import com.clubhouse.android.data.repos.NotificationRepo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.notifications.NotificationsCoordinator", f = "NotificationsCoordinator.kt", l = {82}, m = "clearToken")
/* compiled from: NotificationsCoordinator.kt */
public final class NotificationsCoordinator$clearToken$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ NotificationsCoordinator d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationsCoordinator$clearToken$1(NotificationsCoordinator notificationsCoordinator, m0.l.c<? super NotificationsCoordinator$clearToken$1> cVar) {
        super(cVar);
        this.d = notificationsCoordinator;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return NotificationsCoordinator.a(this.d, (NotificationRepo) null, false, this);
    }
}
