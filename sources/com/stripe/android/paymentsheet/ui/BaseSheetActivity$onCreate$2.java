package com.stripe.android.paymentsheet.ui;

import android.view.ViewTreeObserver;
import com.stripe.android.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"ResultType", "Lm0/i;", "onScrollChanged", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetActivity.kt */
public final class BaseSheetActivity$onCreate$2 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ BaseSheetActivity this$0;

    public BaseSheetActivity$onCreate$2(BaseSheetActivity baseSheetActivity) {
        this.this$0 = baseSheetActivity;
    }

    public final void onScrollChanged() {
        this.this$0.getAppbar().setElevation(this.this$0.getScrollView().getScrollY() > 0 ? this.this$0.getResources().getDimension(R.dimen.stripe_paymentsheet_toolbar_elevation) : 0.0f);
    }
}
