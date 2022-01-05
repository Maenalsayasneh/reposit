package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetNotificationsPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.i;
import i0.e.b.l;
import i0.e.b.n2;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: ActivityRepo.kt */
public final class ActivityRepo$getNotifications$1 extends Lambda implements a<x<Integer, i>> {
    public final /* synthetic */ ActivityRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRepo$getNotifications$1(ActivityRepo activityRepo) {
        super(0);
        this.c = activityRepo;
    }

    public Object invoke() {
        l.i iVar = ((n2) this.c.b).a.f;
        return new GetNotificationsPagingSource(iVar.e.J(), iVar.e.u(), h.m3(iVar.e.b));
    }
}
