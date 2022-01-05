package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.g;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: ClassDescriptorImpl */
public class i extends h {
    public final Modality a2;
    public final ClassKind b2;
    public final j0 c2;
    public MemberScope d2;
    public Set<c> e2;
    public c f2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(m0.r.t.a.r.c.i iVar, d dVar, Modality modality, ClassKind classKind, Collection<v> collection, h0 h0Var, boolean z, l lVar) {
        super(lVar, iVar, dVar, h0Var, z);
        if (iVar == null) {
            I(0);
            throw null;
        } else if (dVar == null) {
            I(1);
            throw null;
        } else if (modality == null) {
            I(2);
            throw null;
        } else if (classKind == null) {
            I(3);
            throw null;
        } else if (collection == null) {
            I(4);
            throw null;
        } else if (lVar != null) {
            this.a2 = modality;
            this.b2 = classKind;
            this.c2 = new g(this, Collections.emptyList(), collection, lVar);
        } else {
            I(6);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
            MemberScope memberScope = this.d2;
            if (memberScope != null) {
                return memberScope;
            }
            I(13);
            throw null;
        }
        I(12);
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
        I(19);
        throw null;
    }

    public boolean H() {
        return false;
    }

    public final void H0(MemberScope memberScope, Set<c> set, c cVar) {
        if (set != null) {
            this.d2 = memberScope;
            this.e2 = set;
            this.f2 = cVar;
            return;
        }
        I(8);
        throw null;
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return false;
    }

    public c P() {
        return this.f2;
    }

    public MemberScope Q() {
        return MemberScope.a.b;
    }

    public m0.r.t.a.r.c.d S() {
        return null;
    }

    public ClassKind f() {
        ClassKind classKind = this.b2;
        if (classKind != null) {
            return classKind;
        }
        I(15);
        throw null;
    }

    public f getAnnotations() {
        Objects.requireNonNull(f.i);
        f fVar = f.a.b;
        if (fVar != null) {
            return fVar;
        }
        I(9);
        throw null;
    }

    public p getVisibility() {
        p pVar = o.e;
        if (pVar != null) {
            return pVar;
        }
        I(17);
        throw null;
    }

    public j0 i() {
        j0 j0Var = this.c2;
        if (j0Var != null) {
            return j0Var;
        }
        I(10);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    public Modality j() {
        Modality modality = this.a2;
        if (modality != null) {
            return modality;
        }
        I(16);
        throw null;
    }

    public Collection<c> k() {
        Set<c> set = this.e2;
        if (set != null) {
            return set;
        }
        I(11);
        throw null;
    }

    public List<m0> t() {
        List<m0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(18);
        throw null;
    }

    public String toString() {
        StringBuilder P0 = a.P0("class ");
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
