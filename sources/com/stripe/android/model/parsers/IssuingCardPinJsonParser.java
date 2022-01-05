package com.stripe.android.model.parsers;

import com.stripe.android.model.IssuingCardPin;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/IssuingCardPin;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/IssuingCardPin;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IssuingCardPinJsonParser.kt */
public final class IssuingCardPinJsonParser implements ModelJsonParser<IssuingCardPin> {
    public IssuingCardPin parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        String optString = StripeJsonUtils.optString(jSONObject, "pin");
        if (optString != null) {
            return new IssuingCardPin(optString);
        }
        return null;
    }
}
