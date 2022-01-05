package s0.a.e.b.b0.c;

import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class m extends h.c {
    public m(e eVar, g gVar, g gVar2) {
        super(eVar, gVar, gVar2);
    }

    public m(e eVar, g gVar, g gVar2, g[] gVarArr) {
        super(eVar, gVar, gVar2, gVarArr);
    }

    public h A(h hVar) {
        return this == hVar ? x() : m() ? hVar : hVar.m() ? z() : this.d.i() ? hVar : z().a(hVar);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010c, code lost:
        if (s0.a.e.b.b0.c.h3.f1(10, r10, s0.a.e.b.b0.c.k.b) != false) goto L_0x0111;
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
            s0.a.e.b.b0.c.l r3 = (s0.a.e.b.b0.c.l) r3
            s0.a.e.b.g r4 = r0.d
            s0.a.e.b.b0.c.l r4 = (s0.a.e.b.b0.c.l) r4
            s0.a.e.b.g r5 = r1.c
            s0.a.e.b.b0.c.l r5 = (s0.a.e.b.b0.c.l) r5
            s0.a.e.b.g r6 = r17.j()
            s0.a.e.b.b0.c.l r6 = (s0.a.e.b.b0.c.l) r6
            s0.a.e.b.g[] r7 = r0.e
            r8 = 0
            r7 = r7[r8]
            s0.a.e.b.b0.c.l r7 = (s0.a.e.b.b0.c.l) r7
            s0.a.e.b.g r1 = r1.k(r8)
            s0.a.e.b.b0.c.l r1 = (s0.a.e.b.b0.c.l) r1
            r9 = 10
            int[] r10 = new int[r9]
            r11 = 5
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
            s0.a.e.b.b0.c.k.f(r8, r13)
            int[] r5 = r5.h
            s0.a.e.b.b0.c.k.c(r13, r5, r12)
            int[] r5 = r7.h
            s0.a.e.b.b0.c.k.c(r13, r5, r13)
            int[] r5 = r6.h
            s0.a.e.b.b0.c.k.c(r13, r5, r13)
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
            s0.a.e.b.b0.c.k.f(r9, r14)
            int[] r3 = r3.h
            s0.a.e.b.b0.c.k.c(r14, r3, r10)
            int[] r3 = r1.h
            s0.a.e.b.b0.c.k.c(r14, r3, r14)
            int[] r3 = r4.h
            s0.a.e.b.b0.c.k.c(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            s0.a.e.b.b0.c.k.h(r3, r5, r9)
            s0.a.e.b.b0.c.k.h(r4, r6, r12)
            boolean r5 = s0.a.e.b.b0.c.h3.U1(r9)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = s0.a.e.b.b0.c.h3.U1(r12)
            if (r1 == 0) goto L_0x00a0
            s0.a.e.b.h r1 = r16.z()
            return r1
        L_0x00a0:
            s0.a.e.b.h r1 = r2.m()
            return r1
        L_0x00a5:
            r5 = 10
            int[] r6 = new int[r5]
            s0.a.e.b.b0.c.h3.R2(r9, r6)
            s0.a.e.b.b0.c.k.d(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            s0.a.e.b.b0.c.h3.u2(r13, r9, r11)
            s0.a.e.b.b0.c.k.d(r11, r6)
            s0.a.e.b.b0.c.k.c(r13, r3, r13)
            int r3 = s0.a.e.b.b0.c.k.b(r6)
            if (r3 == 0) goto L_0x00c8
            int[] r3 = s0.a.e.b.b0.c.k.a
            s0.a.e.b.b0.c.h3.a3(r3, r3, r6)
            goto L_0x00cd
        L_0x00c8:
            int[] r3 = s0.a.e.b.b0.c.k.a
            s0.a.e.b.b0.c.h3.a3(r3, r6, r6)
        L_0x00cd:
            s0.a.e.b.b0.c.h3.u2(r4, r6, r10)
            int r3 = s0.a.e.b.b0.c.h3.l(r13, r13, r6)
            s0.a.e.b.b0.c.k.e(r3, r6)
            s0.a.e.b.b0.c.l r3 = new s0.a.e.b.b0.c.l
            r3.<init>((int[]) r14)
            r4 = 10
            int[] r5 = new int[r4]
            s0.a.e.b.b0.c.h3.R2(r12, r5)
            s0.a.e.b.b0.c.k.d(r5, r14)
            int[] r4 = r3.h
            s0.a.e.b.b0.c.k.h(r4, r6, r4)
            s0.a.e.b.b0.c.l r4 = new s0.a.e.b.b0.c.l
            r4.<init>((int[]) r6)
            int[] r5 = r3.h
            s0.a.e.b.b0.c.k.h(r13, r5, r6)
            int[] r5 = r4.h
            int r5 = s0.a.e.b.b0.c.h3.y2(r5, r12, r10)
            if (r5 != 0) goto L_0x010f
            r5 = 9
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x011e
            int[] r5 = s0.a.e.b.b0.c.k.b
            r6 = 10
            boolean r5 = s0.a.e.b.b0.c.h3.f1(r6, r10, r5)
            if (r5 == 0) goto L_0x011e
            goto L_0x0111
        L_0x010f:
            r6 = 10
        L_0x0111:
            int[] r5 = s0.a.e.b.b0.c.k.c
            int r11 = r5.length
            int r11 = s0.a.e.b.b0.c.h3.q(r11, r5, r10)
            if (r11 == 0) goto L_0x011e
            int r5 = r5.length
            s0.a.e.b.b0.c.h3.z1(r6, r10, r5)
        L_0x011e:
            int[] r5 = r4.h
            s0.a.e.b.b0.c.k.d(r10, r5)
            s0.a.e.b.b0.c.l r5 = new s0.a.e.b.b0.c.l
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x012f
            int[] r6 = r7.h
            s0.a.e.b.b0.c.k.c(r9, r6, r9)
        L_0x012f:
            if (r8 != 0) goto L_0x0138
            int[] r6 = r5.h
            int[] r1 = r1.h
            s0.a.e.b.b0.c.k.c(r6, r1, r6)
        L_0x0138:
            r1 = 1
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r1]
            r6 = 0
            r1[r6] = r5
            s0.a.e.b.b0.c.m r5 = new s0.a.e.b.b0.c.m
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.b0.c.m.a(s0.a.e.b.h):s0.a.e.b.h");
    }

    public h b() {
        return new m((e) null, d(), e());
    }

    public h p() {
        return m() ? this : new m(this.b, this.c, this.d.m(), this.e);
    }

    public h x() {
        return (m() || this.d.i()) ? this : z().a(this);
    }

    public h z() {
        if (m()) {
            return this;
        }
        e eVar = this.b;
        l lVar = (l) this.d;
        if (lVar.i()) {
            return eVar.m();
        }
        l lVar2 = (l) this.c;
        l lVar3 = (l) this.e[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        k.f(lVar.h, iArr3);
        int[] iArr4 = new int[5];
        int[] iArr5 = new int[10];
        h3.R2(iArr3, iArr5);
        k.d(iArr5, iArr4);
        boolean h = lVar3.h();
        int[] iArr6 = lVar3.h;
        if (!h) {
            k.f(iArr6, iArr2);
            iArr6 = iArr2;
        }
        k.h(lVar2.h, iArr6, iArr);
        k.a(lVar2.h, iArr6, iArr2);
        int[] iArr7 = new int[10];
        h3.u2(iArr2, iArr, iArr7);
        k.d(iArr7, iArr2);
        k.e(h3.l(iArr2, iArr2, iArr2), iArr2);
        k.c(iArr3, lVar2.h, iArr3);
        k.e(h3.N2(5, iArr3, 2, 0), iArr3);
        k.e(h3.O2(5, iArr4, 3, 0, iArr), iArr);
        l lVar4 = new l(iArr4);
        int[] iArr8 = new int[10];
        h3.R2(iArr2, iArr8);
        k.d(iArr8, iArr4);
        int[] iArr9 = lVar4.h;
        k.h(iArr9, iArr3, iArr9);
        int[] iArr10 = lVar4.h;
        k.h(iArr10, iArr3, iArr10);
        l lVar5 = new l(iArr3);
        k.h(iArr3, lVar4.h, iArr3);
        int[] iArr11 = lVar5.h;
        int[] iArr12 = new int[10];
        h3.u2(iArr11, iArr2, iArr12);
        k.d(iArr12, iArr11);
        int[] iArr13 = lVar5.h;
        k.h(iArr13, iArr, iArr13);
        l lVar6 = new l(iArr2);
        if (h3.M2(5, lVar.h, 0, iArr2) != 0 || (iArr2[4] == -1 && h3.h1(iArr2, k.a))) {
            h3.w(5, -2147483647, iArr2);
        }
        if (!h) {
            int[] iArr14 = lVar6.h;
            k.c(iArr14, lVar3.h, iArr14);
        }
        return new m(eVar, lVar4, lVar5, new g[]{lVar6});
    }
}
