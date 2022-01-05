package com.stripe.android.networking;

import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/stripe/android/networking/ApiRequestExecutor;", "", "Lcom/stripe/android/networking/ApiRequest;", "request", "Lcom/stripe/android/networking/StripeResponse;", "execute", "(Lcom/stripe/android/networking/ApiRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/FileUploadRequest;", "(Lcom/stripe/android/networking/FileUploadRequest;Lm0/l/c;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiRequestExecutor.kt */
public interface ApiRequestExecutor {
    Object execute(ApiRequest apiRequest, c<? super StripeResponse> cVar);

    Object execute(FileUploadRequest fileUploadRequest, c<? super StripeResponse> cVar);
}
