package m0.r.t.a.r.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import m0.r.t.a.r.c.t0.f0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.n.g;

/* compiled from: DescriptorVisibilities */
public class o {
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final Map<p, Integer> j;
    public static final p k;
    public static final m0.r.t.a.r.j.u.i.d l = new a();
    public static final m0.r.t.a.r.j.u.i.d m = new b();
    @Deprecated
    public static final m0.r.t.a.r.j.u.i.d n = new c();
    public static final m0.r.t.a.r.n.g o;
    public static final Map<q0, p> p = new HashMap();

    /* compiled from: DescriptorVisibilities */
    public static class a implements m0.r.t.a.r.j.u.i.d {
        public v getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class b implements m0.r.t.a.r.j.u.i.d {
        public v getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class c implements m0.r.t.a.r.j.u.i.d {
        public v getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class d extends n {
        public d(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            i iVar2;
            if (mVar == null) {
                e(1);
                throw null;
            } else if (iVar != null) {
                if (m0.r.t.a.r.j.d.y(mVar)) {
                    if (iVar != null) {
                        if (m0.r.t.a.r.j.d.f(iVar) != i0.a) {
                            return o.d(mVar, iVar);
                        }
                    } else {
                        e(0);
                        throw null;
                    }
                }
                if (mVar instanceof h) {
                    g b = ((h) mVar).b();
                    if (m0.r.t.a.r.j.d.v(b) && m0.r.t.a.r.j.d.y(b) && (iVar instanceof h) && m0.r.t.a.r.j.d.y(iVar.b()) && o.d(mVar, iVar)) {
                        return true;
                    }
                }
                i iVar3 = mVar;
                while (iVar3 != null) {
                    i b2 = iVar3.b();
                    if ((b2 instanceof d) && !m0.r.t.a.r.j.d.p(b2)) {
                        iVar2 = b2;
                        break;
                    }
                    boolean z = b2 instanceof v;
                    iVar3 = b2;
                    if (z) {
                        iVar2 = b2;
                        break;
                    }
                }
                iVar2 = iVar3;
                if (iVar2 == null) {
                    return false;
                }
                while (iVar != null) {
                    if (iVar2 == iVar) {
                        return true;
                    }
                    if (!(iVar instanceof v)) {
                        iVar = iVar.b();
                    } else if (!(iVar2 instanceof v) || !((v) iVar2).d().equals(((v) iVar).d()) || !m0.r.t.a.r.j.d.d(iVar).equals(m0.r.t.a.r.j.d.d(iVar2))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            } else {
                e(2);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class e extends n {
        public e(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            i j;
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                if (o.a.c(dVar, mVar, iVar)) {
                    if (dVar == o.m) {
                        return true;
                    }
                    if (!(dVar == o.l || (j = m0.r.t.a.r.j.d.j(mVar, d.class)) == null || !(dVar instanceof m0.r.t.a.r.j.u.i.f))) {
                        return ((m0.r.t.a.r.j.u.i.f) dVar).p().a().equals(j.a());
                    }
                }
                return false;
            } else {
                e(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class f extends n {
        public f(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
            if (i0.j.f.p.h.f2(r0) == false) goto L_0x007c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(m0.r.t.a.r.j.u.i.d r7, m0.r.t.a.r.c.m r8, m0.r.t.a.r.c.i r9) {
            /*
                r6 = this;
                java.lang.Class<m0.r.t.a.r.c.d> r0 = m0.r.t.a.r.c.d.class
                r1 = 0
                r2 = 0
                if (r8 == 0) goto L_0x0091
                r3 = 1
                if (r9 == 0) goto L_0x008d
                m0.r.t.a.r.c.i r4 = m0.r.t.a.r.j.d.j(r8, r0)
                m0.r.t.a.r.c.d r4 = (m0.r.t.a.r.c.d) r4
                m0.r.t.a.r.c.i r9 = m0.r.t.a.r.j.d.k(r9, r0, r2)
                m0.r.t.a.r.c.d r9 = (m0.r.t.a.r.c.d) r9
                if (r9 != 0) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 == 0) goto L_0x002f
                boolean r5 = m0.r.t.a.r.j.d.p(r4)
                if (r5 == 0) goto L_0x002f
                m0.r.t.a.r.c.i r4 = m0.r.t.a.r.j.d.j(r4, r0)
                m0.r.t.a.r.c.d r4 = (m0.r.t.a.r.c.d) r4
                if (r4 == 0) goto L_0x002f
                boolean r4 = m0.r.t.a.r.j.d.w(r9, r4)
                if (r4 == 0) goto L_0x002f
                return r3
            L_0x002f:
                m0.r.t.a.r.c.m r4 = m0.r.t.a.r.j.d.A(r8)
                m0.r.t.a.r.c.i r0 = m0.r.t.a.r.j.d.j(r4, r0)
                m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
                if (r0 != 0) goto L_0x003c
                return r2
            L_0x003c:
                boolean r0 = m0.r.t.a.r.j.d.w(r9, r0)
                if (r0 == 0) goto L_0x0084
                if (r4 == 0) goto L_0x007f
                m0.r.t.a.r.j.u.i.d r0 = m0.r.t.a.r.c.o.n
                if (r7 != r0) goto L_0x0049
                goto L_0x007c
            L_0x0049:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r0 != 0) goto L_0x004e
                goto L_0x007b
            L_0x004e:
                boolean r0 = r4 instanceof m0.r.t.a.r.c.h
                if (r0 == 0) goto L_0x0053
                goto L_0x007b
            L_0x0053:
                m0.r.t.a.r.j.u.i.d r0 = m0.r.t.a.r.c.o.m
                if (r7 != r0) goto L_0x0058
                goto L_0x007b
            L_0x0058:
                m0.r.t.a.r.j.u.i.d r0 = m0.r.t.a.r.c.o.l
                if (r7 == r0) goto L_0x007c
                if (r7 != 0) goto L_0x005f
                goto L_0x007c
            L_0x005f:
                boolean r0 = r7 instanceof m0.r.t.a.r.j.u.i.e
                if (r0 == 0) goto L_0x006b
                r0 = r7
                m0.r.t.a.r.j.u.i.e r0 = (m0.r.t.a.r.j.u.i.e) r0
                m0.r.t.a.r.m.v r0 = r0.a()
                goto L_0x006f
            L_0x006b:
                m0.r.t.a.r.m.v r0 = r7.getType()
            L_0x006f:
                boolean r1 = m0.r.t.a.r.j.d.x(r0, r9)
                if (r1 != 0) goto L_0x007b
                boolean r0 = i0.j.f.p.h.f2(r0)
                if (r0 == 0) goto L_0x007c
            L_0x007b:
                r2 = r3
            L_0x007c:
                if (r2 == 0) goto L_0x0084
                return r3
            L_0x007f:
                r7 = 2
                e(r7)
                throw r1
            L_0x0084:
                m0.r.t.a.r.c.i r9 = r9.b()
                boolean r7 = r6.c(r7, r8, r9)
                return r7
            L_0x008d:
                e(r3)
                throw r1
            L_0x0091:
                e(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.o.f.c(m0.r.t.a.r.j.u.i.d, m0.r.t.a.r.c.m, m0.r.t.a.r.c.i):boolean");
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class g extends n {
        public g(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                if (!m0.r.t.a.r.j.d.d(iVar).d0(m0.r.t.a.r.j.d.d(mVar))) {
                    return false;
                }
                return o.o.a(mVar, iVar);
            } else {
                e(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class h extends n {
        public h(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                return true;
            } else {
                e(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class i extends n {
        public i(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar == null) {
                e(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class j extends n {
        public j(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar == null) {
                e(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class k extends n {
        public k(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                return false;
            } else {
                e(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities */
    public static class l extends n {
        public l(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                return false;
            } else {
                e(1);
                throw null;
            }
        }
    }

    static {
        Class<m0.r.t.a.r.n.g> cls = m0.r.t.a.r.n.g.class;
        d dVar = new d(Visibilities.d.a);
        a = dVar;
        e eVar = new e(Visibilities.e.a);
        b = eVar;
        f fVar = new f(Visibilities.f.a);
        c = fVar;
        g gVar = new g(Visibilities.Internal.INSTANCE);
        d = gVar;
        h hVar = new h(Visibilities.g.a);
        e = hVar;
        i iVar = new i(Visibilities.c.a);
        f = iVar;
        j jVar = new j(Visibilities.a.a);
        g = jVar;
        k kVar = new k(Visibilities.b.a);
        h = kVar;
        l lVar = new l(Visibilities.h.a);
        i = lVar;
        Collections.unmodifiableSet(m0.j.g.h0(dVar, eVar, gVar, iVar));
        HashMap Q2 = m0.r.t.a.r.m.a1.a.Q2(4);
        Q2.put(eVar, 0);
        Q2.put(dVar, 0);
        Q2.put(gVar, 1);
        Q2.put(fVar, 1);
        Q2.put(hVar, 2);
        j = Collections.unmodifiableMap(Q2);
        k = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        o = it.hasNext() ? (m0.r.t.a.r.n.g) it.next() : g.a.a;
        g(dVar);
        g(eVar);
        g(fVar);
        g(gVar);
        g(hVar);
        g(iVar);
        g(jVar);
        g(kVar);
        g(lVar);
    }

    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 != 16 ? 3 : 2)];
        if (!(i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7)) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i2 != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static Integer b(p pVar, p pVar2) {
        if (pVar == null) {
            a(12);
            throw null;
        } else if (pVar2 != null) {
            m0.n.b.i.e(pVar2, "visibility");
            Integer compareTo = pVar.a().compareTo(pVar2.a());
            if (compareTo != null) {
                return compareTo;
            }
            m0.n.b.i.e(pVar, "visibility");
            Integer compareTo2 = pVar2.a().compareTo(pVar.a());
            if (compareTo2 != null) {
                return Integer.valueOf(-compareTo2.intValue());
            }
            return null;
        } else {
            a(13);
            throw null;
        }
    }

    public static m c(m0.r.t.a.r.j.u.i.d dVar, m mVar, i iVar) {
        m c2;
        if (mVar == null) {
            a(8);
            throw null;
        } else if (iVar != null) {
            m mVar2 = (m) mVar.a();
            while (mVar2 != null && mVar2.getVisibility() != f) {
                if (!mVar2.getVisibility().c(dVar, mVar2, iVar)) {
                    return mVar2;
                }
                mVar2 = (m) m0.r.t.a.r.j.d.j(mVar2, m.class);
            }
            if (!(mVar instanceof f0) || (c2 = c(dVar, ((f0) mVar).o0(), iVar)) == null) {
                return null;
            }
            return c2;
        } else {
            a(9);
            throw null;
        }
    }

    public static boolean d(i iVar, i iVar2) {
        if (iVar != null) {
            i0 f2 = m0.r.t.a.r.j.d.f(iVar2);
            if (f2 != i0.a) {
                return f2.equals(m0.r.t.a.r.j.d.f(iVar));
            }
            return false;
        }
        a(6);
        throw null;
    }

    public static boolean e(p pVar) {
        if (pVar != null) {
            return pVar == a || pVar == b;
        }
        a(14);
        throw null;
    }

    public static boolean f(m mVar, i iVar) {
        if (iVar != null) {
            return c(m, mVar, iVar) == null;
        }
        a(3);
        throw null;
    }

    public static void g(p pVar) {
        p.put(((n) pVar).a, pVar);
    }

    public static p h(q0 q0Var) {
        if (q0Var != null) {
            p pVar = p.get(q0Var);
            if (pVar != null) {
                return pVar;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + q0Var);
        }
        a(15);
        throw null;
    }
}
