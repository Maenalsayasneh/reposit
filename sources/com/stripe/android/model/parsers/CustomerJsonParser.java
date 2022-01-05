package com.stripe.android.model.parsers;

import com.stripe.android.model.Customer;
import com.stripe.android.model.CustomerSource;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.TokenizationMethod;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Customer;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Customer;", "Lcom/stripe/android/model/parsers/CustomerSourceJsonParser;", "customerSourceJsonParser", "Lcom/stripe/android/model/parsers/CustomerSourceJsonParser;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomerJsonParser.kt */
public final class CustomerJsonParser implements ModelJsonParser<Customer> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_DATA = "data";
    @Deprecated
    private static final String FIELD_DEFAULT_SOURCE = "default_source";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_HAS_MORE = "has_more";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    @Deprecated
    private static final String FIELD_SOURCES = "sources";
    @Deprecated
    private static final String FIELD_TOTAL_COUNT = "total_count";
    @Deprecated
    private static final String FIELD_URL = "url";
    @Deprecated
    private static final String VALUE_CUSTOMER = "customer";
    @Deprecated
    private static final String VALUE_LIST = "list";
    private final CustomerSourceJsonParser customerSourceJsonParser = new CustomerSourceJsonParser();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser$Companion;", "", "", "FIELD_DATA", "Ljava/lang/String;", "FIELD_DEFAULT_SOURCE", "FIELD_DESCRIPTION", "FIELD_EMAIL", "FIELD_HAS_MORE", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_SHIPPING", "FIELD_SOURCES", "FIELD_TOTAL_COUNT", "FIELD_URL", "VALUE_CUSTOMER", "VALUE_LIST", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Customer parse(JSONObject jSONObject) {
        String str;
        Integer num;
        boolean z;
        ArrayList arrayList;
        JSONObject jSONObject2 = jSONObject;
        i.e(jSONObject2, "json");
        if (!i.a(VALUE_CUSTOMER, StripeJsonUtils.optString(jSONObject2, FIELD_OBJECT))) {
            return null;
        }
        String optString = StripeJsonUtils.optString(jSONObject2, "id");
        String optString2 = StripeJsonUtils.optString(jSONObject2, FIELD_DEFAULT_SOURCE);
        JSONObject optJSONObject = jSONObject2.optJSONObject(FIELD_SHIPPING);
        ShippingInformation parse = optJSONObject != null ? new ShippingInformationJsonParser().parse(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject2.optJSONObject(FIELD_SOURCES);
        if (optJSONObject2 == null || !i.a(VALUE_LIST, StripeJsonUtils.optString(optJSONObject2, FIELD_OBJECT))) {
            arrayList = EmptyList.c;
            num = null;
            str = null;
            z = false;
        } else {
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            boolean optBoolean$payments_core_release = stripeJsonUtils.optBoolean$payments_core_release(optJSONObject2, FIELD_HAS_MORE);
            Integer optInteger$payments_core_release = stripeJsonUtils.optInteger$payments_core_release(optJSONObject2, FIELD_TOTAL_COUNT);
            String optString3 = StripeJsonUtils.optString(optJSONObject2, "url");
            JSONArray optJSONArray = optJSONObject2.optJSONArray("data");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            e f = m0.q.i.f(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList2 = new ArrayList<>(h.K(f, 10));
            Iterator it = f.iterator();
            while (it.hasNext()) {
                arrayList2.add(optJSONArray.getJSONObject(((o) it).a()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (JSONObject jSONObject3 : arrayList2) {
                CustomerSourceJsonParser customerSourceJsonParser2 = this.customerSourceJsonParser;
                i.d(jSONObject3, "it");
                CustomerSource parse2 = customerSourceJsonParser2.parse(jSONObject3);
                if (parse2 != null) {
                    arrayList3.add(parse2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object next : arrayList3) {
                if (!(((CustomerSource) next).getTokenizationMethod() == TokenizationMethod.ApplePay)) {
                    arrayList4.add(next);
                }
            }
            num = optInteger$payments_core_release;
            str = optString3;
            arrayList = arrayList4;
            z = optBoolean$payments_core_release;
        }
        return new Customer(optString, optString2, parse, arrayList, z, num, str, StripeJsonUtils.optString(jSONObject2, "description"), StripeJsonUtils.optString(jSONObject2, "email"), jSONObject2.optBoolean(FIELD_LIVEMODE, false));
    }
}
