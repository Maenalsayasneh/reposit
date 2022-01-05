package com.fasterxml.jackson.annotation;

public abstract class ObjectIdGenerators$PropertyGenerator {
    public final Class<?> c;

    public ObjectIdGenerators$PropertyGenerator(Class<?> cls) {
        this.c = cls;
    }

    public boolean a(ObjectIdGenerator objectIdGenerator) {
        return objectIdGenerator.getClass() == getClass() && objectIdGenerator.d() == this.c;
    }

    public final Class d() {
        return this.c;
    }
}
