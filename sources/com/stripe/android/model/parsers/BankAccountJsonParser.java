package com.stripe.android.model.parsers;

import com.stripe.android.model.BankAccount;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/BankAccountJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/BankAccount;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/BankAccount;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BankAccountJsonParser.kt */
public final class BankAccountJsonParser implements ModelJsonParser<BankAccount> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @Deprecated
    private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    @Deprecated
    private static final String FIELD_BANK_NAME = "bank_name";
    @Deprecated
    private static final String FIELD_COUNTRY = "country";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_FINGERPRINT = "fingerprint";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST4 = "last4";
    @Deprecated
    private static final String FIELD_ROUTING_NUMBER = "routing_number";
    @Deprecated
    private static final String FIELD_STATUS = "status";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/parsers/BankAccountJsonParser$Companion;", "", "", "FIELD_ACCOUNT_HOLDER_NAME", "Ljava/lang/String;", "FIELD_ACCOUNT_HOLDER_TYPE", "FIELD_BANK_NAME", "FIELD_COUNTRY", "FIELD_CURRENCY", "FIELD_FINGERPRINT", "FIELD_ID", "FIELD_LAST4", "FIELD_ROUTING_NUMBER", "FIELD_STATUS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BankAccountJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BankAccount parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        return new BankAccount(StripeJsonUtils.optString(jSONObject, "id"), StripeJsonUtils.optString(jSONObject, FIELD_ACCOUNT_HOLDER_NAME), BankAccount.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, FIELD_ACCOUNT_HOLDER_TYPE)), StripeJsonUtils.optString(jSONObject, FIELD_BANK_NAME), StripeJsonUtils.INSTANCE.optCountryCode$payments_core_release(jSONObject, "country"), StripeJsonUtils.optCurrency$payments_core_release(jSONObject, FIELD_CURRENCY), StripeJsonUtils.optString(jSONObject, FIELD_FINGERPRINT), StripeJsonUtils.optString(jSONObject, FIELD_LAST4), StripeJsonUtils.optString(jSONObject, FIELD_ROUTING_NUMBER), BankAccount.Status.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, "status")));
    }
}
