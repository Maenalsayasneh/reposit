package androidx.paging;

import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import h0.u.d0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f2.d;

@c(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {52}, m = "invokeSuspend")
/* compiled from: SimpleChannelFlow.kt */
public final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1 d;
    public final /* synthetic */ d q;

    @c(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1  reason: invalid class name */
    /* compiled from: SimpleChannelFlow.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;
        public int d;
        public final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 q;

        {
            this.q = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.q, cVar);
            r02.c = obj;
            return r02;
        }

        public final Object invoke(Object obj, Object obj2) {
            m0.l.c cVar = (m0.l.c) obj2;
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.q, cVar);
            r02.c = obj;
            return r02.invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.d;
            if (i == 0) {
                h.d4(obj);
                d0 d0Var = new d0((f0) this.c, this.q.q);
                p pVar = this.q.d.x.q;
                this.d = 1;
                if (pVar.invoke(d0Var, this) == coroutineSingletons) {
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
    public SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1 r1, d dVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = r1;
        this.q = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.d, this.q, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.d, this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            AnonymousClass1 r5 = new AnonymousClass1(this, (m0.l.c) null);
            this.c = 1;
            if (a.P0(r5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                this.q.o(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.D0(this.q, (Throwable) null, 1, (Object) null);
        return i.a;
    }
}
