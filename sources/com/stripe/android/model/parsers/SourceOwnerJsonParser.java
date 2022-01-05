package com.stripe.android.model.parsers;

import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOwnerJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Owner;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceOwnerJsonParser.kt */
public final class SourceOwnerJsonParser implements ModelJsonParser<Source.Owner> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_ADDRESS = "address";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_PHONE = "phone";
    @Deprecated
    private static final String FIELD_VERIFIED_ADDRESS = "verified_address";
    @Deprecated
    private static final String FIELD_VERIFIED_EMAIL = "verified_email";
    @Deprecated
    private static final String FIELD_VERIFIED_NAME = "verified_name";
    @Deprecated
    private static final String FIELD_VERIFIED_PHONE = "verified_phone";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOwnerJsonParser$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOwnerJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Source.Owner parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        JSONObject optJSONObject = jSONObject.optJSONObject("address");
        Address address = null;
        Address parse = optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null;
        String optString = StripeJsonUtils.optString(jSONObject, "email");
        String optString2 = StripeJsonUtils.optString(jSONObject, "name");
        String optString3 = StripeJsonUtils.optString(jSONObject, "phone");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_VERIFIED_ADDRESS);
        if (optJSONObject2 != null) {
            address = new AddressJsonParser().parse(optJSONObject2);
        }
        return new Source.Owner(parse, optString, optString2, optString3, address, StripeJsonUtils.optString(jSONObject, FIELD_VERIFIED_EMAIL), StripeJsonUtils.optString(jSONObject, FIELD_VERIFIED_NAME), StripeJsonUtils.optString(jSONObject, FIELD_VERIFIED_PHONE));
    }
}
