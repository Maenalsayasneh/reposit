package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.l.m.g;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class PropertyBasedCreator {
    public final int a;
    public final ValueInstantiator b;
    public final HashMap<String, SettableBeanProperty> c;
    public final SettableBeanProperty[] d;

    public static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        public final Locale c;

        public CaseInsensitiveMap(Locale locale) {
            this.c = locale;
        }

        public Object get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase(this.c));
        }

        public Object put(Object obj, Object obj2) {
            return (SettableBeanProperty) super.put(((String) obj).toLowerCase(this.c), (SettableBeanProperty) obj2);
        }
    }

    public PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        AnnotatedMember a2;
        this.b = valueInstantiator;
        if (z) {
            this.c = new CaseInsensitiveMap(deserializationContext.q.d.c2);
        } else {
            this.c = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.a = length;
        this.d = new SettableBeanProperty[length];
        if (z2) {
            DeserializationConfig deserializationConfig = deserializationContext.q;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.F()) {
                    List<PropertyName> list = settableBeanProperty.d;
                    if (list == null) {
                        AnnotationIntrospector e = deserializationConfig.e();
                        if (!(e == null || (a2 = settableBeanProperty.a()) == null)) {
                            list = e.N(a2);
                        }
                        list = list == null ? Collections.emptyList() : list;
                        settableBeanProperty.d = list;
                    }
                    if (!list.isEmpty()) {
                        for (PropertyName propertyName : list) {
                            this.c.put(propertyName.q, settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.d[i] = settableBeanProperty2;
            if (!settableBeanProperty2.F()) {
                this.c.put(settableBeanProperty2.x.q, settableBeanProperty2);
            }
        }
    }

    public static PropertyBasedCreator b(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (!settableBeanProperty.A()) {
                settableBeanProperty = settableBeanProperty.T(deserializationContext.y(settableBeanProperty.y, settableBeanProperty));
            }
            settableBeanPropertyArr2[i] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }

    public Object a(DeserializationContext deserializationContext, g gVar) throws IOException {
        ValueInstantiator valueInstantiator = this.b;
        SettableBeanProperty[] settableBeanPropertyArr = this.d;
        Objects.requireNonNull(valueInstantiator);
        if (gVar.e > 0) {
            if (gVar.g != null) {
                int length = gVar.d.length;
                int i = 0;
                while (true) {
                    int nextClearBit = gVar.g.nextClearBit(i);
                    if (nextClearBit >= length) {
                        break;
                    }
                    gVar.d[nextClearBit] = gVar.a(settableBeanPropertyArr[nextClearBit]);
                    i = nextClearBit + 1;
                }
            } else {
                int i2 = gVar.f;
                int length2 = gVar.d.length;
                int i3 = 0;
                while (i3 < length2) {
                    if ((i2 & 1) == 0) {
                        gVar.d[i3] = gVar.a(settableBeanPropertyArr[i3]);
                    }
                    i3++;
                    i2 >>= 1;
                }
            }
        }
        if (gVar.b.d0(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            int i4 = 0;
            while (i4 < settableBeanPropertyArr.length) {
                if (gVar.d[i4] != null) {
                    i4++;
                } else {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    gVar.b.k0(settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", settableBeanProperty.x.q, Integer.valueOf(settableBeanPropertyArr[i4].p()));
                    throw null;
                }
            }
        }
        Object y = valueInstantiator.y(deserializationContext, gVar.d);
        if (y != null) {
            ObjectIdReader objectIdReader = gVar.c;
            if (objectIdReader != null) {
                Object obj = gVar.i;
                if (obj != null) {
                    deserializationContext.E(obj, objectIdReader.q, objectIdReader.x).b(y);
                    SettableBeanProperty settableBeanProperty2 = gVar.c.Y1;
                    if (settableBeanProperty2 != null) {
                        y = settableBeanProperty2.J(y, gVar.i);
                    }
                } else {
                    Objects.requireNonNull(deserializationContext);
                    deserializationContext.k0(objectIdReader.Y1, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{f.f(y), objectIdReader.d}), new Object[0]);
                    throw null;
                }
            }
            for (i0.f.a.c.l.m.f fVar = gVar.h; fVar != null; fVar = fVar.a) {
                fVar.a(y);
            }
        }
        return y;
    }

    public SettableBeanProperty c(String str) {
        return this.c.get(str);
    }
}
