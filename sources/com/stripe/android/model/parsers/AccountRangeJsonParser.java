package com.stripe.android.model.parsers;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import com.stripe.android.model.StripeJsonUtils;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/AccountRange;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/AccountRange;", "accountRange", "serialize", "(Lcom/stripe/android/model/AccountRange;)Lorg/json/JSONObject;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AccountRangeJsonParser.kt */
public final class AccountRangeJsonParser implements ModelJsonParser<AccountRange> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    public static final String FIELD_ACCOUNT_RANGE_HIGH = "account_range_high";
    @Deprecated
    public static final String FIELD_ACCOUNT_RANGE_LOW = "account_range_low";
    @Deprecated
    public static final String FIELD_BRAND = "brand";
    @Deprecated
    public static final String FIELD_COUNTRY = "country";
    @Deprecated
    public static final String FIELD_PAN_LENGTH = "pan_length";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/AccountRangeJsonParser$Companion;", "", "", "FIELD_ACCOUNT_RANGE_HIGH", "Ljava/lang/String;", "FIELD_ACCOUNT_RANGE_LOW", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_PAN_LENGTH", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AccountRangeJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public final JSONObject serialize(AccountRange accountRange) {
        i.e(accountRange, "accountRange");
        JSONObject put = new JSONObject().put(FIELD_ACCOUNT_RANGE_LOW, (Object) accountRange.getBinRange().getLow()).put(FIELD_ACCOUNT_RANGE_HIGH, (Object) accountRange.getBinRange().getHigh()).put(FIELD_PAN_LENGTH, accountRange.getPanLength()).put(FIELD_BRAND, (Object) accountRange.getBrandInfo().getBrandName()).put(FIELD_COUNTRY, (Object) accountRange.getCountry());
        i.d(put, "JSONObject()\n           …RY, accountRange.country)");
        return put;
    }

    public AccountRange parse(JSONObject jSONObject) {
        AccountRange.BrandInfo brandInfo;
        i.e(jSONObject, "json");
        String optString = StripeJsonUtils.optString(jSONObject, FIELD_ACCOUNT_RANGE_HIGH);
        String optString2 = StripeJsonUtils.optString(jSONObject, FIELD_ACCOUNT_RANGE_LOW);
        Integer optInteger$payments_core_release = StripeJsonUtils.INSTANCE.optInteger$payments_core_release(jSONObject, FIELD_PAN_LENGTH);
        String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_BRAND);
        AccountRange.BrandInfo[] values = AccountRange.BrandInfo.values();
        int i = 0;
        while (true) {
            if (i >= 7) {
                brandInfo = null;
                break;
            }
            brandInfo = values[i];
            if (i.a(brandInfo.getBrandName(), optString3)) {
                break;
            }
            i++;
        }
        if (optString == null || optString2 == null || optInteger$payments_core_release == null || brandInfo == null) {
            return null;
        }
        return new AccountRange(new BinRange(optString2, optString), optInteger$payments_core_release.intValue(), brandInfo, StripeJsonUtils.optString(jSONObject, FIELD_COUNTRY));
    }
}
