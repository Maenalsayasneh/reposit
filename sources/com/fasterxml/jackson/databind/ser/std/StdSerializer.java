package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.r.f;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class StdSerializer<T> extends g<T> implements Serializable {
    public static final Object c = new Object();
    public final Class<T> d;

    public StdSerializer(Class<T> cls) {
        this.d = cls;
    }

    public static final boolean k(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public Class<T> c() {
        return this.d;
    }

    public g<?> l(i iVar, BeanProperty beanProperty, g<?> gVar) throws JsonMappingException {
        g<?> gVar2;
        AnnotatedMember a;
        Object c0;
        Object obj = c;
        Map map = (Map) iVar.Q(obj);
        if (map == null) {
            map = new IdentityHashMap();
            ContextAttributes.Impl impl = (ContextAttributes.Impl) iVar.Z1;
            Map<Object, Object> map2 = impl.x;
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(obj, map == null ? ContextAttributes.Impl.d : map);
                impl = new ContextAttributes.Impl(impl.q, hashMap);
            } else {
                map2.put(obj, map);
            }
            iVar.Z1 = impl;
        } else if (map.get(beanProperty) != null) {
            return gVar;
        }
        map.put(beanProperty, Boolean.TRUE);
        try {
            AnnotationIntrospector O = iVar.O();
            if (!k(O, beanProperty) || (a = beanProperty.a()) == null || (c0 = O.c0(a)) == null) {
                gVar2 = gVar;
            } else {
                i0.f.a.c.t.g<Object, Object> g = iVar.g(beanProperty.a(), c0);
                JavaType c2 = g.c(iVar.i());
                gVar2 = new StdDelegatingSerializer(g, c2, (gVar != null || c2.N()) ? gVar : iVar.J(c2));
            }
            if (gVar2 != null) {
                return iVar.U(gVar2, beanProperty);
            }
            map.remove(beanProperty);
            return gVar;
        } finally {
            map.remove(beanProperty);
        }
    }

    public JsonFormat.Value m(i iVar, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.e(iVar.q, cls);
        }
        return iVar.q.h(cls);
    }

    public f n(i iVar, Object obj, Object obj2) throws JsonMappingException {
        Objects.requireNonNull(iVar.q);
        Class<T> cls = this.d;
        iVar.p(cls, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        throw null;
    }

    public void p(i iVar, Throwable th, Object obj, int i) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        i0.f.a.c.t.f.I(th);
        boolean z = iVar == null || iVar.Y(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            i0.f.a.c.t.f.K(th);
        }
        throw JsonMappingException.i(th, obj, i);
    }

    public void q(i iVar, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        i0.f.a.c.t.f.I(th);
        boolean z = iVar == null || iVar.Y(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            i0.f.a.c.t.f.K(th);
        }
        throw JsonMappingException.k(th, obj, str);
    }

    public StdSerializer(JavaType javaType) {
        this.d = javaType.c;
    }

    public StdSerializer(Class<?> cls, boolean z) {
        this.d = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this.d = stdSerializer.d;
    }
}
