package s0.a.e.b.b0.c;

import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class q0 extends h.c {
    public q0(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public q0(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0117, code lost:
        if (s0.a.e.b.b0.c.h3.f1(16, r10, s0.a.e.b.b0.c.o0.b) != false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013c  */
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
            s0.a.e.b.b0.c.p0 r3 = (s0.a.e.b.b0.c.p0) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.p0 r4 = (s0.a.e.b.b0.c.p0) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.p0 r5 = (s0.a.e.b.b0.c.p0) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.p0 r6 = (s0.a.e.b.b0.c.p0) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.p0 r7 = (s0.a.e.b.b0.c.p0) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.p0 r1 = (s0.a.e.b.b0.c.p0) r1
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
            s0.a.e.b.b0.c.o0.e(r8, r13)
            int[] r5 = r5.h
            s0.a.e.b.b0.c.o0.b(r13, r5, r12)
            int[] r5 = r7.h
            s0.a.e.b.b0.c.o0.b(r13, r5, r13)
            int[] r5 = r6.h
            s0.a.e.b.b0.c.o0.b(r13, r5, r13)
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
            s0.a.e.b.b0.c.o0.e(r9, r14)
            int[] r3 = r3.h
            s0.a.e.b.b0.c.o0.b(r14, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.c.o0.b(r14, r3, r14)
            int[] r3 = r4.h
            s0.a.e.b.b0.c.o0.b(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.c.o0.g(r3, r5, r9)
            s0.a.e.b.b0.c.o0.g(r4, r6, r12)
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
            s0.a.e.b.b0.c.o0.c(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.x2(r13, r9, r11)
            s0.a.e.b.b0.c.o0.c(r11, r6)
            s0.a.e.b.b0.c.o0.b(r13, r3, r13)
            int r3 = s0.a.e.b.b0.c.o0.a(r6)
            if (r3 == 0) goto L_0x00c9
            int[] r3 = s0.a.e.b.b0.c.o0.a
            s0.a.e.b.b0.c.h3.e3(r3, r3, r6)
            goto L_0x00ce
        L_0x00c9:
            int[] r3 = s0.a.e.b.b0.c.o0.a
            s0.a.e.b.b0.c.h3.e3(r3, r6, r6)
        L_0x00ce:
            s0.a.e.b.b0.c.h3.x2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.o(r13, r13, r6)
            s0.a.e.b.b0.c.o0.d(r3, r6)
            s0.a.e.b.b0.c.p0 r3 = new s0.a.e.b.b0.c.p0
            r3.<init>((int[]) r14)
            r4 = 16
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.U2(r12, r5)
            s0.a.e.b.b0.c.o0.c(r5, r14)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.o0.g(r4, r6, r4)
            s0.a.e.b.b0.c.p0 r4 = new s0.a.e.b.b0.c.p0
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            int r5 = s0.a.e.b.b0.c.h3.e3(r13, r5, r6)
            if (r5 == 0) goto L_0x0100
            r5 = 977(0x3d1, float:1.369E-42)
            r11 = 8
            s0.a.e.b.b0.c.h3.d3(r11, r5, r6)
        L_0x0100:
            int[] r5 = r4.h
            int r5 = s0.a.e.b.b0.c.h3.B2(r5, r12, r10)
            if (r5 != 0) goto L_0x011a
            r5 = 15
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x0129
            int[] r5 = s0.a.e.b.b0.c.o0.b
            r6 = 16
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r6, r10, r5)
            if (r5 == 0) goto L_0x0129
            goto L_0x011c
        L_0x011a:
            r6 = 16
        L_0x011c:
            int[] r5 = s0.a.e.b.b0.c.o0.c
            int r11 = r5.length
            int r11 = s0.a.e.b.b0.c.h3.q(r11, r5, r10)
            if (r11 == 0) goto L_0x0129
            int r5 = r5.length
            s0.a.e.b.b0.c.h3.z1(r6, r10, r5)
        L_0x0129:
            int[] r5 = r4.h
            s0.a.e.b.b0.c.o0.c(r10, r5)
            s0.a.e.b.b0.c.p0 r5 = new s0.a.e.b.b0.c.p0
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x013a
            int[] r6 = r7.h
            s0.a.e.b.b0.c.o0.b(r9, r6, r9)
        L_0x013a:
            if (r8 != 0) goto L_0x0143
            int[] r6 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.c.o0.b(r6, r1, r6)
        L_0x0143:
            r1 = 1
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r1]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.q0 r5 = new s0.a.e.b.b0.c.q0
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.q0.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new q0((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new q0(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        p0 p0Var = (p0) this.d;
        if (p0Var.i()) {
            return eVar.m();
        }
        p0 p0Var2 = (p0) this.c;
        p0 p0Var3 = (p0) this.e[0];
        int[] iArr = new int[8];
        o0.e(p0Var.h, iArr);
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[16];
        h3.U2(iArr, iArr3);
        o0.c(iArr3, iArr2);
        int[] iArr4 = new int[8];
        o0.e(p0Var2.h, iArr4);
        o0.d(h3.o(iArr4, iArr4, iArr4), iArr4);
        o0.b(iArr, p0Var2.h, iArr);
        o0.d(h3.N2(8, iArr, 2, 0), iArr);
        int[] iArr5 = new int[8];
        o0.d(h3.O2(8, iArr2, 3, 0, iArr5), iArr5);
        p0 p0Var4 = new p0(iArr2);
        int[] iArr6 = new int[16];
        h3.U2(iArr4, iArr6);
        o0.c(iArr6, iArr2);
        int[] iArr7 = p0Var4.h;
        o0.g(iArr7, iArr, iArr7);
        int[] iArr8 = p0Var4.h;
        o0.g(iArr8, iArr, iArr8);
        p0 p0Var5 = new p0(iArr);
        if (h3.e3(iArr, p0Var4.h, iArr) != 0) {
            h3.d3(8, 977, iArr);
        }
        int[] iArr9 = p0Var5.h;
        int[] iArr10 = new int[16];
        h3.x2(iArr9, iArr4, iArr10);
        o0.c(iArr10, iArr9);
        int[] iArr11 = p0Var5.h;
        o0.g(iArr11, iArr5, iArr11);
        p0 p0Var6 = new p0(iArr4);
        if (h3.M2(8, p0Var.h, 0, iArr4) != 0 || (iArr4[7] == -1 && h3.k1(iArr4, o0.a))) {
            h3.h(8, 977, iArr4);
        }
        if (!p0Var3.h()) {
            int[] iArr12 = p0Var6.h;
            o0.b(iArr12, p0Var3.h, iArr12);
        }
        return new q0(eVar, p0Var4, p0Var5, new g[]{p0Var6});
    }
}
