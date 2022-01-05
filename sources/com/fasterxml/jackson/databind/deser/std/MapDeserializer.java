package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker;
import h0.b0.v;
import i0.f.a.c.d;
import i0.f.a.c.h;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.l.j;
import i0.f.a.c.l.m.f;
import i0.f.a.c.l.m.g;
import i0.f.a.c.l.m.h;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@i0.f.a.c.j.a
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements c, j {
    public final h a2;
    public boolean b2;
    public final d<Object> c2;
    public final i0.f.a.c.p.b d2;
    public final ValueInstantiator e2;
    public d<Object> f2;
    public PropertyBasedCreator g2;
    public final boolean h2;
    public Set<String> i2;
    public Set<String> j2;
    public IgnorePropertiesUtil$Checker k2;

    public static class a extends h.a {
        public final b c;
        public final Map<Object, Object> d = new LinkedHashMap();
        public final Object e;

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.c = bVar;
            this.e = obj;
        }

        public void a(Object obj, Object obj2) throws IOException {
            b bVar = this.c;
            Iterator<a> it = bVar.c.iterator();
            Map<Object, Object> map = bVar.b;
            while (it.hasNext()) {
                a next = it.next();
                if (obj.equals(next.a.x.b.q)) {
                    it.remove();
                    map.put(next.e, obj2);
                    map.putAll(next.d);
                    return;
                }
                map = next.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public static final class b {
        public final Class<?> a;
        public Map<Object, Object> b;
        public List<a> c = new ArrayList();

        public b(Class<?> cls, Map<Object, Object> map) {
            this.a = cls;
            this.b = map;
        }

        public void a(Object obj, Object obj2) {
            if (this.c.isEmpty()) {
                this.b.put(obj, obj2);
                return;
            }
            List<a> list = this.c;
            list.get(list.size() - 1).d.put(obj, obj2);
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, i0.f.a.c.h hVar, d<Object> dVar, i0.f.a.c.p.b bVar) {
        super(javaType, (i) null, (Boolean) null);
        this.a2 = hVar;
        this.c2 = dVar;
        this.d2 = bVar;
        this.e2 = valueInstantiator;
        this.h2 = valueInstantiator.k();
        this.f2 = null;
        this.g2 = null;
        this.b2 = A0(javaType, hVar);
        this.k2 = null;
    }

    public final boolean A0(JavaType javaType, i0.f.a.c.h hVar) {
        JavaType q;
        if (hVar == null || (q = javaType.q()) == null) {
            return true;
        }
        Class<?> cls = q.c;
        if ((cls == String.class || cls == Object.class) && f.y(hVar)) {
            return true;
        }
        return false;
    }

    public final void B0(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String str;
        Object obj;
        i0.f.a.c.h hVar = this.a2;
        d<Object> dVar = this.c2;
        i0.f.a.c.p.b bVar = this.d2;
        boolean z = dVar.m() != null;
        b bVar2 = z ? new b(this.x.l().c, map) : null;
        if (jsonParser.I0()) {
            str = jsonParser.K0();
        } else {
            JsonToken i = jsonParser.i();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (i == jsonToken) {
                str = jsonParser.f();
            } else if (i != JsonToken.END_OBJECT) {
                deserializationContext.q0(this, jsonToken, (String) null, new Object[0]);
                throw null;
            } else {
                return;
            }
        }
        while (str != null) {
            Object a3 = hVar.a(str, deserializationContext);
            JsonToken M0 = jsonParser.M0();
            IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker = this.k2;
            if (ignorePropertiesUtil$Checker == null || !ignorePropertiesUtil$Checker.a(str)) {
                try {
                    if (M0 == JsonToken.VALUE_NULL) {
                        if (!this.Y1) {
                            obj = this.y.b(deserializationContext);
                        }
                    } else if (bVar == null) {
                        obj = dVar.d(jsonParser, deserializationContext);
                    } else {
                        obj = dVar.f(jsonParser, deserializationContext, bVar);
                    }
                    if (z) {
                        bVar2.a(a3, obj);
                    } else {
                        map.put(a3, obj);
                    }
                } catch (UnresolvedForwardReference e) {
                    C0(deserializationContext, bVar2, a3, e);
                } catch (Exception e3) {
                    z0(deserializationContext, e3, map, str);
                    throw null;
                }
            } else {
                jsonParser.U0();
            }
            str = jsonParser.K0();
        }
    }

    public final void C0(DeserializationContext deserializationContext, b bVar, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (bVar != null) {
            a aVar = new a(bVar, unresolvedForwardReference, bVar.a, obj);
            bVar.c.add(aVar);
            unresolvedForwardReference.x.a(aVar);
            return;
        }
        deserializationContext.m0(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r11, com.fasterxml.jackson.databind.BeanProperty r12) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r10 = this;
            i0.f.a.c.h r0 = r10.a2
            if (r0 != 0) goto L_0x000f
            com.fasterxml.jackson.databind.JavaType r0 = r10.x
            com.fasterxml.jackson.databind.JavaType r0 = r0.q()
            i0.f.a.c.h r0 = r11.A(r0, r12)
            goto L_0x0019
        L_0x000f:
            boolean r1 = r0 instanceof i0.f.a.c.l.d
            if (r1 == 0) goto L_0x0019
            i0.f.a.c.l.d r0 = (i0.f.a.c.l.d) r0
            i0.f.a.c.h r0 = r0.a(r11, r12)
        L_0x0019:
            r3 = r0
            i0.f.a.c.d<java.lang.Object> r0 = r10.c2
            if (r12 == 0) goto L_0x0022
            i0.f.a.c.d r0 = r10.s0(r11, r12, r0)
        L_0x0022:
            com.fasterxml.jackson.databind.JavaType r1 = r10.x
            com.fasterxml.jackson.databind.JavaType r1 = r1.l()
            if (r0 != 0) goto L_0x002f
            i0.f.a.c.d r0 = r11.y(r1, r12)
            goto L_0x0033
        L_0x002f:
            i0.f.a.c.d r0 = r11.R(r0, r12, r1)
        L_0x0033:
            r4 = r0
            i0.f.a.c.p.b r0 = r10.d2
            if (r0 == 0) goto L_0x003c
            i0.f.a.c.p.b r0 = r0.f(r12)
        L_0x003c:
            r5 = r0
            java.util.Set<java.lang.String> r0 = r10.i2
            java.util.Set<java.lang.String> r1 = r10.j2
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r11.G()
            boolean r6 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.Y(r2, r12)
            if (r6 == 0) goto L_0x00b9
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r12.a()
            if (r6 == 0) goto L_0x00b9
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r11.q
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r8 = r2.T(r7, r6)
            if (r8 == 0) goto L_0x0085
            java.util.Set r8 = r8.c()
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0085
            if (r0 != 0) goto L_0x006b
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            goto L_0x0071
        L_0x006b:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r0 = r9
        L_0x0071:
            java.util.Iterator r8 = r8.iterator()
        L_0x0075:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0085
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            r0.add(r9)
            goto L_0x0075
        L_0x0085:
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r2 = r2.W(r7, r6)
            if (r2 == 0) goto L_0x00b9
            java.util.Set<java.lang.String> r2 = r2.d
            if (r2 == 0) goto L_0x00b9
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            if (r1 != 0) goto L_0x009c
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r2)
            goto L_0x00b6
        L_0x009c:
            java.util.Iterator r2 = r2.iterator()
        L_0x00a0:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r1.contains(r7)
            if (r8 == 0) goto L_0x00a0
            r6.add(r7)
            goto L_0x00a0
        L_0x00b6:
            r7 = r0
            r8 = r6
            goto L_0x00bb
        L_0x00b9:
            r7 = r0
            r8 = r1
        L_0x00bb:
            i0.f.a.c.l.i r6 = r10.r0(r11, r12, r4)
            i0.f.a.c.h r11 = r10.a2
            if (r11 != r3) goto L_0x00d9
            i0.f.a.c.d<java.lang.Object> r11 = r10.c2
            if (r11 != r4) goto L_0x00d9
            i0.f.a.c.p.b r11 = r10.d2
            if (r11 != r5) goto L_0x00d9
            i0.f.a.c.l.i r11 = r10.y
            if (r11 != r6) goto L_0x00d9
            java.util.Set<java.lang.String> r11 = r10.i2
            if (r11 != r7) goto L_0x00d9
            java.util.Set<java.lang.String> r11 = r10.j2
            if (r11 != r8) goto L_0x00d9
            r11 = r10
            goto L_0x00e0
        L_0x00d9:
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r1 = r11
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x00e0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    public void c(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this.e2.l()) {
            JavaType J = this.e2.J(deserializationContext.q);
            if (J != null) {
                this.f2 = deserializationContext.y(J, (BeanProperty) null);
            } else {
                JavaType javaType = this.x;
                deserializationContext.n(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{javaType, this.e2.getClass().getName()}));
                throw null;
            }
        } else if (this.e2.i()) {
            JavaType G = this.e2.G(deserializationContext.q);
            if (G != null) {
                this.f2 = deserializationContext.y(G, (BeanProperty) null);
            } else {
                JavaType javaType2 = this.x;
                deserializationContext.n(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{javaType2, this.e2.getClass().getName()}));
                throw null;
            }
        }
        if (this.e2.g()) {
            this.g2 = PropertyBasedCreator.b(deserializationContext, this.e2, this.e2.M(deserializationContext.q), deserializationContext.e0(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.b2 = A0(this.x, this.a2);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String str;
        Object obj;
        String str2;
        Object obj2;
        PropertyBasedCreator propertyBasedCreator = this.g2;
        if (propertyBasedCreator != null) {
            g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, (ObjectIdReader) null);
            d<Object> dVar = this.c2;
            i0.f.a.c.p.b bVar = this.d2;
            if (jsonParser.I0()) {
                str2 = jsonParser.K0();
            } else {
                str2 = jsonParser.y0(JsonToken.FIELD_NAME) ? jsonParser.f() : null;
            }
            while (str2 != null) {
                JsonToken M0 = jsonParser.M0();
                IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker = this.k2;
                if (ignorePropertiesUtil$Checker == null || !ignorePropertiesUtil$Checker.a(str2)) {
                    SettableBeanProperty settableBeanProperty = propertyBasedCreator.c.get(str2);
                    if (settableBeanProperty == null) {
                        Object a3 = this.a2.a(str2, deserializationContext);
                        try {
                            if (M0 == JsonToken.VALUE_NULL) {
                                if (!this.Y1) {
                                    obj2 = this.y.b(deserializationContext);
                                }
                            } else if (bVar == null) {
                                obj2 = dVar.d(jsonParser, deserializationContext);
                            } else {
                                obj2 = dVar.f(jsonParser, deserializationContext, bVar);
                            }
                            gVar.h = new f.b(gVar.h, obj2, a3);
                        } catch (Exception e) {
                            z0(deserializationContext, e, this.x.c, str2);
                            throw null;
                        }
                    } else if (gVar.b(settableBeanProperty, settableBeanProperty.i(jsonParser, deserializationContext))) {
                        jsonParser.M0();
                        try {
                            Map map = (Map) propertyBasedCreator.a(deserializationContext, gVar);
                            B0(jsonParser, deserializationContext, map);
                            return map;
                        } catch (Exception e3) {
                            z0(deserializationContext, e3, this.x.c, str2);
                            throw null;
                        }
                    }
                } else {
                    jsonParser.U0();
                }
                str2 = jsonParser.K0();
            }
            try {
                return (Map) propertyBasedCreator.a(deserializationContext, gVar);
            } catch (Exception e4) {
                z0(deserializationContext, e4, this.x.c, str2);
                throw null;
            }
        } else {
            d<Object> dVar2 = this.f2;
            if (dVar2 != null) {
                return (Map) this.e2.E(deserializationContext, dVar2.d(jsonParser, deserializationContext));
            }
            if (this.h2) {
                int k = jsonParser.k();
                boolean z = true;
                if (!(k == 1 || k == 2)) {
                    if (k == 3) {
                        return (Map) I(jsonParser, deserializationContext);
                    }
                    if (k != 5) {
                        if (k == 6) {
                            return (Map) M(jsonParser, deserializationContext);
                        }
                        JavaType javaType = this.q;
                        if (javaType == null) {
                            javaType = deserializationContext.q(this.d);
                        }
                        deserializationContext.T(javaType, jsonParser);
                        throw null;
                    }
                }
                Map map2 = (Map) this.e2.C(deserializationContext);
                if (this.b2) {
                    d<Object> dVar3 = this.c2;
                    i0.f.a.c.p.b bVar2 = this.d2;
                    if (dVar3.m() == null) {
                        z = false;
                    }
                    b bVar3 = z ? new b(this.x.l().c, map2) : null;
                    if (jsonParser.I0()) {
                        str = jsonParser.K0();
                    } else {
                        JsonToken i = jsonParser.i();
                        if (i == JsonToken.END_OBJECT) {
                            return map2;
                        }
                        JsonToken jsonToken = JsonToken.FIELD_NAME;
                        if (i == jsonToken) {
                            str = jsonParser.f();
                        } else {
                            deserializationContext.q0(this, jsonToken, (String) null, new Object[0]);
                            throw null;
                        }
                    }
                    while (str != null) {
                        JsonToken M02 = jsonParser.M0();
                        IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker2 = this.k2;
                        if (ignorePropertiesUtil$Checker2 == null || !ignorePropertiesUtil$Checker2.a(str)) {
                            try {
                                if (M02 == JsonToken.VALUE_NULL) {
                                    if (!this.Y1) {
                                        obj = this.y.b(deserializationContext);
                                    }
                                } else if (bVar2 == null) {
                                    obj = dVar3.d(jsonParser, deserializationContext);
                                } else {
                                    obj = dVar3.f(jsonParser, deserializationContext, bVar2);
                                }
                                if (z) {
                                    bVar3.a(str, obj);
                                } else {
                                    map2.put(str, obj);
                                }
                            } catch (UnresolvedForwardReference e5) {
                                C0(deserializationContext, bVar3, str, e5);
                            } catch (Exception e6) {
                                z0(deserializationContext, e6, map2, str);
                                throw null;
                            }
                        } else {
                            jsonParser.U0();
                        }
                        str = jsonParser.K0();
                    }
                    return map2;
                }
                B0(jsonParser, deserializationContext, map2);
                return map2;
            }
            deserializationContext.O(this.x.c, this.e2, jsonParser, "no default constructor found", new Object[0]);
            throw null;
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        Map map = (Map) obj;
        jsonParser.S0(map);
        JsonToken i = jsonParser.i();
        if (i == JsonToken.START_OBJECT || i == JsonToken.FIELD_NAME) {
            if (this.b2) {
                d<Object> dVar = this.c2;
                i0.f.a.c.p.b bVar = this.d2;
                if (jsonParser.I0()) {
                    str2 = jsonParser.K0();
                } else {
                    JsonToken i3 = jsonParser.i();
                    if (i3 != JsonToken.END_OBJECT) {
                        JsonToken jsonToken = JsonToken.FIELD_NAME;
                        if (i3 == jsonToken) {
                            str2 = jsonParser.f();
                        } else {
                            deserializationContext.q0(this, jsonToken, (String) null, new Object[0]);
                            throw null;
                        }
                    }
                }
                while (str2 != null) {
                    JsonToken M0 = jsonParser.M0();
                    IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker = this.k2;
                    if (ignorePropertiesUtil$Checker == null || !ignorePropertiesUtil$Checker.a(str2)) {
                        try {
                            if (M0 != JsonToken.VALUE_NULL) {
                                Object obj4 = map.get(str2);
                                if (obj4 != null) {
                                    if (bVar == null) {
                                        obj3 = dVar.e(jsonParser, deserializationContext, obj4);
                                    } else {
                                        obj3 = dVar.g(jsonParser, deserializationContext, bVar);
                                    }
                                } else if (bVar == null) {
                                    obj3 = dVar.d(jsonParser, deserializationContext);
                                } else {
                                    obj3 = dVar.f(jsonParser, deserializationContext, bVar);
                                }
                                if (obj3 != obj4) {
                                    map.put(str2, obj3);
                                }
                            } else if (!this.Y1) {
                                map.put(str2, this.y.b(deserializationContext));
                            }
                        } catch (Exception e) {
                            z0(deserializationContext, e, map, str2);
                            throw null;
                        }
                    } else {
                        jsonParser.U0();
                    }
                    str2 = jsonParser.K0();
                }
            } else {
                i0.f.a.c.h hVar = this.a2;
                d<Object> dVar2 = this.c2;
                i0.f.a.c.p.b bVar2 = this.d2;
                if (jsonParser.I0()) {
                    str = jsonParser.K0();
                } else {
                    JsonToken i4 = jsonParser.i();
                    if (i4 != JsonToken.END_OBJECT) {
                        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
                        if (i4 == jsonToken2) {
                            str = jsonParser.f();
                        } else {
                            deserializationContext.q0(this, jsonToken2, (String) null, new Object[0]);
                            throw null;
                        }
                    }
                }
                while (str != null) {
                    Object a3 = hVar.a(str, deserializationContext);
                    JsonToken M02 = jsonParser.M0();
                    IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker2 = this.k2;
                    if (ignorePropertiesUtil$Checker2 == null || !ignorePropertiesUtil$Checker2.a(str)) {
                        try {
                            if (M02 != JsonToken.VALUE_NULL) {
                                Object obj5 = map.get(a3);
                                if (obj5 != null) {
                                    if (bVar2 == null) {
                                        obj2 = dVar2.e(jsonParser, deserializationContext, obj5);
                                    } else {
                                        obj2 = dVar2.g(jsonParser, deserializationContext, bVar2);
                                    }
                                } else if (bVar2 == null) {
                                    obj2 = dVar2.d(jsonParser, deserializationContext);
                                } else {
                                    obj2 = dVar2.f(jsonParser, deserializationContext, bVar2);
                                }
                                if (obj2 != obj5) {
                                    map.put(a3, obj2);
                                }
                            } else if (!this.Y1) {
                                map.put(a3, this.y.b(deserializationContext));
                            }
                        } catch (Exception e3) {
                            z0(deserializationContext, e3, map, str);
                            throw null;
                        }
                    } else {
                        jsonParser.U0();
                    }
                    str = jsonParser.K0();
                }
            }
            return map;
        }
        deserializationContext.V(this.x.c, jsonParser);
        throw null;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, i0.f.a.c.p.b bVar) throws IOException {
        return bVar.d(jsonParser, deserializationContext);
    }

    public boolean p() {
        return this.c2 == null && this.a2 == null && this.d2 == null && this.i2 == null && this.j2 == null;
    }

    public LogicalType q() {
        return LogicalType.Map;
    }

    public ValueInstantiator u0() {
        return this.e2;
    }

    public JavaType v0() {
        return this.x;
    }

    public d<Object> y0() {
        return this.c2;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, i0.f.a.c.h hVar, d<Object> dVar, i0.f.a.c.p.b bVar, i iVar, Set<String> set, Set<String> set2) {
        super((ContainerDeserializerBase<?>) mapDeserializer, iVar, mapDeserializer.Z1);
        this.a2 = hVar;
        this.c2 = dVar;
        this.d2 = bVar;
        this.e2 = mapDeserializer.e2;
        this.g2 = mapDeserializer.g2;
        this.f2 = mapDeserializer.f2;
        this.h2 = mapDeserializer.h2;
        this.i2 = set;
        this.j2 = set2;
        this.k2 = v.q(set, set2);
        this.b2 = A0(this.x, hVar);
    }
}
