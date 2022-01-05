package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    public final boolean Y1;
    public final Boolean Z1;
    public final JavaType x;
    public final i y;

    public ContainerDeserializerBase(JavaType javaType, i iVar, Boolean bool) {
        super(javaType);
        this.x = javaType;
        this.Z1 = bool;
        this.y = iVar;
        this.Y1 = NullsConstantProvider.a(iVar);
    }

    public SettableBeanProperty h(String str) {
        d<Object> y0 = y0();
        if (y0 != null) {
            return y0.h(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, getClass().getName()}));
    }

    public AccessPattern i() {
        return AccessPattern.DYNAMIC;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator u02 = u0();
        if (u02 == null || !u02.k()) {
            JavaType v02 = v0();
            deserializationContext.n(v02, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{v02}));
            throw null;
        }
        try {
            return u02.C(deserializationContext);
        } catch (IOException e) {
            f.H(deserializationContext, e);
            throw null;
        }
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public JavaType v0() {
        return this.x;
    }

    public abstract d<Object> y0();

    public <BOGUS> BOGUS z0(DeserializationContext deserializationContext, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        f.I(th);
        if (deserializationContext != null && !deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS)) {
            f.K(th);
        }
        if (!(th instanceof IOException) || (th instanceof JsonMappingException)) {
            if (str == null) {
                str = "N/A";
            }
            throw JsonMappingException.k(th, obj, str);
        }
        throw ((IOException) th);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, i iVar, Boolean bool) {
        super(containerDeserializerBase.x);
        this.x = containerDeserializerBase.x;
        this.y = iVar;
        this.Z1 = bool;
        this.Y1 = NullsConstantProvider.a(iVar);
    }
}
