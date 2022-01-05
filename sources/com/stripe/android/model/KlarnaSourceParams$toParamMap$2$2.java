package com.stripe.android.model;

import com.stripe.android.model.KlarnaSourceParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "it", "", "invoke", "(Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: KlarnaSourceParams.kt */
public final class KlarnaSourceParams$toParamMap$2$2 extends Lambda implements l<KlarnaSourceParams.CustomPaymentMethods, CharSequence> {
    public static final KlarnaSourceParams$toParamMap$2$2 INSTANCE = new KlarnaSourceParams$toParamMap$2$2();

    public KlarnaSourceParams$toParamMap$2$2() {
        super(1);
    }

    public final CharSequence invoke(KlarnaSourceParams.CustomPaymentMethods customPaymentMethods) {
        i.e(customPaymentMethods, "it");
        return customPaymentMethods.getCode$payments_core_release();
    }
}
