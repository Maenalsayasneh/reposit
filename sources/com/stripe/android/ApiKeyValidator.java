package com.stripe.android;

import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/stripe/android/ApiKeyValidator;", "", "", "apiKey", "requireValid", "(Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiKeyValidator.kt */
public final class ApiKeyValidator {
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final ApiKeyValidator DEFAULT = new ApiKeyValidator();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/ApiKeyValidator$Companion;", "", "Lcom/stripe/android/ApiKeyValidator;", "get$payments_core_release", "()Lcom/stripe/android/ApiKeyValidator;", "get", "DEFAULT", "Lcom/stripe/android/ApiKeyValidator;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ApiKeyValidator.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ApiKeyValidator get$payments_core_release() {
            return ApiKeyValidator.DEFAULT;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public static final ApiKeyValidator get$payments_core_release() {
        return Companion.get$payments_core_release();
    }

    public final String requireValid(String str) {
        if (!(!(str == null || StringsKt__IndentKt.o(str)))) {
            throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys".toString());
        } else if (!StringsKt__IndentKt.J(str, "sk_", false, 2)) {
            return str;
        } else {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys".toString());
        }
    }
}
