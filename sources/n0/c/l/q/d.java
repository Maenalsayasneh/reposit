package n0.c.l.q;

import i0.d.a.a.a;
import m0.n.b.i;
import n0.c.m.b;

/* compiled from: JsonConf.kt */
public final class d {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final b k;

    public d() {
        this(false, false, false, false, false, (String) null, false, false, (String) null, false, (b) null, 2047);
    }

    public d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, String str2, boolean z8, b bVar) {
        i.e(str, "prettyPrintIndent");
        i.e(str2, "classDiscriminator");
        i.e(bVar, "serializersModule");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = z6;
        this.h = z7;
        this.i = str2;
        this.j = z8;
        this.k = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && i.a(this.f, dVar.f) && this.g == dVar.g && this.h == dVar.h && i.a(this.i, dVar.i) && this.j == dVar.j && i.a(this.k, dVar.k);
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.d;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.e;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        String str = this.f;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z7 = this.g;
        if (z7) {
            z7 = true;
        }
        int i8 = (hashCode + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.h;
        if (z8) {
            z8 = true;
        }
        int i9 = (i8 + (z8 ? 1 : 0)) * 31;
        String str2 = this.i;
        int hashCode2 = (i9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z9 = this.j;
        if (!z9) {
            z2 = z9;
        }
        int i10 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        b bVar = this.k;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        StringBuilder P0 = a.P0("JsonConf(encodeDefaults=");
        P0.append(this.a);
        P0.append(", ignoreUnknownKeys=");
        P0.append(this.b);
        P0.append(", isLenient=");
        P0.append(this.c);
        P0.append(", allowStructuredMapKeys=");
        P0.append(this.d);
        P0.append(", prettyPrint=");
        P0.append(this.e);
        P0.append(", prettyPrintIndent=");
        P0.append(this.f);
        P0.append(", coerceInputValues=");
        P0.append(this.g);
        P0.append(", useArrayPolymorphism=");
        P0.append(this.h);
        P0.append(", classDiscriminator=");
        P0.append(this.i);
        P0.append(", allowSpecialFloatingPointValues=");
        P0.append(this.j);
        P0.append(", serializersModule=");
        P0.append(this.k);
        P0.append(")");
        return P0.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, java.lang.String r19, boolean r20, boolean r21, java.lang.String r22, boolean r23, n0.c.m.b r24, int r25) {
        /*
            r13 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0031
            java.lang.String r7 = "    "
            goto L_0x0032
        L_0x0031:
            r7 = r8
        L_0x0032:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0038
            r9 = r2
            goto L_0x003a
        L_0x0038:
            r9 = r20
        L_0x003a:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0040
            r10 = r2
            goto L_0x0042
        L_0x0040:
            r10 = r21
        L_0x0042:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0049
            java.lang.String r11 = "type"
            goto L_0x004a
        L_0x0049:
            r11 = r8
        L_0x004a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r2 = r23
        L_0x0051:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0058
            n0.c.m.b r0 = n0.c.m.d.a
            r8 = r0
        L_0x0058:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r25 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.d.<init>(boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, n0.c.m.b, int):void");
    }
}
