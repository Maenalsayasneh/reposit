package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.g;
import n0.a.g2.d0.n;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {245}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements p<g<? extends Object>, m0.l.c<? super i>, Object> {
    public Object c;
    public int d;
    public /* synthetic */ Object q;
    public final /* synthetic */ Ref$ObjectRef<Object> x;
    public final /* synthetic */ e<T> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, e<? super T> eVar, m0.l.c<? super FlowKt__DelayKt$debounceInternal$1$3$2> cVar) {
        super(2, cVar);
        this.x = ref$ObjectRef;
        this.y = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.x, this.y, cVar);
        flowKt__DelayKt$debounceInternal$1$3$2.q = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    public Object invoke(Object obj, Object obj2) {
        g gVar = new g(((g) obj).c);
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.x, this.y, (m0.l.c) obj2);
        flowKt__DelayKt$debounceInternal$1$3$2.q = gVar;
        return flowKt__DelayKt$debounceInternal$1$3$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            T t = ((g) this.q).c;
            ref$ObjectRef = this.x;
            boolean z = t instanceof g.c;
            if (!z) {
                ref$ObjectRef.c = t;
            }
            e<T> eVar = this.y;
            if (z) {
                Throwable a = g.a(t);
                if (a == null) {
                    T t2 = ref$ObjectRef.c;
                    if (t2 != null) {
                        if (t2 == n.a) {
                            t2 = null;
                        }
                        this.q = t;
                        this.c = ref$ObjectRef;
                        this.d = 1;
                        if (eVar.emit(t2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.c = n.c;
                } else {
                    throw a;
                }
            }
            return i.a;
        } else if (i == 1) {
            ref$ObjectRef2 = (Ref$ObjectRef) this.c;
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.c = n.c;
        return i.a;
    }
}
