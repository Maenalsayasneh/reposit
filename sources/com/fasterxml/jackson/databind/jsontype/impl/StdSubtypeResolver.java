package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import i0.f.a.c.n.b;
import i0.f.a.c.n.c;
import i0.f.a.c.p.a;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StdSubtypeResolver extends a implements Serializable {
    public Collection<NamedType> a(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        Class<?> cls;
        List<NamedType> j02;
        AnnotationIntrospector e = mapperConfig.e();
        if (javaType == null) {
            cls = annotatedMember.e();
        } else {
            cls = javaType.c;
        }
        HashMap hashMap = new HashMap();
        if (!(annotatedMember == null || (j02 = e.j0(annotatedMember)) == null)) {
            for (NamedType next : j02) {
                d(c.h(mapperConfig, next.c), next, mapperConfig, e, hashMap);
            }
        }
        d(c.h(mapperConfig, cls), new NamedType(cls, (String) null), mapperConfig, e, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection<NamedType> b(MapperConfig<?> mapperConfig, b bVar) {
        Class<?> cls = bVar.q;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(bVar, new NamedType(cls, (String) null), mapperConfig, hashSet, linkedHashMap);
        return f(cls, hashSet, linkedHashMap);
    }

    public Collection<NamedType> c(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<NamedType> j02;
        AnnotationIntrospector e = mapperConfig.e();
        Class<?> cls = javaType.c;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(c.h(mapperConfig, cls), new NamedType(cls, (String) null), mapperConfig, hashSet, linkedHashMap);
        if (!(annotatedMember == null || (j02 = e.j0(annotatedMember)) == null)) {
            for (NamedType next : j02) {
                e(c.h(mapperConfig, next.c), next, mapperConfig, hashSet, linkedHashMap);
            }
        }
        return f(cls, hashSet, linkedHashMap);
    }

    public void d(b bVar, NamedType namedType, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap<NamedType, NamedType> hashMap) {
        String k02;
        if (!namedType.a() && (k02 = annotationIntrospector.k0(bVar)) != null) {
            namedType = new NamedType(namedType.c, k02);
        }
        NamedType namedType2 = new NamedType(namedType.c, (String) null);
        if (!hashMap.containsKey(namedType2)) {
            hashMap.put(namedType2, namedType);
            List<NamedType> j02 = annotationIntrospector.j0(bVar);
            if (j02 != null && !j02.isEmpty()) {
                for (NamedType next : j02) {
                    d(c.h(mapperConfig, next.c), next, mapperConfig, annotationIntrospector, hashMap);
                }
            }
        } else if (namedType.a() && !hashMap.get(namedType2).a()) {
            hashMap.put(namedType2, namedType);
        }
    }

    public void e(b bVar, NamedType namedType, MapperConfig<?> mapperConfig, Set<Class<?>> set, Map<String, NamedType> map) {
        List<NamedType> j02;
        String k02;
        AnnotationIntrospector e = mapperConfig.e();
        if (!namedType.a() && (k02 = e.k0(bVar)) != null) {
            namedType = new NamedType(namedType.c, k02);
        }
        if (namedType.a()) {
            map.put(namedType.q, namedType);
        }
        if (set.add(namedType.c) && (j02 = e.j0(bVar)) != null && !j02.isEmpty()) {
            for (NamedType next : j02) {
                e(c.h(mapperConfig, next.c), next, mapperConfig, set, map);
            }
        }
    }

    public Collection<NamedType> f(Class<?> cls, Set<Class<?>> set, Map<String, NamedType> map) {
        ArrayList arrayList = new ArrayList(map.values());
        for (NamedType namedType : map.values()) {
            set.remove(namedType.c);
        }
        for (Class<?> next : set) {
            if (next != cls || !Modifier.isAbstract(next.getModifiers())) {
                arrayList.add(new NamedType(next, (String) null));
            }
        }
        return arrayList;
    }
}
