package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.e;
import j$.time.temporal.i;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.zone.c;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class k extends ZoneId implements l, m, Comparable<k>, Serializable {
    private static final ConcurrentMap b = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap c = new ConcurrentHashMap(16, 0.75f, 4);
    public static final k d = a0(0);
    public static final k e = a0(-64800);
    public static final k f = a0(64800);
    private final int g;
    private final transient String h;

    private k(int i) {
        String str;
        this.g = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            String str2 = ":0";
            sb.append(i3 < 10 ? str2 : ":");
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : str2);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.h = str;
    }

    public static k P(l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        int i = q.a;
        k kVar = (k) lVar.d(e.a);
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain ZoneOffset from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j$.time.k Y(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = c
            java.lang.Object r0 = r0.get(r7)
            j$.time.k r0 = (j$.time.k) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006e
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r4 = 5
            if (r0 == r4) goto L_0x0064
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005b
            r5 = 7
            if (r0 == r5) goto L_0x004e
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = b0(r7, r2, r3)
            int r1 = b0(r7, r6, r2)
            int r2 = b0(r7, r5, r2)
            goto L_0x0090
        L_0x0037:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x004e:
            int r0 = b0(r7, r2, r3)
            int r1 = b0(r7, r1, r3)
            int r2 = b0(r7, r4, r3)
            goto L_0x0090
        L_0x005b:
            int r0 = b0(r7, r2, r3)
            int r1 = b0(r7, r6, r2)
            goto L_0x006c
        L_0x0064:
            int r0 = b0(r7, r2, r3)
            int r1 = b0(r7, r1, r3)
        L_0x006c:
            r2 = r3
            goto L_0x0090
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x008a:
            int r0 = b0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0090:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b4
            if (r3 != r5) goto L_0x009d
            goto L_0x00b4
        L_0x009d:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b4:
            if (r3 != r5) goto L_0x00be
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.k r7 = Z(r7, r0, r1)
            return r7
        L_0x00be:
            j$.time.k r7 = Z(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.k.Y(java.lang.String):j$.time.k");
    }

    public static k Z(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        } else if (i3 < -59 || i3 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        } else if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return a0((i2 * 60) + (i * 3600) + i3);
        } else {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static k a0(int i) {
        if (i < -64800 || i > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new k(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = b;
            k kVar = (k) concurrentMap.get(valueOf);
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.putIfAbsent(valueOf, new k(i));
            k kVar2 = (k) concurrentMap.get(valueOf);
            c.putIfAbsent(kVar2.h, kVar2);
            return kVar2;
        }
    }

    private static int b0(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    public int V() {
        return this.g;
    }

    public int compareTo(Object obj) {
        return ((k) obj).g - this.g;
    }

    public Object d(r rVar) {
        int i = q.a;
        return (rVar == e.a || rVar == i.a) ? this : super.d(rVar);
    }

    public Temporal e(Temporal temporal) {
        return temporal.c(j.OFFSET_SECONDS, (long) this.g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.g == ((k) obj).g;
        }
        return false;
    }

    public boolean f(p pVar) {
        return pVar instanceof j ? pVar == j.OFFSET_SECONDS : pVar != null && pVar.V(this);
    }

    public long g(p pVar) {
        if (pVar == j.OFFSET_SECONDS) {
            return (long) this.g;
        }
        if (!(pVar instanceof j)) {
            return pVar.q(this);
        }
        throw new t("Unsupported field: " + pVar);
    }

    public int hashCode() {
        return this.g;
    }

    public u i(p pVar) {
        return super.i(pVar);
    }

    public int j(p pVar) {
        if (pVar == j.OFFSET_SECONDS) {
            return this.g;
        }
        if (!(pVar instanceof j)) {
            return super.i(pVar).a(g(pVar), pVar);
        }
        throw new t("Unsupported field: " + pVar);
    }

    public c p() {
        return c.j(this);
    }

    public String t() {
        return this.h;
    }

    public String toString() {
        return this.h;
    }
}
