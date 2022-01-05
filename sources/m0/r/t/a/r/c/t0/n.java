package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.n.a.l;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: EnumEntrySyntheticClassDescriptor */
public class n extends h {
    public final j0 a2;
    public final MemberScope b2;
    public final h<Set<d>> c2;
    public final f d2;

    /* compiled from: EnumEntrySyntheticClassDescriptor */
    public class a extends g {
        public final m0.r.t.a.r.l.f<m0.r.t.a.r.g.d, Collection<? extends g0>> b;
        public final m0.r.t.a.r.l.f<m0.r.t.a.r.g.d, Collection<? extends c0>> c;
        public final h<Collection<i>> d;

        /* renamed from: m0.r.t.a.r.c.t0.n$a$a  reason: collision with other inner class name */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class C0254a implements l<m0.r.t.a.r.g.d, Collection<? extends g0>> {
            public C0254a(n nVar) {
            }

            public Object invoke(Object obj) {
                m0.r.t.a.r.g.d dVar = (m0.r.t.a.r.g.d) obj;
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                if (dVar != null) {
                    return aVar.j(dVar, aVar.i().a(dVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                a.h(8);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class b implements l<m0.r.t.a.r.g.d, Collection<? extends c0>> {
            public b(n nVar) {
            }

            public Object invoke(Object obj) {
                m0.r.t.a.r.g.d dVar = (m0.r.t.a.r.g.d) obj;
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                if (dVar != null) {
                    return aVar.j(dVar, aVar.i().c(dVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                a.h(4);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class c implements m0.n.a.a<Collection<i>> {
            public c(n nVar) {
            }

            public Object invoke() {
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                HashSet hashSet = new HashSet();
                for (m0.r.t.a.r.g.d dVar : (Set) n.this.c2.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.a(dVar, noLookupLocation));
                    hashSet.addAll(aVar.c(dVar, noLookupLocation));
                }
                return hashSet;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class d extends m0.r.t.a.r.j.g {
            public final /* synthetic */ Set a;

            public d(a aVar, Set set) {
                this.a = set;
            }

            public static /* synthetic */ void f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public void a(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor != null) {
                    OverridingUtil.r(callableMemberDescriptor, (l<CallableMemberDescriptor, m0.i>) null);
                    this.a.add(callableMemberDescriptor);
                    return;
                }
                f(0);
                throw null;
            }

            public void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            }
        }

        public a(m0.r.t.a.r.l.l lVar) {
            this.b = lVar.g(new C0254a(n.this));
            this.c = lVar.g(new b(n.this));
            this.d = lVar.d(new c(n.this));
        }

        public static /* synthetic */ void h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public Collection<? extends g0> a(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(5);
                throw null;
            } else if (bVar != null) {
                Collection<? extends g0> collection = (Collection) ((LockBasedStorageManager.m) this.b).invoke(dVar);
                if (collection != null) {
                    return collection;
                }
                h(7);
                throw null;
            } else {
                h(6);
                throw null;
            }
        }

        public Set<m0.r.t.a.r.g.d> b() {
            Set<m0.r.t.a.r.g.d> set = (Set) n.this.c2.invoke();
            if (set != null) {
                return set;
            }
            h(17);
            throw null;
        }

        public Collection<? extends c0> c(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            if (dVar == null) {
                h(1);
                throw null;
            } else if (bVar != null) {
                Collection<? extends c0> collection = (Collection) ((LockBasedStorageManager.m) this.c).invoke(dVar);
                if (collection != null) {
                    return collection;
                }
                h(3);
                throw null;
            } else {
                h(2);
                throw null;
            }
        }

        public Set<m0.r.t.a.r.g.d> d() {
            Set<m0.r.t.a.r.g.d> set = (Set) n.this.c2.invoke();
            if (set != null) {
                return set;
            }
            h(19);
            throw null;
        }

        public Set<m0.r.t.a.r.g.d> e() {
            Set<m0.r.t.a.r.g.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(18);
            throw null;
        }

        public Collection<i> g(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
            if (dVar == null) {
                h(13);
                throw null;
            } else if (lVar != null) {
                Collection<i> collection = (Collection) this.d.invoke();
                if (collection != null) {
                    return collection;
                }
                h(15);
                throw null;
            } else {
                h(14);
                throw null;
            }
        }

        public final MemberScope i() {
            MemberScope o = n.this.i().b().iterator().next().o();
            if (o != null) {
                return o;
            }
            h(9);
            throw null;
        }

        public final <D extends CallableMemberDescriptor> Collection<? extends D> j(m0.r.t.a.r.g.d dVar, Collection<? extends D> collection) {
            if (dVar == null) {
                h(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                OverridingUtil.b.h(dVar, collection, Collections.emptySet(), n.this, new d(this, linkedHashSet));
                return linkedHashSet;
            } else {
                h(11);
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(m0.r.t.a.r.l.l lVar, m0.r.t.a.r.c.d dVar, v vVar, d dVar2, h<Set<d>> hVar, f fVar, h0 h0Var) {
        super(lVar, dVar, dVar2, h0Var, false);
        if (lVar == null) {
            I(6);
            throw null;
        } else if (vVar == null) {
            I(8);
            throw null;
        } else if (dVar2 == null) {
            I(9);
            throw null;
        } else if (hVar == null) {
            I(10);
            throw null;
        } else if (fVar == null) {
            I(11);
            throw null;
        } else if (h0Var != null) {
            this.d2 = fVar;
            this.a2 = new m0.r.t.a.r.m.g(this, Collections.emptyList(), Collections.singleton(vVar), lVar);
            this.b2 = new a(lVar);
            this.c2 = hVar;
        } else {
            I(12);
            throw null;
        }
    }

    public static n H0(m0.r.t.a.r.l.l lVar, m0.r.t.a.r.c.d dVar, d dVar2, h<Set<d>> hVar, f fVar, h0 h0Var) {
        if (lVar == null) {
            I(0);
            throw null;
        } else if (dVar == null) {
            I(1);
            throw null;
        } else if (hVar == null) {
            I(3);
            throw null;
        } else if (h0Var != null) {
            return new n(lVar, dVar, dVar.q(), dVar2, hVar, fVar, h0Var);
        } else {
            I(5);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public boolean A0() {
        return false;
    }

    public MemberScope E(e eVar) {
        if (eVar != null) {
            MemberScope memberScope = this.b2;
            if (memberScope != null) {
                return memberScope;
            }
            I(14);
            throw null;
        }
        I(13);
        throw null;
    }

    public boolean E0() {
        return false;
    }

    public Collection<m0.r.t.a.r.c.d> G() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(23);
        throw null;
    }

    public boolean H() {
        return false;
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return false;
    }

    public c P() {
        return null;
    }

    public MemberScope Q() {
        return MemberScope.a.b;
    }

    public m0.r.t.a.r.c.d S() {
        return null;
    }

    public ClassKind f() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind != null) {
            return classKind;
        }
        I(18);
        throw null;
    }

    public f getAnnotations() {
        f fVar = this.d2;
        if (fVar != null) {
            return fVar;
        }
        I(21);
        throw null;
    }

    public p getVisibility() {
        p pVar = o.e;
        if (pVar != null) {
            return pVar;
        }
        I(20);
        throw null;
    }

    public j0 i() {
        j0 j0Var = this.a2;
        if (j0Var != null) {
            return j0Var;
        }
        I(17);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    public Modality j() {
        Modality modality = Modality.FINAL;
        if (modality != null) {
            return modality;
        }
        I(19);
        throw null;
    }

    public Collection<c> k() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(16);
        throw null;
    }

    public List<m0> t() {
        List<m0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(22);
        throw null;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("enum entry ");
        P0.append(getName());
        return P0.toString();
    }

    public boolean w() {
        return false;
    }

    public boolean z() {
        return false;
    }
}
