package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/ErrorListener;", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "", "message", "Lm0/i;", "displayErrorMessage", "(Ljava/lang/String;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ErrorListener.kt */
public final class ErrorListener implements StripeEditText.ErrorMessageListener {
    private final TextInputLayout textInputLayout;

    public ErrorListener(TextInputLayout textInputLayout2) {
        i.e(textInputLayout2, "textInputLayout");
        this.textInputLayout = textInputLayout2;
    }

    public void displayErrorMessage(String str) {
        if (str == null) {
            this.textInputLayout.setError((CharSequence) null);
            this.textInputLayout.setErrorEnabled(false);
            return;
        }
        this.textInputLayout.setError(str);
    }
}
