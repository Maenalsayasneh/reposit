package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.d;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.j;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import i0.f.a.c.t.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@a
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements j, c {
    public static final Object[] x = new Object[0];
    public d<Object> Y1;
    public d<Object> Z1;
    public d<Object> a2;
    public JavaType b2;
    public JavaType c2;
    public final boolean d2;
    public d<Object> y;

    @Deprecated
    public UntypedObjectDeserializer() {
        super((Class<?>) Object.class);
        this.b2 = null;
        this.c2 = null;
        this.d2 = false;
    }

    public Object A0(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean c0 = deserializationContext.c0(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (c0) {
            B0(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.M0();
            Object d = d(jsonParser, deserializationContext);
            Object put = map.put(str2, d);
            if (put != null && c0) {
                B0(map, str, put, d);
            }
            str2 = jsonParser.K0();
        }
        return map;
    }

    public final void B0(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        map.put(str, arrayList);
    }

    public Object C0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken M0 = jsonParser.M0();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (M0 == jsonToken) {
            return new ArrayList(2);
        }
        Object d = d(jsonParser, deserializationContext);
        if (jsonParser.M0() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(d);
            return arrayList;
        }
        Object d3 = d(jsonParser, deserializationContext);
        if (jsonParser.M0() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(d);
            arrayList2.add(d3);
            return arrayList2;
        }
        n g02 = deserializationContext.g0();
        Object[] g = g02.g();
        g[0] = d;
        g[1] = d3;
        int i2 = 2;
        while (true) {
            Object d4 = d(jsonParser, deserializationContext);
            i++;
            if (i2 >= g.length) {
                g = g02.c(g);
                i2 = 0;
            }
            int i3 = i2 + 1;
            g[i2] = d4;
            if (jsonParser.M0() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                g02.d(g, i3, arrayList3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public Object[] D0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.M0() == JsonToken.END_ARRAY) {
            return x;
        }
        n g02 = deserializationContext.g0();
        Object[] g = g02.g();
        int i = 0;
        while (true) {
            Object d = d(jsonParser, deserializationContext);
            if (i >= g.length) {
                g = g02.c(g);
                i = 0;
            }
            int i2 = i + 1;
            g[i] = d;
            if (jsonParser.M0() == JsonToken.END_ARRAY) {
                int i3 = g02.c + i2;
                Object[] objArr = new Object[i3];
                g02.a(objArr, i3, g, i2);
                g02.b();
                return objArr;
            }
            i = i2;
        }
    }

    public Object E0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken i = jsonParser.i();
        String str = null;
        if (i == JsonToken.START_OBJECT) {
            str = jsonParser.K0();
        } else if (i == JsonToken.FIELD_NAME) {
            str = jsonParser.f();
        } else if (i != JsonToken.END_OBJECT) {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }
        String str2 = str;
        if (str2 == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.M0();
        Object d = d(jsonParser, deserializationContext);
        String K0 = jsonParser.K0();
        if (K0 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str2, d);
            return linkedHashMap;
        }
        jsonParser.M0();
        Object d3 = d(jsonParser, deserializationContext);
        String K02 = jsonParser.K0();
        if (K02 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str2, d);
            if (linkedHashMap2.put(K0, d3) != null) {
                A0(jsonParser, deserializationContext, linkedHashMap2, str2, d, d3, K02);
            }
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str2, d);
        if (linkedHashMap3.put(K0, d3) != null) {
            A0(jsonParser, deserializationContext, linkedHashMap3, str2, d, d3, K02);
            return linkedHashMap3;
        }
        String str3 = K02;
        do {
            jsonParser.M0();
            Object d4 = d(jsonParser, deserializationContext);
            Object put = linkedHashMap3.put(str3, d4);
            if (put != null) {
                A0(jsonParser, deserializationContext, linkedHashMap3, str3, put, d4, jsonParser.K0());
                return linkedHashMap3;
            }
            str3 = jsonParser.K0();
        } while (str3 != null);
        return linkedHashMap3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.BeanProperty r5) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r4.q
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r2 = r4.e2
            r2.a(r1)
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r4 = r4.e2
            java.lang.Boolean r4 = r4.y
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x001a
            r4 = r0
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            i0.f.a.c.d<java.lang.Object> r5 = r3.Z1
            if (r5 != 0) goto L_0x003c
            i0.f.a.c.d<java.lang.Object> r5 = r3.a2
            if (r5 != 0) goto L_0x003c
            i0.f.a.c.d<java.lang.Object> r5 = r3.y
            if (r5 != 0) goto L_0x003c
            i0.f.a.c.d<java.lang.Object> r5 = r3.Y1
            if (r5 != 0) goto L_0x003c
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r5 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r1 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            if (r5 != r1) goto L_0x003c
            if (r4 == 0) goto L_0x0039
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla
            r4.<init>(r0)
            goto L_0x003b
        L_0x0039:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r4 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.x
        L_0x003b:
            return r4
        L_0x003c:
            boolean r5 = r3.d2
            if (r4 == r5) goto L_0x0046
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r5.<init>((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer) r3, (boolean) r4)
            return r5
        L_0x0046:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    public void c(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType q = deserializationContext.q(Object.class);
        JavaType q2 = deserializationContext.q(String.class);
        TypeFactory i = deserializationContext.i();
        JavaType javaType = this.b2;
        if (javaType == null) {
            this.Y1 = y0(deserializationContext.c.f(deserializationContext, deserializationContext.d, i.g(List.class, q)));
        } else {
            this.Y1 = z0(deserializationContext, javaType);
        }
        JavaType javaType2 = this.c2;
        if (javaType2 == null) {
            this.y = y0(deserializationContext.c.f(deserializationContext, deserializationContext.d, i.k(Map.class, q2, q)));
        } else {
            this.y = z0(deserializationContext, javaType2);
        }
        this.Z1 = y0(z0(deserializationContext, q2));
        this.a2 = y0(z0(deserializationContext, i.b((i0.f.a.c.s.a) null, Number.class, TypeFactory.q)));
        JavaType v = TypeFactory.v();
        this.y = deserializationContext.R(this.y, (BeanProperty) null, v);
        this.Y1 = deserializationContext.R(this.Y1, (BeanProperty) null, v);
        this.Z1 = deserializationContext.R(this.Z1, (BeanProperty) null, v);
        this.a2 = deserializationContext.R(this.a2, (BeanProperty) null, v);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.k()) {
            case 1:
            case 2:
            case 5:
                d<Object> dVar = this.y;
                if (dVar != null) {
                    return dVar.d(jsonParser, deserializationContext);
                }
                return E0(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.d0(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return D0(jsonParser, deserializationContext);
                }
                d<Object> dVar2 = this.Y1;
                if (dVar2 != null) {
                    return dVar2.d(jsonParser, deserializationContext);
                }
                return C0(jsonParser, deserializationContext);
            case 6:
                d<Object> dVar3 = this.Z1;
                if (dVar3 != null) {
                    return dVar3.d(jsonParser, deserializationContext);
                }
                return jsonParser.Z();
            case 7:
                d<Object> dVar4 = this.a2;
                if (dVar4 != null) {
                    return dVar4.d(jsonParser, deserializationContext);
                }
                if (deserializationContext.a0(StdDeserializer.c)) {
                    return G(jsonParser, deserializationContext);
                }
                return jsonParser.N();
            case 8:
                d<Object> dVar5 = this.a2;
                if (dVar5 != null) {
                    return dVar5.d(jsonParser, deserializationContext);
                }
                if (deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.E();
                }
                return jsonParser.N();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.G();
            default:
                deserializationContext.V(Object.class, jsonParser);
                throw null;
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (this.d2) {
            return d(jsonParser, deserializationContext);
        }
        switch (jsonParser.k()) {
            case 1:
            case 2:
            case 5:
                d<Object> dVar = this.y;
                if (dVar != null) {
                    return dVar.e(jsonParser, deserializationContext, obj);
                }
                if (!(obj instanceof Map)) {
                    return E0(jsonParser, deserializationContext);
                }
                Map map = (Map) obj;
                JsonToken i = jsonParser.i();
                if (i == JsonToken.START_OBJECT) {
                    i = jsonParser.M0();
                }
                if (i == JsonToken.END_OBJECT) {
                    return map;
                }
                String f = jsonParser.f();
                do {
                    jsonParser.M0();
                    Object obj3 = map.get(f);
                    if (obj3 != null) {
                        obj2 = e(jsonParser, deserializationContext, obj3);
                    } else {
                        obj2 = d(jsonParser, deserializationContext);
                    }
                    if (obj2 != obj3) {
                        map.put(f, obj2);
                    }
                    f = jsonParser.K0();
                } while (f != null);
                return map;
            case 3:
                d<Object> dVar2 = this.Y1;
                if (dVar2 != null) {
                    return dVar2.e(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    while (jsonParser.M0() != JsonToken.END_ARRAY) {
                        collection.add(d(jsonParser, deserializationContext));
                    }
                    return collection;
                } else if (deserializationContext.d0(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return D0(jsonParser, deserializationContext);
                } else {
                    return C0(jsonParser, deserializationContext);
                }
            case 6:
                d<Object> dVar3 = this.Z1;
                if (dVar3 != null) {
                    return dVar3.e(jsonParser, deserializationContext, obj);
                }
                return jsonParser.Z();
            case 7:
                d<Object> dVar4 = this.a2;
                if (dVar4 != null) {
                    return dVar4.e(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.a0(StdDeserializer.c)) {
                    return G(jsonParser, deserializationContext);
                }
                return jsonParser.N();
            case 8:
                d<Object> dVar5 = this.a2;
                if (dVar5 != null) {
                    return dVar5.e(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.E();
                }
                return jsonParser.N();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.G();
            default:
                return d(jsonParser, deserializationContext);
        }
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        int k = jsonParser.k();
        if (!(k == 1 || k == 3)) {
            switch (k) {
                case 5:
                    break;
                case 6:
                    d<Object> dVar = this.Z1;
                    if (dVar != null) {
                        return dVar.d(jsonParser, deserializationContext);
                    }
                    return jsonParser.Z();
                case 7:
                    d<Object> dVar2 = this.a2;
                    if (dVar2 != null) {
                        return dVar2.d(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.a0(StdDeserializer.c)) {
                        return G(jsonParser, deserializationContext);
                    }
                    return jsonParser.N();
                case 8:
                    d<Object> dVar3 = this.a2;
                    if (dVar3 != null) {
                        return dVar3.d(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.E();
                    }
                    return jsonParser.N();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.G();
                default:
                    deserializationContext.V(Object.class, jsonParser);
                    throw null;
            }
        }
        return bVar.b(jsonParser, deserializationContext);
    }

    public boolean p() {
        return true;
    }

    public LogicalType q() {
        return LogicalType.Untyped;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return null;
    }

    public d<Object> y0(d<Object> dVar) {
        if (f.y(dVar)) {
            return null;
        }
        return dVar;
    }

    public d<Object> z0(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.c.f(deserializationContext, deserializationContext.d, javaType);
    }

    @a
    public static class Vanilla extends StdDeserializer<Object> {
        public static final Vanilla x = new Vanilla();
        public final boolean y;

        public Vanilla() {
            super((Class<?>) Object.class);
            this.y = false;
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            LinkedHashMap linkedHashMap;
            int i = 2;
            switch (jsonParser.k()) {
                case 1:
                    if (jsonParser.M0() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    JsonToken M0 = jsonParser.M0();
                    JsonToken jsonToken = JsonToken.END_ARRAY;
                    if (M0 == jsonToken) {
                        if (deserializationContext.d0(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return UntypedObjectDeserializer.x;
                        }
                        return new ArrayList(2);
                    } else if (deserializationContext.d0(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        n g02 = deserializationContext.g0();
                        Object[] g = g02.g();
                        int i2 = 0;
                        while (true) {
                            Object d = d(jsonParser, deserializationContext);
                            if (i2 >= g.length) {
                                g = g02.c(g);
                                i2 = 0;
                            }
                            int i3 = i2 + 1;
                            g[i2] = d;
                            if (jsonParser.M0() == JsonToken.END_ARRAY) {
                                int i4 = g02.c + i3;
                                Object[] objArr = new Object[i4];
                                g02.a(objArr, i4, g, i3);
                                g02.b();
                                return objArr;
                            }
                            i2 = i3;
                        }
                    } else {
                        Object d2 = d(jsonParser, deserializationContext);
                        if (jsonParser.M0() == jsonToken) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(d2);
                            return arrayList;
                        }
                        Object d3 = d(jsonParser, deserializationContext);
                        if (jsonParser.M0() == jsonToken) {
                            ArrayList arrayList2 = new ArrayList(2);
                            arrayList2.add(d2);
                            arrayList2.add(d3);
                            return arrayList2;
                        }
                        n g03 = deserializationContext.g0();
                        Object[] g2 = g03.g();
                        g2[0] = d2;
                        g2[1] = d3;
                        int i5 = 2;
                        while (true) {
                            Object d4 = d(jsonParser, deserializationContext);
                            i++;
                            if (i5 >= g2.length) {
                                g2 = g03.c(g2);
                                i5 = 0;
                            }
                            int i6 = i5 + 1;
                            g2[i5] = d4;
                            if (jsonParser.M0() == JsonToken.END_ARRAY) {
                                ArrayList arrayList3 = new ArrayList(i);
                                g03.d(g2, i6, arrayList3);
                                return arrayList3;
                            }
                            i5 = i6;
                        }
                    }
                case 5:
                    break;
                case 6:
                    return jsonParser.Z();
                case 7:
                    if (deserializationContext.a0(StdDeserializer.c)) {
                        return G(jsonParser, deserializationContext);
                    }
                    return jsonParser.N();
                case 8:
                    if (deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.E();
                    }
                    return jsonParser.N();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.G();
                default:
                    deserializationContext.V(Object.class, jsonParser);
                    throw null;
            }
            String Z = jsonParser.Z();
            jsonParser.M0();
            Object d5 = d(jsonParser, deserializationContext);
            String K0 = jsonParser.K0();
            if (K0 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
                linkedHashMap2.put(Z, d5);
                return linkedHashMap2;
            }
            jsonParser.M0();
            Object d6 = d(jsonParser, deserializationContext);
            String K02 = jsonParser.K0();
            if (K02 == null) {
                linkedHashMap = new LinkedHashMap(4);
                linkedHashMap.put(Z, d5);
                if (linkedHashMap.put(K0, d6) != null) {
                    y0(jsonParser, deserializationContext, linkedHashMap, Z, d5, d6, K02);
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Z, d5);
                if (linkedHashMap.put(K0, d6) != null) {
                    y0(jsonParser, deserializationContext, linkedHashMap, Z, d5, d6, K02);
                } else {
                    String str = K02;
                    while (true) {
                        jsonParser.M0();
                        Object d7 = d(jsonParser, deserializationContext);
                        Object put = linkedHashMap.put(str, d7);
                        if (put != null) {
                            y0(jsonParser, deserializationContext, linkedHashMap, str, put, d7, jsonParser.K0());
                        } else {
                            str = jsonParser.K0();
                            if (str == null) {
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
            if (r0 != 5) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object e(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) throws java.io.IOException {
            /*
                r4 = this;
                boolean r0 = r4.y
                if (r0 == 0) goto L_0x0009
                java.lang.Object r5 = r4.d(r5, r6)
                return r5
            L_0x0009:
                int r0 = r5.k()
                r1 = 1
                if (r0 == r1) goto L_0x003d
                r1 = 2
                if (r0 == r1) goto L_0x003c
                r1 = 3
                if (r0 == r1) goto L_0x001d
                r1 = 4
                if (r0 == r1) goto L_0x003c
                r1 = 5
                if (r0 == r1) goto L_0x0046
                goto L_0x006f
            L_0x001d:
                com.fasterxml.jackson.core.JsonToken r0 = r5.M0()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r0 != r1) goto L_0x0026
                return r7
            L_0x0026:
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x002d:
                java.lang.Object r1 = r4.d(r5, r6)
                r0.add(r1)
                com.fasterxml.jackson.core.JsonToken r1 = r5.M0()
                com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r1 != r2) goto L_0x002d
            L_0x003c:
                return r7
            L_0x003d:
                com.fasterxml.jackson.core.JsonToken r0 = r5.M0()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
                if (r0 != r1) goto L_0x0046
                return r7
            L_0x0046:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = r5.f()
            L_0x0051:
                r5.M0()
                java.lang.Object r2 = r0.get(r1)
                if (r2 == 0) goto L_0x005f
                java.lang.Object r3 = r4.e(r5, r6, r2)
                goto L_0x0063
            L_0x005f:
                java.lang.Object r3 = r4.d(r5, r6)
            L_0x0063:
                if (r3 == r2) goto L_0x0068
                r0.put(r1, r3)
            L_0x0068:
                java.lang.String r1 = r5.K0()
                if (r1 != 0) goto L_0x0051
                return r7
            L_0x006f:
                java.lang.Object r5 = r4.d(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
        }

        public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
            int k = jsonParser.k();
            if (!(k == 1 || k == 3)) {
                switch (k) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.Z();
                    case 7:
                        if (deserializationContext.d0(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.l();
                        }
                        return jsonParser.N();
                    case 8:
                        if (deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.E();
                        }
                        return jsonParser.N();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.G();
                    default:
                        deserializationContext.V(Object.class, jsonParser);
                        throw null;
                }
            }
            return bVar.b(jsonParser, deserializationContext);
        }

        public LogicalType q() {
            return LogicalType.Untyped;
        }

        public Boolean v(DeserializationConfig deserializationConfig) {
            if (this.y) {
                return Boolean.FALSE;
            }
            return null;
        }

        public Object y0(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean c0 = deserializationContext.c0(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (c0) {
                z0(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.M0();
                Object d = d(jsonParser, deserializationContext);
                Object put = map.put(str2, d);
                if (put != null && c0) {
                    z0(map, str2, put, d);
                }
                str2 = jsonParser.K0();
            }
            return map;
        }

        public final void z0(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }

        public Vanilla(boolean z) {
            super((Class<?>) Object.class);
            this.y = z;
        }
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this.b2 = javaType;
        this.c2 = javaType2;
        this.d2 = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super((Class<?>) Object.class);
        this.y = untypedObjectDeserializer.y;
        this.Y1 = untypedObjectDeserializer.Y1;
        this.Z1 = untypedObjectDeserializer.Z1;
        this.a2 = untypedObjectDeserializer.a2;
        this.b2 = untypedObjectDeserializer.b2;
        this.c2 = untypedObjectDeserializer.c2;
        this.d2 = z;
    }
}
