package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/BackUpFieldDeleteListener;", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "Lm0/i;", "onDeleteEmpty", "()V", "Lcom/stripe/android/view/StripeEditText;", "backUpTarget", "Lcom/stripe/android/view/StripeEditText;", "<init>", "(Lcom/stripe/android/view/StripeEditText;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BackUpFieldDeleteListener.kt */
public final class BackUpFieldDeleteListener implements StripeEditText.DeleteEmptyListener {
    private final StripeEditText backUpTarget;

    public BackUpFieldDeleteListener(StripeEditText stripeEditText) {
        i.e(stripeEditText, "backUpTarget");
        this.backUpTarget = stripeEditText;
    }

    public void onDeleteEmpty() {
        String str;
        Editable text = this.backUpTarget.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() > 1) {
            StripeEditText stripeEditText = this.backUpTarget;
            String substring = str.substring(0, str.length() - 1);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            stripeEditText.setText(substring);
        }
        this.backUpTarget.requestFocus();
        StripeEditText stripeEditText2 = this.backUpTarget;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
