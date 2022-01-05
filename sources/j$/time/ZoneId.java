package j$.time;

import j$.time.temporal.i;
import j$.time.temporal.l;
import j$.time.temporal.q;
import j$.time.zone.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public abstract class ZoneId implements Serializable {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        a = Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (getClass() != k.class && getClass() != l.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId B(String str, k kVar) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(kVar, "offset");
        if (str.length() == 0) {
            return kVar;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (kVar.V() != 0) {
                str = str.concat(kVar.t());
            }
            return new l(str, c.j(kVar));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static ZoneId I(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return B(substring, k.d);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return l.P(str, z);
        }
        try {
            k Y = k.Y(str.substring(i));
            return Y == k.d ? B(substring, Y) : B(substring, Y);
        } catch (c e) {
            throw new c("Invalid ID for offset-based ZoneId: " + str, e);
        }
    }

    public static ZoneId o(l lVar) {
        int i = q.a;
        ZoneId zoneId = (ZoneId) lVar.d(i.a);
        if (zoneId != null) {
            return zoneId;
        }
        throw new c("Unable to obtain ZoneId from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static ZoneId q(String str) {
        int i;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return k.Y(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i = 3;
        } else if (!str.startsWith("UT")) {
            return l.P(str, true);
        } else {
            i = 2;
        }
        return I(str, i, true);
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return q(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return t().equals(((ZoneId) obj).t());
        }
        return false;
    }

    public int hashCode() {
        return t().hashCode();
    }

    public abstract c p();

    public abstract String t();

    public String toString() {
        return t();
    }
}
