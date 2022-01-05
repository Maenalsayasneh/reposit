package com.clubhouse.android.util;

import com.clubhouse.android.shared.FeatureFlags;
import com.clubhouse.android.shared.Flag;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.util.Monitoring$initInstabugIfNeeded$1$1", f = "Monitoring.kt", l = {}, m = "invokeSuspend")
/* compiled from: Monitoring.kt */
public final class Monitoring$initInstabugIfNeeded$1$1 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public final /* synthetic */ Monitoring d;
    public final /* synthetic */ int q;
    public final /* synthetic */ FeatureFlags x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Monitoring$initInstabugIfNeeded$1$1(Monitoring monitoring, int i, FeatureFlags featureFlags, m0.l.c<? super Monitoring$initInstabugIfNeeded$1$1> cVar) {
        super(2, cVar);
        this.d = monitoring;
        this.q = i;
        this.x = featureFlags;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        Monitoring$initInstabugIfNeeded$1$1 monitoring$initInstabugIfNeeded$1$1 = new Monitoring$initInstabugIfNeeded$1$1(this.d, this.q, this.x, cVar);
        monitoring$initInstabugIfNeeded$1$1.c = ((Boolean) obj).booleanValue();
        return monitoring$initInstabugIfNeeded$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        Monitoring$initInstabugIfNeeded$1$1 monitoring$initInstabugIfNeeded$1$1 = new Monitoring$initInstabugIfNeeded$1$1(this.d, this.q, this.x, (m0.l.c) obj2);
        monitoring$initInstabugIfNeeded$1$1.c = valueOf.booleanValue();
        i iVar = i.a;
        monitoring$initInstabugIfNeeded$1$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        this.d.a(this.q, this.c, this.x.a(Flag.AgoraLogging));
        return i.a;
    }
}
