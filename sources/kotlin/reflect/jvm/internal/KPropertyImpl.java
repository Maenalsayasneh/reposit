package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import i0.j.f.p.h;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.i;
import m0.n.b.m;
import m0.r.g;
import m0.r.k;
import m0.r.t.a.j;
import m0.r.t.a.o;
import m0.r.t.a.q.c;
import m0.r.t.a.r.c.b0;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.g.b;

/* compiled from: KPropertyImpl.kt */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements k<V> {
    public static final Object y = new Object();
    public final m0.r.t.a.k<Field> Y1;
    public final j<c0> Z1;
    public final KDeclarationContainerImpl a2;
    public final String b2;
    public final String c2;
    public final Object d2;

    /* compiled from: KPropertyImpl.kt */
    public static abstract class Getter<V> extends a<V, V> implements k.a<V> {
        public static final /* synthetic */ k[] y;
        public final j Y1 = h.K2(new KPropertyImpl$Getter$descriptor$2(this));
        public final m0.r.t.a.k Z1 = h.I2(new KPropertyImpl$Getter$caller$2(this));

        static {
            Class<Getter> cls = Getter.class;
            y = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), m.c(new PropertyReference1Impl(m.a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public String getName() {
            return i0.d.a.a.a.x0(i0.d.a.a.a.P0("<get-"), t().b2, '>');
        }

        public c<?> m() {
            m0.r.t.a.k kVar = this.Z1;
            k kVar2 = y[1];
            return (c) kVar.invoke();
        }

        public CallableMemberDescriptor p() {
            j jVar = this.Y1;
            k kVar = y[0];
            return (d0) jVar.invoke();
        }

        public b0 s() {
            j jVar = this.Y1;
            k kVar = y[0];
            return (d0) jVar.invoke();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    public static abstract class Setter<V> extends a<V, i> implements m0.r.h<V> {
        public static final /* synthetic */ k[] y;
        public final j Y1 = h.K2(new KPropertyImpl$Setter$descriptor$2(this));
        public final m0.r.t.a.k Z1 = h.I2(new KPropertyImpl$Setter$caller$2(this));

        static {
            Class<Setter> cls = Setter.class;
            y = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), m.c(new PropertyReference1Impl(m.a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public String getName() {
            return i0.d.a.a.a.x0(i0.d.a.a.a.P0("<set-"), t().b2, '>');
        }

        public c<?> m() {
            m0.r.t.a.k kVar = this.Z1;
            k kVar2 = y[1];
            return (c) kVar.invoke();
        }

        public CallableMemberDescriptor p() {
            j jVar = this.Y1;
            k kVar = y[0];
            return (e0) jVar.invoke();
        }

        public b0 s() {
            j jVar = this.Y1;
            k kVar = y[0];
            return (e0) jVar.invoke();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    public static abstract class a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements g<ReturnType> {
        public boolean isExternal() {
            return s().isExternal();
        }

        public boolean isInfix() {
            return s().isInfix();
        }

        public boolean isInline() {
            return s().isInline();
        }

        public boolean isOperator() {
            return s().isOperator();
        }

        public boolean isSuspend() {
            return s().isSuspend();
        }

        public KDeclarationContainerImpl n() {
            return t().a2;
        }

        public c<?> o() {
            return null;
        }

        public boolean r() {
            return !m0.n.b.i.a(t().d2, CallableReference.NO_RECEIVER);
        }

        public abstract b0 s();

        public abstract KPropertyImpl<PropertyType> t();
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, c0 c0Var, Object obj) {
        this.a2 = kDeclarationContainerImpl;
        this.b2 = str;
        this.c2 = str2;
        this.d2 = obj;
        m0.r.t.a.k<Field> I2 = h.I2(new KPropertyImpl$_javaField$1(this));
        m0.n.b.i.d(I2, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this.Y1 = I2;
        j<c0> J2 = h.J2(c0Var, new KPropertyImpl$_descriptor$1(this));
        m0.n.b.i.d(J2, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this.Z1 = J2;
    }

    public boolean equals(Object obj) {
        b bVar = o.a;
        m0.r.b bVar2 = null;
        KPropertyImpl kPropertyImpl = (KPropertyImpl) (!(obj instanceof KPropertyImpl) ? null : obj);
        if (kPropertyImpl == null) {
            if (!(obj instanceof PropertyReference)) {
                obj = null;
            }
            PropertyReference propertyReference = (PropertyReference) obj;
            m0.r.b compute = propertyReference != null ? propertyReference.compute() : null;
            if (compute instanceof KPropertyImpl) {
                bVar2 = compute;
            }
            kPropertyImpl = (KPropertyImpl) bVar2;
        }
        if (kPropertyImpl == null || !m0.n.b.i.a(this.a2, kPropertyImpl.a2) || !m0.n.b.i.a(this.b2, kPropertyImpl.b2) || !m0.n.b.i.a(this.c2, kPropertyImpl.c2) || !m0.n.b.i.a(this.d2, kPropertyImpl.d2)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.b2;
    }

    public int hashCode() {
        return this.c2.hashCode() + i0.d.a.a.a.F(this.b2, this.a2.hashCode() * 31, 31);
    }

    public boolean isConst() {
        return p().isConst();
    }

    public boolean isLateinit() {
        return p().q0();
    }

    public boolean isSuspend() {
        return false;
    }

    public c<?> m() {
        return u().m();
    }

    public KDeclarationContainerImpl n() {
        return this.a2;
    }

    public c<?> o() {
        Objects.requireNonNull(u());
        return null;
    }

    public boolean r() {
        return !m0.n.b.i.a(this.d2, CallableReference.NO_RECEIVER);
    }

    public final Field s() {
        if (p().N()) {
            return this.Y1.invoke();
        }
        return null;
    }

    /* renamed from: t */
    public c0 p() {
        c0 invoke = this.Z1.invoke();
        m0.n.b.i.d(invoke, "_descriptor()");
        return invoke;
    }

    public String toString() {
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.b;
        return ReflectionObjectRenderer.d(p());
    }

    public abstract Getter<V> u();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, (c0) null, obj);
        m0.n.b.i.e(kDeclarationContainerImpl, "container");
        m0.n.b.i.e(str, "name");
        m0.n.b.i.e(str2, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KPropertyImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, m0.r.t.a.r.c.c0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r9, r0)
            m0.r.t.a.r.g.d r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            m0.n.b.i.d(r3, r0)
            m0.r.t.a.n r0 = m0.r.t.a.n.b
            m0.r.t.a.c r0 = m0.r.t.a.n.c(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, m0.r.t.a.r.c.c0):void");
    }
}
