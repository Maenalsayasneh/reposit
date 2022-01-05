package com.stripe.android.paymentsheet;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.FragmentPaymentsheetPaymentMethodsListBinding;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/BasePaymentMethodsListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "transitionToAddPaymentMethod", "()V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "", "isClick", "onPaymentOptionSelected", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "config", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "setConfig", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "canClickSelectedItem", "Z", "<init>", "(ZLcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BasePaymentMethodsListFragment.kt */
public abstract class BasePaymentMethodsListFragment extends Fragment {
    private final boolean canClickSelectedItem;
    public FragmentConfig config;
    private final EventReporter eventReporter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasePaymentMethodsListFragment(boolean z, EventReporter eventReporter2) {
        super(R.layout.fragment_paymentsheet_payment_methods_list);
        i.e(eventReporter2, "eventReporter");
        this.canClickSelectedItem = z;
        this.eventReporter = eventReporter2;
    }

    public final FragmentConfig getConfig() {
        FragmentConfig fragmentConfig = this.config;
        if (fragmentConfig != null) {
            return fragmentConfig;
        }
        i.m("config");
        throw null;
    }

    public abstract BaseSheetViewModel<?> getSheetViewModel();

    public void onPaymentOptionSelected(PaymentSelection paymentSelection, boolean z) {
        i.e(paymentSelection, "paymentSelection");
        getSheetViewModel().updateSelection(paymentSelection);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentConfig fragmentConfig = arguments != null ? (FragmentConfig) arguments.getParcelable("com.stripe.android.paymentsheet.extra_fragment_config") : null;
        if (fragmentConfig == null) {
            getSheetViewModel().onFatal(new IllegalArgumentException("Failed to start existing payment options fragment."));
            return;
        }
        this.config = fragmentConfig;
        FragmentPaymentsheetPaymentMethodsListBinding bind = FragmentPaymentsheetPaymentMethodsListBinding.bind(view);
        i.d(bind, "FragmentPaymentsheetPaym…odsListBinding.bind(view)");
        BasePaymentMethodsListFragment$onViewCreated$layoutManager$1 basePaymentMethodsListFragment$onViewCreated$layoutManager$1 = new BasePaymentMethodsListFragment$onViewCreated$layoutManager$1(this, getActivity(), 0, false);
        RecyclerView recyclerView = bind.recycler;
        i.d(recyclerView, "viewBinding.recycler");
        recyclerView.setLayoutManager(basePaymentMethodsListFragment$onViewCreated$layoutManager$1);
        PaymentOptionsAdapter paymentOptionsAdapter = new PaymentOptionsAdapter(this.canClickSelectedItem, new BasePaymentMethodsListFragment$onViewCreated$adapter$1(this), new BasePaymentMethodsListFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView2 = bind.recycler;
        i.d(recyclerView2, "viewBinding.recycler");
        recyclerView2.setAdapter(paymentOptionsAdapter);
        FragmentConfig fragmentConfig2 = this.config;
        if (fragmentConfig2 != null) {
            paymentOptionsAdapter.update(fragmentConfig2, getSheetViewModel().getSelection$payments_core_release().getValue());
            this.eventReporter.onShowExistingPaymentOptions();
            getSheetViewModel().getProcessing().observe(getViewLifecycleOwner(), new BasePaymentMethodsListFragment$onViewCreated$1(paymentOptionsAdapter, basePaymentMethodsListFragment$onViewCreated$layoutManager$1));
            return;
        }
        i.m("config");
        throw null;
    }

    public final void setConfig(FragmentConfig fragmentConfig) {
        i.e(fragmentConfig, "<set-?>");
        this.config = fragmentConfig;
    }

    public abstract void transitionToAddPaymentMethod();
}
