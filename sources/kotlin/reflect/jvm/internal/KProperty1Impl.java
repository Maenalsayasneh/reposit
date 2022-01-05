package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import i0.j.f.p.h;
import java.lang.reflect.Field;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.c;
import m0.n.b.i;
import m0.r.m;
import m0.r.t.a.k;
import m0.r.t.a.r.c.c0;

/* compiled from: KProperty1Impl.kt */
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements m<T, V> {
    public final k<a<T, V>> e2;
    public final c<Field> f2 = h.G2(LazyThreadSafetyMode.PUBLICATION, new KProperty1Impl$delegateField$1(this));

    /* compiled from: KProperty1Impl.kt */
    public static final class a<T, V> extends KPropertyImpl.Getter<V> implements m.a<T, V> {
        public final KProperty1Impl<T, V> a2;

        public a(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            i.e(kProperty1Impl, "property");
            this.a2 = kProperty1Impl;
        }

        public V invoke(T t) {
            return this.a2.get(t);
        }

        public KPropertyImpl t() {
            return this.a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        i.e(kDeclarationContainerImpl, "container");
        i.e(str, "name");
        i.e(str2, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        k<a<T, V>> I2 = h.I2(new KProperty1Impl$_getter$1(this));
        i.d(I2, "ReflectProperties.lazy { Getter(this) }");
        this.e2 = I2;
    }

    public V get(T t) {
        return u().call(t);
    }

    public V invoke(T t) {
        return get(t);
    }

    /* renamed from: v */
    public a<T, V> u() {
        a<T, V> invoke = this.e2.invoke();
        i.d(invoke, "_getter()");
        return invoke;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, c0 c0Var) {
        super(kDeclarationContainerImpl, c0Var);
        i.e(kDeclarationContainerImpl, "container");
        i.e(c0Var, "descriptor");
        k<a<T, V>> I2 = h.I2(new KProperty1Impl$_getter$1(this));
        i.d(I2, "ReflectProperties.lazy { Getter(this) }");
        this.e2 = I2;
    }
}
