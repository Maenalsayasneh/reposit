package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.f.a.c.d;
import java.io.IOException;
import java.util.Set;

public class ThrowableDeserializer extends BeanDeserializer {
    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this.e2 = false;
    }

    public Object X0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        if (this.c2 != null) {
            return z0(jsonParser, deserializationContext);
        }
        d<Object> dVar = this.a2;
        if (dVar != null) {
            return this.Z1.E(deserializationContext, dVar.d(jsonParser, deserializationContext));
        }
        if (!this.y.C()) {
            boolean h = this.Z1.h();
            boolean k = this.Z1.k();
            if (h || k) {
                int i = 0;
                Object obj2 = null;
                Object[] objArr = null;
                while (!jsonParser.y0(JsonToken.END_OBJECT)) {
                    String f = jsonParser.f();
                    SettableBeanProperty v = this.f2.v(f);
                    jsonParser.M0();
                    if (v != null) {
                        if (obj2 != null) {
                            v.k(jsonParser, deserializationContext, obj2);
                        } else {
                            if (objArr == null) {
                                int i2 = this.f2.q;
                                objArr = new Object[(i2 + i2)];
                            }
                            int i3 = i + 1;
                            objArr[i] = v;
                            i = i3 + 1;
                            objArr[i3] = v.i(jsonParser, deserializationContext);
                        }
                    } else if (!InstabugDbContract.BugEntry.COLUMN_MESSAGE.equals(f) || !h) {
                        Set<String> set = this.i2;
                        if (set == null || !set.contains(f)) {
                            SettableAnyProperty settableAnyProperty = this.h2;
                            if (settableAnyProperty != null) {
                                settableAnyProperty.b(jsonParser, deserializationContext, obj2, f);
                            } else {
                                x0(jsonParser, deserializationContext, obj2, f);
                            }
                        } else {
                            jsonParser.U0();
                        }
                    } else {
                        obj2 = this.Z1.z(deserializationContext, jsonParser.r0());
                        if (objArr != null) {
                            for (int i4 = 0; i4 < i; i4 += 2) {
                                ((SettableBeanProperty) objArr[i4]).I(obj2, objArr[i4 + 1]);
                            }
                            objArr = null;
                        }
                    }
                    jsonParser.M0();
                }
                if (obj2 == null) {
                    if (h) {
                        obj = this.Z1.z(deserializationContext, (String) null);
                    } else {
                        obj = this.Z1.C(deserializationContext);
                    }
                    obj2 = obj;
                    if (objArr != null) {
                        for (int i5 = 0; i5 < i; i5 += 2) {
                            ((SettableBeanProperty) objArr[i5]).I(obj2, objArr[i5 + 1]);
                        }
                    }
                }
                return obj2;
            }
            deserializationContext.O(this.y.c, this.Z1, jsonParser, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
            throw null;
        }
        deserializationContext.O(this.y.c, this.Z1, jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        throw null;
    }

    public d<Object> w(NameTransformer nameTransformer) {
        if (ThrowableDeserializer.class != ThrowableDeserializer.class) {
            return this;
        }
        return new ThrowableDeserializer(this, nameTransformer);
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super((BeanDeserializerBase) beanDeserializer, nameTransformer);
    }
}
