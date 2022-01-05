package com.stripe.android.model.parsers;

import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent;", "<init>", "()V", "Companion", "ErrorJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SetupIntentJsonParser.kt */
public final class SetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST_SETUP_ERROR = "last_setup_error";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_NEXT_ACTION = "next_action";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD = "payment_method";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_USAGE = "usage";
    @Deprecated
    private static final String VALUE_SETUP_INTENT = "setup_intent";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$Companion;", "", "", "FIELD_CANCELLATION_REASON", "Ljava/lang/String;", "FIELD_CLIENT_SECRET", "FIELD_CREATED", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_SETUP_ERROR", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_STATUS", "FIELD_USAGE", "VALUE_SETUP_INTENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SetupIntentJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent$Error;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent$Error;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SetupIntentJsonParser.kt */
    public static final class ErrorJsonParser implements ModelJsonParser<SetupIntent.Error> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_CODE = "code";
        @Deprecated
        private static final String FIELD_DECLINE_CODE = "decline_code";
        @Deprecated
        private static final String FIELD_DOC_URL = "doc_url";
        @Deprecated
        private static final String FIELD_MESSAGE = "message";
        @Deprecated
        private static final String FIELD_PARAM = "param";
        @Deprecated
        private static final String FIELD_PAYMENT_METHOD = "payment_method";
        @Deprecated
        private static final String FIELD_TYPE = "type";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser$Companion;", "", "", "FIELD_CODE", "Ljava/lang/String;", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SetupIntentJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public SetupIntent.Error parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            String optString = StripeJsonUtils.optString(jSONObject, "code");
            String optString2 = StripeJsonUtils.optString(jSONObject, FIELD_DECLINE_CODE);
            String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_DOC_URL);
            String optString4 = StripeJsonUtils.optString(jSONObject, "message");
            String optString5 = StripeJsonUtils.optString(jSONObject, FIELD_PARAM);
            JSONObject optJSONObject = jSONObject.optJSONObject("payment_method");
            return new SetupIntent.Error(optString, optString2, optString3, optString4, optString5, optJSONObject != null ? new PaymentMethodJsonParser().parse(optJSONObject) : null, SetupIntent.Error.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, "type")));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.model.SetupIntent parse(org.json.JSONObject r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "json"
            m0.n.b.i.e(r0, r1)
            java.lang.String r1 = "object"
            java.lang.String r1 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            java.lang.String r2 = "setup_intent"
            boolean r1 = m0.n.b.i.a(r2, r1)
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L_0x0019
            return r3
        L_0x0019:
            java.lang.String r1 = "payment_method"
            org.json.JSONObject r4 = r0.optJSONObject(r1)
            if (r4 == 0) goto L_0x002c
            com.stripe.android.model.parsers.PaymentMethodJsonParser r5 = new com.stripe.android.model.parsers.PaymentMethodJsonParser
            r5.<init>()
            com.stripe.android.model.PaymentMethod r4 = r5.parse((org.json.JSONObject) r4)
            r13 = r4
            goto L_0x002d
        L_0x002c:
            r13 = r3
        L_0x002d:
            java.lang.String r1 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            if (r13 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = r3
        L_0x0039:
            if (r1 == 0) goto L_0x003d
        L_0x003b:
            r14 = r1
            goto L_0x0043
        L_0x003d:
            if (r13 == 0) goto L_0x0042
            java.lang.String r1 = r13.id
            goto L_0x003b
        L_0x0042:
            r14 = r3
        L_0x0043:
            java.lang.String r1 = "id"
            java.lang.String r6 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            java.lang.String r1 = "created"
            long r8 = r0.optLong(r1)
            java.lang.String r1 = "client_secret"
            java.lang.String r10 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            com.stripe.android.model.SetupIntent$CancellationReason$Companion r1 = com.stripe.android.model.SetupIntent.CancellationReason.Companion
            java.lang.String r2 = "cancellation_reason"
            java.lang.String r2 = com.stripe.android.model.StripeJsonUtils.optString(r0, r2)
            com.stripe.android.model.SetupIntent$CancellationReason r7 = r1.fromCode$payments_core_release(r2)
            java.lang.String r1 = "description"
            java.lang.String r11 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            java.lang.String r1 = "livemode"
            boolean r12 = r0.optBoolean(r1)
            com.stripe.android.model.parsers.ModelJsonParser$Companion r1 = com.stripe.android.model.parsers.ModelJsonParser.Companion
            java.lang.String r2 = "payment_method_types"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            java.util.List r15 = r1.jsonArrayToList$payments_core_release(r2)
            com.stripe.android.model.StripeIntent$Status$Companion r1 = com.stripe.android.model.StripeIntent.Status.Companion
            java.lang.String r2 = "status"
            java.lang.String r2 = com.stripe.android.model.StripeJsonUtils.optString(r0, r2)
            com.stripe.android.model.StripeIntent$Status r16 = r1.fromCode$payments_core_release(r2)
            com.stripe.android.model.StripeIntent$Usage$Companion r1 = com.stripe.android.model.StripeIntent.Usage.Companion
            java.lang.String r2 = "usage"
            java.lang.String r2 = com.stripe.android.model.StripeJsonUtils.optString(r0, r2)
            com.stripe.android.model.StripeIntent$Usage r17 = r1.fromCode$payments_core_release(r2)
            java.lang.String r1 = "last_setup_error"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 == 0) goto L_0x00a5
            com.stripe.android.model.parsers.SetupIntentJsonParser$ErrorJsonParser r2 = new com.stripe.android.model.parsers.SetupIntentJsonParser$ErrorJsonParser
            r2.<init>()
            com.stripe.android.model.SetupIntent$Error r1 = r2.parse((org.json.JSONObject) r1)
            r18 = r1
            goto L_0x00a7
        L_0x00a5:
            r18 = r3
        L_0x00a7:
            java.lang.String r1 = "next_action"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 == 0) goto L_0x00b8
            com.stripe.android.model.parsers.NextActionDataParser r1 = new com.stripe.android.model.parsers.NextActionDataParser
            r1.<init>()
            com.stripe.android.model.StripeIntent$NextActionData r3 = r1.parse((org.json.JSONObject) r0)
        L_0x00b8:
            r19 = r3
            com.stripe.android.model.SetupIntent r0 = new com.stripe.android.model.SetupIntent
            r5 = r0
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.SetupIntentJsonParser.parse(org.json.JSONObject):com.stripe.android.model.SetupIntent");
    }
}
