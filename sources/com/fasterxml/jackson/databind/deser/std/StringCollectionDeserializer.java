package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.d;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.util.Collection;

@a
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements c {
    public final d<String> a2;
    public final ValueInstantiator b2;
    public final d<Object> c2;

    public StringCollectionDeserializer(JavaType javaType, d<?> dVar, ValueInstantiator valueInstantiator) {
        super(javaType, (i) dVar, (Boolean) null);
        this.a2 = dVar;
        this.b2 = valueInstantiator;
        this.c2 = null;
    }

    /* renamed from: A0 */
    public Collection<String> e(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str;
        String str2;
        String str3;
        if (!jsonParser.F0()) {
            Boolean bool = this.Z1;
            if (bool == Boolean.TRUE || (bool == null && deserializationContext.d0(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                d<String> dVar = this.a2;
                if (jsonParser.i() == JsonToken.VALUE_NULL) {
                    if (this.Y1) {
                        return collection;
                    }
                    str3 = (String) this.y.b(deserializationContext);
                } else if (dVar == null) {
                    try {
                        str3 = m0(jsonParser, deserializationContext);
                    } catch (Exception e) {
                        throw JsonMappingException.i(e, collection, collection.size());
                    }
                } else {
                    str3 = dVar.d(jsonParser, deserializationContext);
                }
                collection.add(str3);
                return collection;
            } else if (jsonParser.y0(JsonToken.VALUE_STRING)) {
                return (Collection) M(jsonParser, deserializationContext);
            } else {
                deserializationContext.T(this.x, jsonParser);
                throw null;
            }
        } else {
            d<String> dVar2 = this.a2;
            if (dVar2 != null) {
                while (true) {
                    try {
                        if (jsonParser.L0() == null) {
                            JsonToken i = jsonParser.i();
                            if (i == JsonToken.END_ARRAY) {
                                return collection;
                            }
                            if (i != JsonToken.VALUE_NULL) {
                                str2 = dVar2.d(jsonParser, deserializationContext);
                            } else if (!this.Y1) {
                                str2 = (String) this.y.b(deserializationContext);
                            }
                        } else {
                            str2 = dVar2.d(jsonParser, deserializationContext);
                        }
                        collection.add(str2);
                    } catch (Exception e2) {
                        throw JsonMappingException.i(e2, collection, collection.size());
                    }
                }
            } else {
                while (true) {
                    try {
                        String L0 = jsonParser.L0();
                        if (L0 != null) {
                            collection.add(L0);
                        } else {
                            JsonToken i2 = jsonParser.i();
                            if (i2 == JsonToken.END_ARRAY) {
                                return collection;
                            }
                            if (i2 != JsonToken.VALUE_NULL) {
                                str = m0(jsonParser, deserializationContext);
                            } else if (!this.Y1) {
                                str = (String) this.y.b(deserializationContext);
                            }
                            collection.add(str);
                        }
                    } catch (Exception e3) {
                        throw JsonMappingException.i(e3, collection, collection.size());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r10, com.fasterxml.jackson.databind.BeanProperty r11) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9.b2
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.F()
            if (r0 == 0) goto L_0x0018
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9.b2
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r10.q
            com.fasterxml.jackson.databind.JavaType r0 = r0.G(r2)
            i0.f.a.c.d r0 = r10.y(r0, r11)
            goto L_0x002c
        L_0x0018:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9.b2
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.I()
            if (r0 == 0) goto L_0x002e
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9.b2
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r10.q
            com.fasterxml.jackson.databind.JavaType r0 = r0.J(r2)
            i0.f.a.c.d r0 = r10.y(r0, r11)
        L_0x002c:
            r5 = r0
            goto L_0x002f
        L_0x002e:
            r5 = r1
        L_0x002f:
            i0.f.a.c.d<java.lang.String> r0 = r9.a2
            com.fasterxml.jackson.databind.JavaType r2 = r9.x
            com.fasterxml.jackson.databind.JavaType r2 = r2.l()
            if (r0 != 0) goto L_0x0044
            i0.f.a.c.d r0 = r9.s0(r10, r11, r0)
            if (r0 != 0) goto L_0x0048
            i0.f.a.c.d r0 = r10.y(r2, r11)
            goto L_0x0048
        L_0x0044:
            i0.f.a.c.d r0 = r10.R(r0, r11, r2)
        L_0x0048:
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r9.t0(r10, r11, r2)
            if (r2 == 0) goto L_0x0058
            java.lang.Boolean r2 = r2.b(r3)
            r8 = r2
            goto L_0x0059
        L_0x0058:
            r8 = r1
        L_0x0059:
            i0.f.a.c.l.i r7 = r9.r0(r10, r11, r0)
            boolean r10 = i0.f.a.c.t.f.y(r0)
            if (r10 == 0) goto L_0x0065
            r6 = r1
            goto L_0x0066
        L_0x0065:
            r6 = r0
        L_0x0066:
            java.lang.Boolean r10 = r9.Z1
            boolean r10 = java.util.Objects.equals(r10, r8)
            if (r10 == 0) goto L_0x007c
            i0.f.a.c.l.i r10 = r9.y
            if (r10 != r7) goto L_0x007c
            i0.f.a.c.d<java.lang.String> r10 = r9.a2
            if (r10 != r6) goto L_0x007c
            i0.f.a.c.d<java.lang.Object> r10 = r9.c2
            if (r10 != r5) goto L_0x007c
            r10 = r9
            goto L_0x0086
        L_0x007c:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            com.fasterxml.jackson.databind.JavaType r3 = r9.x
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r9.b2
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x0086:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        d<Object> dVar = this.c2;
        if (dVar != null) {
            return (Collection) this.b2.E(deserializationContext, dVar.d(jsonParser, deserializationContext));
        }
        return e(jsonParser, deserializationContext, (Collection) this.b2.C(deserializationContext));
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.c(jsonParser, deserializationContext);
    }

    public boolean p() {
        return this.a2 == null && this.c2 == null;
    }

    public LogicalType q() {
        return LogicalType.Collection;
    }

    public ValueInstantiator u0() {
        return this.b2;
    }

    public d<Object> y0() {
        return this.a2;
    }

    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, d<?> dVar, d<?> dVar2, i iVar, Boolean bool) {
        super(javaType, iVar, bool);
        this.a2 = dVar2;
        this.b2 = valueInstantiator;
        this.c2 = dVar;
    }
}
