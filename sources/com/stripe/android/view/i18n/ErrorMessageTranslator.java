package com.stripe.android.view.i18n;

import com.stripe.android.StripeError;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "", "", "httpCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "translate", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ErrorMessageTranslator.kt */
public interface ErrorMessageTranslator {
    String translate(int i, String str, StripeError stripeError);
}
