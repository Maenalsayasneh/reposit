package com.stripe.android.exception;

import com.stripe.android.StripeError;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/exception/APIException;", "Lcom/stripe/android/exception/StripeException;", "Lcom/stripe/android/StripeError;", "stripeError", "", "requestId", "", "statusCode", "message", "", "cause", "<init>", "(Lcom/stripe/android/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "throwable", "(Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: APIException.kt */
public final class APIException extends StripeException {
    public APIException() {
        this((StripeError) null, (String) null, 0, (String) null, (Throwable) null, 31, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ APIException(com.stripe.android.StripeError r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.Throwable r9, int r10, m0.n.b.f r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0014
            r7 = 0
        L_0x0014:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x0022
            if (r11 == 0) goto L_0x0021
            java.lang.String r5 = r11.getMessage()
            r8 = r5
            goto L_0x0022
        L_0x0021:
            r8 = r0
        L_0x0022:
            r3 = r8
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0029
            r10 = r0
            goto L_0x002a
        L_0x0029:
            r10 = r9
        L_0x002a:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.exception.APIException.<init>(com.stripe.android.StripeError, java.lang.String, int, java.lang.String, java.lang.Throwable, int, m0.n.b.f):void");
    }

    public APIException(StripeError stripeError, String str, int i, String str2, Throwable th) {
        super(stripeError, str, i, th, str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public APIException(Throwable th) {
        this((StripeError) null, (String) null, 0, th.getMessage(), th, 7, (f) null);
        i.e(th, "throwable");
    }
}
