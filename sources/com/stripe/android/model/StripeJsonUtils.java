package com.stripe.android.model;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.j.o;
import m0.n.b.i;
import m0.q.e;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u0007J1\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\u001fJ)\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b&\u0010$J!\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b)\u0010*J%\u0010/\u001a\u0004\u0018\u00010\u00022\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00103\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/stripe/android/model/StripeJsonUtils;", "", "Lorg/json/JSONObject;", "jsonObject", "", "fieldName", "optString", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "optCurrency$payments_core_release", "optCurrency", "", "values", "Lorg/json/JSONArray;", "listToJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "", "optBoolean$payments_core_release", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "optBoolean", "", "optInteger$payments_core_release", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "optInteger", "", "optLong$payments_core_release", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "optLong", "optCountryCode$payments_core_release", "optCountryCode", "", "optMap$payments_core_release", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;", "optMap", "optHash$payments_core_release", "optHash", "jsonObjectToMap$payments_core_release", "(Lorg/json/JSONObject;)Ljava/util/Map;", "jsonObjectToMap", "jsonObjectToStringMap$payments_core_release", "jsonObjectToStringMap", "jsonArray", "jsonArrayToList$payments_core_release", "(Lorg/json/JSONArray;)Ljava/util/List;", "jsonArrayToList", "mapObject", "mapToJsonObject$payments_core_release", "(Ljava/util/Map;)Lorg/json/JSONObject;", "mapToJsonObject", "possibleNull", "nullIfNullOrEmpty$payments_core_release", "(Ljava/lang/String;)Ljava/lang/String;", "nullIfNullOrEmpty", "NULL", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeJsonUtils.kt */
public final class StripeJsonUtils {
    public static final StripeJsonUtils INSTANCE = new StripeJsonUtils();
    private static final String NULL = "null";

    private StripeJsonUtils() {
    }

    private final JSONArray listToJsonArray(List<?> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (T next : list) {
            if (next instanceof Map) {
                next = INSTANCE.mapToJsonObject$payments_core_release((Map) next);
            } else if (next instanceof List) {
                next = INSTANCE.listToJsonArray((List) next);
            } else if (!(next instanceof Number) && !(next instanceof Boolean)) {
                next = String.valueOf(next);
            }
            jSONArray.put((Object) next);
        }
        return jSONArray;
    }

    public static final String optCurrency$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        String nullIfNullOrEmpty$payments_core_release = INSTANCE.nullIfNullOrEmpty$payments_core_release(jSONObject.optString(str));
        if (nullIfNullOrEmpty$payments_core_release != null) {
            if (nullIfNullOrEmpty$payments_core_release.length() == 3) {
                return nullIfNullOrEmpty$payments_core_release;
            }
        }
        return null;
    }

    public static final String optString(JSONObject jSONObject, String str) {
        i.e(str, "fieldName");
        return INSTANCE.nullIfNullOrEmpty$payments_core_release(jSONObject != null ? jSONObject.optString(str) : null);
    }

    public final /* synthetic */ List<Object> jsonArrayToList$payments_core_release(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        e f = m0.q.i.f(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(h.K(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((o) it).a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (next instanceof JSONArray) {
                next = INSTANCE.jsonArrayToList$payments_core_release((JSONArray) next);
            } else if (next instanceof JSONObject) {
                next = INSTANCE.jsonObjectToMap$payments_core_release((JSONObject) next);
            } else if (i.a(next, NULL)) {
                next = null;
            }
            if (next != null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final Map<String, Object> jsonObjectToMap$payments_core_release(JSONObject jSONObject) {
        Map map;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        e f = m0.q.i.f(0, names.length());
        ArrayList<String> arrayList = new ArrayList<>(h.K(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(names.getString(((o) it).a()));
        }
        ArrayList<Map> arrayList2 = new ArrayList<>();
        for (String str : arrayList) {
            Object opt = jSONObject.opt(str);
            if (opt == null || !(!i.a(opt, NULL))) {
                map = null;
            } else {
                if (opt instanceof JSONObject) {
                    opt = INSTANCE.jsonObjectToMap$payments_core_release((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = INSTANCE.jsonArrayToList$payments_core_release((JSONArray) opt);
                }
                map = h.S2(new Pair(str, opt));
            }
            if (map != null) {
                arrayList2.add(map);
            }
        }
        Map<String, Object> o = g.o();
        for (Map b0 : arrayList2) {
            o = g.b0(o, b0);
        }
        return o;
    }

    public final Map<String, String> jsonObjectToStringMap$payments_core_release(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        e f = m0.q.i.f(0, names.length());
        ArrayList<String> arrayList = new ArrayList<>(h.K(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(names.getString(((o) it).a()));
        }
        ArrayList<Map> arrayList2 = new ArrayList<>();
        for (String str : arrayList) {
            Object opt = jSONObject.opt(str);
            Map S2 = (opt == null || !(i.a(opt, NULL) ^ true)) ? null : h.S2(new Pair(str, opt.toString()));
            if (S2 != null) {
                arrayList2.add(S2);
            }
        }
        Map<String, String> o = g.o();
        for (Map b0 : arrayList2) {
            o = g.b0(o, b0);
        }
        return o;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mapToJsonObject$payments_core_release(java.util.Map<java.lang.String, ?> r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0004
            r6 = 0
            return r6
        L_0x0004:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            if (r3 == 0) goto L_0x0011
            boolean r4 = r3 instanceof java.util.Map     // Catch:{  }
            if (r4 == 0) goto L_0x0031
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ JSONException -> 0x0011 }
            org.json.JSONObject r3 = r5.mapToJsonObject$payments_core_release(r3)     // Catch:{ JSONException -> 0x0011 }
            r0.put((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ JSONException -> 0x0011 }
            goto L_0x0011
        L_0x0031:
            boolean r4 = r3 instanceof java.util.List     // Catch:{  }
            if (r4 == 0) goto L_0x003f
            java.util.List r3 = (java.util.List) r3     // Catch:{  }
            org.json.JSONArray r3 = r5.listToJsonArray(r3)     // Catch:{  }
            r0.put((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{  }
            goto L_0x0011
        L_0x003f:
            boolean r4 = r3 instanceof java.lang.Number     // Catch:{  }
            if (r4 != 0) goto L_0x0050
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch:{  }
            if (r4 == 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r0.put((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{  }
            goto L_0x0011
        L_0x0050:
            r0.put((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{  }
            goto L_0x0011
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeJsonUtils.mapToJsonObject$payments_core_release(java.util.Map):org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if ((r5.length() == 0) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.String nullIfNullOrEmpty$payments_core_release(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.String r1 = "null"
            boolean r1 = m0.n.b.i.a(r1, r5)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0015
            r1 = r3
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            r0 = r5
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeJsonUtils.nullIfNullOrEmpty$payments_core_release(java.lang.String):java.lang.String");
    }

    public final /* synthetic */ boolean optBoolean$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        return jSONObject.has(str) && jSONObject.optBoolean(str, false);
    }

    public final /* synthetic */ String optCountryCode$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        String nullIfNullOrEmpty$payments_core_release = nullIfNullOrEmpty$payments_core_release(jSONObject.optString(str));
        if (nullIfNullOrEmpty$payments_core_release != null) {
            if (nullIfNullOrEmpty$payments_core_release.length() == 2) {
                return nullIfNullOrEmpty$payments_core_release;
            }
        }
        return null;
    }

    public final /* synthetic */ Map<String, String> optHash$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return INSTANCE.jsonObjectToStringMap$payments_core_release(optJSONObject);
        }
        return null;
    }

    public final /* synthetic */ Integer optInteger$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        if (!jSONObject.has(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.optInt(str));
    }

    public final /* synthetic */ Long optLong$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        if (!jSONObject.has(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.optLong(str));
    }

    public final /* synthetic */ Map<String, Object> optMap$payments_core_release(JSONObject jSONObject, String str) {
        i.e(jSONObject, "jsonObject");
        i.e(str, "fieldName");
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return INSTANCE.jsonObjectToMap$payments_core_release(optJSONObject);
        }
        return null;
    }
}
