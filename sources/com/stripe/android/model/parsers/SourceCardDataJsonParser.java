package com.stripe.android.model.parsers;

import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.TokenizationMethod;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceTypeModel$Card;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceCardDataJsonParser.kt */
public final class SourceCardDataJsonParser implements ModelJsonParser<SourceTypeModel.Card> {
    public static final Companion Companion = new Companion((f) null);
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_THREE_D_SECURE = "three_d_secure";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/SourceCardDataJsonParser$Companion;", "", "", "FIELD_ADDRESS_LINE1_CHECK", "Ljava/lang/String;", "FIELD_ADDRESS_ZIP_CHECK", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_CVC_CHECK", "FIELD_DYNAMIC_LAST4", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_THREE_D_SECURE", "FIELD_TOKENIZATION_METHOD", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceCardDataJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public SourceTypeModel.Card parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        String optString = StripeJsonUtils.optString(jSONObject, FIELD_ADDRESS_LINE1_CHECK);
        String optString2 = StripeJsonUtils.optString(jSONObject, FIELD_ADDRESS_ZIP_CHECK);
        CardBrand cardBrand$payments_core_release = Card.Companion.getCardBrand$payments_core_release(StripeJsonUtils.optString(jSONObject, "brand"));
        String optString3 = StripeJsonUtils.optString(jSONObject, "country");
        String optString4 = StripeJsonUtils.optString(jSONObject, FIELD_CVC_CHECK);
        String optString5 = StripeJsonUtils.optString(jSONObject, FIELD_DYNAMIC_LAST4);
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        return new SourceTypeModel.Card(optString, optString2, cardBrand$payments_core_release, optString3, optString4, optString5, stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_EXP_MONTH), stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_EXP_YEAR), CardFunding.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, FIELD_FUNDING)), StripeJsonUtils.optString(jSONObject, FIELD_LAST4), SourceTypeModel.Card.ThreeDSecureStatus.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "three_d_secure")), TokenizationMethod.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, FIELD_TOKENIZATION_METHOD)));
    }
}
