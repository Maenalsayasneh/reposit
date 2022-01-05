package j$.time.zone;

import androidx.recyclerview.widget.RecyclerView;
import j$.com.android.tools.r8.a;
import j$.time.Instant;
import j$.time.b;
import j$.time.e;
import j$.time.f;
import j$.time.k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class c implements Serializable {
    private static final long[] a = new long[0];
    private static final b[] b = new b[0];
    private static final f[] c = new f[0];
    private static final a[] d = new a[0];
    private final long[] e;
    private final k[] f;
    private final long[] g;
    private final f[] h;
    private final k[] i;
    private final b[] j;
    private final TimeZone k;
    private final transient ConcurrentMap l = new ConcurrentHashMap();

    private c(k kVar) {
        k[] kVarArr = new k[1];
        this.f = kVarArr;
        kVarArr[0] = kVar;
        long[] jArr = a;
        this.e = jArr;
        this.g = jArr;
        this.h = c;
        this.i = kVarArr;
        this.j = b;
        this.k = null;
    }

    c(TimeZone timeZone) {
        k[] kVarArr = new k[1];
        this.f = kVarArr;
        kVarArr[0] = k(timeZone.getRawOffset());
        long[] jArr = a;
        this.e = jArr;
        this.g = jArr;
        this.h = c;
        this.i = kVarArr;
        this.j = b;
        this.k = timeZone;
    }

    private Object a(f fVar, a aVar) {
        f o = aVar.o();
        boolean P = aVar.P();
        boolean a0 = fVar.a0(o);
        return P ? a0 ? aVar.B() : fVar.a0(aVar.k()) ? aVar : aVar.q() : !a0 ? aVar.q() : fVar.a0(aVar.k()) ? aVar.B() : aVar;
    }

    private a[] b(int i2) {
        long j2;
        long j3;
        int i3 = i2;
        Integer valueOf = Integer.valueOf(i2);
        a[] aVarArr = (a[]) this.l.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.k == null) {
            b[] bVarArr = this.j;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length <= 0) {
                if (i3 < 2100) {
                    this.l.putIfAbsent(valueOf, aVarArr2);
                }
                return aVarArr2;
            }
            Objects.requireNonNull(bVarArr[0]);
            throw null;
        } else if (i3 < 1800) {
            return d;
        } else {
            long X = f.b0(i3 - 1, 12, 31, 0, 0).X(this.f[0]);
            long j4 = 1000;
            int offset = this.k.getOffset(X * 1000);
            long j5 = 31968000 + X;
            a[] aVarArr3 = d;
            while (X < j5) {
                long j6 = 7776000 + X;
                long j7 = X;
                if (offset != this.k.getOffset(j6 * j4)) {
                    X = j7;
                    while (j6 - X > 1) {
                        long j8 = j5;
                        long floorDiv = Math.floorDiv(j6 + X, 2);
                        long j9 = j6;
                        if (this.k.getOffset(floorDiv * 1000) == offset) {
                            X = floorDiv;
                            j6 = j9;
                        } else {
                            j6 = floorDiv;
                        }
                        j4 = 1000;
                        j5 = j8;
                    }
                    j2 = j5;
                    long j10 = j6;
                    j3 = j4;
                    if (this.k.getOffset(X * j3) == offset) {
                        X = j10;
                    }
                    k k2 = k(offset);
                    int offset2 = this.k.getOffset(X * j3);
                    k k3 = k(offset2);
                    if (c(X, k3) == i3) {
                        a[] aVarArr4 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                        aVarArr4[aVarArr4.length - 1] = new a(X, k2, k3);
                        offset = offset2;
                        aVarArr3 = aVarArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    j2 = j5;
                    j3 = j4;
                    X = j6;
                }
                j4 = j3;
                j5 = j2;
            }
            if (1916 <= i3 && i3 < 2100) {
                this.l.putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
    }

    private int c(long j2, k kVar) {
        return e.d0(Math.floorDiv(j2 + ((long) kVar.V()), 86400)).Z();
    }

    private Object e(f fVar) {
        Object obj = null;
        int i2 = 0;
        if (this.k != null) {
            a[] b2 = b(fVar.Y());
            if (b2.length == 0) {
                return k(this.k.getOffset(fVar.X(this.f[0]) * 1000));
            }
            int length = b2.length;
            while (i2 < length) {
                a aVar = b2[i2];
                Object a2 = a(fVar, aVar);
                if ((a2 instanceof a) || a2.equals(aVar.B())) {
                    return a2;
                }
                i2++;
                obj = a2;
            }
            return obj;
        } else if (this.g.length == 0) {
            return this.f[0];
        } else {
            if (this.j.length > 0) {
                f[] fVarArr = this.h;
                if (fVar.Z(fVarArr[fVarArr.length - 1])) {
                    a[] b3 = b(fVar.Y());
                    int length2 = b3.length;
                    while (i2 < length2) {
                        a aVar2 = b3[i2];
                        Object a3 = a(fVar, aVar2);
                        if ((a3 instanceof a) || a3.equals(aVar2.B())) {
                            return a3;
                        }
                        i2++;
                        obj = a3;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.h, fVar);
            if (binarySearch == -1) {
                return this.i[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                f[] fVarArr2 = this.h;
                if (binarySearch < fVarArr2.length - 1) {
                    int i3 = binarySearch + 1;
                    if (fVarArr2[binarySearch].equals(fVarArr2[i3])) {
                        binarySearch = i3;
                    }
                }
            }
            if ((binarySearch & 1) != 0) {
                return this.i[(binarySearch / 2) + 1];
            }
            f[] fVarArr3 = this.h;
            f fVar2 = fVarArr3[binarySearch];
            f fVar3 = fVarArr3[binarySearch + 1];
            k[] kVarArr = this.i;
            int i4 = binarySearch / 2;
            k kVar = kVarArr[i4];
            k kVar2 = kVarArr[i4 + 1];
            return kVar2.V() > kVar.V() ? new a(fVar2, kVar, kVar2) : new a(fVar3, kVar, kVar2);
        }
    }

    public static c j(k kVar) {
        return new c(kVar);
    }

    private static k k(int i2) {
        return k.a0(i2 / 1000);
    }

    public k d(Instant instant) {
        TimeZone timeZone = this.k;
        if (timeZone != null) {
            return k(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.g.length == 0) {
            return this.f[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.j.length > 0) {
            long[] jArr = this.g;
            if (epochSecond > jArr[jArr.length - 1]) {
                k[] kVarArr = this.i;
                a[] b2 = b(c(epochSecond, kVarArr[kVarArr.length - 1]));
                a aVar = null;
                for (int i2 = 0; i2 < b2.length; i2++) {
                    aVar = b2[i2];
                    if (epochSecond < aVar.Q()) {
                        return aVar.B();
                    }
                }
                return aVar.q();
            }
        }
        int binarySearch = Arrays.binarySearch(this.g, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.i[binarySearch + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.k, cVar.k) && Arrays.equals(this.e, cVar.e) && Arrays.equals(this.f, cVar.f) && Arrays.equals(this.g, cVar.g) && Arrays.equals(this.i, cVar.i) && Arrays.equals(this.j, cVar.j);
    }

    public a f(f fVar) {
        Object e2 = e(fVar);
        if (e2 instanceof a) {
            return (a) e2;
        }
        return null;
    }

    public List g(f fVar) {
        Object e2 = e(fVar);
        return e2 instanceof a ? ((a) e2).I() : Collections.singletonList((k) e2);
    }

    public boolean h(Instant instant) {
        k kVar;
        TimeZone timeZone = this.k;
        if (timeZone != null) {
            kVar = k(timeZone.getRawOffset());
        } else if (this.g.length == 0) {
            kVar = this.f[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.e, instant.getEpochSecond());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            kVar = this.f[binarySearch + 1];
        }
        return !kVar.equals(d(instant));
    }

    public int hashCode() {
        return ((((Objects.hashCode(this.k) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f)) ^ Arrays.hashCode(this.g)) ^ Arrays.hashCode(this.i)) ^ Arrays.hashCode(this.j);
    }

    public boolean i() {
        TimeZone timeZone = this.k;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.k.getDSTSavings() != 0) {
                return false;
            }
            Instant now = Instant.now();
            a aVar = null;
            if (this.k != null) {
                long epochSecond = now.getEpochSecond();
                if (now.B() > 0 && epochSecond < RecyclerView.FOREVER_NS) {
                    epochSecond++;
                }
                int c2 = c(epochSecond, d(now));
                a[] b2 = b(c2);
                int length = b2.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (epochSecond > b2[length].Q()) {
                            aVar = b2[length];
                            break;
                        }
                        length--;
                    } else if (c2 > 1800) {
                        a[] b3 = b(c2 - 1);
                        int length2 = b3.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(epochSecond - 31104000, (b.e().c() / 1000) + 31968000);
                                int offset = this.k.getOffset((epochSecond - 1) * 1000);
                                long v = e.c0(1800, 1, 1).v() * 86400;
                                while (true) {
                                    if (v > min) {
                                        break;
                                    }
                                    int offset2 = this.k.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c3 = c(min, k(offset2));
                                        a[] b4 = b(c3 + 1);
                                        int length3 = b4.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                a[] b5 = b(c3);
                                                aVar = b5[b5.length - 1];
                                                break;
                                            } else if (epochSecond > b4[length3].Q()) {
                                                aVar = b4[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (epochSecond > b3[length2].Q()) {
                                aVar = b3[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.g.length != 0) {
                long epochSecond2 = now.getEpochSecond();
                if (now.B() > 0 && epochSecond2 < RecyclerView.FOREVER_NS) {
                    epochSecond2++;
                }
                long[] jArr = this.g;
                long j2 = jArr[jArr.length - 1];
                if (this.j.length > 0 && epochSecond2 > j2) {
                    k[] kVarArr = this.i;
                    k kVar = kVarArr[kVarArr.length - 1];
                    int c4 = c(epochSecond2, kVar);
                    a[] b6 = b(c4);
                    int length4 = b6.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i2 = c4 - 1;
                            if (i2 > c(j2, kVar)) {
                                a[] b7 = b(i2);
                                aVar = b7[b7.length - 1];
                            }
                        } else if (epochSecond2 > b6[length4].Q()) {
                            aVar = b6[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.g, epochSecond2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i3 = binarySearch - 1;
                    long j3 = this.g[i3];
                    k[] kVarArr2 = this.i;
                    aVar = new a(j3, kVarArr2[i3], kVarArr2[binarySearch]);
                }
            }
            return aVar == null;
        } else if (this.g.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder sb;
        if (this.k != null) {
            sb = a.b("ZoneRules[timeZone=");
            sb.append(this.k.getID());
        } else {
            sb = a.b("ZoneRules[currentStandardOffset=");
            k[] kVarArr = this.f;
            sb.append(kVarArr[kVarArr.length - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
