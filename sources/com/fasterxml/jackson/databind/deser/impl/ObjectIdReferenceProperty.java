package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.l.m.h;
import i0.f.a.c.n.n;
import java.io.Closeable;
import java.io.IOException;

public class ObjectIdReferenceProperty extends SettableBeanProperty {
    public final SettableBeanProperty h2;

    public static final class a extends h.a {
        public final ObjectIdReferenceProperty c;
        public final Object d;

        public a(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.c = objectIdReferenceProperty;
            this.d = obj;
        }

        public void a(Object obj, Object obj2) throws IOException {
            if (obj.equals(this.a.x.b.q)) {
                ObjectIdReferenceProperty objectIdReferenceProperty = this.c;
                objectIdReferenceProperty.h2.I(this.d, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, n nVar) {
        super(settableBeanProperty);
        this.h2 = settableBeanProperty;
        this.e2 = nVar;
    }

    public void I(Object obj, Object obj2) throws IOException {
        this.h2.I(obj, obj2);
    }

    public Object J(Object obj, Object obj2) throws IOException {
        return this.h2.J(obj, obj2);
    }

    public SettableBeanProperty O(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    public SettableBeanProperty Q(i iVar) {
        return new ObjectIdReferenceProperty(this, this.a2, iVar);
    }

    public SettableBeanProperty T(d<?> dVar) {
        d<Object> dVar2 = this.a2;
        if (dVar2 == dVar) {
            return this;
        }
        i iVar = this.c2;
        if (dVar2 == iVar) {
            iVar = dVar;
        }
        return new ObjectIdReferenceProperty(this, dVar, iVar);
    }

    public AnnotatedMember a() {
        return this.h2.a();
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        l(jsonParser, deserializationContext, obj);
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return this.h2.J(obj, i(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if ((this.e2 == null && this.a2.m() == null) ? false : true) {
                e.x.a(new a(this, e, this.y.c, obj));
                return null;
            }
            throw new JsonMappingException((Closeable) jsonParser, "Unresolved forward reference but no identity info", (Throwable) e);
        }
    }

    public void n(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.h2;
        if (settableBeanProperty != null) {
            settableBeanProperty.n(deserializationConfig);
        }
    }

    public int p() {
        return this.h2.p();
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, d<?> dVar, i iVar) {
        super(objectIdReferenceProperty, dVar, iVar);
        this.h2 = objectIdReferenceProperty.h2;
        this.e2 = objectIdReferenceProperty.e2;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this.h2 = objectIdReferenceProperty.h2;
        this.e2 = objectIdReferenceProperty.e2;
    }
}
