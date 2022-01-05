package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.n.j;
import i0.f.a.c.n.n;
import i0.f.a.c.p.b;
import i0.f.a.c.t.a;
import i0.f.a.c.t.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    public static final d<Object> q = new FailingDeserializer("No _valueDeserializer assigned");
    public final PropertyName Y1;
    public final transient a Z1;
    public final d<Object> a2;
    public final b b2;
    public final i c2;
    public String d2;
    public n e2;
    public ViewMatcher f2;
    public int g2;
    public final PropertyName x;
    public final JavaType y;

    public static abstract class Delegating extends SettableBeanProperty {
        public final SettableBeanProperty h2;

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.h2 = settableBeanProperty;
        }

        public boolean A() {
            return this.h2.A();
        }

        public boolean C() {
            return this.h2.C();
        }

        public boolean E() {
            return this.h2.E();
        }

        public boolean G() {
            return this.h2.G();
        }

        public void I(Object obj, Object obj2) throws IOException {
            this.h2.I(obj, obj2);
        }

        public Object J(Object obj, Object obj2) throws IOException {
            return this.h2.J(obj, obj2);
        }

        public boolean N(Class<?> cls) {
            return this.h2.N(cls);
        }

        public SettableBeanProperty O(PropertyName propertyName) {
            return U(this.h2.O(propertyName));
        }

        public SettableBeanProperty Q(i iVar) {
            return U(this.h2.Q(iVar));
        }

        public SettableBeanProperty T(d<?> dVar) {
            return U(this.h2.T(dVar));
        }

        public SettableBeanProperty U(SettableBeanProperty settableBeanProperty) {
            if (settableBeanProperty == this.h2) {
                return this;
            }
            return V(settableBeanProperty);
        }

        public abstract SettableBeanProperty V(SettableBeanProperty settableBeanProperty);

        public AnnotatedMember a() {
            return this.h2.a();
        }

        public void h(int i) {
            this.h2.h(i);
        }

        public void n(DeserializationConfig deserializationConfig) {
            this.h2.n(deserializationConfig);
        }

        public int p() {
            return this.h2.p();
        }

        public Class<?> q() {
            return this.h2.q();
        }

        public Object v() {
            return this.h2.v();
        }

        public String w() {
            return this.h2.w();
        }

        public n x() {
            return this.h2.x();
        }

        public d<Object> y() {
            return this.h2.y();
        }

        public b z() {
            return this.h2.z();
        }
    }

    public SettableBeanProperty(j jVar, JavaType javaType, b bVar, a aVar) {
        this(jVar.b(), javaType, jVar.C(), bVar, aVar, jVar.f());
    }

    public boolean A() {
        d<Object> dVar = this.a2;
        return (dVar == null || dVar == q) ? false : true;
    }

    public boolean C() {
        return this.b2 != null;
    }

    public boolean E() {
        return this.f2 != null;
    }

    public boolean F() {
        return false;
    }

    public boolean G() {
        return false;
    }

    public void H() {
    }

    public abstract void I(Object obj, Object obj2) throws IOException;

    public abstract Object J(Object obj, Object obj2) throws IOException;

    public void M(Class<?>[] clsArr) {
        ViewMatcher viewMatcher;
        if (clsArr == null) {
            this.f2 = null;
            return;
        }
        ViewMatcher viewMatcher2 = ViewMatcher.c;
        int length = clsArr.length;
        if (length == 0) {
            viewMatcher = ViewMatcher.c;
        } else if (length != 1) {
            viewMatcher = new ViewMatcher.Multi(clsArr);
        } else {
            viewMatcher = new ViewMatcher.Single(clsArr[0]);
        }
        this.f2 = viewMatcher;
    }

    public boolean N(Class<?> cls) {
        ViewMatcher viewMatcher = this.f2;
        return viewMatcher == null || viewMatcher.a(cls);
    }

    public abstract SettableBeanProperty O(PropertyName propertyName);

    public abstract SettableBeanProperty Q(i iVar);

    public SettableBeanProperty R(String str) {
        PropertyName propertyName;
        PropertyName propertyName2 = this.x;
        if (propertyName2 == null) {
            propertyName = new PropertyName(str);
        } else {
            propertyName = propertyName2.g(str);
        }
        return propertyName == this.x ? this : O(propertyName);
    }

    public abstract SettableBeanProperty T(d<?> dVar);

    public abstract AnnotatedMember a();

    public PropertyName b() {
        return this.x;
    }

    public void d(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String f = f.f(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(this.x.q);
            sb.append("' (expected type: ");
            sb.append(this.y);
            sb.append("; actual type: ");
            sb.append(f);
            sb.append(")");
            String j = f.j(exc);
            if (j != null) {
                sb.append(", problem: ");
                sb.append(j);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new JsonMappingException((Closeable) jsonParser, sb.toString(), (Throwable) exc);
        }
        f.J(exc);
        f.K(exc);
        Throwable s = f.s(exc);
        throw new JsonMappingException((Closeable) jsonParser, f.j(s), s);
    }

    public final String getName() {
        return this.x.q;
    }

    public JavaType getType() {
        return this.y;
    }

    public void h(int i) {
        if (this.g2 == -1) {
            this.g2 = i;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Property '");
        P0.append(this.x.q);
        P0.append("' already had index (");
        P0.append(this.g2);
        P0.append("), trying to assign ");
        P0.append(i);
        throw new IllegalStateException(P0.toString());
    }

    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return this.c2.b(deserializationContext);
        }
        b bVar = this.b2;
        if (bVar != null) {
            return this.a2.f(jsonParser, deserializationContext, bVar);
        }
        Object d = this.a2.d(jsonParser, deserializationContext);
        return d == null ? this.c2.b(deserializationContext) : d;
    }

    public abstract void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public final Object m(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            if (NullsConstantProvider.a(this.c2)) {
                return obj;
            }
            return this.c2.b(deserializationContext);
        } else if (this.b2 == null) {
            Object e = this.a2.e(jsonParser, deserializationContext, obj);
            if (e != null) {
                return e;
            }
            if (NullsConstantProvider.a(this.c2)) {
                return obj;
            }
            return this.c2.b(deserializationContext);
        } else {
            deserializationContext.n(this.y, String.format("Cannot merge polymorphic property '%s'", new Object[]{this.x.q}));
            throw null;
        }
    }

    public void n(DeserializationConfig deserializationConfig) {
    }

    public int p() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", new Object[]{this.x.q, getClass().getName()}));
    }

    public Class<?> q() {
        return a().h();
    }

    public String toString() {
        return i0.d.a.a.a.y0(i0.d.a.a.a.P0("[property '"), this.x.q, "']");
    }

    public Object v() {
        return null;
    }

    public String w() {
        return this.d2;
    }

    public n x() {
        return this.e2;
    }

    public d<Object> y() {
        d<Object> dVar = this.a2;
        if (dVar == q) {
            return null;
        }
        return dVar;
    }

    public b z() {
        return this.b2;
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, b bVar, a aVar, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this.g2 = -1;
        if (propertyName == null) {
            this.x = PropertyName.d;
        } else {
            this.x = propertyName.d();
        }
        this.y = javaType;
        this.Y1 = propertyName2;
        this.Z1 = aVar;
        this.f2 = null;
        this.b2 = bVar != null ? bVar.f(this) : bVar;
        d<Object> dVar = q;
        this.a2 = dVar;
        this.c2 = dVar;
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, d<Object> dVar) {
        super(propertyMetadata);
        this.g2 = -1;
        if (propertyName == null) {
            this.x = PropertyName.d;
        } else {
            this.x = propertyName.d();
        }
        this.y = javaType;
        this.Y1 = null;
        this.Z1 = null;
        this.f2 = null;
        this.b2 = null;
        this.a2 = dVar;
        this.c2 = dVar;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this.g2 = -1;
        this.x = settableBeanProperty.x;
        this.y = settableBeanProperty.y;
        this.Y1 = settableBeanProperty.Y1;
        this.Z1 = settableBeanProperty.Z1;
        this.a2 = settableBeanProperty.a2;
        this.b2 = settableBeanProperty.b2;
        this.d2 = settableBeanProperty.d2;
        this.g2 = settableBeanProperty.g2;
        this.f2 = settableBeanProperty.f2;
        this.c2 = settableBeanProperty.c2;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, d<?> dVar, i iVar) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this.g2 = -1;
        this.x = settableBeanProperty.x;
        this.y = settableBeanProperty.y;
        this.Y1 = settableBeanProperty.Y1;
        this.Z1 = settableBeanProperty.Z1;
        this.b2 = settableBeanProperty.b2;
        this.d2 = settableBeanProperty.d2;
        this.g2 = settableBeanProperty.g2;
        if (dVar == null) {
            this.a2 = q;
        } else {
            this.a2 = dVar;
        }
        this.f2 = settableBeanProperty.f2;
        this.c2 = iVar == q ? this.a2 : iVar;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this.g2 = -1;
        this.x = propertyName;
        this.y = settableBeanProperty.y;
        this.Y1 = settableBeanProperty.Y1;
        this.Z1 = settableBeanProperty.Z1;
        this.a2 = settableBeanProperty.a2;
        this.b2 = settableBeanProperty.b2;
        this.d2 = settableBeanProperty.d2;
        this.g2 = settableBeanProperty.g2;
        this.f2 = settableBeanProperty.f2;
        this.c2 = settableBeanProperty.c2;
    }
}
