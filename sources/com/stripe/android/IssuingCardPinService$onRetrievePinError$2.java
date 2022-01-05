package com.stripe.android;

import com.stripe.android.IssuingCardPinService;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.IssuingCardPinService$onRetrievePinError$2", f = "IssuingCardPinService.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: IssuingCardPinService.kt */
public final class IssuingCardPinService$onRetrievePinError$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ IssuingCardPinService.IssuingCardPinRetrievalListener $listener;
    public final /* synthetic */ Throwable $throwable;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$onRetrievePinError$2(Throwable th, IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, m0.l.c cVar) {
        super(2, cVar);
        this.$throwable = th;
        this.$listener = issuingCardPinRetrievalListener;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new IssuingCardPinService$onRetrievePinError$2(this.$throwable, this.$listener, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IssuingCardPinService$onRetrievePinError$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r3.label
            if (r0 != 0) goto L_0x0089
            i0.j.f.p.h.d4(r4)
            java.lang.Throwable r4 = r3.$throwable
            boolean r0 = r4 instanceof com.stripe.android.exception.InvalidRequestException
            if (r0 == 0) goto L_0x007d
            com.stripe.android.exception.InvalidRequestException r4 = (com.stripe.android.exception.InvalidRequestException) r4
            com.stripe.android.StripeError r4 = r4.getStripeError()
            r0 = 0
            if (r4 == 0) goto L_0x001d
            java.lang.String r4 = r4.getCode()
            goto L_0x001e
        L_0x001d:
            r4 = r0
        L_0x001e:
            if (r4 != 0) goto L_0x0021
            goto L_0x0071
        L_0x0021:
            int r1 = r4.hashCode()
            switch(r1) {
                case -1309235419: goto L_0x005f;
                case -1266028985: goto L_0x004d;
                case 830217595: goto L_0x003b;
                case 1888170818: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0071
        L_0x0029:
            java.lang.String r1 = "already_redeemed"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0071
            com.stripe.android.IssuingCardPinService$IssuingCardPinRetrievalListener r4 = r3.$listener
            com.stripe.android.IssuingCardPinService$CardPinActionError r1 = com.stripe.android.IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_ALREADY_REDEEMED
            java.lang.String r2 = "The verification challenge was already redeemed."
            r4.onError(r1, r2, r0)
            goto L_0x0086
        L_0x003b:
            java.lang.String r1 = "too_many_attempts"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0071
            com.stripe.android.IssuingCardPinService$IssuingCardPinRetrievalListener r4 = r3.$listener
            com.stripe.android.IssuingCardPinService$CardPinActionError r1 = com.stripe.android.IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_TOO_MANY_ATTEMPTS
            java.lang.String r2 = "The verification challenge was attempted too many times."
            r4.onError(r1, r2, r0)
            goto L_0x0086
        L_0x004d:
            java.lang.String r1 = "incorrect_code"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0071
            com.stripe.android.IssuingCardPinService$IssuingCardPinRetrievalListener r4 = r3.$listener
            com.stripe.android.IssuingCardPinService$CardPinActionError r1 = com.stripe.android.IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_INCORRECT
            java.lang.String r2 = "The one-time code was incorrect."
            r4.onError(r1, r2, r0)
            goto L_0x0086
        L_0x005f:
            java.lang.String r1 = "expired"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0071
            com.stripe.android.IssuingCardPinService$IssuingCardPinRetrievalListener r4 = r3.$listener
            com.stripe.android.IssuingCardPinService$CardPinActionError r1 = com.stripe.android.IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_EXPIRED
            java.lang.String r2 = "The one-time code has expired"
            r4.onError(r1, r2, r0)
            goto L_0x0086
        L_0x0071:
            com.stripe.android.IssuingCardPinService$IssuingCardPinRetrievalListener r4 = r3.$listener
            com.stripe.android.IssuingCardPinService$CardPinActionError r0 = com.stripe.android.IssuingCardPinService.CardPinActionError.UNKNOWN_ERROR
            java.lang.Throwable r1 = r3.$throwable
            java.lang.String r2 = "The call to retrieve the PIN failed, possibly an error with the verification."
            r4.onError(r0, r2, r1)
            goto L_0x0086
        L_0x007d:
            com.stripe.android.IssuingCardPinService$IssuingCardPinRetrievalListener r0 = r3.$listener
            com.stripe.android.IssuingCardPinService$CardPinActionError r1 = com.stripe.android.IssuingCardPinService.CardPinActionError.UNKNOWN_ERROR
            java.lang.String r2 = "An error occurred while retrieving the PIN."
            r0.onError(r1, r2, r4)
        L_0x0086:
            m0.i r4 = m0.i.a
            return r4
        L_0x0089:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.IssuingCardPinService$onRetrievePinError$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
