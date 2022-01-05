package com.stripe.android.model.parsers;

import com.stripe.android.model.StripeModel;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.j.o;
import m0.q.e;
import m0.q.i;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \b*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0001\bJ\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeModel;", "ModelType", "", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeModel;", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ModelJsonParser.kt */
public interface ModelJsonParser<ModelType extends StripeModel> {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/ModelJsonParser$Companion;", "", "Lorg/json/JSONArray;", "jsonArray", "", "", "jsonArrayToList$payments_core_release", "(Lorg/json/JSONArray;)Ljava/util/List;", "jsonArrayToList", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ModelJsonParser.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final List<String> jsonArrayToList$payments_core_release(JSONArray jSONArray) {
            if (jSONArray == null) {
                return EmptyList.c;
            }
            e f = i.f(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(h.K(f, 10));
            Iterator it = f.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.getString(((o) it).a()));
            }
            return arrayList;
        }
    }

    ModelType parse(JSONObject jSONObject);
}
