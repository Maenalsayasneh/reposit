package com.stripe.android.paymentsheet.viewmodels;

import androidx.lifecycle.LiveData;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import h0.c.a.c.a;
import h0.q.i0;
import h0.q.w;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "Landroidx/lifecycle/LiveData;", "apply", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Transformations.kt */
public final class BaseSheetViewModel$$special$$inlined$switchMap$2<I, O> implements a<Boolean, LiveData<Boolean>> {
    public final /* synthetic */ BaseSheetViewModel this$0;

    public BaseSheetViewModel$$special$$inlined$switchMap$2(BaseSheetViewModel baseSheetViewModel) {
        this.this$0 = baseSheetViewModel;
    }

    public final LiveData<Boolean> apply(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        LiveData<PaymentSelection> selection$payments_core_release = this.this$0.getSelection$payments_core_release();
        BaseSheetViewModel$$special$$inlined$switchMap$2$lambda$1 baseSheetViewModel$$special$$inlined$switchMap$2$lambda$1 = new BaseSheetViewModel$$special$$inlined$switchMap$2$lambda$1(booleanValue);
        w wVar = new w();
        wVar.a(selection$payments_core_release, new i0(baseSheetViewModel$$special$$inlined$switchMap$2$lambda$1, wVar));
        i.d(wVar, "Transformations.switchMap(this) { transform(it) }");
        return wVar;
    }
}
