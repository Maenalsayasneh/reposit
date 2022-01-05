package com.stripe.android.view;

import android.view.View;
import com.stripe.android.view.CardValidCallback;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "hasFocus", "Lm0/i;", "onFocusChange", "(Landroid/view/View;Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardFormView.kt */
public final class CardFormView$setupCountryAndPostal$1 implements View.OnFocusChangeListener {
    public final /* synthetic */ CardFormView this$0;

    public CardFormView$setupCountryAndPostal$1(CardFormView cardFormView) {
        this.this$0 = cardFormView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            PostalCodeEditText access$getPostalCodeView$p = this.this$0.postalCodeView;
            boolean z2 = true;
            if (!(!StringsKt__IndentKt.o(this.this$0.postalCodeView.getFieldText$payments_core_release())) || this.this$0.isPostalValid()) {
                z2 = false;
            }
            access$getPostalCodeView$p.setShouldShowError(z2);
            if (this.this$0.postalCodeView.getShouldShowError()) {
                this.this$0.showPostalError();
            } else {
                this.this$0.onFieldError(CardValidCallback.Fields.Postal, (String) null);
            }
        }
    }
}
