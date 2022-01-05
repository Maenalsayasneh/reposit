package com.stripe.android.model.parsers;

import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.StripeJsonUtils;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/BankStatuses;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/BankStatuses;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FpxBankStatusesJsonParser.kt */
public final class FpxBankStatusesJsonParser implements ModelJsonParser<BankStatuses> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_PARSED_BANK_STATUS = "parsed_bank_status";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser$Companion;", "", "", "FIELD_PARSED_BANK_STATUS", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FpxBankStatusesJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BankStatuses parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        Map<String, Object> optMap$payments_core_release = StripeJsonUtils.INSTANCE.optMap$payments_core_release(jSONObject, FIELD_PARSED_BANK_STATUS);
        if (optMap$payments_core_release == null || optMap$payments_core_release.isEmpty()) {
            optMap$payments_core_release = null;
        }
        if (optMap$payments_core_release != null) {
            return new BankStatuses(optMap$payments_core_release);
        }
        return new BankStatuses((Map) null, 1, (f) null);
    }
}
