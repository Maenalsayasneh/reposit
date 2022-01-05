package m0.r.t.a.r.c.t0;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.f;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p0;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: AbstractClassDescriptor */
public abstract class b extends s {
    public final d c;
    public final h<a0> d;
    public final h<MemberScope> q;
    public final h<f0> x;

    /* compiled from: AbstractClassDescriptor */
    public class a implements m0.n.a.a<a0> {
        public a() {
        }

        public Object invoke() {
            b bVar = b.this;
            return s0.n(bVar, bVar.z0(), new a(this));
        }
    }

    /* renamed from: m0.r.t.a.r.c.t0.b$b  reason: collision with other inner class name */
    /* compiled from: AbstractClassDescriptor */
    public class C0253b implements m0.n.a.a<MemberScope> {
        public C0253b() {
        }

        public Object invoke() {
            return new f(b.this.z0());
        }
    }

    /* compiled from: AbstractClassDescriptor */
    public class c implements m0.n.a.a<f0> {
        public c() {
        }

        public Object invoke() {
            return new q(b.this);
        }
    }

    public b(l lVar, d dVar) {
        if (lVar == null) {
            I(0);
            throw null;
        } else if (dVar != null) {
            this.c = dVar;
            this.d = lVar.d(new a());
            this.q = lVar.d(new C0253b());
            this.x = lVar.d(new c());
        } else {
            I(1);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i) {
        int i2 = i;
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 18) {
            objArr[1] = "substitute";
        } else if (i2 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: B0 */
    public m0.r.t.a.r.c.d c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            I(17);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            return new r(this, typeSubstitutor);
        }
    }

    public MemberScope D(p0 p0Var, e eVar) {
        if (p0Var == null) {
            I(9);
            throw null;
        } else if (eVar == null) {
            I(10);
            throw null;
        } else if (p0Var.f()) {
            MemberScope E = E(eVar);
            if (E != null) {
                return E;
            }
            I(11);
            throw null;
        } else {
            return new SubstitutingScope(E(eVar), TypeSubstitutor.e(p0Var));
        }
    }

    public f0 G0() {
        f0 f0Var = (f0) this.x.invoke();
        if (f0Var != null) {
            return f0Var;
        }
        I(5);
        throw null;
    }

    public <R, D> R J(k<R, D> kVar, D d2) {
        return kVar.a(this, d2);
    }

    public MemberScope Z(p0 p0Var) {
        MemberScope D = D(p0Var, DescriptorUtilsKt.j(m0.r.t.a.r.j.d.d(this)));
        if (D != null) {
            return D;
        }
        I(15);
        throw null;
    }

    public m0.r.t.a.r.c.d a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public m0.r.t.a.r.c.f m53a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public i m54a() {
        return this;
    }

    public d getName() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar;
        }
        I(2);
        throw null;
    }

    public a0 q() {
        a0 a0Var = (a0) this.d.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        I(19);
        throw null;
    }

    public MemberScope w0() {
        MemberScope memberScope = (MemberScope) this.q.invoke();
        if (memberScope != null) {
            return memberScope;
        }
        I(4);
        throw null;
    }

    public MemberScope z0() {
        MemberScope E = E(DescriptorUtilsKt.j(m0.r.t.a.r.j.d.d(this)));
        if (E != null) {
            return E;
        }
        I(16);
        throw null;
    }
}
