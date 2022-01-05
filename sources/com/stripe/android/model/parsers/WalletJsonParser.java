package com.stripe.android.model.parsers;

import com.stripe.android.model.Address;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.wallets.Wallet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/WalletJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/wallets/Wallet;", "Lorg/json/JSONObject;", "json", "Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "parseMasterpassWallet", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "", "dynamicLast4", "Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "parseVisaCheckoutWallet", "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/wallets/Wallet;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: WalletJsonParser.kt */
public final class WalletJsonParser implements ModelJsonParser<Wallet> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_BILLING_ADDRESS = "billing_address";
    @Deprecated
    private static final String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_SHIPPING_ADDRESS = "shipping_address";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/WalletJsonParser$Companion;", "", "", "FIELD_BILLING_ADDRESS", "Ljava/lang/String;", "FIELD_DYNAMIC_LAST4", "FIELD_EMAIL", "FIELD_NAME", "FIELD_SHIPPING_ADDRESS", "FIELD_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: WalletJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Wallet.Type.values();
            int[] iArr = new int[6];
            $EnumSwitchMapping$0 = iArr;
            iArr[Wallet.Type.AmexExpressCheckout.ordinal()] = 1;
            iArr[Wallet.Type.ApplePay.ordinal()] = 2;
            iArr[Wallet.Type.SamsungPay.ordinal()] = 3;
            iArr[Wallet.Type.GooglePay.ordinal()] = 4;
            iArr[Wallet.Type.Masterpass.ordinal()] = 5;
            iArr[Wallet.Type.VisaCheckout.ordinal()] = 6;
        }
    }

    private final Wallet.MasterpassWallet parseMasterpassWallet(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_BILLING_ADDRESS);
        Address address = null;
        Address parse = optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null;
        String optString = StripeJsonUtils.optString(jSONObject, "email");
        String optString2 = StripeJsonUtils.optString(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_SHIPPING_ADDRESS);
        if (optJSONObject2 != null) {
            address = new AddressJsonParser().parse(optJSONObject2);
        }
        return new Wallet.MasterpassWallet(parse, optString, optString2, address);
    }

    private final Wallet.VisaCheckoutWallet parseVisaCheckoutWallet(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_BILLING_ADDRESS);
        Address address = null;
        Address parse = optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null;
        String optString = StripeJsonUtils.optString(jSONObject, "email");
        String optString2 = StripeJsonUtils.optString(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_SHIPPING_ADDRESS);
        if (optJSONObject2 != null) {
            address = new AddressJsonParser().parse(optJSONObject2);
        }
        return new Wallet.VisaCheckoutWallet(parse, optString, optString2, address, str);
    }

    public Wallet parse(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Wallet wallet;
        i.e(jSONObject, "json");
        Wallet.Type fromCode$payments_core_release = Wallet.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, "type"));
        if (fromCode$payments_core_release == null || (optJSONObject = jSONObject.optJSONObject(fromCode$payments_core_release.getCode())) == null) {
            return null;
        }
        String optString = StripeJsonUtils.optString(jSONObject, FIELD_DYNAMIC_LAST4);
        int ordinal = fromCode$payments_core_release.ordinal();
        if (ordinal == 0) {
            wallet = new Wallet.AmexExpressCheckoutWallet(optString);
        } else if (ordinal == 1) {
            wallet = new Wallet.ApplePayWallet(optString);
        } else if (ordinal == 2) {
            wallet = new Wallet.GooglePayWallet(optString);
        } else if (ordinal == 3) {
            return parseMasterpassWallet(optJSONObject);
        } else {
            if (ordinal == 4) {
                wallet = new Wallet.SamsungPayWallet(optString);
            } else if (ordinal == 5) {
                return parseVisaCheckoutWallet(optJSONObject, optString);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return wallet;
    }
}
