package com.stripe.android.view;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011¸\u0006\u0012"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lm0/i;", "afterTextChanged", "(Landroid/text/Editable;)V", "L;", "text", "", "start", "count", "kotlin/Int", "beforeTextChanged", "(L;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "before", "onTextChanged", "core-ktx_release", "com/stripe/android/view/CardInputWidget$$special$$inlined$doAfterTextChanged$1"}, k = 1, mv = {1, 4, 2})
/* compiled from: TextView.kt */
public final class CardInputWidget$initView$$inlined$forEach$lambda$1 implements TextWatcher {
    public final /* synthetic */ CardInputWidget this$0;

    public CardInputWidget$initView$$inlined$forEach$lambda$1(CardInputWidget cardInputWidget) {
        this.this$0 = cardInputWidget;
    }

    public void afterTextChanged(Editable editable) {
        this.this$0.setShouldShowErrorIcon(false);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
