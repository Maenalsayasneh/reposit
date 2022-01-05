package com.stripe.android.paymentsheet.ui;

import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"ResultType", "", "kotlin.jvm.PlatformType", "isProcessing", "Lm0/i;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetActivity.kt */
public final class BaseSheetActivity$onCreate$4<T> implements z<Boolean> {
    public final /* synthetic */ BaseSheetActivity this$0;

    public BaseSheetActivity$onCreate$4(BaseSheetActivity baseSheetActivity) {
        this.this$0 = baseSheetActivity;
    }

    public final void onChanged(Boolean bool) {
        BaseSheetActivity baseSheetActivity = this.this$0;
        i.d(bool, "isProcessing");
        baseSheetActivity.updateRootViewClickHandling(bool.booleanValue());
        this.this$0.getToolbar().setEnabled(!bool.booleanValue());
    }
}
