package com.stripe.android.model.parsers;

import com.stripe.android.model.Card;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.TokenizationMethod;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Card;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Card;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardJsonParser.kt */
public final class CardJsonParser implements ModelJsonParser<Card> {
    public static final Companion Companion = new Companion((f) null);
    private static final String FIELD_ADDRESS_CITY = "address_city";
    private static final String FIELD_ADDRESS_COUNTRY = "address_country";
    private static final String FIELD_ADDRESS_LINE1 = "address_line1";
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_LINE2 = "address_line2";
    private static final String FIELD_ADDRESS_STATE = "address_state";
    private static final String FIELD_ADDRESS_ZIP = "address_zip";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CURRENCY = "currency";
    private static final String FIELD_CUSTOMER = "customer";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FINGERPRINT = "fingerprint";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";
    public static final String VALUE_CARD = "card";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser$Companion;", "", "", "FIELD_ADDRESS_CITY", "Ljava/lang/String;", "FIELD_ADDRESS_COUNTRY", "FIELD_ADDRESS_LINE1", "FIELD_ADDRESS_LINE1_CHECK", "FIELD_ADDRESS_LINE2", "FIELD_ADDRESS_STATE", "FIELD_ADDRESS_ZIP", "FIELD_ADDRESS_ZIP_CHECK", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_CURRENCY", "FIELD_CUSTOMER", "FIELD_CVC_CHECK", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_ID", "FIELD_LAST4", "FIELD_NAME", "FIELD_OBJECT", "FIELD_TOKENIZATION_METHOD", "VALUE_CARD", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Card parse(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        i.e(jSONObject2, "json");
        boolean z = true;
        if (!i.a("card", jSONObject2.optString(FIELD_OBJECT))) {
            return null;
        }
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Integer optInteger$payments_core_release = stripeJsonUtils.optInteger$payments_core_release(jSONObject2, FIELD_EXP_MONTH);
        int i = -1;
        Integer valueOf = Integer.valueOf(optInteger$payments_core_release != null ? optInteger$payments_core_release.intValue() : -1);
        int intValue = valueOf.intValue();
        Integer num = !(intValue < 1 || intValue > 12) ? valueOf : null;
        Integer optInteger$payments_core_release2 = stripeJsonUtils.optInteger$payments_core_release(jSONObject2, FIELD_EXP_YEAR);
        if (optInteger$payments_core_release2 != null) {
            i = optInteger$payments_core_release2.intValue();
        }
        Integer valueOf2 = Integer.valueOf(i);
        if (valueOf2.intValue() >= 0) {
            z = false;
        }
        return new Card((String) null, (String) null, num, !z ? valueOf2 : null, StripeJsonUtils.optString(jSONObject2, "name"), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_LINE1), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_LINE1_CHECK), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_LINE2), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_CITY), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_STATE), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_ZIP), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_ZIP_CHECK), StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_COUNTRY), StripeJsonUtils.optString(jSONObject2, FIELD_LAST4), Card.Companion.getCardBrand$payments_core_release(StripeJsonUtils.optString(jSONObject2, "brand")), CardFunding.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject2, FIELD_FUNDING)), StripeJsonUtils.optString(jSONObject2, FIELD_FINGERPRINT), stripeJsonUtils.optCountryCode$payments_core_release(jSONObject2, "country"), StripeJsonUtils.optCurrency$payments_core_release(jSONObject2, FIELD_CURRENCY), StripeJsonUtils.optString(jSONObject2, FIELD_CUSTOMER), StripeJsonUtils.optString(jSONObject2, FIELD_CVC_CHECK), StripeJsonUtils.optString(jSONObject2, "id"), (Set) null, TokenizationMethod.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject2, FIELD_TOKENIZATION_METHOD)), (Map) null, 20971523, (f) null);
    }
}
