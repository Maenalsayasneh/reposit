package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.g;
import i0.f.a.c.s.a;
import i0.f.a.c.t.f;
import java.io.IOException;

public class StdDelegatingSerializer extends StdSerializer<Object> implements d, g {
    public final i0.f.a.c.t.g<Object, ?> q;
    public final JavaType x;
    public final i0.f.a.c.g<Object> y;

    public StdDelegatingSerializer(i0.f.a.c.t.g<Object, ?> gVar, JavaType javaType, i0.f.a.c.g<?> gVar2) {
        super(javaType);
        this.q = gVar;
        this.x = javaType;
        this.y = gVar2;
    }

    public i0.f.a.c.g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        i0.f.a.c.g gVar = this.y;
        JavaType javaType = this.x;
        if (gVar == null) {
            if (javaType == null) {
                javaType = this.q.c(iVar.i());
            }
            if (!javaType.N()) {
                gVar = iVar.J(javaType);
            }
        }
        if (gVar instanceof d) {
            gVar = iVar.U(gVar, beanProperty);
        }
        if (gVar == this.y && javaType == this.x) {
            return this;
        }
        i0.f.a.c.t.g<Object, ?> gVar2 = this.q;
        f.M(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(gVar2, javaType, gVar);
    }

    public void b(i iVar) throws JsonMappingException {
        i0.f.a.c.g<Object> gVar = this.y;
        if (gVar != null && (gVar instanceof g)) {
            ((g) gVar).b(iVar);
        }
    }

    public boolean d(i iVar, Object obj) {
        Object a = this.q.a(obj);
        if (a == null) {
            return true;
        }
        i0.f.a.c.g<Object> gVar = this.y;
        if (gVar != null) {
            return gVar.d(iVar, a);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Object a = this.q.a(obj);
        if (a == null) {
            iVar.z(jsonGenerator);
            return;
        }
        i0.f.a.c.g<Object> gVar = this.y;
        if (gVar == null) {
            gVar = v(a, iVar);
        }
        gVar.f(a, jsonGenerator, iVar);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Object a = this.q.a(obj);
        i0.f.a.c.g<Object> gVar = this.y;
        if (gVar == null) {
            gVar = v(obj, iVar);
        }
        gVar.g(a, jsonGenerator, iVar, eVar);
    }

    public i0.f.a.c.g<Object> v(Object obj, i iVar) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        i0.f.a.c.g<Object> b = iVar.e2.b(cls);
        if (b != null) {
            return b;
        }
        i0.f.a.c.g<Object> b2 = iVar.Y1.b(cls);
        if (b2 != null) {
            return b2;
        }
        i0.f.a.c.g<Object> a = iVar.Y1.a(iVar.q.d.d.b((a) null, cls, TypeFactory.q));
        if (a != null) {
            return a;
        }
        i0.f.a.c.g<Object> v = iVar.v(cls);
        return v == null ? iVar.R(cls) : v;
    }
}
