package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.n.k;
import i0.f.a.c.p.d;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class BaseSettings implements Serializable {
    public static final TimeZone c = DesugarTimeZone.getTimeZone("UTC");
    public final AccessorNamingStrategy.Provider Y1;
    public final d<?> Z1;
    public final PolymorphicTypeValidator a2;
    public final DateFormat b2;
    public final Locale c2;
    public final TypeFactory d;
    public final TimeZone d2;
    public final Base64Variant e2;
    public final k q;
    public final AnnotationIntrospector x;
    public final PropertyNamingStrategy y;

    public BaseSettings(k kVar, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, d dVar, DateFormat dateFormat, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, AccessorNamingStrategy.Provider provider) {
        this.q = kVar;
        this.x = annotationIntrospector;
        this.y = propertyNamingStrategy;
        this.d = typeFactory;
        this.Z1 = dVar;
        this.b2 = dateFormat;
        this.c2 = locale;
        this.d2 = timeZone;
        this.e2 = base64Variant;
        this.a2 = polymorphicTypeValidator;
        this.Y1 = provider;
    }
}
