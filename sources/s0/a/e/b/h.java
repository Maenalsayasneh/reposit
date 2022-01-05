package s0.a.e.b;

import java.math.BigInteger;
import java.util.Hashtable;
import s0.a.b.j;
import s0.a.e.b.e;
import s0.a.e.b.g;

public abstract class h {
    public static final g[] a = new g[0];
    public e b;
    public g c;
    public g d;
    public g[] e;
    public Hashtable f;

    public class a implements n {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public o a(o oVar) {
            s sVar = oVar instanceof s ? (s) oVar : null;
            if (sVar == null) {
                sVar = new s();
            }
            if (sVar.a) {
                return sVar;
            }
            if (!sVar.b) {
                if (this.a || h.this.s()) {
                    sVar.b = true;
                } else {
                    sVar.a = true;
                    return sVar;
                }
            }
            if (this.b && !sVar.c) {
                if (!h.this.t()) {
                    sVar.a = true;
                    return sVar;
                }
                sVar.c = true;
            }
            return sVar;
        }
    }

    public static abstract class b extends h {
        public b(e eVar, g gVar, g gVar2) {
            super(eVar, gVar, gVar2);
        }

        public b(e eVar, g gVar, g gVar2, g[] gVarArr) {
            super(eVar, gVar, gVar2, gVarArr);
        }

        public b B(int i) {
            h f;
            if (m()) {
                return this;
            }
            e eVar = this.b;
            int i2 = eVar.f;
            g gVar = this.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                g gVar2 = this.d;
                g gVar3 = this.e[0];
                f = eVar.g(gVar.q(i), gVar2.q(i), new g[]{gVar3.q(i)});
                return (b) f;
            }
            f = eVar.f(gVar.q(i), this.d.q(i));
            return (b) f;
        }

        public boolean s() {
            g gVar;
            g gVar2;
            e eVar = this.b;
            g gVar3 = this.c;
            g gVar4 = eVar.b;
            g gVar5 = eVar.c;
            int i = eVar.f;
            if (i == 6) {
                g gVar6 = this.e[0];
                boolean h = gVar6.h();
                if (gVar3.i()) {
                    g o = this.d.o();
                    if (!h) {
                        gVar5 = gVar5.j(gVar6.o());
                    }
                    return o.equals(gVar5);
                }
                g gVar7 = this.d;
                g o2 = gVar3.o();
                if (h) {
                    gVar2 = i0.d.a.a.a.s1(gVar7, gVar7, gVar4);
                    gVar = o2.o().a(gVar5);
                } else {
                    g o3 = gVar6.o();
                    g o4 = o3.o();
                    gVar2 = gVar7.a(gVar6).l(gVar7, gVar4, o3);
                    gVar = o2.p(gVar5, o4);
                }
                return gVar2.j(o2).equals(gVar);
            }
            g gVar8 = this.d;
            g j = gVar8.a(gVar3).j(gVar8);
            if (i != 0) {
                if (i == 1) {
                    g gVar9 = this.e[0];
                    if (!gVar9.h()) {
                        g j2 = gVar9.j(gVar9.o());
                        j = j.j(gVar9);
                        gVar4 = gVar4.j(gVar9);
                        gVar5 = gVar5.j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return j.equals(gVar3.a(gVar4).j(gVar3.o()).a(gVar5));
        }

        public boolean t() {
            BigInteger bigInteger = this.b.e;
            if (c.c.equals(bigInteger)) {
                return ((g.a) q().d()).w() != 0;
            }
            if (!c.e.equals(bigInteger)) {
                return h.super.t();
            }
            h q = q();
            g d = q.d();
            e eVar = this.b;
            g w = ((e.a) eVar).w(d.a(eVar.b));
            if (w == null) {
                return false;
            }
            if (((g.a) d.j(w).a(q.e())).w() == 0) {
                return true;
            }
            return false;
        }

        public h u(g gVar) {
            if (m()) {
                return this;
            }
            int g = g();
            if (g == 5) {
                g gVar2 = this.c;
                g gVar3 = this.d;
                return this.b.g(gVar2, gVar3.a(gVar2).d(gVar).a(gVar2.j(gVar)), this.e);
            } else if (g != 6) {
                return h.super.u(gVar);
            } else {
                g gVar4 = this.c;
                g gVar5 = this.d;
                g gVar6 = this.e[0];
                g j = gVar4.j(gVar.o());
                g a = gVar5.a(gVar4).a(j);
                g j2 = gVar6.j(gVar);
                return this.b.g(j, a, new g[]{j2});
            }
        }

        public h v(g gVar) {
            if (m()) {
                return this;
            }
            int g = g();
            if (g != 5 && g != 6) {
                return h.super.v(gVar);
            }
            g gVar2 = this.c;
            return this.b.g(gVar2, this.d.a(gVar2).j(gVar).a(gVar2), this.e);
        }

        public h w(h hVar) {
            return hVar.m() ? this : a(hVar.p());
        }
    }

    public static abstract class c extends h {
        public c(e eVar, g gVar, g gVar2) {
            super(eVar, gVar, gVar2);
        }

        public c(e eVar, g gVar, g gVar2, g[] gVarArr) {
            super(eVar, gVar, gVar2, gVarArr);
        }

        public boolean f() {
            return e().s();
        }

        public boolean s() {
            g gVar = this.c;
            g gVar2 = this.d;
            e eVar = this.b;
            g gVar3 = eVar.b;
            g gVar4 = eVar.c;
            g o = gVar2.o();
            int g = g();
            if (g != 0) {
                if (g == 1) {
                    g gVar5 = this.e[0];
                    if (!gVar5.h()) {
                        g o2 = gVar5.o();
                        g j = gVar5.j(o2);
                        o = o.j(gVar5);
                        gVar3 = gVar3.j(o2);
                        gVar4 = gVar4.j(j);
                    }
                } else if (g == 2 || g == 3 || g == 4) {
                    g gVar6 = this.e[0];
                    if (!gVar6.h()) {
                        g o3 = gVar6.o();
                        g o4 = o3.o();
                        g j2 = o3.j(o4);
                        gVar3 = gVar3.j(o4);
                        gVar4 = gVar4.j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return o.equals(gVar.o().a(gVar3).j(gVar).a(gVar4));
        }

        public h w(h hVar) {
            return hVar.m() ? this : a(hVar.p());
        }
    }

    public static class d extends b {
        public d(e eVar, g gVar, g gVar2) {
            super(eVar, gVar, gVar2);
        }

        public d(e eVar, g gVar, g gVar2, g[] gVarArr) {
            super(eVar, gVar, gVar2, gVarArr);
        }

        public h A(h hVar) {
            if (m()) {
                return hVar;
            }
            if (hVar.m()) {
                return z();
            }
            e eVar = this.b;
            g gVar = this.c;
            if (gVar.i()) {
                return hVar;
            }
            if (eVar.f != 6) {
                return z().a(hVar);
            }
            g gVar2 = hVar.c;
            g gVar3 = hVar.e[0];
            if (gVar2.i() || !gVar3.h()) {
                return z().a(hVar);
            }
            g gVar4 = this.d;
            g gVar5 = this.e[0];
            g gVar6 = hVar.d;
            g o = gVar.o();
            g o2 = gVar4.o();
            g o3 = gVar5.o();
            g a = eVar.b.j(o3).a(o2).a(gVar4.j(gVar5));
            g b = gVar6.b();
            g l = eVar.b.a(b).j(o3).a(o2).l(a, o, o3);
            g j = gVar2.j(o3);
            g o4 = j.a(a).o();
            if (o4.i()) {
                return l.i() ? hVar.z() : eVar.m();
            }
            if (l.i()) {
                return new d(eVar, l, eVar.c.n());
            }
            g j2 = l.o().j(j);
            g j3 = l.j(o4).j(o3);
            return new d(eVar, j2, l.a(o4).o().l(a, b, j3), new g[]{j3});
        }

        public h a(h hVar) {
            g gVar;
            g gVar2;
            g gVar3;
            g gVar4;
            g gVar5;
            g gVar6;
            if (m()) {
                return hVar;
            }
            if (hVar.m()) {
                return this;
            }
            e eVar = this.b;
            int i = eVar.f;
            g gVar7 = this.c;
            g gVar8 = hVar.c;
            if (i == 0) {
                g gVar9 = this.d;
                g gVar10 = hVar.d;
                g a = gVar7.a(gVar8);
                g a2 = gVar9.a(gVar10);
                if (a.i()) {
                    return a2.i() ? z() : eVar.m();
                }
                g d = a2.d(a);
                g a3 = i0.d.a.a.a.s1(d, d, a).a(eVar.b);
                return new d(eVar, a3, d.j(gVar7.a(a3)).a(a3).a(gVar9));
            } else if (i == 1) {
                g gVar11 = this.d;
                g gVar12 = this.e[0];
                g gVar13 = hVar.d;
                g gVar14 = hVar.e[0];
                boolean h = gVar14.h();
                g a4 = gVar12.j(gVar13).a(h ? gVar11 : gVar11.j(gVar14));
                g a5 = gVar12.j(gVar8).a(h ? gVar7 : gVar7.j(gVar14));
                if (a5.i()) {
                    return a4.i() ? z() : eVar.m();
                }
                g o = a5.o();
                g j = o.j(a5);
                if (!h) {
                    gVar12 = gVar12.j(gVar14);
                }
                g a6 = a4.a(a5);
                g a7 = a6.l(a4, o, eVar.b).j(gVar12).a(j);
                g j2 = a5.j(a7);
                if (!h) {
                    o = o.j(gVar14);
                }
                return new d(eVar, j2, a4.l(gVar7, a5, gVar11).l(o, a6, a7), new g[]{j.j(gVar12)});
            } else if (i != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else if (gVar7.i()) {
                return gVar8.i() ? eVar.m() : hVar.a(this);
            } else {
                g gVar15 = this.d;
                g gVar16 = this.e[0];
                g gVar17 = hVar.d;
                g gVar18 = hVar.e[0];
                boolean h2 = gVar16.h();
                if (!h2) {
                    gVar2 = gVar8.j(gVar16);
                    gVar = gVar17.j(gVar16);
                } else {
                    gVar2 = gVar8;
                    gVar = gVar17;
                }
                boolean h3 = gVar18.h();
                if (!h3) {
                    gVar7 = gVar7.j(gVar18);
                    gVar3 = gVar15.j(gVar18);
                } else {
                    gVar3 = gVar15;
                }
                g a8 = gVar3.a(gVar);
                g a9 = gVar7.a(gVar2);
                if (a9.i()) {
                    return a8.i() ? z() : eVar.m();
                }
                if (gVar8.i()) {
                    h q = q();
                    g gVar19 = q.c;
                    g j3 = q.j();
                    g d2 = j3.a(gVar17).d(gVar19);
                    gVar5 = i0.d.a.a.a.s1(d2, d2, gVar19).a(eVar.b);
                    if (gVar5.i()) {
                        return new d(eVar, gVar5, eVar.c.n());
                    }
                    gVar4 = d2.j(gVar19.a(gVar5)).a(gVar5).a(j3).d(gVar5).a(gVar5);
                    gVar6 = eVar.k(c.b);
                } else {
                    g o2 = a9.o();
                    g j4 = a8.j(gVar7);
                    g j5 = a8.j(gVar2);
                    g j6 = j4.j(j5);
                    if (j6.i()) {
                        return new d(eVar, j6, eVar.c.n());
                    }
                    g j7 = a8.j(o2);
                    if (!h3) {
                        j7 = j7.j(gVar18);
                    }
                    gVar4 = j5.a(o2).p(j7, gVar15.a(gVar16));
                    gVar6 = !h2 ? j7.j(gVar16) : j7;
                    gVar5 = j6;
                }
                return new d(eVar, gVar5, gVar4, new g[]{gVar6});
            }
        }

        public h b() {
            return new d((e) null, d(), e());
        }

        public boolean f() {
            g gVar = this.c;
            if (gVar.i()) {
                return false;
            }
            g gVar2 = this.d;
            int g = g();
            if (g != 5 && g != 6) {
                return gVar2.d(gVar).s();
            }
            if (gVar2.s() != gVar.s()) {
                return true;
            }
            return false;
        }

        public g j() {
            int g = g();
            if (g != 5 && g != 6) {
                return this.d;
            }
            g gVar = this.c;
            g gVar2 = this.d;
            if (m() || gVar.i()) {
                return gVar2;
            }
            g j = gVar2.a(gVar).j(gVar);
            if (6 != g) {
                return j;
            }
            g gVar3 = this.e[0];
            return !gVar3.h() ? j.d(gVar3) : j;
        }

        public h p() {
            if (m()) {
                return this;
            }
            g gVar = this.c;
            if (gVar.i()) {
                return this;
            }
            int g = g();
            if (g == 0) {
                return new d(this.b, gVar, this.d.a(gVar));
            } else if (g == 1) {
                g gVar2 = this.d;
                g gVar3 = this.e[0];
                return new d(this.b, gVar, gVar2.a(gVar), new g[]{gVar3});
            } else if (g == 5) {
                return new d(this.b, gVar, this.d.b());
            } else if (g == 6) {
                g gVar4 = this.d;
                g gVar5 = this.e[0];
                return new d(this.b, gVar, gVar4.a(gVar5), new g[]{gVar5});
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public h z() {
            g gVar;
            g gVar2;
            if (m()) {
                return this;
            }
            e eVar = this.b;
            g gVar3 = this.c;
            if (gVar3.i()) {
                return eVar.m();
            }
            int i = eVar.f;
            if (i == 0) {
                g a = this.d.d(gVar3).a(gVar3);
                g a2 = a.o().a(a).a(eVar.b);
                return new d(eVar, a2, gVar3.p(a2, a.b()));
            } else if (i == 1) {
                g gVar4 = this.d;
                g gVar5 = this.e[0];
                boolean h = gVar5.h();
                g j = h ? gVar3 : gVar3.j(gVar5);
                if (!h) {
                    gVar4 = gVar4.j(gVar5);
                }
                g o = gVar3.o();
                g a3 = o.a(gVar4);
                g o2 = j.o();
                g a4 = a3.a(j);
                g l = a4.l(a3, o2, eVar.b);
                return new d(eVar, j.j(l), o.o().l(j, l, a4), new g[]{j.j(o2)});
            } else if (i == 6) {
                g gVar6 = this.d;
                g gVar7 = this.e[0];
                boolean h2 = gVar7.h();
                g j2 = h2 ? gVar6 : gVar6.j(gVar7);
                g o3 = h2 ? gVar7 : gVar7.o();
                g gVar8 = eVar.b;
                if (h2) {
                    gVar = gVar8;
                } else {
                    gVar = gVar8.j(o3);
                }
                g s1 = i0.d.a.a.a.s1(gVar6, j2, gVar);
                if (s1.i()) {
                    return new d(eVar, s1, eVar.c.n());
                }
                g o4 = s1.o();
                g j3 = h2 ? s1 : s1.j(o3);
                g gVar9 = eVar.c;
                if (gVar9.c() < (eVar.l() >> 1)) {
                    g o5 = gVar6.a(gVar3).o();
                    gVar2 = o5.a(s1).a(o3).j(o5).a(gVar9.h() ? gVar.a(o3).o() : gVar.p(gVar9, o3.o())).a(o4);
                    if (!gVar8.i()) {
                        if (!gVar8.h()) {
                            gVar2 = gVar2.a(gVar8.b().j(j3));
                        }
                        return new d(eVar, o4, gVar2, new g[]{j3});
                    }
                } else {
                    if (!h2) {
                        gVar3 = gVar3.j(gVar7);
                    }
                    gVar2 = gVar3.p(s1, j2).a(o4);
                }
                gVar2 = gVar2.a(j3);
                return new d(eVar, o4, gVar2, new g[]{j3});
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
    }

    public static class e extends c {
        public e(e eVar, g gVar, g gVar2) {
            super(eVar, gVar, gVar2);
        }

        public e(e eVar, g gVar, g gVar2, g[] gVarArr) {
            super(eVar, gVar, gVar2, gVarArr);
        }

        public h A(h hVar) {
            if (this == hVar) {
                return x();
            }
            if (m()) {
                return hVar;
            }
            if (hVar.m()) {
                return z();
            }
            g gVar = this.d;
            if (gVar.i()) {
                return hVar;
            }
            e eVar = this.b;
            int i = eVar.f;
            if (i != 0) {
                return i != 4 ? z().a(hVar) : F(false).a(hVar);
            }
            g gVar2 = this.c;
            g gVar3 = hVar.c;
            g gVar4 = hVar.d;
            g r = gVar3.r(gVar2);
            g r2 = gVar4.r(gVar);
            if (r.i()) {
                return r2.i() ? x() : this;
            }
            g o = r.o();
            g r3 = o.j(gVar2.a(gVar2).a(gVar3)).r(r2.o());
            if (r3.i()) {
                return eVar.m();
            }
            g g = r3.j(r).g();
            g j = r3.j(g).j(r2);
            g r4 = gVar.a(gVar).j(o).j(r).j(g).r(j);
            g a = r4.r(j).j(j.a(r4)).a(gVar3);
            return new e(eVar, a, gVar2.r(a).j(r4).r(gVar));
        }

        public g B(g gVar, g gVar2) {
            g gVar3 = this.b.b;
            if (gVar3.i() || gVar.h()) {
                return gVar3;
            }
            if (gVar2 == null) {
                gVar2 = gVar.o();
            }
            g o = gVar2.o();
            g m = gVar3.m();
            return m.c() < gVar3.c() ? o.j(m).m() : o.j(gVar3);
        }

        public g C(g gVar) {
            g a = gVar.a(gVar);
            return a.a(a);
        }

        public g D() {
            g[] gVarArr = this.e;
            g gVar = gVarArr[1];
            if (gVar != null) {
                return gVar;
            }
            g B = B(gVarArr[0], (g) null);
            gVarArr[1] = B;
            return B;
        }

        public g E(g gVar) {
            return gVar.a(gVar).a(gVar);
        }

        public e F(boolean z) {
            g gVar;
            g gVar2 = this.c;
            g gVar3 = this.d;
            g gVar4 = this.e[0];
            g D = D();
            g a = E(gVar2.o()).a(D);
            g a2 = gVar3.a(gVar3);
            g j = a2.j(gVar3);
            g j2 = gVar2.j(j);
            g a3 = j2.a(j2);
            g r = a.o().r(a3.a(a3));
            g o = j.o();
            g a4 = o.a(o);
            g r2 = a.j(a3.r(r)).r(a4);
            if (z) {
                g j3 = a4.j(D);
                gVar = j3.a(j3);
            } else {
                gVar = null;
            }
            if (!gVar4.h()) {
                a2 = a2.j(gVar4);
            }
            return new e(this.b, r, r2, new g[]{a2, gVar});
        }

        /* JADX WARNING: type inference failed for: r17v0, types: [s0.a.e.b.h] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
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
                int r3 = r2.f
                s0.a.e.b.g r4 = r0.c
                s0.a.e.b.g r5 = r0.d
                s0.a.e.b.g r6 = r1.c
                s0.a.e.b.g r7 = r1.d
                if (r3 == 0) goto L_0x01d0
                r8 = 1
                r9 = 0
                if (r3 == r8) goto L_0x013e
                r10 = 4
                r11 = 2
                if (r3 == r11) goto L_0x003a
                if (r3 != r10) goto L_0x0032
                goto L_0x003a
            L_0x0032:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            L_0x003a:
                s0.a.e.b.g[] r12 = r0.e
                r12 = r12[r9]
                s0.a.e.b.g[] r1 = r1.e
                r1 = r1[r9]
                boolean r13 = r12.h()
                if (r13 != 0) goto L_0x009f
                boolean r15 = r12.equals(r1)
                if (r15 == 0) goto L_0x009f
                s0.a.e.b.g r1 = r4.r(r6)
                s0.a.e.b.g r7 = r5.r(r7)
                boolean r13 = r1.i()
                if (r13 == 0) goto L_0x006c
                boolean r1 = r7.i()
                if (r1 == 0) goto L_0x0067
                s0.a.e.b.h r1 = r16.z()
                return r1
            L_0x0067:
                s0.a.e.b.h r1 = r2.m()
                return r1
            L_0x006c:
                s0.a.e.b.g r13 = r1.o()
                s0.a.e.b.g r4 = r4.j(r13)
                s0.a.e.b.g r6 = r6.j(r13)
                s0.a.e.b.g r13 = r4.r(r6)
                s0.a.e.b.g r5 = r13.j(r5)
                s0.a.e.b.g r13 = r7.o()
                s0.a.e.b.g r13 = r13.r(r4)
                s0.a.e.b.g r6 = r13.r(r6)
                s0.a.e.b.g r4 = r4.r(r6)
                s0.a.e.b.g r4 = r4.j(r7)
                s0.a.e.b.g r4 = r4.r(r5)
                s0.a.e.b.g r1 = r1.j(r12)
            L_0x009c:
                r14 = 0
                goto L_0x0122
            L_0x009f:
                if (r13 == 0) goto L_0x00a2
                goto L_0x00b2
            L_0x00a2:
                s0.a.e.b.g r15 = r12.o()
                s0.a.e.b.g r6 = r15.j(r6)
                s0.a.e.b.g r15 = r15.j(r12)
                s0.a.e.b.g r7 = r15.j(r7)
            L_0x00b2:
                boolean r15 = r1.h()
                if (r15 == 0) goto L_0x00b9
                goto L_0x00c9
            L_0x00b9:
                s0.a.e.b.g r14 = r1.o()
                s0.a.e.b.g r4 = r14.j(r4)
                s0.a.e.b.g r14 = r14.j(r1)
                s0.a.e.b.g r5 = r14.j(r5)
            L_0x00c9:
                s0.a.e.b.g r6 = r4.r(r6)
                s0.a.e.b.g r7 = r5.r(r7)
                boolean r14 = r6.i()
                if (r14 == 0) goto L_0x00e7
                boolean r1 = r7.i()
                if (r1 == 0) goto L_0x00e2
                s0.a.e.b.h r1 = r16.z()
                return r1
            L_0x00e2:
                s0.a.e.b.h r1 = r2.m()
                return r1
            L_0x00e7:
                s0.a.e.b.g r14 = r6.o()
                s0.a.e.b.g r8 = r14.j(r6)
                s0.a.e.b.g r4 = r14.j(r4)
                s0.a.e.b.g r9 = r7.o()
                s0.a.e.b.g r9 = r9.a(r8)
                s0.a.e.b.g r11 = r4.a(r4)
                s0.a.e.b.g r9 = r9.r(r11)
                s0.a.e.b.g r4 = r4.r(r9)
                s0.a.e.b.g r4 = r4.k(r7, r8, r5)
                if (r13 != 0) goto L_0x0112
                s0.a.e.b.g r5 = r6.j(r12)
                goto L_0x0113
            L_0x0112:
                r5 = r6
            L_0x0113:
                if (r15 != 0) goto L_0x011a
                s0.a.e.b.g r1 = r5.j(r1)
                goto L_0x011b
            L_0x011a:
                r1 = r5
            L_0x011b:
                if (r1 != r6) goto L_0x011f
                r6 = r9
                goto L_0x0122
            L_0x011f:
                r6 = r9
                goto L_0x009c
            L_0x0122:
                if (r3 != r10) goto L_0x0132
                s0.a.e.b.g r3 = r0.B(r1, r14)
                r5 = 2
                s0.a.e.b.g[] r5 = new s0.a.e.b.g[r5]
                r8 = 0
                r5[r8] = r1
                r7 = 1
                r5[r7] = r3
                goto L_0x0138
            L_0x0132:
                r7 = 1
                r8 = 0
                s0.a.e.b.g[] r5 = new s0.a.e.b.g[r7]
                r5[r8] = r1
            L_0x0138:
                s0.a.e.b.h$e r1 = new s0.a.e.b.h$e
                r1.<init>(r2, r6, r4, r5)
                return r1
            L_0x013e:
                r8 = r9
                s0.a.e.b.g[] r3 = r0.e
                r3 = r3[r8]
                s0.a.e.b.g[] r1 = r1.e
                r1 = r1[r8]
                boolean r8 = r3.h()
                boolean r9 = r1.h()
                if (r8 == 0) goto L_0x0152
                goto L_0x0156
            L_0x0152:
                s0.a.e.b.g r7 = r7.j(r3)
            L_0x0156:
                if (r9 == 0) goto L_0x0159
                goto L_0x015d
            L_0x0159:
                s0.a.e.b.g r5 = r5.j(r1)
            L_0x015d:
                s0.a.e.b.g r7 = r7.r(r5)
                if (r8 == 0) goto L_0x0164
                goto L_0x0168
            L_0x0164:
                s0.a.e.b.g r6 = r6.j(r3)
            L_0x0168:
                if (r9 == 0) goto L_0x016b
                goto L_0x016f
            L_0x016b:
                s0.a.e.b.g r4 = r4.j(r1)
            L_0x016f:
                s0.a.e.b.g r6 = r6.r(r4)
                boolean r10 = r6.i()
                if (r10 == 0) goto L_0x0189
                boolean r1 = r7.i()
                if (r1 == 0) goto L_0x0184
                s0.a.e.b.h r1 = r16.z()
                return r1
            L_0x0184:
                s0.a.e.b.h r1 = r2.m()
                return r1
            L_0x0189:
                if (r8 == 0) goto L_0x018d
                r3 = r1
                goto L_0x0194
            L_0x018d:
                if (r9 == 0) goto L_0x0190
                goto L_0x0194
            L_0x0190:
                s0.a.e.b.g r3 = r3.j(r1)
            L_0x0194:
                s0.a.e.b.g r1 = r6.o()
                s0.a.e.b.g r8 = r1.j(r6)
                s0.a.e.b.g r1 = r1.j(r4)
                s0.a.e.b.g r4 = r7.o()
                s0.a.e.b.g r4 = r4.j(r3)
                s0.a.e.b.g r4 = r4.r(r8)
                s0.a.e.b.g r9 = r1.a(r1)
                s0.a.e.b.g r4 = r4.r(r9)
                s0.a.e.b.g r6 = r6.j(r4)
                s0.a.e.b.g r1 = r1.r(r4)
                s0.a.e.b.g r1 = r1.k(r7, r5, r8)
                s0.a.e.b.g r3 = r8.j(r3)
                s0.a.e.b.h$e r4 = new s0.a.e.b.h$e
                r5 = 1
                s0.a.e.b.g[] r5 = new s0.a.e.b.g[r5]
                r7 = 0
                r5[r7] = r3
                r4.<init>(r2, r6, r1, r5)
                return r4
            L_0x01d0:
                s0.a.e.b.g r1 = r6.r(r4)
                s0.a.e.b.g r3 = r7.r(r5)
                boolean r7 = r1.i()
                if (r7 == 0) goto L_0x01ee
                boolean r1 = r3.i()
                if (r1 == 0) goto L_0x01e9
                s0.a.e.b.h r1 = r16.z()
                return r1
            L_0x01e9:
                s0.a.e.b.h r1 = r2.m()
                return r1
            L_0x01ee:
                s0.a.e.b.g r1 = r3.d(r1)
                s0.a.e.b.g r3 = r1.o()
                s0.a.e.b.g r3 = r3.r(r4)
                s0.a.e.b.g r3 = r3.r(r6)
                s0.a.e.b.g r4 = r4.r(r3)
                s0.a.e.b.g r1 = r1.j(r4)
                s0.a.e.b.g r1 = r1.r(r5)
                s0.a.e.b.h$e r4 = new s0.a.e.b.h$e
                r4.<init>(r2, r3, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.h.e.a(s0.a.e.b.h):s0.a.e.b.h");
        }

        public h b() {
            return new e((e) null, d(), e());
        }

        public g k(int i) {
            return (i == 1 && 4 == g()) ? D() : h.super.k(i);
        }

        public h p() {
            if (m()) {
                return this;
            }
            e eVar = this.b;
            return eVar.f != 0 ? new e(eVar, this.c, this.d.m(), this.e) : new e(eVar, this.c, this.d.m());
        }

        public h x() {
            if (m()) {
                return this;
            }
            g gVar = this.d;
            if (gVar.i()) {
                return this;
            }
            e eVar = this.b;
            int i = eVar.f;
            if (i != 0) {
                return i != 4 ? z().a(this) : F(false).a(this);
            }
            g gVar2 = this.c;
            g a = gVar.a(gVar);
            g o = a.o();
            g a2 = E(gVar2.o()).a(this.b.b);
            g r = E(gVar2).j(o).r(a2.o());
            if (r.i()) {
                return this.b.m();
            }
            g g = r.j(a).g();
            g j = r.j(g).j(a2);
            g r2 = o.o().j(g).r(j);
            g a3 = r2.r(j).j(j.a(r2)).a(gVar2);
            return new e(eVar, a3, gVar2.r(a3).j(r2).r(gVar));
        }

        public h y(int i) {
            g gVar;
            int i2 = i;
            if (i2 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (i2 == 0 || m()) {
                return this;
            } else {
                if (i2 == 1) {
                    return z();
                }
                e eVar = this.b;
                g gVar2 = this.d;
                if (gVar2.i()) {
                    return eVar.m();
                }
                int i3 = eVar.f;
                g gVar3 = eVar.b;
                g gVar4 = this.c;
                g[] gVarArr = this.e;
                g k = gVarArr.length < 1 ? eVar.k(c.b) : gVarArr[0];
                if (!k.h() && i3 != 0) {
                    if (i3 == 1) {
                        gVar = k.o();
                        gVar4 = gVar4.j(k);
                        gVar2 = gVar2.j(gVar);
                    } else if (i3 == 2) {
                        gVar = null;
                    } else if (i3 == 4) {
                        gVar3 = D();
                    } else {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    gVar3 = B(k, gVar);
                }
                int i4 = 0;
                while (i4 < i2) {
                    if (gVar2.i()) {
                        return eVar.m();
                    }
                    g E = E(gVar4.o());
                    g a = gVar2.a(gVar2);
                    g j = a.j(gVar2);
                    g j2 = gVar4.j(j);
                    g a2 = j2.a(j2);
                    g o = j.o();
                    g a3 = o.a(o);
                    if (!gVar3.i()) {
                        E = E.a(gVar3);
                        g j3 = a3.j(gVar3);
                        gVar3 = j3.a(j3);
                    }
                    g r = E.o().r(a2.a(a2));
                    gVar2 = E.j(a2.r(r)).r(a3);
                    k = k.h() ? a : a.j(k);
                    i4++;
                    gVar4 = r;
                }
                if (i3 == 0) {
                    g g = k.g();
                    g o2 = g.o();
                    return new e(eVar, gVar4.j(o2), gVar2.j(o2.j(g)));
                } else if (i3 == 1) {
                    return new e(eVar, gVar4.j(k), gVar2, new g[]{k.j(k.o())});
                } else if (i3 == 2) {
                    return new e(eVar, gVar4, gVar2, new g[]{k});
                } else if (i3 == 4) {
                    return new e(eVar, gVar4, gVar2, new g[]{k, gVar3});
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        public h z() {
            g gVar;
            g gVar2;
            g gVar3;
            if (m()) {
                return this;
            }
            e eVar = this.b;
            g gVar4 = this.d;
            if (gVar4.i()) {
                return eVar.m();
            }
            int i = eVar.f;
            g gVar5 = this.c;
            if (i == 0) {
                g d = E(gVar5.o()).a(this.b.b).d(gVar4.a(gVar4));
                g r = d.o().r(gVar5.a(gVar5));
                return new e(eVar, r, d.j(gVar5.r(r)).r(gVar4));
            } else if (i == 1) {
                g gVar6 = this.e[0];
                boolean h = gVar6.h();
                g gVar7 = eVar.b;
                if (!gVar7.i() && !h) {
                    gVar7 = gVar7.j(gVar6.o());
                }
                g a = gVar7.a(E(gVar5.o()));
                g j = h ? gVar4 : gVar4.j(gVar6);
                g o = h ? gVar4.o() : j.j(gVar4);
                g C = C(gVar5.j(o));
                g r2 = a.o().r(C.a(C));
                g a2 = j.a(j);
                g j2 = r2.j(a2);
                g a3 = o.a(o);
                g j3 = C.r(r2).j(a);
                g o2 = a3.o();
                g r3 = j3.r(o2.a(o2));
                if (h) {
                    gVar = a3.a(a3);
                } else {
                    gVar = a2.o();
                }
                return new e(eVar, j2, r3, new g[]{gVar.a(gVar).j(j)});
            } else if (i == 2) {
                g gVar8 = this.e[0];
                boolean h2 = gVar8.h();
                g o3 = gVar4.o();
                g o4 = o3.o();
                g gVar9 = eVar.b;
                g m = gVar9.m();
                if (m.t().equals(BigInteger.valueOf(3))) {
                    g o5 = h2 ? gVar8 : gVar8.o();
                    gVar2 = E(gVar5.a(o5).j(gVar5.r(o5)));
                    gVar3 = o3.j(gVar5);
                } else {
                    g E = E(gVar5.o());
                    if (!h2) {
                        if (!gVar9.i()) {
                            g o6 = gVar8.o().o();
                            if (m.c() < gVar9.c()) {
                                gVar2 = E.r(o6.j(m));
                            } else {
                                gVar9 = o6.j(gVar9);
                            }
                        } else {
                            gVar2 = E;
                        }
                        gVar3 = gVar5.j(o3);
                    }
                    gVar2 = E.a(gVar9);
                    gVar3 = gVar5.j(o3);
                }
                g C2 = C(gVar3);
                g r4 = gVar2.o().r(C2.a(C2));
                g r5 = C2.r(r4).j(gVar2).r(C(o4.a(o4)));
                g a4 = gVar4.a(gVar4);
                if (!h2) {
                    a4 = a4.j(gVar8);
                }
                return new e(eVar, r4, r5, new g[]{a4});
            } else if (i == 4) {
                return F(true);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(s0.a.e.b.e r7, s0.a.e.b.g r8, s0.a.e.b.g r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0007
        L_0x0005:
            int r1 = r7.f
        L_0x0007:
            if (r1 == 0) goto L_0x0041
            r2 = 5
            if (r1 == r2) goto L_0x0041
            java.math.BigInteger r2 = s0.a.e.b.c.b
            s0.a.e.b.g r2 = r7.k(r2)
            r3 = 1
            if (r1 == r3) goto L_0x003c
            r4 = 2
            if (r1 == r4) goto L_0x003c
            r5 = 3
            if (r1 == r5) goto L_0x0033
            r5 = 4
            if (r1 == r5) goto L_0x002a
            r4 = 6
            if (r1 != r4) goto L_0x0022
            goto L_0x003c
        L_0x0022:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L_0x002a:
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r4]
            r1[r0] = r2
            s0.a.e.b.g r0 = r7.b
            r1[r3] = r0
            goto L_0x0043
        L_0x0033:
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r5]
            r1[r0] = r2
            r1[r3] = r2
            r1[r4] = r2
            goto L_0x0043
        L_0x003c:
            s0.a.e.b.g[] r1 = new s0.a.e.b.g[r3]
            r1[r0] = r2
            goto L_0x0043
        L_0x0041:
            s0.a.e.b.g[] r1 = a
        L_0x0043:
            r6.<init>(r7, r8, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.h.<init>(s0.a.e.b.e, s0.a.e.b.g, s0.a.e.b.g):void");
    }

    public h(e eVar, g gVar, g gVar2, g[] gVarArr) {
        this.f = null;
        this.b = eVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = gVarArr;
    }

    public h A(h hVar) {
        return z().a(hVar);
    }

    public abstract h a(h hVar);

    public abstract h b();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(s0.a.e.b.h r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            s0.a.e.b.e r1 = r8.b
            s0.a.e.b.e r2 = r9.b
            r3 = 1
            if (r1 != 0) goto L_0x000d
            r4 = r3
            goto L_0x000e
        L_0x000d:
            r4 = r0
        L_0x000e:
            if (r2 != 0) goto L_0x0012
            r5 = r3
            goto L_0x0013
        L_0x0012:
            r5 = r0
        L_0x0013:
            boolean r6 = r8.m()
            boolean r7 = r9.m()
            if (r6 != 0) goto L_0x0067
            if (r7 == 0) goto L_0x0020
            goto L_0x0067
        L_0x0020:
            if (r4 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            s0.a.e.b.h r9 = r9.q()
        L_0x002b:
            r1 = r8
            goto L_0x004d
        L_0x002d:
            if (r5 == 0) goto L_0x0034
            s0.a.e.b.h r1 = r8.q()
            goto L_0x004d
        L_0x0034:
            boolean r2 = r1.j(r2)
            if (r2 != 0) goto L_0x003b
            return r0
        L_0x003b:
            r2 = 2
            s0.a.e.b.h[] r2 = new s0.a.e.b.h[r2]
            r2[r0] = r8
            s0.a.e.b.h r9 = r1.n(r9)
            r2[r3] = r9
            r1.p(r2)
            r1 = r2[r0]
            r9 = r2[r3]
        L_0x004d:
            s0.a.e.b.g r2 = r1.c
            s0.a.e.b.g r4 = r9.c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0066
            s0.a.e.b.g r1 = r1.j()
            s0.a.e.b.g r9 = r9.j()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0066
            r0 = r3
        L_0x0066:
            return r0
        L_0x0067:
            if (r6 == 0) goto L_0x0076
            if (r7 == 0) goto L_0x0076
            if (r4 != 0) goto L_0x0075
            if (r5 != 0) goto L_0x0075
            boolean r9 = r1.j(r2)
            if (r9 == 0) goto L_0x0076
        L_0x0075:
            r0 = r3
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.h.c(s0.a.e.b.h):boolean");
    }

    public g d() {
        if (n()) {
            return this.c;
        }
        throw new IllegalStateException("point not in normal form");
    }

    public g e() {
        if (n()) {
            return j();
        }
        throw new IllegalStateException("point not in normal form");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return c((h) obj);
    }

    public abstract boolean f();

    public int g() {
        e eVar = this.b;
        if (eVar == null) {
            return 0;
        }
        return eVar.f;
    }

    public final h h() {
        return q().b();
    }

    public int hashCode() {
        int i;
        e eVar = this.b;
        if (eVar == null) {
            i = 0;
        } else {
            i = ~eVar.hashCode();
        }
        if (m()) {
            return i;
        }
        h q = q();
        return (i ^ (q.c.hashCode() * 17)) ^ (q.j().hashCode() * 257);
    }

    public byte[] i(boolean z) {
        if (m()) {
            return new byte[1];
        }
        h q = q();
        byte[] e2 = q.c.e();
        if (z) {
            byte[] bArr = new byte[(e2.length + 1)];
            bArr[0] = (byte) (q.f() ? 3 : 2);
            System.arraycopy(e2, 0, bArr, 1, e2.length);
            return bArr;
        }
        byte[] e3 = q.j().e();
        byte[] bArr2 = new byte[(e2.length + e3.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(e2, 0, bArr2, 1, e2.length);
        System.arraycopy(e3, 0, bArr2, e2.length + 1, e3.length);
        return bArr2;
    }

    public g j() {
        return this.d;
    }

    public g k(int i) {
        if (i >= 0) {
            g[] gVarArr = this.e;
            if (i < gVarArr.length) {
                return gVarArr[i];
            }
        }
        return null;
    }

    public boolean l(boolean z, boolean z2) {
        if (m()) {
            return true;
        }
        return !((s) this.b.r(this, "bc_validity", new a(z, z2))).a;
    }

    public boolean m() {
        if (!(this.c == null || this.d == null)) {
            g[] gVarArr = this.e;
            if (gVarArr.length <= 0 || !gVarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        int g = g();
        return g == 0 || g == 5 || m() || this.e[0].h();
    }

    public h o(BigInteger bigInteger) {
        e eVar = this.b;
        if (eVar.h == null) {
            eVar.h = eVar.d();
        }
        return eVar.h.a(this, bigInteger);
    }

    public abstract h p();

    public h q() {
        int g;
        if (m() || (g = g()) == 0 || g == 5) {
            return this;
        }
        g k = k(0);
        if (k.h()) {
            return this;
        }
        if (this.b != null) {
            g s = this.b.s(j.a());
            return r(k.j(s).g().j(s));
        }
        throw new IllegalStateException("Detached points must be in affine coordinates");
    }

    public h r(g gVar) {
        int g = g();
        if (g != 1) {
            if (g == 2 || g == 3 || g == 4) {
                g o = gVar.o();
                return this.b.f(this.c.j(o), this.d.j(o.j(gVar)));
            } else if (g != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return this.b.f(this.c.j(gVar), this.d.j(gVar));
    }

    public abstract boolean s();

    public boolean t() {
        BigInteger bigInteger;
        if (!c.b.equals(this.b.e) && (bigInteger = this.b.d) != null && !m0.r.t.a.r.m.a1.a.f3(this, bigInteger).m()) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (m()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.c);
        stringBuffer.append(',');
        stringBuffer.append(this.d);
        for (g append : this.e) {
            stringBuffer.append(',');
            stringBuffer.append(append);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public h u(g gVar) {
        if (m()) {
            return this;
        }
        return this.b.g(this.c.j(gVar), this.d, this.e);
    }

    public h v(g gVar) {
        if (m()) {
            return this;
        }
        return this.b.g(this.c, this.d.j(gVar), this.e);
    }

    public abstract h w(h hVar);

    public h x() {
        return A(this);
    }

    public h y(int i) {
        if (i >= 0) {
            h hVar = this;
            while (true) {
                i--;
                if (i < 0) {
                    return hVar;
                }
                hVar = hVar.z();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public abstract h z();
}
