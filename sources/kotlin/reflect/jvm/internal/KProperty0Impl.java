package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import i0.j.f.p.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.c;
import m0.n.b.i;
import m0.r.l;
import m0.r.t.a.k;
import m0.r.t.a.r.c.c0;

/* compiled from: KProperty0Impl.kt */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements l<V> {
    public final k<a<V>> e2;
    public final c<Object> f2 = h.G2(LazyThreadSafetyMode.PUBLICATION, new KProperty0Impl$delegateFieldValue$1(this));

    /* compiled from: KProperty0Impl.kt */
    public static final class a<R> extends KPropertyImpl.Getter<R> implements l.a<R> {
        public final KProperty0Impl<R> a2;

        public a(KProperty0Impl<? extends R> kProperty0Impl) {
            i.e(kProperty0Impl, "property");
            this.a2 = kProperty0Impl;
        }

        public R invoke() {
            return this.a2.get();
        }

        public KPropertyImpl t() {
            return this.a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, c0 c0Var) {
        super(kDeclarationContainerImpl, c0Var);
        i.e(kDeclarationContainerImpl, "container");
        i.e(c0Var, "descriptor");
        k<a<V>> I2 = h.I2(new KProperty0Impl$_getter$1(this));
        i.d(I2, "ReflectProperties.lazy { Getter(this) }");
        this.e2 = I2;
    }

    public V get() {
        return u().call(new Object[0]);
    }

    public Object getDelegate() {
        return this.f2.getValue();
    }

    public V invoke() {
        return get();
    }

    /* renamed from: v */
    public a<V> u() {
        a<V> invoke = this.e2.invoke();
        i.d(invoke, "_getter()");
        return invoke;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        i.e(kDeclarationContainerImpl, "container");
        i.e(str, "name");
        i.e(str2, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        k<a<V>> I2 = h.I2(new KProperty0Impl$_getter$1(this));
        i.d(I2, "ReflectProperties.lazy { Getter(this) }");
        this.e2 = I2;
    }
}
