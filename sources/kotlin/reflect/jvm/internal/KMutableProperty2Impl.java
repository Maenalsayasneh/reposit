package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.p;
import m0.n.a.q;
import m0.n.b.i;
import m0.r.h;
import m0.r.k;
import m0.r.t.a.r.c.c0;

/* compiled from: KProperty2Impl.kt */
public final class KMutableProperty2Impl<D, E, V> extends KProperty2Impl<D, E, V> implements k, p {
    public final m0.r.t.a.k<a<D, E, V>> g2;

    /* compiled from: KProperty2Impl.kt */
    public static final class a<D, E, V> extends KPropertyImpl.Setter<V> implements h, q {
        public final KMutableProperty2Impl<D, E, V> a2;

        public a(KMutableProperty2Impl<D, E, V> kMutableProperty2Impl) {
            i.e(kMutableProperty2Impl, "property");
            this.a2 = kMutableProperty2Impl;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            a<D, E, V> invoke = this.a2.g2.invoke();
            i.d(invoke, "_setter()");
            invoke.call(obj, obj2, obj3);
            return m0.i.a;
        }

        public KPropertyImpl t() {
            return this.a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(KDeclarationContainerImpl kDeclarationContainerImpl, c0 c0Var) {
        super(kDeclarationContainerImpl, c0Var);
        i.e(kDeclarationContainerImpl, "container");
        i.e(c0Var, "descriptor");
        m0.r.t.a.k<a<D, E, V>> I2 = i0.j.f.p.h.I2(new KMutableProperty2Impl$_setter$1(this));
        i.d(I2, "ReflectProperties.lazy { Setter(this) }");
        this.g2 = I2;
    }
}
