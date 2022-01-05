package s0.a.e.b.b0.a;

import s0.a.e.b.b0.c.h3;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class e extends h.c {
    public e(s0.a.e.b.e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public e(s0.a.e.b.e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : D(false).a(hVar);
    }

    public d B(d dVar, int[] iArr) {
        d dVar2 = (d) this.b.b;
        if (dVar.h()) {
            return dVar2;
        }
        d dVar3 = new d();
        if (iArr == null) {
            iArr = dVar3.i;
            c.e(dVar.i, iArr);
        }
        c.e(iArr, dVar3.i);
        int[] iArr2 = dVar3.i;
        c.b(iArr2, dVar2.i, iArr2);
        return dVar3;
    }

    public d C() {
        g[] gVarArr = this.e;
        d dVar = (d) gVarArr[1];
        if (dVar != null) {
            return dVar;
        }
        d B = B((d) gVarArr[0], (int[]) null);
        gVarArr[1] = B;
        return B;
    }

    public e D(boolean z) {
        d dVar = (d) this.c;
        d dVar2 = (d) this.d;
        d dVar3 = (d) this.e[0];
        d C = C();
        int[] iArr = new int[8];
        c.e(dVar.i, iArr);
        int o = h3.o(iArr, iArr, iArr);
        int[] iArr2 = C.i;
        long j = (((long) iArr2[0]) & 4294967295L) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j;
        d dVar4 = C;
        long j2 = (((long) iArr2[1]) & 4294967295L) + (((long) iArr[1]) & 4294967295L) + (j >>> 32);
        iArr[1] = (int) j2;
        long j3 = (((long) iArr2[2]) & 4294967295L) + (((long) iArr[2]) & 4294967295L) + (j2 >>> 32);
        iArr[2] = (int) j3;
        long j4 = (((long) iArr2[3]) & 4294967295L) + (((long) iArr[3]) & 4294967295L) + (j3 >>> 32);
        iArr[3] = (int) j4;
        long j5 = (((long) iArr2[4]) & 4294967295L) + (((long) iArr[4]) & 4294967295L) + (j4 >>> 32);
        iArr[4] = (int) j5;
        long j6 = (((long) iArr2[5]) & 4294967295L) + (((long) iArr[5]) & 4294967295L) + (j5 >>> 32);
        iArr[5] = (int) j6;
        long j7 = (((long) iArr2[6]) & 4294967295L) + (((long) iArr[6]) & 4294967295L) + (j6 >>> 32);
        iArr[6] = (int) j7;
        long j8 = (((long) iArr2[7]) & 4294967295L) + (((long) iArr[7]) & 4294967295L) + (j7 >>> 32);
        iArr[7] = (int) j8;
        c.d(o + ((int) (j8 >>> 32)), iArr);
        int[] iArr3 = new int[8];
        c.i(dVar2.i, iArr3);
        int[] iArr4 = new int[8];
        c.b(iArr3, dVar2.i, iArr4);
        int[] iArr5 = new int[8];
        c.b(iArr4, dVar.i, iArr5);
        c.i(iArr5, iArr5);
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[16];
        h3.U2(iArr4, iArr7);
        c.c(iArr7, iArr6);
        c.i(iArr6, iArr6);
        d dVar5 = new d(iArr4);
        int[] iArr8 = new int[16];
        h3.U2(iArr, iArr8);
        c.c(iArr8, iArr4);
        int[] iArr9 = dVar5.i;
        c.h(iArr9, iArr5, iArr9);
        int[] iArr10 = dVar5.i;
        c.h(iArr10, iArr5, iArr10);
        d dVar6 = new d(iArr5);
        c.h(iArr5, dVar5.i, iArr5);
        int[] iArr11 = dVar6.i;
        int[] iArr12 = new int[16];
        h3.x2(iArr11, iArr, iArr12);
        c.c(iArr12, iArr11);
        int[] iArr13 = dVar6.i;
        c.h(iArr13, iArr6, iArr13);
        d dVar7 = new d(iArr3);
        if (!h3.N1(dVar3.i)) {
            int[] iArr14 = dVar7.i;
            c.b(iArr14, dVar3.i, iArr14);
        }
        d dVar8 = null;
        if (z) {
            dVar8 = new d(iArr6);
            c.b(iArr6, dVar4.i, iArr6);
            int[] iArr15 = dVar8.i;
            c.i(iArr15, iArr15);
        }
        return new e(this.b, dVar5, dVar6, new g[]{dVar7, dVar8});
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s0.a.e.b.h a(s0.a.e.b.h r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r24.m()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r25.m()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            s0.a.e.b.h r1 = r24.z()
            return r1
        L_0x0019:
            s0.a.e.b.e r2 = r0.b
            s0.a.e.b.g r3 = r0.c
            s0.a.e.b.b0.a.d r3 = (s0.a.e.b.b0.a.d) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.a.d r4 = (s0.a.e.b.b0.a.d) r4
            s0.a.e.b.g[] r5 = r0.e
            r6 = 0
            r5 = r5[r6]
            s0.a.e.b.b0.a.d r5 = (s0.a.e.b.b0.a.d) r5
            s0.a.e.b.g r7 = r1.c
            s0.a.e.b.b0.a.d r7 = (s0.a.e.b.b0.a.d) r7
            s0.a.e.b.g r8 = r25.j()
            s0.a.e.b.b0.a.d r8 = (s0.a.e.b.b0.a.d) r8
            s0.a.e.b.g r1 = r1.k(r6)
            s0.a.e.b.b0.a.d r1 = (s0.a.e.b.b0.a.d) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r5.h()
            if (r15 == 0) goto L_0x0051
            int[] r7 = r7.i
            int[] r8 = r8.i
            goto L_0x0067
        L_0x0051:
            int[] r6 = r5.i
            s0.a.e.b.b0.a.c.e(r6, r13)
            int[] r6 = r7.i
            s0.a.e.b.b0.a.c.b(r13, r6, r12)
            int[] r6 = r5.i
            s0.a.e.b.b0.a.c.b(r13, r6, r13)
            int[] r6 = r8.i
            s0.a.e.b.b0.a.c.b(r13, r6, r13)
            r7 = r12
            r8 = r13
        L_0x0067:
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x0072
            int[] r3 = r3.i
            int[] r4 = r4.i
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.i
            s0.a.e.b.b0.a.c.e(r9, r14)
            int[] r3 = r3.i
            s0.a.e.b.b0.a.c.b(r14, r3, r10)
            int[] r3 = r1.i
            s0.a.e.b.b0.a.c.b(r14, r3, r14)
            int[] r3 = r4.i
            s0.a.e.b.b0.a.c.b(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.a.c.h(r3, r7, r9)
            s0.a.e.b.b0.a.c.h(r4, r8, r12)
            boolean r7 = s0.a.e.b.b0.c.h3.X1(r9)
            if (r7 == 0) goto L_0x00a6
            boolean r1 = s0.a.e.b.b0.c.h3.X1(r12)
            if (r1 == 0) goto L_0x00a1
            s0.a.e.b.h r1 = r24.z()
            return r1
        L_0x00a1:
            s0.a.e.b.h r1 = r2.m()
            return r1
        L_0x00a6:
            int[] r7 = new int[r11]
            r8 = 16
            int[] r11 = new int[r8]
            s0.a.e.b.b0.c.h3.U2(r9, r11)
            s0.a.e.b.b0.a.c.c(r11, r7)
            r17 = r2
            r11 = 8
            int[] r2 = new int[r11]
            int[] r11 = new int[r8]
            s0.a.e.b.b0.c.h3.x2(r7, r9, r11)
            s0.a.e.b.b0.a.c.c(r11, r2)
            s0.a.e.b.b0.a.c.b(r7, r3, r13)
            int r3 = s0.a.e.b.b0.a.c.a(r2)
            if (r3 == 0) goto L_0x00cf
            int[] r3 = s0.a.e.b.b0.a.c.a
            s0.a.e.b.b0.c.h3.e3(r3, r3, r2)
            goto L_0x00d4
        L_0x00cf:
            int[] r3 = s0.a.e.b.b0.a.c.a
            s0.a.e.b.b0.c.h3.e3(r3, r2, r2)
        L_0x00d4:
            s0.a.e.b.b0.c.h3.x2(r4, r2, r10)
            int r3 = s0.a.e.b.b0.c.h3.o(r13, r13, r2)
            s0.a.e.b.b0.a.c.d(r3, r2)
            s0.a.e.b.b0.a.d r3 = new s0.a.e.b.b0.a.d
            r3.<init>((int[]) r14)
            r4 = 16
            int[] r8 = new int[r4]
            s0.a.e.b.b0.c.h3.U2(r12, r8)
            s0.a.e.b.b0.a.c.c(r8, r14)
            int[] r4 = r3.i
            s0.a.e.b.b0.a.c.h(r4, r2, r4)
            s0.a.e.b.b0.a.d r4 = new s0.a.e.b.b0.a.d
            r4.<init>((int[]) r2)
            int[] r8 = r3.i
            s0.a.e.b.b0.a.c.h(r13, r8, r2)
            int[] r2 = r4.i
            s0.a.e.b.b0.c.h3.B2(r2, r12, r10)
            int[] r2 = s0.a.e.b.b0.a.c.b
            r8 = 16
            boolean r8 = s0.a.e.b.b0.c.h3.f1(r8, r10, r2)
            r11 = 1
            if (r8 == 0) goto L_0x0169
            r8 = 0
            r12 = r10[r8]
            long r12 = (long) r12
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r18
            r14 = r2[r8]
            r25 = r9
            long r8 = (long) r14
            long r8 = r8 & r18
            long r12 = r12 - r8
            int r8 = (int) r12
            r9 = 0
            r10[r9] = r8
            r8 = 32
            long r12 = r12 >> r8
            r20 = 0
            int r9 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r9 == 0) goto L_0x0134
            r9 = 8
            int r12 = s0.a.e.b.b0.c.h3.v0(r9, r10, r11)
            long r12 = (long) r12
            goto L_0x0136
        L_0x0134:
            r9 = 8
        L_0x0136:
            r14 = r10[r9]
            long r8 = (long) r14
            long r8 = r8 & r18
            r22 = 19
            long r8 = r8 + r22
            long r8 = r8 + r12
            int r12 = (int) r8
            r13 = 8
            r10[r13] = r12
            r12 = 32
            long r8 = r8 >> r12
            int r12 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            r13 = 15
            if (r12 == 0) goto L_0x0155
            r8 = 9
            int r8 = s0.a.e.b.b0.c.h3.z1(r13, r10, r8)
            long r8 = (long) r8
        L_0x0155:
            r12 = r10[r13]
            long r11 = (long) r12
            long r11 = r11 & r18
            r2 = r2[r13]
            r14 = 1
            int r2 = r2 + r14
            r16 = r15
            long r14 = (long) r2
            long r14 = r14 & r18
            long r11 = r11 - r14
            long r11 = r11 + r8
            int r2 = (int) r11
            r10[r13] = r2
            goto L_0x016d
        L_0x0169:
            r25 = r9
            r16 = r15
        L_0x016d:
            int[] r2 = r4.i
            s0.a.e.b.b0.a.c.c(r10, r2)
            s0.a.e.b.b0.a.d r2 = new s0.a.e.b.b0.a.d
            r8 = r25
            r2.<init>((int[]) r8)
            if (r16 != 0) goto L_0x0180
            int[] r5 = r5.i
            s0.a.e.b.b0.a.c.b(r8, r5, r8)
        L_0x0180:
            if (r6 != 0) goto L_0x0189
            int[] r5 = r2.i
            int[] r1 = r1.i
            s0.a.e.b.b0.a.c.b(r5, r1, r5)
        L_0x0189:
            if (r16 == 0) goto L_0x018e
            if (r6 == 0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r7 = 0
        L_0x018f:
            s0.a.e.b.b0.a.d r1 = r0.B(r2, r7)
            r5 = 2
            s0.a.e.b.g[] r5 = new s0.a.e.b.g[r5]
            r6 = 0
            r5[r6] = r2
            r2 = 1
            r5[r2] = r1
            s0.a.e.b.b0.a.e r1 = new s0.a.e.b.b0.a.e
            r2 = r17
            r1.<init>(r2, r3, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.a.e.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new e((s0.a.e.b.e) null, d(), e());
    }

    public g k(int i) {
        return i == 1 ? C() : super.k(i);
    }

    public h p() {
        if (m()) {
            return this;
        }
        return new e(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (!m() && !this.d.i()) ? D(false).a(this) : this;
    }

    public h z() {
        if (m()) {
            return this;
        }
        return this.d.i() ? this.b.m() : D(true);
    }
}
