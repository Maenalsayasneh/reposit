package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import i0.j.f.p.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.f.d.a.e;

/* compiled from: RuntimeTypeMapper.kt */
public abstract class JvmFunctionSignature {

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {
        public final List<Method> a;
        public final Class<?> b;

        /* compiled from: Comparisons.kt */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Method method = (Method) t;
                i.d(method, "it");
                String name = method.getName();
                Method method2 = (Method) t2;
                i.d(method2, "it");
                return h.L(name, method2.getName());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(Class<?> cls) {
            super((f) null);
            i.e(cls, "jClass");
            this.b = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            i.d(declaredMethods, "jClass.declaredMethods");
            this.a = h.V3(declaredMethods, new a());
        }

        public String a() {
            return g.E(this.a, "", "<init>(", ")V", 0, (CharSequence) null, JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1.c, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class JavaConstructor extends JvmFunctionSignature {
        public final Constructor<?> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public JavaConstructor(Constructor<?> constructor) {
            super((f) null);
            i.e(constructor, "constructor");
            this.a = constructor;
        }

        public String a() {
            Class[] parameterTypes = this.a.getParameterTypes();
            i.d(parameterTypes, "constructor.parameterTypes");
            return h.E2(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, JvmFunctionSignature$JavaConstructor$asString$1.c, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class a extends JvmFunctionSignature {
        public final Method a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Method method) {
            super((f) null);
            i.e(method, "method");
            this.a = method;
        }

        public String a() {
            return h.l(this.a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class b extends JvmFunctionSignature {
        public final String a;
        public final e.b b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e.b bVar) {
            super((f) null);
            i.e(bVar, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
            this.b = bVar;
            this.a = bVar.a();
        }

        public String a() {
            return this.a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class c extends JvmFunctionSignature {
        public final String a;
        public final e.b b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e.b bVar) {
            super((f) null);
            i.e(bVar, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
            this.b = bVar;
            this.a = bVar.a();
        }

        public String a() {
            return this.a;
        }
    }

    public JvmFunctionSignature(f fVar) {
    }

    public abstract String a();
}
