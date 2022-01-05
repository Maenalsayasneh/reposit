package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.d;
import n0.a.g2.e;

@c(c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$1", f = "Multicaster.kt", l = {78}, m = "invokeSuspend")
/* compiled from: Multicaster.kt */
public final class Multicaster$flow$1$subFlow$1 extends SuspendLambda implements p<e<? super ChannelManager.b.C0004b.c<T>>, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ Multicaster$flow$1 d;
    public final /* synthetic */ d q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$subFlow$1(Multicaster$flow$1 multicaster$flow$1, d dVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = multicaster$flow$1;
        this.q = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Multicaster$flow$1$subFlow$1(this.d, this.q, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new Multicaster$flow$1$subFlow$1(this.d, this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d dVar = this.q;
            this.c = 1;
            Object e = ((ChannelManager) this.d.q.a.getValue()).a.e(new ChannelManager.b.a(dVar), this);
            if (e != coroutineSingletons) {
                e = i.a;
            }
            if (e == coroutineSingletons) {
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
