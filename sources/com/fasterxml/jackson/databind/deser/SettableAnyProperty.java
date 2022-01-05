package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import i0.f.a.c.d;
import i0.f.a.c.h;
import i0.f.a.c.l.m.h;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class SettableAnyProperty implements Serializable {
    public final b Y1;
    public final h Z1;
    public final BeanProperty c;
    public final AnnotatedMember d;
    public final boolean q;
    public final JavaType x;
    public d<Object> y;

    public static class a extends h.a {
        public final SettableAnyProperty c;
        public final Object d;
        public final String e;

        public a(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.c = settableAnyProperty;
            this.d = obj;
            this.e = str;
        }

        public void a(Object obj, Object obj2) throws IOException {
            if (obj.equals(this.a.x.b.q)) {
                this.c.c(this.d, this.e, obj2);
                return;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Trying to resolve a forward reference with id [");
            P0.append(obj.toString());
            P0.append("] that wasn't previously registered.");
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, i0.f.a.c.h hVar, d<Object> dVar, b bVar) {
        this.c = beanProperty;
        this.d = annotatedMember;
        this.x = javaType;
        this.y = dVar;
        this.Y1 = bVar;
        this.Z1 = hVar;
        this.q = annotatedMember instanceof AnnotatedField;
    }

    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return this.y.b(deserializationContext);
        }
        b bVar = this.Y1;
        if (bVar != null) {
            return this.y.f(jsonParser, deserializationContext, bVar);
        }
        return this.y.d(jsonParser, deserializationContext);
    }

    public final void b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        Object obj2;
        try {
            i0.f.a.c.h hVar = this.Z1;
            if (hVar == null) {
                obj2 = str;
            } else {
                obj2 = hVar.a(str, deserializationContext);
            }
            c(obj, obj2, a(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this.y.m() != null) {
                e.x.a(new a(this, e, this.x.c, obj, str));
                return;
            }
            throw new JsonMappingException((Closeable) jsonParser, "Unresolved forward reference but no identity info.", (Throwable) e);
        }
    }

    public void c(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this.q) {
                Map map = (Map) ((AnnotatedField) this.d).l(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((AnnotatedMethod) this.d).x.invoke(obj, new Object[]{obj2, obj3});
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                String f = f.f(obj3);
                StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
                sb.append(obj2);
                StringBuilder P0 = i0.d.a.a.a.P0("' of class ");
                P0.append(this.d.h().getName());
                P0.append(" (expected type: ");
                sb.append(P0.toString());
                sb.append(this.x);
                sb.append("; actual type: ");
                sb.append(f);
                sb.append(")");
                String j = f.j(e);
                if (j != null) {
                    sb.append(", problem: ");
                    sb.append(j);
                } else {
                    sb.append(" (no error message provided)");
                }
                throw new JsonMappingException((Closeable) null, sb.toString(), (Throwable) e);
            }
            f.J(e);
            f.K(e);
            Throwable s = f.s(e);
            throw new JsonMappingException((Closeable) null, f.j(s), s);
        }
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("[any property on class ");
        P0.append(this.d.h().getName());
        P0.append("]");
        return P0.toString();
    }
}
