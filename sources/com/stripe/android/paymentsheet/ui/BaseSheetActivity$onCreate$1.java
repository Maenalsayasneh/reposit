package com.stripe.android.paymentsheet.ui;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"ResultType", "Lm0/i;", "onBackStackChanged", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetActivity.kt */
public final class BaseSheetActivity$onCreate$1 implements FragmentManager.l {
    public final /* synthetic */ BaseSheetActivity this$0;

    public BaseSheetActivity$onCreate$1(BaseSheetActivity baseSheetActivity) {
        this.this$0 = baseSheetActivity;
    }

    public final void onBackStackChanged() {
        BaseSheetActivity baseSheetActivity = this.this$0;
        FragmentManager supportFragmentManager = baseSheetActivity.getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        baseSheetActivity.updateToolbarButton(supportFragmentManager.L() == 0);
    }
}
