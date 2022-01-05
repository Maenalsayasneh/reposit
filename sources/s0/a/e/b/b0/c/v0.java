package s0.a.e.b.b0.c;

import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class v0 extends h.c {
    public v0(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public v0(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (s0.a.e.b.b0.c.h3.f1(16, r10, s0.a.e.b.b0.c.t0.b) != false) goto L_0x0116;
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
            s0.a.e.b.b0.c.u0 r3 = (s0.a.e.b.b0.c.u0) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.u0 r4 = (s0.a.e.b.b0.c.u0) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.u0 r5 = (s0.a.e.b.b0.c.u0) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.u0 r6 = (s0.a.e.b.b0.c.u0) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.u0 r7 = (s0.a.e.b.b0.c.u0) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.u0 r1 = (s0.a.e.b.b0.c.u0) r1
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
            s0.a.e.b.b0.c.t0.g(r8, r13)
            int[] r5 = r5.h
            s0.a.e.b.b0.c.t0.d(r13, r5, r12)
            int[] r5 = r7.h
            s0.a.e.b.b0.c.t0.d(r13, r5, r13)
            int[] r5 = r6.h
            s0.a.e.b.b0.c.t0.d(r13, r5, r13)
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
            s0.a.e.b.b0.c.t0.g(r9, r14)
            int[] r3 = r3.h
            s0.a.e.b.b0.c.t0.d(r14, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.c.t0.d(r14, r3, r14)
            int[] r3 = r4.h
            s0.a.e.b.b0.c.t0.d(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.c.t0.i(r3, r5, r9)
            s0.a.e.b.b0.c.t0.i(r4, r6, r12)
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
            s0.a.e.b.b0.c.t0.e(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.x2(r13, r9, r11)
            s0.a.e.b.b0.c.t0.e(r11, r6)
            s0.a.e.b.b0.c.t0.d(r13, r3, r13)
            int r3 = s0.a.e.b.b0.c.t0.c(r6)
            if (r3 == 0) goto L_0x00c9
            int[] r3 = s0.a.e.b.b0.c.t0.a
            s0.a.e.b.b0.c.h3.e3(r3, r3, r6)
            goto L_0x00ce
        L_0x00c9:
            int[] r3 = s0.a.e.b.b0.c.t0.a
            s0.a.e.b.b0.c.h3.e3(r3, r6, r6)
        L_0x00ce:
            s0.a.e.b.b0.c.h3.x2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.o(r13, r13, r6)
            s0.a.e.b.b0.c.t0.f(r3, r6)
            s0.a.e.b.b0.c.u0 r3 = new s0.a.e.b.b0.c.u0
            r3.<init>((int[]) r14)
            r4 = 16
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.U2(r12, r5)
            s0.a.e.b.b0.c.t0.e(r5, r14)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.t0.i(r4, r6, r4)
            s0.a.e.b.b0.c.u0 r4 = new s0.a.e.b.b0.c.u0
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            s0.a.e.b.b0.c.t0.i(r13, r5, r6)
            int[] r5 = r4.h
            int r5 = s0.a.e.b.b0.c.h3.B2(r5, r12, r10)
            r6 = 1
            if (r5 != 0) goto L_0x0114
            r5 = 15
            r5 = r10[r5]
            int r5 = r5 >>> r6
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r5 < r11) goto L_0x011b
            int[] r5 = s0.a.e.b.b0.c.t0.b
            r11 = 16
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r11, r10, r5)
            if (r5 == 0) goto L_0x011b
            goto L_0x0116
        L_0x0114:
            r11 = 16
        L_0x0116:
            int[] r5 = s0.a.e.b.b0.c.t0.b
            s0.a.e.b.b0.c.h3.g3(r11, r5, r10)
        L_0x011b:
            int[] r5 = r4.h
            s0.a.e.b.b0.c.t0.e(r10, r5)
            s0.a.e.b.b0.c.u0 r5 = new s0.a.e.b.b0.c.u0
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x012c
            int[] r7 = r7.h
            s0.a.e.b.b0.c.t0.d(r9, r7, r9)
        L_0x012c:
            if (r8 != 0) goto L_0x0135
            int[] r7 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.c.t0.d(r7, r1, r7)
        L_0x0135:
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r6]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.v0 r5 = new s0.a.e.b.b0.c.v0
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.v0.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new v0((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new v0(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        u0 u0Var = (u0) this.d;
        if (u0Var.i()) {
            return eVar.m();
        }
        u0 u0Var2 = (u0) this.c;
        u0 u0Var3 = (u0) this.e[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        t0.g(u0Var.h, iArr3);
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[16];
        h3.U2(iArr3, iArr5);
        t0.e(iArr5, iArr4);
        boolean h = u0Var3.h();
        int[] iArr6 = u0Var3.h;
        if (!h) {
            t0.g(iArr6, iArr2);
            iArr6 = iArr2;
        }
        t0.i(u0Var2.h, iArr6, iArr);
        t0.a(u0Var2.h, iArr6, iArr2);
        int[] iArr7 = new int[16];
        h3.x2(iArr2, iArr, iArr7);
        t0.e(iArr7, iArr2);
        t0.f(h3.o(iArr2, iArr2, iArr2), iArr2);
        t0.d(iArr3, u0Var2.h, iArr3);
        t0.f(h3.N2(8, iArr3, 2, 0), iArr3);
        t0.f(h3.O2(8, iArr4, 3, 0, iArr), iArr);
        u0 u0Var4 = new u0(iArr4);
        int[] iArr8 = new int[16];
        h3.U2(iArr2, iArr8);
        t0.e(iArr8, iArr4);
        int[] iArr9 = u0Var4.h;
        t0.i(iArr9, iArr3, iArr9);
        int[] iArr10 = u0Var4.h;
        t0.i(iArr10, iArr3, iArr10);
        u0 u0Var5 = new u0(iArr3);
        t0.i(iArr3, u0Var4.h, iArr3);
        int[] iArr11 = u0Var5.h;
        int[] iArr12 = new int[16];
        h3.x2(iArr11, iArr2, iArr12);
        t0.e(iArr12, iArr11);
        int[] iArr13 = u0Var5.h;
        t0.i(iArr13, iArr, iArr13);
        u0 u0Var6 = new u0(iArr2);
        if (h3.M2(8, u0Var.h, 0, iArr2) != 0 || (iArr2[7] == -1 && h3.k1(iArr2, t0.a))) {
            t0.b(iArr2);
        }
        if (!h) {
            int[] iArr14 = u0Var6.h;
            t0.d(iArr14, u0Var3.h, iArr14);
        }
        return new v0(eVar, u0Var4, u0Var5, new g[]{u0Var6});
    }
}
