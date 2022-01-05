package com.stripe.android.paymentsheet.ui;

import androidx.fragment.app.Fragment;
import com.stripe.android.paymentsheet.PaymentOptionsAddCardFragment;
import com.stripe.android.paymentsheet.PaymentOptionsListFragment;
import com.stripe.android.paymentsheet.PaymentSheetAddCardFragment;
import com.stripe.android.paymentsheet.PaymentSheetListFragment;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import h0.o.a.s;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetFragmentFactory;", "Lh0/o/a/s;", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetFragmentFactory.kt */
public final class PaymentSheetFragmentFactory extends s {
    private final EventReporter eventReporter;

    public PaymentSheetFragmentFactory(EventReporter eventReporter2) {
        i.e(eventReporter2, "eventReporter");
        this.eventReporter = eventReporter2;
    }

    public Fragment instantiate(ClassLoader classLoader, String str) {
        i.e(classLoader, "classLoader");
        i.e(str, "className");
        if (i.a(str, PaymentOptionsListFragment.class.getName())) {
            return new PaymentOptionsListFragment(this.eventReporter);
        }
        if (i.a(str, PaymentSheetListFragment.class.getName())) {
            return new PaymentSheetListFragment(this.eventReporter);
        }
        if (i.a(str, PaymentSheetAddCardFragment.class.getName())) {
            return new PaymentSheetAddCardFragment(this.eventReporter);
        }
        if (i.a(str, PaymentOptionsAddCardFragment.class.getName())) {
            return new PaymentOptionsAddCardFragment(this.eventReporter);
        }
        Fragment instantiate = super.instantiate(classLoader, str);
        i.d(instantiate, "super.instantiate(classLoader, className)");
        return instantiate;
    }
}
