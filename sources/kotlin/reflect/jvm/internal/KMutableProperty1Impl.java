package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.h;
import m0.r.j;
import m0.r.t.a.k;
import m0.r.t.a.r.c.c0;

/* compiled from: KProperty1Impl.kt */
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements j<T, V> {
    public final k<a<T, V>> g2;

    /* compiled from: KProperty1Impl.kt */
    public static final class a<T, V> extends KPropertyImpl.Setter<V> implements h, p {
        public final KMutableProperty1Impl<T, V> a2;

        public a(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            i.e(kMutableProperty1Impl, "property");
            this.a2 = kMutableProperty1Impl;
        }

        public Object invoke(Object obj, Object obj2) {
            a<T, V> invoke = this.a2.g2.invoke();
            i.d(invoke, "_setter()");
            invoke.call(obj, obj2);
            return m0.i.a;
        }

        public KPropertyImpl t() {
            return this.a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        i.e(kDeclarationContainerImpl, "container");
        i.e(str, "name");
        i.e(str2, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        k<a<T, V>> I2 = i0.j.f.p.h.I2(new KMutableProperty1Impl$_setter$1(this));
        i.d(I2, "ReflectProperties.lazy { Setter(this) }");
        this.g2 = I2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, c0 c0Var) {
        super(kDeclarationContainerImpl, c0Var);
        i.e(kDeclarationContainerImpl, "container");
        i.e(c0Var, "descriptor");
        k<a<T, V>> I2 = i0.j.f.p.h.I2(new KMutableProperty1Impl$_setter$1(this));
        i.d(I2, "ReflectProperties.lazy { Setter(this) }");
        this.g2 = I2;
    }
}
