package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.util.HashSet;
import java.util.Objects;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;
import s0.a.a.b3.c;
import s0.a.a.c3.h0;
import s0.a.a.c3.w;
import s0.a.a.c3.y;
import s0.a.a.s;

public class PKIXNameConstraintValidator {
    public h0 validator = new h0();

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x020b, code lost:
        if (r7.equalsIgnoreCase(r11) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023e, code lost:
        if (r0.r(r11.substring(r7.indexOf(64) + 1), r7) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0258, code lost:
        if (r0.r(r11, r7) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x025f, code lost:
        if (r0.r(r11, r7) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0275, code lost:
        if (r11.substring(r7.indexOf(64) + 1).equalsIgnoreCase(r7) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0282, code lost:
        if (r0.r(r7, r11) != false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0289, code lost:
        if (r7.equalsIgnoreCase(r11) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (r7.equalsIgnoreCase(r11) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r0.r(r11.substring(r7.indexOf(64) + 1), r7) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (r0.r(r11, r7) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        if (r0.r(r11, r7) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011f, code lost:
        if (r11.substring(r7.indexOf(64) + 1).equalsIgnoreCase(r7) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
        if (r0.r(r7, r11) != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0133, code lost:
        if (r7.equalsIgnoreCase(r11) != false) goto L_0x0135;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addExcludedSubtree(s0.a.a.c3.y r11) {
        /*
            r10 = this;
            s0.a.a.c3.h0 r0 = r10.validator
            java.util.Objects.requireNonNull(r0)
            s0.a.a.c3.w r11 = r11.d
            int r1 = r11.d
            if (r1 == 0) goto L_0x029c
            r2 = -1
            java.lang.String r3 = "."
            r4 = 64
            r5 = 1
            if (r1 == r5) goto L_0x01d1
            r6 = 2
            if (r1 == r6) goto L_0x0192
            r6 = 4
            if (r1 == r6) goto L_0x0147
            r6 = 6
            if (r1 == r6) goto L_0x007b
            r2 = 7
            if (r1 != r2) goto L_0x0066
            java.util.Set r1 = r0.e
            s0.a.a.e r11 = r11.c
            s0.a.a.o r11 = s0.a.a.o.B(r11)
            byte[] r11 = r11.c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0036
            if (r11 != 0) goto L_0x0032
            goto L_0x0062
        L_0x0032:
            r1.add(r11)
            goto L_0x0062
        L_0x0036:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r1.next()
            byte[] r3 = (byte[]) r3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r5 = java.util.Arrays.equals(r3, r11)
            r4.add(r3)
            if (r5 == 0) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            r4.add(r11)
        L_0x005d:
            r2.addAll(r4)
            goto L_0x003f
        L_0x0061:
            r1 = r2
        L_0x0062:
            r0.e = r1
            goto L_0x02b4
        L_0x0066:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown tag encountered: "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            int r11 = r11.d
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x007b:
            java.util.Set r1 = r0.d
            java.lang.String r11 = r0.h(r11)
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x008c
            r1.add(r11)
            goto L_0x0143
        L_0x008c:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0095:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0142
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.indexOf(r4)
            if (r8 == r2) goto L_0x00cf
            java.lang.String r8 = i0.d.a.a.a.f0(r7, r4, r5)
            int r9 = r11.indexOf(r4)
            if (r9 == r2) goto L_0x00b9
            boolean r8 = r7.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x013a
            goto L_0x0135
        L_0x00b9:
            boolean r9 = r11.startsWith(r3)
            if (r9 == 0) goto L_0x00c7
            boolean r8 = r0.r(r8, r11)
            if (r8 == 0) goto L_0x013a
            goto L_0x013d
        L_0x00c7:
            boolean r8 = r8.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x013a
            goto L_0x013d
        L_0x00cf:
            boolean r8 = r7.startsWith(r3)
            if (r8 == 0) goto L_0x010c
            int r8 = r11.indexOf(r4)
            if (r8 == r2) goto L_0x00eb
            int r8 = r7.indexOf(r4)
            int r8 = r8 + r5
            java.lang.String r8 = r11.substring(r8)
            boolean r8 = r0.r(r8, r7)
            if (r8 == 0) goto L_0x013a
            goto L_0x0135
        L_0x00eb:
            boolean r8 = r11.startsWith(r3)
            if (r8 == 0) goto L_0x0105
            boolean r8 = r0.r(r7, r11)
            if (r8 != 0) goto L_0x013d
            boolean r8 = r7.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x00fe
            goto L_0x013d
        L_0x00fe:
            boolean r8 = r0.r(r11, r7)
            if (r8 == 0) goto L_0x013a
            goto L_0x0135
        L_0x0105:
            boolean r8 = r0.r(r11, r7)
            if (r8 == 0) goto L_0x013a
            goto L_0x0135
        L_0x010c:
            int r8 = r11.indexOf(r4)
            if (r8 == r2) goto L_0x0122
            int r8 = r7.indexOf(r4)
            int r8 = r8 + r5
            java.lang.String r8 = r11.substring(r8)
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x013a
            goto L_0x0135
        L_0x0122:
            boolean r8 = r11.startsWith(r3)
            if (r8 == 0) goto L_0x012f
            boolean r8 = r0.r(r7, r11)
            if (r8 == 0) goto L_0x013a
            goto L_0x013d
        L_0x012f:
            boolean r8 = r7.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x013a
        L_0x0135:
            r6.add(r7)
            goto L_0x0095
        L_0x013a:
            r6.add(r7)
        L_0x013d:
            r6.add(r11)
            goto L_0x0095
        L_0x0142:
            r1 = r6
        L_0x0143:
            r0.d = r1
            goto L_0x02b4
        L_0x0147:
            java.util.Set r1 = r0.a
            s0.a.a.e r11 = r11.c
            s0.a.a.r r11 = r11.c()
            s0.a.a.s r11 = (s0.a.a.s) r11
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x015e
            if (r11 != 0) goto L_0x015a
            goto L_0x018e
        L_0x015a:
            r1.add(r11)
            goto L_0x018e
        L_0x015e:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0167:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x018d
            java.lang.Object r3 = r1.next()
            s0.a.a.s r3 = s0.a.a.s.B(r3)
            boolean r4 = s0.a.a.c3.h0.q(r11, r3)
            if (r4 == 0) goto L_0x017f
            r2.add(r3)
            goto L_0x0167
        L_0x017f:
            boolean r4 = s0.a.a.c3.h0.q(r3, r11)
            if (r4 == 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            r2.add(r3)
        L_0x0189:
            r2.add(r11)
            goto L_0x0167
        L_0x018d:
            r1 = r2
        L_0x018e:
            r0.a = r1
            goto L_0x02b4
        L_0x0192:
            java.util.Set r1 = r0.b
            java.lang.String r11 = r0.h(r11)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01a2
            r1.add(r11)
            goto L_0x01cd
        L_0x01a2:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01ab:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01cc
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r0.r(r3, r11)
            if (r4 == 0) goto L_0x01be
            goto L_0x01c8
        L_0x01be:
            boolean r4 = r0.r(r11, r3)
            r2.add(r3)
            if (r4 == 0) goto L_0x01c8
            goto L_0x01ab
        L_0x01c8:
            r2.add(r11)
            goto L_0x01ab
        L_0x01cc:
            r1 = r2
        L_0x01cd:
            r0.b = r1
            goto L_0x02b4
        L_0x01d1:
            java.util.Set r1 = r0.c
            java.lang.String r11 = r0.h(r11)
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x01e2
            r1.add(r11)
            goto L_0x0299
        L_0x01e2:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01eb:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0298
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.indexOf(r4)
            if (r8 == r2) goto L_0x0225
            java.lang.String r8 = i0.d.a.a.a.f0(r7, r4, r5)
            int r9 = r11.indexOf(r4)
            if (r9 == r2) goto L_0x020f
            boolean r8 = r7.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x0290
            goto L_0x028b
        L_0x020f:
            boolean r9 = r11.startsWith(r3)
            if (r9 == 0) goto L_0x021d
            boolean r8 = r0.r(r8, r11)
            if (r8 == 0) goto L_0x0290
            goto L_0x0293
        L_0x021d:
            boolean r8 = r8.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x0290
            goto L_0x0293
        L_0x0225:
            boolean r8 = r7.startsWith(r3)
            if (r8 == 0) goto L_0x0262
            int r8 = r11.indexOf(r4)
            if (r8 == r2) goto L_0x0241
            int r8 = r7.indexOf(r4)
            int r8 = r8 + r5
            java.lang.String r8 = r11.substring(r8)
            boolean r8 = r0.r(r8, r7)
            if (r8 == 0) goto L_0x0290
            goto L_0x028b
        L_0x0241:
            boolean r8 = r11.startsWith(r3)
            if (r8 == 0) goto L_0x025b
            boolean r8 = r0.r(r7, r11)
            if (r8 != 0) goto L_0x0293
            boolean r8 = r7.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x0254
            goto L_0x0293
        L_0x0254:
            boolean r8 = r0.r(r11, r7)
            if (r8 == 0) goto L_0x0290
            goto L_0x028b
        L_0x025b:
            boolean r8 = r0.r(r11, r7)
            if (r8 == 0) goto L_0x0290
            goto L_0x028b
        L_0x0262:
            int r8 = r11.indexOf(r4)
            if (r8 == r2) goto L_0x0278
            int r8 = r7.indexOf(r4)
            int r8 = r8 + r5
            java.lang.String r8 = r11.substring(r8)
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x0290
            goto L_0x028b
        L_0x0278:
            boolean r8 = r11.startsWith(r3)
            if (r8 == 0) goto L_0x0285
            boolean r8 = r0.r(r7, r11)
            if (r8 == 0) goto L_0x0290
            goto L_0x0293
        L_0x0285:
            boolean r8 = r7.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x0290
        L_0x028b:
            r6.add(r7)
            goto L_0x01eb
        L_0x0290:
            r6.add(r7)
        L_0x0293:
            r6.add(r11)
            goto L_0x01eb
        L_0x0298:
            r1 = r6
        L_0x0299:
            r0.c = r1
            goto L_0x02b4
        L_0x029c:
            java.util.Set r1 = r0.f
            s0.a.a.e r11 = r11.c
            s0.a.a.c3.g0 r11 = s0.a.a.c3.g0.s(r11)
            java.util.HashSet r2 = new java.util.HashSet
            if (r1 == 0) goto L_0x02ac
            r2.<init>(r1)
            goto L_0x02af
        L_0x02ac:
            r2.<init>()
        L_0x02af:
            r2.add(r11)
            r0.f = r2
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXNameConstraintValidator.addExcludedSubtree(s0.a.a.c3.y):void");
    }

    public void checkExcluded(w wVar) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.b(wVar);
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkExcludedDN(s sVar) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.c(c.s(sVar));
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermitted(w wVar) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.d(wVar);
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermittedDN(s sVar) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.e(c.s(sVar));
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PKIXNameConstraintValidator)) {
            return false;
        }
        return this.validator.equals(((PKIXNameConstraintValidator) obj).validator);
    }

    public int hashCode() {
        return this.validator.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i) {
        h0 h0Var = this.validator;
        Objects.requireNonNull(h0Var);
        if (i == 0) {
            h0Var.l = new HashSet();
        } else if (i == 1) {
            h0Var.i = new HashSet();
        } else if (i == 2) {
            h0Var.h = new HashSet();
        } else if (i == 4) {
            h0Var.g = new HashSet();
        } else if (i == 6) {
            h0Var.j = new HashSet();
        } else if (i == 7) {
            h0Var.k = new HashSet();
        } else {
            throw new IllegalStateException(a.e0("Unknown tag encountered: ", i));
        }
    }

    public void intersectPermittedSubtree(y yVar) {
        h0 h0Var = this.validator;
        Objects.requireNonNull(h0Var);
        h0Var.j(new y[]{yVar});
    }

    public void intersectPermittedSubtree(y[] yVarArr) {
        this.validator.j(yVarArr);
    }

    public String toString() {
        return this.validator.toString();
    }
}
