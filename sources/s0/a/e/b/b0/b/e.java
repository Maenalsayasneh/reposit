package s0.a.e.b.b0.b;

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
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (s0.a.e.b.b0.c.h3.f1(16, r10, s0.a.e.b.b0.b.c.b) != false) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s0.a.e.b.h a(s0.a.e.b.h r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.m()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r17.m()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            s0.a.e.b.h r1 = r16.z()
            return r1
        L_0x0019:
            s0.a.e.b.e r2 = r0.b
            s0.a.e.b.g r3 = r0.c
            s0.a.e.b.b0.b.d r3 = (s0.a.e.b.b0.b.d) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.b.d r4 = (s0.a.e.b.b0.b.d) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.b.d r5 = (s0.a.e.b.b0.b.d) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.b.d r6 = (s0.a.e.b.b0.b.d) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.b.d r7 = (s0.a.e.b.b0.b.d) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.b.d r1 = (s0.a.e.b.b0.b.d) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.h()
            if (r15 == 0) goto L_0x0051
            int[] r5 = r5.h
            int[] r6 = r6.h
            goto L_0x0067
        L_0x0051:
            int[] r8 = r7.h
            s0.a.e.b.b0.b.c.g(r8, r13)
            int[] r5 = r5.h
            s0.a.e.b.b0.b.c.d(r13, r5, r12)
            int[] r5 = r7.h
            s0.a.e.b.b0.b.c.d(r13, r5, r13)
            int[] r5 = r6.h
            s0.a.e.b.b0.b.c.d(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0067:
            boolean r8 = r1.h()
            if (r8 == 0) goto L_0x0072
            int[] r3 = r3.h
            int[] r4 = r4.h
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.h
            s0.a.e.b.b0.b.c.g(r9, r14)
            int[] r3 = r3.h
            s0.a.e.b.b0.b.c.d(r14, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.b.c.d(r14, r3, r14)
            int[] r3 = r4.h
            s0.a.e.b.b0.b.c.d(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.b.c.i(r3, r5, r9)
            s0.a.e.b.b0.b.c.i(r4, r6, r12)
            boolean r5 = s0.a.e.b.b0.c.h3.X1(r9)
            if (r5 == 0) goto L_0x00a6
            boolean r1 = s0.a.e.b.b0.c.h3.X1(r12)
            if (r1 == 0) goto L_0x00a1
            s0.a.e.b.h r1 = r16.z()
            return r1
        L_0x00a1:
            s0.a.e.b.h r1 = r2.m()
            return r1
        L_0x00a6:
            r5 = 16
            int[] r6 = new int[r5]
            s0.a.e.b.b0.c.h3.U2(r9, r6)
            s0.a.e.b.b0.b.c.e(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.x2(r13, r9, r11)
            s0.a.e.b.b0.b.c.e(r11, r6)
            s0.a.e.b.b0.b.c.d(r13, r3, r13)
            int r3 = s0.a.e.b.b0.b.c.c(r6)
            if (r3 == 0) goto L_0x00c9
            int[] r3 = s0.a.e.b.b0.b.c.a
            s0.a.e.b.b0.c.h3.e3(r3, r3, r6)
            goto L_0x00ce
        L_0x00c9:
            int[] r3 = s0.a.e.b.b0.b.c.a
            s0.a.e.b.b0.c.h3.e3(r3, r6, r6)
        L_0x00ce:
            s0.a.e.b.b0.c.h3.x2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.o(r13, r13, r6)
            s0.a.e.b.b0.b.c.f(r3, r6)
            s0.a.e.b.b0.b.d r3 = new s0.a.e.b.b0.b.d
            r3.<init>((int[]) r14)
            r4 = 16
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.U2(r12, r5)
            s0.a.e.b.b0.b.c.e(r5, r14)
            int[] r4 = r3.h
            s0.a.e.b.b0.b.c.i(r4, r6, r4)
            s0.a.e.b.b0.b.d r4 = new s0.a.e.b.b0.b.d
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            s0.a.e.b.b0.b.c.i(r13, r5, r6)
            int[] r5 = r4.h
            int r5 = s0.a.e.b.b0.c.h3.B2(r5, r12, r10)
            r6 = 1
            if (r5 != 0) goto L_0x0114
            r5 = 15
            r5 = r10[r5]
            int r5 = r5 >>> r6
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r5 < r11) goto L_0x011b
            int[] r5 = s0.a.e.b.b0.b.c.b
            r11 = 16
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r11, r10, r5)
            if (r5 == 0) goto L_0x011b
            goto L_0x0116
        L_0x0114:
            r11 = 16
        L_0x0116:
            int[] r5 = s0.a.e.b.b0.b.c.b
            s0.a.e.b.b0.c.h3.g3(r11, r5, r10)
        L_0x011b:
            int[] r5 = r4.h
            s0.a.e.b.b0.b.c.e(r10, r5)
            s0.a.e.b.b0.b.d r5 = new s0.a.e.b.b0.b.d
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x012c
            int[] r7 = r7.h
            s0.a.e.b.b0.b.c.d(r9, r7, r9)
        L_0x012c:
            if (r8 != 0) goto L_0x0135
            int[] r7 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.b.c.d(r7, r1, r7)
        L_0x0135:
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r6]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.b.e r5 = new s0.a.e.b.b0.b.e
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.b.e.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new e((s0.a.e.b.e) null, d(), e());
    }

    public h p() {
        return m() ? this : new e(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        s0.a.e.b.e eVar = this.b;
        d dVar = (d) this.d;
        if (dVar.i()) {
            return eVar.m();
        }
        d dVar2 = (d) this.c;
        d dVar3 = (d) this.e[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        c.g(dVar.h, iArr3);
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[16];
        h3.U2(iArr3, iArr5);
        c.e(iArr5, iArr4);
        boolean h = dVar3.h();
        int[] iArr6 = dVar3.h;
        if (!h) {
            c.g(iArr6, iArr2);
            iArr6 = iArr2;
        }
        c.i(dVar2.h, iArr6, iArr);
        c.a(dVar2.h, iArr6, iArr2);
        int[] iArr7 = new int[16];
        h3.x2(iArr2, iArr, iArr7);
        c.e(iArr7, iArr2);
        c.f(h3.o(iArr2, iArr2, iArr2), iArr2);
        c.d(iArr3, dVar2.h, iArr3);
        c.f(h3.N2(8, iArr3, 2, 0), iArr3);
        c.f(h3.O2(8, iArr4, 3, 0, iArr), iArr);
        d dVar4 = new d(iArr4);
        int[] iArr8 = new int[16];
        h3.U2(iArr2, iArr8);
        c.e(iArr8, iArr4);
        int[] iArr9 = dVar4.h;
        c.i(iArr9, iArr3, iArr9);
        int[] iArr10 = dVar4.h;
        c.i(iArr10, iArr3, iArr10);
        d dVar5 = new d(iArr3);
        c.i(iArr3, dVar4.h, iArr3);
        int[] iArr11 = dVar5.h;
        int[] iArr12 = new int[16];
        h3.x2(iArr11, iArr2, iArr12);
        c.e(iArr12, iArr11);
        int[] iArr13 = dVar5.h;
        c.i(iArr13, iArr, iArr13);
        d dVar6 = new d(iArr2);
        if (h3.M2(8, dVar.h, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h3.k1(iArr2, c.a))) {
            c.b(iArr2);
        }
        if (!h) {
            int[] iArr14 = dVar6.h;
            c.d(iArr14, dVar3.h, iArr14);
        }
        return new e(eVar, dVar4, dVar5, new g[]{dVar6});
    }
}
