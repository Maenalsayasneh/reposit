package com.stripe.android.stripe3ds2.observability;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1", f = "DefaultErrorReporter.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultErrorReporter.kt */
public final class DefaultErrorReporter$reportError$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ Throwable $t;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DefaultErrorReporter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultErrorReporter$reportError$1(DefaultErrorReporter defaultErrorReporter, Throwable th, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultErrorReporter;
        this.$t = th;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        DefaultErrorReporter$reportError$1 defaultErrorReporter$reportError$1 = new DefaultErrorReporter$reportError$1(this.this$0, this.$t, cVar);
        defaultErrorReporter$reportError$1.L$0 = obj;
        return defaultErrorReporter$reportError$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultErrorReporter$reportError$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            try {
                DefaultErrorReporter defaultErrorReporter = this.this$0;
                defaultErrorReporter.send(defaultErrorReporter.createRequestBody$3ds2sdk_release(this.$t));
                obj2 = i.a;
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
            DefaultErrorReporter defaultErrorReporter2 = this.this$0;
            Throwable a = Result.a(obj2);
            if (a != null) {
                defaultErrorReporter2.onFailure(a);
            }
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
