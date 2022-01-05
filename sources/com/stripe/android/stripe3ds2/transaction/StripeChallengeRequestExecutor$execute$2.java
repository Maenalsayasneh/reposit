package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2", f = "StripeChallengeRequestExecutor.kt", l = {58, 64}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeChallengeRequestExecutor.kt */
public final class StripeChallengeRequestExecutor$execute$2 extends SuspendLambda implements p<f0, m0.l.c<? super ChallengeRequestResult>, Object> {
    public final /* synthetic */ ChallengeRequestData $creqData;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StripeChallengeRequestExecutor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeChallengeRequestExecutor$execute$2(StripeChallengeRequestExecutor stripeChallengeRequestExecutor, ChallengeRequestData challengeRequestData, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripeChallengeRequestExecutor;
        this.$creqData = challengeRequestData;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        StripeChallengeRequestExecutor$execute$2 stripeChallengeRequestExecutor$execute$2 = new StripeChallengeRequestExecutor$execute$2(this.this$0, this.$creqData, cVar);
        stripeChallengeRequestExecutor$execute$2.L$0 = obj;
        return stripeChallengeRequestExecutor$execute$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripeChallengeRequestExecutor$execute$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            HttpClient access$getHttpClient$p = this.this$0.httpClient;
            String access$getRequestBody = this.this$0.getRequestBody(this.$creqData.toJson$3ds2sdk_release());
            this.label = 1;
            obj = access$getHttpClient$p.doPostRequest(access$getRequestBody, "application/jose; charset=UTF-8", this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else if (i == 2) {
            h.d4(obj);
            return (ChallengeRequestResult) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (HttpResponse) obj;
        Throwable a = Result.a(obj2);
        if (a != null) {
            this.this$0.errorReporter.reportError(a);
        }
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            return new ChallengeRequestResult.RuntimeError(a2);
        }
        ChallengeResponseProcessor access$getResponseProcessor$p = this.this$0.responseProcessor;
        ChallengeRequestData challengeRequestData = this.$creqData;
        this.label = 2;
        obj = access$getResponseProcessor$p.process(challengeRequestData, (HttpResponse) obj2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        return (ChallengeRequestResult) obj;
    }
}
