package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.k.b;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.util.Objects;

@i0.f.a.c.j.a
public class JsonValueSerializer extends StdSerializer<Object> implements d {
    public final BeanProperty Y1;
    public final JavaType Z1;
    public final boolean a2;
    public transient b b2;
    public final AnnotatedMember q;
    public final e x;
    public final g<Object> y;

    public static class a extends e {
        public final e a;
        public final Object b;

        public a(e eVar, Object obj) {
            this.a = eVar;
            this.b = obj;
        }

        public e a(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        public String b() {
            return this.a.b();
        }

        public JsonTypeInfo.As c() {
            return this.a.c();
        }

        public WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.a = this.b;
            return this.a.e(jsonGenerator, writableTypeId);
        }

        public WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.a.f(jsonGenerator, writableTypeId);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsonValueSerializer(com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2, com.fasterxml.jackson.databind.BeanProperty r3, i0.f.a.c.p.e r4, i0.f.a.c.g<?> r5, boolean r6) {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r2.d
            if (r0 != 0) goto L_0x0006
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L_0x0006:
            r1.<init>(r0)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r2.q
            r1.q = r0
            com.fasterxml.jackson.databind.JavaType r2 = r2.Z1
            r1.Z1 = r2
            r1.x = r4
            r1.y = r5
            r1.Y1 = r3
            r1.a2 = r6
            i0.f.a.c.r.k.b$b r2 = i0.f.a.c.r.k.b.C0122b.b
            r1.b2 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.<init>(com.fasterxml.jackson.databind.ser.std.JsonValueSerializer, com.fasterxml.jackson.databind.BeanProperty, i0.f.a.c.p.e, i0.f.a.c.g, boolean):void");
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        e eVar = this.x;
        if (eVar != null) {
            eVar = eVar.a(beanProperty);
        }
        g<Object> gVar = this.y;
        if (gVar != null) {
            return w(beanProperty, eVar, iVar.T(gVar, beanProperty), this.a2);
        }
        if (!iVar.X(MapperFeature.USE_STATIC_TYPING) && !this.Z1.J()) {
            return beanProperty != this.Y1 ? w(beanProperty, eVar, gVar, this.a2) : this;
        }
        g<Object> G = iVar.G(this.Z1, beanProperty);
        Class<?> cls = this.Z1.c;
        boolean z = false;
        if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
            z = f.y(G);
        }
        return w(beanProperty, eVar, G, z);
    }

    public boolean d(i iVar, Object obj) {
        Object l = this.q.l(obj);
        if (l == null) {
            return true;
        }
        g<Object> gVar = this.y;
        if (gVar == null) {
            try {
                gVar = v(iVar, l.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return gVar.d(iVar, l);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        try {
            Object l = this.q.l(obj);
            if (l == null) {
                iVar.z(jsonGenerator);
                return;
            }
            g<Object> gVar = this.y;
            if (gVar == null) {
                gVar = v(iVar, l.getClass());
            }
            e eVar = this.x;
            if (eVar != null) {
                gVar.g(l, jsonGenerator, iVar, eVar);
            } else {
                gVar.f(l, jsonGenerator, iVar);
            }
        } catch (Exception e) {
            q(iVar, e, obj, this.q.d() + "()");
            throw null;
        }
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        try {
            Object l = this.q.l(obj);
            if (l == null) {
                iVar.z(jsonGenerator);
                return;
            }
            g<Object> gVar = this.y;
            if (gVar == null) {
                gVar = v(iVar, l.getClass());
            } else if (this.a2) {
                WritableTypeId e = eVar.e(jsonGenerator, eVar.d(obj, JsonToken.VALUE_STRING));
                gVar.f(l, jsonGenerator, iVar);
                eVar.f(jsonGenerator, e);
                return;
            }
            gVar.g(l, jsonGenerator, iVar, new a(eVar, obj));
        } catch (Exception e2) {
            q(iVar, e2, obj, this.q.d() + "()");
            throw null;
        }
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("(@JsonValue serializer for method ");
        P0.append(this.q.h());
        P0.append("#");
        P0.append(this.q.d());
        P0.append(")");
        return P0.toString();
    }

    public g<Object> v(i iVar, Class<?> cls) throws JsonMappingException {
        g<Object> c = this.b2.c(cls);
        if (c != null) {
            return c;
        }
        if (this.Z1.y()) {
            JavaType y2 = iVar.y(this.Z1, cls);
            g<Object> G = iVar.G(y2, this.Y1);
            b bVar = this.b2;
            Objects.requireNonNull(bVar);
            this.b2 = bVar.b(y2.c, G);
            return G;
        }
        g<Object> H = iVar.H(cls, this.Y1);
        this.b2 = this.b2.b(cls, H);
        return H;
    }

    public JsonValueSerializer w(BeanProperty beanProperty, e eVar, g<?> gVar, boolean z) {
        if (this.Y1 == beanProperty && this.x == eVar && this.y == gVar && z == this.a2) {
            return this;
        }
        return new JsonValueSerializer(this, beanProperty, eVar, gVar, z);
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, e eVar, g<?> gVar) {
        super(annotatedMember.f());
        this.q = annotatedMember;
        this.Z1 = annotatedMember.f();
        this.x = eVar;
        this.y = gVar;
        this.Y1 = null;
        this.a2 = true;
        this.b2 = b.C0122b.b;
    }
}
