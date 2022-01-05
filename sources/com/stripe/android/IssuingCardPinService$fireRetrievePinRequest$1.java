package com.stripe.android;

import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f0;
import n0.a.h2.o;
import n0.a.l1;
import n0.a.m0;

@c(c = "com.stripe.android.IssuingCardPinService$fireRetrievePinRequest$1", f = "IssuingCardPinService.kt", l = {150, 160, 165}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: IssuingCardPinService.kt */
public final class IssuingCardPinService$fireRetrievePinRequest$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ EphemeralKey $ephemeralKey;
    public final /* synthetic */ IssuingCardPinService.IssuingCardPinRetrievalListener $listener;
    public final /* synthetic */ EphemeralOperation.Issuing.RetrievePin $operation;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ IssuingCardPinService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$fireRetrievePinRequest$1(IssuingCardPinService issuingCardPinService, EphemeralOperation.Issuing.RetrievePin retrievePin, EphemeralKey ephemeralKey, IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = issuingCardPinService;
        this.$operation = retrievePin;
        this.$ephemeralKey = ephemeralKey;
        this.$listener = issuingCardPinRetrievalListener;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        IssuingCardPinService$fireRetrievePinRequest$1 issuingCardPinService$fireRetrievePinRequest$1 = new IssuingCardPinService$fireRetrievePinRequest$1(this.this$0, this.$operation, this.$ephemeralKey, this.$listener, cVar);
        issuingCardPinService$fireRetrievePinRequest$1.L$0 = obj;
        return issuingCardPinService$fireRetrievePinRequest$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IssuingCardPinService$fireRetrievePinRequest$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            StripeRepository access$getStripeRepository$p = this.this$0.stripeRepository;
            String cardId = this.$operation.getCardId();
            String verificationId = this.$operation.getVerificationId();
            String userOneTimeCode = this.$operation.getUserOneTimeCode();
            ApiRequest.Options options = new ApiRequest.Options(this.$ephemeralKey.getSecret(), this.this$0.stripeAccountId, (String) null, 4, (f) null);
            this.label = 1;
            obj3 = access$getStripeRepository$p.retrieveIssuingCardPin(cardId, verificationId, userOneTimeCode, options, this);
            if (obj3 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
                obj3 = obj;
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else if (i == 2 || i == 3) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj3 != null) {
            obj2 = (String) obj3;
            Throwable a = Result.a(obj2);
            if (a == null) {
                d0 d0Var = m0.a;
                l1 l1Var = o.c;
                IssuingCardPinService$fireRetrievePinRequest$1$invokeSuspend$$inlined$fold$lambda$1 issuingCardPinService$fireRetrievePinRequest$1$invokeSuspend$$inlined$fold$lambda$1 = new IssuingCardPinService$fireRetrievePinRequest$1$invokeSuspend$$inlined$fold$lambda$1((String) obj2, (m0.l.c) null, this);
                this.label = 2;
                if (a.k4(l1Var, issuingCardPinService$fireRetrievePinRequest$1$invokeSuspend$$inlined$fold$lambda$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                IssuingCardPinService issuingCardPinService = this.this$0;
                IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = this.$listener;
                this.label = 3;
                if (issuingCardPinService.onRetrievePinError(a, issuingCardPinRetrievalListener, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return i.a;
        }
        throw new IllegalArgumentException("Could not retrieve issuing card PIN.".toString());
    }
}
