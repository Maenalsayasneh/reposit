package com.stripe.android.model;

import com.stripe.android.StripeError;
import com.stripe.android.model.parsers.ModelJsonParser;
import kotlin.Metadata;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/StripeErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/StripeError;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/StripeError;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeErrorJsonParser.kt */
public final class StripeErrorJsonParser implements ModelJsonParser<StripeError> {
    public static final Companion Companion = new Companion((f) null);
    private static final String FIELD_CHARGE = "charge";
    private static final String FIELD_CODE = "code";
    private static final String FIELD_DECLINE_CODE = "decline_code";
    private static final String FIELD_DOC_URL = "doc_url";
    private static final String FIELD_ERROR = "error";
    private static final String FIELD_MESSAGE = "message";
    private static final String FIELD_PARAM = "param";
    private static final String FIELD_TYPE = "type";
    public static final String MALFORMED_RESPONSE_MESSAGE = "An improperly formatted error response was found.";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001c\u0010\f\u001a\u00020\u00028\u0000@\u0001XT¢\u0006\f\n\u0004\b\f\u0010\u0004\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/StripeErrorJsonParser$Companion;", "", "", "FIELD_CHARGE", "Ljava/lang/String;", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_ERROR", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_TYPE", "MALFORMED_RESPONSE_MESSAGE", "getMALFORMED_RESPONSE_MESSAGE$payments_core_release$annotations", "()V", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeErrorJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getMALFORMED_RESPONSE_MESSAGE$payments_core_release$annotations() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.stripe.android.StripeError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.stripe.android.StripeError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.stripe.android.StripeError} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.StripeError parse(org.json.JSONObject r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "json"
            m0.n.b.i.e(r0, r1)
            java.lang.String r1 = "error"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ all -> 0x003e }
            com.stripe.android.StripeError r9 = new com.stripe.android.StripeError     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "charge"
            java.lang.String r7 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "code"
            java.lang.String r4 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "decline_code"
            java.lang.String r6 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "message"
            java.lang.String r3 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "param"
            java.lang.String r5 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "type"
            java.lang.String r2 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "doc_url"
            java.lang.String r8 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)     // Catch:{ all -> 0x003e }
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003e }
            goto L_0x0043
        L_0x003e:
            r0 = move-exception
            java.lang.Object r9 = i0.j.f.p.h.l0(r0)
        L_0x0043:
            com.stripe.android.StripeError r0 = new com.stripe.android.StripeError
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 125(0x7d, float:1.75E-43)
            r19 = 0
            java.lang.String r12 = "An improperly formatted error response was found."
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r9 instanceof kotlin.Result.Failure
            if (r1 == 0) goto L_0x005c
            r9 = r0
        L_0x005c:
            com.stripe.android.StripeError r9 = (com.stripe.android.StripeError) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeErrorJsonParser.parse(org.json.JSONObject):com.stripe.android.StripeError");
    }
}
