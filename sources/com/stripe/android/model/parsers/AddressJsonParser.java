package com.stripe.android.model.parsers;

import com.stripe.android.model.Address;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/AddressJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Address;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Address;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddressJsonParser.kt */
public final class AddressJsonParser implements ModelJsonParser<Address> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_CITY = "city";
    @Deprecated
    private static final String FIELD_COUNTRY = "country";
    @Deprecated
    private static final String FIELD_LINE_1 = "line1";
    @Deprecated
    private static final String FIELD_LINE_2 = "line2";
    @Deprecated
    private static final String FIELD_POSTAL_CODE = "postal_code";
    @Deprecated
    private static final String FIELD_STATE = "state";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/AddressJsonParser$Companion;", "", "", "FIELD_CITY", "Ljava/lang/String;", "FIELD_COUNTRY", "FIELD_LINE_1", "FIELD_LINE_2", "FIELD_POSTAL_CODE", "FIELD_STATE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddressJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Address parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        return new Address(StripeJsonUtils.optString(jSONObject, FIELD_CITY), StripeJsonUtils.optString(jSONObject, "country"), StripeJsonUtils.optString(jSONObject, FIELD_LINE_1), StripeJsonUtils.optString(jSONObject, FIELD_LINE_2), StripeJsonUtils.optString(jSONObject, FIELD_POSTAL_CODE), StripeJsonUtils.optString(jSONObject, "state"));
    }
}
