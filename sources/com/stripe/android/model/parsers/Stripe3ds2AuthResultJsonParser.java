package com.stripe.android.model.parsers;

import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeJsonUtils;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\t\u000b\fB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Stripe3ds2AuthResult;", "<init>", "()V", "Companion", "AresJsonParser", "MessageExtensionJsonParser", "ThreeDS2ErrorJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2AuthResultJsonParser.kt */
public final class Stripe3ds2AuthResultJsonParser implements ModelJsonParser<Stripe3ds2AuthResult> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_ARES = "ares";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CREQ = "creq";
    @Deprecated
    private static final String FIELD_ERROR = "error";
    @Deprecated
    private static final String FIELD_FALLBACK_REDIRECT_URL = "fallback_redirect_url";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_SOURCE = "source";
    @Deprecated
    private static final String FIELD_STATE = "state";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    public static final class AresJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.Ares> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ACS_CHALLENGE_MANDATED = "acsChallengeMandated";
        @Deprecated
        private static final String FIELD_ACS_SIGNED_CONTENT = "acsSignedContent";
        @Deprecated
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        @Deprecated
        private static final String FIELD_ACS_URL = "acsURL";
        @Deprecated
        private static final String FIELD_AUTHENTICATION_TYPE = "authenticationType";
        @Deprecated
        private static final String FIELD_CARDHOLDER_INFO = "cardholderInfo";
        @Deprecated
        private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
        @Deprecated
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        @Deprecated
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        @Deprecated
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        @Deprecated
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";
        @Deprecated
        private static final String FIELD_TRANS_STATUS = "transStatus";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser$Companion;", "", "", "FIELD_ACS_CHALLENGE_MANDATED", "Ljava/lang/String;", "FIELD_ACS_SIGNED_CONTENT", "FIELD_ACS_TRANS_ID", "FIELD_ACS_URL", "FIELD_AUTHENTICATION_TYPE", "FIELD_CARDHOLDER_INFO", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "FIELD_TRANS_STATUS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Stripe3ds2AuthResult.Ares parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            String optString = StripeJsonUtils.optString(jSONObject, "threeDSServerTransID");
            String optString2 = StripeJsonUtils.optString(jSONObject, FIELD_ACS_CHALLENGE_MANDATED);
            String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_ACS_SIGNED_CONTENT);
            String string = jSONObject.getString("acsTransID");
            String optString4 = StripeJsonUtils.optString(jSONObject, "acsURL");
            String optString5 = StripeJsonUtils.optString(jSONObject, FIELD_AUTHENTICATION_TYPE);
            String optString6 = StripeJsonUtils.optString(jSONObject, FIELD_CARDHOLDER_INFO);
            String string2 = jSONObject.getString("messageType");
            String string3 = jSONObject.getString("messageVersion");
            String optString7 = StripeJsonUtils.optString(jSONObject, "sdkTransID");
            String optString8 = StripeJsonUtils.optString(jSONObject, FIELD_TRANS_STATUS);
            JSONArray optJSONArray = jSONObject.optJSONArray(FIELD_MESSAGE_EXTENSION);
            return new Stripe3ds2AuthResult.Ares(optString, optString2, optString3, string, optString4, optString5, optString6, optJSONArray != null ? new MessageExtensionJsonParser().parse(optJSONArray) : null, string2, string3, optString7, optString8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$Companion;", "", "", "FIELD_ARES", "Ljava/lang/String;", "FIELD_CREATED", "FIELD_CREQ", "FIELD_ERROR", "FIELD_FALLBACK_REDIRECT_URL", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_SOURCE", "FIELD_STATE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "Lorg/json/JSONArray;", "jsonArray", "", "parse", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    public static final class MessageExtensionJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.MessageExtension> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
        @Deprecated
        private static final String FIELD_DATA = "data";
        @Deprecated
        private static final String FIELD_ID = "id";
        @Deprecated
        private static final String FIELD_NAME = "name";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser$Companion;", "", "", "FIELD_CRITICALITY_INDICATOR", "Ljava/lang/String;", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public final List<Stripe3ds2AuthResult.MessageExtension> parse(JSONArray jSONArray) {
            i.e(jSONArray, "jsonArray");
            e f = m0.q.i.f(0, jSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList<>();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((o) it).a());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
            for (JSONObject parse : arrayList) {
                arrayList2.add(parse(parse));
            }
            return arrayList2;
        }

        public Stripe3ds2AuthResult.MessageExtension parse(JSONObject jSONObject) {
            Map map;
            i.e(jSONObject, "json");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                JSONArray names = optJSONObject.names();
                if (names == null) {
                    names = new JSONArray();
                }
                e f = m0.q.i.f(0, names.length());
                ArrayList<String> arrayList = new ArrayList<>(h.K(f, 10));
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(names.getString(((o) it).a()));
                }
                ArrayList<Map> arrayList2 = new ArrayList<>(h.K(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(h.S2(new Pair(str, optJSONObject.getString(str))));
                }
                map = g.o();
                for (Map b0 : arrayList2) {
                    map = g.b0(map, b0);
                }
            } else {
                map = g.o();
            }
            return new Stripe3ds2AuthResult.MessageExtension(StripeJsonUtils.optString(jSONObject, "name"), jSONObject.optBoolean("criticalityIndicator"), StripeJsonUtils.optString(jSONObject, "id"), g.y0(map));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    public static final class ThreeDS2ErrorJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.ThreeDS2Error> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        @Deprecated
        private static final String FIELD_DS_TRANS_ID = "dsTransID";
        @Deprecated
        private static final String FIELD_ERROR_CODE = "errorCode";
        @Deprecated
        private static final String FIELD_ERROR_COMPONENT = "errorComponent";
        @Deprecated
        private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
        @Deprecated
        private static final String FIELD_ERROR_DETAIL = "errorDetail";
        @Deprecated
        private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
        @Deprecated
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        @Deprecated
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        @Deprecated
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        @Deprecated
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser$Companion;", "", "", "FIELD_ACS_TRANS_ID", "Ljava/lang/String;", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Stripe3ds2AuthResult.ThreeDS2Error parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new Stripe3ds2AuthResult.ThreeDS2Error(jSONObject.getString("threeDSServerTransID"), StripeJsonUtils.optString(jSONObject, "acsTransID"), StripeJsonUtils.optString(jSONObject, FIELD_DS_TRANS_ID), jSONObject.getString(FIELD_ERROR_CODE), jSONObject.getString(FIELD_ERROR_COMPONENT), jSONObject.getString(FIELD_ERROR_DESCRIPTION), jSONObject.getString(FIELD_ERROR_DETAIL), StripeJsonUtils.optString(jSONObject, FIELD_ERROR_MESSAGE_TYPE), jSONObject.getString("messageType"), jSONObject.getString("messageVersion"), StripeJsonUtils.optString(jSONObject, "sdkTransID"));
        }
    }

    public Stripe3ds2AuthResult parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        String string = jSONObject.getString("id");
        Long valueOf = Long.valueOf(jSONObject.getLong(FIELD_CREATED));
        boolean z = jSONObject.getBoolean(FIELD_LIVEMODE);
        String string2 = jSONObject.getString("source");
        String optString = jSONObject.optString("state");
        JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_ARES);
        Stripe3ds2AuthResult.Ares parse = optJSONObject != null ? new AresJsonParser().parse(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_ERROR);
        return new Stripe3ds2AuthResult(string, parse, valueOf, string2, optString, z, optJSONObject2 != null ? new ThreeDS2ErrorJsonParser().parse(optJSONObject2) : null, StripeJsonUtils.optString(jSONObject, FIELD_FALLBACK_REDIRECT_URL), StripeJsonUtils.optString(jSONObject, FIELD_CREQ));
    }
}
