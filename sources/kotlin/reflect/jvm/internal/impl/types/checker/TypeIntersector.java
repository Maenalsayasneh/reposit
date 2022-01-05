package kotlin.reflect.jvm.internal.impl.types.checker;

import com.google.android.gms.recaptcha.RecaptchaActionType;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$Companion$Mode;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.c;
import m0.r.t.a.r.m.d0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.x0.b;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.x0.g;
import m0.r.t.a.r.m.x0.h;

/* compiled from: IntersectionType.kt */
public final class TypeIntersector {
    public static final TypeIntersector a = new TypeIntersector();

    /* compiled from: IntersectionType.kt */
    public enum ResultNullability {
        ;

        /* compiled from: IntersectionType.kt */
        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL(String str, int i) {
                super(str, i, (f) null);
            }

            public ResultNullability combine(v0 v0Var) {
                i.e(v0Var, "nextType");
                return getResultNullability(v0Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL(String str, int i) {
                super(str, i, (f) null);
            }

            public ResultNullability combine(v0 v0Var) {
                i.e(v0Var, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class START extends ResultNullability {
            public START(String str, int i) {
                super(str, i, (f) null);
            }

            public ResultNullability combine(v0 v0Var) {
                i.e(v0Var, "nextType");
                return getResultNullability(v0Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN(String str, int i) {
                super(str, i, (f) null);
            }

            public ResultNullability combine(v0 v0Var) {
                i.e(v0Var, "nextType");
                ResultNullability resultNullability = getResultNullability(v0Var);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        public abstract ResultNullability combine(v0 v0Var);

        public final ResultNullability getResultNullability(v0 v0Var) {
            i.e(v0Var, "<this>");
            if (v0Var.J0()) {
                return ACCEPT_NULL;
            }
            i.e(v0Var, "type");
            if (c.a(new b(false, true, false, (e) null, 12), h.P2(v0Var), AbstractTypeCheckerContext.a.b.a)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[EDGE_INSN: B:24:0x0052->B:16:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<m0.r.t.a.r.m.a0> a(java.util.Collection<? extends m0.r.t.a.r.m.a0> r8, m0.n.a.p<? super m0.r.t.a.r.m.a0, ? super m0.r.t.a.r.m.a0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            m0.n.b.i.d(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r8.next()
            m0.r.t.a.r.m.a0 r1 = (m0.r.t.a.r.m.a0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            goto L_0x0051
        L_0x0023:
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r2.next()
            m0.r.t.a.r.m.a0 r5 = (m0.r.t.a.r.m.a0) r5
            if (r5 == r1) goto L_0x004d
            java.lang.String r6 = "lower"
            m0.n.b.i.d(r5, r6)
            java.lang.String r6 = "upper"
            m0.n.b.i.d(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004d
            r5 = r3
            goto L_0x004e
        L_0x004d:
            r5 = r4
        L_0x004e:
            if (r5 == 0) goto L_0x0027
            goto L_0x0052
        L_0x0051:
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a(java.util.Collection, m0.n.a.p):java.util.Collection");
    }

    public final a0 b(List<? extends a0> list) {
        a0 a0Var;
        Object obj;
        Set<T> set;
        i.e(list, "types");
        list.size();
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var2 : list) {
            if (a0Var2.I0() instanceof IntersectionTypeConstructor) {
                Collection<v> b = a0Var2.I0().b();
                i.d(b, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(h.K(b, 10));
                for (v vVar : b) {
                    i.d(vVar, "it");
                    a0 B4 = h.B4(vVar);
                    if (a0Var2.J0()) {
                        B4 = B4.M0(true);
                    }
                    arrayList2.add(B4);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(a0Var2);
            }
        }
        ResultNullability resultNullability = ResultNullability.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            resultNullability = resultNullability.combine((v0) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a0 a0Var3 = (a0) it2.next();
            if (resultNullability == ResultNullability.NOT_NULL) {
                if (a0Var3 instanceof g) {
                    g gVar = (g) a0Var3;
                    i.e(gVar, "<this>");
                    a0Var3 = new g(gVar.d, gVar.q, gVar.x, gVar.y, gVar.Y1, true);
                }
                a0Var3 = d0.d(a0Var3, false);
            }
            linkedHashSet.add(a0Var3);
        }
        if (linkedHashSet.size() == 1) {
            return (a0) m0.j.g.i0(linkedHashSet);
        }
        new TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1(linkedHashSet);
        Collection<a0> a2 = a(linkedHashSet, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
        ArrayList arrayList3 = (ArrayList) a2;
        arrayList3.isEmpty();
        i.e(a2, "types");
        IntegerLiteralTypeConstructor$Companion$Mode integerLiteralTypeConstructor$Companion$Mode = IntegerLiteralTypeConstructor$Companion$Mode.INTERSECTION_TYPE;
        if (arrayList3.isEmpty()) {
            a0Var = null;
        } else {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                Object obj2 = it3.next();
                while (it3.hasNext()) {
                    a0 a0Var4 = (a0) it3.next();
                    a0 a0Var5 = (a0) obj2;
                    if (!(a0Var5 == null || a0Var4 == null)) {
                        j0 I0 = a0Var5.I0();
                        j0 I02 = a0Var4.I0();
                        boolean z = I0 instanceof IntegerLiteralTypeConstructor;
                        if (z && (I02 instanceof IntegerLiteralTypeConstructor)) {
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) I0;
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = (IntegerLiteralTypeConstructor) I02;
                            int ordinal = integerLiteralTypeConstructor$Companion$Mode.ordinal();
                            if (ordinal == 0) {
                                Set<v> set2 = integerLiteralTypeConstructor.c;
                                Set<v> set3 = integerLiteralTypeConstructor2.c;
                                i.e(set2, "$this$intersect");
                                i.e(set3, RecaptchaActionType.OTHER);
                                set = m0.j.g.C0(set2);
                                i.e(set, "$this$retainAll");
                                i.e(set3, "elements");
                                r.a(set).retainAll(h.V(set3, set));
                            } else if (ordinal == 1) {
                                Set<v> set4 = integerLiteralTypeConstructor.c;
                                Set<v> set5 = integerLiteralTypeConstructor2.c;
                                i.e(set4, "$this$union");
                                i.e(set5, RecaptchaActionType.OTHER);
                                set = m0.j.g.C0(set4);
                                m0.j.g.b(set, set5);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor3 = new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.a, integerLiteralTypeConstructor.b, set);
                            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
                            Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
                            obj = KotlinTypeFactory.d(f.a.b, integerLiteralTypeConstructor3, false);
                            obj2 = obj;
                        } else if (z) {
                            if (((IntegerLiteralTypeConstructor) I0).c.contains(a0Var4)) {
                                obj = a0Var4;
                                obj2 = obj;
                            }
                        } else if ((I02 instanceof IntegerLiteralTypeConstructor) && ((IntegerLiteralTypeConstructor) I02).c.contains(a0Var5)) {
                            obj = a0Var5;
                            obj2 = obj;
                        }
                    }
                    obj = null;
                    obj2 = obj;
                }
                a0Var = (a0) obj2;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        if (a0Var != null) {
            return a0Var;
        }
        Objects.requireNonNull(m0.r.t.a.r.m.x0.h.b);
        Collection<a0> a3 = a(a2, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(h.a.b));
        ArrayList arrayList4 = (ArrayList) a3;
        arrayList4.isEmpty();
        if (arrayList4.size() < 2) {
            return (a0) m0.j.g.i0(a3);
        }
        return new IntersectionTypeConstructor(linkedHashSet).f();
    }
}
