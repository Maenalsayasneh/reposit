package q0;

import i0.d.a.a.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Challenge.kt */
public final class i {
    public final Map<String, String> a;
    public final String b;

    public i(String str, Map<String, String> map) {
        String str2;
        m0.n.b.i.e(str, "scheme");
        m0.n.b.i.e(map, "authParams");
        this.b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                m0.n.b.i.d(locale, "US");
                str2 = str3.toLowerCase(locale);
                m0.n.b.i.d(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m0.n.b.i.d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = unmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return m0.n.b.i.a(iVar.b, this.b) && m0.n.b.i.a(iVar.a, this.a);
        }
    }

    public int hashCode() {
        return this.a.hashCode() + a.F(this.b, 899, 31);
    }

    public String toString() {
        return this.b + " authParams=" + this.a;
    }
}
