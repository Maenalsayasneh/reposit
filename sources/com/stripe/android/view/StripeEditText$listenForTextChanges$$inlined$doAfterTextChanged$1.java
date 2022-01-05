package com.stripe.android.view;

import android.text.Editable;
import android.text.TextWatcher;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lm0/i;", "afterTextChanged", "(Landroid/text/Editable;)V", "L;", "text", "", "start", "count", "kotlin/Int", "beforeTextChanged", "(L;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TextView.kt */
public final class StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1 implements TextWatcher {
    public final /* synthetic */ StripeEditText this$0;

    public StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1(StripeEditText stripeEditText) {
        this.this$0 = stripeEditText;
    }

    public void afterTextChanged(Editable editable) {
        StripeEditText.AfterTextChangedListener access$getAfterTextChangedListener$p = this.this$0.afterTextChangedListener;
        if (access$getAfterTextChangedListener$p != null) {
            String obj = editable != null ? editable.toString() : null;
            if (obj == null) {
                obj = "";
            }
            access$getAfterTextChangedListener$p.onTextChanged(obj);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
