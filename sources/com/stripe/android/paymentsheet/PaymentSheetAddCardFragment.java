package com.stripe.android.paymentsheet;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.stripe.android.databinding.FragmentPaymentsheetAddCardBinding;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.GooglePayDivider;
import g0.a.b.b.a;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\t8V@\u0016X\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetAddCardFragment;", "Lcom/stripe/android/paymentsheet/BaseAddCardFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "sheetViewModel$delegate", "Lm0/c;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "sheetViewModel", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetAddCardFragment.kt */
public final class PaymentSheetAddCardFragment extends BaseAddCardFragment {
    private final c sheetViewModel$delegate = a.x(this, m.a(PaymentSheetViewModel.class), new PaymentSheetAddCardFragment$$special$$inlined$activityViewModels$1(this), new PaymentSheetAddCardFragment$sheetViewModel$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetAddCardFragment(EventReporter eventReporter) {
        super(eventReporter);
        i.e(eventReporter, "eventReporter");
    }

    public PaymentSheetViewModel getSheetViewModel() {
        return (PaymentSheetViewModel) this.sheetViewModel$delegate.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentConfig fragmentConfig = arguments != null ? (FragmentConfig) arguments.getParcelable("com.stripe.android.paymentsheet.extra_fragment_config") : null;
        int i = 0;
        boolean z = fragmentConfig != null && fragmentConfig.isGooglePayReady() && fragmentConfig.getPaymentMethods().isEmpty();
        FragmentPaymentsheetAddCardBinding bind = FragmentPaymentsheetAddCardBinding.bind(view);
        i.d(bind, "FragmentPaymentsheetAddCardBinding.bind(view)");
        GooglePayButton googlePayButton = bind.googlePayButton;
        i.d(googlePayButton, "viewBinding.googlePayButton");
        TextView textView = bind.message;
        i.d(textView, "viewBinding.message");
        TextView textView2 = bind.addCardHeader;
        i.d(textView2, "viewBinding.addCardHeader");
        GooglePayDivider googlePayDivider = bind.googlePayDivider;
        i.d(googlePayDivider, "viewBinding.googlePayDivider");
        googlePayButton.setOnClickListener(new PaymentSheetAddCardFragment$onViewCreated$1(this));
        googlePayButton.setVisibility(z ? 0 : 8);
        googlePayDivider.setVisibility(z ? 0 : 8);
        if (!(!z)) {
            i = 8;
        }
        textView2.setVisibility(i);
        getSheetViewModel().getSelection$payments_core_release().observe(getViewLifecycleOwner(), new PaymentSheetAddCardFragment$onViewCreated$2(this));
        getSheetViewModel().getButtonStateObservable$payments_core_release(PaymentSheetViewModel.CheckoutIdentifier.AddFragmentTopGooglePay).observe(getViewLifecycleOwner(), new PaymentSheetAddCardFragment$onViewCreated$3(this, textView, googlePayButton));
        getSheetViewModel().getProcessing().observe(getViewLifecycleOwner(), new PaymentSheetAddCardFragment$onViewCreated$4(googlePayButton));
    }
}
