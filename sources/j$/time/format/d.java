package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.h;
import j$.time.chrono.j;
import j$.time.temporal.l;
import j$.time.temporal.p;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

final class d {
    private DateTimeFormatter a;
    private boolean b = true;
    private boolean c = true;
    private final ArrayList d;
    private ArrayList e;

    d(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new j());
    }

    static boolean c(char c2, char c3) {
        return c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    private j e() {
        ArrayList arrayList = this.d;
        return (j) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public void a(Consumer consumer) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(consumer);
    }

    /* access modifiers changed from: package-private */
    public boolean b(char c2, char c3) {
        if (this.b) {
            return c2 == c3;
        }
        return c(c2, c3);
    }

    /* access modifiers changed from: package-private */
    public d d() {
        d dVar = new d(this.a);
        dVar.b = this.b;
        dVar.c = this.c;
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z) {
        ArrayList arrayList;
        int i;
        if (z) {
            arrayList = this.d;
            i = arrayList.size() - 2;
        } else {
            arrayList = this.d;
            i = arrayList.size() - 1;
        }
        arrayList.remove(i);
    }

    /* access modifiers changed from: package-private */
    public i g() {
        return this.a.c();
    }

    /* access modifiers changed from: package-private */
    public h h() {
        h hVar = e().c;
        if (hVar != null) {
            return hVar;
        }
        h b2 = this.a.b();
        return b2 == null ? j.a : b2;
    }

    /* access modifiers changed from: package-private */
    public Locale i() {
        return this.a.d();
    }

    /* access modifiers changed from: package-private */
    public Long j(p pVar) {
        return (Long) e().a.get(pVar);
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z) {
        this.b = z;
    }

    /* access modifiers changed from: package-private */
    public void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().b = zoneId;
    }

    /* access modifiers changed from: package-private */
    public int o(p pVar, long j, int i, int i2) {
        Objects.requireNonNull(pVar, "field");
        Long l = (Long) e().a.put(pVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        e().d = true;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z) {
        this.c = z;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        ArrayList arrayList = this.d;
        j e2 = e();
        Objects.requireNonNull(e2);
        j jVar = new j();
        jVar.a.putAll(e2.a);
        jVar.b = e2.b;
        jVar.c = e2.c;
        jVar.d = e2.d;
        arrayList.add(jVar);
    }

    /* access modifiers changed from: package-private */
    public boolean s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public l t(k kVar, Set set) {
        j e2 = e();
        e2.c = h();
        ZoneId zoneId = e2.b;
        if (zoneId == null) {
            zoneId = this.a.e();
        }
        e2.b = zoneId;
        e2.p(kVar, set);
        return e2;
    }

    public String toString() {
        return e().toString();
    }
}
