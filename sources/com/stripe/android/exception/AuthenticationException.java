package com.stripe.android.exception;

import com.stripe.android.StripeError;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/exception/AuthenticationException;", "Lcom/stripe/android/exception/StripeException;", "Lcom/stripe/android/StripeError;", "stripeError", "", "requestId", "<init>", "(Lcom/stripe/android/StripeError;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AuthenticationException.kt */
public final class AuthenticationException extends StripeException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthenticationException(StripeError stripeError, String str, int i, f fVar) {
        this(stripeError, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticationException(StripeError stripeError, String str) {
        super(stripeError, str, 401, (Throwable) null, (String) null, 24, (f) null);
        i.e(stripeError, "stripeError");
    }
}
