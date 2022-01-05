package com.stripe.android.model.parsers;

import com.stripe.android.model.StripeFile;
import com.stripe.android.model.StripeFilePurpose;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/StripeFileJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeFile;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeFile;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeFileJsonParser.kt */
public final class StripeFileJsonParser implements ModelJsonParser<StripeFile> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_FILENAME = "filename";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_PURPOSE = "purpose";
    @Deprecated
    private static final String FIELD_SIZE = "size";
    @Deprecated
    private static final String FIELD_TITLE = "title";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_URL = "url";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/StripeFileJsonParser$Companion;", "", "", "FIELD_CREATED", "Ljava/lang/String;", "FIELD_FILENAME", "FIELD_ID", "FIELD_PURPOSE", "FIELD_SIZE", "FIELD_TITLE", "FIELD_TYPE", "FIELD_URL", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeFileJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeFile parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        String optString = StripeJsonUtils.optString(jSONObject, "id");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        return new StripeFile(optString, stripeJsonUtils.optLong$payments_core_release(jSONObject, FIELD_CREATED), StripeJsonUtils.optString(jSONObject, FIELD_FILENAME), StripeFilePurpose.Companion.fromCode(StripeJsonUtils.optString(jSONObject, FIELD_PURPOSE)), stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_SIZE), StripeJsonUtils.optString(jSONObject, "title"), StripeJsonUtils.optString(jSONObject, "type"), StripeJsonUtils.optString(jSONObject, "url"));
    }
}
