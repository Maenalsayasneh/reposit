package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.b;
import i0.f.a.c.d;
import i0.f.a.c.l.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.m.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends d<Object> implements c, Serializable {
    public final boolean Y1;
    public final boolean Z1;
    public final boolean a2;
    public final JavaType c;
    public final ObjectIdReader d;
    public final Map<String, SettableBeanProperty> q;
    public transient Map<String, SettableBeanProperty> x;
    public final boolean y;

    public AbstractDeserializer(a aVar, b bVar, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType javaType = bVar.a;
        this.c = javaType;
        this.d = aVar.j;
        this.q = map;
        this.x = map2;
        Class<?> cls = javaType.c;
        this.y = cls.isAssignableFrom(String.class);
        boolean z = false;
        this.Y1 = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.Z1 = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        this.a2 = (cls == Double.TYPE || cls.isAssignableFrom(Double.class)) ? true : z;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r12, com.fasterxml.jackson.databind.BeanProperty r13) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r11 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r12.G()
            r1 = 0
            if (r13 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r13 = r13.a()
            if (r13 == 0) goto L_0x008c
            i0.f.a.c.n.n r2 = r0.G(r13)
            if (r2 == 0) goto L_0x008c
            i0.f.a.a.z r3 = r12.m(r13, r2)
            i0.f.a.c.n.n r0 = r0.H(r13, r2)
            java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r2 = r0.c
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator> r4 = com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator.class
            r5 = 0
            if (r2 != r4) goto L_0x0060
            com.fasterxml.jackson.databind.PropertyName r13 = r0.b
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r2 = r11.x
            if (r2 != 0) goto L_0x002c
            r2 = r1
            goto L_0x0034
        L_0x002c:
            java.lang.String r4 = r13.q
            java.lang.Object r2 = r2.get(r4)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r2
        L_0x0034:
            if (r2 == 0) goto L_0x0042
            com.fasterxml.jackson.databind.JavaType r13 = r2.y
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator r4 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator
            java.lang.Class<?> r5 = r0.e
            r4.<init>(r5)
            r5 = r13
            r9 = r2
            goto L_0x007a
        L_0x0042:
            com.fasterxml.jackson.databind.JavaType r0 = r11.c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class<?> r3 = r0.c
            java.lang.String r3 = i0.f.a.c.t.f.E(r3)
            r2[r5] = r3
            r3 = 1
            java.lang.String r13 = i0.f.a.c.t.f.C(r13)
            r2[r3] = r13
            java.lang.String r13 = "Invalid Object Id definition for %s: cannot find property with name %s"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            r12.n(r0, r13)
            throw r1
        L_0x0060:
            i0.f.a.a.z r3 = r12.m(r13, r0)
            com.fasterxml.jackson.databind.JavaType r2 = r12.q(r2)
            com.fasterxml.jackson.databind.type.TypeFactory r4 = r12.i()
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerator> r6 = com.fasterxml.jackson.annotation.ObjectIdGenerator.class
            com.fasterxml.jackson.databind.JavaType[] r2 = r4.p(r2, r6)
            r2 = r2[r5]
            com.fasterxml.jackson.annotation.ObjectIdGenerator r4 = r12.l(r13, r0)
            r9 = r1
            r5 = r2
        L_0x007a:
            r10 = r3
            r7 = r4
            i0.f.a.c.d r8 = r12.F(r5)
            com.fasterxml.jackson.databind.PropertyName r6 = r0.b
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r12 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.a(r5, r6, r7, r8, r9, r10)
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r13 = new com.fasterxml.jackson.databind.deser.AbstractDeserializer
            r13.<init>(r11, r12, r1)
            return r13
        L_0x008c:
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r12 = r11.x
            if (r12 != 0) goto L_0x0091
            return r11
        L_0x0091:
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r12 = new com.fasterxml.jackson.databind.deser.AbstractDeserializer
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r13 = r11.d
            r12.<init>(r11, r13, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        DeserializationContext deserializationContext2 = deserializationContext;
        deserializationContext2.O(this.c.c, new ValueInstantiator.Base(this.c), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, i0.f.a.c.p.b r5) throws java.io.IOException {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r2.d
            if (r0 == 0) goto L_0x0026
            com.fasterxml.jackson.core.JsonToken r0 = r3.i()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r0.isScalarValue()
            if (r1 == 0) goto L_0x0015
            java.lang.Object r3 = r2.x(r3, r4)
            return r3
        L_0x0015:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r1) goto L_0x001d
            com.fasterxml.jackson.core.JsonToken r0 = r3.M0()
        L_0x001d:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r1) goto L_0x0026
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r2.d
            r0.b()
        L_0x0026:
            int r0 = r3.k()
            switch(r0) {
                case 6: goto L_0x0056;
                case 7: goto L_0x0049;
                case 8: goto L_0x003c;
                case 9: goto L_0x0035;
                case 10: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x005f
        L_0x002e:
            boolean r0 = r2.Y1
            if (r0 == 0) goto L_0x005f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0060
        L_0x0035:
            boolean r0 = r2.Y1
            if (r0 == 0) goto L_0x005f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0060
        L_0x003c:
            boolean r0 = r2.a2
            if (r0 == 0) goto L_0x005f
            double r0 = r3.F()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x0060
        L_0x0049:
            boolean r0 = r2.Z1
            if (r0 == 0) goto L_0x005f
            int r0 = r3.I()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0060
        L_0x0056:
            boolean r0 = r2.y
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r3.Z()
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r0 == 0) goto L_0x0063
            return r0
        L_0x0063:
            java.lang.Object r3 = r5.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.p.b):java.lang.Object");
    }

    public SettableBeanProperty h(String str) {
        Map<String, SettableBeanProperty> map = this.q;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public ObjectIdReader m() {
        return this.d;
    }

    public Class<?> n() {
        return this.c.c;
    }

    public LogicalType q() {
        return LogicalType.POJO;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return null;
    }

    public Object x(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object d2 = this.d.y.d(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.d;
        h E = deserializationContext.E(d2, objectIdReader.q, objectIdReader.x);
        Object d3 = E.d.d(E.b);
        E.a = d3;
        if (d3 != null) {
            return d3;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + d2 + "] -- unresolved forward-reference?", jsonParser.w(), E);
    }

    public AbstractDeserializer(b bVar) {
        JavaType javaType = bVar.a;
        this.c = javaType;
        this.d = null;
        this.q = null;
        Class<?> cls = javaType.c;
        this.y = cls.isAssignableFrom(String.class);
        boolean z = false;
        this.Y1 = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.Z1 = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        this.a2 = (cls == Double.TYPE || cls.isAssignableFrom(Double.class)) ? true : z;
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this.c = abstractDeserializer.c;
        this.q = abstractDeserializer.q;
        this.y = abstractDeserializer.y;
        this.Y1 = abstractDeserializer.Y1;
        this.Z1 = abstractDeserializer.Z1;
        this.a2 = abstractDeserializer.a2;
        this.d = objectIdReader;
        this.x = null;
    }
}
