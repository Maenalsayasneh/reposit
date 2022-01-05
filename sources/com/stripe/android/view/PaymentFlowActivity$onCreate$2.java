package com.stripe.android.view;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"com/stripe/android/view/PaymentFlowActivity$onCreate$2", "Landroidx/viewpager/widget/ViewPager$j;", "", "i", "", "v", "i1", "Lm0/i;", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "onPageScrollStateChanged", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$onCreate$2 implements ViewPager.j {
    public final /* synthetic */ PaymentFlowActivity this$0;

    public PaymentFlowActivity$onCreate$2(PaymentFlowActivity paymentFlowActivity) {
        this.this$0 = paymentFlowActivity;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        paymentFlowActivity.setTitle(paymentFlowActivity.getPaymentFlowPagerAdapter().getPageTitle(i));
        if (this.this$0.getPaymentFlowPagerAdapter().getPageAt$payments_core_release(i) == PaymentFlowPage.ShippingInfo) {
            this.this$0.getViewModel().setShippingInfoSubmitted$payments_core_release(false);
            this.this$0.getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(false);
        }
    }
}
