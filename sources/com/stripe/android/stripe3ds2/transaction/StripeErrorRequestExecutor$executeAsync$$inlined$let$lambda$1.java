package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$executeAsync$3$1", f = "StripeErrorRequestExecutor.kt", l = {33}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$executeAsync$3$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeErrorRequestExecutor.kt */
public final class StripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StripeErrorRequestExecutor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1(String str, m0.l.c cVar, StripeErrorRequestExecutor stripeErrorRequestExecutor) {
        super(2, cVar);
        this.$requestBody = str;
        this.this$0 = stripeErrorRequestExecutor;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        StripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1 stripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1 = new StripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1(this.$requestBody, cVar, this.this$0);
        stripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1.L$0 = obj;
        return stripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            HttpClient access$getHttpClient$p = this.this$0.httpClient;
            String str = this.$requestBody;
            m0.n.b.i.d(str, "requestBody");
            StripeErrorRequestExecutor.Companion unused = StripeErrorRequestExecutor.Companion;
            this.label = 1;
            obj = access$getHttpClient$p.doPostRequest(str, "application/json; charset=utf-8", this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (HttpResponse) obj;
        Throwable a = Result.a(obj2);
        if (a != null) {
            this.this$0.errorReporter.reportError(a);
        }
        return i.a;
    }
}
