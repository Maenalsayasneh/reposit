package com.stripe.android.model;

import com.stripe.android.model.KlarnaSourceParams;
import i0.j.f.p.h;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Comparisons.kt */
public final class KlarnaSourceParams$$special$$inlined$sortedBy$1<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return h.L(Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t).ordinal()), Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t2).ordinal()));
    }
}
