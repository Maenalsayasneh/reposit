package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import java.util.ArrayList;
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
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.g;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: MutableClassDescriptor */
public class w extends h {
    public final ClassKind a2;
    public final boolean b2;
    public Modality c2;
    public p d2;
    public j0 e2;
    public List<m0> f2;
    public final Collection<v> g2;
    public final l h2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(i iVar, ClassKind classKind, boolean z, boolean z2, d dVar, h0 h0Var, l lVar) {
        super(lVar, iVar, dVar, h0Var, z2);
        if (classKind == null) {
            I(1);
            throw null;
        } else if (dVar == null) {
            I(2);
            throw null;
        } else if (lVar != null) {
            this.g2 = new ArrayList();
            this.h2 = lVar;
            this.a2 = classKind;
            this.b2 = z;
        } else {
            I(4);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
            return MemberScope.a.b;
        }
        I(16);
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

    public void H0() {
        this.e2 = new g(this, this.f2, this.g2, this.h2);
        Set<c> emptySet = Collections.emptySet();
        if (emptySet != null) {
            for (c cVar : emptySet) {
                ((g) cVar).P0(q());
            }
            return;
        }
        I(13);
        throw null;
    }

    public void I0(List<m0> list) {
        if (this.f2 == null) {
            this.f2 = new ArrayList(list);
            return;
        }
        StringBuilder P0 = a.P0("Type parameters are already set for ");
        P0.append(getName());
        throw new IllegalStateException(P0.toString());
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return this.b2;
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
        ClassKind classKind = this.a2;
        if (classKind != null) {
            return classKind;
        }
        I(8);
        throw null;
    }

    public f getAnnotations() {
        Objects.requireNonNull(f.i);
        f fVar = f.a.b;
        if (fVar != null) {
            return fVar;
        }
        I(5);
        throw null;
    }

    public p getVisibility() {
        p pVar = this.d2;
        if (pVar != null) {
            return pVar;
        }
        I(10);
        throw null;
    }

    public j0 i() {
        j0 j0Var = this.e2;
        if (j0Var != null) {
            return j0Var;
        }
        I(11);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    public Modality j() {
        Modality modality = this.c2;
        if (modality != null) {
            return modality;
        }
        I(7);
        throw null;
    }

    public Collection k() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        I(13);
        throw null;
    }

    public List<m0> t() {
        List<m0> list = this.f2;
        if (list != null) {
            return list;
        }
        I(15);
        throw null;
    }

    public String toString() {
        return k.E(this);
    }

    public boolean w() {
        return false;
    }

    public boolean z() {
        return false;
    }
}
