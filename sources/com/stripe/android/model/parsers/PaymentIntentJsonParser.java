package com.stripe.android.model.parsers;

import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent;", "<init>", "()V", "Companion", "ErrorJsonParser", "ShippingJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentIntentJsonParser.kt */
public final class PaymentIntentJsonParser implements ModelJsonParser<PaymentIntent> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CANCELED_AT = "canceled_at";
    @Deprecated
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @Deprecated
    private static final String FIELD_CAPTURE_METHOD = "capture_method";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CONFIRMATION_METHOD = "confirmation_method";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST_PAYMENT_ERROR = "last_payment_error";
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
    private static final String FIELD_RECEIPT_EMAIL = "receipt_email";
    @Deprecated
    private static final String FIELD_SETUP_FUTURE_USAGE = "setup_future_usage";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String OBJECT_TYPE = "payment_intent";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$Companion;", "", "", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CANCELED_AT", "FIELD_CANCELLATION_REASON", "FIELD_CAPTURE_METHOD", "FIELD_CLIENT_SECRET", "FIELD_CONFIRMATION_METHOD", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_PAYMENT_ERROR", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_RECEIPT_EMAIL", "FIELD_SETUP_FUTURE_USAGE", "FIELD_SHIPPING", "FIELD_STATUS", "OBJECT_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntentJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Error;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent$Error;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntentJsonParser.kt */
    public static final class ErrorJsonParser implements ModelJsonParser<PaymentIntent.Error> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_CHARGE = "charge";
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser$Companion;", "", "", "FIELD_CHARGE", "Ljava/lang/String;", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntentJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentIntent.Error parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            String optString = StripeJsonUtils.optString(jSONObject, FIELD_CHARGE);
            String optString2 = StripeJsonUtils.optString(jSONObject, "code");
            String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_DECLINE_CODE);
            String optString4 = StripeJsonUtils.optString(jSONObject, FIELD_DOC_URL);
            String optString5 = StripeJsonUtils.optString(jSONObject, "message");
            String optString6 = StripeJsonUtils.optString(jSONObject, FIELD_PARAM);
            JSONObject optJSONObject = jSONObject.optJSONObject("payment_method");
            return new PaymentIntent.Error(optString, optString2, optString3, optString4, optString5, optString6, optJSONObject != null ? new PaymentMethodJsonParser().parse(optJSONObject) : null, PaymentIntent.Error.Type.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "type")));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent$Shipping;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntentJsonParser.kt */
    public static final class ShippingJsonParser implements ModelJsonParser<PaymentIntent.Shipping> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_CARRIER = "carrier";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";
        @Deprecated
        private static final String FIELD_TRACKING_NUMBER = "tracking_number";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntentJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentIntent.Shipping parse(JSONObject jSONObject) {
            Address address;
            JSONObject jSONObject2 = jSONObject;
            i.e(jSONObject2, "json");
            JSONObject optJSONObject = jSONObject2.optJSONObject("address");
            if (optJSONObject == null || (address = new AddressJsonParser().parse(optJSONObject)) == null) {
                address = new Address((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (f) null);
            }
            return new PaymentIntent.Shipping(address, StripeJsonUtils.optString(jSONObject2, "carrier"), StripeJsonUtils.optString(jSONObject2, "name"), StripeJsonUtils.optString(jSONObject2, "phone"), StripeJsonUtils.optString(jSONObject2, FIELD_TRACKING_NUMBER));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.model.PaymentIntent parse(org.json.JSONObject r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "json"
            m0.n.b.i.e(r0, r1)
            java.lang.String r1 = "object"
            java.lang.String r1 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            java.lang.String r2 = "payment_intent"
            boolean r1 = m0.n.b.i.a(r2, r1)
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L_0x0019
            return r3
        L_0x0019:
            java.lang.String r1 = "id"
            java.lang.String r5 = com.stripe.android.model.StripeJsonUtils.optString(r0, r1)
            com.stripe.android.model.parsers.ModelJsonParser$Companion r1 = com.stripe.android.model.parsers.ModelJsonParser.Companion
            java.lang.String r4 = "payment_method_types"
            org.json.JSONArray r4 = r0.optJSONArray(r4)
            java.util.List r6 = r1.jsonArrayToList$payments_core_release(r4)
            com.stripe.android.model.StripeJsonUtils r1 = com.stripe.android.model.StripeJsonUtils.INSTANCE
            java.lang.String r4 = "amount"
            java.lang.Long r7 = r1.optLong$payments_core_release(r0, r4)
            java.lang.String r4 = "canceled_at"
            long r8 = r0.optLong(r4)
            com.stripe.android.model.PaymentIntent$CancellationReason$Companion r4 = com.stripe.android.model.PaymentIntent.CancellationReason.Companion
            java.lang.String r10 = "cancellation_reason"
            java.lang.String r10 = com.stripe.android.model.StripeJsonUtils.optString(r0, r10)
            com.stripe.android.model.PaymentIntent$CancellationReason r10 = r4.fromCode(r10)
            com.stripe.android.model.PaymentIntent$CaptureMethod$Companion r4 = com.stripe.android.model.PaymentIntent.CaptureMethod.Companion
            java.lang.String r11 = "capture_method"
            java.lang.String r11 = com.stripe.android.model.StripeJsonUtils.optString(r0, r11)
            com.stripe.android.model.PaymentIntent$CaptureMethod r11 = r4.fromCode(r11)
            java.lang.String r4 = "client_secret"
            java.lang.String r12 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
            com.stripe.android.model.PaymentIntent$ConfirmationMethod$Companion r4 = com.stripe.android.model.PaymentIntent.ConfirmationMethod.Companion
            java.lang.String r13 = "confirmation_method"
            java.lang.String r13 = com.stripe.android.model.StripeJsonUtils.optString(r0, r13)
            com.stripe.android.model.PaymentIntent$ConfirmationMethod r13 = r4.fromCode(r13)
            java.lang.String r4 = "created"
            long r14 = r0.optLong(r4)
            java.lang.String r4 = "currency"
            java.lang.String r16 = com.stripe.android.model.StripeJsonUtils.optCurrency$payments_core_release(r0, r4)
            java.lang.String r4 = "description"
            java.lang.String r17 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
            java.lang.String r4 = "livemode"
            boolean r18 = r1.optBoolean$payments_core_release(r0, r4)
            java.lang.String r4 = "payment_method"
            org.json.JSONObject r2 = r0.optJSONObject(r4)
            if (r2 == 0) goto L_0x008d
            com.stripe.android.model.parsers.PaymentMethodJsonParser r3 = new com.stripe.android.model.parsers.PaymentMethodJsonParser
            r3.<init>()
            com.stripe.android.model.PaymentMethod r2 = r3.parse((org.json.JSONObject) r2)
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            java.lang.String r3 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
            if (r2 != 0) goto L_0x0097
            r19 = 1
            goto L_0x009a
        L_0x0097:
            r4 = 0
            r19 = r4
        L_0x009a:
            if (r19 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
        L_0x00a0:
            r21 = r3
            goto L_0x00aa
        L_0x00a3:
            if (r2 == 0) goto L_0x00a8
            java.lang.String r3 = r2.id
            goto L_0x00a0
        L_0x00a8:
            r21 = 0
        L_0x00aa:
            java.lang.String r3 = "receipt_email"
            java.lang.String r22 = com.stripe.android.model.StripeJsonUtils.optString(r0, r3)
            com.stripe.android.model.StripeIntent$Status$Companion r3 = com.stripe.android.model.StripeIntent.Status.Companion
            java.lang.String r4 = "status"
            java.lang.String r4 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
            com.stripe.android.model.StripeIntent$Status r23 = r3.fromCode$payments_core_release(r4)
            com.stripe.android.model.StripeIntent$Usage$Companion r3 = com.stripe.android.model.StripeIntent.Usage.Companion
            java.lang.String r4 = "setup_future_usage"
            java.lang.String r4 = com.stripe.android.model.StripeJsonUtils.optString(r0, r4)
            com.stripe.android.model.StripeIntent$Usage r24 = r3.fromCode$payments_core_release(r4)
            java.lang.String r3 = "next_action"
            java.util.Map r19 = r1.optMap$payments_core_release(r0, r3)
            java.lang.String r1 = "last_payment_error"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 == 0) goto L_0x00e2
            com.stripe.android.model.parsers.PaymentIntentJsonParser$ErrorJsonParser r4 = new com.stripe.android.model.parsers.PaymentIntentJsonParser$ErrorJsonParser
            r4.<init>()
            com.stripe.android.model.PaymentIntent$Error r1 = r4.parse((org.json.JSONObject) r1)
            r25 = r1
            goto L_0x00e4
        L_0x00e2:
            r25 = 0
        L_0x00e4:
            java.lang.String r1 = "shipping"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 == 0) goto L_0x00f8
            com.stripe.android.model.parsers.PaymentIntentJsonParser$ShippingJsonParser r4 = new com.stripe.android.model.parsers.PaymentIntentJsonParser$ShippingJsonParser
            r4.<init>()
            com.stripe.android.model.PaymentIntent$Shipping r1 = r4.parse((org.json.JSONObject) r1)
            r26 = r1
            goto L_0x00fa
        L_0x00f8:
            r26 = 0
        L_0x00fa:
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            if (r0 == 0) goto L_0x010c
            com.stripe.android.model.parsers.NextActionDataParser r1 = new com.stripe.android.model.parsers.NextActionDataParser
            r1.<init>()
            com.stripe.android.model.StripeIntent$NextActionData r3 = r1.parse((org.json.JSONObject) r0)
            r27 = r3
            goto L_0x010e
        L_0x010c:
            r27 = 0
        L_0x010e:
            com.stripe.android.model.PaymentIntent r0 = new com.stripe.android.model.PaymentIntent
            r4 = r0
            r20 = r2
            r4.<init>(r5, r6, r7, r8, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.PaymentIntentJsonParser.parse(org.json.JSONObject):com.stripe.android.model.PaymentIntent");
    }
}
