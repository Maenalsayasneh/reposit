package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import i0.f.a.c.t.a;
import i0.f.a.c.t.f;
import java.io.IOException;

public class CreatorProperty extends SettableBeanProperty {
    public final AnnotatedParameter h2;
    public final JacksonInject.Value i2;
    public SettableBeanProperty j2;
    public final int k2;
    public boolean l2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, b bVar, a aVar, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, bVar, aVar, propertyMetadata);
        this.h2 = annotatedParameter;
        this.k2 = i;
        this.i2 = value;
        this.j2 = null;
    }

    public static CreatorProperty V(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, b bVar, a aVar, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        return new CreatorProperty(propertyName, javaType, (PropertyName) null, bVar, aVar, annotatedParameter, i, value, propertyMetadata);
    }

    public boolean F() {
        return this.l2;
    }

    public boolean G() {
        JacksonInject.Value value = this.i2;
        if (value != null) {
            Boolean bool = value.q;
            if (!(bool == null ? true : bool.booleanValue())) {
                return true;
            }
        }
        return false;
    }

    public void H() {
        this.l2 = true;
    }

    public void I(Object obj, Object obj2) throws IOException {
        U();
        this.j2.I(obj, obj2);
    }

    public Object J(Object obj, Object obj2) throws IOException {
        U();
        return this.j2.J(obj, obj2);
    }

    public SettableBeanProperty O(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    public SettableBeanProperty Q(i iVar) {
        return new CreatorProperty(this, this.a2, iVar);
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
        return new CreatorProperty(this, dVar, iVar);
    }

    public final void U() throws IOException {
        if (this.j2 == null) {
            StringBuilder P0 = i0.d.a.a.a.P0("No fallback setter/field defined for creator property ");
            P0.append(f.D(this.x.q));
            throw new InvalidDefinitionException((JsonParser) null, P0.toString(), this.y);
        }
    }

    public AnnotatedMember a() {
        return this.h2;
    }

    public PropertyMetadata f() {
        PropertyMetadata propertyMetadata = this.c;
        SettableBeanProperty settableBeanProperty = this.j2;
        return settableBeanProperty != null ? propertyMetadata.b(settableBeanProperty.f().a2) : propertyMetadata;
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        U();
        this.j2.I(obj, i(jsonParser, deserializationContext));
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        U();
        return this.j2.J(obj, i(jsonParser, deserializationContext));
    }

    public void n(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.j2;
        if (settableBeanProperty != null) {
            settableBeanProperty.n(deserializationConfig);
        }
    }

    public int p() {
        return this.k2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("[creator property, name ");
        P0.append(f.D(this.x.q));
        P0.append("; inject id '");
        P0.append(v());
        P0.append("']");
        return P0.toString();
    }

    public Object v() {
        JacksonInject.Value value = this.i2;
        if (value == null) {
            return null;
        }
        return value.d;
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this.h2 = creatorProperty.h2;
        this.i2 = creatorProperty.i2;
        this.j2 = creatorProperty.j2;
        this.k2 = creatorProperty.k2;
        this.l2 = creatorProperty.l2;
    }

    public CreatorProperty(CreatorProperty creatorProperty, d<?> dVar, i iVar) {
        super(creatorProperty, dVar, iVar);
        this.h2 = creatorProperty.h2;
        this.i2 = creatorProperty.i2;
        this.j2 = creatorProperty.j2;
        this.k2 = creatorProperty.k2;
        this.l2 = creatorProperty.l2;
    }
}
