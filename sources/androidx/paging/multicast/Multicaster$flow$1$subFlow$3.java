package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.f2.d;
import n0.a.g2.e;

@c(c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$3", f = "Multicaster.kt", l = {84}, m = "invokeSuspend")
/* compiled from: Multicaster.kt */
public final class Multicaster$flow$1$subFlow$3 extends SuspendLambda implements q<e<? super T>, Throwable, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ Multicaster$flow$1 d;
    public final /* synthetic */ d q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$subFlow$3(Multicaster$flow$1 multicaster$flow$1, d dVar, m0.l.c cVar) {
        super(3, cVar);
        this.d = multicaster$flow$1;
        this.q = dVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        m0.l.c cVar = (m0.l.c) obj3;
        m0.n.b.i.e((e) obj, "$this$create");
        m0.n.b.i.e(cVar, "continuation");
        return new Multicaster$flow$1$subFlow$3(this.d, this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d dVar = this.q;
            this.c = 1;
            Object e = ((ChannelManager) this.d.q.a.getValue()).a.e(new ChannelManager.b.c(dVar), this);
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
