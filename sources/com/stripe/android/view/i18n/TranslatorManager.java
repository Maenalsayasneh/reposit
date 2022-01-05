package com.stripe.android.view.i18n;

import com.stripe.android.StripeError;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager;", "", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "getErrorMessageTranslator", "()Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "errorMessageTranslator", "Lm0/i;", "setErrorMessageTranslator", "(Lcom/stripe/android/view/i18n/ErrorMessageTranslator;)V", "Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "DEFAULT_ERROR_MESSAGE_TRANSLATOR", "Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "<init>", "()V", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TranslatorManager.kt */
public final class TranslatorManager {
    private static final Default DEFAULT_ERROR_MESSAGE_TRANSLATOR = new Default();
    public static final TranslatorManager INSTANCE = new TranslatorManager();
    private static ErrorMessageTranslator errorMessageTranslator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "", "httpCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "translate", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TranslatorManager.kt */
    public static final class Default implements ErrorMessageTranslator {
        public String translate(int i, String str, StripeError stripeError) {
            return str != null ? str : "";
        }
    }

    private TranslatorManager() {
    }

    public final ErrorMessageTranslator getErrorMessageTranslator() {
        ErrorMessageTranslator errorMessageTranslator2 = errorMessageTranslator;
        return errorMessageTranslator2 != null ? errorMessageTranslator2 : DEFAULT_ERROR_MESSAGE_TRANSLATOR;
    }

    public final void setErrorMessageTranslator(ErrorMessageTranslator errorMessageTranslator2) {
        errorMessageTranslator = errorMessageTranslator2;
    }
}
