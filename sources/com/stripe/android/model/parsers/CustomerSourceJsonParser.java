package com.stripe.android.model.parsers;

import com.stripe.android.model.CustomerSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerSourceJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/CustomerSource;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/CustomerSource;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomerSourceJsonParser.kt */
public final class CustomerSourceJsonParser implements ModelJsonParser<CustomerSource> {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.model.CustomerSource parse(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "json"
            m0.n.b.i.e(r5, r0)
            java.lang.String r0 = "object"
            java.lang.String r0 = com.stripe.android.model.StripeJsonUtils.optString(r5, r0)
            r1 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x0059
        L_0x000f:
            int r2 = r0.hashCode()
            r3 = -1825227990(0xffffffff93353b2a, float:-2.2874582E-27)
            if (r2 == r3) goto L_0x0047
            r3 = -896505829(0xffffffffca90681b, float:-4731917.5)
            if (r2 == r3) goto L_0x0035
            r3 = 3046160(0x2e7b10, float:4.26858E-39)
            if (r2 == r3) goto L_0x0023
            goto L_0x0059
        L_0x0023:
            java.lang.String r2 = "card"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0059
            com.stripe.android.model.parsers.CardJsonParser r0 = new com.stripe.android.model.parsers.CardJsonParser
            r0.<init>()
            com.stripe.android.model.Card r5 = r0.parse((org.json.JSONObject) r5)
            goto L_0x005a
        L_0x0035:
            java.lang.String r2 = "source"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0059
            com.stripe.android.model.parsers.SourceJsonParser r0 = new com.stripe.android.model.parsers.SourceJsonParser
            r0.<init>()
            com.stripe.android.model.Source r5 = r0.parse((org.json.JSONObject) r5)
            goto L_0x005a
        L_0x0047:
            java.lang.String r2 = "bank_account"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0059
            com.stripe.android.model.parsers.BankAccountJsonParser r0 = new com.stripe.android.model.parsers.BankAccountJsonParser
            r0.<init>()
            com.stripe.android.model.BankAccount r5 = r0.parse((org.json.JSONObject) r5)
            goto L_0x005a
        L_0x0059:
            r5 = r1
        L_0x005a:
            if (r5 == 0) goto L_0x0061
            com.stripe.android.model.CustomerSource r1 = new com.stripe.android.model.CustomerSource
            r1.<init>(r5)
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.CustomerSourceJsonParser.parse(org.json.JSONObject):com.stripe.android.model.CustomerSource");
    }
}
