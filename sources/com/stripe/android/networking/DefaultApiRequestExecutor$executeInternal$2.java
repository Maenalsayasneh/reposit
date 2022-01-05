package com.stripe.android.networking;

import com.stripe.android.Logger;
import com.stripe.android.networking.DefaultApiRequestExecutor;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.networking.DefaultApiRequestExecutor$executeInternal$2", f = "DefaultApiRequestExecutor.kt", l = {45, 50}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/networking/StripeResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultApiRequestExecutor.kt */
public final class DefaultApiRequestExecutor$executeInternal$2 extends SuspendLambda implements p<f0, m0.l.c<? super StripeResponse>, Object> {
    public final /* synthetic */ int $remainingRetries;
    public final /* synthetic */ StripeRequest $request;
    public int label;
    public final /* synthetic */ DefaultApiRequestExecutor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultApiRequestExecutor$executeInternal$2(DefaultApiRequestExecutor defaultApiRequestExecutor, StripeRequest stripeRequest, int i, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultApiRequestExecutor;
        this.$request = stripeRequest;
        this.$remainingRetries = i;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultApiRequestExecutor$executeInternal$2(this.this$0, this.$request, this.$remainingRetries, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultApiRequestExecutor$executeInternal$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            Logger access$getLogger$p = this.this$0.logger;
            StringBuilder P0 = a.P0("Firing request: ");
            P0.append(this.$request);
            access$getLogger$p.info(P0.toString());
            StripeResponse access$makeRequest = this.this$0.makeRequest(this.$request);
            if (!access$makeRequest.isRateLimited$payments_core_release() || this.$remainingRetries <= 0) {
                return access$makeRequest;
            }
            Logger access$getLogger$p2 = this.this$0.logger;
            StringBuilder P02 = a.P0("Request was rate-limited with ");
            P02.append(this.$remainingRetries);
            P02.append(" remaining retries.");
            access$getLogger$p2.info(P02.toString());
            RetryDelaySupplier access$getRetryDelaySupplier$p = this.this$0.retryDelaySupplier;
            DefaultApiRequestExecutor.Companion unused = DefaultApiRequestExecutor.Companion;
            long delayMillis = access$getRetryDelaySupplier$p.getDelayMillis(3, this.$remainingRetries);
            this.label = 1;
            if (m0.r.t.a.r.m.a1.a.d1(delayMillis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return (StripeResponse) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.label = 2;
        obj = this.this$0.executeInternal$payments_core_release(this.$request, this.$remainingRetries - 1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        return (StripeResponse) obj;
    }
}
