package com.stripe.android.networking;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "Lcom/stripe/android/networking/FraudDetectionData;", "arg", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "create", "(Lcom/stripe/android/networking/FraudDetectionData;)Lcom/stripe/android/networking/FraudDetectionDataRequest;", "Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "fraudDetectionDataRequestParamsFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "<init>", "(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequestFactory.kt */
public final class DefaultFraudDetectionDataRequestFactory implements FraudDetectionDataRequestFactory {
    private final FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory;

    public DefaultFraudDetectionDataRequestFactory(FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory2) {
        i.e(fraudDetectionDataRequestParamsFactory2, "fraudDetectionDataRequestParamsFactory");
        this.fraudDetectionDataRequestParamsFactory = fraudDetectionDataRequestParamsFactory2;
    }

    public FraudDetectionDataRequest create(FraudDetectionData fraudDetectionData) {
        Map<String, Object> createParams$payments_core_release = this.fraudDetectionDataRequestParamsFactory.createParams$payments_core_release(fraudDetectionData);
        String guid$payments_core_release = fraudDetectionData != null ? fraudDetectionData.getGuid$payments_core_release() : null;
        if (guid$payments_core_release == null) {
            guid$payments_core_release = "";
        }
        return new FraudDetectionDataRequest(createParams$payments_core_release, guid$payments_core_release);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRequestFactory(Context context) {
        this(new FraudDetectionDataRequestParamsFactory(context));
        i.e(context, "context");
    }
}
