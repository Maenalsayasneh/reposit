package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nJ\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PrefsRepository;", "", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getSavedSelection", "(Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lm0/i;", "savePaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "Noop", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PrefsRepository.kt */
public interface PrefsRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PrefsRepository$Noop;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getSavedSelection", "(Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lm0/i;", "savePaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PrefsRepository.kt */
    public static final class Noop implements PrefsRepository {
        public Object getSavedSelection(c<? super SavedSelection> cVar) {
            return SavedSelection.None.INSTANCE;
        }

        public void savePaymentSelection(PaymentSelection paymentSelection) {
        }
    }

    Object getSavedSelection(c<? super SavedSelection> cVar);

    void savePaymentSelection(PaymentSelection paymentSelection);
}
