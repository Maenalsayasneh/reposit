package com.clubhouse.android.notifications;

import i0.e.b.z2.g.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import m0.i;
import m0.n.a.l;

/* compiled from: PushListenerService.kt */
public final class PushListenerService$channelNotification$1$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ Ref$BooleanRef c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushListenerService$channelNotification$1$1(Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.c = ref$BooleanRef;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "it");
        this.c.c = kVar.m && kVar.d.h();
        return i.a;
    }
}
