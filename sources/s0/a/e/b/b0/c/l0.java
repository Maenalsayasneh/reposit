package s0.a.e.b.b0.c;

import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class l0 extends h.c {
    public l0(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public l0(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fe, code lost:
        if (s0.a.e.b.b0.c.h3.f1(14, r10, s0.a.e.b.b0.c.j0.b) != false) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123  */
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
            s0.a.e.b.b0.c.k0 r3 = (s0.a.e.b.b0.c.k0) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.k0 r4 = (s0.a.e.b.b0.c.k0) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.k0 r5 = (s0.a.e.b.b0.c.k0) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.k0 r6 = (s0.a.e.b.b0.c.k0) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.k0 r7 = (s0.a.e.b.b0.c.k0) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.k0 r1 = (s0.a.e.b.b0.c.k0) r1
            r9 = 14
            int[] r10 = new int[r9]
            r11 = 7
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.h()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.h
            int[] r6 = r6.h
            goto L_0x0066
        L_0x0050:
            int[] r8 = r7.h
            s0.a.e.b.b0.c.j0.i(r8, r13)
            int[] r5 = r5.h
            s0.a.e.b.b0.c.j0.e(r13, r5, r12)
            int[] r5 = r7.h
            s0.a.e.b.b0.c.j0.e(r13, r5, r13)
            int[] r5 = r6.h
            s0.a.e.b.b0.c.j0.e(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r8 = r1.h()
            if (r8 == 0) goto L_0x0071
            int[] r3 = r3.h
            int[] r4 = r4.h
            goto L_0x0087
        L_0x0071:
            int[] r9 = r1.h
            s0.a.e.b.b0.c.j0.i(r9, r14)
            int[] r3 = r3.h
            s0.a.e.b.b0.c.j0.e(r14, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.c.j0.e(r14, r3, r14)
            int[] r3 = r4.h
            s0.a.e.b.b0.c.j0.e(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.c.j0.j(r3, r5, r9)
            s0.a.e.b.b0.c.j0.j(r4, r6, r12)
            boolean r5 = s0.a.e.b.b0.c.h3.W1(r9)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = s0.a.e.b.b0.c.h3.W1(r12)
            if (r1 == 0) goto L_0x00a0
            s0.a.e.b.h r1 = r16.z()
            return r1
        L_0x00a0:
            s0.a.e.b.h r1 = r2.m()
            return r1
        L_0x00a5:
            r5 = 14
            int[] r6 = new int[r5]
            s0.a.e.b.b0.c.h3.T2(r9, r6)
            s0.a.e.b.b0.c.j0.g(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.w2(r13, r9, r11)
            s0.a.e.b.b0.c.j0.g(r11, r6)
            s0.a.e.b.b0.c.j0.e(r13, r3, r13)
            s0.a.e.b.b0.c.j0.f(r6, r6)
            s0.a.e.b.b0.c.h3.w2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.n(r13, r13, r6)
            s0.a.e.b.b0.c.j0.h(r3, r6)
            s0.a.e.b.b0.c.k0 r3 = new s0.a.e.b.b0.c.k0
            r3.<init>((int[]) r14)
            r4 = 14
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.T2(r12, r5)
            s0.a.e.b.b0.c.j0.g(r5, r14)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.j0.j(r4, r6, r4)
            s0.a.e.b.b0.c.k0 r4 = new s0.a.e.b.b0.c.k0
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            s0.a.e.b.b0.c.j0.j(r13, r5, r6)
            int[] r5 = r4.h
            int r5 = s0.a.e.b.b0.c.h3.A2(r5, r12, r10)
            if (r5 != 0) goto L_0x0101
            r5 = 13
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x0110
            int[] r5 = s0.a.e.b.b0.c.j0.b
            r6 = 14
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r6, r10, r5)
            if (r5 == 0) goto L_0x0110
            goto L_0x0103
        L_0x0101:
            r6 = 14
        L_0x0103:
            int[] r5 = s0.a.e.b.b0.c.j0.c
            int r11 = r5.length
            int r11 = s0.a.e.b.b0.c.h3.q(r11, r5, r10)
            if (r11 == 0) goto L_0x0110
            int r5 = r5.length
            s0.a.e.b.b0.c.h3.z1(r6, r10, r5)
        L_0x0110:
            int[] r5 = r4.h
            s0.a.e.b.b0.c.j0.g(r10, r5)
            s0.a.e.b.b0.c.k0 r5 = new s0.a.e.b.b0.c.k0
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x0121
            int[] r6 = r7.h
            s0.a.e.b.b0.c.j0.e(r9, r6, r9)
        L_0x0121:
            if (r8 != 0) goto L_0x012a
            int[] r6 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.c.j0.e(r6, r1, r6)
        L_0x012a:
            r1 = 1
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r1]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.l0 r5 = new s0.a.e.b.b0.c.l0
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.l0.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new l0((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new l0(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        k0 k0Var = (k0) this.d;
        if (k0Var.i()) {
            return eVar.m();
        }
        k0 k0Var2 = (k0) this.c;
        k0 k0Var3 = (k0) this.e[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        j0.i(k0Var.h, iArr3);
        int[] iArr4 = new int[7];
        int[] iArr5 = new int[14];
        h3.T2(iArr3, iArr5);
        j0.g(iArr5, iArr4);
        boolean h = k0Var3.h();
        int[] iArr6 = k0Var3.h;
        if (!h) {
            j0.i(iArr6, iArr2);
            iArr6 = iArr2;
        }
        j0.j(k0Var2.h, iArr6, iArr);
        j0.a(k0Var2.h, iArr6, iArr2);
        int[] iArr7 = new int[14];
        h3.w2(iArr2, iArr, iArr7);
        j0.g(iArr7, iArr2);
        j0.h(h3.n(iArr2, iArr2, iArr2), iArr2);
        j0.e(iArr3, k0Var2.h, iArr3);
        j0.h(h3.N2(7, iArr3, 2, 0), iArr3);
        j0.h(h3.O2(7, iArr4, 3, 0, iArr), iArr);
        k0 k0Var4 = new k0(iArr4);
        int[] iArr8 = new int[14];
        h3.T2(iArr2, iArr8);
        j0.g(iArr8, iArr4);
        int[] iArr9 = k0Var4.h;
        j0.j(iArr9, iArr3, iArr9);
        int[] iArr10 = k0Var4.h;
        j0.j(iArr10, iArr3, iArr10);
        k0 k0Var5 = new k0(iArr3);
        j0.j(iArr3, k0Var4.h, iArr3);
        int[] iArr11 = k0Var5.h;
        int[] iArr12 = new int[14];
        h3.w2(iArr11, iArr2, iArr12);
        j0.g(iArr12, iArr11);
        int[] iArr13 = k0Var5.h;
        j0.j(iArr13, iArr, iArr13);
        k0 k0Var6 = new k0(iArr2);
        j0.k(k0Var.h, iArr2);
        if (!h) {
            int[] iArr14 = k0Var6.h;
            j0.e(iArr14, k0Var3.h, iArr14);
        }
        return new l0(eVar, k0Var4, k0Var5, new g[]{k0Var6});
    }
}
