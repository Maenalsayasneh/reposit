package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.n;
import m0.r.o;
import m0.r.t.a.a;
import m0.r.t.a.f;
import m0.r.t.a.j;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.b.e;

/* compiled from: KTypeParameterImpl.kt */
public final class KTypeParameterImpl implements o, f {
    public static final /* synthetic */ k[] c = {m.c(new PropertyReference1Impl(m.a(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    public final j d = h.K2(new KTypeParameterImpl$upperBounds$2(this));
    public final m0.r.t.a.h q;
    public final m0 x;

    public KTypeParameterImpl(m0.r.t.a.h hVar, m0 m0Var) {
        Object obj;
        KClassImpl<?> kClassImpl;
        Class<?> cls;
        i.e(m0Var, "descriptor");
        this.x = m0Var;
        if (hVar == null) {
            m0.r.t.a.r.c.i b = m0Var.b();
            i.d(b, "descriptor.containingDeclaration");
            if (b instanceof d) {
                obj = a((d) b);
            } else if (b instanceof CallableMemberDescriptor) {
                m0.r.t.a.r.c.i b2 = ((CallableMemberDescriptor) b).b();
                i.d(b2, "declaration.containingDeclaration");
                if (b2 instanceof d) {
                    kClassImpl = a((d) b2);
                } else {
                    Object obj2 = null;
                    DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) (!(b instanceof DeserializedMemberDescriptor) ? null : b);
                    if (deserializedMemberDescriptor != null) {
                        m0.r.t.a.r.k.b.w.d b0 = deserializedMemberDescriptor.b0();
                        e eVar = (e) (!(b0 instanceof e) ? null : b0);
                        Object obj3 = eVar != null ? eVar.d : null;
                        m0.r.t.a.r.c.v0.a.e eVar2 = (m0.r.t.a.r.c.v0.a.e) (obj3 instanceof m0.r.t.a.r.c.v0.a.e ? obj3 : obj2);
                        if (eVar2 == null || (cls = eVar2.a) == null) {
                            throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
                        }
                        m0.r.d<?> r1 = h.r1(cls);
                        Objects.requireNonNull(r1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        kClassImpl = (KClassImpl) r1;
                    } else {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + b);
                    }
                }
                obj = b.J(new a(kClassImpl), m0.i.a);
            } else {
                throw new KotlinReflectionInternalError("Unknown type parameter container: " + b);
            }
            i.d(obj, "when (val declaration = … $declaration\")\n        }");
            hVar = (m0.r.t.a.h) obj;
        }
        this.q = hVar;
    }

    public final KClassImpl<?> a(d dVar) {
        Class<?> h = m0.r.t.a.o.h(dVar);
        KClassImpl<?> kClassImpl = (KClassImpl) (h != null ? h.r1(h) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Type parameter container is not resolved: ");
        P0.append(dVar.b());
        throw new KotlinReflectionInternalError(P0.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            return i.a(this.q, kTypeParameterImpl.q) && i.a(getName(), kTypeParameterImpl.getName());
        }
    }

    public m0.r.t.a.r.c.f getDescriptor() {
        return this.x;
    }

    public String getName() {
        String b = this.x.getName().b();
        i.d(b, "descriptor.name.asString()");
        return b;
    }

    public List<n> getUpperBounds() {
        j jVar = this.d;
        k kVar = c[0];
        return (List) jVar.invoke();
    }

    public int hashCode() {
        return getName().hashCode() + (this.q.hashCode() * 31);
    }

    public KVariance l() {
        int ordinal = this.x.l().ordinal();
        if (ordinal == 0) {
            return KVariance.INVARIANT;
        }
        if (ordinal == 1) {
            return KVariance.IN;
        }
        if (ordinal == 2) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        i.e(this, "typeParameter");
        StringBuilder sb = new StringBuilder();
        int ordinal = l().ordinal();
        if (ordinal == 1) {
            sb.append("in ");
        } else if (ordinal == 2) {
            sb.append("out ");
        }
        sb.append(getName());
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
