package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import i0.f.a.c.n.i;
import i0.f.a.c.n.j;
import i0.f.a.c.p.b;
import i0.f.a.c.p.c;
import i0.f.a.c.t.f;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {
    public final Map<String, Integer> d2;
    public final Map<BitSet, String> e2;

    public AsDeductionTypeDeserializer(JavaType javaType, c cVar, JavaType javaType2, DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        super(javaType, cVar, (String) null, false, javaType2, (JsonTypeInfo.As) null);
        this.d2 = new HashMap();
        boolean q = deserializationConfig.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap hashMap = new HashMap();
        int i = 0;
        for (NamedType next : collection) {
            List<j> h = ((i) deserializationConfig.C(deserializationConfig.d.d.m(next.c))).h();
            BitSet bitSet = new BitSet(h.size() + i);
            for (j name : h) {
                String name2 = name.getName();
                name2 = q ? name2.toLowerCase() : name2;
                Integer num = this.d2.get(name2);
                if (num == null) {
                    num = Integer.valueOf(i);
                    this.d2.put(name2, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(num.intValue());
            }
            String str = (String) hashMap.put(bitSet, next.c.getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", new Object[]{str, next.c.getName()}));
            }
        }
        this.e2 = hashMap;
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken i = jsonParser.i();
        if (i == JsonToken.START_OBJECT) {
            i = jsonParser.M0();
        } else if (i != JsonToken.FIELD_NAME) {
            return x(jsonParser, deserializationContext, (r) null, "Unexpected input");
        }
        LinkedList linkedList = new LinkedList(this.e2.keySet());
        r rVar = new r(jsonParser, deserializationContext);
        boolean e0 = deserializationContext.e0(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            if (e0) {
                f = f.toLowerCase();
            }
            rVar.i1(jsonParser);
            Integer num = this.d2.get(f);
            if (num != null) {
                int intValue = num.intValue();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((BitSet) it.next()).get(intValue)) {
                        it.remove();
                    }
                }
                if (linkedList.size() == 1) {
                    return w(jsonParser, deserializationContext, rVar, this.e2.get(linkedList.get(0)));
                }
            }
            i = jsonParser.M0();
        }
        return x(jsonParser, deserializationContext, rVar, String.format("Cannot deduce unique subtype of %s (%d candidates match)", new Object[]{f.t(this.d), Integer.valueOf(linkedList.size())}));
    }

    public b f(BeanProperty beanProperty) {
        return beanProperty == this.q ? this : new AsDeductionTypeDeserializer(this, beanProperty);
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.d2 = asDeductionTypeDeserializer.d2;
        this.e2 = asDeductionTypeDeserializer.e2;
    }
}
