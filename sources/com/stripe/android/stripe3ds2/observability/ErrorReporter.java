package com.stripe.android.stripe3ds2.observability;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Ljava/io/Serializable;", "", "t", "Lm0/i;", "reportError", "(Ljava/lang/Throwable;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ErrorReporter.kt */
public interface ErrorReporter extends Serializable {
    void reportError(Throwable th);
}
