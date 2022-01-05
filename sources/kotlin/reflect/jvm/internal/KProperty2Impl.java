package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.Field;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.c;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.k;
import m0.r.t.a.r.c.c0;

/* compiled from: KProperty2Impl.kt */
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements k, p {
    public final m0.r.t.a.k<a<D, E, V>> e2;
    public final c<Field> f2 = h.G2(LazyThreadSafetyMode.PUBLICATION, new KProperty2Impl$delegateField$1(this));

    /* compiled from: KProperty2Impl.kt */
    public static final class a<D, E, V> extends KPropertyImpl.Getter<V> implements k.a, p {
        public final KProperty2Impl<D, E, V> a2;

        public a(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            i.e(kProperty2Impl, "property");
            this.a2 = kProperty2Impl;
        }

        public V invoke(D d, E e) {
            return this.a2.v(d, e);
        }

        public KPropertyImpl t() {
            return this.a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl kDeclarationContainerImpl, c0 c0Var) {
        super(kDeclarationContainerImpl, c0Var);
        i.e(kDeclarationContainerImpl, "container");
        i.e(c0Var, "descriptor");
        m0.r.t.a.k<a<D, E, V>> I2 = h.I2(new KProperty2Impl$_getter$1(this));
        i.d(I2, "ReflectProperties.lazy { Getter(this) }");
        this.e2 = I2;
    }

    public V invoke(D d, E e) {
        return v(d, e);
    }

    public KPropertyImpl.Getter u() {
        a<D, E, V> invoke = this.e2.invoke();
        i.d(invoke, "_getter()");
        return invoke;
    }

    public V v(D d, E e) {
        a<D, E, V> invoke = this.e2.invoke();
        i.d(invoke, "_getter()");
        return invoke.call(d, e);
    }
}
