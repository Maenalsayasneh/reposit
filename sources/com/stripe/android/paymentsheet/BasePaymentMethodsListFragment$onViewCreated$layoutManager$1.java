package com.stripe.android.paymentsheet;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/stripe/android/paymentsheet/BasePaymentMethodsListFragment$onViewCreated$layoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollHorizontally", "()Z", "canScroll", "Z", "getCanScroll", "setCanScroll", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BasePaymentMethodsListFragment.kt */
public final class BasePaymentMethodsListFragment$onViewCreated$layoutManager$1 extends LinearLayoutManager {
    private boolean canScroll = true;
    public final /* synthetic */ BasePaymentMethodsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasePaymentMethodsListFragment$onViewCreated$layoutManager$1(BasePaymentMethodsListFragment basePaymentMethodsListFragment, Context context, int i, boolean z) {
        super(context, i, z);
        this.this$0 = basePaymentMethodsListFragment;
    }

    public boolean canScrollHorizontally() {
        return this.canScroll && super.canScrollHorizontally();
    }

    public final boolean getCanScroll() {
        return this.canScroll;
    }

    public final void setCanScroll(boolean z) {
        this.canScroll = z;
    }
}
