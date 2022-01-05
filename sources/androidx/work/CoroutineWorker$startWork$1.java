package androidx.work;

import androidx.work.ListenableWorker;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {69}, m = "invokeSuspend")
/* compiled from: CoroutineWorker.kt */
public final class CoroutineWorker$startWork$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ CoroutineWorker d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, m0.l.c cVar) {
        super(2, cVar);
        this.d = coroutineWorker;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CoroutineWorker$startWork$1(this.d, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new CoroutineWorker$startWork$1(this.d, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            CoroutineWorker coroutineWorker = this.d;
            this.c = 1;
            obj = coroutineWorker.g(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                this.d.Y1.k(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.d.Y1.j((ListenableWorker.a) obj);
        return i.a;
    }
}
