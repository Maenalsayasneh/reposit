package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import i0.f.a.c.o.c;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {
    public final a a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public static class Provider extends AccessorNamingStrategy.Provider implements Serializable {
        public final String c = "set";
        public final String d = "with";
        public final String q = "get";
        public final String x = "is";
        public final a y = null;
    }

    public interface a {
        boolean a(char c, String str, int i);
    }

    public static class b extends DefaultAccessorNamingStrategy {
        public final Set<String> f = new HashSet();

        public b(MapperConfig<?> mapperConfig, i0.f.a.c.n.b bVar) {
            super(mapperConfig, bVar, (String) null, "get", "is", (a) null);
            Class<?> cls = bVar.q;
            RuntimeException runtimeException = c.b;
            if (runtimeException == null) {
                c cVar = c.a;
                Object[] a = cVar.a(cls);
                int length = a.length;
                String[] strArr = new String[length];
                int i = 0;
                while (i < a.length) {
                    try {
                        strArr[i] = (String) cVar.d.invoke(a[i], new Object[0]);
                        i++;
                    } catch (Exception e) {
                        throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(a.length), f.E(cls)}), e);
                    }
                }
                for (int i2 = 0; i2 < length; i2++) {
                    this.f.add(strArr[i2]);
                }
                return;
            }
            throw runtimeException;
        }

        public String c(AnnotatedMethod annotatedMethod, String str) {
            if (this.f.contains(str)) {
                return str;
            }
            return DefaultAccessorNamingStrategy.super.c(annotatedMethod, str);
        }
    }

    public DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, i0.f.a.c.n.b bVar, String str, String str2, String str3, a aVar) {
        this.b = mapperConfig.q(MapperFeature.USE_STD_BEAN_NAMING);
        this.e = str;
        this.c = str2;
        this.d = str3;
        this.a = aVar;
    }

    public String a(AnnotatedMethod annotatedMethod, String str) {
        if (this.d == null) {
            return null;
        }
        Class<?> e2 = annotatedMethod.e();
        if ((e2 != Boolean.class && e2 != Boolean.TYPE) || !str.startsWith(this.d)) {
            return null;
        }
        if (this.b) {
            return e(str, 2);
        }
        return d(str, 2);
    }

    public String b(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.e;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if (this.b) {
            return e(str, this.e.length());
        }
        return d(str, this.e.length());
    }

    public String c(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.c;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class<?> e2 = annotatedMethod.e();
            boolean z = false;
            if (e2.isArray()) {
                String name = e2.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    z = true;
                }
            }
            if (z) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && annotatedMethod.e().getName().startsWith("groovy.lang")) {
            return null;
        }
        if (this.b) {
            return e(str, this.c.length());
        }
        return d(str, this.c.length());
    }

    public String d(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        a aVar = this.a;
        if (aVar != null && !aVar.a(charAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append(str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public String e(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        a aVar = this.a;
        if (aVar != null && !aVar.a(charAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append(str, i2, length);
        return sb.toString();
    }
}
