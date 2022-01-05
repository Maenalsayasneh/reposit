package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import i0.d.a.a.a;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.n.j;
import i0.f.a.c.r.k.e;
import i0.f.a.c.t.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class DefaultSerializerProvider extends i implements Serializable {
    public transient Map<Object, e> h2;
    public transient ArrayList<ObjectIdGenerator<?>> i2;
    public transient JsonGenerator j2;

    public static final class Impl extends DefaultSerializerProvider {
        public Impl() {
        }

        public Impl(i iVar, SerializationConfig serializationConfig, i0.f.a.c.r.i iVar2) {
            super(iVar, serializationConfig, iVar2);
        }
    }

    public DefaultSerializerProvider() {
    }

    public e F(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        Map<Object, e> map;
        Map<Object, e> map2 = this.h2;
        if (map2 == null) {
            if (Y(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)) {
                map = new HashMap<>();
            } else {
                map = new IdentityHashMap<>();
            }
            this.h2 = map;
        } else {
            e eVar = map2.get(obj);
            if (eVar != null) {
                return eVar;
            }
        }
        ObjectIdGenerator<?> objectIdGenerator2 = null;
        ArrayList<ObjectIdGenerator<?>> arrayList = this.i2;
        if (arrayList != null) {
            int i = 0;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                ObjectIdGenerator<?> objectIdGenerator3 = this.i2.get(i);
                if (objectIdGenerator3.a(objectIdGenerator)) {
                    objectIdGenerator2 = objectIdGenerator3;
                    break;
                }
                i++;
            }
        } else {
            this.i2 = new ArrayList<>(8);
        }
        if (objectIdGenerator2 == null) {
            objectIdGenerator2 = objectIdGenerator.f(this);
            this.i2.add(objectIdGenerator2);
        }
        e eVar2 = new e(objectIdGenerator2);
        this.h2.put(obj, eVar2);
        return eVar2;
    }

    public Object V(j jVar, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Objects.requireNonNull(this.q.d);
        return f.i(cls, this.q.b());
    }

    public boolean W(Object obj) throws JsonMappingException {
        try {
            return obj.equals((Object) null);
        } catch (Throwable th) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(this.j2, String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[]{obj.getClass().getName(), th.getClass().getName(), f.j(th)}), f(obj.getClass()));
            invalidDefinitionException.initCause(th);
            throw invalidDefinitionException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Class<i0.f.a.c.g$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: i0.f.a.c.g<java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<java.lang.Object> c0(i0.f.a.c.n.a r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            boolean r0 = r4 instanceof i0.f.a.c.g
            if (r0 == 0) goto L_0x0007
            i0.f.a.c.g r4 = (i0.f.a.c.g) r4
            goto L_0x0035
        L_0x0007:
            boolean r0 = r4 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L_0x005f
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<i0.f.a.c.g$a> r0 = i0.f.a.c.g.a.class
            if (r4 == r0) goto L_0x005e
            boolean r0 = i0.f.a.c.t.f.v(r4)
            if (r0 == 0) goto L_0x0019
            goto L_0x005e
        L_0x0019:
            java.lang.Class<i0.f.a.c.g> r0 = i0.f.a.c.g.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L_0x0040
            com.fasterxml.jackson.databind.SerializationConfig r3 = r2.q
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r3.d
            java.util.Objects.requireNonNull(r3)
            com.fasterxml.jackson.databind.SerializationConfig r3 = r2.q
            boolean r3 = r3.b()
            java.lang.Object r3 = i0.f.a.c.t.f.i(r4, r3)
            r4 = r3
            i0.f.a.c.g r4 = (i0.f.a.c.g) r4
        L_0x0035:
            boolean r3 = r4 instanceof i0.f.a.c.r.g
            if (r3 == 0) goto L_0x003f
            r3 = r4
            i0.f.a.c.r.g r3 = (i0.f.a.c.r.g) r3
            r3.b(r2)
        L_0x003f:
            return r4
        L_0x0040:
            com.fasterxml.jackson.databind.JavaType r3 = r3.f()
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected Class<JsonSerializer>"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.n(r3, r4)
            throw r1
        L_0x005e:
            return r1
        L_0x005f:
            com.fasterxml.jackson.databind.JavaType r3 = r3.f()
            java.lang.String r0 = "AnnotationIntrospector returned serializer definition of type "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected type JsonSerializer or Class<JsonSerializer> instead"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.n(r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.c0(i0.f.a.c.n.a, java.lang.Object):i0.f.a.c.g");
    }

    public final void d0(JsonGenerator jsonGenerator, Object obj, g<Object> gVar) throws IOException {
        try {
            gVar.f(obj, jsonGenerator, this);
        } catch (Exception e) {
            throw g0(jsonGenerator, e);
        }
    }

    public final void e0(JsonGenerator jsonGenerator, Object obj, g<Object> gVar, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.M0();
            jsonGenerator.Z(propertyName.f(this.q));
            gVar.f(obj, jsonGenerator, this);
            jsonGenerator.U();
        } catch (Exception e) {
            throw g0(jsonGenerator, e);
        }
    }

    public void f0(JsonGenerator jsonGenerator) throws IOException {
        try {
            this.c2.f(null, jsonGenerator, this);
        } catch (Exception e) {
            throw g0(jsonGenerator, e);
        }
    }

    public final IOException g0(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String j = f.j(exc);
        if (j == null) {
            StringBuilder P0 = a.P0("[no message for ");
            P0.append(exc.getClass().getName());
            P0.append("]");
            j = P0.toString();
        }
        return new JsonMappingException((Closeable) jsonGenerator, j, (Throwable) exc);
    }

    public void h0(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this.j2 = jsonGenerator;
        if (obj == null) {
            f0(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        g<Object> I = I(cls, true, (BeanProperty) null);
        SerializationConfig serializationConfig = this.q;
        PropertyName propertyName = serializationConfig.a2;
        if (propertyName == null) {
            if (serializationConfig.E(SerializationFeature.WRAP_ROOT_VALUE)) {
                SerializationConfig serializationConfig2 = this.q;
                PropertyName propertyName2 = serializationConfig2.a2;
                if (propertyName2 == null) {
                    propertyName2 = serializationConfig2.d2.a(cls, serializationConfig2);
                }
                e0(jsonGenerator, obj, I, propertyName2);
                return;
            }
        } else if (!propertyName.e()) {
            e0(jsonGenerator, obj, I, propertyName);
            return;
        }
        d0(jsonGenerator, obj, I);
    }

    public DefaultSerializerProvider(i iVar, SerializationConfig serializationConfig, i0.f.a.c.r.i iVar2) {
        super(iVar, serializationConfig, iVar2);
    }
}
