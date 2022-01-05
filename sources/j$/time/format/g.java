package j$.time.format;

import j$.com.android.tools.r8.a;
import j$.time.c;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;
import java.util.Locale;

final class g {
    private l a;
    private DateTimeFormatter b;
    private int c;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    g(j$.time.temporal.l r10, j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.h r0 = r11.b()
            j$.time.ZoneId r1 = r11.e()
            if (r0 != 0) goto L_0x0011
            if (r1 != 0) goto L_0x0011
            goto L_0x0100
        L_0x0011:
            int r2 = j$.time.temporal.q.a
            j$.time.temporal.d r2 = j$.time.temporal.d.a
            java.lang.Object r2 = r10.d(r2)
            j$.time.chrono.h r2 = (j$.time.chrono.h) r2
            j$.time.temporal.f r3 = j$.time.temporal.f.a
            java.lang.Object r3 = r10.d(r3)
            j$.time.ZoneId r3 = (j$.time.ZoneId) r3
            boolean r4 = java.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L_0x002b
            r0 = r5
        L_0x002b:
            boolean r4 = java.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L_0x0032
            r1 = r5
        L_0x0032:
            if (r0 != 0) goto L_0x0038
            if (r1 != 0) goto L_0x0038
            goto L_0x0100
        L_0x0038:
            if (r0 == 0) goto L_0x003c
            r4 = r0
            goto L_0x003d
        L_0x003c:
            r4 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x00a8
            j$.time.temporal.j r6 = j$.time.temporal.j.INSTANT_SECONDS
            boolean r6 = r10.f(r6)
            if (r6 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            j$.time.chrono.j r4 = j$.time.chrono.j.a
        L_0x004c:
            j$.time.Instant r10 = j$.time.Instant.q(r10)
            j$.time.chrono.f r10 = r4.x(r10, r1)
            goto L_0x0100
        L_0x0056:
            j$.time.zone.c r6 = r1.p()     // Catch:{ d -> 0x0067 }
            boolean r7 = r6.i()     // Catch:{ d -> 0x0067 }
            if (r7 == 0) goto L_0x0067
            j$.time.Instant r7 = j$.time.Instant.a     // Catch:{ d -> 0x0067 }
            j$.time.k r6 = r6.d(r7)     // Catch:{ d -> 0x0067 }
            goto L_0x0068
        L_0x0067:
            r6 = r1
        L_0x0068:
            boolean r6 = r6 instanceof j$.time.k
            if (r6 == 0) goto L_0x00a8
            j$.time.temporal.j r6 = j$.time.temporal.j.OFFSET_SECONDS
            boolean r7 = r10.f(r6)
            if (r7 == 0) goto L_0x00a8
            int r6 = r10.j(r6)
            j$.time.zone.c r7 = r1.p()
            j$.time.Instant r8 = j$.time.Instant.a
            j$.time.k r7 = r7.d(r8)
            int r7 = r7.V()
            if (r6 != r7) goto L_0x0089
            goto L_0x00a8
        L_0x0089:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unable to apply override zone '"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x00a8:
            if (r1 == 0) goto L_0x00ab
            r3 = r1
        L_0x00ab:
            if (r0 == 0) goto L_0x00fa
            j$.time.temporal.j r1 = j$.time.temporal.j.EPOCH_DAY
            boolean r1 = r10.f(r1)
            if (r1 == 0) goto L_0x00ba
            j$.time.chrono.b r5 = r4.u(r10)
            goto L_0x00fa
        L_0x00ba:
            j$.time.chrono.j r1 = j$.time.chrono.j.a
            if (r0 != r1) goto L_0x00c0
            if (r2 == 0) goto L_0x00fa
        L_0x00c0:
            j$.time.temporal.j[] r1 = j$.time.temporal.j.values()
            r2 = 30
            r6 = 0
        L_0x00c7:
            if (r6 >= r2) goto L_0x00fa
            r7 = r1[r6]
            boolean r8 = r7.o()
            if (r8 == 0) goto L_0x00f7
            boolean r7 = r10.f(r7)
            if (r7 != 0) goto L_0x00d8
            goto L_0x00f7
        L_0x00d8:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to apply override chronology '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x00f7:
            int r6 = r6 + 1
            goto L_0x00c7
        L_0x00fa:
            j$.time.format.f r0 = new j$.time.format.f
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        L_0x0100:
            r9.a = r10
            r9.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.g.<init>(j$.time.temporal.l, j$.time.format.DateTimeFormatter):void");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.c--;
    }

    /* access modifiers changed from: package-private */
    public i b() {
        return this.b.c();
    }

    /* access modifiers changed from: package-private */
    public Locale c() {
        return this.b.d();
    }

    /* access modifiers changed from: package-private */
    public l d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Long e(p pVar) {
        try {
            return Long.valueOf(this.a.g(pVar));
        } catch (c e) {
            if (this.c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public Object f(r rVar) {
        Object d = this.a.d(rVar);
        if (d != null || this.c != 0) {
            return d;
        }
        StringBuilder b2 = a.b("Unable to extract value: ");
        b2.append(this.a.getClass());
        throw new c(b2.toString());
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.c++;
    }

    public String toString() {
        return this.a.toString();
    }
}
