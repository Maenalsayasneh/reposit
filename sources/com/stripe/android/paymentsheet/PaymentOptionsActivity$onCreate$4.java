package com.stripe.android.paymentsheet;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/paymentsheet/PaymentOptionsActivity$onCreate$4", "Landroidx/fragment/app/FragmentManager$k;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/Fragment;", "fragment", "Lm0/i;", "onFragmentStarted", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$onCreate$4 extends FragmentManager.k {
    public final /* synthetic */ PaymentOptionsActivity this$0;

    public PaymentOptionsActivity$onCreate$4(PaymentOptionsActivity paymentOptionsActivity) {
        this.this$0 = paymentOptionsActivity;
    }

    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        i.e(fragmentManager, "fm");
        i.e(fragment, "fragment");
        PrimaryButton primaryButton = this.this$0.getViewBinding$payments_core_release().addButton;
        i.d(primaryButton, "viewBinding.addButton");
        primaryButton.setVisibility(fragment instanceof PaymentOptionsAddCardFragment ? 0 : 8);
    }
}
