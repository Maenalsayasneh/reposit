package com.stripe.android.exception;

import com.stripe.android.StripeError;
import i0.d.a.a.a;
import java.util.Objects;
import kotlin.Metadata;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u0000 %2\u00060\u0001j\u0002`\u0002:\u0001%BA\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u00048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u0019\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/stripe/android/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "", "typedEquals", "(Lcom/stripe/android/exception/StripeException;)Z", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isClientError", "Z", "isClientError$payments_core_release", "()Z", "Lcom/stripe/android/StripeError;", "stripeError", "Lcom/stripe/android/StripeError;", "getStripeError", "()Lcom/stripe/android/StripeError;", "requestId", "Ljava/lang/String;", "getRequestId", "statusCode", "I", "getStatusCode", "", "cause", "message", "<init>", "(Lcom/stripe/android/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeException.kt */
public abstract class StripeException extends Exception {
    public static final Companion Companion = new Companion((f) null);
    private final boolean isClientError;
    private final String requestId;
    private final int statusCode;
    private final StripeError stripeError;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/exception/StripeException$Companion;", "", "", "throwable", "Lcom/stripe/android/exception/StripeException;", "create", "(Ljava/lang/Throwable;)Lcom/stripe/android/exception/StripeException;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeException.kt */
    public static final class Companion {
        private Companion() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.stripe.android.exception.APIException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.stripe.android.exception.APIException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.stripe.android.exception.InvalidRequestException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.stripe.android.exception.InvalidRequestException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.stripe.android.exception.InvalidRequestException} */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.stripe.android.exception.StripeException create(java.lang.Throwable r10) {
            /*
                r9 = this;
                java.lang.String r0 = "throwable"
                m0.n.b.i.e(r10, r0)
                boolean r0 = r10 instanceof com.stripe.android.exception.StripeException
                if (r0 == 0) goto L_0x000c
                com.stripe.android.exception.StripeException r10 = (com.stripe.android.exception.StripeException) r10
                goto L_0x0041
            L_0x000c:
                boolean r0 = r10 instanceof org.json.JSONException
                if (r0 == 0) goto L_0x0017
                com.stripe.android.exception.APIException r0 = new com.stripe.android.exception.APIException
                r0.<init>(r10)
            L_0x0015:
                r10 = r0
                goto L_0x0041
            L_0x0017:
                boolean r0 = r10 instanceof java.io.IOException
                if (r0 == 0) goto L_0x0026
                com.stripe.android.exception.APIConnectionException$Companion r0 = com.stripe.android.exception.APIConnectionException.Companion
                java.io.IOException r10 = (java.io.IOException) r10
                r1 = 2
                r2 = 0
                com.stripe.android.exception.APIConnectionException r10 = com.stripe.android.exception.APIConnectionException.Companion.create$payments_core_release$default(r0, r10, r2, r1, r2)
                goto L_0x0041
            L_0x0026:
                boolean r0 = r10 instanceof java.lang.IllegalArgumentException
                if (r0 == 0) goto L_0x003b
                com.stripe.android.exception.InvalidRequestException r0 = new com.stripe.android.exception.InvalidRequestException
                r2 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = r10.getMessage()
                r7 = 7
                r8 = 0
                r1 = r0
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0015
            L_0x003b:
                com.stripe.android.exception.APIException r0 = new com.stripe.android.exception.APIException
                r0.<init>(r10)
                goto L_0x0015
            L_0x0041:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.exception.StripeException.Companion.create(java.lang.Throwable):com.stripe.android.exception.StripeException");
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeException() {
        this((StripeError) null, (String) null, 0, (Throwable) null, (String) null, 31, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StripeException(com.stripe.android.StripeError r5, java.lang.String r6, int r7, java.lang.Throwable r8, java.lang.String r9, int r10, m0.n.b.f r11) {
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
            if (r5 == 0) goto L_0x001b
            r3 = r0
            goto L_0x001c
        L_0x001b:
            r3 = r8
        L_0x001c:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0029
            if (r11 == 0) goto L_0x0028
            java.lang.String r5 = r11.getMessage()
            r9 = r5
            goto L_0x0029
        L_0x0028:
            r9 = r0
        L_0x0029:
            r10 = r9
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.exception.StripeException.<init>(com.stripe.android.StripeError, java.lang.String, int, java.lang.Throwable, java.lang.String, int, m0.n.b.f):void");
    }

    private final boolean typedEquals(StripeException stripeException) {
        return i.a(this.stripeError, stripeException.stripeError) && i.a(this.requestId, stripeException.requestId) && this.statusCode == stripeException.statusCode && i.a(getMessage(), stripeException.getMessage());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeException) {
            return typedEquals((StripeException) obj);
        }
        return false;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final StripeError getStripeError() {
        return this.stripeError;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.stripeError, this.requestId, Integer.valueOf(this.statusCode), getMessage()});
    }

    public final boolean isClientError$payments_core_release() {
        return this.isClientError;
    }

    public String toString() {
        String[] strArr = new String[2];
        String str = this.requestId;
        strArr[0] = str != null ? a.n0("Request-id: ", str) : null;
        strArr[1] = super.toString();
        return g.E(g.M(strArr), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public StripeException(StripeError stripeError2, String str, int i, Throwable th, String str2) {
        super(str2, th);
        this.stripeError = stripeError2;
        this.requestId = str;
        this.statusCode = i;
        this.isClientError = 400 <= i && 499 >= i;
    }
}
