package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2", f = "StripeHttpClient.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeHttpClient.kt */
public final class StripeHttpClient$doPostRequest$2 extends SuspendLambda implements p<f0, m0.l.c<? super HttpResponse>, Object> {
    public final /* synthetic */ String $contentType;
    public final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StripeHttpClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeHttpClient$doPostRequest$2(StripeHttpClient stripeHttpClient, String str, String str2, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripeHttpClient;
        this.$requestBody = str;
        this.$contentType = str2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        StripeHttpClient$doPostRequest$2 stripeHttpClient$doPostRequest$2 = new StripeHttpClient$doPostRequest$2(this.this$0, this.$requestBody, this.$contentType, cVar);
        stripeHttpClient$doPostRequest$2.L$0 = obj;
        return stripeHttpClient$doPostRequest$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripeHttpClient$doPostRequest$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            try {
                obj2 = this.this$0.doPostRequestInternal(this.$requestBody, this.$contentType);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
            Throwable a = Result.a(obj2);
            if (a != null) {
                this.this$0.errorReporter.reportError(a);
            }
            Throwable a2 = Result.a(obj2);
            if (a2 == null) {
                return obj2;
            }
            throw new SDKRuntimeException(a2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
