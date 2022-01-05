package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ActivityRepo", f = "ActivityRepo.kt", l = {48}, m = "getActionableNotifications")
/* compiled from: ActivityRepo.kt */
public final class ActivityRepo$getActionableNotifications$1 extends ContinuationImpl {
    public int Y1;
    public Object c;
    public Object d;
    public Object q;
    public /* synthetic */ Object x;
    public final /* synthetic */ ActivityRepo y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRepo$getActionableNotifications$1(ActivityRepo activityRepo, m0.l.c<? super ActivityRepo$getActionableNotifications$1> cVar) {
        super(cVar);
        this.y = activityRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.Y1 |= Integer.MIN_VALUE;
        return this.y.a(this);
    }
}
