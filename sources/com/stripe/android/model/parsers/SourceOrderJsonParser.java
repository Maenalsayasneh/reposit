package com.stripe.android.model.parsers;

import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.StripeJsonUtils;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\f\r\u000eB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceOrder;", "Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "itemJsonParser", "Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "<init>", "()V", "Companion", "ItemJsonParser", "ShippingJsonParser", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceOrderJsonParser.kt */
public final class SourceOrderJsonParser implements ModelJsonParser<SourceOrder> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_ITEMS = "items";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    private final ItemJsonParser itemJsonParser = new ItemJsonParser();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$Companion;", "", "", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CURRENCY", "FIELD_EMAIL", "FIELD_ITEMS", "FIELD_SHIPPING", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrderJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder$Item;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceOrder$Item;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrderJsonParser.kt */
    public static final class ItemJsonParser implements ModelJsonParser<SourceOrder.Item> {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String FIELD_AMOUNT = "amount";
        @Deprecated
        private static final String FIELD_CURRENCY = "currency";
        @Deprecated
        private static final String FIELD_DESCRIPTION = "description";
        @Deprecated
        private static final String FIELD_QUANTITY = "quantity";
        @Deprecated
        private static final String FIELD_TYPE = "type";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser$Companion;", "", "", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_QUANTITY", "FIELD_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceOrderJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public SourceOrder.Item parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            SourceOrder.Item.Type fromCode$payments_core_release = SourceOrder.Item.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(jSONObject, "type"));
            if (fromCode$payments_core_release == null) {
                return null;
            }
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            return new SourceOrder.Item(fromCode$payments_core_release, stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_AMOUNT), StripeJsonUtils.optString(jSONObject, FIELD_CURRENCY), StripeJsonUtils.optString(jSONObject, "description"), stripeJsonUtils.optInteger$payments_core_release(jSONObject, FIELD_QUANTITY));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ShippingJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder$Shipping;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceOrder$Shipping;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrderJsonParser.kt */
    public static final class ShippingJsonParser implements ModelJsonParser<SourceOrder.Shipping> {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ShippingJsonParser$Companion;", "", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceOrderJsonParser.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public SourceOrder.Shipping parse(JSONObject jSONObject) {
            i.e(jSONObject, "json");
            JSONObject optJSONObject = jSONObject.optJSONObject("address");
            return new SourceOrder.Shipping(optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null, StripeJsonUtils.optString(jSONObject, "carrier"), StripeJsonUtils.optString(jSONObject, "name"), StripeJsonUtils.optString(jSONObject, "phone"), StripeJsonUtils.optString(jSONObject, FIELD_TRACKING_NUMBER));
        }
    }

    public SourceOrder parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        JSONArray optJSONArray = jSONObject.optJSONArray(FIELD_ITEMS);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        e f = m0.q.i.f(0, optJSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList<>(h.K(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(optJSONArray.optJSONObject(((o) it).a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList) {
            ItemJsonParser itemJsonParser2 = this.itemJsonParser;
            i.d(jSONObject2, "it");
            SourceOrder.Item parse = itemJsonParser2.parse(jSONObject2);
            if (parse != null) {
                arrayList2.add(parse);
            }
        }
        Integer optInteger$payments_core_release = StripeJsonUtils.INSTANCE.optInteger$payments_core_release(jSONObject, FIELD_AMOUNT);
        String optString = StripeJsonUtils.optString(jSONObject, FIELD_CURRENCY);
        String optString2 = StripeJsonUtils.optString(jSONObject, "email");
        JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_SHIPPING);
        return new SourceOrder(optInteger$payments_core_release, optString, optString2, arrayList2, optJSONObject != null ? new ShippingJsonParser().parse(optJSONObject) : null);
    }
}
