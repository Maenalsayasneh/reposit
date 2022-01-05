package com.stripe.android.model.parsers;

import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceSepaDebitDataJsonParser.kt */
public final class SourceSepaDebitDataJsonParser implements ModelJsonParser<SourceTypeModel.SepaDebit> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_BANK_CODE = "bank_code";
    @Deprecated
    private static final String FIELD_BRANCH_CODE = "branch_code";
    @Deprecated
    private static final String FIELD_COUNTRY = "country";
    @Deprecated
    private static final String FIELD_FINGERPRINT = "fingerprint";
    @Deprecated
    private static final String FIELD_LAST4 = "last4";
    @Deprecated
    private static final String FIELD_MANDATE_REFERENCE = "mandate_reference";
    @Deprecated
    private static final String FIELD_MANDATE_URL = "mandate_url";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser$Companion;", "", "", "FIELD_BANK_CODE", "Ljava/lang/String;", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "FIELD_MANDATE_REFERENCE", "FIELD_MANDATE_URL", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceSepaDebitDataJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public SourceTypeModel.SepaDebit parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        return new SourceTypeModel.SepaDebit(StripeJsonUtils.optString(jSONObject, FIELD_BANK_CODE), StripeJsonUtils.optString(jSONObject, FIELD_BRANCH_CODE), StripeJsonUtils.optString(jSONObject, "country"), StripeJsonUtils.optString(jSONObject, FIELD_FINGERPRINT), StripeJsonUtils.optString(jSONObject, FIELD_LAST4), StripeJsonUtils.optString(jSONObject, FIELD_MANDATE_REFERENCE), StripeJsonUtils.optString(jSONObject, FIELD_MANDATE_URL));
    }
}
