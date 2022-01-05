package t0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import m0.i;
import q0.d0;
import q0.f0;
import t0.c0.w;
import t0.h;

/* compiled from: BuiltInConverters */
public final class c extends h.a {
    public boolean a = true;

    /* compiled from: BuiltInConverters */
    public static final class a implements h<f0, f0> {
        public static final a a = new a();

        public Object a(Object obj) throws IOException {
            f0 f0Var = (f0) obj;
            try {
                return a0.a(f0Var);
            } finally {
                f0Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class b implements h<d0, d0> {
        public static final b a = new b();

        public Object a(Object obj) throws IOException {
            return (d0) obj;
        }
    }

    /* renamed from: t0.c$c  reason: collision with other inner class name */
    /* compiled from: BuiltInConverters */
    public static final class C0306c implements h<f0, f0> {
        public static final C0306c a = new C0306c();

        public Object a(Object obj) throws IOException {
            return (f0) obj;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class d implements h<Object, String> {
        public static final d a = new d();

        public Object a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class e implements h<f0, i> {
        public static final e a = new e();

        public Object a(Object obj) throws IOException {
            ((f0) obj).close();
            return i.a;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class f implements h<f0, Void> {
        public static final f a = new f();

        public Object a(Object obj) throws IOException {
            ((f0) obj).close();
            return null;
        }
    }

    public h<?, d0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        if (d0.class.isAssignableFrom(a0.f(type))) {
            return b.a;
        }
        return null;
    }

    public h<f0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (type == f0.class) {
            if (a0.i(annotationArr, w.class)) {
                return C0306c.a;
            }
            return a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (!this.a || type != i.class) {
                return null;
            }
            try {
                return e.a;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
    }
}
