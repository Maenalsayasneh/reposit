package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements p<T, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e<T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(e<? super T> eVar, m0.l.c<? super UndispatchedContextCollector$emitRef$1> cVar) {
        super(2, cVar);
        this.q = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.q, cVar);
        undispatchedContextCollector$emitRef$1.d = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    public Object invoke(Object obj, Object obj2) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.q, (m0.l.c) obj2);
        undispatchedContextCollector$emitRef$1.d = obj;
        return undispatchedContextCollector$emitRef$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Object obj2 = this.d;
            e<T> eVar = this.q;
            this.c = 1;
            if (eVar.emit(obj2, this) == coroutineSingletons) {
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
