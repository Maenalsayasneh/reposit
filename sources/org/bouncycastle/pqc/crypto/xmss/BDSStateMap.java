package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import s0.a.a.n;
import s0.a.f.b.h.g;

public class BDSStateMap implements Serializable {
    public final Map<Integer, BDS> c = new TreeMap();
    public transient long d;

    public BDSStateMap(long j) {
        this.d = j;
    }

    public BDSStateMap(BDSStateMap bDSStateMap, long j) {
        for (Integer next : bDSStateMap.c.keySet()) {
            this.c.put(next, new BDS(bDSStateMap.c.get(next)));
        }
        this.d = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BDSStateMap(s0.a.f.b.h.o r28, long r29, byte[] r31, byte[] r32) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r31
            r3 = r32
            r27.<init>()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r0.c = r4
            int r4 = r1.d
            r5 = 1
            long r7 = r5 << r4
            long r7 = r7 - r5
            r0.d = r7
            r9 = 0
        L_0x001d:
            int r4 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r4 >= 0) goto L_0x0154
            s0.a.f.b.h.s r4 = r1.c
            int r11 = r4.c
            long r12 = r9 >> r11
            long r14 = r5 << r11
            long r14 = r14 - r5
            long r5 = r9 & r14
            int r5 = (int) r5
            s0.a.f.b.h.g$b r6 = new s0.a.f.b.h.g$b
            r6.<init>()
            s0.a.f.b.h.l$a r6 = r6.d(r12)
            s0.a.f.b.h.g$b r6 = (s0.a.f.b.h.g.b) r6
            r6.e = r5
            s0.a.f.b.h.l r6 = r6.e()
            s0.a.f.b.h.g r6 = (s0.a.f.b.h.g) r6
            r16 = 1
            int r7 = r16 << r11
            int r8 = r7 + -1
            r19 = r12
            r12 = 0
            if (r5 >= r8) goto L_0x0086
            java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.BDS> r13 = r0.c
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r13.get(r8)
            org.bouncycastle.pqc.crypto.xmss.BDS r8 = (org.bouncycastle.pqc.crypto.xmss.BDS) r8
            if (r8 == 0) goto L_0x0062
            if (r5 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            r23 = r4
            r8 = r12
            goto L_0x0082
        L_0x0062:
            org.bouncycastle.pqc.crypto.xmss.BDS r5 = new org.bouncycastle.pqc.crypto.xmss.BDS
            s0.a.f.b.h.h r8 = r4.a()
            int r13 = r4.c
            int r12 = r4.d
            int r22 = r16 << r13
            r23 = r4
            int r4 = r22 + -1
            r5.<init>((s0.a.f.b.h.h) r8, (int) r13, (int) r12, (int) r4)
            r5.a(r2, r3, r6)
            java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.BDS> r4 = r0.c
            r8 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r4.put(r12, r5)
        L_0x0082:
            r0.a(r8, r2, r3, r6)
            goto L_0x008b
        L_0x0086:
            r23 = r4
            r21 = r8
            r8 = r12
        L_0x008b:
            r4 = r16
            r12 = r19
        L_0x008f:
            int r5 = r1.e
            if (r4 >= r5) goto L_0x014a
            long r5 = r12 & r14
            int r5 = (int) r5
            long r12 = r12 >> r11
            s0.a.f.b.h.g$b r6 = new s0.a.f.b.h.g$b
            r6.<init>()
            s0.a.f.b.h.l$a r6 = r6.c(r4)
            s0.a.f.b.h.g$b r6 = (s0.a.f.b.h.g.b) r6
            s0.a.f.b.h.l$a r6 = r6.d(r12)
            s0.a.f.b.h.g$b r6 = (s0.a.f.b.h.g.b) r6
            r6.e = r5
            s0.a.f.b.h.l r6 = r6.e()
            s0.a.f.b.h.g r6 = (s0.a.f.b.h.g) r6
            java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.BDS> r8 = r0.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r8.get(r1)
            if (r1 == 0) goto L_0x00ea
            r17 = 0
            int r1 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x00c8
            r1 = r11
            r19 = r12
            r24 = r14
            goto L_0x00df
        L_0x00c8:
            r1 = r11
            r19 = r12
            double r11 = (double) r7
            int r8 = r4 + 1
            r24 = r14
            double r13 = (double) r8
            double r11 = java.lang.Math.pow(r11, r13)
            long r11 = (long) r11
            long r11 = r9 % r11
            int r8 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r8 != 0) goto L_0x00df
            r8 = r16
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r8 == 0) goto L_0x00e3
            goto L_0x00ef
        L_0x00e3:
            r22 = r1
            r1 = r21
            r26 = r23
            goto L_0x0114
        L_0x00ea:
            r1 = r11
            r19 = r12
            r24 = r14
        L_0x00ef:
            java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.BDS> r8 = r0.c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            org.bouncycastle.pqc.crypto.xmss.BDS r12 = new org.bouncycastle.pqc.crypto.xmss.BDS
            s0.a.f.b.h.h r13 = r23.a()
            r14 = r23
            int r15 = r14.c
            r22 = r1
            int r1 = r14.d
            int r23 = r16 << r15
            r26 = r14
            int r14 = r23 + -1
            r12.<init>((s0.a.f.b.h.h) r13, (int) r15, (int) r1, (int) r14)
            r12.a(r2, r3, r6)
            r8.put(r11, r12)
            r1 = r21
        L_0x0114:
            r11 = 0
            if (r5 >= r1) goto L_0x0139
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x011d
            goto L_0x0133
        L_0x011d:
            r13 = 1
            long r17 = r9 + r13
            double r13 = (double) r7
            double r11 = (double) r4
            double r11 = java.lang.Math.pow(r13, r11)
            long r11 = (long) r11
            long r17 = r17 % r11
            r11 = 0
            int r5 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0133
            r5 = r16
            goto L_0x0134
        L_0x0133:
            r5 = 0
        L_0x0134:
            if (r5 == 0) goto L_0x0139
            r0.a(r4, r2, r3, r6)
        L_0x0139:
            int r4 = r4 + 1
            r21 = r1
            r12 = r19
            r11 = r22
            r14 = r24
            r23 = r26
            r8 = 0
            r1 = r28
            goto L_0x008f
        L_0x014a:
            r4 = 1
            r11 = 0
            long r9 = r9 + r4
            r1 = r28
            r5 = r4
            goto L_0x001d
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.xmss.BDSStateMap.<init>(s0.a.f.b.h.o, long, byte[], byte[]):void");
    }

    public BDS a(int i, byte[] bArr, byte[] bArr2, g gVar) {
        return this.c.put(Integer.valueOf(i), new BDS(this.c.get(Integer.valueOf(i)), bArr, bArr2, gVar));
    }

    public BDSStateMap b(n nVar) {
        BDSStateMap bDSStateMap = new BDSStateMap(this.d);
        for (Integer next : this.c.keySet()) {
            Map<Integer, BDS> map = bDSStateMap.c;
            BDS bds = this.c.get(next);
            Objects.requireNonNull(bds);
            map.put(next, new BDS(bds, nVar));
        }
        return bDSStateMap;
    }
}
