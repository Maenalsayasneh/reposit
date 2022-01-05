package com.stripe.android.paymentsheet;

import android.widget.CompoundButton;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lm0/i;", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public final class BaseAddCardFragment$setupSaveCardCheckbox$2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ BaseAddCardFragment this$0;

    public BaseAddCardFragment$setupSaveCardCheckbox$2(BaseAddCardFragment baseAddCardFragment) {
        this.this$0 = baseAddCardFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.this$0.onSaveCardCheckboxChanged();
    }
}
