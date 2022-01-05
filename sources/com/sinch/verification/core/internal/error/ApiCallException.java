package com.sinch.verification.core.internal.error;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sinch/verification/core/internal/error/ApiCallException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/sinch/verification/core/internal/error/ApiErrorData;", "data", "<init>", "(Lcom/sinch/verification/core/internal/error/ApiErrorData;)V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiCallException.kt */
public final class ApiCallException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiCallException(ApiErrorData apiErrorData) {
        super(apiErrorData.b);
        i.e(apiErrorData, MessageExtension.FIELD_DATA);
    }
}
