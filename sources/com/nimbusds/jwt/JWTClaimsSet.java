package com.nimbusds.jwt;

import i0.j.f.p.h;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class JWTClaimsSet implements Serializable {
    public static final /* synthetic */ int c = 0;
    public final Map<String, Object> d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        Collections.unmodifiableSet(hashSet);
    }

    public JWTClaimsSet(Map map, a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.d = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public List<String> a(String str) throws ParseException {
        String[] strArr;
        if (this.d.get(str) == null) {
            strArr = null;
        } else {
            try {
                List list = (List) this.d.get(str);
                int size = list.size();
                strArr = new String[size];
                int i = 0;
                while (i < size) {
                    try {
                        strArr[i] = (String) list.get(i);
                        i++;
                    } catch (ClassCastException unused) {
                        throw new ParseException(i0.d.a.a.a.o0("The \"", str, "\" claim is not a list / JSON array of strings"), 0);
                    }
                }
            } catch (ClassCastException unused2) {
                throw new ParseException(i0.d.a.a.a.o0("The \"", str, "\" claim is not a list / JSON array"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWTClaimsSet)) {
            return false;
        }
        return Objects.equals(this.d, ((JWTClaimsSet) obj).d);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.d});
    }

    public String toString() {
        List<String> list;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.d.entrySet()) {
            if (next.getValue() instanceof Date) {
                hashMap.put(next.getKey(), Long.valueOf(((Date) next.getValue()).getTime() / 1000));
            } else if ("aud".equals(next.getKey())) {
                Object obj = this.d.get("aud");
                if (obj instanceof String) {
                    list = Collections.singletonList((String) obj);
                } else {
                    try {
                        list = a("aud");
                        if (list == null) {
                            list = Collections.emptyList();
                        }
                    } catch (ParseException unused) {
                        list = Collections.emptyList();
                    }
                }
                if (list != null && !list.isEmpty()) {
                    if (list.size() == 1) {
                        hashMap.put("aud", list.get(0));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(list);
                        hashMap.put("aud", arrayList);
                    }
                }
            } else if (next.getValue() != null) {
                hashMap.put(next.getKey(), next.getValue());
            }
        }
        return h.k4(hashMap);
    }
}
