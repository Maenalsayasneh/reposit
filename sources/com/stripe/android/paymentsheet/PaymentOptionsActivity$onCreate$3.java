package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import g0.a.b.b.a;
import h0.q.z;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "kotlin.jvm.PlatformType", "event", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$onCreate$3<T> implements z<BaseSheetViewModel.Event<? extends PaymentOptionsViewModel.TransitionTarget>> {
    public final /* synthetic */ PaymentOptionContract.Args $starterArgs;
    public final /* synthetic */ PaymentOptionsActivity this$0;

    public PaymentOptionsActivity$onCreate$3(PaymentOptionsActivity paymentOptionsActivity, PaymentOptionContract.Args args) {
        this.this$0 = paymentOptionsActivity;
        this.$starterArgs = args;
    }

    public final void onChanged(BaseSheetViewModel.Event<? extends PaymentOptionsViewModel.TransitionTarget> event) {
        PaymentOptionsViewModel.TransitionTarget transitionTarget = (PaymentOptionsViewModel.TransitionTarget) event.getContentIfNotHandled();
        if (transitionTarget != null) {
            this.this$0.onTransitionTarget(transitionTarget, a.g(new Pair("com.stripe.android.paymentsheet.extra_starter_args", this.$starterArgs), new Pair("com.stripe.android.paymentsheet.extra_fragment_config", transitionTarget.getFragmentConfig())));
        }
    }
}
