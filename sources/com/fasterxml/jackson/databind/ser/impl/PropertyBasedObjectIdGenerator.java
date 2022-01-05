package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import i0.d.a.a.a;
import i0.f.a.c.n.n;
import java.lang.reflect.Method;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    public final BeanPropertyWriter d;

    public PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this.d = beanPropertyWriter;
    }

    public boolean a(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() != PropertyBasedObjectIdGenerator.class) {
            return false;
        }
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
        if (propertyBasedObjectIdGenerator.c == this.c && propertyBasedObjectIdGenerator.d == this.d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object> b(java.lang.Class<?> r3) {
        /*
            r2 = this;
            java.lang.Class<?> r0 = r2.c
            if (r3 != r0) goto L_0x0006
            r0 = r2
            goto L_0x000d
        L_0x0006:
            com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator r0 = new com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r1 = r2.d
            r0.<init>((java.lang.Class<?>) r3, (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r1)
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator.b(java.lang.Class):com.fasterxml.jackson.annotation.ObjectIdGenerator");
    }

    public Object c(Object obj) {
        try {
            BeanPropertyWriter beanPropertyWriter = this.d;
            Method method = beanPropertyWriter.d2;
            if (method == null) {
                return beanPropertyWriter.e2.get(obj);
            }
            return method.invoke(obj, (Object[]) null);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder P0 = a.P0("Problem accessing property '");
            P0.append(this.d.x.d);
            P0.append("': ");
            P0.append(e2.getMessage());
            throw new IllegalStateException(P0.toString(), e2);
        }
    }

    public ObjectIdGenerator.IdKey e(Object obj) {
        return new ObjectIdGenerator.IdKey(PropertyBasedObjectIdGenerator.class, this.c, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object>] */
    public ObjectIdGenerator<Object> f(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(n nVar, BeanPropertyWriter beanPropertyWriter) {
        super(nVar.e);
        this.d = beanPropertyWriter;
    }
}
