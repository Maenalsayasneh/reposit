package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import n0.a.g2.d0.n;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {235}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ e<T> d;
    public final /* synthetic */ Ref$ObjectRef<Object> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(e<? super T> eVar, Ref$ObjectRef<Object> ref$ObjectRef, m0.l.c<? super FlowKt__DelayKt$debounceInternal$1$3$1> cVar) {
        super(1, cVar);
        this.d = eVar;
        this.q = ref$ObjectRef;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            e<T> eVar = this.d;
            T t = n.a;
            T t2 = this.q.c;
            if (t2 == t) {
                t2 = null;
            }
            this.c = 1;
            if (eVar.emit(t2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.q.c = null;
        return i.a;
    }
}
