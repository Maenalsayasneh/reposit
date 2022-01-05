package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.r.i;
import m0.r.t.a.k;
import m0.r.t.a.r.c.c0;

/* compiled from: KProperty0Impl.kt */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements i<V> {
    public final k<a<V>> g2;

    /* compiled from: KProperty0Impl.kt */
    public static final class a<R> extends KPropertyImpl.Setter<R> implements i.a<R> {
        public final KMutableProperty0Impl<R> a2;

        public a(KMutableProperty0Impl<R> kMutableProperty0Impl) {
            m0.n.b.i.e(kMutableProperty0Impl, "property");
            this.a2 = kMutableProperty0Impl;
        }

        public Object invoke(Object obj) {
            a<V> invoke = this.a2.g2.invoke();
            m0.n.b.i.d(invoke, "_setter()");
            invoke.call(obj);
            return m0.i.a;
        }

        public KPropertyImpl t() {
            return this.a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, c0 c0Var) {
        super(kDeclarationContainerImpl, c0Var);
        m0.n.b.i.e(kDeclarationContainerImpl, "container");
        m0.n.b.i.e(c0Var, "descriptor");
        k<a<V>> I2 = h.I2(new KMutableProperty0Impl$_setter$1(this));
        m0.n.b.i.d(I2, "ReflectProperties.lazy { Setter(this) }");
        this.g2 = I2;
    }

    public i.a getSetter() {
        a<V> invoke = this.g2.invoke();
        m0.n.b.i.d(invoke, "_setter()");
        return invoke;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        m0.n.b.i.e(kDeclarationContainerImpl, "container");
        m0.n.b.i.e(str, "name");
        m0.n.b.i.e(str2, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        k<a<V>> I2 = h.I2(new KMutableProperty0Impl$_setter$1(this));
        m0.n.b.i.d(I2, "ReflectProperties.lazy { Setter(this) }");
        this.g2 = I2;
    }
}
