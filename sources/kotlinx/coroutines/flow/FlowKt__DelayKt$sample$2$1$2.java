package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.d0.n;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {302}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements p<i, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ Ref$ObjectRef<Object> d;
    public final /* synthetic */ e<T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, e<? super T> eVar, m0.l.c<? super FlowKt__DelayKt$sample$2$1$2> cVar) {
        super(2, cVar);
        this.d = ref$ObjectRef;
        this.q = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        i iVar = (i) obj;
        return new FlowKt__DelayKt$sample$2$1$2(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.d;
            T t = ref$ObjectRef.c;
            if (t == null) {
                return i.a;
            }
            ref$ObjectRef.c = null;
            e<T> eVar = this.q;
            if (t == n.a) {
                t = null;
            }
            this.c = 1;
            if (eVar.emit(t, this) == coroutineSingletons) {
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
