package com.stripe.android.paymentsheet;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.stripe.android.R;
import com.stripe.android.databinding.FragmentPaymentsheetPaymentMethodsListBinding;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import g0.a.b.b.a;
import i0.j.f.p.h;
import java.util.Locale;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00108V@\u0016X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetListFragment;", "Lcom/stripe/android/paymentsheet/BasePaymentMethodsListFragment;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;", "amount", "", "getTotalText", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;)Ljava/lang/String;", "Lm0/i;", "transitionToAddPaymentMethod", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "activityViewModel$delegate", "Lm0/c;", "getActivityViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "activityViewModel", "sheetViewModel$delegate", "getSheetViewModel", "sheetViewModel", "Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "currencyFormatter", "Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetListFragment.kt */
public final class PaymentSheetListFragment extends BasePaymentMethodsListFragment {
    private final c activityViewModel$delegate = a.x(this, m.a(PaymentSheetViewModel.class), new PaymentSheetListFragment$$special$$inlined$activityViewModels$1(this), new PaymentSheetListFragment$activityViewModel$2(this));
    private final CurrencyFormatter currencyFormatter = new CurrencyFormatter();
    private final c sheetViewModel$delegate = h.H2(new PaymentSheetListFragment$sheetViewModel$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetListFragment(EventReporter eventReporter) {
        super(false, eventReporter);
        i.e(eventReporter, "eventReporter");
    }

    /* access modifiers changed from: private */
    public final PaymentSheetViewModel getActivityViewModel() {
        return (PaymentSheetViewModel) this.activityViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getTotalText(PaymentSheetViewModel.Amount amount) {
        String string = getResources().getString(R.string.stripe_paymentsheet_total_amount, new Object[]{CurrencyFormatter.format$default(this.currencyFormatter, amount.getValue(), amount.getCurrencyCode(), (Locale) null, 4, (Object) null)});
        i.d(string, "resources.getString(\n   …t.currencyCode)\n        )");
        return string;
    }

    public PaymentSheetViewModel getSheetViewModel() {
        return (PaymentSheetViewModel) this.sheetViewModel$delegate.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FragmentPaymentsheetPaymentMethodsListBinding bind = FragmentPaymentsheetPaymentMethodsListBinding.bind(view);
        i.d(bind, "FragmentPaymentsheetPaym…odsListBinding.bind(view)");
        if (getSheetViewModel().isProcessingPaymentIntent$payments_core_release()) {
            getSheetViewModel().getAmount$payments_core_release().observe(getViewLifecycleOwner(), new PaymentSheetListFragment$onViewCreated$1(this, bind));
            return;
        }
        TextView textView = bind.total;
        i.d(textView, "viewBinding.total");
        textView.setVisibility(8);
    }

    public void transitionToAddPaymentMethod() {
        getActivityViewModel().transitionTo(new PaymentSheetViewModel.TransitionTarget.AddPaymentMethodFull(getConfig()));
    }
}
