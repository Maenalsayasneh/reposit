package com.clubhouse.android.ui.hallway;

import android.os.Parcelable;
import h0.b0.v;
import i0.e.b.a3.f.l;
import i0.e.b.a3.f.n;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.hallway.HallwayFragment$onViewCreated$5", f = "HallwayFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$onViewCreated$5 extends SuspendLambda implements p<n, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HallwayFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$onViewCreated$5(HallwayFragment hallwayFragment, m0.l.c<? super HallwayFragment$onViewCreated$5> cVar) {
        super(2, cVar);
        this.d = hallwayFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HallwayFragment$onViewCreated$5 hallwayFragment$onViewCreated$5 = new HallwayFragment$onViewCreated$5(this.d, cVar);
        hallwayFragment$onViewCreated$5.c = obj;
        return hallwayFragment$onViewCreated$5;
    }

    public Object invoke(Object obj, Object obj2) {
        HallwayFragment$onViewCreated$5 hallwayFragment$onViewCreated$5 = new HallwayFragment$onViewCreated$5(this.d, (m0.l.c) obj2);
        hallwayFragment$onViewCreated$5.c = (n) obj;
        i iVar = i.a;
        hallwayFragment$onViewCreated$5.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (m0.n.b.i.a((n) this.c, l.a)) {
            v.a2(this.d, (Parcelable) null);
        }
        return i.a;
    }
}
