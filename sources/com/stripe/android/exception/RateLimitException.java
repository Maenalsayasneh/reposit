package com.stripe.android.exception;

import com.stripe.android.StripeError;
import kotlin.Metadata;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/exception/RateLimitException;", "Lcom/stripe/android/exception/StripeException;", "Lcom/stripe/android/StripeError;", "stripeError", "", "requestId", "message", "", "cause", "<init>", "(Lcom/stripe/android/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: RateLimitException.kt */
public final class RateLimitException extends StripeException {
    public RateLimitException() {
        this((StripeError) null, (String) null, (String) null, (Throwable) null, 15, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RateLimitException(com.stripe.android.StripeError r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5, int r6, m0.n.b.f r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L_0x0006
            r2 = r0
        L_0x0006:
            r7 = r6 & 2
            if (r7 == 0) goto L_0x000b
            r3 = r0
        L_0x000b:
            r7 = r6 & 4
            if (r7 == 0) goto L_0x0017
            if (r2 == 0) goto L_0x0016
            java.lang.String r4 = r2.getMessage()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x001c
            r5 = r0
        L_0x001c:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.exception.RateLimitException.<init>(com.stripe.android.StripeError, java.lang.String, java.lang.String, java.lang.Throwable, int, m0.n.b.f):void");
    }

    public RateLimitException(StripeError stripeError, String str, String str2, Throwable th) {
        super(stripeError, str, 429, th, str2);
    }
}
