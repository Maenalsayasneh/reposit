package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.o.j;

/* compiled from: TypeUtils */
public class s0 {
    public static final a0 a = p.h("DONT_CARE", p.f("DONT_CARE", p.b));
    public static final a0 b = p.d("Cannot be inferred");
    public static final a0 c = new a("NO_EXPECTED_TYPE");
    public static final a0 d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils */
    public static class a extends k {
        public final String d;

        public a(String str) {
            this.d = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void U0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = r3
                goto L_0x0014
            L_0x0013:
                r5 = r4
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAnnotations"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAnnotations"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.s0.a.U0(int):void");
        }

        public /* bridge */ /* synthetic */ v K0(e eVar) {
            V0(eVar);
            return this;
        }

        public /* bridge */ /* synthetic */ v0 M0(boolean z) {
            P0(z);
            throw null;
        }

        public /* bridge */ /* synthetic */ v0 N0(e eVar) {
            V0(eVar);
            return this;
        }

        public /* bridge */ /* synthetic */ v0 O0(f fVar) {
            Q0(fVar);
            throw null;
        }

        public a0 P0(boolean z) {
            throw new IllegalStateException(this.d);
        }

        public a0 Q0(f fVar) {
            if (fVar == null) {
                U0(0);
                throw null;
            }
            throw new IllegalStateException(this.d);
        }

        public a0 R0() {
            throw new IllegalStateException(this.d);
        }

        public /* bridge */ /* synthetic */ a0 S0(e eVar) {
            V0(eVar);
            return this;
        }

        public k T0(a0 a0Var) {
            if (a0Var == null) {
                U0(2);
                throw null;
            }
            throw new IllegalStateException(this.d);
        }

        public a V0(e eVar) {
            if (eVar != null) {
                return this;
            }
            U0(3);
            throw null;
        }

        public String toString() {
            String str = this.d;
            if (str != null) {
                return str;
            }
            U0(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS;
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
                objArr[0] = "parameterDescriptor";
                break;
            case 46:
            case 50:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 48:
            case 49:
                objArr[0] = "supertypes";
                break;
            case 51:
            case 54:
                objArr[0] = "expectedType";
                break;
            case 53:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 11 || i3 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i3 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 47) {
                    if (i3 != 52) {
                        if (!(i3 == 6 || i3 == 7)) {
                            switch (i3) {
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
                objArr[2] = "makeStarProjection";
                break;
            case 46:
            case 48:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 49:
                objArr[2] = "findByFqName";
                break;
            case 50:
            case 51:
            case 53:
            case 54:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 59:
                objArr[2] = "isTypeParameter";
                break;
            case 60:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 61:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static boolean b(v vVar) {
        if (vVar == null) {
            a(28);
            throw null;
        } else if (vVar.J0()) {
            return true;
        } else {
            if (!h.k2(vVar) || !b(h.t(vVar).q)) {
                return false;
            }
            return true;
        }
    }

    public static boolean c(v vVar, l<v0, Boolean> lVar) {
        if (lVar != null) {
            return d(vVar, lVar, (j<v>) null);
        }
        a(43);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m0.r.t.a.r.m.v0, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(m0.r.t.a.r.m.v r5, m0.n.a.l<m0.r.t.a.r.m.v0, java.lang.Boolean> r6, m0.r.t.a.r.o.j<m0.r.t.a.r.m.v> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x00af
            r1 = 0
            if (r5 != 0) goto L_0x0007
            return r1
        L_0x0007:
            m0.r.t.a.r.m.v0 r2 = r5.L0()
            boolean r3 = p(r5)
            if (r3 == 0) goto L_0x001c
            java.lang.Object r5 = r6.invoke(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            if (r7 == 0) goto L_0x0025
            boolean r3 = r7.contains(r5)
            if (r3 == 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            if (r3 == 0) goto L_0x0033
            return r4
        L_0x0033:
            if (r7 != 0) goto L_0x0039
            m0.r.t.a.r.o.j r7 = m0.r.t.a.r.o.j.b()
        L_0x0039:
            r7.add(r5)
            boolean r3 = r2 instanceof m0.r.t.a.r.m.q
            if (r3 == 0) goto L_0x0043
            r0 = r2
            m0.r.t.a.r.m.q r0 = (m0.r.t.a.r.m.q) r0
        L_0x0043:
            if (r0 == 0) goto L_0x0056
            m0.r.t.a.r.m.a0 r3 = r0.d
            boolean r3 = d(r3, r6, r7)
            if (r3 != 0) goto L_0x0055
            m0.r.t.a.r.m.a0 r0 = r0.q
            boolean r0 = d(r0, r6, r7)
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            return r4
        L_0x0056:
            boolean r0 = r2 instanceof m0.r.t.a.r.m.i
            if (r0 == 0) goto L_0x0065
            m0.r.t.a.r.m.i r2 = (m0.r.t.a.r.m.i) r2
            m0.r.t.a.r.m.a0 r0 = r2.d
            boolean r0 = d(r0, r6, r7)
            if (r0 == 0) goto L_0x0065
            return r4
        L_0x0065:
            m0.r.t.a.r.m.j0 r0 = r5.I0()
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r2 == 0) goto L_0x0089
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r0
            java.util.LinkedHashSet<m0.r.t.a.r.m.v> r5 = r0.b
            java.util.Iterator r5 = r5.iterator()
        L_0x0075:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r5.next()
            m0.r.t.a.r.m.v r0 = (m0.r.t.a.r.m.v) r0
            boolean r0 = d(r0, r6, r7)
            if (r0 == 0) goto L_0x0075
            return r4
        L_0x0088:
            return r1
        L_0x0089:
            java.util.List r5 = r5.H0()
            java.util.Iterator r5 = r5.iterator()
        L_0x0091:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r5.next()
            m0.r.t.a.r.m.m0 r0 = (m0.r.t.a.r.m.m0) r0
            boolean r2 = r0.c()
            if (r2 != 0) goto L_0x0091
            m0.r.t.a.r.m.v r0 = r0.getType()
            boolean r0 = d(r0, r6, r7)
            if (r0 == 0) goto L_0x0091
            return r4
        L_0x00ae:
            return r1
        L_0x00af:
            r5 = 44
            a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.s0.d(m0.r.t.a.r.m.v, m0.n.a.l, m0.r.t.a.r.o.j):boolean");
    }

    public static d e(v vVar) {
        m0.r.t.a.r.c.f c2 = vVar.I0().c();
        if (c2 instanceof d) {
            return (d) c2;
        }
        return null;
    }

    public static List<m0> f(List<m0> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (m0 q : list) {
                arrayList.add(new o0(q.q()));
            }
            List<m0> v02 = g.v0(arrayList);
            if (v02 != null) {
                return v02;
            }
            a(17);
            throw null;
        }
        a(16);
        throw null;
    }

    public static boolean g(v vVar) {
        if (vVar == null) {
            a(27);
            throw null;
        } else if (vVar.J0()) {
            return true;
        } else {
            if (h.k2(vVar) && g(h.t(vVar).q)) {
                return true;
            }
            i.e(vVar, "<this>");
            if (vVar.L0() instanceof i) {
                return false;
            }
            if (h(vVar)) {
                if (!(vVar.I0().c() instanceof d)) {
                    TypeSubstitutor d2 = TypeSubstitutor.d(vVar);
                    Collection<v> b2 = vVar.I0().b();
                    ArrayList arrayList = new ArrayList(b2.size());
                    for (v next : b2) {
                        if (next != null) {
                            v k = d2.k(next, Variance.INVARIANT);
                            v k2 = k != null ? k(k, vVar.J0()) : null;
                            if (k2 != null) {
                                arrayList.add(k2);
                            }
                        } else {
                            a(21);
                            throw null;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (g((v) it.next())) {
                            return true;
                        }
                    }
                }
                return false;
            }
            j0 I0 = vVar.I0();
            if (I0 instanceof IntersectionTypeConstructor) {
                for (v g : I0.b()) {
                    if (g(g)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean h(v vVar) {
        if ((vVar.I0().c() instanceof m0 ? (m0) vVar.I0().c() : null) != null) {
            return true;
        }
        vVar.I0();
        return false;
    }

    public static v i(v vVar) {
        if (vVar != null) {
            return j(vVar, false);
        }
        a(2);
        throw null;
    }

    public static v j(v vVar, boolean z) {
        if (vVar != null) {
            v0 M0 = vVar.L0().M0(z);
            if (M0 != null) {
                return M0;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static v k(v vVar, boolean z) {
        if (vVar != null) {
            return z ? j(vVar, true) : vVar;
        }
        a(8);
        throw null;
    }

    public static a0 l(a0 a0Var, boolean z) {
        if (a0Var == null) {
            a(5);
            throw null;
        } else if (z) {
            a0 P0 = a0Var.M0(true);
            if (P0 != null) {
                return P0;
            }
            a(6);
            throw null;
        } else if (a0Var != null) {
            return a0Var;
        } else {
            a(7);
            throw null;
        }
    }

    public static m0 m(m0 m0Var) {
        if (m0Var != null) {
            return new StarProjectionImpl(m0Var);
        }
        a(45);
        throw null;
    }

    public static a0 n(m0.r.t.a.r.c.f fVar, MemberScope memberScope, l<e, a0> lVar) {
        if (!p.j(fVar)) {
            return o(fVar.i(), memberScope, lVar);
        }
        return p.d("Unsubstituted type for " + fVar);
    }

    public static a0 o(j0 j0Var, MemberScope memberScope, l<e, a0> lVar) {
        if (j0Var == null) {
            a(12);
            throw null;
        } else if (memberScope == null) {
            a(13);
            throw null;
        } else if (lVar != null) {
            List<m0> f = f(j0Var.getParameters());
            Objects.requireNonNull(f.i);
            return KotlinTypeFactory.i(f.a.b, j0Var, f, false, memberScope, lVar);
        } else {
            a(14);
            throw null;
        }
    }

    public static boolean p(v vVar) {
        if (vVar != null) {
            return vVar == c || vVar == d;
        }
        a(0);
        throw null;
    }
}
