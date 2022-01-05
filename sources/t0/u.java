package t0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.v;
import q0.w;
import q0.y;

/* compiled from: RequestFactory */
public final class u {
    public final Method a;
    public final w b;
    public final String c;
    public final String d;
    public final v e;
    public final y f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final r<?>[] j;
    public final boolean k;

    /* compiled from: RequestFactory */
    public static final class a {
        public static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final w c;
        public final Method d;
        public final Annotation[] e;
        public final Annotation[][] f;
        public final Type[] g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public String p;
        public boolean q;
        public boolean r;
        public boolean s;
        public String t;
        public v u;
        public y v;
        public Set<String> w;
        public r<?>[] x;
        public boolean y;

        public a(w wVar, Method method) {
            this.c = wVar;
            this.d = method;
            this.e = method.getAnnotations();
            this.g = method.getGenericParameterTypes();
            this.f = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.p;
            if (str3 == null) {
                this.p = str;
                this.q = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (a.matcher(substring).find()) {
                            throw a0.j(this.d, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.t = str2;
                    Matcher matcher = a.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.w = linkedHashSet;
                    return;
                }
                return;
            }
            throw a0.j(this.d, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i2, Type type) {
            if (a0.h(type)) {
                throw a0.l(this.d, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public u(a aVar) {
        this.a = aVar.d;
        this.b = aVar.c.c;
        this.c = aVar.p;
        this.d = aVar.t;
        this.e = aVar.u;
        this.f = aVar.v;
        this.g = aVar.q;
        this.h = aVar.r;
        this.i = aVar.s;
        this.j = aVar.x;
        this.k = aVar.y;
    }
}
