package i0.j.e.d1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: SdkLocaleRegistry */
public final class e {
    public static final Map<String, List<String>> a;
    public static final Set<String> b;
    public final Context c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("en", d("en"));
        hashMap.put("ar", d("ar"));
        hashMap.put("cs", d("cs"));
        hashMap.put("da", d("da"));
        hashMap.put("de", d("de"));
        hashMap.put("es", d("es"));
        hashMap.put("fr", d("fr"));
        hashMap.put("it", d("it"));
        hashMap.put("ja", d("ja"));
        hashMap.put("ko", d("ko"));
        hashMap.put("nl", d("nl"));
        hashMap.put("no", d("no"));
        hashMap.put("pl", d("pl"));
        hashMap.put("pt", d("pt"));
        hashMap.put("ru", d("ru"));
        hashMap.put("sk", d("sk"));
        hashMap.put("sv", d("sv"));
        hashMap.put("tr", d("tr"));
        hashMap.put("zh", d("zh"));
        hashMap.put("fi", d("fi"));
        hashMap.put("az", d("az"));
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("no");
        hashSet.add("nb");
    }

    public e(Context context) {
        this.c = context;
    }

    public static List<String> d(String str) {
        str.hashCode();
        if (str.equals("zh")) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("CN");
            arrayList.add("TW");
            return arrayList;
        } else if (!str.equals("pt")) {
            return Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("PT");
            arrayList2.add("BR");
            return arrayList2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r1 = a.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r1 != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.util.Locale r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getLanguage()
            java.lang.String r6 = r6.getCountry()
            boolean r1 = r5.c(r0)
            java.lang.String r2 = "default"
            if (r1 == 0) goto L_0x0097
            boolean r1 = r5.c(r0)
            if (r1 == 0) goto L_0x0032
            java.util.Set<java.lang.String> r1 = b
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.String r6 = "no"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x002e
            java.lang.String r6 = "nb"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0095
        L_0x002e:
            java.lang.String r0 = "nb-NO"
            goto L_0x0096
        L_0x0032:
            boolean r1 = r5.c(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0057
            boolean r1 = r5.c(r0)
            if (r1 != 0) goto L_0x0040
            goto L_0x0051
        L_0x0040:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = a
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0053
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r1 = r3
            goto L_0x0054
        L_0x0053:
            r1 = 1
        L_0x0054:
            if (r1 == 0) goto L_0x0057
            goto L_0x0096
        L_0x0057:
            boolean r1 = r5.c(r0)
            java.lang.String r4 = "-"
            if (r1 == 0) goto L_0x006a
            boolean r1 = r5.b(r0, r6)
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = i0.d.a.a.a.o0(r0, r4, r6)
            goto L_0x0096
        L_0x006a:
            boolean r1 = r5.c(r0)
            if (r1 == 0) goto L_0x0095
            boolean r6 = r5.b(r0, r6)
            if (r6 != 0) goto L_0x0095
            java.lang.StringBuilder r6 = i0.d.a.a.a.S0(r0, r4)
            java.util.List r0 = d(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x008b
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x008d
        L_0x008b:
            java.lang.String r0 = ""
        L_0x008d:
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            goto L_0x0096
        L_0x0095:
            r0 = r2
        L_0x0096:
            r2 = r0
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.d1.e.a(java.util.Locale):java.lang.String");
    }

    public boolean b(String str, String str2) {
        List list;
        if (c(str) && (list = a.get(str)) != null && list.contains(str2)) {
            return true;
        }
        return false;
    }

    public boolean c(String str) {
        return a.containsKey(str) || b.contains(str);
    }
}
