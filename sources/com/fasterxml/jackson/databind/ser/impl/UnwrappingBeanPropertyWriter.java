package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.b;
import java.io.Serializable;
import java.lang.reflect.Method;

public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    public final NameTransformer n2;

    public UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super((BeanPropertyWriter) unwrappingBeanPropertyWriter, serializedString);
        this.n2 = nameTransformer;
    }

    public g<Object> d(b bVar, Class<?> cls, i iVar) throws JsonMappingException {
        g<Object> gVar;
        JavaType javaType = this.a2;
        if (javaType != null) {
            gVar = iVar.M(iVar.y(javaType, cls), this);
        } else {
            gVar = iVar.N(cls, this);
        }
        NameTransformer nameTransformer = this.n2;
        if (gVar.e() && (gVar instanceof UnwrappingBeanSerializer)) {
            NameTransformer nameTransformer2 = ((UnwrappingBeanSerializer) gVar).e2;
            NameTransformer nameTransformer3 = NameTransformer.c;
            nameTransformer = new NameTransformer.Chained(nameTransformer, nameTransformer2);
        }
        g<Object> h = gVar.h(nameTransformer);
        this.i2 = this.i2.b(cls, h);
        return h;
    }

    public void k(g<Object> gVar) {
        if (gVar != null) {
            NameTransformer nameTransformer = this.n2;
            if (gVar.e() && (gVar instanceof UnwrappingBeanSerializer)) {
                NameTransformer nameTransformer2 = ((UnwrappingBeanSerializer) gVar).e2;
                NameTransformer nameTransformer3 = NameTransformer.c;
                nameTransformer = new NameTransformer.Chained(nameTransformer, nameTransformer2);
            }
            gVar = gVar.h(nameTransformer);
        }
        super.k(gVar);
    }

    public BeanPropertyWriter l(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, new NameTransformer.Chained(nameTransformer, this.n2), new SerializedString(nameTransformer.a(this.x.d)));
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
                if (BeanPropertyWriter.q == obj3) {
                    if (gVar.d(iVar, obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 != obj || !h(jsonGenerator, iVar, gVar)) {
                if (!gVar.e()) {
                    jsonGenerator.Z(this.x);
                }
                e eVar = this.h2;
                if (eVar == null) {
                    gVar.f(obj2, jsonGenerator, iVar);
                } else {
                    gVar.g(obj2, jsonGenerator, iVar, eVar);
                }
            }
        }
    }

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter, beanPropertyWriter.x);
        this.n2 = nameTransformer;
    }
}
