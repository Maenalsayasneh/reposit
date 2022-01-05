package com.stripe.android.paymentsheet.ui;

import com.stripe.android.view.KeyboardController;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"ResultType", "Lcom/stripe/android/view/KeyboardController;", "invoke", "()Lcom/stripe/android/view/KeyboardController;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetActivity.kt */
public final class BaseSheetActivity$keyboardController$2 extends Lambda implements a<KeyboardController> {
    public final /* synthetic */ BaseSheetActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$keyboardController$2(BaseSheetActivity baseSheetActivity) {
        super(0);
        this.this$0 = baseSheetActivity;
    }

    public final KeyboardController invoke() {
        return new KeyboardController(this.this$0);
    }
}
