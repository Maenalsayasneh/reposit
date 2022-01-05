package com.stripe.android.exception;

import com.stripe.android.StripeError;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/exception/CardException;", "Lcom/stripe/android/exception/StripeException;", "", "param", "Ljava/lang/String;", "getParam", "()Ljava/lang/String;", "declineCode", "getDeclineCode", "code", "getCode", "charge", "getCharge", "Lcom/stripe/android/StripeError;", "stripeError", "requestId", "<init>", "(Lcom/stripe/android/StripeError;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardException.kt */
public final class CardException extends StripeException {
    private final String charge;
    private final String code;
    private final String declineCode;
    private final String param;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardException(StripeError stripeError, String str, int i, f fVar) {
        this(stripeError, (i & 2) != 0 ? null : str);
    }

    public final String getCharge() {
        return this.charge;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDeclineCode() {
        return this.declineCode;
    }

    public final String getParam() {
        return this.param;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardException(StripeError stripeError, String str) {
        super(stripeError, str, 402, (Throwable) null, (String) null, 24, (f) null);
        i.e(stripeError, "stripeError");
        this.code = stripeError.getCode();
        this.param = stripeError.getParam();
        this.declineCode = stripeError.getDeclineCode();
        this.charge = stripeError.getCharge();
    }
}
