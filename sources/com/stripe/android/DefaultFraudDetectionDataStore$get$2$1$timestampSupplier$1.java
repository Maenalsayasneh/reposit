package com.stripe.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()J", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataStore.kt */
public final class DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1 extends Lambda implements a<Long> {
    public final /* synthetic */ JSONObject $json;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1(JSONObject jSONObject) {
        super(0);
        this.$json = jSONObject;
    }

    public final long invoke() {
        return this.$json.optLong("timestamp", -1);
    }
}
