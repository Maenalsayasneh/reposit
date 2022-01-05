package s0.a.e.b.b0.c;

import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class b0 extends h.c {
    public b0(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public b0(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010c, code lost:
        if (s0.a.e.b.b0.c.h3.f1(12, r10, s0.a.e.b.b0.c.z.b) != false) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
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
            s0.a.e.b.b0.c.a0 r3 = (s0.a.e.b.b0.c.a0) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.a0 r4 = (s0.a.e.b.b0.c.a0) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.a0 r5 = (s0.a.e.b.b0.c.a0) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.a0 r6 = (s0.a.e.b.b0.c.a0) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.a0 r7 = (s0.a.e.b.b0.c.a0) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.a0 r1 = (s0.a.e.b.b0.c.a0) r1
            r9 = 12
            int[] r10 = new int[r9]
            r11 = 6
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
            s0.a.e.b.b0.c.z.g(r8, r13)
            int[] r5 = r5.h
            s0.a.e.b.b0.c.z.d(r13, r5, r12)
            int[] r5 = r7.h
            s0.a.e.b.b0.c.z.d(r13, r5, r13)
            int[] r5 = r6.h
            s0.a.e.b.b0.c.z.d(r13, r5, r13)
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
            s0.a.e.b.b0.c.z.g(r9, r14)
            int[] r3 = r3.h
            s0.a.e.b.b0.c.z.d(r14, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.c.z.d(r14, r3, r14)
            int[] r3 = r4.h
            s0.a.e.b.b0.c.z.d(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.c.z.i(r3, r5, r9)
            s0.a.e.b.b0.c.z.i(r4, r6, r12)
            boolean r5 = s0.a.e.b.b0.c.h3.V1(r9)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = s0.a.e.b.b0.c.h3.V1(r12)
            if (r1 == 0) goto L_0x00a0
            s0.a.e.b.h r1 = r16.z()
            return r1
        L_0x00a0:
            s0.a.e.b.h r1 = r2.m()
            return r1
        L_0x00a5:
            r5 = 12
            int[] r6 = new int[r5]
            s0.a.e.b.b0.c.h3.S2(r9, r6)
            s0.a.e.b.b0.c.z.e(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.v2(r13, r9, r11)
            s0.a.e.b.b0.c.z.e(r11, r6)
            s0.a.e.b.b0.c.z.d(r13, r3, r13)
            int r3 = s0.a.e.b.b0.c.z.c(r6)
            if (r3 == 0) goto L_0x00c8
            int[] r3 = s0.a.e.b.b0.c.z.a
            s0.a.e.b.b0.c.h3.b3(r3, r3, r6)
            goto L_0x00cd
        L_0x00c8:
            int[] r3 = s0.a.e.b.b0.c.z.a
            s0.a.e.b.b0.c.h3.b3(r3, r6, r6)
        L_0x00cd:
            s0.a.e.b.b0.c.h3.v2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.m(r13, r13, r6)
            s0.a.e.b.b0.c.z.f(r3, r6)
            s0.a.e.b.b0.c.a0 r3 = new s0.a.e.b.b0.c.a0
            r3.<init>((int[]) r14)
            r4 = 12
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.S2(r12, r5)
            s0.a.e.b.b0.c.z.e(r5, r14)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.z.i(r4, r6, r4)
            s0.a.e.b.b0.c.a0 r4 = new s0.a.e.b.b0.c.a0
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            s0.a.e.b.b0.c.z.i(r13, r5, r6)
            int[] r5 = r4.h
            int r5 = s0.a.e.b.b0.c.h3.z2(r5, r12, r10)
            if (r5 != 0) goto L_0x010f
            r5 = 11
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x011e
            int[] r5 = s0.a.e.b.b0.c.z.b
            r6 = 12
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r6, r10, r5)
            if (r5 == 0) goto L_0x011e
            goto L_0x0111
        L_0x010f:
            r6 = 12
        L_0x0111:
            int[] r5 = s0.a.e.b.b0.c.z.c
            int r11 = r5.length
            int r11 = s0.a.e.b.b0.c.h3.q(r11, r5, r10)
            if (r11 == 0) goto L_0x011e
            int r5 = r5.length
            s0.a.e.b.b0.c.h3.z1(r6, r10, r5)
        L_0x011e:
            int[] r5 = r4.h
            s0.a.e.b.b0.c.z.e(r10, r5)
            s0.a.e.b.b0.c.a0 r5 = new s0.a.e.b.b0.c.a0
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x012f
            int[] r6 = r7.h
            s0.a.e.b.b0.c.z.d(r9, r6, r9)
        L_0x012f:
            if (r8 != 0) goto L_0x0138
            int[] r6 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.c.z.d(r6, r1, r6)
        L_0x0138:
            r1 = 1
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r1]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.b0 r5 = new s0.a.e.b.b0.c.b0
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.b0.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new b0((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new b0(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        a0 a0Var = (a0) this.d;
        if (a0Var.i()) {
            return eVar.m();
        }
        a0 a0Var2 = (a0) this.c;
        a0 a0Var3 = (a0) this.e[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        z.g(a0Var.h, iArr3);
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[12];
        h3.S2(iArr3, iArr5);
        z.e(iArr5, iArr4);
        boolean h = a0Var3.h();
        int[] iArr6 = a0Var3.h;
        if (!h) {
            z.g(iArr6, iArr2);
            iArr6 = iArr2;
        }
        z.i(a0Var2.h, iArr6, iArr);
        z.a(a0Var2.h, iArr6, iArr2);
        int[] iArr7 = new int[12];
        h3.v2(iArr2, iArr, iArr7);
        z.e(iArr7, iArr2);
        z.f(h3.m(iArr2, iArr2, iArr2), iArr2);
        z.d(iArr3, a0Var2.h, iArr3);
        z.f(h3.N2(6, iArr3, 2, 0), iArr3);
        z.f(h3.O2(6, iArr4, 3, 0, iArr), iArr);
        a0 a0Var4 = new a0(iArr4);
        int[] iArr8 = new int[12];
        h3.S2(iArr2, iArr8);
        z.e(iArr8, iArr4);
        int[] iArr9 = a0Var4.h;
        z.i(iArr9, iArr3, iArr9);
        int[] iArr10 = a0Var4.h;
        z.i(iArr10, iArr3, iArr10);
        a0 a0Var5 = new a0(iArr3);
        z.i(iArr3, a0Var4.h, iArr3);
        int[] iArr11 = a0Var5.h;
        int[] iArr12 = new int[12];
        h3.v2(iArr11, iArr2, iArr12);
        z.e(iArr12, iArr11);
        int[] iArr13 = a0Var5.h;
        z.i(iArr13, iArr, iArr13);
        a0 a0Var6 = new a0(iArr2);
        if (h3.M2(6, a0Var.h, 0, iArr2) != 0 || (iArr2[5] == -1 && h3.i1(iArr2, z.a))) {
            z.b(iArr2);
        }
        if (!h) {
            int[] iArr14 = a0Var6.h;
            z.d(iArr14, a0Var3.h, iArr14);
        }
        return new b0(eVar, a0Var4, a0Var5, new g[]{a0Var6});
    }
}
