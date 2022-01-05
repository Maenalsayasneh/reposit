package m0.r.t.a;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KMutableProperty2Impl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty2Impl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.t0.i0;
import m0.r.t.a.r.c.t0.z;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.y;

/* compiled from: util.kt */
public class a implements k {
    public final KDeclarationContainerImpl a;

    public a(KDeclarationContainerImpl kDeclarationContainerImpl) {
        i.e(kDeclarationContainerImpl, "container");
        this.a = kDeclarationContainerImpl;
    }

    public /* bridge */ /* synthetic */ Object a(d dVar, Object obj) {
        return null;
    }

    public Object b(d0 d0Var, Object obj) {
        return g(d0Var, obj);
    }

    public /* bridge */ /* synthetic */ Object c(y yVar, Object obj) {
        return null;
    }

    public Object d(c0 c0Var, Object obj) {
        i.e(c0Var, "descriptor");
        i.e((m0.i) obj, MessageExtension.FIELD_DATA);
        z zVar = (z) c0Var;
        int i = 0;
        int i2 = zVar.l2 != null ? 1 : 0;
        if (zVar.m2 != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (((i0) c0Var).Y1) {
            if (i3 == 0) {
                return new KMutableProperty0Impl(this.a, c0Var);
            }
            if (i3 == 1) {
                return new KMutableProperty1Impl(this.a, c0Var);
            }
            if (i3 == 2) {
                return new KMutableProperty2Impl(this.a, c0Var);
            }
        } else if (i3 == 0) {
            return new KProperty0Impl(this.a, c0Var);
        } else {
            if (i3 == 1) {
                return new KProperty1Impl(this.a, c0Var);
            }
            if (i3 == 2) {
                return new KProperty2Impl(this.a, c0Var);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + c0Var);
    }

    public /* bridge */ /* synthetic */ Object e(l0 l0Var, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object f(v vVar, Object obj) {
        return null;
    }

    public Object g(r rVar, Object obj) {
        i.e(rVar, "descriptor");
        i.e((m0.i) obj, MessageExtension.FIELD_DATA);
        return new KFunctionImpl(this.a, rVar);
    }

    public Object h(h hVar, Object obj) {
        return g(hVar, obj);
    }

    public Object i(e0 e0Var, Object obj) {
        return g(e0Var, obj);
    }

    public /* bridge */ /* synthetic */ Object j(u uVar, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object k(o0 o0Var, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object l(f0 f0Var, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object m(m0 m0Var, Object obj) {
        return null;
    }
}
