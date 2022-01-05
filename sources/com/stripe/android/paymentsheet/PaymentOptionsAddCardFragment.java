package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import g0.a.b.b.a;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAddCardFragment;", "Lcom/stripe/android/paymentsheet/BaseAddCardFragment;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "sheetViewModel$delegate", "Lm0/c;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "sheetViewModel", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionsAddCardFragment.kt */
public final class PaymentOptionsAddCardFragment extends BaseAddCardFragment {
    private final c sheetViewModel$delegate = a.x(this, m.a(PaymentOptionsViewModel.class), new PaymentOptionsAddCardFragment$$special$$inlined$activityViewModels$1(this), new PaymentOptionsAddCardFragment$sheetViewModel$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAddCardFragment(EventReporter eventReporter) {
        super(eventReporter);
        i.e(eventReporter, "eventReporter");
    }

    public PaymentOptionsViewModel getSheetViewModel() {
        return (PaymentOptionsViewModel) this.sheetViewModel$delegate.getValue();
    }
}
