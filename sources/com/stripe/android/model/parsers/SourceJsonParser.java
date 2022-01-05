package com.stripe.android.model.parsers;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.StripeModel;
import com.stripe.android.model.WeChat;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\n\t\u000b\f\r\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;", "<init>", "()V", "Companion", "CodeVerificationJsonParser", "KlarnaJsonParser", "OwnerJsonParser", "ReceiverJsonParser", "RedirectJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceJsonParser.kt */
public final class SourceJsonParser implements ModelJsonParser<Source> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CODE_VERIFICATION = "code_verification";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_FLOW = "flow";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_KLARNA = "klarna";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_OWNER = "owner";
    @Deprecated
    private static final String FIELD_RECEIVER = "receiver";
    @Deprecated
    private static final String FIELD_REDIRECT = "redirect";
    @Deprecated
    private static final String FIELD_SOURCE_ORDER = "source_order";
    @Deprecated
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_USAGE = "usage";
    @Deprecated
    private static final String FIELD_WECHAT = "wechat";
    /* access modifiers changed from: private */
    @Deprecated
    public static final Set<String> MODELED_TYPES = g.h0("card", "sepa_debit");
    @Deprecated
    private static final String VALUE_CARD = "card";
    @Deprecated
    private static final String VALUE_SOURCE = "source";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$CodeVerification;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceJsonParser.kt */
    public static final class CodeVerificationJsonParser implements ModelJsonParser<Source.CodeVerification> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ATTEMPTS_REMAINING = "attempts_remaining";
        @Deprecated
        private static final String FIELD_STATUS = "status";
        @Deprecated
        private static final int INVALID_ATTEMPTS_REMAINING = -1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser$Companion;", "", "", "FIELD_ATTEMPTS_REMAINING", "Ljava/lang/String;", "FIELD_STATUS", "", "INVALID_ATTEMPTS_REMAINING", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Source.CodeVerification parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new Source.CodeVerification(jSONObject.optInt(FIELD_ATTEMPTS_REMAINING, -1), Source.CodeVerification.Status.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "status")));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\"\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J0\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH\b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b)\u0010\u0012¨\u0006,"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/Source;", "fromCardJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;", "fromSourceJson", "Lcom/stripe/android/model/StripeModel;", "T", "", "key", "optStripeJsonModel", "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/model/StripeModel;", "sourceType", "asSourceType", "(Ljava/lang/String;)Ljava/lang/String;", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CLIENT_SECRET", "FIELD_CODE_VERIFICATION", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_FLOW", "FIELD_ID", "FIELD_KLARNA", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_OWNER", "FIELD_RECEIVER", "FIELD_REDIRECT", "FIELD_SOURCE_ORDER", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_STATUS", "FIELD_TYPE", "FIELD_USAGE", "FIELD_WECHAT", "", "MODELED_TYPES", "Ljava/util/Set;", "VALUE_CARD", "VALUE_SOURCE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        private final String asSourceType(String str) {
            String str2 = str;
            if (str2 != null) {
                switch (str.hashCode()) {
                    case -1920743119:
                        if (str2.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (str2.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -1128905083:
                        if (str2.equals("klarna")) {
                            return "klarna";
                        }
                        break;
                    case -896955097:
                        if (str2.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (str2.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (str2.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        boolean equals = str2.equals("unknown");
                        break;
                    case 100648:
                        if (str2.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (str2.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (str2.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (str2.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (str2.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (str2.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (str2.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }

        /* access modifiers changed from: private */
        public final Source fromCardJson(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            return new Source(StripeJsonUtils.optString(jSONObject2, "id"), (Long) null, (String) null, (Source.CodeVerification) null, (Long) null, (String) null, (Source.Flow) null, (Boolean) null, (Map) null, (Source.Owner) null, (Source.Receiver) null, (Source.Redirect) null, (Source.Status) null, (Map) null, new SourceCardDataJsonParser().parse(jSONObject2), "card", "card", (Source.Usage) null, (WeChat) null, (Source.Klarna) null, (SourceOrder) null, (String) null, 4079614, (f) null);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
            if ((r7 instanceof com.stripe.android.model.Source.CodeVerification) == false) goto L_0x00f0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.stripe.android.model.Source fromSourceJson(org.json.JSONObject r32) {
            /*
                r31 = this;
                r0 = r32
                java.lang.String r1 = "type"
                java.lang.String r1 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
                if (r1 == 0) goto L_0x000b
                goto L_0x000d
            L_0x000b:
                java.lang.String r1 = "unknown"
            L_0x000d:
                r15 = r31
                java.lang.String r14 = r15.asSourceType(r1)
                com.stripe.android.model.StripeJsonUtils r2 = com.stripe.android.model.StripeJsonUtils.INSTANCE
                org.json.JSONObject r3 = r0.optJSONObject(r1)
                java.util.Map r16 = r2.jsonObjectToMap$payments_core_release(r3)
                java.util.Set r3 = com.stripe.android.model.parsers.SourceJsonParser.MODELED_TYPES
                boolean r3 = r3.contains(r1)
                java.lang.String r4 = "owner"
                java.lang.String r5 = "redirect"
                java.lang.String r6 = "receiver"
                java.lang.String r7 = "code_verification"
                r8 = 0
                if (r3 == 0) goto L_0x00d6
                boolean r3 = r0.has(r1)
                if (r3 != 0) goto L_0x0039
                r3 = r8
                goto L_0x00d3
            L_0x0039:
                int r3 = r1.hashCode()
                switch(r3) {
                    case -808719889: goto L_0x00b5;
                    case -776144932: goto L_0x009f;
                    case 3046160: goto L_0x0087;
                    case 106164915: goto L_0x0071;
                    case 1615551277: goto L_0x005b;
                    case 1636477296: goto L_0x0042;
                    default: goto L_0x0040;
                }
            L_0x0040:
                goto L_0x00cb
            L_0x0042:
                java.lang.String r3 = "sepa_debit"
                boolean r9 = r1.equals(r3)
                if (r9 == 0) goto L_0x00cb
                org.json.JSONObject r3 = r0.optJSONObject(r3)
                if (r3 == 0) goto L_0x00cb
                com.stripe.android.model.parsers.SourceSepaDebitDataJsonParser r9 = new com.stripe.android.model.parsers.SourceSepaDebitDataJsonParser
                r9.<init>()
                com.stripe.android.model.SourceTypeModel$SepaDebit r3 = r9.parse((org.json.JSONObject) r3)
                goto L_0x00cc
            L_0x005b:
                boolean r3 = r1.equals(r7)
                if (r3 == 0) goto L_0x00cb
                org.json.JSONObject r3 = r0.optJSONObject(r7)
                if (r3 == 0) goto L_0x00cb
                com.stripe.android.model.parsers.SourceJsonParser$CodeVerificationJsonParser r9 = new com.stripe.android.model.parsers.SourceJsonParser$CodeVerificationJsonParser
                r9.<init>()
                com.stripe.android.model.Source$CodeVerification r3 = r9.parse((org.json.JSONObject) r3)
                goto L_0x00cc
            L_0x0071:
                boolean r3 = r1.equals(r4)
                if (r3 == 0) goto L_0x00cb
                org.json.JSONObject r3 = r0.optJSONObject(r4)
                if (r3 == 0) goto L_0x00cb
                com.stripe.android.model.parsers.SourceJsonParser$OwnerJsonParser r9 = new com.stripe.android.model.parsers.SourceJsonParser$OwnerJsonParser
                r9.<init>()
                com.stripe.android.model.Source$Owner r3 = r9.parse((org.json.JSONObject) r3)
                goto L_0x00cc
            L_0x0087:
                java.lang.String r3 = "card"
                boolean r9 = r1.equals(r3)
                if (r9 == 0) goto L_0x00cb
                org.json.JSONObject r3 = r0.optJSONObject(r3)
                if (r3 == 0) goto L_0x00cb
                com.stripe.android.model.parsers.SourceCardDataJsonParser r9 = new com.stripe.android.model.parsers.SourceCardDataJsonParser
                r9.<init>()
                com.stripe.android.model.SourceTypeModel$Card r3 = r9.parse((org.json.JSONObject) r3)
                goto L_0x00cc
            L_0x009f:
                boolean r3 = r1.equals(r5)
                if (r3 == 0) goto L_0x00cb
                org.json.JSONObject r3 = r0.optJSONObject(r5)
                if (r3 == 0) goto L_0x00cb
                com.stripe.android.model.parsers.SourceJsonParser$RedirectJsonParser r9 = new com.stripe.android.model.parsers.SourceJsonParser$RedirectJsonParser
                r9.<init>()
                com.stripe.android.model.Source$Redirect r3 = r9.parse((org.json.JSONObject) r3)
                goto L_0x00cc
            L_0x00b5:
                boolean r3 = r1.equals(r6)
                if (r3 == 0) goto L_0x00cb
                org.json.JSONObject r3 = r0.optJSONObject(r6)
                if (r3 == 0) goto L_0x00cb
                com.stripe.android.model.parsers.SourceJsonParser$ReceiverJsonParser r9 = new com.stripe.android.model.parsers.SourceJsonParser$ReceiverJsonParser
                r9.<init>()
                com.stripe.android.model.Source$Receiver r3 = r9.parse((org.json.JSONObject) r3)
                goto L_0x00cc
            L_0x00cb:
                r3 = r8
            L_0x00cc:
                boolean r9 = r3 instanceof com.stripe.android.model.SourceTypeModel
                if (r9 != 0) goto L_0x00d1
                r3 = r8
            L_0x00d1:
                com.stripe.android.model.SourceTypeModel r3 = (com.stripe.android.model.SourceTypeModel) r3
            L_0x00d3:
                r17 = r3
                goto L_0x00d8
            L_0x00d6:
                r17 = r8
            L_0x00d8:
                java.lang.String r3 = "id"
                java.lang.String r3 = com.stripe.android.model.StripeJsonUtils.optString(r0, r3)
                java.lang.String r9 = "amount"
                java.lang.Long r9 = r2.optLong$payments_core_release(r0, r9)
                java.lang.String r10 = "client_secret"
                java.lang.String r10 = com.stripe.android.model.StripeJsonUtils.optString(r0, r10)
                boolean r11 = r0.has(r7)
                if (r11 != 0) goto L_0x00f2
            L_0x00f0:
                r7 = r8
                goto L_0x0108
            L_0x00f2:
                org.json.JSONObject r7 = r0.optJSONObject(r7)
                if (r7 == 0) goto L_0x0102
                com.stripe.android.model.parsers.SourceJsonParser$CodeVerificationJsonParser r11 = new com.stripe.android.model.parsers.SourceJsonParser$CodeVerificationJsonParser
                r11.<init>()
                com.stripe.android.model.Source$CodeVerification r7 = r11.parse((org.json.JSONObject) r7)
                goto L_0x0103
            L_0x0102:
                r7 = r8
            L_0x0103:
                boolean r11 = r7 instanceof com.stripe.android.model.Source.CodeVerification
                if (r11 != 0) goto L_0x0108
                goto L_0x00f0
            L_0x0108:
                java.lang.String r11 = "created"
                java.lang.Long r11 = r2.optLong$payments_core_release(r0, r11)
                java.lang.String r2 = "currency"
                java.lang.String r12 = com.stripe.android.model.StripeJsonUtils.optString(r0, r2)
                com.stripe.android.model.Source$Flow$Companion r2 = com.stripe.android.model.Source.Flow.Companion
                java.lang.String r13 = "flow"
                java.lang.String r13 = com.stripe.android.model.StripeJsonUtils.optString(r0, r13)
                com.stripe.android.model.Source$Flow r13 = r2.fromCode(r13)
                java.lang.String r2 = "livemode"
                boolean r2 = r0.optBoolean(r2)
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r2)
                r19 = 0
                boolean r2 = r0.has(r4)
                if (r2 != 0) goto L_0x0135
                r20 = r8
                goto L_0x014d
            L_0x0135:
                org.json.JSONObject r2 = r0.optJSONObject(r4)
                if (r2 == 0) goto L_0x0145
                com.stripe.android.model.parsers.SourceJsonParser$OwnerJsonParser r4 = new com.stripe.android.model.parsers.SourceJsonParser$OwnerJsonParser
                r4.<init>()
                com.stripe.android.model.Source$Owner r2 = r4.parse((org.json.JSONObject) r2)
                goto L_0x0146
            L_0x0145:
                r2 = r8
            L_0x0146:
                boolean r4 = r2 instanceof com.stripe.android.model.Source.Owner
                if (r4 != 0) goto L_0x014b
                r2 = r8
            L_0x014b:
                r20 = r2
            L_0x014d:
                boolean r2 = r0.has(r6)
                if (r2 != 0) goto L_0x0156
                r21 = r8
                goto L_0x016e
            L_0x0156:
                org.json.JSONObject r2 = r0.optJSONObject(r6)
                if (r2 == 0) goto L_0x0166
                com.stripe.android.model.parsers.SourceJsonParser$ReceiverJsonParser r4 = new com.stripe.android.model.parsers.SourceJsonParser$ReceiverJsonParser
                r4.<init>()
                com.stripe.android.model.Source$Receiver r2 = r4.parse((org.json.JSONObject) r2)
                goto L_0x0167
            L_0x0166:
                r2 = r8
            L_0x0167:
                boolean r4 = r2 instanceof com.stripe.android.model.Source.Receiver
                if (r4 != 0) goto L_0x016c
                r2 = r8
            L_0x016c:
                r21 = r2
            L_0x016e:
                boolean r2 = r0.has(r5)
                if (r2 != 0) goto L_0x0177
                r22 = r8
                goto L_0x018f
            L_0x0177:
                org.json.JSONObject r2 = r0.optJSONObject(r5)
                if (r2 == 0) goto L_0x0187
                com.stripe.android.model.parsers.SourceJsonParser$RedirectJsonParser r4 = new com.stripe.android.model.parsers.SourceJsonParser$RedirectJsonParser
                r4.<init>()
                com.stripe.android.model.Source$Redirect r2 = r4.parse((org.json.JSONObject) r2)
                goto L_0x0188
            L_0x0187:
                r2 = r8
            L_0x0188:
                boolean r4 = r2 instanceof com.stripe.android.model.Source.Redirect
                if (r4 != 0) goto L_0x018d
                r2 = r8
            L_0x018d:
                r22 = r2
            L_0x018f:
                java.lang.String r2 = "source_order"
                org.json.JSONObject r2 = r0.optJSONObject(r2)
                if (r2 == 0) goto L_0x01a3
                com.stripe.android.model.parsers.SourceOrderJsonParser r4 = new com.stripe.android.model.parsers.SourceOrderJsonParser
                r4.<init>()
                com.stripe.android.model.SourceOrder r2 = r4.parse((org.json.JSONObject) r2)
                r23 = r2
                goto L_0x01a5
            L_0x01a3:
                r23 = r8
            L_0x01a5:
                java.lang.String r2 = "statement_descriptor"
                java.lang.String r24 = com.stripe.android.model.StripeJsonUtils.optString(r0, r2)
                com.stripe.android.model.Source$Status$Companion r2 = com.stripe.android.model.Source.Status.Companion
                java.lang.String r4 = "status"
                java.lang.String r4 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
                com.stripe.android.model.Source$Status r27 = r2.fromCode(r4)
                com.stripe.android.model.Source$Usage$Companion r2 = com.stripe.android.model.Source.Usage.Companion
                java.lang.String r4 = "usage"
                java.lang.String r4 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
                com.stripe.android.model.Source$Usage r28 = r2.fromCode(r4)
                java.lang.String r2 = "wechat"
                boolean r4 = m0.n.b.i.a(r2, r14)
                if (r4 == 0) goto L_0x01e3
                com.stripe.android.model.parsers.WeChatJsonParser r4 = new com.stripe.android.model.parsers.WeChatJsonParser
                r4.<init>()
                org.json.JSONObject r2 = r0.optJSONObject(r2)
                if (r2 == 0) goto L_0x01d7
                goto L_0x01dc
            L_0x01d7:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
            L_0x01dc:
                com.stripe.android.model.WeChat r2 = r4.parse((org.json.JSONObject) r2)
                r29 = r2
                goto L_0x01e5
            L_0x01e3:
                r29 = r8
            L_0x01e5:
                java.lang.String r2 = "klarna"
                boolean r4 = m0.n.b.i.a(r2, r14)
                if (r4 == 0) goto L_0x0203
                com.stripe.android.model.parsers.SourceJsonParser$KlarnaJsonParser r4 = new com.stripe.android.model.parsers.SourceJsonParser$KlarnaJsonParser
                r4.<init>()
                org.json.JSONObject r0 = r0.optJSONObject(r2)
                if (r0 == 0) goto L_0x01f9
                goto L_0x01fe
            L_0x01f9:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
            L_0x01fe:
                com.stripe.android.model.Source$Klarna r0 = r4.parse((org.json.JSONObject) r0)
                goto L_0x0204
            L_0x0203:
                r0 = r8
            L_0x0204:
                r25 = 256(0x100, float:3.59E-43)
                r26 = 0
                com.stripe.android.model.Source r30 = new com.stripe.android.model.Source
                r2 = r30
                r4 = r9
                r5 = r10
                r6 = r7
                r7 = r11
                r8 = r12
                r9 = r13
                r10 = r18
                r11 = r19
                r12 = r20
                r13 = r21
                r18 = r14
                r14 = r22
                r15 = r27
                r19 = r1
                r20 = r28
                r21 = r29
                r22 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                return r30
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.SourceJsonParser.Companion.fromSourceJson(org.json.JSONObject):com.stripe.android.model.Source");
        }

        private final /* synthetic */ <T extends StripeModel> T optStripeJsonModel(JSONObject jSONObject, String str) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            JSONObject optJSONObject5;
            JSONObject optJSONObject6;
            if (!jSONObject.has(str)) {
                return null;
            }
            switch (str.hashCode()) {
                case -808719889:
                    if (str.equals(SourceJsonParser.FIELD_RECEIVER) && (optJSONObject = jSONObject.optJSONObject(SourceJsonParser.FIELD_RECEIVER)) != null) {
                        new ReceiverJsonParser().parse(optJSONObject);
                        break;
                    }
                case -776144932:
                    if (str.equals(SourceJsonParser.FIELD_REDIRECT) && (optJSONObject2 = jSONObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT)) != null) {
                        new RedirectJsonParser().parse(optJSONObject2);
                        break;
                    }
                case 3046160:
                    if (str.equals("card") && (optJSONObject3 = jSONObject.optJSONObject("card")) != null) {
                        new SourceCardDataJsonParser().parse(optJSONObject3);
                        break;
                    }
                case 106164915:
                    if (str.equals(SourceJsonParser.FIELD_OWNER) && (optJSONObject4 = jSONObject.optJSONObject(SourceJsonParser.FIELD_OWNER)) != null) {
                        new OwnerJsonParser().parse(optJSONObject4);
                        break;
                    }
                case 1615551277:
                    if (str.equals(SourceJsonParser.FIELD_CODE_VERIFICATION) && (optJSONObject5 = jSONObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION)) != null) {
                        new CodeVerificationJsonParser().parse(optJSONObject5);
                        break;
                    }
                case 1636477296:
                    if (str.equals("sepa_debit") && (optJSONObject6 = jSONObject.optJSONObject("sepa_debit")) != null) {
                        new SourceSepaDebitDataJsonParser().parse(optJSONObject6);
                        break;
                    }
            }
            i.i();
            throw null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\b\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Klarna;", "Lorg/json/JSONObject;", "json", "", "key", "", "parseSet", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Set;", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Klarna;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceJsonParser.kt */
    public static final class KlarnaJsonParser implements ModelJsonParser<Source.Klarna> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_CLIENT_TOKEN = "client_token";
        @Deprecated
        private static final String FIELD_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
        @Deprecated
        private static final String FIELD_FIRST_NAME = "first_name";
        @Deprecated
        private static final String FIELD_LAST_NAME = "last_name";
        @Deprecated
        private static final String FIELD_PAYMENT_METHOD_CATEGORIES = "payment_method_categories";
        @Deprecated
        private static final String FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE = "pay_later_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_LATER_ASSET_URLS_STANDARD = "pay_later_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_LATER_NAME = "pay_later_name";
        @Deprecated
        private static final String FIELD_PAY_LATER_REDIRECT_URL = "pay_later_redirect_url";
        @Deprecated
        private static final String FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE = "pay_now_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_NOW_ASSET_URLS_STANDARD = "pay_now_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_NOW_NAME = "pay_now_name";
        @Deprecated
        private static final String FIELD_PAY_NOW_REDIRECT_URL = "pay_now_redirect_url";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE = "pay_over_time_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD = "pay_over_time_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_NAME = "pay_over_time_name";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_REDIRECT_URL = "pay_over_time_redirect_url";
        @Deprecated
        private static final String FIELD_PURCHASE_COUNTRY = "purchase_country";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser$Companion;", "", "", "FIELD_CLIENT_TOKEN", "Ljava/lang/String;", "FIELD_CUSTOM_PAYMENT_METHODS", "FIELD_FIRST_NAME", "FIELD_LAST_NAME", "FIELD_PAYMENT_METHOD_CATEGORIES", "FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_LATER_ASSET_URLS_STANDARD", "FIELD_PAY_LATER_NAME", "FIELD_PAY_LATER_REDIRECT_URL", "FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_NOW_ASSET_URLS_STANDARD", "FIELD_PAY_NOW_NAME", "FIELD_PAY_NOW_REDIRECT_URL", "FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD", "FIELD_PAY_OVER_TIME_NAME", "FIELD_PAY_OVER_TIME_REDIRECT_URL", "FIELD_PURCHASE_COUNTRY", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        private final Set<String> parseSet(JSONObject jSONObject, String str) {
            String optString = StripeJsonUtils.optString(jSONObject, str);
            Set<String> D0 = optString != null ? g.D0(StringsKt__IndentKt.E(optString, new String[]{InstabugDbContract.COMMA_SEP}, false, 0, 6)) : null;
            return D0 != null ? D0 : EmptySet.c;
        }

        public Source.Klarna parse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            i.e(jSONObject2, "json");
            Source.Klarna klarna = r3;
            Source.Klarna klarna2 = new Source.Klarna(StripeJsonUtils.optString(jSONObject2, FIELD_FIRST_NAME), StripeJsonUtils.optString(jSONObject2, FIELD_LAST_NAME), StripeJsonUtils.optString(jSONObject2, FIELD_PURCHASE_COUNTRY), StripeJsonUtils.optString(jSONObject2, FIELD_CLIENT_TOKEN), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_NOW_ASSET_URLS_STANDARD), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_NOW_NAME), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_NOW_REDIRECT_URL), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_LATER_ASSET_URLS_STANDARD), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_LATER_NAME), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_LATER_REDIRECT_URL), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_OVER_TIME_NAME), StripeJsonUtils.optString(jSONObject2, FIELD_PAY_OVER_TIME_REDIRECT_URL), parseSet(jSONObject2, FIELD_PAYMENT_METHOD_CATEGORIES), parseSet(jSONObject2, FIELD_CUSTOM_PAYMENT_METHODS));
            return klarna;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Owner;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceJsonParser.kt */
    public static final class OwnerJsonParser implements ModelJsonParser<Source.Owner> {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceJsonParser.kt */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Receiver;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceJsonParser.kt */
    public static final class ReceiverJsonParser implements ModelJsonParser<Source.Receiver> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_AMOUNT_CHARGED = "amount_charged";
        @Deprecated
        private static final String FIELD_AMOUNT_RECEIVED = "amount_received";
        @Deprecated
        private static final String FIELD_AMOUNT_RETURNED = "amount_returned";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_AMOUNT_CHARGED", "FIELD_AMOUNT_RECEIVED", "FIELD_AMOUNT_RETURNED", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Source.Receiver parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new Source.Receiver(StripeJsonUtils.optString(jSONObject, "address"), jSONObject.optLong(FIELD_AMOUNT_CHARGED), jSONObject.optLong(FIELD_AMOUNT_RECEIVED), jSONObject.optLong(FIELD_AMOUNT_RETURNED));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Redirect;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceJsonParser.kt */
    public static final class RedirectJsonParser implements ModelJsonParser<Source.Redirect> {
        public static final Companion Companion = new Companion((f) null);
        private static final String FIELD_RETURN_URL = "return_url";
        private static final String FIELD_STATUS = "status";
        private static final String FIELD_URL = "url";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser$Companion;", "", "", "FIELD_RETURN_URL", "Ljava/lang/String;", "FIELD_STATUS", "FIELD_URL", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Source.Redirect parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new Source.Redirect(StripeJsonUtils.optString(jSONObject, "return_url"), Source.Redirect.Status.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "status")), StripeJsonUtils.optString(jSONObject, "url"));
        }
    }

    public Source parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        String optString = jSONObject.optString(FIELD_OBJECT);
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -896505829) {
                if (hashCode == 3046160 && optString.equals("card")) {
                    return Companion.fromCardJson(jSONObject);
                }
            } else if (optString.equals("source")) {
                return Companion.fromSourceJson(jSONObject);
            }
        }
        return null;
    }
}
