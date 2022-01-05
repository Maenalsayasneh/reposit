package com.stripe.android.model.parsers;

import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.wallets.Wallet;
import i0.j.f.p.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b\n\u000b\f\r\t\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;", "<init>", "()V", "Companion", "AuBecsDebitJsonParser", "BacsDebitJsonParser", "BillingDetails", "CardJsonParser", "FpxJsonParser", "IdealJsonParser", "NetbankingJsonParser", "SepaDebitJsonParser", "SofortJsonParser", "UpiJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodJsonParser.kt */
public final class PaymentMethodJsonParser implements ModelJsonParser<PaymentMethod> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_BILLING_DETAILS = "billing_details";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CUSTOMER = "customer";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class AuBecsDebitJsonParser implements ModelJsonParser<PaymentMethod.AuBecsDebit> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_BSB_NUMBER = "bsb_number";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser$Companion;", "", "", "FIELD_BSB_NUMBER", "Ljava/lang/String;", "FIELD_FINGERPRINT", "FIELD_LAST4", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.AuBecsDebit parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.AuBecsDebit(StripeJsonUtils.optString(jSONObject, FIELD_BSB_NUMBER), StripeJsonUtils.optString(jSONObject, FIELD_FINGERPRINT), StripeJsonUtils.optString(jSONObject, FIELD_LAST4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class BacsDebitJsonParser implements ModelJsonParser<PaymentMethod.BacsDebit> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_SORT_CODE = "sort_code";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser$Companion;", "", "", "FIELD_FINGERPRINT", "Ljava/lang/String;", "FIELD_LAST4", "FIELD_SORT_CODE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.BacsDebit parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.BacsDebit(StripeJsonUtils.optString(jSONObject, FIELD_FINGERPRINT), StripeJsonUtils.optString(jSONObject, FIELD_LAST4), StripeJsonUtils.optString(jSONObject, FIELD_SORT_CODE));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class BillingDetails implements ModelJsonParser<PaymentMethod.BillingDetails> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_EMAIL = "email";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.BillingDetails parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            JSONObject optJSONObject = jSONObject.optJSONObject("address");
            return new PaymentMethod.BillingDetails(optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null, StripeJsonUtils.optString(jSONObject, "email"), StripeJsonUtils.optString(jSONObject, "name"), StripeJsonUtils.optString(jSONObject, "phone"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\t\u000b\fB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Card;", "<init>", "()V", "Companion", "ChecksJsonParser", "NetworksJsonParser", "ThreeDSecureUsageJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class CardJsonParser implements ModelJsonParser<PaymentMethod.Card> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_BRAND = "brand";
        @Deprecated
        private static final String FIELD_CHECKS = "checks";
        @Deprecated
        private static final String FIELD_COUNTRY = "country";
        @Deprecated
        private static final String FIELD_EXP_MONTH = "exp_month";
        @Deprecated
        private static final String FIELD_EXP_YEAR = "exp_year";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_FUNDING = "funding";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_NETWORKS = "networks";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_USAGE = "three_d_secure_usage";
        @Deprecated
        private static final String FIELD_WALLET = "wallet";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class ChecksJsonParser implements ModelJsonParser<PaymentMethod.Card.Checks> {
            private static final Companion Companion = new Companion((f) null);
            @Deprecated
            private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
            @Deprecated
            private static final String FIELD_ADDRESS_POSTAL_CODE_CHECK = "address_postal_code_check";
            @Deprecated
            private static final String FIELD_CVC_CHECK = "cvc_check";

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser$Companion;", "", "", "FIELD_ADDRESS_LINE1_CHECK", "Ljava/lang/String;", "FIELD_ADDRESS_POSTAL_CODE_CHECK", "FIELD_CVC_CHECK", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: PaymentMethodJsonParser.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            public PaymentMethod.Card.Checks parse(JSONObject jSONObject) {
                i.e(jSONObject, "json");
                return new PaymentMethod.Card.Checks(StripeJsonUtils.optString(jSONObject, FIELD_ADDRESS_LINE1_CHECK), StripeJsonUtils.optString(jSONObject, FIELD_ADDRESS_POSTAL_CODE_CHECK), StripeJsonUtils.optString(jSONObject, FIELD_CVC_CHECK));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$Companion;", "", "", "FIELD_BRAND", "Ljava/lang/String;", "FIELD_CHECKS", "FIELD_COUNTRY", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_THREE_D_SECURE_USAGE", "FIELD_WALLET", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class NetworksJsonParser implements ModelJsonParser<PaymentMethod.Card.Networks> {
            private static final Companion Companion = new Companion((f) null);
            @Deprecated
            private static final String FIELD_AVAIABLE = "available";
            @Deprecated
            private static final String FIELD_PREFERRED = "preferred";
            @Deprecated
            private static final String FIELD_SELECTION_MANDATORY = "selection_mandatory";

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser$Companion;", "", "", "FIELD_AVAIABLE", "Ljava/lang/String;", "FIELD_PREFERRED", "FIELD_SELECTION_MANDATORY", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: PaymentMethodJsonParser.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            public PaymentMethod.Card.Networks parse(JSONObject jSONObject) {
                i.e(jSONObject, "json");
                Iterable<Object> jsonArrayToList$payments_core_release = StripeJsonUtils.INSTANCE.jsonArrayToList$payments_core_release(jSONObject.optJSONArray("available"));
                if (jsonArrayToList$payments_core_release == null) {
                    jsonArrayToList$payments_core_release = EmptyList.c;
                }
                ArrayList arrayList = new ArrayList(h.K(jsonArrayToList$payments_core_release, 10));
                for (Object obj : jsonArrayToList$payments_core_release) {
                    arrayList.add(obj.toString());
                }
                return new PaymentMethod.Card.Networks(g.D0(arrayList), StripeJsonUtils.INSTANCE.optBoolean$payments_core_release(jSONObject, FIELD_SELECTION_MANDATORY), StripeJsonUtils.optString(jSONObject, FIELD_PREFERRED));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class ThreeDSecureUsageJsonParser implements ModelJsonParser<PaymentMethod.Card.ThreeDSecureUsage> {
            private static final Companion Companion = new Companion((f) null);
            @Deprecated
            private static final String FIELD_IS_SUPPORTED = "supported";

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser$Companion;", "", "", "FIELD_IS_SUPPORTED", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: PaymentMethodJsonParser.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            public PaymentMethod.Card.ThreeDSecureUsage parse(JSONObject jSONObject) {
                i.e(jSONObject, "json");
                return new PaymentMethod.Card.ThreeDSecureUsage(StripeJsonUtils.INSTANCE.optBoolean$payments_core_release(jSONObject, FIELD_IS_SUPPORTED));
            }
        }

        public PaymentMethod.Card parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            CardBrand fromCode = CardBrand.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "brand"));
            JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_CHECKS);
            PaymentMethod.Card.Checks parse = optJSONObject != null ? new ChecksJsonParser().parse(optJSONObject) : null;
            String optString = StripeJsonUtils.optString(jSONObject, "country");
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Integer optInteger$payments_core_release = stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_EXP_MONTH);
            Integer optInteger$payments_core_release2 = stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_EXP_YEAR);
            String optString2 = StripeJsonUtils.optString(jSONObject, FIELD_FINGERPRINT);
            String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_FUNDING);
            String optString4 = StripeJsonUtils.optString(jSONObject, FIELD_LAST4);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_THREE_D_SECURE_USAGE);
            PaymentMethod.Card.ThreeDSecureUsage parse2 = optJSONObject2 != null ? new ThreeDSecureUsageJsonParser().parse(optJSONObject2) : null;
            JSONObject optJSONObject3 = jSONObject.optJSONObject(FIELD_WALLET);
            Wallet parse3 = optJSONObject3 != null ? new WalletJsonParser().parse(optJSONObject3) : null;
            JSONObject optJSONObject4 = jSONObject.optJSONObject(FIELD_NETWORKS);
            return new PaymentMethod.Card(fromCode, parse, optString, optInteger$payments_core_release, optInteger$payments_core_release2, optString2, optString3, optString4, parse2, parse3, optJSONObject4 != null ? new NetworksJsonParser().parse(optJSONObject4) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$Companion;", "", "", "FIELD_BILLING_DETAILS", "Ljava/lang/String;", "FIELD_CREATED", "FIELD_CUSTOMER", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Fpx;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class FpxJsonParser implements ModelJsonParser<PaymentMethod.Fpx> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String FIELD_BANK = "bank";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser$Companion;", "", "", "FIELD_ACCOUNT_HOLDER_TYPE", "Ljava/lang/String;", "FIELD_BANK", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.Fpx parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.Fpx(StripeJsonUtils.optString(jSONObject, FIELD_BANK), StripeJsonUtils.optString(jSONObject, FIELD_ACCOUNT_HOLDER_TYPE));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Ideal;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class IdealJsonParser implements ModelJsonParser<PaymentMethod.Ideal> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_BANK = "bank";
        @Deprecated
        private static final String FIELD_BIC = "bic";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser$Companion;", "", "", "FIELD_BANK", "Ljava/lang/String;", "FIELD_BIC", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.Ideal parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.Ideal(StripeJsonUtils.optString(jSONObject, FIELD_BANK), StripeJsonUtils.optString(jSONObject, FIELD_BIC));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Netbanking;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class NetbankingJsonParser implements ModelJsonParser<PaymentMethod.Netbanking> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_BANK = "bank";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser$Companion;", "", "", "FIELD_BANK", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.Netbanking parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.Netbanking(StripeJsonUtils.optString(jSONObject, FIELD_BANK));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class SepaDebitJsonParser implements ModelJsonParser<PaymentMethod.SepaDebit> {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser$Companion;", "", "", "FIELD_BANK_CODE", "Ljava/lang/String;", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.SepaDebit parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.SepaDebit(StripeJsonUtils.optString(jSONObject, FIELD_BANK_CODE), StripeJsonUtils.optString(jSONObject, FIELD_BRANCH_CODE), StripeJsonUtils.optString(jSONObject, "country"), StripeJsonUtils.optString(jSONObject, FIELD_FINGERPRINT), StripeJsonUtils.optString(jSONObject, FIELD_LAST4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Sofort;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class SofortJsonParser implements ModelJsonParser<PaymentMethod.Sofort> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_COUNTRY = "country";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser$Companion;", "", "", "FIELD_COUNTRY", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.Sofort parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.Sofort(StripeJsonUtils.optString(jSONObject, "country"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod$Upi;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodJsonParser.kt */
    public static final class UpiJsonParser implements ModelJsonParser<PaymentMethod.Upi> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_VPA = "vpa";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser$Companion;", "", "", "FIELD_VPA", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public PaymentMethod.Upi parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            return new PaymentMethod.Upi(StripeJsonUtils.optString(jSONObject, FIELD_VPA));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PaymentMethod.Type.values();
            int[] iArr = new int[21];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.CardPresent.ordinal()] = 2;
            iArr[PaymentMethod.Type.Ideal.ordinal()] = 3;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 4;
            iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 6;
            iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 7;
            iArr[PaymentMethod.Type.Sofort.ordinal()] = 8;
            iArr[PaymentMethod.Type.Upi.ordinal()] = 9;
            iArr[PaymentMethod.Type.Netbanking.ordinal()] = 10;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.stripe.android.model.PaymentMethod$Netbanking} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.stripe.android.model.PaymentMethod$Card} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.stripe.android.model.PaymentMethod$Fpx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.stripe.android.model.PaymentMethod$Ideal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.stripe.android.model.PaymentMethod$SepaDebit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.stripe.android.model.PaymentMethod$AuBecsDebit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.stripe.android.model.PaymentMethod$BacsDebit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.stripe.android.model.PaymentMethod$Sofort} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.stripe.android.model.PaymentMethod$Upi} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.model.PaymentMethod parse(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "json"
            m0.n.b.i.e(r6, r0)
            com.stripe.android.model.PaymentMethod$Type$Companion r0 = com.stripe.android.model.PaymentMethod.Type.Companion
            java.lang.String r1 = "type"
            java.lang.String r1 = com.stripe.android.model.StripeJsonUtils.optString(r6, r1)
            com.stripe.android.model.PaymentMethod$Type r0 = r0.fromCode$payments_core_release(r1)
            com.stripe.android.model.PaymentMethod$Builder r1 = new com.stripe.android.model.PaymentMethod$Builder
            r1.<init>()
            java.lang.String r2 = "id"
            java.lang.String r2 = com.stripe.android.model.StripeJsonUtils.optString(r6, r2)
            com.stripe.android.model.PaymentMethod$Builder r1 = r1.setId(r2)
            com.stripe.android.model.PaymentMethod$Builder r1 = r1.setType(r0)
            com.stripe.android.model.StripeJsonUtils r2 = com.stripe.android.model.StripeJsonUtils.INSTANCE
            java.lang.String r3 = "created"
            java.lang.Long r2 = r2.optLong$payments_core_release(r6, r3)
            com.stripe.android.model.PaymentMethod$Builder r1 = r1.setCreated(r2)
            java.lang.String r2 = "billing_details"
            org.json.JSONObject r2 = r6.optJSONObject(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0043
            com.stripe.android.model.parsers.PaymentMethodJsonParser$BillingDetails r4 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$BillingDetails
            r4.<init>()
            com.stripe.android.model.PaymentMethod$BillingDetails r2 = r4.parse((org.json.JSONObject) r2)
            goto L_0x0044
        L_0x0043:
            r2 = r3
        L_0x0044:
            com.stripe.android.model.PaymentMethod$Builder r1 = r1.setBillingDetails(r2)
            java.lang.String r2 = "customer"
            java.lang.String r2 = com.stripe.android.model.StripeJsonUtils.optString(r6, r2)
            com.stripe.android.model.PaymentMethod$Builder r1 = r1.setCustomerId(r2)
            java.lang.String r2 = "livemode"
            boolean r2 = r6.optBoolean(r2)
            com.stripe.android.model.PaymentMethod$Builder r1 = r1.setLiveMode(r2)
            if (r0 != 0) goto L_0x0060
            goto L_0x0137
        L_0x0060:
            int r2 = r0.ordinal()
            r4 = 18
            if (r2 == r4) goto L_0x0123
            switch(r2) {
                case 0: goto L_0x010e;
                case 1: goto L_0x0104;
                case 2: goto L_0x00ef;
                case 3: goto L_0x00da;
                case 4: goto L_0x00c5;
                case 5: goto L_0x00af;
                case 6: goto L_0x0099;
                case 7: goto L_0x0083;
                case 8: goto L_0x006d;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x0137
        L_0x006d:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x007e
            com.stripe.android.model.parsers.PaymentMethodJsonParser$UpiJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$UpiJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$Upi r3 = r0.parse((org.json.JSONObject) r6)
        L_0x007e:
            r1.setUpi(r3)
            goto L_0x0137
        L_0x0083:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x0094
            com.stripe.android.model.parsers.PaymentMethodJsonParser$SofortJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$SofortJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$Sofort r3 = r0.parse((org.json.JSONObject) r6)
        L_0x0094:
            r1.setSofort(r3)
            goto L_0x0137
        L_0x0099:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x00aa
            com.stripe.android.model.parsers.PaymentMethodJsonParser$BacsDebitJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$BacsDebitJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$BacsDebit r3 = r0.parse((org.json.JSONObject) r6)
        L_0x00aa:
            r1.setBacsDebit(r3)
            goto L_0x0137
        L_0x00af:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x00c0
            com.stripe.android.model.parsers.PaymentMethodJsonParser$AuBecsDebitJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$AuBecsDebitJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$AuBecsDebit r3 = r0.parse((org.json.JSONObject) r6)
        L_0x00c0:
            r1.setAuBecsDebit(r3)
            goto L_0x0137
        L_0x00c5:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x00d6
            com.stripe.android.model.parsers.PaymentMethodJsonParser$SepaDebitJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$SepaDebitJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$SepaDebit r3 = r0.parse((org.json.JSONObject) r6)
        L_0x00d6:
            r1.setSepaDebit(r3)
            goto L_0x0137
        L_0x00da:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x00eb
            com.stripe.android.model.parsers.PaymentMethodJsonParser$IdealJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$IdealJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$Ideal r3 = r0.parse((org.json.JSONObject) r6)
        L_0x00eb:
            r1.setIdeal(r3)
            goto L_0x0137
        L_0x00ef:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x0100
            com.stripe.android.model.parsers.PaymentMethodJsonParser$FpxJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$FpxJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$Fpx r3 = r0.parse((org.json.JSONObject) r6)
        L_0x0100:
            r1.setFpx(r3)
            goto L_0x0137
        L_0x0104:
            com.stripe.android.model.PaymentMethod$CardPresent$Companion r6 = com.stripe.android.model.PaymentMethod.CardPresent.Companion
            com.stripe.android.model.PaymentMethod$CardPresent r6 = r6.getEMPTY$payments_core_release()
            r1.setCardPresent(r6)
            goto L_0x0137
        L_0x010e:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x011f
            com.stripe.android.model.parsers.PaymentMethodJsonParser$CardJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$CardJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$Card r3 = r0.parse((org.json.JSONObject) r6)
        L_0x011f:
            r1.setCard(r3)
            goto L_0x0137
        L_0x0123:
            java.lang.String r0 = r0.code
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L_0x0134
            com.stripe.android.model.parsers.PaymentMethodJsonParser$NetbankingJsonParser r0 = new com.stripe.android.model.parsers.PaymentMethodJsonParser$NetbankingJsonParser
            r0.<init>()
            com.stripe.android.model.PaymentMethod$Netbanking r3 = r0.parse((org.json.JSONObject) r6)
        L_0x0134:
            r1.setNetbanking(r3)
        L_0x0137:
            com.stripe.android.model.PaymentMethod r6 = r1.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.PaymentMethodJsonParser.parse(org.json.JSONObject):com.stripe.android.model.PaymentMethod");
    }
}
