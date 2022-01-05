package m0.r.t.a.r.e.a;

import java.util.HashMap;
import java.util.Map;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.n;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.q0;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.j.u.i.d;

/* compiled from: JavaDescriptorVisibilities */
public class m {
    public static final p a;
    public static final p b;
    public static final p c;
    public static final Map<q0, p> d = new HashMap();

    /* compiled from: JavaDescriptorVisibilities */
    public static class a extends n {
        public a(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(d dVar, m0.r.t.a.r.c.m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                return m.c(mVar, iVar);
            } else {
                e(1);
                throw null;
            }
        }
    }

    /* compiled from: JavaDescriptorVisibilities */
    public static class b extends n {
        public b(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(d dVar, m0.r.t.a.r.c.m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                return m.b(dVar, mVar, iVar);
            } else {
                e(1);
                throw null;
            }
        }
    }

    /* compiled from: JavaDescriptorVisibilities */
    public static class c extends n {
        public c(q0 q0Var) {
            super(q0Var);
        }

        public static /* synthetic */ void e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(d dVar, m0.r.t.a.r.c.m mVar, i iVar) {
            if (mVar == null) {
                e(0);
                throw null;
            } else if (iVar != null) {
                return m.b(dVar, mVar, iVar);
            } else {
                e(1);
                throw null;
            }
        }
    }

    static {
        a aVar = new a(m0.r.t.a.r.c.u0.a.a);
        a = aVar;
        b bVar = new b(m0.r.t.a.r.c.u0.c.a);
        b = bVar;
        c cVar = new c(m0.r.t.a.r.c.u0.b.a);
        c = cVar;
        d(aVar);
        d(bVar);
        d(cVar);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static boolean b(d dVar, m0.r.t.a.r.c.m mVar, i iVar) {
        if (mVar == null) {
            a(0);
            throw null;
        } else if (iVar == null) {
            a(1);
            throw null;
        } else if (c(m0.r.t.a.r.j.d.A(mVar), iVar)) {
            return true;
        } else {
            return o.c.c(dVar, mVar, iVar);
        }
    }

    public static boolean c(i iVar, i iVar2) {
        Class<v> cls = v.class;
        if (iVar == null) {
            a(2);
            throw null;
        } else if (iVar2 != null) {
            v vVar = (v) m0.r.t.a.r.j.d.k(iVar, cls, false);
            v vVar2 = (v) m0.r.t.a.r.j.d.k(iVar2, cls, false);
            if (vVar2 == null || vVar == null || !vVar.d().equals(vVar2.d())) {
                return false;
            }
            return true;
        } else {
            a(3);
            throw null;
        }
    }

    public static void d(p pVar) {
        d.put(((n) pVar).a, pVar);
    }
}
