package com.clubhouse.android.ui.profile;

import i0.e.b.a3.f.f;
import i0.e.b.a3.f.g;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileUtil$setUpViews$37", f = "HalfProfileUtil.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$37 extends SuspendLambda implements p<f, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfProfileFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$37(HalfProfileFragment halfProfileFragment, m0.l.c<? super HalfProfileUtil$setUpViews$37> cVar) {
        super(2, cVar);
        this.d = halfProfileFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfProfileUtil$setUpViews$37 halfProfileUtil$setUpViews$37 = new HalfProfileUtil$setUpViews$37(this.d, cVar);
        halfProfileUtil$setUpViews$37.c = obj;
        return halfProfileUtil$setUpViews$37;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfProfileUtil$setUpViews$37 halfProfileUtil$setUpViews$37 = new HalfProfileUtil$setUpViews$37(this.d, (m0.l.c) obj2);
        halfProfileUtil$setUpViews$37.c = (f) obj;
        i iVar = i.a;
        halfProfileUtil$setUpViews$37.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        f fVar = (f) this.c;
        if (m0.n.b.i.a(fVar, g.a)) {
            this.d.dismiss();
        } else if (m0.n.b.i.a(fVar, i0.e.b.a3.f.i.a)) {
            this.d.P0();
        }
        return i.a;
    }
}
