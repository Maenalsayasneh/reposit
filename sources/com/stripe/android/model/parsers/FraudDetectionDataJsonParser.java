package com.stripe.android.model.parsers;

import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/networking/FraudDetectionData;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/networking/FraudDetectionData;", "Lkotlin/Function0;", "", "timestampSupplier", "Lm0/n/a/a;", "<init>", "(Lm0/n/a/a;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataJsonParser.kt */
public final class FraudDetectionDataJsonParser implements ModelJsonParser<FraudDetectionData> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_GUID = "guid";
    @Deprecated
    private static final String FIELD_MUID = "muid";
    @Deprecated
    private static final String FIELD_SID = "sid";
    private final a<Long> timestampSupplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser$Companion;", "", "", "FIELD_GUID", "Ljava/lang/String;", "FIELD_MUID", "FIELD_SID", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FraudDetectionDataJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public FraudDetectionDataJsonParser(a<Long> aVar) {
        i.e(aVar, "timestampSupplier");
        this.timestampSupplier = aVar;
    }

    public FraudDetectionData parse(JSONObject jSONObject) {
        String optString;
        String optString2;
        i.e(jSONObject, "json");
        String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_GUID);
        if (optString3 == null || (optString = StripeJsonUtils.optString(jSONObject, FIELD_MUID)) == null || (optString2 = StripeJsonUtils.optString(jSONObject, FIELD_SID)) == null) {
            return null;
        }
        return new FraudDetectionData(optString3, optString, optString2, this.timestampSupplier.invoke().longValue());
    }
}
