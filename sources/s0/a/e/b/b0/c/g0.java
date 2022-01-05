package s0.a.e.b.b0.c;

import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class g0 extends h.c {
    public g0(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public g0(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0115, code lost:
        if (s0.a.e.b.b0.c.h3.f1(14, r10, s0.a.e.b.b0.c.e0.b) != false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013a  */
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
            s0.a.e.b.b0.c.f0 r3 = (s0.a.e.b.b0.c.f0) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.f0 r4 = (s0.a.e.b.b0.c.f0) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.f0 r5 = (s0.a.e.b.b0.c.f0) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.f0 r6 = (s0.a.e.b.b0.c.f0) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.f0 r7 = (s0.a.e.b.b0.c.f0) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.f0 r1 = (s0.a.e.b.b0.c.f0) r1
            r9 = 14
            int[] r10 = new int[r9]
            r11 = 7
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.h()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.i
            int[] r6 = r6.i
            goto L_0x0066
        L_0x0050:
            int[] r8 = r7.i
            s0.a.e.b.b0.c.e0.e(r8, r13)
            int[] r5 = r5.i
            s0.a.e.b.b0.c.e0.b(r13, r5, r12)
            int[] r5 = r7.i
            s0.a.e.b.b0.c.e0.b(r13, r5, r13)
            int[] r5 = r6.i
            s0.a.e.b.b0.c.e0.b(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r8 = r1.h()
            if (r8 == 0) goto L_0x0071
            int[] r3 = r3.i
            int[] r4 = r4.i
            goto L_0x0087
        L_0x0071:
            int[] r9 = r1.i
            s0.a.e.b.b0.c.e0.e(r9, r14)
            int[] r3 = r3.i
            s0.a.e.b.b0.c.e0.b(r14, r3, r10)
            int[] r3 = r1.i
            s0.a.e.b.b0.c.e0.b(r14, r3, r14)
            int[] r3 = r4.i
            s0.a.e.b.b0.c.e0.b(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.c.e0.g(r3, r5, r9)
            s0.a.e.b.b0.c.e0.g(r4, r6, r12)
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
            s0.a.e.b.b0.c.e0.c(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.w2(r13, r9, r11)
            s0.a.e.b.b0.c.e0.c(r11, r6)
            s0.a.e.b.b0.c.e0.b(r13, r3, r13)
            int r3 = s0.a.e.b.b0.c.e0.a(r6)
            if (r3 == 0) goto L_0x00c8
            int[] r3 = s0.a.e.b.b0.c.e0.a
            s0.a.e.b.b0.c.h3.c3(r3, r3, r6)
            goto L_0x00cd
        L_0x00c8:
            int[] r3 = s0.a.e.b.b0.c.e0.a
            s0.a.e.b.b0.c.h3.c3(r3, r6, r6)
        L_0x00cd:
            s0.a.e.b.b0.c.h3.w2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.n(r13, r13, r6)
            s0.a.e.b.b0.c.e0.d(r3, r6)
            s0.a.e.b.b0.c.f0 r3 = new s0.a.e.b.b0.c.f0
            r3.<init>((int[]) r14)
            r4 = 14
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.T2(r12, r5)
            s0.a.e.b.b0.c.e0.c(r5, r14)
            int[] r4 = r3.i
            s0.a.e.b.b0.c.e0.g(r4, r6, r4)
            s0.a.e.b.b0.c.f0 r4 = new s0.a.e.b.b0.c.f0
            r4.<init>((int[]) r6)
            int[] r5 = r3.i
            int r5 = s0.a.e.b.b0.c.h3.c3(r13, r5, r6)
            if (r5 == 0) goto L_0x00fe
            r5 = 6803(0x1a93, float:9.533E-42)
            r11 = 7
            s0.a.e.b.b0.c.h3.d3(r11, r5, r6)
        L_0x00fe:
            int[] r5 = r4.i
            int r5 = s0.a.e.b.b0.c.h3.A2(r5, r12, r10)
            if (r5 != 0) goto L_0x0118
            r5 = 13
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x0127
            int[] r5 = s0.a.e.b.b0.c.e0.b
            r6 = 14
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r6, r10, r5)
            if (r5 == 0) goto L_0x0127
            goto L_0x011a
        L_0x0118:
            r6 = 14
        L_0x011a:
            int[] r5 = s0.a.e.b.b0.c.e0.c
            int r11 = r5.length
            int r11 = s0.a.e.b.b0.c.h3.q(r11, r5, r10)
            if (r11 == 0) goto L_0x0127
            int r5 = r5.length
            s0.a.e.b.b0.c.h3.z1(r6, r10, r5)
        L_0x0127:
            int[] r5 = r4.i
            s0.a.e.b.b0.c.e0.c(r10, r5)
            s0.a.e.b.b0.c.f0 r5 = new s0.a.e.b.b0.c.f0
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x0138
            int[] r6 = r7.i
            s0.a.e.b.b0.c.e0.b(r9, r6, r9)
        L_0x0138:
            if (r8 != 0) goto L_0x0141
            int[] r6 = r5.i
            int[] r1 = r1.i
            s0.a.e.b.b0.c.e0.b(r6, r1, r6)
        L_0x0141:
            r1 = 1
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r1]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.g0 r5 = new s0.a.e.b.b0.c.g0
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.g0.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new g0((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new g0(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        f0 f0Var = (f0) this.d;
        if (f0Var.i()) {
            return eVar.m();
        }
        f0 f0Var2 = (f0) this.c;
        f0 f0Var3 = (f0) this.e[0];
        int[] iArr = new int[7];
        e0.e(f0Var.i, iArr);
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[14];
        h3.T2(iArr, iArr3);
        e0.c(iArr3, iArr2);
        int[] iArr4 = new int[7];
        e0.e(f0Var2.i, iArr4);
        e0.d(h3.n(iArr4, iArr4, iArr4), iArr4);
        e0.b(iArr, f0Var2.i, iArr);
        e0.d(h3.N2(7, iArr, 2, 0), iArr);
        int[] iArr5 = new int[7];
        e0.d(h3.O2(7, iArr2, 3, 0, iArr5), iArr5);
        f0 f0Var4 = new f0(iArr2);
        int[] iArr6 = new int[14];
        h3.T2(iArr4, iArr6);
        e0.c(iArr6, iArr2);
        int[] iArr7 = f0Var4.i;
        e0.g(iArr7, iArr, iArr7);
        int[] iArr8 = f0Var4.i;
        e0.g(iArr8, iArr, iArr8);
        f0 f0Var5 = new f0(iArr);
        if (h3.c3(iArr, f0Var4.i, iArr) != 0) {
            h3.d3(7, 6803, iArr);
        }
        int[] iArr9 = f0Var5.i;
        int[] iArr10 = new int[14];
        h3.w2(iArr9, iArr4, iArr10);
        e0.c(iArr10, iArr9);
        int[] iArr11 = f0Var5.i;
        e0.g(iArr11, iArr5, iArr11);
        f0 f0Var6 = new f0(iArr4);
        if (h3.M2(7, f0Var.i, 0, iArr4) != 0 || (iArr4[6] == -1 && h3.j1(iArr4, e0.a))) {
            h3.h(7, 6803, iArr4);
        }
        if (!f0Var3.h()) {
            int[] iArr12 = f0Var6.i;
            e0.b(iArr12, f0Var3.i, iArr12);
        }
        return new g0(eVar, f0Var4, f0Var5, new g[]{f0Var6});
    }
}
