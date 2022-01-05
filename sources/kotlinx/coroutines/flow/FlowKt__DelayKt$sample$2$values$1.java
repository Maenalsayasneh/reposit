package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.l;
import n0.a.g2.d;
import n0.a.g2.d0.n;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", l = {352}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$sample$2$values$1 extends SuspendLambda implements p<l<? super Object>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d<T> q;

    /* compiled from: Collect.kt */
    public static final class a implements e<T> {
        public final /* synthetic */ l c;

        public a(l lVar) {
            this.c = lVar;
        }

        public Object emit(T t, m0.l.c<? super i> cVar) {
            l lVar = this.c;
            if (t == null) {
                t = n.a;
            }
            Object t2 = lVar.t(t, cVar);
            if (t2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return t2;
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$values$1(d<? extends T> dVar, m0.l.c<? super FlowKt__DelayKt$sample$2$values$1> cVar) {
        super(2, cVar);
        this.q = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new FlowKt__DelayKt$sample$2$values$1(this.q, cVar);
        flowKt__DelayKt$sample$2$values$1.d = obj;
        return flowKt__DelayKt$sample$2$values$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new FlowKt__DelayKt$sample$2$values$1(this.q, (m0.l.c) obj2);
        flowKt__DelayKt$sample$2$values$1.d = (l) obj;
        return flowKt__DelayKt$sample$2$values$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<T> dVar = this.q;
            a aVar = new a((l) this.d);
            this.c = 1;
            if (dVar.collect(aVar, this) == coroutineSingletons) {
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
