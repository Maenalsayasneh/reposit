package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.a;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.n;
import m0.r.t.a.j;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.z;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: KParameterImpl.kt */
public final class KParameterImpl implements KParameter {
    public static final /* synthetic */ k[] c;
    public final j d;
    public final KCallableImpl<?> q;
    public final int x;
    public final KParameter.Kind y;

    static {
        Class<KParameterImpl> cls = KParameterImpl.class;
        c = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), m.c(new PropertyReference1Impl(m.a(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i, KParameter.Kind kind, a<? extends z> aVar) {
        i.e(kCallableImpl, "callable");
        i.e(kind, "kind");
        i.e(aVar, "computeDescriptor");
        this.q = kCallableImpl;
        this.x = i;
        this.y = kind;
        this.d = h.K2(aVar);
        h.K2(new KParameterImpl$annotations$2(this));
    }

    public boolean equals(Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            return i.a(this.q, kParameterImpl.q) && this.x == kParameterImpl.x;
        }
    }

    public KParameter.Kind f() {
        return this.y;
    }

    public boolean g() {
        z h = h();
        return (h instanceof o0) && ((o0) h).k0() != null;
    }

    public String getName() {
        z h = h();
        if (!(h instanceof o0)) {
            h = null;
        }
        o0 o0Var = (o0) h;
        if (o0Var == null || o0Var.b().C()) {
            return null;
        }
        d name = o0Var.getName();
        i.d(name, "valueParameter.name");
        if (name.d) {
            return null;
        }
        return name.b();
    }

    public n getType() {
        v type = h().getType();
        i.d(type, "descriptor.type");
        return new KTypeImpl(type, new KParameterImpl$type$1(this));
    }

    public final z h() {
        j jVar = this.d;
        k kVar = c[0];
        return (z) jVar.invoke();
    }

    public int hashCode() {
        return Integer.valueOf(this.x).hashCode() + (this.q.hashCode() * 31);
    }

    public boolean k() {
        z h = h();
        if (!(h instanceof o0)) {
            h = null;
        }
        o0 o0Var = (o0) h;
        if (o0Var != null) {
            return DescriptorUtilsKt.a(o0Var);
        }
        return false;
    }

    public String toString() {
        String str;
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.b;
        i.e(this, "parameter");
        StringBuilder sb = new StringBuilder();
        int ordinal = this.y.ordinal();
        if (ordinal == 0) {
            sb.append("instance parameter");
        } else if (ordinal == 1) {
            sb.append("extension receiver parameter");
        } else if (ordinal == 2) {
            StringBuilder P0 = i0.d.a.a.a.P0("parameter #");
            P0.append(this.x);
            P0.append(' ');
            P0.append(getName());
            sb.append(P0.toString());
        }
        sb.append(" of ");
        CallableMemberDescriptor p = this.q.p();
        if (p instanceof c0) {
            str = ReflectionObjectRenderer.d((c0) p);
        } else if (p instanceof r) {
            str = ReflectionObjectRenderer.c((r) p);
        } else {
            throw new IllegalStateException(("Illegal callable: " + p).toString());
        }
        sb.append(str);
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
