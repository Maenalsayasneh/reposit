package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.f0;
import n0.a.g2.e;

@c(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1", f = "SharedFlowProducer.kt", l = {97}, m = "invokeSuspend")
/* compiled from: SharedFlowProducer.kt */
public final class SharedFlowProducer$collectionJob$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ SharedFlowProducer d;

    @c(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1", f = "SharedFlowProducer.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1  reason: invalid class name */
    /* compiled from: SharedFlowProducer.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements q<e<? super T>, Throwable, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;
        public int d;
        public final /* synthetic */ SharedFlowProducer$collectionJob$1 q;

        {
            this.q = r1;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Throwable th = (Throwable) obj2;
            m0.l.c cVar = (m0.l.c) obj3;
            m0.n.b.i.e((e) obj, "$this$create");
            m0.n.b.i.e(th, "it");
            m0.n.b.i.e(cVar, "continuation");
            AnonymousClass1 r2 = new AnonymousClass1(this.q, cVar);
            r2.c = th;
            return r2.invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.d;
            if (i == 0) {
                h.d4(obj);
                p<ChannelManager.b.C0004b<T>, m0.l.c<? super i>, Object> pVar = this.q.d.d;
                ChannelManager.b.C0004b.a aVar = new ChannelManager.b.C0004b.a((Throwable) this.c);
                this.d = 1;
                if (pVar.invoke(aVar, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowProducer$collectionJob$1(SharedFlowProducer sharedFlowProducer, m0.l.c cVar) {
        super(2, cVar);
        this.d = sharedFlowProducer;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new SharedFlowProducer$collectionJob$1(this.d, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new SharedFlowProducer$collectionJob$1(this.d, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.d.c, new AnonymousClass1(this, (m0.l.c) null));
            SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 = new SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(this);
            this.c = 1;
            if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (ClosedSendChannelException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
