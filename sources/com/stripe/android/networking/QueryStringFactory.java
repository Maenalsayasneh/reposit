package com.stripe.android.networking;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.StripeError;
import com.stripe.android.exception.InvalidRequestException;
import i0.j.f.p.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.t.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/networking/QueryStringFactory;", "", "", "", "params", "", "Lcom/stripe/android/networking/QueryStringFactory$Parameter;", "flattenParams", "(Ljava/util/Map;)Ljava/util/List;", "keyPrefix", "flattenParamsList", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "flattenParamsMap", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;", "value", "flattenParamsValue", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;", "create", "(Ljava/util/Map;)Ljava/lang/String;", "<init>", "()V", "Parameter", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: QueryStringFactory.kt */
public final class QueryStringFactory {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/networking/QueryStringFactory$Parameter;", "", "", "str", "urlEncode", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "toString", "key", "value", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/networking/QueryStringFactory$Parameter;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: QueryStringFactory.kt */
    public static final class Parameter {
        private final String key;
        private final String value;

        public Parameter(String str, String str2) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            this.key = str;
            this.value = str2;
        }

        private final String component1() {
            return this.key;
        }

        private final String component2() {
            return this.value;
        }

        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameter.key;
            }
            if ((i & 2) != 0) {
                str2 = parameter.value;
            }
            return parameter.copy(str, str2);
        }

        private final String urlEncode(String str) throws UnsupportedEncodingException {
            String encode = URLEncoder.encode(str, a.a.name());
            i.d(encode, "URLEncoder.encode(str, Charsets.UTF_8.name())");
            return encode;
        }

        public final Parameter copy(String str, String str2) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            return new Parameter(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) obj;
            return i.a(this.key, parameter.key) && i.a(this.value, parameter.value);
        }

        public int hashCode() {
            String str = this.key;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.value;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            String urlEncode = urlEncode(this.key);
            String urlEncode2 = urlEncode(this.value);
            return urlEncode + '=' + urlEncode2;
        }
    }

    private final List<Parameter> flattenParams(Map<String, ?> map) throws InvalidRequestException {
        return flattenParamsMap$default(this, map, (String) null, 2, (Object) null);
    }

    private final List<Parameter> flattenParamsList(List<?> list, String str) throws InvalidRequestException {
        if (list.isEmpty()) {
            return h.L2(new Parameter(str, ""));
        }
        String n02 = i0.d.a.a.a.n0(str, "[]");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g.b(arrayList, flattenParamsValue(it.next(), n02));
        }
        return arrayList;
    }

    private final List<Parameter> flattenParamsMap(Map<String, ?> map, String str) throws InvalidRequestException {
        if (map == null) {
            return EmptyList.c;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            Object value = next.getValue();
            if (str != null) {
                String str3 = str + '[' + str2 + ']';
                if (str3 != null) {
                    str2 = str3;
                }
            }
            g.b(arrayList, flattenParamsValue(value, str2));
        }
        return arrayList;
    }

    public static /* synthetic */ List flattenParamsMap$default(QueryStringFactory queryStringFactory, Map map, String str, int i, Object obj) throws InvalidRequestException {
        if ((i & 2) != 0) {
            str = null;
        }
        return queryStringFactory.flattenParamsMap(map, str);
    }

    private final List<Parameter> flattenParamsValue(Object obj, String str) throws InvalidRequestException {
        Object obj2 = obj;
        String str2 = str;
        if (obj2 instanceof Map) {
            return flattenParamsMap((Map) obj2, str2);
        }
        if (obj2 instanceof List) {
            return flattenParamsList((List) obj2, str2);
        }
        if (i.a(obj2, "")) {
            StringBuilder U0 = i0.d.a.a.a.U0("You cannot set '", str2, "' to an empty string. We interpret empty strings as ", "null in requests. You may set '", str2);
            U0.append("' to null to delete the property.");
            throw new InvalidRequestException(new StripeError((String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, 119, (f) null), (String) null, 0, U0.toString(), (Throwable) null, 22, (f) null);
        } else if (obj2 == null) {
            return h.L2(new Parameter(str2, ""));
        } else {
            return h.L2(new Parameter(str2, obj.toString()));
        }
    }

    public final String create(Map<String, ?> map) {
        return g.E(flattenParams(map), "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, QueryStringFactory$create$1.INSTANCE, 30);
    }
}
