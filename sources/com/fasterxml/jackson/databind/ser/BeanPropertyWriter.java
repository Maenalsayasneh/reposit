package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.n.j;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.b;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@a
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public static final Object q = JsonInclude.Include.NON_EMPTY;
    public final JavaType Y1;
    public final JavaType Z1;
    public JavaType a2;
    public final transient i0.f.a.c.t.a b2;
    public final AnnotatedMember c2;
    public transient Method d2;
    public transient Field e2;
    public g<Object> f2;
    public g<Object> g2;
    public e h2;
    public transient b i2;
    public final boolean j2;
    public final Object k2;
    public final Class<?>[] l2;
    public transient HashMap<Object, Object> m2;
    public final SerializedString x;
    public final PropertyName y;

    public BeanPropertyWriter(j jVar, AnnotatedMember annotatedMember, i0.f.a.c.t.a aVar, JavaType javaType, g<?> gVar, e eVar, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(jVar);
        this.c2 = annotatedMember;
        this.b2 = aVar;
        this.x = new SerializedString(jVar.getName());
        this.y = jVar.C();
        this.Y1 = javaType;
        this.f2 = gVar;
        this.i2 = gVar == null ? b.C0122b.b : null;
        this.h2 = eVar;
        this.Z1 = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this.d2 = null;
            this.e2 = (Field) annotatedMember.k();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this.d2 = (Method) annotatedMember.k();
            this.e2 = null;
        } else {
            this.d2 = null;
            this.e2 = null;
        }
        this.j2 = z;
        this.k2 = obj;
        this.g2 = null;
        this.l2 = clsArr;
    }

    public AnnotatedMember a() {
        return this.c2;
    }

    public PropertyName b() {
        return new PropertyName(this.x.d);
    }

    public g<Object> d(b bVar, Class<?> cls, i iVar) throws JsonMappingException {
        b.d dVar;
        JavaType javaType = this.a2;
        if (javaType != null) {
            JavaType y2 = iVar.y(javaType, cls);
            g<Object> G = iVar.G(y2, this);
            dVar = new b.d(G, bVar.b(y2.c, G));
        } else {
            g<Object> H = iVar.H(cls, this);
            dVar = new b.d(H, bVar.b(cls, H));
        }
        b bVar2 = dVar.b;
        if (bVar != bVar2) {
            this.i2 = bVar2;
        }
        return dVar.a;
    }

    public String getName() {
        return this.x.d;
    }

    public JavaType getType() {
        return this.Y1;
    }

    public boolean h(JsonGenerator jsonGenerator, i iVar, g gVar) throws IOException {
        if (gVar.i()) {
            return false;
        }
        if (iVar.Y(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(gVar instanceof BeanSerializerBase)) {
                return false;
            }
            iVar.n(this.Y1, "Direct self-reference leading to cycle");
            throw null;
        } else if (!iVar.Y(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        } else {
            if (this.g2 == null) {
                return true;
            }
            if (!jsonGenerator.l().d()) {
                jsonGenerator.Z(this.x);
            }
            this.g2.f(null, jsonGenerator, iVar);
            return true;
        }
    }

    public void i(g<Object> gVar) {
        g<Object> gVar2 = this.g2;
        if (gVar2 == null || gVar2 == gVar) {
            this.g2 = gVar;
        } else {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{f.f(this.g2), f.f(gVar)}));
        }
    }

    public void k(g<Object> gVar) {
        g<Object> gVar2 = this.f2;
        if (gVar2 == null || gVar2 == gVar) {
            this.f2 = gVar;
        } else {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{f.f(this.f2), f.f(gVar)}));
        }
    }

    public BeanPropertyWriter l(NameTransformer nameTransformer) {
        String a = nameTransformer.a(this.x.d);
        if (a.equals(this.x.d)) {
            return this;
        }
        return new BeanPropertyWriter(this, PropertyName.a(a));
    }

    public void m(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Object obj2;
        Method method = this.d2;
        if (method == null) {
            obj2 = this.e2.get(obj);
        } else {
            obj2 = method.invoke(obj, (Object[]) null);
        }
        if (obj2 == null) {
            g<Object> gVar = this.g2;
            if (gVar != null) {
                gVar.f(null, jsonGenerator, iVar);
            } else {
                jsonGenerator.c0();
            }
        } else {
            g<Object> gVar2 = this.f2;
            if (gVar2 == null) {
                Class<?> cls = obj2.getClass();
                b bVar = this.i2;
                g<Object> c = bVar.c(cls);
                gVar2 = c == null ? d(bVar, cls, iVar) : c;
            }
            Object obj3 = this.k2;
            if (obj3 != null) {
                if (q == obj3) {
                    if (gVar2.d(iVar, obj2)) {
                        g<Object> gVar3 = this.g2;
                        if (gVar3 != null) {
                            gVar3.f(null, jsonGenerator, iVar);
                            return;
                        } else {
                            jsonGenerator.c0();
                            return;
                        }
                    }
                } else if (obj3.equals(obj2)) {
                    g<Object> gVar4 = this.g2;
                    if (gVar4 != null) {
                        gVar4.f(null, jsonGenerator, iVar);
                        return;
                    } else {
                        jsonGenerator.c0();
                        return;
                    }
                }
            }
            if (obj2 != obj || !h(jsonGenerator, iVar, gVar2)) {
                e eVar = this.h2;
                if (eVar == null) {
                    gVar2.f(obj2, jsonGenerator, iVar);
                } else {
                    gVar2.g(obj2, jsonGenerator, iVar, eVar);
                }
            }
        }
    }

    public void n(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Object obj2;
        Method method = this.d2;
        if (method == null) {
            obj2 = this.e2.get(obj);
        } else {
            obj2 = method.invoke(obj, (Object[]) null);
        }
        if (obj2 != null) {
            g<Object> gVar = this.f2;
            if (gVar == null) {
                Class<?> cls = obj2.getClass();
                b bVar = this.i2;
                g<Object> c = bVar.c(cls);
                gVar = c == null ? d(bVar, cls, iVar) : c;
            }
            Object obj3 = this.k2;
            if (obj3 != null) {
                if (q == obj3) {
                    if (gVar.d(iVar, obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 != obj || !h(jsonGenerator, iVar, gVar)) {
                jsonGenerator.Z(this.x);
                e eVar = this.h2;
                if (eVar == null) {
                    gVar.f(obj2, jsonGenerator, iVar);
                } else {
                    gVar.g(obj2, jsonGenerator, iVar, eVar);
                }
            }
        } else if (this.g2 != null) {
            jsonGenerator.Z(this.x);
            this.g2.f(null, jsonGenerator, iVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(this.x.d);
        sb.append("' (");
        if (this.d2 != null) {
            sb.append("via method ");
            sb.append(this.d2.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this.d2.getName());
        } else if (this.e2 != null) {
            sb.append("field \"");
            sb.append(this.e2.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this.e2.getName());
        } else {
            sb.append("virtual");
        }
        if (this.f2 == null) {
            sb.append(", no static serializer");
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0(", static serializer of type ");
            P0.append(this.f2.getClass().getName());
            sb.append(P0.toString());
        }
        sb.append(')');
        return sb.toString();
    }

    public BeanPropertyWriter() {
        super(PropertyMetadata.q);
        this.c2 = null;
        this.b2 = null;
        this.x = null;
        this.y = null;
        this.l2 = null;
        this.Y1 = null;
        this.f2 = null;
        this.i2 = null;
        this.h2 = null;
        this.Z1 = null;
        this.d2 = null;
        this.e2 = null;
        this.j2 = false;
        this.k2 = null;
        this.g2 = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super((PropertyWriter) beanPropertyWriter);
        this.x = new SerializedString(propertyName.q);
        this.y = beanPropertyWriter.y;
        this.b2 = beanPropertyWriter.b2;
        this.Y1 = beanPropertyWriter.Y1;
        this.c2 = beanPropertyWriter.c2;
        this.d2 = beanPropertyWriter.d2;
        this.e2 = beanPropertyWriter.e2;
        this.f2 = beanPropertyWriter.f2;
        this.g2 = beanPropertyWriter.g2;
        if (beanPropertyWriter.m2 != null) {
            this.m2 = new HashMap<>(beanPropertyWriter.m2);
        }
        this.Z1 = beanPropertyWriter.Z1;
        this.i2 = beanPropertyWriter.i2;
        this.j2 = beanPropertyWriter.j2;
        this.k2 = beanPropertyWriter.k2;
        this.l2 = beanPropertyWriter.l2;
        this.h2 = beanPropertyWriter.h2;
        this.a2 = beanPropertyWriter.a2;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super((PropertyWriter) beanPropertyWriter);
        this.x = serializedString;
        this.y = beanPropertyWriter.y;
        this.c2 = beanPropertyWriter.c2;
        this.b2 = beanPropertyWriter.b2;
        this.Y1 = beanPropertyWriter.Y1;
        this.d2 = beanPropertyWriter.d2;
        this.e2 = beanPropertyWriter.e2;
        this.f2 = beanPropertyWriter.f2;
        this.g2 = beanPropertyWriter.g2;
        if (beanPropertyWriter.m2 != null) {
            this.m2 = new HashMap<>(beanPropertyWriter.m2);
        }
        this.Z1 = beanPropertyWriter.Z1;
        this.i2 = beanPropertyWriter.i2;
        this.j2 = beanPropertyWriter.j2;
        this.k2 = beanPropertyWriter.k2;
        this.l2 = beanPropertyWriter.l2;
        this.h2 = beanPropertyWriter.h2;
        this.a2 = beanPropertyWriter.a2;
    }
}
