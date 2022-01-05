package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;
import n0.a.g2.z;

@c(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {210}, m = "invokeSuspend")
/* compiled from: SharingStarted.kt */
public final class StartedLazily$command$1 extends SuspendLambda implements p<e<? super SharingCommand>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z<Integer> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(z<Integer> zVar, m0.l.c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.q = zVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.q, cVar);
        startedLazily$command$1.d = obj;
        return startedLazily$command$1;
    }

    public Object invoke(Object obj, Object obj2) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.q, (m0.l.c) obj2);
        startedLazily$command$1.d = (e) obj;
        return startedLazily$command$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            z<Integer> zVar = this.q;
            StartedLazily$command$1$invokeSuspend$$inlined$collect$1 startedLazily$command$1$invokeSuspend$$inlined$collect$1 = new StartedLazily$command$1$invokeSuspend$$inlined$collect$1(ref$BooleanRef, (e) this.d);
            this.c = 1;
            if (zVar.collect(startedLazily$command$1$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
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
