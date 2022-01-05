package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.f1;

@c(c = "androidx.paging.multicast.SharedFlowProducer$start$1", f = "SharedFlowProducer.kt", l = {75, 80, 80}, m = "invokeSuspend")
/* compiled from: SharedFlowProducer.kt */
public final class SharedFlowProducer$start$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ SharedFlowProducer q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowProducer$start$1(SharedFlowProducer sharedFlowProducer, m0.l.c cVar) {
        super(2, cVar);
        this.q = sharedFlowProducer;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new SharedFlowProducer$start$1(this.q, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new SharedFlowProducer$start$1(this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            f1 f1Var = this.q.a;
            this.d = 1;
            if (f1Var.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th2) {
                try {
                    SharedFlowProducer sharedFlowProducer = this.q;
                    p<ChannelManager.b.C0004b<T>, m0.l.c<? super i>, Object> pVar = sharedFlowProducer.d;
                    ChannelManager.b.C0004b.C0005b bVar = new ChannelManager.b.C0004b.C0005b(sharedFlowProducer);
                    this.c = th2;
                    this.d = 3;
                    if (pVar.invoke(bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (ClosedSendChannelException unused) {
                }
                th = th2;
            }
        } else if (i == 2) {
            try {
                h.d4(obj);
            } catch (ClosedSendChannelException unused2) {
            }
            return i.a;
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.c;
            try {
                h.d4(obj);
            } catch (ClosedSendChannelException unused3) {
            }
            throw th;
        }
        SharedFlowProducer sharedFlowProducer2 = this.q;
        p<ChannelManager.b.C0004b<T>, m0.l.c<? super i>, Object> pVar2 = sharedFlowProducer2.d;
        ChannelManager.b.C0004b.C0005b bVar2 = new ChannelManager.b.C0004b.C0005b(sharedFlowProducer2);
        this.d = 2;
        if (pVar2.invoke(bVar2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return i.a;
    }
}
