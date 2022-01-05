package com.clubhouse.android.ui.events;

import com.clubhouse.android.ui.events.HalfEventFragment;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.g3.o.b0;
import i0.e.b.g3.o.c0;
import i0.e.b.g3.o.n0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.events.HalfEventFragment$onViewCreated$2", f = "HalfEventFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$onViewCreated$2 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$onViewCreated$2(HalfEventFragment halfEventFragment, m0.l.c<? super HalfEventFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = halfEventFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfEventFragment$onViewCreated$2 halfEventFragment$onViewCreated$2 = new HalfEventFragment$onViewCreated$2(this.d, cVar);
        halfEventFragment$onViewCreated$2.c = obj;
        return halfEventFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfEventFragment$onViewCreated$2 halfEventFragment$onViewCreated$2 = new HalfEventFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        halfEventFragment$onViewCreated$2.c = (b) obj;
        i iVar = i.a;
        halfEventFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        HalfEventFragment halfEventFragment = this.d;
        HalfEventFragment.b bVar2 = HalfEventFragment.p2;
        Objects.requireNonNull(halfEventFragment);
        if (bVar instanceof b0) {
            v.V1(halfEventFragment, HalfEventFragment.r2, Boolean.TRUE);
            halfEventFragment.V0().p(new n0(((b0) bVar).a, true));
        } else if (bVar instanceof c0) {
            v.V1(halfEventFragment, HalfEventFragment.r2, Boolean.FALSE);
            halfEventFragment.V0().p(new n0(((c0) bVar).a, false));
        }
        return i.a;
    }
}
