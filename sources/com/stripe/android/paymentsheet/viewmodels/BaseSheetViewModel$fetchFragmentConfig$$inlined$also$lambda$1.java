package com.stripe.android.paymentsheet.viewmodels;

import h0.q.w;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"TransitionTargetType", "", "it", "Lm0/i;", "onChanged", "(Ljava/lang/Object;)V", "com/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$$special$$inlined$forEach$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetViewModel.kt */
public final class BaseSheetViewModel$fetchFragmentConfig$$inlined$also$lambda$1<T> implements z {
    public final /* synthetic */ w $configLiveData$inlined;
    public final /* synthetic */ BaseSheetViewModel this$0;

    public BaseSheetViewModel$fetchFragmentConfig$$inlined$also$lambda$1(w wVar, BaseSheetViewModel baseSheetViewModel) {
        this.$configLiveData$inlined = wVar;
        this.this$0 = baseSheetViewModel;
    }

    public final void onChanged(Object obj) {
        this.$configLiveData$inlined.setValue(this.this$0.createFragmentConfig());
    }
}
