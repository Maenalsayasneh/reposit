package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import i0.f.a.c.e;
import i0.f.a.c.n.b;
import i0.f.a.c.n.c;
import i0.f.a.c.n.i;
import i0.f.a.c.n.k;
import i0.f.a.c.n.o;
import i0.f.a.c.t.a;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class BasicClassIntrospector extends k implements Serializable {
    public static final i Y1;
    public static final Class<?> c = e.class;
    public static final i d;
    public static final i q;
    public static final i x;
    public static final i y;

    static {
        Class<String> cls = String.class;
        Class<Object> cls2 = Object.class;
        SimpleType g02 = SimpleType.g0(cls);
        a aVar = c.a;
        d = i.i((MapperConfig<?>) null, g02, new b(cls));
        Class cls3 = Boolean.TYPE;
        q = i.i((MapperConfig<?>) null, SimpleType.g0(cls3), new b(cls3));
        Class cls4 = Integer.TYPE;
        x = i.i((MapperConfig<?>) null, SimpleType.g0(cls4), new b(cls4));
        Class cls5 = Long.TYPE;
        y = i.i((MapperConfig<?>) null, SimpleType.g0(cls5), new b(cls5));
        Y1 = i.i((MapperConfig<?>) null, SimpleType.g0(cls2), new b(cls2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.n.i a(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r3, com.fasterxml.jackson.databind.JavaType r4) {
        /*
            r2 = this;
            boolean r0 = r4.G()
            if (r0 == 0) goto L_0x0025
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.type.ArrayType
            if (r0 == 0) goto L_0x000b
            goto L_0x0025
        L_0x000b:
            java.lang.Class<?> r0 = r4.c
            boolean r1 = i0.f.a.c.t.f.x(r0)
            if (r1 == 0) goto L_0x0025
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto L_0x0023
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x0031
            i0.f.a.c.n.b r0 = r2.c(r3, r4, r3)
            i0.f.a.c.n.i r3 = i0.f.a.c.n.i.i(r3, r4, r0)
            return r3
        L_0x0031:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.a(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType):i0.f.a.c.n.i");
    }

    public i b(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> cls = javaType.c;
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return x;
            }
            if (cls == Long.TYPE) {
                return y;
            }
            if (cls == Boolean.TYPE) {
                return q;
            }
            return null;
        } else if (f.x(cls)) {
            if (cls == Object.class) {
                return Y1;
            }
            if (cls == String.class) {
                return d;
            }
            if (cls == Integer.class) {
                return x;
            }
            if (cls == Long.class) {
                return y;
            }
            if (cls == Boolean.class) {
                return q;
            }
            return null;
        } else if (!c.isAssignableFrom(cls)) {
            return null;
        } else {
            a aVar = c.a;
            return i.i(mapperConfig, javaType, new b(cls));
        }
    }

    public b c(MapperConfig<?> mapperConfig, JavaType javaType, k.a aVar) {
        MapperConfig<?> mapperConfig2 = mapperConfig;
        JavaType javaType2 = javaType;
        a aVar2 = c.a;
        Objects.requireNonNull(javaType);
        boolean z = true;
        if (javaType2 instanceof ArrayType) {
            if (mapperConfig2 == null || ((MapperConfigBase) mapperConfig2).a(javaType2.c) == null) {
                return new b(javaType2.c);
            }
        }
        c cVar = new c(mapperConfig, javaType, aVar);
        ArrayList arrayList = new ArrayList(8);
        if (javaType2.c != Object.class) {
            z = false;
        }
        if (!z) {
            if (javaType.M()) {
                c.d(javaType, arrayList, false);
            } else {
                c.e(javaType, arrayList, false);
            }
        }
        return new b(javaType, cVar.k, arrayList, cVar.l, cVar.g(arrayList), cVar.i, cVar.g, aVar, mapperConfig2.d.d, cVar.m);
    }

    public o d(MapperConfig<?> mapperConfig, JavaType javaType, k.a aVar, boolean z) {
        DefaultAccessorNamingStrategy.b bVar;
        b c2 = c(mapperConfig, javaType, aVar);
        if (javaType.R()) {
            Objects.requireNonNull((DefaultAccessorNamingStrategy.Provider) mapperConfig.d.Y1);
            bVar = new DefaultAccessorNamingStrategy.b(mapperConfig, c2);
        } else {
            DefaultAccessorNamingStrategy.Provider provider = (DefaultAccessorNamingStrategy.Provider) mapperConfig.d.Y1;
            bVar = new DefaultAccessorNamingStrategy(mapperConfig, c2, provider.c, provider.q, provider.x, provider.y);
        }
        return new o(mapperConfig, z, javaType, c2, bVar);
    }
}
