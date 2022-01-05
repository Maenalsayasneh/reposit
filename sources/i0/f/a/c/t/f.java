package i0.f.a.c.t;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import i0.f.a.c.j.i;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: ClassUtil */
public final class f {
    public static final Annotation[] a = new Annotation[0];
    public static final a[] b = new a[0];
    public static final Iterator<?> c = Collections.emptyIterator();

    /* compiled from: ClassUtil */
    public static final class a {
        public final Constructor<?> a;
        public transient Annotation[] b;
        public transient Annotation[][] c;
        public int d = -1;

        public a(Constructor<?> constructor) {
            this.a = constructor;
        }

        public int a() {
            int i = this.d;
            if (i >= 0) {
                return i;
            }
            int length = this.a.getParameterTypes().length;
            this.d = length;
            return length;
        }
    }

    /* compiled from: ClassUtil */
    public static class b {
        public static final b a = new b();
        public final Field b = a(EnumSet.class, "elementType", Class.class);
        public final Field c = a(EnumMap.class, "elementType", Class.class);

        public static Field a(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }
    }

    public static boolean A(Class<?> cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static boolean B(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String C(PropertyName propertyName) {
        if (propertyName == null) {
            return "[null]";
        }
        return c(propertyName.q);
    }

    public static String D(String str) {
        return str == null ? "[null]" : c(str);
    }

    public static String E(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        if (simpleName == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2);
        sb2.append('`');
        sb2.append(simpleName);
        sb2.append('`');
        return sb2.toString();
    }

    public static Class<?> F(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static Class<?> G(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.c;
    }

    public static <T> T H(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException jsonMappingException = new JsonMappingException(deserializationContext.Z1, iOException.getMessage());
        jsonMappingException.initCause(iOException);
        throw jsonMappingException;
    }

    public static Throwable I(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    public static Throwable J(Throwable th) throws IOException {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    public static Throwable K(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    public static void L(Throwable th, String str) {
        Throwable s = s(th);
        K(s);
        I(s);
        throw new IllegalArgumentException(str, s);
    }

    public static void M(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{obj.getClass().getName(), cls.getName(), str}));
        }
    }

    public static Class<?> N(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.Y(cls, i0.d.a.a.a.P0("Class "), " is not a primitive type"));
    }

    public static void a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class a2 : cls.getInterfaces()) {
                a(a2, cls2, collection, true);
            }
            a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    public static Method[] b(Class<?> cls, Throwable th) throws IllegalArgumentException {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", new Object[]{cls.getName(), th.getClass().getName(), th.getMessage()}), th);
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static String d(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void e(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e) {
                if (!accessibleObject.isAccessible()) {
                    Class<?> declaringClass = member.getDeclaringClass();
                    throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e.getMessage());
                }
                return;
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static String f(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return E(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static void g(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.i(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        J(exc);
        K(exc);
        throw new RuntimeException(exc);
    }

    public static void h(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.i(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e) {
            exc.addSuppressed(e);
        }
        J(exc);
        K(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T i(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor<T> l = l(cls, z);
        if (l != null) {
            try {
                return l.newInstance(new Object[0]);
            } catch (Exception e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Failed to instantiate class ");
                P0.append(cls.getName());
                P0.append(", problem: ");
                P0.append(e.getMessage());
                L(e, P0.toString());
                throw null;
            }
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.Y(cls, i0.d.a.a.a.P0("Class "), " has no default (no arg) constructor"));
        }
    }

    public static String j(Throwable th) {
        if (th instanceof JsonProcessingException) {
            return ((JsonProcessingException) th).b();
        }
        return th.getMessage();
    }

    public static Annotation[] k(Class<?> cls) {
        if (A(cls)) {
            return a;
        }
        return cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> l(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                e(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to find default constructor of class ");
            P0.append(cls.getName());
            P0.append(", problem: ");
            P0.append(e.getMessage());
            L(e, P0.toString());
            throw null;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r2v0, types: [java.lang.Class<?>, java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Class<?>> m(java.lang.Class r2, java.lang.Class<?> r3, boolean r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 8
            r0.<init>(r1)
            if (r2 == 0) goto L_0x001d
            if (r2 == r3) goto L_0x001d
            if (r4 == 0) goto L_0x0010
            r0.add(r2)
        L_0x0010:
            java.lang.Class r2 = r2.getSuperclass()
            if (r2 == 0) goto L_0x001d
            if (r2 != r3) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            r0.add(r2)
            goto L_0x0010
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.t.f.m(java.lang.Class, java.lang.Class, boolean):java.util.List");
    }

    public static String n(Object obj) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return E(cls);
    }

    public static Method[] o(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException e2) {
                    e.addSuppressed(e2);
                    b(cls, e);
                    throw null;
                }
            } else {
                b(cls, e);
                throw null;
            }
        } catch (Throwable th) {
            b(cls, th);
            throw null;
        }
    }

    public static a[] p(Class<?> cls) {
        if (cls.isInterface() || A(cls)) {
            return b;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = new a(declaredConstructors[i]);
        }
        return aVarArr;
    }

    public static Class<?> q(Class<?> cls) {
        if (A(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Class<?> r(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (!A(cls) && cls.getEnclosingMethod() != null) {
                    return null;
                }
                return q(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable s(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String t(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(javaType.e());
        sb.append('`');
        return sb.toString();
    }

    public static boolean u(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean v(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == i.class;
    }

    public static boolean w(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean x(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean y(Object obj) {
        if (obj != null) {
            if (!(obj.getClass().getAnnotation(i0.f.a.c.j.a.class) != null)) {
                return false;
            }
        }
        return true;
    }

    public static boolean z(Class<?> cls) {
        return !Modifier.isStatic(cls.getModifiers()) && q(cls) != null;
    }
}
