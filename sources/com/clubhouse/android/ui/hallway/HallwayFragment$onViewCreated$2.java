package com.clubhouse.android.ui.hallway;

import com.clubhouse.android.ui.ChannelDisplayState;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.hallway.HallwayFragment$onViewCreated$2", f = "HallwayFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$onViewCreated$2 extends SuspendLambda implements p<ChannelDisplayState, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HallwayFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$onViewCreated$2(HallwayFragment hallwayFragment, m0.l.c<? super HallwayFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = hallwayFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HallwayFragment$onViewCreated$2 hallwayFragment$onViewCreated$2 = new HallwayFragment$onViewCreated$2(this.d, cVar);
        hallwayFragment$onViewCreated$2.c = obj;
        return hallwayFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        HallwayFragment$onViewCreated$2 hallwayFragment$onViewCreated$2 = new HallwayFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        hallwayFragment$onViewCreated$2.c = (ChannelDisplayState) obj;
        i iVar = i.a;
        hallwayFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ChannelDisplayState channelDisplayState = (ChannelDisplayState) this.c;
        HallwayFragment hallwayFragment = this.d;
        k<Object>[] kVarArr = HallwayFragment.Z1;
        hallwayFragment.N0().a.setImportantForAccessibility(channelDisplayState == ChannelDisplayState.EXPANDED ? 4 : 0);
        return i.a;
    }
}
