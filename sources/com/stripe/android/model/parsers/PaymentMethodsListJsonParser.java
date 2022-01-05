package com.stripe.android.model.parsers;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodsList;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethodsList;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethodsList;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsListJsonParser.kt */
public final class PaymentMethodsListJsonParser implements ModelJsonParser<PaymentMethodsList> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_DATA = "data";
    @Deprecated
    private static final PaymentMethodJsonParser PAYMENT_METHOD_JSON_PARSER = new PaymentMethodJsonParser();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser$Companion;", "", "", "FIELD_DATA", "Ljava/lang/String;", "Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "PAYMENT_METHOD_JSON_PARSER", "Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsListJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PaymentMethodsList parse(JSONObject jSONObject) {
        ArrayList arrayList;
        i.e(jSONObject, "json");
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            e f = m0.q.i.f(0, optJSONArray.length());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                int a = ((o) it).a();
                PaymentMethodJsonParser paymentMethodJsonParser = PAYMENT_METHOD_JSON_PARSER;
                JSONObject optJSONObject = optJSONArray.optJSONObject(a);
                i.d(optJSONObject, "data.optJSONObject(it)");
                PaymentMethod parse = paymentMethodJsonParser.parse(optJSONObject);
                if (parse != null) {
                    arrayList2.add(parse);
                }
            }
            arrayList = arrayList2;
        } catch (Throwable th) {
            arrayList = h.l0(th);
        }
        Object obj = EmptyList.c;
        boolean z = arrayList instanceof Result.Failure;
        Object obj2 = arrayList;
        if (z) {
            obj2 = obj;
        }
        return new PaymentMethodsList((List) obj2);
    }
}
