package androidx.paging.multicast;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.d;
import n0.a.g2.e;
import n0.a.g2.s;

@c(c = "androidx.paging.multicast.Multicaster$flow$1", f = "Multicaster.kt", l = {100}, m = "invokeSuspend")
/* compiled from: Multicaster.kt */
public final class Multicaster$flow$1 extends SuspendLambda implements p<e<? super T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ h0.u.i0.c q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1(h0.u.i0.c cVar, m0.l.c cVar2) {
        super(2, cVar2);
        this.q = cVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        Multicaster$flow$1 multicaster$flow$1 = new Multicaster$flow$1(this.q, cVar);
        multicaster$flow$1.c = obj;
        return multicaster$flow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        Multicaster$flow$1 multicaster$flow$1 = new Multicaster$flow$1(this.q, cVar);
        multicaster$flow$1.c = obj;
        return multicaster$flow$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            d d2 = a.d(Integer.MAX_VALUE, (BufferOverflow) null, (l) null, 6);
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new s(new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new Multicaster$flow$1$subFlow$1(this, d2, (m0.l.c) null), a.J0(d2)), (m0.l.c) null)), new Multicaster$flow$1$subFlow$3(this, d2, (m0.l.c) null));
            this.d = 1;
            if (flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect((e) this.c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
