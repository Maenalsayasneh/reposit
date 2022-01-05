package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.n.a.l;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.j;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t;
import m0.r.t.a.r.c.t0.z;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.y;

/* compiled from: ErrorUtils */
public class p {
    public static final u a = new a();
    public static final c b;
    public static final a0 c = d("<LOOP IN SUPERTYPES>");
    public static final v d;
    public static final c0 e;
    public static final Set<c0> f;

    /* compiled from: ErrorUtils */
    public static class a implements u {
        public static /* synthetic */ void D(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 11:
                    objArr[0] = "visitor";
                    break;
                case 12:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 13) {
                objArr[1] = "getOriginal";
            } else if (i != 14) {
                switch (i) {
                    case 8:
                        objArr[1] = "getAllDependencyModules";
                        break;
                    case 9:
                        objArr[1] = "getExpectedByModules";
                        break;
                    case 10:
                        objArr[1] = "getAllExpectedByModules";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                        break;
                }
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 11:
                    objArr[2] = "accept";
                    break;
                case 12:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public <T> T D0(t<T> tVar) {
            if (tVar != null) {
                return null;
            }
            D(0);
            throw null;
        }

        public <R, D> R J(k<R, D> kVar, D d) {
            if (kVar != null) {
                return null;
            }
            D(11);
            throw null;
        }

        public y M(m0.r.t.a.r.g.b bVar) {
            if (bVar == null) {
                D(7);
                throw null;
            }
            throw new IllegalStateException("Should not be called!");
        }

        public i a() {
            return this;
        }

        public i b() {
            return null;
        }

        public boolean d0(u uVar) {
            if (uVar != null) {
                return false;
            }
            D(12);
            throw null;
        }

        public m0.r.t.a.r.c.r0.f getAnnotations() {
            Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
            m0.r.t.a.r.c.r0.f fVar = f.a.b;
            if (fVar != null) {
                return fVar;
            }
            D(1);
            throw null;
        }

        public m0.r.t.a.r.g.d getName() {
            return m0.r.t.a.r.g.d.j("<ERROR MODULE>");
        }

        public m0.r.t.a.r.b.f m() {
            m0.r.t.a.r.b.c cVar = m0.r.t.a.r.b.c.f;
            if (cVar != null) {
                return cVar;
            }
            D(14);
            throw null;
        }

        public Collection<m0.r.t.a.r.g.b> n(m0.r.t.a.r.g.b bVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
            if (bVar != null) {
                EmptyList emptyList = EmptyList.c;
                if (emptyList != null) {
                    return emptyList;
                }
                D(4);
                throw null;
            }
            D(2);
            throw null;
        }

        public List<u> r0() {
            EmptyList emptyList = EmptyList.c;
            if (emptyList != null) {
                return emptyList;
            }
            D(9);
            throw null;
        }
    }

    /* compiled from: ErrorUtils */
    public static class b implements j0 {
        public final /* synthetic */ c a;
        public final /* synthetic */ String b;

        public b(c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        public static /* synthetic */ void f(int i) {
            String str = i != 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 3 ? 2 : 3)];
            if (i != 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else {
                objArr[0] = "kotlinTypeRefiner";
            }
            if (i == 1) {
                objArr[1] = "getSupertypes";
            } else if (i == 2) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else if (i != 4) {
                objArr[1] = "getParameters";
            } else {
                objArr[1] = "refine";
            }
            if (i == 3) {
                objArr[2] = "refine";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public j0 a(m0.r.t.a.r.m.x0.e eVar) {
            if (eVar != null) {
                return this;
            }
            f(3);
            throw null;
        }

        public Collection<v> b() {
            EmptyList emptyList = EmptyList.c;
            if (emptyList != null) {
                return emptyList;
            }
            f(1);
            throw null;
        }

        public m0.r.t.a.r.c.f c() {
            return this.a;
        }

        public boolean d() {
            return false;
        }

        public List<m0> getParameters() {
            EmptyList emptyList = EmptyList.c;
            if (emptyList != null) {
                return emptyList;
            }
            f(0);
            throw null;
        }

        public m0.r.t.a.r.b.f m() {
            m0.r.t.a.r.b.c cVar = m0.r.t.a.r.b.c.f;
            if (cVar != null) {
                return cVar;
            }
            f(2);
            throw null;
        }

        public String toString() {
            return this.b;
        }
    }

    /* compiled from: ErrorUtils */
    public static class c extends m0.r.t.a.r.c.t0.i {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(m0.r.t.a.r.g.d r14) {
            /*
                r13 = this;
                m0.r.t.a.r.c.u r1 = m0.r.t.a.r.m.p.i()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
                java.util.List r5 = java.util.Collections.emptyList()
                m0.r.t.a.r.c.h0 r12 = m0.r.t.a.r.c.h0.a
                r7 = 0
                m0.r.t.a.r.l.l r8 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.b
                r0 = r13
                r2 = r14
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                m0.r.t.a.r.c.r0.f$a r14 = m0.r.t.a.r.c.r0.f.i
                java.util.Objects.requireNonNull(r14)
                m0.r.t.a.r.c.r0.f r9 = m0.r.t.a.r.c.r0.f.a.b
                r10 = 1
                if (r9 == 0) goto L_0x0056
                m0.r.t.a.r.c.t0.g r14 = new m0.r.t.a.r.c.t0.g
                r8 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r11 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
                r6 = r14
                r7 = r13
                r6.<init>(r7, r8, r9, r10, r11, r12)
                java.util.List r0 = java.util.Collections.emptyList()
                m0.r.t.a.r.c.p r1 = m0.r.t.a.r.c.o.d
                r14.S0(r0, r1)
                m0.r.t.a.r.g.d r0 = r13.getName()
                java.lang.String r0 = r0.b()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = m0.r.t.a.r.m.p.b(r0)
                m0.r.t.a.r.m.o r1 = new m0.r.t.a.r.m.o
                java.lang.String r2 = "<ERROR>"
                m0.r.t.a.r.m.j0 r2 = m0.r.t.a.r.m.p.f(r2, r13)
                r1.<init>(r2, r0)
                r14.P0(r1)
                java.util.Set r1 = java.util.Collections.singleton(r14)
                r13.H0(r0, r1, r14)
                return
            L_0x0056:
                r14 = 5
                m0.r.t.a.r.c.t0.g.D(r14)
                r14 = 0
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.p.c.<init>(m0.r.t.a.r.g.d):void");
        }

        public static /* synthetic */ void I(int i) {
            String str = (i == 2 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 4:
                case 7:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                case 6:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i == 2) {
                objArr[1] = "substitute";
            } else if (i == 5 || i == 8) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 5:
                case 8:
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public m0.r.t.a.r.c.d B0(TypeSubstitutor typeSubstitutor) {
            if (typeSubstitutor != null) {
                return this;
            }
            I(1);
            throw null;
        }

        public MemberScope D(p0 p0Var, m0.r.t.a.r.m.x0.e eVar) {
            if (p0Var == null) {
                I(6);
                throw null;
            } else if (eVar != null) {
                StringBuilder P0 = i0.d.a.a.a.P0("Error scope for class ");
                P0.append(getName());
                P0.append(" with arguments: ");
                P0.append(p0Var);
                return p.b(P0.toString());
            } else {
                I(7);
                throw null;
            }
        }

        public j c(TypeSubstitutor typeSubstitutor) {
            if (typeSubstitutor != null) {
                return this;
            }
            I(1);
            throw null;
        }

        public String toString() {
            return getName().b();
        }
    }

    /* compiled from: ErrorUtils */
    public static class d implements MemberScope {
        public final String b;

        public d(String str, a aVar) {
            if (str != null) {
                this.b = str;
            } else {
                h(0);
                throw null;
            }
        }

        public static /* synthetic */ void h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            if (i == 7) {
                objArr[1] = "getContributedVariables";
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = "getContributedFunctions";
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                        break;
                }
            } else {
                objArr[1] = "getContributedDescriptors";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public Collection a(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(8);
                throw null;
            } else if (bVar != null) {
                m0.r.t.a.r.m.y0.a aVar = new m0.r.t.a.r.m.y0.a(p.b, this);
                aVar.K0((f0) null, (f0) null, Collections.emptyList(), Collections.emptyList(), p.d("<ERROR FUNCTION RETURN TYPE>"), Modality.OPEN, o.e);
                Set singleton = Collections.singleton(aVar);
                if (singleton != null) {
                    return singleton;
                }
                h(10);
                throw null;
            } else {
                h(9);
                throw null;
            }
        }

        public Set<m0.r.t.a.r.g.d> b() {
            Set<m0.r.t.a.r.g.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(11);
            throw null;
        }

        public Collection c(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(5);
                throw null;
            } else if (bVar != null) {
                Set<c0> set = p.f;
                if (set != null) {
                    return set;
                }
                h(7);
                throw null;
            } else {
                h(6);
                throw null;
            }
        }

        public Set<m0.r.t.a.r.g.d> d() {
            Set<m0.r.t.a.r.g.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(12);
            throw null;
        }

        public Set<m0.r.t.a.r.g.d> e() {
            Set<m0.r.t.a.r.g.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(13);
            throw null;
        }

        public m0.r.t.a.r.c.f f(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(1);
                throw null;
            } else if (bVar != null) {
                String b2 = dVar.b();
                if (b2 != null) {
                    return new c(m0.r.t.a.r.g.d.j("<ERROR CLASS: " + b2 + ">"));
                }
                p.a(1);
                throw null;
            } else {
                h(2);
                throw null;
            }
        }

        public Collection<i> g(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
            if (dVar == null) {
                h(16);
                throw null;
            } else if (lVar != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                h(18);
                throw null;
            } else {
                h(17);
                throw null;
            }
        }

        public String toString() {
            return i0.d.a.a.a.x0(i0.d.a.a.a.P0("ErrorScope{"), this.b, '}');
        }
    }

    /* compiled from: ErrorUtils */
    public static class e implements MemberScope {
        public final String b;

        public e(String str, a aVar) {
            if (str != null) {
                this.b = str;
            } else {
                h(0);
                throw null;
            }
        }

        public static /* synthetic */ void h(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = InstabugDbContract.BugEntry.COLUMN_MESSAGE;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Collection<? extends g0> a(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(7);
                throw null;
            } else if (bVar == null) {
                h(8);
                throw null;
            } else {
                throw new IllegalStateException(this.b + ", required name: " + dVar);
            }
        }

        public Set<m0.r.t.a.r.g.d> b() {
            throw new IllegalStateException();
        }

        public Collection<? extends c0> c(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(5);
                throw null;
            } else if (bVar == null) {
                h(6);
                throw null;
            } else {
                throw new IllegalStateException(this.b + ", required name: " + dVar);
            }
        }

        public Set<m0.r.t.a.r.g.d> d() {
            throw new IllegalStateException();
        }

        public Set<m0.r.t.a.r.g.d> e() {
            throw new IllegalStateException();
        }

        public m0.r.t.a.r.c.f f(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(1);
                throw null;
            } else if (bVar == null) {
                h(2);
                throw null;
            } else {
                throw new IllegalStateException(this.b + ", required name: " + dVar);
            }
        }

        public Collection<i> g(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
            if (dVar == null) {
                h(9);
                throw null;
            } else if (lVar == null) {
                h(10);
                throw null;
            } else {
                throw new IllegalStateException(this.b);
            }
        }

        public String toString() {
            return i0.d.a.a.a.x0(i0.d.a.a.a.P0("ThrowingScope{"), this.b, '}');
        }
    }

    /* compiled from: ErrorUtils */
    public static class f implements j0 {
        public static /* synthetic */ void f(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                case 5:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                default:
                    objArr[0] = "descriptor";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 6) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "refine";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    break;
                case 5:
                    objArr[2] = "refine";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public j0 a(m0.r.t.a.r.m.x0.e eVar) {
            if (eVar != null) {
                return this;
            }
            f(5);
            throw null;
        }

        public Collection<v> b() {
            throw null;
        }

        public m0.r.t.a.r.c.f c() {
            throw null;
        }

        public boolean d() {
            throw null;
        }

        public List<m0> getParameters() {
            throw null;
        }

        public m0.r.t.a.r.b.f m() {
            m0.r.t.a.r.b.f f = DescriptorUtilsKt.f((i) null);
            if (f != null) {
                return f;
            }
            f(4);
            throw null;
        }
    }

    static {
        c cVar = new c(m0.r.t.a.r.g.d.j("<ERROR CLASS>"));
        b = cVar;
        a0 d2 = d("<ERROR PROPERTY TYPE>");
        d = d2;
        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
        m0.r.t.a.r.c.r0.f fVar = f.a.b;
        Modality modality = Modality.OPEN;
        m0.r.t.a.r.c.p pVar = o.e;
        m0.r.t.a.r.g.d j = m0.r.t.a.r.g.d.j("<ERROR PROPERTY>");
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        h0 h0Var = h0.a;
        if (cVar == null) {
            z.D(7);
            throw null;
        } else if (fVar == null) {
            z.D(8);
            throw null;
        } else if (modality == null) {
            z.D(9);
            throw null;
        } else if (pVar == null) {
            z.D(10);
            throw null;
        } else if (kind != null) {
            z zVar = r1;
            z zVar2 = new z(cVar, (c0) null, fVar, modality, pVar, true, j, kind, h0Var, false, false, false, false, false, false);
            z zVar3 = zVar;
            zVar3.L0(d2, Collections.emptyList(), (f0) null, (f0) null);
            e = zVar3;
            f = Collections.singleton(zVar3);
        } else {
            z.D(12);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 6 || i == 19) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 6 || i == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static MemberScope b(String str) {
        if (str != null) {
            return c(str, false);
        }
        a(2);
        throw null;
    }

    public static MemberScope c(String str, boolean z) {
        if (str == null) {
            a(3);
            throw null;
        } else if (z) {
            return new e(str, (a) null);
        } else {
            return new d(str, (a) null);
        }
    }

    public static a0 d(String str) {
        if (str != null) {
            return g(str, Collections.emptyList());
        }
        a(7);
        throw null;
    }

    public static j0 e(String str) {
        if (str != null) {
            return f(i0.d.a.a.a.o0("[ERROR : ", str, "]"), b);
        }
        a(15);
        throw null;
    }

    public static j0 f(String str, c cVar) {
        if (str == null) {
            a(17);
            throw null;
        } else if (cVar != null) {
            return new b(cVar, str);
        } else {
            a(18);
            throw null;
        }
    }

    public static a0 g(String str, List<m0> list) {
        if (str == null) {
            a(11);
            throw null;
        } else if (list != null) {
            j0 e2 = e(str);
            MemberScope b2 = b(str);
            m0.n.b.i.e(e2, "constructor");
            m0.n.b.i.e(b2, "memberScope");
            m0.n.b.i.e(list, "arguments");
            return new o(e2, b2, list, false, (String) null, 16);
        } else {
            a(12);
            throw null;
        }
    }

    public static a0 h(String str, j0 j0Var) {
        if (str != null) {
            return new o(j0Var, b(str));
        }
        a(9);
        throw null;
    }

    public static u i() {
        u uVar = a;
        if (uVar != null) {
            return uVar;
        }
        a(19);
        throw null;
    }

    public static boolean j(i iVar) {
        if (iVar == null) {
            return false;
        }
        if ((iVar instanceof c) || (iVar.b() instanceof c) || iVar == a) {
            return true;
        }
        return false;
    }
}
