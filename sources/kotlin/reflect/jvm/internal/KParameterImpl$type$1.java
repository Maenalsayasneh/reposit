package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.o;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.z;

/* compiled from: KParameterImpl.kt */
public final class KParameterImpl$type$1 extends Lambda implements a<Type> {
    public final /* synthetic */ KParameterImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KParameterImpl$type$1(KParameterImpl kParameterImpl) {
        super(0);
        this.c = kParameterImpl;
    }

    public Object invoke() {
        z h = this.c.h();
        if (!(h instanceof f0) || !i.a(o.e(this.c.q.p()), h) || this.c.q.p().f() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return this.c.q.m().b().get(this.c.x);
        }
        m0.r.t.a.r.c.i b = this.c.q.p().b();
        Objects.requireNonNull(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> h2 = o.h((d) b);
        if (h2 != null) {
            return h2;
        }
        throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + h);
    }
}
