package com.stripe.android.paymentsheet;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.stripe.android.databinding.FragmentPaymentsheetPaymentMethodsListBinding;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import g0.a.b.b.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00118V@\u0016X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsListFragment;", "Lcom/stripe/android/paymentsheet/BasePaymentMethodsListFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "transitionToAddPaymentMethod", "()V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "", "isClick", "onPaymentOptionSelected", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "activityViewModel$delegate", "Lm0/c;", "getActivityViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "activityViewModel", "sheetViewModel$delegate", "getSheetViewModel", "sheetViewModel", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionsListFragment.kt */
public final class PaymentOptionsListFragment extends BasePaymentMethodsListFragment {
    private final c activityViewModel$delegate = a.x(this, m.a(PaymentOptionsViewModel.class), new PaymentOptionsListFragment$$special$$inlined$activityViewModels$1(this), new PaymentOptionsListFragment$activityViewModel$2(this));
    private final c sheetViewModel$delegate = h.H2(new PaymentOptionsListFragment$sheetViewModel$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsListFragment(EventReporter eventReporter) {
        super(true, eventReporter);
        i.e(eventReporter, "eventReporter");
    }

    /* access modifiers changed from: private */
    public final PaymentOptionsViewModel getActivityViewModel() {
        return (PaymentOptionsViewModel) this.activityViewModel$delegate.getValue();
    }

    public PaymentOptionsViewModel getSheetViewModel() {
        return (PaymentOptionsViewModel) this.sheetViewModel$delegate.getValue();
    }

    public void onPaymentOptionSelected(PaymentSelection paymentSelection, boolean z) {
        i.e(paymentSelection, "paymentSelection");
        super.onPaymentOptionSelected(paymentSelection, z);
        if (z) {
            getSheetViewModel().onUserSelection();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        getSheetViewModel().resolveTransitionTarget(getConfig());
        TextView textView = FragmentPaymentsheetPaymentMethodsListBinding.bind(view).total;
        i.d(textView, "FragmentPaymentsheetPaym…tBinding.bind(view).total");
        textView.setVisibility(8);
    }

    public void transitionToAddPaymentMethod() {
        getActivityViewModel().transitionTo(new PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodFull(getConfig()));
    }
}
