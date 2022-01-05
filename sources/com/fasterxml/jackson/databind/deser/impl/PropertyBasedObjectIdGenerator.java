package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    public PropertyBasedObjectIdGenerator(Class<?> cls) {
        super(cls);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object> b(java.lang.Class<?> r2) {
        /*
            r1 = this;
            java.lang.Class<?> r0 = r1.c
            if (r2 != r0) goto L_0x0006
            r0 = r1
            goto L_0x000b
        L_0x0006:
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator r0 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator
            r0.<init>(r2)
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator.b(java.lang.Class):com.fasterxml.jackson.annotation.ObjectIdGenerator");
    }

    public Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ObjectIdGenerator.IdKey e(Object obj) {
        return new ObjectIdGenerator.IdKey(PropertyBasedObjectIdGenerator.class, this.c, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerator<java.lang.Object>] */
    public ObjectIdGenerator<Object> f(Object obj) {
        return this;
    }
}
