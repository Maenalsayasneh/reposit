package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import i0.d.a.a.a;
import i0.f.a.c.d;
import i0.f.a.c.p.b;
import i0.f.a.c.p.c;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TypeDeserializerBase extends b implements Serializable {
    public final boolean Y1;
    public final Map<String, d<Object>> Z1;
    public d<Object> a2;
    public final c c;
    public final JavaType d;
    public final BeanProperty q;
    public final JavaType x;
    public final String y;

    public TypeDeserializerBase(JavaType javaType, c cVar, String str, boolean z, JavaType javaType2) {
        this.d = javaType;
        this.c = cVar;
        Annotation[] annotationArr = f.a;
        this.y = str == null ? "" : str;
        this.Y1 = z;
        this.Z1 = new ConcurrentHashMap(16, 0.75f, 2);
        this.x = javaType2;
        this.q = null;
    }

    public Class<?> g() {
        return f.G(this.x);
    }

    public final String h() {
        return this.y;
    }

    public c i() {
        return this.c;
    }

    public boolean l() {
        return this.x != null;
    }

    public Object m(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return p(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj)).d(jsonParser, deserializationContext);
    }

    public final d<Object> n(DeserializationContext deserializationContext) throws IOException {
        d<Object> dVar;
        JavaType javaType = this.x;
        if (javaType == null) {
            if (!deserializationContext.d0(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return NullifyingDeserializer.x;
            }
            return null;
        } else if (f.v(javaType.c)) {
            return NullifyingDeserializer.x;
        } else {
            synchronized (this.x) {
                if (this.a2 == null) {
                    this.a2 = deserializationContext.y(this.x, this.q);
                }
                dVar = this.a2;
            }
            return dVar;
        }
    }

    public final d<Object> p(DeserializationContext deserializationContext, String str) throws IOException {
        String str2;
        d<Object> dVar = this.Z1.get(str);
        if (dVar == null) {
            JavaType d2 = this.c.d(deserializationContext, str);
            boolean z = true;
            if (d2 == null) {
                dVar = n(deserializationContext);
                if (dVar == null) {
                    String b = this.c.b();
                    if (b == null) {
                        str2 = "type ids are not statically known";
                    } else {
                        str2 = a.n0("known type ids = ", b);
                    }
                    BeanProperty beanProperty = this.q;
                    if (beanProperty != null) {
                        str2 = String.format("%s (for POJO property '%s')", new Object[]{str2, beanProperty.getName()});
                    }
                    deserializationContext.W(this.d, str, this.c, str2);
                    return NullifyingDeserializer.x;
                }
            } else {
                JavaType javaType = this.d;
                if (javaType != null && javaType.getClass() == d2.getClass() && !d2.y()) {
                    try {
                        JavaType javaType2 = this.d;
                        Class<?> cls = d2.c;
                        Objects.requireNonNull(deserializationContext);
                        if (javaType2.c != cls) {
                            z = false;
                        }
                        d2 = z ? javaType2 : deserializationContext.q.d.d.l(javaType2, cls, false);
                    } catch (IllegalArgumentException e) {
                        throw deserializationContext.k(this.d, str, e.getMessage());
                    }
                }
                dVar = deserializationContext.y(d2, this.q);
            }
            this.Z1.put(str, dVar);
        }
        return dVar;
    }

    public String q() {
        return this.d.c.getName();
    }

    public String toString() {
        StringBuilder N0 = a.N0('[');
        N0.append(getClass().getName());
        N0.append("; base-type:");
        N0.append(this.d);
        N0.append("; id-resolver: ");
        N0.append(this.c);
        N0.append(']');
        return N0.toString();
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this.d = typeDeserializerBase.d;
        this.c = typeDeserializerBase.c;
        this.y = typeDeserializerBase.y;
        this.Y1 = typeDeserializerBase.Y1;
        this.Z1 = typeDeserializerBase.Z1;
        this.x = typeDeserializerBase.x;
        this.a2 = typeDeserializerBase.a2;
        this.q = beanProperty;
    }
}
