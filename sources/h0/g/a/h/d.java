package h0.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow */
public class d extends i {
    public int Z0 = -1;
    public int a1 = -1;
    public int b1 = -1;
    public int c1 = -1;
    public int d1 = -1;
    public int e1 = -1;
    public float f1 = 0.5f;
    public float g1 = 0.5f;
    public float h1 = 0.5f;
    public float i1 = 0.5f;
    public float j1 = 0.5f;
    public float k1 = 0.5f;
    public int l1 = 0;
    public int m1 = 0;
    public int n1 = 2;
    public int o1 = 2;
    public int p1 = 0;
    public int q1 = -1;
    public int r1 = 0;
    public ArrayList<a> s1 = new ArrayList<>();
    public ConstraintWidget[] t1 = null;
    public ConstraintWidget[] u1 = null;
    public int[] v1 = null;
    public ConstraintWidget[] w1;
    public int x1 = 0;

    /* compiled from: Flow */
    public class a {
        public int a = 0;
        public ConstraintWidget b = null;
        public int c = 0;
        public ConstraintAnchor d;
        public ConstraintAnchor e;
        public ConstraintAnchor f;
        public ConstraintAnchor g;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;
        public int q = 0;

        public a(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.a = i2;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = d.this.S0;
            this.i = d.this.O0;
            this.j = d.this.T0;
            this.k = d.this.P0;
            this.q = i3;
        }

        public void a(ConstraintWidget constraintWidget) {
            int i2 = 0;
            if (this.a == 0) {
                int c0 = d.this.c0(constraintWidget, this.q);
                if (constraintWidget.r() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    c0 = 0;
                }
                d dVar = d.this;
                int i3 = dVar.l1;
                if (constraintWidget.f8o0 != 8) {
                    i2 = i3;
                }
                this.l = c0 + i2 + this.l;
                int b0 = dVar.b0(constraintWidget, this.q);
                if (this.b == null || this.c < b0) {
                    this.b = constraintWidget;
                    this.c = b0;
                    this.m = b0;
                }
            } else {
                int c02 = d.this.c0(constraintWidget, this.q);
                int b02 = d.this.b0(constraintWidget, this.q);
                if (constraintWidget.v() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    b02 = 0;
                }
                int i4 = d.this.m1;
                if (constraintWidget.f8o0 != 8) {
                    i2 = i4;
                }
                this.m = b02 + i2 + this.m;
                if (this.b == null || this.c < c02) {
                    this.b = constraintWidget;
                    this.c = c02;
                    this.l = c02;
                }
            }
            this.o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x001e
                int r4 = r0.n
                int r4 = r4 + r3
                h0.g.a.h.d r5 = h0.g.a.h.d.this
                int r6 = r5.x1
                if (r4 < r6) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r5.w1
                r4 = r5[r4]
                if (r4 == 0) goto L_0x001b
                r4.J()
            L_0x001b:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001e:
                if (r1 == 0) goto L_0x02eb
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.b
                if (r3 != 0) goto L_0x0026
                goto L_0x02eb
            L_0x0026:
                if (r19 == 0) goto L_0x002c
                if (r18 != 0) goto L_0x002c
                r4 = 1
                goto L_0x002d
            L_0x002c:
                r4 = r2
            L_0x002d:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x0031:
                if (r6 >= r1) goto L_0x0053
                if (r17 == 0) goto L_0x0039
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x003a
            L_0x0039:
                r9 = r6
            L_0x003a:
                int r10 = r0.n
                int r10 = r10 + r9
                h0.g.a.h.d r9 = h0.g.a.h.d.this
                int r11 = r9.x1
                if (r10 < r11) goto L_0x0044
                goto L_0x0053
            L_0x0044:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r9.w1
                r9 = r9[r10]
                int r9 = r9.f8o0
                if (r9 != 0) goto L_0x0050
                if (r7 != r5) goto L_0x004f
                r7 = r6
            L_0x004f:
                r8 = r6
            L_0x0050:
                int r6 = r6 + 1
                goto L_0x0031
            L_0x0053:
                int r6 = r0.a
                r9 = 0
                if (r6 != 0) goto L_0x01a4
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.b
                h0.g.a.h.d r10 = h0.g.a.h.d.this
                int r11 = r10.a1
                r6.C0 = r11
                int r11 = r0.i
                if (r18 <= 0) goto L_0x0067
                int r10 = r10.m1
                int r11 = r11 + r10
            L_0x0067:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.e
                r10.a(r12, r11)
                if (r19 == 0) goto L_0x0079
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.g
                int r12 = r0.k
                r10.a(r11, r12)
            L_0x0079:
                if (r18 <= 0) goto L_0x0086
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.e
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.L
                r10.a(r11, r2)
            L_0x0086:
                h0.g.a.h.d r10 = h0.g.a.h.d.this
                int r10 = r10.o1
                r11 = 3
                if (r10 != r11) goto L_0x00b1
                boolean r10 = r6.F
                if (r10 != 0) goto L_0x00b1
                r10 = r2
            L_0x0092:
                if (r10 >= r1) goto L_0x00b1
                if (r17 == 0) goto L_0x009a
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x009b
            L_0x009a:
                r12 = r10
            L_0x009b:
                int r13 = r0.n
                int r13 = r13 + r12
                h0.g.a.h.d r12 = h0.g.a.h.d.this
                int r14 = r12.x1
                if (r13 < r14) goto L_0x00a5
                goto L_0x00b1
            L_0x00a5:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r12 = r12.w1
                r12 = r12[r13]
                boolean r13 = r12.F
                if (r13 == 0) goto L_0x00ae
                goto L_0x00b2
            L_0x00ae:
                int r10 = r10 + 1
                goto L_0x0092
            L_0x00b1:
                r12 = r6
            L_0x00b2:
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x02eb
                if (r17 == 0) goto L_0x00bb
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00bc
            L_0x00bb:
                r13 = r10
            L_0x00bc:
                int r14 = r0.n
                int r14 = r14 + r13
                h0.g.a.h.d r15 = h0.g.a.h.d.this
                int r11 = r15.x1
                if (r14 < r11) goto L_0x00c7
                goto L_0x02eb
            L_0x00c7:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r15.w1
                r11 = r11[r14]
                if (r10 != 0) goto L_0x00d6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r0.d
                int r3 = r0.h
                r11.j(r14, r15, r3)
            L_0x00d6:
                if (r13 != 0) goto L_0x010d
                h0.g.a.h.d r3 = h0.g.a.h.d.this
                int r13 = r3.Z0
                r14 = 1065353216(0x3f800000, float:1.0)
                if (r17 == 0) goto L_0x00e5
                float r15 = r3.f1
                float r15 = r14 - r15
                goto L_0x00e7
            L_0x00e5:
                float r15 = r3.f1
            L_0x00e7:
                int r2 = r0.n
                if (r2 != 0) goto L_0x00f7
                int r2 = r3.b1
                if (r2 == r5) goto L_0x00f7
                if (r17 == 0) goto L_0x00f4
                float r3 = r3.h1
                goto L_0x0101
            L_0x00f4:
                float r3 = r3.h1
                goto L_0x0107
            L_0x00f7:
                if (r19 == 0) goto L_0x0109
                int r2 = r3.d1
                if (r2 == r5) goto L_0x0109
                if (r17 == 0) goto L_0x0105
                float r3 = r3.j1
            L_0x0101:
                float r14 = r14 - r3
                r13 = r2
                r15 = r14
                goto L_0x0109
            L_0x0105:
                float r3 = r3.j1
            L_0x0107:
                r13 = r2
                r15 = r3
            L_0x0109:
                r11.B0 = r13
                r11.f4k0 = r15
            L_0x010d:
                int r2 = r1 + -1
                if (r10 != r2) goto L_0x011a
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f
                int r13 = r0.j
                r11.j(r2, r3, r13)
            L_0x011a:
                if (r9 == 0) goto L_0x0144
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.M
                h0.g.a.h.d r13 = h0.g.a.h.d.this
                int r13 = r13.l1
                r2.a(r3, r13)
                if (r10 != r7) goto L_0x0130
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.K
                int r3 = r0.h
                r2.n(r3)
            L_0x0130:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r9.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r11.K
                r13 = 0
                r2.a(r3, r13)
                r2 = 1
                int r3 = r8 + 1
                if (r10 != r3) goto L_0x0144
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r9.M
                int r3 = r0.j
                r2.n(r3)
            L_0x0144:
                if (r11 == r6) goto L_0x019c
                h0.g.a.h.d r2 = h0.g.a.h.d.this
                int r2 = r2.o1
                r3 = 3
                if (r2 != r3) goto L_0x0160
                boolean r9 = r12.F
                if (r9 == 0) goto L_0x0160
                if (r11 == r12) goto L_0x0160
                boolean r9 = r11.F
                if (r9 == 0) goto L_0x0160
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r12.O
                r13 = 0
                r2.a(r9, r13)
                goto L_0x019d
            L_0x0160:
                if (r2 == 0) goto L_0x0193
                r9 = 1
                if (r2 == r9) goto L_0x018a
                if (r4 == 0) goto L_0x017a
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.e
                int r13 = r0.i
                r2.a(r9, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.g
                int r13 = r0.k
                r2.a(r9, r13)
                goto L_0x019d
            L_0x017a:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.L
                r13 = 0
                r2.a(r9, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.N
                r2.a(r9, r13)
                goto L_0x019d
            L_0x018a:
                r13 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.N
                r2.a(r9, r13)
                goto L_0x019d
            L_0x0193:
                r13 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.L
                r2.a(r9, r13)
                goto L_0x019d
            L_0x019c:
                r3 = 3
            L_0x019d:
                int r10 = r10 + 1
                r9 = r11
                r2 = 0
                r11 = r3
                goto L_0x00b3
            L_0x01a4:
                androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.b
                h0.g.a.h.d r3 = h0.g.a.h.d.this
                int r6 = r3.Z0
                r2.B0 = r6
                int r6 = r0.h
                if (r18 <= 0) goto L_0x01b3
                int r3 = r3.l1
                int r6 = r6 + r3
            L_0x01b3:
                if (r17 == 0) goto L_0x01d6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f
                r3.a(r10, r6)
                if (r19 == 0) goto L_0x01c7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.d
                int r10 = r0.j
                r3.a(r6, r10)
            L_0x01c7:
                if (r18 <= 0) goto L_0x01f6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.M
                r10 = 0
                r3.a(r6, r10)
                goto L_0x01f6
            L_0x01d6:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.d
                r3.a(r10, r6)
                if (r19 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f
                int r10 = r0.j
                r3.a(r6, r10)
            L_0x01e8:
                if (r18 <= 0) goto L_0x01f6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.d
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.K
                r10 = 0
                r3.a(r6, r10)
            L_0x01f6:
                r13 = 0
            L_0x01f7:
                if (r13 >= r1) goto L_0x02eb
                int r3 = r0.n
                int r3 = r3 + r13
                h0.g.a.h.d r6 = h0.g.a.h.d.this
                int r10 = r6.x1
                if (r3 < r10) goto L_0x0204
                goto L_0x02eb
            L_0x0204:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r6.w1
                r3 = r6[r3]
                if (r13 != 0) goto L_0x0233
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.e
                int r11 = r0.i
                r3.j(r6, r10, r11)
                h0.g.a.h.d r6 = h0.g.a.h.d.this
                int r10 = r6.a1
                float r11 = r6.g1
                int r12 = r0.n
                if (r12 != 0) goto L_0x0226
                int r12 = r6.c1
                if (r12 == r5) goto L_0x0226
                float r6 = r6.i1
            L_0x0223:
                r11 = r6
                r10 = r12
                goto L_0x022f
            L_0x0226:
                if (r19 == 0) goto L_0x022f
                int r12 = r6.e1
                if (r12 == r5) goto L_0x022f
                float r6 = r6.k1
                goto L_0x0223
            L_0x022f:
                r3.C0 = r10
                r3.f5l0 = r11
            L_0x0233:
                int r6 = r1 + -1
                if (r13 != r6) goto L_0x0240
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.g
                int r11 = r0.k
                r3.j(r6, r10, r11)
            L_0x0240:
                if (r9 == 0) goto L_0x026a
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.N
                h0.g.a.h.d r11 = h0.g.a.h.d.this
                int r11 = r11.m1
                r6.a(r10, r11)
                if (r13 != r7) goto L_0x0256
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.L
                int r10 = r0.i
                r6.n(r10)
            L_0x0256:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r9.N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.L
                r11 = 0
                r6.a(r10, r11)
                r6 = 1
                int r10 = r8 + 1
                if (r13 != r10) goto L_0x026a
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r9.N
                int r9 = r0.k
                r6.n(r9)
            L_0x026a:
                if (r3 == r2) goto L_0x02e4
                r6 = 2
                if (r17 == 0) goto L_0x02a0
                h0.g.a.h.d r9 = h0.g.a.h.d.this
                int r9 = r9.n1
                if (r9 == 0) goto L_0x0295
                r10 = 1
                if (r9 == r10) goto L_0x028c
                if (r9 == r6) goto L_0x027c
                goto L_0x02e4
            L_0x027c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.K
                r10 = 0
                r6.a(r9, r10)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.M
                r6.a(r9, r10)
                goto L_0x029d
            L_0x028c:
                r10 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.K
                r6.a(r9, r10)
                goto L_0x029d
            L_0x0295:
                r10 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.M
                r6.a(r9, r10)
            L_0x029d:
                r11 = r10
                r10 = 1
                goto L_0x02e6
            L_0x02a0:
                h0.g.a.h.d r9 = h0.g.a.h.d.this
                int r9 = r9.n1
                if (r9 == 0) goto L_0x02da
                r10 = 1
                if (r9 == r10) goto L_0x02d1
                if (r9 == r6) goto L_0x02ac
                goto L_0x02e5
            L_0x02ac:
                if (r4 == 0) goto L_0x02c1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.d
                int r11 = r0.h
                r6.a(r9, r11)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f
                int r11 = r0.j
                r6.a(r9, r11)
                goto L_0x02e5
            L_0x02c1:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.K
                r11 = 0
                r6.a(r9, r11)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.M
                r6.a(r9, r11)
                goto L_0x02e6
            L_0x02d1:
                r11 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.M
                r6.a(r9, r11)
                goto L_0x02e6
            L_0x02da:
                r10 = 1
                r11 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.K
                r6.a(r9, r11)
                goto L_0x02e6
            L_0x02e4:
                r10 = 1
            L_0x02e5:
                r11 = 0
            L_0x02e6:
                int r13 = r13 + 1
                r9 = r3
                goto L_0x01f7
            L_0x02eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.d.a.b(boolean, int, boolean):void");
        }

        public int c() {
            if (this.a == 1) {
                return this.m - d.this.m1;
            }
            return this.m;
        }

        public int d() {
            if (this.a == 0) {
                return this.l - d.this.l1;
            }
            return this.l;
        }

        public void e(int i2) {
            int i3 = this.p;
            if (i3 != 0) {
                int i4 = this.o;
                int i5 = i2 / i3;
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = this.n;
                    int i8 = i7 + i6;
                    d dVar = d.this;
                    if (i8 >= dVar.x1) {
                        break;
                    }
                    ConstraintWidget constraintWidget = dVar.w1[i7 + i6];
                    if (this.a == 0) {
                        if (constraintWidget != null && constraintWidget.r() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.q == 0) {
                            d.this.a0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i5, constraintWidget.v(), constraintWidget.q());
                        }
                    } else if (constraintWidget != null && constraintWidget.v() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.r == 0) {
                        d.this.a0(constraintWidget, constraintWidget.r(), constraintWidget.w(), ConstraintWidget.DimensionBehaviour.FIXED, i5);
                    }
                }
                this.l = 0;
                this.m = 0;
                this.b = null;
                this.c = 0;
                int i9 = this.o;
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = this.n + i10;
                    d dVar2 = d.this;
                    if (i11 < dVar2.x1) {
                        ConstraintWidget constraintWidget2 = dVar2.w1[i11];
                        if (this.a == 0) {
                            int w = constraintWidget2.w();
                            d dVar3 = d.this;
                            int i12 = dVar3.l1;
                            if (constraintWidget2.f8o0 == 8) {
                                i12 = 0;
                            }
                            this.l = w + i12 + this.l;
                            int b0 = dVar3.b0(constraintWidget2, this.q);
                            if (this.b == null || this.c < b0) {
                                this.b = constraintWidget2;
                                this.c = b0;
                                this.m = b0;
                            }
                        } else {
                            int c0 = dVar2.c0(constraintWidget2, this.q);
                            int b02 = d.this.b0(constraintWidget2, this.q);
                            int i13 = d.this.m1;
                            if (constraintWidget2.f8o0 == 8) {
                                i13 = 0;
                            }
                            this.m = b02 + i13 + this.m;
                            if (this.b == null || this.c < c0) {
                                this.b = constraintWidget2;
                                this.c = c0;
                                this.l = c0;
                            }
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }

        public void f(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.a = i2;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.q = i7;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0618  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Z(int r34, int r35, int r36, int r37) {
        /*
            r33 = this;
            r8 = r33
            int r0 = r8.N0
            r9 = 1
            r10 = 0
            if (r0 <= 0) goto L_0x008a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.W
            if (r0 == 0) goto L_0x0011
            h0.g.a.h.c r0 = (h0.g.a.h.c) r0
            h0.g.a.h.k.b$b r0 = r0.Q0
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0081
        L_0x0017:
            r2 = r10
        L_0x0018:
            int r3 = r8.N0
            if (r2 >= r3) goto L_0x0080
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r8.M0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0023
            goto L_0x007d
        L_0x0023:
            boolean r4 = r3 instanceof h0.g.a.h.e
            if (r4 == 0) goto L_0x0028
            goto L_0x007d
        L_0x0028:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.p(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.p(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0040
            int r7 = r3.q
            if (r7 == r9) goto L_0x0040
            if (r5 != r6) goto L_0x0040
            int r7 = r3.r
            if (r7 == r9) goto L_0x0040
            r7 = r9
            goto L_0x0041
        L_0x0040:
            r7 = r10
        L_0x0041:
            if (r7 == 0) goto L_0x0044
            goto L_0x007d
        L_0x0044:
            if (r4 != r6) goto L_0x0048
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x0048:
            if (r5 != r6) goto L_0x004c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x004c:
            h0.g.a.h.k.b$a r6 = r8.X0
            r6.a = r4
            r6.b = r5
            int r4 = r3.w()
            r6.c = r4
            h0.g.a.h.k.b$a r4 = r8.X0
            int r5 = r3.q()
            r4.d = r5
            h0.g.a.h.k.b$a r4 = r8.X0
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.b) r5
            r5.b(r3, r4)
            h0.g.a.h.k.b$a r4 = r8.X0
            int r4 = r4.e
            r3.U(r4)
            h0.g.a.h.k.b$a r4 = r8.X0
            int r4 = r4.f
            r3.P(r4)
            h0.g.a.h.k.b$a r4 = r8.X0
            int r4 = r4.g
            r3.M(r4)
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r0 != 0) goto L_0x008a
            r8.V0 = r10
            r8.W0 = r10
            r8.U0 = r10
            return
        L_0x008a:
            int r11 = r8.S0
            int r12 = r8.T0
            int r13 = r8.O0
            int r14 = r8.P0
            r0 = 2
            int[] r15 = new int[r0]
            int r2 = r35 - r11
            int r2 = r2 - r12
            int r3 = r8.r1
            if (r3 != r9) goto L_0x009f
            int r2 = r37 - r13
            int r2 = r2 - r14
        L_0x009f:
            r7 = r2
            r2 = -1
            if (r3 != 0) goto L_0x00b0
            int r3 = r8.Z0
            if (r3 != r2) goto L_0x00a9
            r8.Z0 = r10
        L_0x00a9:
            int r3 = r8.a1
            if (r3 != r2) goto L_0x00bc
            r8.a1 = r10
            goto L_0x00bc
        L_0x00b0:
            int r3 = r8.Z0
            if (r3 != r2) goto L_0x00b6
            r8.Z0 = r10
        L_0x00b6:
            int r3 = r8.a1
            if (r3 != r2) goto L_0x00bc
            r8.a1 = r10
        L_0x00bc:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r8.M0
            r3 = r10
            r4 = r3
        L_0x00c0:
            int r5 = r8.N0
            r6 = 8
            if (r3 >= r5) goto L_0x00d3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r8.M0
            r5 = r5[r3]
            int r5 = r5.f8o0
            if (r5 != r6) goto L_0x00d0
            int r4 = r4 + 1
        L_0x00d0:
            int r3 = r3 + 1
            goto L_0x00c0
        L_0x00d3:
            if (r4 <= 0) goto L_0x00ee
            int r5 = r5 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r5]
            r3 = r10
            r5 = r3
        L_0x00da:
            int r4 = r8.N0
            if (r3 >= r4) goto L_0x00ee
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r8.M0
            r4 = r4[r3]
            int r10 = r4.f8o0
            if (r10 == r6) goto L_0x00ea
            r2[r5] = r4
            int r5 = r5 + 1
        L_0x00ea:
            int r3 = r3 + 1
            r10 = 0
            goto L_0x00da
        L_0x00ee:
            r10 = r2
            r6 = r5
            r8.w1 = r10
            r8.x1 = r6
            int r2 = r8.p1
            if (r2 == 0) goto L_0x0520
            if (r2 == r9) goto L_0x02cd
            if (r2 == r0) goto L_0x0108
            r27 = r11
            r28 = r12
            r29 = r13
            r31 = r14
            r32 = r15
            goto L_0x0532
        L_0x0108:
            int r2 = r8.r1
            if (r2 != 0) goto L_0x0130
            int r3 = r8.q1
            if (r3 > 0) goto L_0x012e
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0113:
            if (r3 >= r6) goto L_0x012d
            if (r3 <= 0) goto L_0x011a
            int r1 = r8.l1
            int r4 = r4 + r1
        L_0x011a:
            r1 = r10[r3]
            if (r1 != 0) goto L_0x011f
            goto L_0x012a
        L_0x011f:
            int r1 = r8.c0(r1, r7)
            int r1 = r1 + r4
            if (r1 <= r7) goto L_0x0127
            goto L_0x012d
        L_0x0127:
            int r5 = r5 + 1
            r4 = r1
        L_0x012a:
            int r3 = r3 + 1
            goto L_0x0113
        L_0x012d:
            r3 = r5
        L_0x012e:
            r1 = 0
            goto L_0x0153
        L_0x0130:
            int r1 = r8.q1
            if (r1 > 0) goto L_0x0152
            r1 = 0
            r3 = 0
            r4 = 0
        L_0x0137:
            if (r1 >= r6) goto L_0x0151
            if (r1 <= 0) goto L_0x013e
            int r5 = r8.m1
            int r3 = r3 + r5
        L_0x013e:
            r5 = r10[r1]
            if (r5 != 0) goto L_0x0143
            goto L_0x014e
        L_0x0143:
            int r5 = r8.b0(r5, r7)
            int r5 = r5 + r3
            if (r5 <= r7) goto L_0x014b
            goto L_0x0151
        L_0x014b:
            int r4 = r4 + 1
            r3 = r5
        L_0x014e:
            int r1 = r1 + 1
            goto L_0x0137
        L_0x0151:
            r1 = r4
        L_0x0152:
            r3 = 0
        L_0x0153:
            int[] r4 = r8.v1
            if (r4 != 0) goto L_0x015b
            int[] r0 = new int[r0]
            r8.v1 = r0
        L_0x015b:
            if (r1 != 0) goto L_0x015f
            if (r2 == r9) goto L_0x0163
        L_0x015f:
            if (r3 != 0) goto L_0x0181
            if (r2 != 0) goto L_0x0181
        L_0x0163:
            r0 = r34
            r4 = r37
            r5 = r1
            r21 = r6
            r20 = r8
            r17 = r15
            r18 = r17
            r1 = r35
            r6 = r2
            r2 = r9
            r15 = r14
            r9 = r20
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r3
            r3 = r36
            goto L_0x02a4
        L_0x0181:
            r0 = r34
            r4 = r1
            r5 = r2
            r9 = r8
            r20 = r9
            r17 = r15
            r18 = r17
            r19 = 0
            r1 = r35
            r2 = r36
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r6
            r6 = r3
            r3 = r37
        L_0x019c:
            if (r19 != 0) goto L_0x02af
            if (r5 != 0) goto L_0x01b0
            float r4 = (float) r7
            r34 = r0
            float r0 = (float) r6
            float r4 = r4 / r0
            r35 = r1
            double r0 = (double) r4
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = r0
            r0 = r6
            goto L_0x01be
        L_0x01b0:
            r34 = r0
            r35 = r1
            float r0 = (float) r7
            float r1 = (float) r4
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = r4
        L_0x01be:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r9.u1
            if (r4 == 0) goto L_0x01cb
            int r6 = r4.length
            if (r6 >= r0) goto L_0x01c6
            goto L_0x01cb
        L_0x01c6:
            r6 = 0
            java.util.Arrays.fill(r4, r6)
            goto L_0x01d0
        L_0x01cb:
            r6 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r0]
            r9.u1 = r4
        L_0x01d0:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r9.t1
            if (r4 == 0) goto L_0x01dd
            int r6 = r4.length
            if (r6 >= r1) goto L_0x01d8
            goto L_0x01dd
        L_0x01d8:
            r6 = 0
            java.util.Arrays.fill(r4, r6)
            goto L_0x01e1
        L_0x01dd:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r9.t1 = r4
        L_0x01e1:
            r4 = 0
        L_0x01e2:
            if (r4 >= r0) goto L_0x0243
            r6 = 0
        L_0x01e5:
            if (r6 >= r1) goto L_0x023a
            int r21 = r6 * r0
            int r21 = r21 + r4
            r36 = r2
            r2 = 1
            if (r5 != r2) goto L_0x01f4
            int r2 = r4 * r1
            int r21 = r2 + r6
        L_0x01f4:
            r37 = r3
            r2 = r21
            int r3 = r11.length
            if (r2 < r3) goto L_0x01fc
            goto L_0x0200
        L_0x01fc:
            r2 = r11[r2]
            if (r2 != 0) goto L_0x0203
        L_0x0200:
            r21 = r7
            goto L_0x0231
        L_0x0203:
            int r3 = r9.c0(r2, r10)
            r21 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r9.u1
            r22 = r7[r4]
            if (r22 == 0) goto L_0x0217
            r7 = r7[r4]
            int r7 = r7.w()
            if (r7 >= r3) goto L_0x021b
        L_0x0217:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r9.u1
            r3[r4] = r2
        L_0x021b:
            int r3 = r9.b0(r2, r10)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r9.t1
            r22 = r7[r6]
            if (r22 == 0) goto L_0x022d
            r7 = r7[r6]
            int r7 = r7.q()
            if (r7 >= r3) goto L_0x0231
        L_0x022d:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r9.t1
            r3[r6] = r2
        L_0x0231:
            int r6 = r6 + 1
            r2 = r36
            r3 = r37
            r7 = r21
            goto L_0x01e5
        L_0x023a:
            r36 = r2
            r37 = r3
            r21 = r7
            int r4 = r4 + 1
            goto L_0x01e2
        L_0x0243:
            r36 = r2
            r37 = r3
            r21 = r7
            r2 = 0
            r3 = 0
        L_0x024b:
            if (r2 >= r0) goto L_0x0261
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r9.u1
            r4 = r4[r2]
            if (r4 == 0) goto L_0x025e
            if (r2 <= 0) goto L_0x0258
            int r6 = r9.l1
            int r3 = r3 + r6
        L_0x0258:
            int r4 = r9.c0(r4, r10)
            int r4 = r4 + r3
            r3 = r4
        L_0x025e:
            int r2 = r2 + 1
            goto L_0x024b
        L_0x0261:
            r2 = 0
            r4 = 0
        L_0x0263:
            if (r2 >= r1) goto L_0x0279
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r9.t1
            r6 = r6[r2]
            if (r6 == 0) goto L_0x0276
            if (r2 <= 0) goto L_0x0270
            int r7 = r9.m1
            int r4 = r4 + r7
        L_0x0270:
            int r6 = r9.b0(r6, r10)
            int r6 = r6 + r4
            r4 = r6
        L_0x0276:
            int r2 = r2 + 1
            goto L_0x0263
        L_0x0279:
            r2 = 0
            r18[r2] = r3
            r2 = 1
            r18[r2] = r4
            if (r5 != 0) goto L_0x0288
            if (r3 <= r10) goto L_0x0299
            if (r0 <= r2) goto L_0x0299
            int r0 = r0 + -1
            goto L_0x028e
        L_0x0288:
            if (r4 <= r10) goto L_0x0299
            if (r1 <= r2) goto L_0x0299
            int r1 = r1 + -1
        L_0x028e:
            r6 = r0
            r4 = r1
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            goto L_0x02ab
        L_0x0299:
            r3 = r36
            r4 = r37
            r7 = r0
            r6 = r5
            r0 = r34
            r5 = r1
            r1 = r35
        L_0x02a4:
            r19 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
        L_0x02ab:
            r7 = r21
            goto L_0x019c
        L_0x02af:
            r34 = r0
            r35 = r1
            r36 = r2
            r37 = r3
            r2 = 1
            int[] r0 = r9.v1
            r1 = 0
            r0[r1] = r6
            r0[r2] = r4
            r0 = r34
            r1 = r35
            r2 = r36
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r17
            goto L_0x0546
        L_0x02cd:
            int r9 = r8.r1
            if (r6 != 0) goto L_0x02dd
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r20 = r8
            goto L_0x0546
        L_0x02dd:
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            r0.clear()
            h0.g.a.h.d$a r5 = new h0.g.a.h.d$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.N
            r0 = r5
            r16 = r1
            r1 = r33
            r17 = r2
            r2 = r9
            r27 = r11
            r11 = r5
            r5 = r17
            r28 = r12
            r12 = r6
            r6 = r16
            r29 = r7
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            r0.add(r11)
            if (r9 != 0) goto L_0x0398
            r5 = r11
            r0 = 0
            r1 = 0
            r11 = 0
        L_0x030e:
            if (r11 >= r12) goto L_0x0390
            r7 = r10[r11]
            r6 = r29
            int r16 = r8.c0(r7, r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r7.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x0322
            int r0 = r0 + 1
        L_0x0322:
            r17 = r0
            if (r1 == r6) goto L_0x032d
            int r0 = r8.l1
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r6) goto L_0x0333
        L_0x032d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.b
            if (r0 == 0) goto L_0x0333
            r0 = 1
            goto L_0x0334
        L_0x0333:
            r0 = 0
        L_0x0334:
            if (r0 != 0) goto L_0x0341
            if (r11 <= 0) goto L_0x0341
            int r2 = r8.q1
            if (r2 <= 0) goto L_0x0341
            int r2 = r11 % r2
            if (r2 != 0) goto L_0x0341
            r0 = 1
        L_0x0341:
            if (r0 == 0) goto L_0x036f
            h0.g.a.h.d$a r5 = new h0.g.a.h.d$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.N
            r0 = r5
            r18 = r1
            r1 = r33
            r19 = r2
            r2 = r9
            r29 = r13
            r13 = r5
            r5 = r19
            r30 = r6
            r6 = r18
            r31 = r14
            r14 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r13.n = r11
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            r0.add(r13)
            r5 = r13
            goto L_0x037f
        L_0x036f:
            r30 = r6
            r29 = r13
            r31 = r14
            r14 = r7
            if (r11 <= 0) goto L_0x037f
            int r0 = r8.l1
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0381
        L_0x037f:
            r1 = r16
        L_0x0381:
            r5.a(r14)
            int r11 = r11 + 1
            r0 = r17
            r13 = r29
            r29 = r30
            r14 = r31
            goto L_0x030e
        L_0x0390:
            r31 = r14
            r30 = r29
            r29 = r13
            goto L_0x040e
        L_0x0398:
            r31 = r14
            r30 = r29
            r29 = r13
            r5 = r11
            r0 = 0
            r1 = 0
            r11 = 0
        L_0x03a2:
            if (r11 >= r12) goto L_0x040e
            r13 = r10[r11]
            r14 = r30
            int r16 = r8.b0(r13, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r13.v()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x03b6
            int r0 = r0 + 1
        L_0x03b6:
            r17 = r0
            if (r1 == r14) goto L_0x03c1
            int r0 = r8.m1
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r14) goto L_0x03c7
        L_0x03c1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.b
            if (r0 == 0) goto L_0x03c7
            r0 = 1
            goto L_0x03c8
        L_0x03c7:
            r0 = 0
        L_0x03c8:
            if (r0 != 0) goto L_0x03d5
            if (r11 <= 0) goto L_0x03d5
            int r2 = r8.q1
            if (r2 <= 0) goto L_0x03d5
            int r2 = r11 % r2
            if (r2 != 0) goto L_0x03d5
            r0 = 1
        L_0x03d5:
            if (r0 == 0) goto L_0x03f5
            h0.g.a.h.d$a r7 = new h0.g.a.h.d$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.N
            r0 = r7
            r1 = r33
            r2 = r9
            r30 = r10
            r10 = r7
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.n = r11
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            r0.add(r10)
            r5 = r10
            goto L_0x0400
        L_0x03f5:
            r30 = r10
            if (r11 <= 0) goto L_0x0400
            int r0 = r8.m1
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0402
        L_0x0400:
            r1 = r16
        L_0x0402:
            r5.a(r13)
            int r11 = r11 + 1
            r0 = r17
            r10 = r30
            r30 = r14
            goto L_0x03a2
        L_0x040e:
            r14 = r30
            java.util.ArrayList<h0.g.a.h.d$a> r1 = r8.s1
            int r1 = r1.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.N
            int r6 = r8.S0
            int r7 = r8.O0
            int r10 = r8.T0
            int r11 = r8.P0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r33.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r13) goto L_0x0437
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r33.v()
            if (r12 != r13) goto L_0x0435
            goto L_0x0437
        L_0x0435:
            r12 = 0
            goto L_0x0438
        L_0x0437:
            r12 = 1
        L_0x0438:
            if (r0 <= 0) goto L_0x045f
            if (r12 == 0) goto L_0x045f
            r0 = 0
        L_0x043d:
            if (r0 >= r1) goto L_0x045f
            java.util.ArrayList<h0.g.a.h.d$a> r12 = r8.s1
            java.lang.Object r12 = r12.get(r0)
            h0.g.a.h.d$a r12 = (h0.g.a.h.d.a) r12
            if (r9 != 0) goto L_0x0453
            int r13 = r12.d()
            int r13 = r14 - r13
            r12.e(r13)
            goto L_0x045c
        L_0x0453:
            int r13 = r12.c()
            int r13 = r14 - r13
            r12.e(r13)
        L_0x045c:
            int r0 = r0 + 1
            goto L_0x043d
        L_0x045f:
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0462:
            if (r0 >= r1) goto L_0x0517
            r32 = r15
            java.util.ArrayList<h0.g.a.h.d$a> r15 = r8.s1
            java.lang.Object r15 = r15.get(r0)
            h0.g.a.h.d$a r15 = (h0.g.a.h.d.a) r15
            if (r9 != 0) goto L_0x04c0
            int r5 = r1 + -1
            if (r0 >= r5) goto L_0x0486
            java.util.ArrayList<h0.g.a.h.d$a> r5 = r8.s1
            int r11 = r0 + 1
            java.lang.Object r5 = r5.get(r11)
            h0.g.a.h.d$a r5 = (h0.g.a.h.d.a) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.L
            r30 = r1
            r11 = 0
            goto L_0x048c
        L_0x0486:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.N
            int r11 = r8.P0
            r30 = r1
        L_0x048c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.N
            r16 = r15
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r10
            r25 = r11
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r15.d()
            int r3 = java.lang.Math.max(r12, r3)
            int r7 = r15.c()
            int r7 = r7 + r13
            if (r0 <= 0) goto L_0x04bb
            int r12 = r8.m1
            int r7 = r7 + r12
        L_0x04bb:
            r12 = r3
            r13 = r7
            r7 = 0
            r3 = r1
            goto L_0x050f
        L_0x04c0:
            r30 = r1
            int r1 = r30 + -1
            if (r0 >= r1) goto L_0x04d6
            java.util.ArrayList<h0.g.a.h.d$a> r1 = r8.s1
            int r4 = r0 + 1
            java.lang.Object r1 = r1.get(r4)
            h0.g.a.h.d$a r1 = (h0.g.a.h.d.a) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.K
            r4 = 0
            goto L_0x04da
        L_0x04d6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.M
            int r4 = r8.T0
        L_0x04da:
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r15.b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.M
            r16 = r15
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r1
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r4
            r25 = r11
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r15.d()
            int r2 = r2 + r12
            int r6 = r15.c()
            int r6 = java.lang.Math.max(r13, r6)
            if (r0 <= 0) goto L_0x0509
            int r12 = r8.l1
            int r2 = r2 + r12
        L_0x0509:
            r12 = r2
            r13 = r6
            r2 = r10
            r6 = 0
            r10 = r4
            r4 = r1
        L_0x050f:
            int r0 = r0 + 1
            r1 = r30
            r15 = r32
            goto L_0x0462
        L_0x0517:
            r32 = r15
            r0 = 0
            r32[r0] = r12
            r0 = 1
            r32[r0] = r13
            goto L_0x0532
        L_0x0520:
            r30 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r31 = r14
            r32 = r15
            r12 = r6
            r14 = r7
            int r2 = r8.r1
            if (r12 != 0) goto L_0x054f
        L_0x0532:
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r20 = r8
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r31
            r15 = r32
        L_0x0546:
            r4 = r2
            r5 = r3
            r6 = r20
            r2 = 0
            r3 = r1
            r1 = 1
            goto L_0x05dc
        L_0x054f:
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            int r0 = r0.size()
            if (r0 != 0) goto L_0x056e
            h0.g.a.h.d$a r9 = new h0.g.a.h.d$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.N
            r0 = r9
            r1 = r33
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            r0.add(r9)
            goto L_0x05b0
        L_0x056e:
            java.util.ArrayList<h0.g.a.h.d$a> r0 = r8.s1
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            h0.g.a.h.d$a r9 = (h0.g.a.h.d.a) r9
            r9.c = r1
            r0 = 0
            r9.b = r0
            r9.l = r1
            r9.m = r1
            r9.n = r1
            r9.o = r1
            r9.p = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.N
            int r5 = r8.S0
            int r6 = r8.O0
            int r7 = r8.T0
            int r10 = r8.P0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r10
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x05b0:
            r2 = 0
        L_0x05b1:
            if (r2 >= r12) goto L_0x05bb
            r0 = r30[r2]
            r9.a(r0)
            int r2 = r2 + 1
            goto L_0x05b1
        L_0x05bb:
            int r0 = r9.d()
            r2 = 0
            r32[r2] = r0
            int r0 = r9.c()
            r1 = 1
            r32[r1] = r0
            r0 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r8
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r31
            r15 = r32
        L_0x05dc:
            r7 = r15[r2]
            int r7 = r7 + r11
            int r7 = r7 + r12
            r9 = r15[r1]
            int r9 = r9 + r13
            int r9 = r9 + r14
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != r11) goto L_0x05ec
            r0 = r3
            goto L_0x05f8
        L_0x05ec:
            if (r0 != r10) goto L_0x05f3
            int r0 = java.lang.Math.min(r7, r3)
            goto L_0x05f8
        L_0x05f3:
            if (r0 != 0) goto L_0x05f7
            r0 = r7
            goto L_0x05f8
        L_0x05f7:
            r0 = r2
        L_0x05f8:
            if (r4 != r11) goto L_0x05fc
            r3 = r5
            goto L_0x0608
        L_0x05fc:
            if (r4 != r10) goto L_0x0603
            int r3 = java.lang.Math.min(r9, r5)
            goto L_0x0608
        L_0x0603:
            if (r4 != 0) goto L_0x0607
            r3 = r9
            goto L_0x0608
        L_0x0607:
            r3 = r2
        L_0x0608:
            r6.V0 = r0
            r6.W0 = r3
            r6.U(r0)
            r6.P(r3)
            int r0 = r6.N0
            if (r0 <= 0) goto L_0x0618
            r9 = r1
            goto L_0x0619
        L_0x0618:
            r9 = r2
        L_0x0619:
            r6.U0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.d.Z(int, int, int, int):void");
    }

    public final int b0(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.v() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.y * ((float) i));
                if (i3 != constraintWidget.q()) {
                    constraintWidget.g = true;
                    a0(constraintWidget, constraintWidget.r(), constraintWidget.w(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.q();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.w()) * constraintWidget.Z) + 0.5f);
                }
            }
        }
        return constraintWidget.q();
    }

    public final int c0(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.r() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.q;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.v * ((float) i));
                if (i3 != constraintWidget.w()) {
                    constraintWidget.g = true;
                    a0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.v(), constraintWidget.q());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.w();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.q()) * constraintWidget.Z) + 0.5f);
                }
            }
        }
        return constraintWidget.w();
    }

    public void f(h0.g.a.d dVar, boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        super.f(dVar, z);
        ConstraintWidget constraintWidget2 = this.W;
        boolean z2 = constraintWidget2 != null && ((c) constraintWidget2).R0;
        int i2 = this.p1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.s1.size();
                int i3 = 0;
                while (i3 < size) {
                    this.s1.get(i3).b(z2, i3, i3 == size + -1);
                    i3++;
                }
            } else if (!(i2 != 2 || this.v1 == null || this.u1 == null || this.t1 == null)) {
                for (int i4 = 0; i4 < this.x1; i4++) {
                    this.w1[i4].J();
                }
                int[] iArr = this.v1;
                int i5 = iArr[0];
                int i6 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                float f2 = this.f1;
                int i7 = 0;
                while (i7 < i5) {
                    if (z2) {
                        i = (i5 - i7) - 1;
                        f = 1.0f - this.f1;
                    } else {
                        f = f2;
                        i = i7;
                    }
                    ConstraintWidget constraintWidget4 = this.u1[i];
                    if (!(constraintWidget4 == null || constraintWidget4.f8o0 == 8)) {
                        if (i7 == 0) {
                            constraintWidget4.j(constraintWidget4.K, this.K, this.S0);
                            constraintWidget4.B0 = this.Z0;
                            constraintWidget4.f4k0 = f;
                        }
                        if (i7 == i5 - 1) {
                            constraintWidget4.j(constraintWidget4.M, this.M, this.T0);
                        }
                        if (i7 > 0 && constraintWidget3 != null) {
                            constraintWidget4.j(constraintWidget4.K, constraintWidget3.M, this.l1);
                            constraintWidget3.j(constraintWidget3.M, constraintWidget4.K, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                    i7++;
                    f2 = f;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    ConstraintWidget constraintWidget5 = this.t1[i8];
                    if (!(constraintWidget5 == null || constraintWidget5.f8o0 == 8)) {
                        if (i8 == 0) {
                            constraintWidget5.j(constraintWidget5.L, this.L, this.O0);
                            constraintWidget5.C0 = this.a1;
                            constraintWidget5.f5l0 = this.g1;
                        }
                        if (i8 == i6 - 1) {
                            constraintWidget5.j(constraintWidget5.N, this.N, this.P0);
                        }
                        if (i8 > 0 && constraintWidget3 != null) {
                            constraintWidget5.j(constraintWidget5.L, constraintWidget3.N, this.m1);
                            constraintWidget3.j(constraintWidget3.N, constraintWidget5.L, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.r1 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.w1;
                        if (!(i11 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i11]) == null || constraintWidget.f8o0 == 8)) {
                            ConstraintWidget constraintWidget6 = this.u1[i9];
                            ConstraintWidget constraintWidget7 = this.t1[i10];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.j(constraintWidget.K, constraintWidget6.K, 0);
                                constraintWidget.j(constraintWidget.M, constraintWidget6.M, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.j(constraintWidget.L, constraintWidget7.L, 0);
                                constraintWidget.j(constraintWidget.N, constraintWidget7.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.s1.size() > 0) {
            this.s1.get(0).b(z2, 0, true);
        }
        this.U0 = false;
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        d dVar = (d) constraintWidget;
        this.Z0 = dVar.Z0;
        this.a1 = dVar.a1;
        this.b1 = dVar.b1;
        this.c1 = dVar.c1;
        this.d1 = dVar.d1;
        this.e1 = dVar.e1;
        this.f1 = dVar.f1;
        this.g1 = dVar.g1;
        this.h1 = dVar.h1;
        this.i1 = dVar.i1;
        this.j1 = dVar.j1;
        this.k1 = dVar.k1;
        this.l1 = dVar.l1;
        this.m1 = dVar.m1;
        this.n1 = dVar.n1;
        this.o1 = dVar.o1;
        this.p1 = dVar.p1;
        this.q1 = dVar.q1;
        this.r1 = dVar.r1;
    }
}
