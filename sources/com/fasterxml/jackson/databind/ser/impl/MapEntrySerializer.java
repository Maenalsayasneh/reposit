package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import h0.b0.v;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.n.j;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.k.b;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@a
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements d {
    public static final Object q = JsonInclude.Include.NON_EMPTY;
    public final JavaType Y1;
    public final JavaType Z1;
    public final JavaType a2;
    public g<Object> b2;
    public g<Object> c2;
    public final e d2;
    public b e2;
    public final Object f2;
    public final boolean g2;
    public final BeanProperty x;
    public final boolean y;

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, e eVar, BeanProperty beanProperty) {
        super(javaType);
        this.Y1 = javaType;
        this.Z1 = javaType2;
        this.a2 = javaType3;
        this.y = z;
        this.d2 = eVar;
        this.x = beanProperty;
        this.e2 = b.C0122b.b;
        this.f2 = null;
        this.g2 = false;
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember annotatedMember;
        g gVar;
        g gVar2;
        g gVar3;
        boolean z;
        Object obj;
        JsonInclude.Value g;
        JsonInclude.Include include;
        boolean W;
        AnnotationIntrospector O = iVar.O();
        Object obj2 = null;
        if (beanProperty == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.a();
        }
        if (annotatedMember == null || O == null) {
            gVar2 = null;
            gVar = null;
        } else {
            Object y2 = O.y(annotatedMember);
            gVar = y2 != null ? iVar.c0(annotatedMember, y2) : null;
            Object d = O.d(annotatedMember);
            gVar2 = d != null ? iVar.c0(annotatedMember, d) : null;
        }
        if (gVar2 == null) {
            gVar2 = this.c2;
        }
        g l = l(iVar, beanProperty, gVar2);
        if (l == null && this.y && !this.a2.N()) {
            l = iVar.A(this.a2, beanProperty);
        }
        g gVar4 = l;
        if (gVar == null) {
            gVar = this.b2;
        }
        if (gVar == null) {
            gVar3 = iVar.E(this.Z1, beanProperty);
        } else {
            gVar3 = iVar.U(gVar, beanProperty);
        }
        g gVar5 = gVar3;
        Object obj3 = this.f2;
        boolean z2 = this.g2;
        if (beanProperty == null || (g = beanProperty.g(iVar.q, (Class<?>) null)) == null || (include = g.q) == JsonInclude.Include.USE_DEFAULTS) {
            obj = obj3;
            z = z2;
        } else {
            int ordinal = include.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        obj2 = q;
                    } else if (ordinal != 4) {
                        if (ordinal != 5) {
                            W = false;
                        } else {
                            obj2 = iVar.V((j) null, g.y);
                            if (obj2 != null) {
                                W = iVar.W(obj2);
                            }
                        }
                        z = W;
                        obj = obj2;
                    } else {
                        obj2 = v.k0(this.a2);
                        if (obj2 != null && obj2.getClass().isArray()) {
                            obj2 = i0.f.a.c.t.b.a(obj2);
                        }
                    }
                } else if (this.a2.d()) {
                    obj2 = q;
                }
            }
            obj = obj2;
            z = true;
        }
        return new MapEntrySerializer(this, gVar5, gVar4, obj, z);
    }

    public boolean d(i iVar, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.g2;
        }
        if (this.f2 != null) {
            g<Object> gVar = this.c2;
            if (gVar == null) {
                Class<?> cls = value.getClass();
                g<Object> c = this.e2.c(cls);
                if (c == null) {
                    try {
                        b bVar = this.e2;
                        BeanProperty beanProperty = this.x;
                        Objects.requireNonNull(bVar);
                        g<Object> C = iVar.C(cls, beanProperty);
                        b b = bVar.b(cls, C);
                        if (bVar != b) {
                            this.e2 = b;
                        }
                        gVar = C;
                    } catch (JsonMappingException unused) {
                    }
                } else {
                    gVar = c;
                }
            }
            Object obj2 = this.f2;
            if (obj2 == q) {
                return gVar.d(iVar, value);
            }
            return obj2.equals(value);
        }
        return false;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        jsonGenerator.N0(entry);
        w(entry, jsonGenerator, iVar);
        jsonGenerator.U();
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        jsonGenerator.w(entry);
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(entry, JsonToken.START_OBJECT));
        w(entry, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public ContainerSerializer<?> v(e eVar) {
        return new MapEntrySerializer(this, this.b2, this.c2, this.f2, this.g2);
    }

    public void w(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar;
        g<Object> gVar2;
        e eVar = this.d2;
        Object key = entry.getKey();
        if (key == null) {
            gVar = iVar.d2;
        } else {
            gVar = this.b2;
        }
        Object value = entry.getValue();
        if (value != null) {
            gVar2 = this.c2;
            if (gVar2 == null) {
                Class<?> cls = value.getClass();
                g<Object> c = this.e2.c(cls);
                if (c != null) {
                    gVar2 = c;
                } else if (this.a2.y()) {
                    b bVar = this.e2;
                    b.d a = bVar.a(iVar.y(this.a2, cls), iVar, this.x);
                    b bVar2 = a.b;
                    if (bVar != bVar2) {
                        this.e2 = bVar2;
                    }
                    gVar2 = a.a;
                } else {
                    b bVar3 = this.e2;
                    BeanProperty beanProperty = this.x;
                    Objects.requireNonNull(bVar3);
                    g<Object> C = iVar.C(cls, beanProperty);
                    b b = bVar3.b(cls, C);
                    if (bVar3 != b) {
                        this.e2 = b;
                    }
                    gVar2 = C;
                }
            }
            Object obj = this.f2;
            if (obj != null && ((obj == q && gVar2.d(iVar, value)) || this.f2.equals(value))) {
                return;
            }
        } else if (!this.g2) {
            gVar2 = iVar.c2;
        } else {
            return;
        }
        gVar.f(key, jsonGenerator, iVar);
        if (eVar == null) {
            try {
                gVar2.f(value, jsonGenerator, iVar);
            } catch (Exception e) {
                q(iVar, e, entry, "" + key);
                throw null;
            }
        } else {
            gVar2.g(value, jsonGenerator, iVar, eVar);
        }
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, g gVar, g gVar2, Object obj, boolean z) {
        super(Map.class, false);
        this.Y1 = mapEntrySerializer.Y1;
        this.Z1 = mapEntrySerializer.Z1;
        this.a2 = mapEntrySerializer.a2;
        this.y = mapEntrySerializer.y;
        this.d2 = mapEntrySerializer.d2;
        this.b2 = gVar;
        this.c2 = gVar2;
        this.e2 = b.C0122b.b;
        this.x = mapEntrySerializer.x;
        this.f2 = obj;
        this.g2 = z;
    }
}
