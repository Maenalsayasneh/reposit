package com.stripe.android.model.parsers;

import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/ShippingInformationJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ShippingInformation;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/ShippingInformation;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ShippingInformationJsonParser.kt */
public final class ShippingInformationJsonParser implements ModelJsonParser<ShippingInformation> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_ADDRESS = "address";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_PHONE = "phone";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/ShippingInformationJsonParser$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_NAME", "FIELD_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ShippingInformationJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ShippingInformation parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        JSONObject optJSONObject = jSONObject.optJSONObject("address");
        return new ShippingInformation(optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null, StripeJsonUtils.optString(jSONObject, "name"), StripeJsonUtils.optString(jSONObject, "phone"));
    }
}
