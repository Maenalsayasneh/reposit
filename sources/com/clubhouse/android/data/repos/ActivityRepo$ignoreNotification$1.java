package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ActivityRepo", f = "ActivityRepo.kt", l = {67}, m = "ignoreNotification")
/* compiled from: ActivityRepo.kt */
public final class ActivityRepo$ignoreNotification$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ActivityRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRepo$ignoreNotification$1(ActivityRepo activityRepo, m0.l.c<? super ActivityRepo$ignoreNotification$1> cVar) {
        super(cVar);
        this.q = activityRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.b(0, this);
    }
}
