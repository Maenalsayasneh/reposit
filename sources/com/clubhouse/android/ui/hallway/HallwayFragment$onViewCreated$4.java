package com.clubhouse.android.ui.hallway;

import com.clubhouse.android.ui.channels.ChannelNavigation;
import com.clubhouse.android.user.model.User;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.p.s;
import i0.e.b.g3.p.x;
import i0.e.b.g3.p.z;
import i0.e.b.z2.f.e;
import i0.e.e.m.g;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.hallway.HallwayFragment$onViewCreated$4", f = "HallwayFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$onViewCreated$4 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HallwayFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$onViewCreated$4(HallwayFragment hallwayFragment, m0.l.c<? super HallwayFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = hallwayFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HallwayFragment$onViewCreated$4 hallwayFragment$onViewCreated$4 = new HallwayFragment$onViewCreated$4(this.d, cVar);
        hallwayFragment$onViewCreated$4.c = obj;
        return hallwayFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        HallwayFragment$onViewCreated$4 hallwayFragment$onViewCreated$4 = new HallwayFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        hallwayFragment$onViewCreated$4.c = (b) obj;
        i iVar = i.a;
        hallwayFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof e) {
            ChannelNavigation.a(this.d, (e) bVar);
        } else if (bVar instanceof s) {
            v.a2(this.d, ((s) bVar).a);
        } else if (bVar instanceof x) {
            HallwayFragment hallwayFragment = this.d;
            k<Object>[] kVarArr = HallwayFragment.Z1;
            hallwayFragment.N0().g.setCurrentItem(0);
        } else if (bVar instanceof d) {
            v.f2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(((d) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof z) {
            g.a.a(this.d, (User) null, (a<i>) null);
        }
        return i.a;
    }
}
