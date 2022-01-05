package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.p.e;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    public AtomicReferenceSerializer(ReferenceType referenceType, boolean z, e eVar, g<Object> gVar) {
        super(referenceType, eVar, gVar);
    }

    public ReferenceTypeSerializer<AtomicReference<?>> w(Object obj, boolean z) {
        return new AtomicReferenceSerializer(this, this.y, this.Y1, this.Z1, this.a2, obj, z);
    }

    public ReferenceTypeSerializer<AtomicReference<?>> x(BeanProperty beanProperty, e eVar, g<?> gVar, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, eVar, gVar, nameTransformer, this.c2, this.d2);
    }

    public AtomicReferenceSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, NameTransformer nameTransformer, Object obj, boolean z) {
        super(atomicReferenceSerializer, beanProperty, eVar, gVar, nameTransformer, obj, z);
    }
}
