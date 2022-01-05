package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: AbstractTypeParameterDescriptor */
public abstract class e extends l implements m0 {
    public final boolean Y1;
    public final int Z1;
    public final h<j0> a2;
    public final h<a0> b2;
    public final l c2;
    public final Variance y;

    /* compiled from: AbstractTypeParameterDescriptor */
    public class a implements m0.n.a.a<j0> {
        public final /* synthetic */ l c;
        public final /* synthetic */ k0 d;

        public a(l lVar, k0 k0Var) {
            this.c = lVar;
            this.d = k0Var;
        }

        public Object invoke() {
            return new c(e.this, this.c, this.d);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor */
    public class b implements m0.n.a.a<a0> {
        public final /* synthetic */ d c;

        public b(d dVar) {
            this.c = dVar;
        }

        public Object invoke() {
            Objects.requireNonNull(f.i);
            f fVar = f.a.b;
            j0 i = e.this.i();
            List emptyList = Collections.emptyList();
            f fVar2 = new f(this);
            i.e(fVar2, "getScope");
            l lVar = LockBasedStorageManager.b;
            i.d(lVar, "NO_LOCKS");
            return KotlinTypeFactory.h(fVar, i, emptyList, false, new LazyScopeAdapter(lVar, fVar2));
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor */
    public class c extends AbstractTypeConstructor {
        public final k0 b;
        public final /* synthetic */ e c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, l lVar, k0 k0Var) {
            super(lVar);
            if (lVar != null) {
                this.c = eVar;
                this.b = k0Var;
                return;
            }
            o(0);
            throw null;
        }

        public static /* synthetic */ void o(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public m0.r.t.a.r.c.f c() {
            e eVar = this.c;
            if (eVar != null) {
                return eVar;
            }
            o(3);
            throw null;
        }

        public boolean d() {
            return true;
        }

        public Collection<v> g() {
            List<v> I0 = this.c.I0();
            if (I0 != null) {
                return I0;
            }
            o(1);
            throw null;
        }

        public List<m0> getParameters() {
            List<m0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            o(2);
            throw null;
        }

        public v h() {
            return p.d("Cyclic upper bounds");
        }

        public k0 j() {
            k0 k0Var = this.b;
            if (k0Var != null) {
                return k0Var;
            }
            o(5);
            throw null;
        }

        public List<v> l(List<v> list) {
            if (list != null) {
                List<v> B0 = this.c.B0(list);
                if (B0 != null) {
                    return B0;
                }
                o(8);
                throw null;
            }
            o(7);
            throw null;
        }

        public m0.r.t.a.r.b.f m() {
            m0.r.t.a.r.b.f f = DescriptorUtilsKt.f(this.c);
            if (f != null) {
                return f;
            }
            o(4);
            throw null;
        }

        public void n(v vVar) {
            this.c.H0(vVar);
        }

        public String toString() {
            return this.c.getName().c;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(l lVar, m0.r.t.a.r.c.i iVar, f fVar, d dVar, Variance variance, boolean z, int i, h0 h0Var, k0 k0Var) {
        super(iVar, fVar, dVar, h0Var);
        if (lVar == null) {
            D(0);
            throw null;
        } else if (iVar == null) {
            D(1);
            throw null;
        } else if (fVar == null) {
            D(2);
            throw null;
        } else if (dVar == null) {
            D(3);
            throw null;
        } else if (variance == null) {
            D(4);
            throw null;
        } else if (h0Var == null) {
            D(5);
            throw null;
        } else if (k0Var != null) {
            this.y = variance;
            this.Y1 = z;
            this.Z1 = i;
            this.a2 = lVar.d(new a(lVar, k0Var));
            this.b2 = lVar.d(new b(dVar));
            this.c2 = lVar;
        } else {
            D(6);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public boolean B() {
        return this.Y1;
    }

    public List<v> B0(List<v> list) {
        if (list == null) {
            D(12);
            throw null;
        } else if (list != null) {
            return list;
        } else {
            D(13);
            throw null;
        }
    }

    public abstract void H0(v vVar);

    public m0.r.t.a.r.c.l I() {
        return this;
    }

    public abstract List<v> I0();

    public <R, D> R J(k<R, D> kVar, D d) {
        return kVar.m(this, d);
    }

    public m0.r.t.a.r.c.f a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public m0.r.t.a.r.c.i m56a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public m0 m57a() {
        return this;
    }

    public int g() {
        return this.Z1;
    }

    public l g0() {
        l lVar = this.c2;
        if (lVar != null) {
            return lVar;
        }
        D(14);
        throw null;
    }

    public List<v> getUpperBounds() {
        List<v> k = ((c) i()).b();
        if (k != null) {
            return k;
        }
        D(8);
        throw null;
    }

    public final j0 i() {
        j0 j0Var = (j0) this.a2.invoke();
        if (j0Var != null) {
            return j0Var;
        }
        D(9);
        throw null;
    }

    public Variance l() {
        Variance variance = this.y;
        if (variance != null) {
            return variance;
        }
        D(7);
        throw null;
    }

    public boolean n0() {
        return false;
    }

    public a0 q() {
        a0 a0Var = (a0) this.b2.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        D(10);
        throw null;
    }
}
