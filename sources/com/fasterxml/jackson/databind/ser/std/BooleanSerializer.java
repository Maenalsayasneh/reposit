package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import java.io.IOException;

@a
public final class BooleanSerializer extends StdScalarSerializer<Object> implements d {
    public final boolean q;

    public static final class AsNumber extends StdScalarSerializer<Object> implements d {
        public final boolean q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class, false);
            this.q = z;
        }

        public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value m = m(iVar, beanProperty, Boolean.class);
            return (m == null || m.q.isNumeric()) ? this : new BooleanSerializer(this.q);
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            jsonGenerator.g0(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
            jsonGenerator.O(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this.q = z;
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value m = m(iVar, beanProperty, Boolean.class);
        return (m == null || !m.q.isNumeric()) ? this : new AsNumber(this.q);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.O(Boolean.TRUE.equals(obj));
    }

    public final void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        jsonGenerator.O(Boolean.TRUE.equals(obj));
    }
}
