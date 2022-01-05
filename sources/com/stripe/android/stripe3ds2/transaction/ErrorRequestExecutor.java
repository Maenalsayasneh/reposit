package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "errorData", "Lm0/i;", "executeAsync", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "Factory", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ErrorRequestExecutor.kt */
public interface ErrorRequestExecutor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "Ljava/io/Serializable;", "", "acsUrl", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "create", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ErrorRequestExecutor.kt */
    public interface Factory extends Serializable {
        ErrorRequestExecutor create(String str, ErrorReporter errorReporter);
    }

    void executeAsync(ErrorData errorData);
}
