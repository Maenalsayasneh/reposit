package s0.a.e.b.b0.c;

import androidx.core.app.FrameMetricsAggregator;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class f1 extends h.c {
    public f1(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public f1(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
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
            s0.a.e.b.b0.c.e1 r3 = (s0.a.e.b.b0.c.e1) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.e1 r4 = (s0.a.e.b.b0.c.e1) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.e1 r5 = (s0.a.e.b.b0.c.e1) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.e1 r6 = (s0.a.e.b.b0.c.e1) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.e1 r7 = (s0.a.e.b.b0.c.e1) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.e1 r1 = (s0.a.e.b.b0.c.e1) r1
            r9 = 17
            int[] r10 = new int[r9]
            int[] r11 = new int[r9]
            int[] r12 = new int[r9]
            int[] r13 = new int[r9]
            boolean r14 = r7.h()
            if (r14 == 0) goto L_0x004f
            int[] r5 = r5.h
            int[] r6 = r6.h
            goto L_0x0065
        L_0x004f:
            int[] r15 = r7.h
            s0.a.e.b.b0.c.d1.g(r15, r12)
            int[] r5 = r5.h
            s0.a.e.b.b0.c.d1.d(r12, r5, r11)
            int[] r5 = r7.h
            s0.a.e.b.b0.c.d1.d(r12, r5, r12)
            int[] r5 = r6.h
            s0.a.e.b.b0.c.d1.d(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x0065:
            boolean r15 = r1.h()
            if (r15 == 0) goto L_0x0070
            int[] r3 = r3.h
            int[] r4 = r4.h
            goto L_0x0086
        L_0x0070:
            int[] r8 = r1.h
            s0.a.e.b.b0.c.d1.g(r8, r13)
            int[] r3 = r3.h
            s0.a.e.b.b0.c.d1.d(r13, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.c.d1.d(r13, r3, r13)
            int[] r3 = r4.h
            s0.a.e.b.b0.c.d1.d(r13, r3, r13)
            r3 = r10
            r4 = r13
        L_0x0086:
            int[] r8 = new int[r9]
            s0.a.e.b.b0.c.d1.h(r3, r5, r8)
            s0.a.e.b.b0.c.d1.h(r4, r6, r11)
            boolean r5 = s0.a.e.b.b0.c.h3.S1(r9, r8)
            if (r5 == 0) goto L_0x00a4
            boolean r1 = s0.a.e.b.b0.c.h3.S1(r9, r11)
            if (r1 == 0) goto L_0x009f
            s0.a.e.b.h r1 = r16.z()
            return r1
        L_0x009f:
            s0.a.e.b.h r1 = r2.m()
            return r1
        L_0x00a4:
            r5 = 33
            int[] r6 = new int[r5]
            s0.a.e.b.b0.c.d1.b(r8, r6)
            s0.a.e.b.b0.c.d1.e(r6, r12)
            int[] r6 = new int[r9]
            s0.a.e.b.b0.c.d1.d(r12, r8, r6)
            s0.a.e.b.b0.c.d1.d(r12, r3, r12)
            s0.a.e.b.b0.c.d1.d(r4, r6, r10)
            s0.a.e.b.b0.c.e1 r3 = new s0.a.e.b.b0.c.e1
            r3.<init>((int[]) r13)
            int[] r4 = new int[r5]
            s0.a.e.b.b0.c.d1.b(r11, r4)
            s0.a.e.b.b0.c.d1.e(r4, r13)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.d1.a(r4, r6, r4)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.d1.h(r4, r12, r4)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.d1.h(r4, r12, r4)
            s0.a.e.b.b0.c.e1 r4 = new s0.a.e.b.b0.c.e1
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            s0.a.e.b.b0.c.d1.h(r12, r5, r6)
            int[] r5 = r4.h
            s0.a.e.b.b0.c.d1.d(r5, r11, r11)
            int[] r5 = r4.h
            s0.a.e.b.b0.c.d1.h(r11, r10, r5)
            s0.a.e.b.b0.c.e1 r5 = new s0.a.e.b.b0.c.e1
            r5.<init>((int[]) r8)
            if (r14 != 0) goto L_0x00f5
            int[] r6 = r7.h
            s0.a.e.b.b0.c.d1.d(r8, r6, r8)
        L_0x00f5:
            if (r15 != 0) goto L_0x00fe
            int[] r6 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.c.d1.d(r6, r1, r6)
        L_0x00fe:
            r1 = 1
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r1]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.f1 r5 = new s0.a.e.b.b0.c.f1
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.f1.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new f1((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new f1(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        e1 e1Var = (e1) this.d;
        if (e1Var.i()) {
            return eVar.m();
        }
        e1 e1Var2 = (e1) this.c;
        e1 e1Var3 = (e1) this.e[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        d1.g(e1Var.h, iArr3);
        int[] iArr4 = new int[17];
        int[] iArr5 = new int[33];
        d1.b(iArr3, iArr5);
        d1.e(iArr5, iArr4);
        boolean h = e1Var3.h();
        int[] iArr6 = e1Var3.h;
        if (!h) {
            d1.g(iArr6, iArr2);
            iArr6 = iArr2;
        }
        d1.h(e1Var2.h, iArr6, iArr);
        d1.a(e1Var2.h, iArr6, iArr2);
        d1.d(iArr2, iArr, iArr2);
        h3.j(17, iArr2, iArr2, iArr2);
        d1.f(iArr2);
        d1.d(iArr3, e1Var2.h, iArr3);
        h3.N2(17, iArr3, 2, 0);
        d1.f(iArr3);
        h3.O2(17, iArr4, 3, 0, iArr);
        d1.f(iArr);
        e1 e1Var4 = new e1(iArr4);
        int[] iArr7 = new int[33];
        d1.b(iArr2, iArr7);
        d1.e(iArr7, iArr4);
        int[] iArr8 = e1Var4.h;
        d1.h(iArr8, iArr3, iArr8);
        int[] iArr9 = e1Var4.h;
        d1.h(iArr9, iArr3, iArr9);
        e1 e1Var5 = new e1(iArr3);
        d1.h(iArr3, e1Var4.h, iArr3);
        int[] iArr10 = e1Var5.h;
        d1.d(iArr10, iArr2, iArr10);
        int[] iArr11 = e1Var5.h;
        d1.h(iArr11, iArr, iArr11);
        e1 e1Var6 = new e1(iArr2);
        int[] iArr12 = e1Var.h;
        int i = iArr12[16];
        iArr2[16] = (h3.M2(16, iArr12, i << 23, iArr2) | (i << 1)) & FrameMetricsAggregator.EVERY_DURATION;
        if (!h) {
            int[] iArr13 = e1Var6.h;
            d1.d(iArr13, e1Var3.h, iArr13);
        }
        return new f1(eVar, e1Var4, e1Var5, new g[]{e1Var6});
    }
}
