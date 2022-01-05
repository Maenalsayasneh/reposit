package com.stripe.android.paymentsheet.analytics;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\u0011J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "Lm0/i;", "onInit", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "onDismiss", "()V", "onShowExistingPaymentOptions", "onShowNewPaymentOptionForm", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "onSelectPaymentOption", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "onPaymentSuccess", "onPaymentFailure", "Mode", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EventReporter.kt */
public interface EventReporter {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Complete", "Custom", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EventReporter.kt */
    public enum Mode {
        Complete("complete"),
        Custom(Include.INCLUDE_CUSTOM_PARAM_VALUE);
        
        private final String code;

        private Mode(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    void onDismiss();

    void onInit(PaymentSheet.Configuration configuration);

    void onPaymentFailure(PaymentSelection paymentSelection);

    void onPaymentSuccess(PaymentSelection paymentSelection);

    void onSelectPaymentOption(PaymentSelection paymentSelection);

    void onShowExistingPaymentOptions();

    void onShowNewPaymentOptionForm();
}
