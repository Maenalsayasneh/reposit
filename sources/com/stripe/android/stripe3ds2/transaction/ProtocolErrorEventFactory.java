package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;", "", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "errorData", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "create", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ProtocolErrorEventFactory.kt */
public final class ProtocolErrorEventFactory {
    public final ProtocolErrorEvent create(ErrorData errorData) {
        i.e(errorData, "errorData");
        String acsTransId = errorData.getAcsTransId();
        if (acsTransId == null) {
            acsTransId = "";
        }
        return new ProtocolErrorEvent(errorData.getSdkTransId(), new ErrorMessage(acsTransId, errorData.getErrorCode(), errorData.getErrorDescription(), errorData.getErrorDetail()));
    }
}
