package com.stripe.android;

import com.stripe.android.model.StripeModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\bj\u0002`\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/model/StripeModel;", "ResultType", "", "result", "Lm0/i;", "onSuccess", "(Lcom/stripe/android/model/StripeModel;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiResultCallback.kt */
public interface ApiResultCallback<ResultType extends StripeModel> {
    void onError(Exception exc);

    void onSuccess(ResultType resulttype);
}
