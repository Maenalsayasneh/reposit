package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker;
import h0.b0.v;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.n.j;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.k.b;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@a
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements d {
    public static final JavaType q = TypeFactory.v();
    public static final Object x = JsonInclude.Include.NON_EMPTY;
    public final boolean Y1;
    public final JavaType Z1;
    public final JavaType a2;
    public g<Object> b2;
    public g<Object> c2;
    public final e d2;
    public b e2;
    public final Set<String> f2;
    public final Set<String> g2;
    public final Object h2;
    public final Object i2;
    public final boolean j2;
    public final IgnorePropertiesUtil$Checker k2;
    public final boolean l2;
    public final BeanProperty y;

    public MapSerializer(Set<String> set, Set<String> set2, JavaType javaType, JavaType javaType2, boolean z, e eVar, g<?> gVar, g<?> gVar2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f2 = set;
        this.g2 = set2;
        this.Z1 = javaType;
        this.a2 = javaType2;
        this.Y1 = z;
        this.d2 = eVar;
        this.b2 = gVar;
        this.c2 = gVar2;
        this.e2 = b.C0122b.b;
        this.y = null;
        this.h2 = null;
        this.l2 = false;
        this.i2 = null;
        this.j2 = false;
        this.k2 = v.q(set, set2);
    }

    public static MapSerializer x(Set<String> set, Set<String> set2, JavaType javaType, boolean z, e eVar, g<Object> gVar, g<Object> gVar2, Object obj) {
        JavaType javaType2;
        JavaType javaType3;
        boolean z2;
        JavaType javaType4;
        JavaType javaType5 = javaType;
        Object obj2 = obj;
        boolean z3 = true;
        if (javaType5 == null) {
            javaType3 = q;
            javaType2 = javaType3;
        } else {
            JavaType q2 = javaType.q();
            if (javaType5.c == Properties.class) {
                javaType4 = TypeFactory.v();
            } else {
                javaType4 = javaType.l();
            }
            javaType2 = javaType4;
            javaType3 = q2;
        }
        if (!z) {
            if (javaType2 == null || !javaType2.J()) {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = javaType2.c == Object.class ? false : z;
        }
        MapSerializer mapSerializer = new MapSerializer(set, set2, javaType3, javaType2, z2, eVar, gVar, gVar2);
        if (obj2 == null) {
            return mapSerializer;
        }
        f.M(MapSerializer.class, mapSerializer, "withFilterId");
        return new MapSerializer(mapSerializer, obj2, false);
    }

    public MapSerializer A(Object obj, boolean z) {
        if (obj == this.i2 && z == this.j2) {
            return this;
        }
        f.M(MapSerializer.class, this, "withContentInclusion");
        return new MapSerializer(this, this.d2, obj, z);
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember annotatedMember;
        g gVar;
        g gVar2;
        g gVar3;
        Set<String> set;
        Set<String> set2;
        boolean z;
        JsonInclude.Value value;
        JsonInclude.Include include;
        Object obj;
        Object n;
        Boolean b;
        i iVar2 = iVar;
        BeanProperty beanProperty2 = beanProperty;
        AnnotationIntrospector O = iVar.O();
        Object obj2 = null;
        if (beanProperty2 == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.a();
        }
        if (StdSerializer.k(annotatedMember, O)) {
            Object y2 = O.y(annotatedMember);
            gVar2 = y2 != null ? iVar2.c0(annotatedMember, y2) : null;
            Object d = O.d(annotatedMember);
            gVar = d != null ? iVar2.c0(annotatedMember, d) : null;
        } else {
            gVar2 = null;
            gVar = null;
        }
        if (gVar == null) {
            gVar = this.c2;
        }
        g l = l(iVar2, beanProperty2, gVar);
        if (l == null && this.Y1 && !this.a2.N()) {
            l = iVar2.A(this.a2, beanProperty2);
        }
        g gVar4 = l;
        if (gVar2 == null) {
            gVar2 = this.b2;
        }
        if (gVar2 == null) {
            gVar3 = iVar2.E(this.Z1, beanProperty2);
        } else {
            gVar3 = iVar2.U(gVar2, beanProperty2);
        }
        g gVar5 = gVar3;
        Set<String> set3 = this.f2;
        Set<String> set4 = this.g2;
        boolean z2 = true;
        if (StdSerializer.k(annotatedMember, O)) {
            SerializationConfig serializationConfig = iVar2.q;
            Set<String> d3 = O.T(serializationConfig, annotatedMember).d();
            if (d3 != null && !d3.isEmpty()) {
                set3 = set3 == null ? new HashSet<>() : new HashSet<>(set3);
                for (String add : d3) {
                    set3.add(add);
                }
            }
            Set<String> set5 = O.W(serializationConfig, annotatedMember).d;
            if (set5 != null) {
                set4 = set4 == null ? new HashSet<>() : new HashSet<>(set4);
                for (String add2 : set5) {
                    set4.add(add2);
                }
            }
            z = Boolean.TRUE.equals(O.f0(annotatedMember));
            set2 = set3;
            set = set4;
        } else {
            set2 = set3;
            set = set4;
            z = false;
        }
        JsonFormat.Value m = m(iVar2, beanProperty2, Map.class);
        if (!(m == null || (b = m.b(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) == null)) {
            z = b.booleanValue();
        }
        boolean z3 = z;
        f.M(MapSerializer.class, this, "withResolved");
        MapSerializer mapSerializer = r0;
        MapSerializer mapSerializer2 = new MapSerializer(this, beanProperty, gVar5, gVar4, set2, set);
        MapSerializer mapSerializer3 = z3 != mapSerializer.l2 ? new MapSerializer(mapSerializer, this.h2, z3) : mapSerializer;
        if (!(annotatedMember == null || (n = O.n(annotatedMember)) == null || mapSerializer3.h2 == n)) {
            f.M(MapSerializer.class, mapSerializer3, "withFilterId");
            mapSerializer3 = new MapSerializer(mapSerializer3, n, mapSerializer3.l2);
        }
        Class<Map> cls = Map.class;
        if (beanProperty2 != null) {
            value = beanProperty2.g(iVar2.q, cls);
        } else {
            value = iVar2.q.i(cls);
        }
        if (value == null || (include = value.q) == JsonInclude.Include.USE_DEFAULTS) {
            return mapSerializer3;
        }
        int ordinal = include.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    obj = x;
                } else if (ordinal == 4) {
                    obj = v.k0(this.a2);
                    if (obj != null && obj.getClass().isArray()) {
                        obj = i0.f.a.c.t.b.a(obj);
                    }
                } else if (ordinal != 5) {
                    z2 = false;
                } else {
                    obj2 = iVar2.V((j) null, value.y);
                    if (obj2 != null) {
                        z2 = iVar2.W(obj2);
                    }
                }
            } else if (this.a2.d()) {
                obj = x;
            }
            obj2 = obj;
        }
        return mapSerializer3.A(obj2, z2);
    }

    public boolean d(i iVar, Object obj) {
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return true;
        }
        Object obj2 = this.i2;
        if (obj2 != null || this.j2) {
            g<Object> gVar = this.c2;
            boolean z = x == obj2;
            if (gVar != null) {
                for (Object next : map.values()) {
                    if (next == null) {
                        if (this.j2) {
                        }
                    } else if (z) {
                        if (!gVar.d(iVar, next)) {
                        }
                    } else if (obj2 != null && obj2.equals(map)) {
                    }
                }
                return true;
            }
            for (Object next2 : map.values()) {
                if (next2 != null) {
                    try {
                        g<Object> w = w(iVar, next2);
                        if (z) {
                            if (!w.d(iVar, next2)) {
                            }
                        } else if (obj2 != null && obj2.equals(map)) {
                        }
                    } catch (JsonMappingException unused) {
                    }
                } else if (this.j2) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Map map = (Map) obj;
        jsonGenerator.N0(map);
        z(map, jsonGenerator, iVar);
        jsonGenerator.U();
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Map map = (Map) obj;
        jsonGenerator.w(map);
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(map, JsonToken.START_OBJECT));
        z(map, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public ContainerSerializer v(e eVar) {
        if (this.d2 == eVar) {
            return this;
        }
        f.M(MapSerializer.class, this, "_withValueTypeSerializer");
        return new MapSerializer(this, eVar, this.i2, this.j2);
    }

    public final g<Object> w(i iVar, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        g<Object> c = this.e2.c(cls);
        if (c != null) {
            return c;
        }
        if (this.a2.y()) {
            b bVar = this.e2;
            b.d a = bVar.a(iVar.y(this.a2, cls), iVar, this.y);
            b bVar2 = a.b;
            if (bVar != bVar2) {
                this.e2 = bVar2;
            }
            return a.a;
        }
        b bVar3 = this.e2;
        BeanProperty beanProperty = this.y;
        Objects.requireNonNull(bVar3);
        g<Object> C = iVar.C(cls, beanProperty);
        b b = bVar3.b(cls, C);
        if (bVar3 != b) {
            this.e2 = b;
        }
        return C;
    }

    public void y(Map<?, ?> map, JsonGenerator jsonGenerator, i iVar, Object obj) throws IOException {
        g<Object> gVar;
        g<Object> gVar2;
        boolean z = x == obj;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                gVar = iVar.d2;
            } else {
                IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker = this.k2;
                if (ignorePropertiesUtil$Checker == null || !ignorePropertiesUtil$Checker.a(key)) {
                    gVar = this.b2;
                }
            }
            Object value = next.getValue();
            if (value != null) {
                gVar2 = this.c2;
                if (gVar2 == null) {
                    gVar2 = w(iVar, value);
                }
                if (z) {
                    if (gVar2.d(iVar, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.j2) {
                gVar2 = iVar.c2;
            }
            gVar.f(key, jsonGenerator, iVar);
            try {
                gVar2.g(value, jsonGenerator, iVar, this.d2);
            } catch (Exception e) {
                q(iVar, e, map, String.valueOf(key));
                throw null;
            }
        }
    }

    public void z(Map<?, ?> map, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar;
        g<Object> gVar2;
        Object obj;
        TreeMap treeMap;
        g<Object> gVar3;
        if (!map.isEmpty()) {
            boolean z = true;
            if ((this.l2 || iVar.Y(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) && !(map instanceof SortedMap)) {
                if ((map instanceof HashMap) && map.containsKey((Object) null)) {
                    treeMap = new TreeMap();
                    for (Map.Entry next : map.entrySet()) {
                        Object key = next.getKey();
                        if (key == null) {
                            Object value = next.getValue();
                            g<Object> gVar4 = iVar.d2;
                            if (value != null) {
                                gVar3 = this.c2;
                                if (gVar3 == null) {
                                    gVar3 = w(iVar, value);
                                }
                                Object obj2 = this.i2;
                                if (obj2 == x) {
                                    if (gVar3.d(iVar, value)) {
                                    }
                                } else if (obj2 != null && obj2.equals(value)) {
                                }
                            } else if (!this.j2) {
                                gVar3 = iVar.c2;
                            }
                            try {
                                gVar4.f(null, jsonGenerator, iVar);
                                gVar3.f(value, jsonGenerator, iVar);
                            } catch (Exception e) {
                                q(iVar, e, value, "");
                                throw null;
                            }
                        } else {
                            treeMap.put(key, next.getValue());
                        }
                    }
                } else {
                    treeMap = new TreeMap(map);
                }
                map = treeMap;
            }
            Object obj3 = this.h2;
            if (obj3 == null) {
                Object obj4 = this.i2;
                if (obj4 == null && !this.j2) {
                    g<Object> gVar5 = this.c2;
                    if (gVar5 != null) {
                        g<Object> gVar6 = this.b2;
                        e eVar = this.d2;
                        for (Map.Entry next2 : map.entrySet()) {
                            Object key2 = next2.getKey();
                            IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker = this.k2;
                            if (ignorePropertiesUtil$Checker == null || !ignorePropertiesUtil$Checker.a(key2)) {
                                if (key2 == null) {
                                    iVar.d2.f(null, jsonGenerator, iVar);
                                } else {
                                    gVar6.f(key2, jsonGenerator, iVar);
                                }
                                Object value2 = next2.getValue();
                                if (value2 == null) {
                                    iVar.z(jsonGenerator);
                                } else if (eVar == null) {
                                    try {
                                        gVar5.f(value2, jsonGenerator, iVar);
                                    } catch (Exception e3) {
                                        q(iVar, e3, map, String.valueOf(key2));
                                        throw null;
                                    }
                                } else {
                                    gVar5.g(value2, jsonGenerator, iVar, eVar);
                                }
                            }
                        }
                    } else if (this.d2 != null) {
                        y(map, jsonGenerator, iVar, (Object) null);
                    } else {
                        g<Object> gVar7 = this.b2;
                        try {
                            obj = null;
                            for (Map.Entry next3 : map.entrySet()) {
                                try {
                                    Object value3 = next3.getValue();
                                    obj = next3.getKey();
                                    if (obj == null) {
                                        iVar.d2.f(null, jsonGenerator, iVar);
                                    } else {
                                        IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker2 = this.k2;
                                        if (ignorePropertiesUtil$Checker2 == null || !ignorePropertiesUtil$Checker2.a(obj)) {
                                            gVar7.f(obj, jsonGenerator, iVar);
                                        }
                                    }
                                    if (value3 == null) {
                                        iVar.z(jsonGenerator);
                                    } else {
                                        g<Object> gVar8 = this.c2;
                                        if (gVar8 == null) {
                                            gVar8 = w(iVar, value3);
                                        }
                                        gVar8.f(value3, jsonGenerator, iVar);
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    q(iVar, e, map, String.valueOf(obj));
                                    throw null;
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            obj = null;
                            q(iVar, e, map, String.valueOf(obj));
                            throw null;
                        }
                    }
                } else if (this.d2 != null) {
                    y(map, jsonGenerator, iVar, obj4);
                } else {
                    if (x != obj4) {
                        z = false;
                    }
                    for (Map.Entry next4 : map.entrySet()) {
                        Object key3 = next4.getKey();
                        if (key3 == null) {
                            gVar = iVar.d2;
                        } else {
                            IgnorePropertiesUtil$Checker ignorePropertiesUtil$Checker3 = this.k2;
                            if (ignorePropertiesUtil$Checker3 == null || !ignorePropertiesUtil$Checker3.a(key3)) {
                                gVar = this.b2;
                            }
                        }
                        Object value4 = next4.getValue();
                        if (value4 != null) {
                            gVar2 = this.c2;
                            if (gVar2 == null) {
                                gVar2 = w(iVar, value4);
                            }
                            if (z) {
                                if (gVar2.d(iVar, value4)) {
                                }
                            } else if (obj4 != null && obj4.equals(value4)) {
                            }
                        } else if (!this.j2) {
                            gVar2 = iVar.c2;
                        }
                        try {
                            gVar.f(key3, jsonGenerator, iVar);
                            gVar2.f(value4, jsonGenerator, iVar);
                        } catch (Exception e6) {
                            q(iVar, e6, map, String.valueOf(key3));
                            throw null;
                        }
                    }
                }
            } else {
                n(iVar, obj3, map);
                throw null;
            }
        }
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, g<?> gVar, g<?> gVar2, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f2 = set;
        this.g2 = set2;
        this.Z1 = mapSerializer.Z1;
        this.a2 = mapSerializer.a2;
        this.Y1 = mapSerializer.Y1;
        this.d2 = mapSerializer.d2;
        this.b2 = gVar;
        this.c2 = gVar2;
        this.e2 = b.C0122b.b;
        this.y = beanProperty;
        this.h2 = mapSerializer.h2;
        this.l2 = mapSerializer.l2;
        this.i2 = mapSerializer.i2;
        this.j2 = mapSerializer.j2;
        this.k2 = v.q(set, set2);
    }

    public MapSerializer(MapSerializer mapSerializer, e eVar, Object obj, boolean z) {
        super(Map.class, false);
        this.f2 = mapSerializer.f2;
        this.g2 = mapSerializer.g2;
        this.Z1 = mapSerializer.Z1;
        this.a2 = mapSerializer.a2;
        this.Y1 = mapSerializer.Y1;
        this.d2 = eVar;
        this.b2 = mapSerializer.b2;
        this.c2 = mapSerializer.c2;
        this.e2 = mapSerializer.e2;
        this.y = mapSerializer.y;
        this.h2 = mapSerializer.h2;
        this.l2 = mapSerializer.l2;
        this.i2 = obj;
        this.j2 = z;
        this.k2 = mapSerializer.k2;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.f2 = mapSerializer.f2;
        this.g2 = mapSerializer.g2;
        this.Z1 = mapSerializer.Z1;
        this.a2 = mapSerializer.a2;
        this.Y1 = mapSerializer.Y1;
        this.d2 = mapSerializer.d2;
        this.b2 = mapSerializer.b2;
        this.c2 = mapSerializer.c2;
        this.e2 = b.C0122b.b;
        this.y = mapSerializer.y;
        this.h2 = obj;
        this.l2 = z;
        this.i2 = mapSerializer.i2;
        this.j2 = mapSerializer.j2;
        this.k2 = mapSerializer.k2;
    }
}
