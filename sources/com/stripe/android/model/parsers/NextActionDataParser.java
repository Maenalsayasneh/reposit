package com.stripe.android.model.parsers;

import android.net.Uri;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.WeChat;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\n\u000b\t\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData;", "<init>", "()V", "Companion", "AlipayRedirectParser", "BlikAuthorizeParser", "DisplayOxxoDetailsJsonParser", "RedirectToUrlParser", "SdkDataJsonParser", "WeChatPayRedirectParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: NextActionDataParser.kt */
public final class NextActionDataParser implements ModelJsonParser<StripeIntent.NextActionData> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_NEXT_ACTION_TYPE = "type";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class AlipayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.AlipayRedirect> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        public static final String FIELD_NATIVE_DATA = "native_data";
        @Deprecated
        public static final String FIELD_RETURN_URL = "return_url";
        @Deprecated
        public static final String FIELD_URL = "url";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser$Companion;", "", "", "FIELD_NATIVE_DATA", "Ljava/lang/String;", "FIELD_RETURN_URL", "FIELD_URL", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: NextActionDataParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public StripeIntent.NextActionData.AlipayRedirect parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            String string = jSONObject.getString(FIELD_NATIVE_DATA);
            i.d(string, "json.getString(FIELD_NATIVE_DATA)");
            String string2 = jSONObject.getString("url");
            i.d(string2, "json.getString(FIELD_URL)");
            return new StripeIntent.NextActionData.AlipayRedirect(string, string2, StripeJsonUtils.optString(jSONObject, "return_url"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class BlikAuthorizeParser implements ModelJsonParser<StripeIntent.NextActionData.BlikAuthorize> {
        public StripeIntent.NextActionData.BlikAuthorize parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return StripeIntent.NextActionData.BlikAuthorize.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;", "", "", "FIELD_NEXT_ACTION_TYPE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class DisplayOxxoDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayOxxoDetails> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_EXPIRES_AFTER = "expires_after";
        @Deprecated
        private static final String FIELD_HOSTED_VOUCHER_URL = "hosted_voucher_url";
        @Deprecated
        private static final String FIELD_NUMBER = "number";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser$Companion;", "", "", "FIELD_EXPIRES_AFTER", "Ljava/lang/String;", "FIELD_HOSTED_VOUCHER_URL", "FIELD_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: NextActionDataParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public StripeIntent.NextActionData.DisplayOxxoDetails parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new StripeIntent.NextActionData.DisplayOxxoDetails(jSONObject.optInt(FIELD_EXPIRES_AFTER), StripeJsonUtils.optString(jSONObject, FIELD_NUMBER), StripeJsonUtils.optString(jSONObject, FIELD_HOSTED_VOUCHER_URL));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class RedirectToUrlParser implements ModelJsonParser<StripeIntent.NextActionData.RedirectToUrl> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        public static final String FIELD_RETURN_URL = "return_url";
        @Deprecated
        public static final String FIELD_URL = "url";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser$Companion;", "", "", "FIELD_RETURN_URL", "Ljava/lang/String;", "FIELD_URL", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: NextActionDataParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public StripeIntent.NextActionData.RedirectToUrl parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            if (!jSONObject.has("url")) {
                return null;
            }
            Uri parse = Uri.parse(jSONObject.getString("url"));
            i.d(parse, "Uri.parse(json.getString(FIELD_URL))");
            return new StripeIntent.NextActionData.RedirectToUrl(parse, jSONObject.optString("return_url"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lorg/json/JSONObject;", "json", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "parseDirectoryServerEncryption", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class SdkDataJsonParser implements ModelJsonParser<StripeIntent.NextActionData.SdkData> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_CERTIFICATE = "certificate";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_ENCRYPTION = "directory_server_encryption";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_ID = "directory_server_id";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_NAME = "directory_server_name";
        @Deprecated
        private static final String FIELD_KEY_ID = "key_id";
        @Deprecated
        private static final String FIELD_ROOT_CAS = "root_certificate_authorities";
        @Deprecated
        private static final String FIELD_SERVER_TRANSACTION_ID = "server_transaction_id";
        @Deprecated
        private static final String FIELD_STRIPE_JS = "stripe_js";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_2_SOURCE = "three_d_secure_2_source";
        @Deprecated
        private static final String FIELD_TYPE = "type";
        @Deprecated
        private static final String TYPE_3DS1 = "three_d_secure_redirect";
        @Deprecated
        private static final String TYPE_3DS2 = "stripe_3ds2_fingerprint";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser$Companion;", "", "", "FIELD_CERTIFICATE", "Ljava/lang/String;", "FIELD_DIRECTORY_SERVER_ENCRYPTION", "FIELD_DIRECTORY_SERVER_ID", "FIELD_DIRECTORY_SERVER_NAME", "FIELD_KEY_ID", "FIELD_ROOT_CAS", "FIELD_SERVER_TRANSACTION_ID", "FIELD_STRIPE_JS", "FIELD_THREE_D_SECURE_2_SOURCE", "FIELD_TYPE", "TYPE_3DS1", "TYPE_3DS2", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: NextActionDataParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            if (r1 != null) goto L_0x002c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption parseDirectoryServerEncryption(org.json.JSONObject r6) {
            /*
                r5 = this;
                com.stripe.android.model.StripeJsonUtils r0 = com.stripe.android.model.StripeJsonUtils.INSTANCE
                java.lang.String r1 = "root_certificate_authorities"
                org.json.JSONArray r1 = r6.optJSONArray(r1)
                java.util.List r0 = r0.jsonArrayToList$payments_core_release(r1)
                if (r0 == 0) goto L_0x002a
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
                java.util.Iterator r0 = r0.iterator()
            L_0x0014:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0027
                java.lang.Object r2 = r0.next()
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L_0x0014
                java.util.List r1 = m0.j.g.a0(r1, r2)
                goto L_0x0014
            L_0x0027:
                if (r1 == 0) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            L_0x002c:
                com.stripe.android.model.StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption r0 = new com.stripe.android.model.StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption
                java.lang.String r2 = "directory_server_id"
                java.lang.String r2 = r6.optString(r2)
                java.lang.String r3 = "json.optString(FIELD_DIRECTORY_SERVER_ID)"
                m0.n.b.i.d(r2, r3)
                java.lang.String r3 = "certificate"
                java.lang.String r3 = r6.optString(r3)
                java.lang.String r4 = "json.optString(FIELD_CERTIFICATE)"
                m0.n.b.i.d(r3, r4)
                java.lang.String r4 = "key_id"
                java.lang.String r6 = r6.optString(r4)
                r0.<init>(r2, r3, r1, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.NextActionDataParser.SdkDataJsonParser.parseDirectoryServerEncryption(org.json.JSONObject):com.stripe.android.model.StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption");
        }

        public StripeIntent.NextActionData.SdkData parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            String optString = StripeJsonUtils.optString(jSONObject, "type");
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -60303033) {
                    if (hashCode == 1383888232 && optString.equals(TYPE_3DS1)) {
                        String optString2 = jSONObject.optString(FIELD_STRIPE_JS);
                        i.d(optString2, "json.optString(FIELD_STRIPE_JS)");
                        return new StripeIntent.NextActionData.SdkData.Use3DS1(optString2);
                    }
                } else if (optString.equals(TYPE_3DS2)) {
                    String optString3 = jSONObject.optString(FIELD_THREE_D_SECURE_2_SOURCE);
                    i.d(optString3, "json.optString(FIELD_THREE_D_SECURE_2_SOURCE)");
                    String optString4 = jSONObject.optString(FIELD_DIRECTORY_SERVER_NAME);
                    i.d(optString4, "json.optString(FIELD_DIRECTORY_SERVER_NAME)");
                    String optString5 = jSONObject.optString(FIELD_SERVER_TRANSACTION_ID);
                    i.d(optString5, "json.optString(FIELD_SERVER_TRANSACTION_ID)");
                    JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_DIRECTORY_SERVER_ENCRYPTION);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    return new StripeIntent.NextActionData.SdkData.Use3DS2(optString3, optString4, optString5, parseDirectoryServerEncryption(optJSONObject));
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NextActionDataParser.kt */
    public static final class WeChatPayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.WeChatPayRedirect> {
        @Deprecated
        private static final String APP_ID = "app_id";
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String NONCE_STR = "nonce_str";
        @Deprecated
        private static final String PACKAGE = "package";
        @Deprecated
        private static final String PARTNER_ID = "partner_id";
        @Deprecated
        private static final String PREPAY_ID = "prepay_id";
        @Deprecated
        private static final String SIGN = "sign";
        @Deprecated
        private static final String TIMESTAMP = "timestamp";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser$Companion;", "", "", "APP_ID", "Ljava/lang/String;", "NONCE_STR", "PACKAGE", "PARTNER_ID", "PREPAY_ID", "SIGN", "TIMESTAMP", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: NextActionDataParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public StripeIntent.NextActionData.WeChatPayRedirect parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new StripeIntent.NextActionData.WeChatPayRedirect(new WeChat((String) null, jSONObject.optString("app_id"), jSONObject.optString(NONCE_STR), jSONObject.optString(PACKAGE), jSONObject.optString(PARTNER_ID), jSONObject.optString(PREPAY_ID), jSONObject.optString(SIGN), jSONObject.optString("timestamp"), (String) null, 257, (f) null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            StripeIntent.NextActionType.values();
            int[] iArr = new int[6];
            $EnumSwitchMapping$0 = iArr;
            iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 2;
            iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 3;
            iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 4;
            iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 5;
            iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 6;
        }
    }

    public StripeIntent.NextActionData parse(JSONObject jSONObject) {
        ModelJsonParser modelJsonParser;
        i.e(jSONObject, "json");
        StripeIntent.NextActionType fromCode$payments_core_release = StripeIntent.NextActionType.Companion.fromCode$payments_core_release(jSONObject.optString("type"));
        if (fromCode$payments_core_release == null) {
            return null;
        }
        int ordinal = fromCode$payments_core_release.ordinal();
        if (ordinal == 0) {
            modelJsonParser = new RedirectToUrlParser();
        } else if (ordinal == 1) {
            modelJsonParser = new SdkDataJsonParser();
        } else if (ordinal == 2) {
            modelJsonParser = new DisplayOxxoDetailsJsonParser();
        } else if (ordinal == 3) {
            modelJsonParser = new AlipayRedirectParser();
        } else if (ordinal == 4) {
            modelJsonParser = new BlikAuthorizeParser();
        } else if (ordinal != 5) {
            return null;
        } else {
            modelJsonParser = new WeChatPayRedirectParser();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(fromCode$payments_core_release.getCode());
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return (StripeIntent.NextActionData) modelJsonParser.parse(optJSONObject);
    }
}
