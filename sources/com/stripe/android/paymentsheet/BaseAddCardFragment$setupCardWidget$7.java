package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.view.Country;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"com/stripe/android/paymentsheet/BaseAddCardFragment$setupCardWidget$7", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "Lcom/stripe/android/view/Country;", "country", "", "isPostalValid", "Lm0/i;", "onLosingFocus", "(Lcom/stripe/android/view/Country;Z)V", "onGainingFocus", "onCountryChanged", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public final class BaseAddCardFragment$setupCardWidget$7 implements BillingAddressView.PostalCodeViewListener {
    public final /* synthetic */ BaseAddCardFragment this$0;

    public BaseAddCardFragment$setupCardWidget$7(BaseAddCardFragment baseAddCardFragment) {
        this.this$0 = baseAddCardFragment;
    }

    public void onCountryChanged(Country country, boolean z) {
        BaseAddCardFragment.access$getBillingErrors$p(this.this$0).setText((CharSequence) null);
        BaseAddCardFragment.access$getBillingErrors$p(this.this$0).setVisibility(8);
    }

    public void onGainingFocus(Country country, boolean z) {
        BaseAddCardFragment.access$getBillingErrors$p(this.this$0).setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLosingFocus(com.stripe.android.view.Country r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0022
            com.stripe.android.paymentsheet.BaseAddCardFragment r5 = r3.this$0
            com.stripe.android.paymentsheet.ui.BillingAddressView r5 = com.stripe.android.paymentsheet.BaseAddCardFragment.access$getBillingAddressView$p(r5)
            com.stripe.android.view.StripeEditText r5 = r5.getPostalCodeView$payments_core_release()
            android.text.Editable r5 = r5.getText()
            if (r5 == 0) goto L_0x001d
            int r5 = r5.length()
            if (r5 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r5 = r1
            goto L_0x001e
        L_0x001d:
            r5 = r0
        L_0x001e:
            if (r5 != 0) goto L_0x0022
            r5 = r0
            goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            com.stripe.android.paymentsheet.BaseAddCardFragment r2 = r3.this$0
            android.widget.TextView r2 = com.stripe.android.paymentsheet.BaseAddCardFragment.access$getBillingErrors$p(r2)
            if (r5 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0043
            com.stripe.android.model.CountryCode$Companion r5 = com.stripe.android.model.CountryCode.Companion
            com.stripe.android.model.CountryCode r4 = r4.getCode()
            boolean r4 = r5.isUS(r4)
            if (r4 == 0) goto L_0x003a
            goto L_0x0043
        L_0x003a:
            com.stripe.android.paymentsheet.BaseAddCardFragment r4 = r3.this$0
            int r5 = com.stripe.android.R.string.address_postal_code_invalid
            java.lang.String r4 = r4.getString(r5)
            goto L_0x004d
        L_0x0043:
            com.stripe.android.paymentsheet.BaseAddCardFragment r4 = r3.this$0
            int r5 = com.stripe.android.R.string.address_zip_invalid
            java.lang.String r4 = r4.getString(r5)
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            r2.setText(r4)
            com.stripe.android.paymentsheet.BaseAddCardFragment r4 = r3.this$0
            android.widget.TextView r4 = com.stripe.android.paymentsheet.BaseAddCardFragment.access$getBillingErrors$p(r4)
            com.stripe.android.paymentsheet.BaseAddCardFragment r5 = r3.this$0
            android.widget.TextView r5 = com.stripe.android.paymentsheet.BaseAddCardFragment.access$getBillingErrors$p(r5)
            java.lang.CharSequence r5 = r5.getText()
            if (r5 == 0) goto L_0x006b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r5 = r1
            goto L_0x006c
        L_0x006b:
            r5 = r0
        L_0x006c:
            r5 = r5 ^ r0
            if (r5 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r1 = 8
        L_0x0072:
            r4.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.BaseAddCardFragment$setupCardWidget$7.onLosingFocus(com.stripe.android.view.Country, boolean):void");
    }
}
