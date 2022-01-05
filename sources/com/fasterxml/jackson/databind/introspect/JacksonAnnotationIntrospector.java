package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.a.e;
import i0.f.a.a.i;
import i0.f.a.a.j;
import i0.f.a.a.m;
import i0.f.a.a.n;
import i0.f.a.a.o;
import i0.f.a.a.p;
import i0.f.a.a.r;
import i0.f.a.a.s;
import i0.f.a.a.t;
import i0.f.a.a.u;
import i0.f.a.a.v;
import i0.f.a.a.w;
import i0.f.a.a.x;
import i0.f.a.a.y;
import i0.f.a.c.d;
import i0.f.a.c.g;
import i0.f.a.c.h;
import i0.f.a.c.j.b;
import i0.f.a.c.j.c;
import i0.f.a.c.j.d;
import i0.f.a.c.j.e;
import i0.f.a.c.n.a;
import i0.f.a.c.n.b;
import i0.f.a.c.n.h;
import i0.f.a.c.t.f;
import i0.f.a.c.t.g;
import i0.f.a.c.t.k;
import i0.f.a.c.t.l;
import i0.f.a.c.t.q;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final Class<? extends Annotation>[] c = {JsonSerialize.class, y.class, JsonFormat.class, JsonTypeInfo.class, r.class, w.class, e.class, n.class};
    public static final Class<? extends Annotation>[] d = {c.class, y.class, JsonFormat.class, JsonTypeInfo.class, w.class, e.class, n.class, o.class};
    public static final i0.f.a.c.m.c q;
    public transient LRUMap<Class<?>, Boolean> x = new LRUMap<>(48, 48);
    public boolean y = true;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 8
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r2 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<i0.f.a.a.y> r2 = i0.f.a.a.y.class
            r4 = 1
            r1[r4] = r2
            java.lang.Class<com.fasterxml.jackson.annotation.JsonFormat> r2 = com.fasterxml.jackson.annotation.JsonFormat.class
            r5 = 2
            r1[r5] = r2
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            r6 = 3
            r1[r6] = r2
            java.lang.Class<i0.f.a.a.r> r2 = i0.f.a.a.r.class
            r7 = 4
            r1[r7] = r2
            java.lang.Class<i0.f.a.a.w> r2 = i0.f.a.a.w.class
            r8 = 5
            r1[r8] = r2
            java.lang.Class<i0.f.a.a.e> r2 = i0.f.a.a.e.class
            r9 = 6
            r1[r9] = r2
            java.lang.Class<i0.f.a.a.n> r2 = i0.f.a.a.n.class
            r10 = 7
            r1[r10] = r2
            c = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<i0.f.a.c.j.c> r1 = i0.f.a.c.j.c.class
            r0[r3] = r1
            java.lang.Class<i0.f.a.a.y> r1 = i0.f.a.a.y.class
            r0[r4] = r1
            java.lang.Class<com.fasterxml.jackson.annotation.JsonFormat> r1 = com.fasterxml.jackson.annotation.JsonFormat.class
            r0[r5] = r1
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            r0[r6] = r1
            java.lang.Class<i0.f.a.a.w> r1 = i0.f.a.a.w.class
            r0[r7] = r1
            java.lang.Class<i0.f.a.a.e> r1 = i0.f.a.a.e.class
            r0[r8] = r1
            java.lang.Class<i0.f.a.a.n> r1 = i0.f.a.a.n.class
            r0[r9] = r1
            java.lang.Class<i0.f.a.a.o> r1 = i0.f.a.a.o.class
            r0[r10] = r1
            d = r0
            i0.f.a.c.m.c r0 = i0.f.a.c.m.c.a     // Catch:{ all -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.<clinit>():void");
    }

    public PropertyName A(a aVar) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) aVar.c(JsonSetter.class);
        boolean z2 = false;
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return PropertyName.a(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) aVar.c(JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return PropertyName.b(jsonProperty.value(), str);
        }
        if (!z) {
            Class<? extends Annotation>[] clsArr = d;
            h hVar = ((AnnotatedMember) aVar).d;
            if (hVar != null) {
                z2 = hVar.b(clsArr);
            }
            if (!z2) {
                return null;
            }
        }
        return PropertyName.c;
    }

    public Boolean A0(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(annotatedMember.m(u.class));
    }

    public JavaType B0(MapperConfig<?> mapperConfig, a aVar, JavaType javaType) throws JsonMappingException {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        TypeFactory typeFactory = mapperConfig.d.d;
        c cVar = (c) aVar.c(c.class);
        if (cVar == null) {
            cls = null;
        } else {
            cls = E0(cVar.as());
        }
        if (cls != null) {
            if (!(javaType.c == cls) && !H0(javaType, cls)) {
                try {
                    javaType = typeFactory.l(javaType, cls, false);
                } catch (IllegalArgumentException e) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[]{javaType, cls.getName(), aVar.d(), e.getMessage()}), (Throwable) e);
                }
            }
        }
        if (javaType.O()) {
            JavaType q2 = javaType.q();
            if (cVar == null) {
                cls3 = null;
            } else {
                cls3 = E0(cVar.keyAs());
            }
            if (cls3 != null && !H0(q2, cls3)) {
                try {
                    javaType = ((MapLikeType) javaType).i0(typeFactory.l(q2, cls3, false));
                } catch (IllegalArgumentException e2) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls3.getName(), aVar.d(), e2.getMessage()}), (Throwable) e2);
                }
            }
        }
        JavaType l = javaType.l();
        if (l == null) {
            return javaType;
        }
        if (cVar == null) {
            cls2 = null;
        } else {
            cls2 = E0(cVar.contentAs());
        }
        if (cls2 == null || H0(l, cls2)) {
            return javaType;
        }
        try {
            return javaType.W(typeFactory.l(l, cls2, false));
        } catch (IllegalArgumentException e3) {
            throw new JsonMappingException((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls2.getName(), aVar.d(), e3.getMessage()}), (Throwable) e3);
        }
    }

    public PropertyName C(a aVar) {
        boolean z;
        i0.f.a.a.h hVar = (i0.f.a.a.h) aVar.c(i0.f.a.a.h.class);
        boolean z2 = false;
        if (hVar != null) {
            String value = hVar.value();
            if (!value.isEmpty()) {
                return PropertyName.a(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) aVar.c(JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return PropertyName.b(jsonProperty.value(), str);
        }
        if (!z) {
            Class<? extends Annotation>[] clsArr = c;
            h hVar2 = ((AnnotatedMember) aVar).d;
            if (hVar2 != null) {
                z2 = hVar2.b(clsArr);
            }
            if (!z2) {
                return null;
            }
        }
        return PropertyName.c;
    }

    public JavaType C0(MapperConfig<?> mapperConfig, a aVar, JavaType javaType) throws JsonMappingException {
        Class<?> cls;
        Class<?> cls2;
        JavaType javaType2;
        Class<?> cls3;
        JavaType javaType3;
        TypeFactory typeFactory = mapperConfig.d.d;
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize == null) {
            cls = null;
        } else {
            cls = E0(jsonSerialize.as());
        }
        if (cls != null) {
            Class<?> cls4 = javaType.c;
            if (cls4 == cls) {
                javaType = javaType.a0();
            } else {
                try {
                    if (cls.isAssignableFrom(cls4)) {
                        javaType = typeFactory.i(javaType, cls);
                    } else if (cls4.isAssignableFrom(cls)) {
                        javaType = typeFactory.l(javaType, cls, false);
                    } else if (I0(cls4, cls)) {
                        javaType = javaType.a0();
                    } else {
                        throw new JsonMappingException((Closeable) null, String.format("Cannot refine serialization type %s into %s; types not related", new Object[]{javaType, cls.getName()}));
                    }
                } catch (IllegalArgumentException e) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[]{javaType, cls.getName(), aVar.d(), e.getMessage()}), (Throwable) e);
                }
            }
        }
        if (javaType.O()) {
            JavaType q2 = javaType.q();
            if (jsonSerialize == null) {
                cls3 = null;
            } else {
                cls3 = E0(jsonSerialize.keyAs());
            }
            if (cls3 != null) {
                Class<?> cls5 = q2.c;
                if (cls5 == cls3) {
                    javaType3 = q2.a0();
                } else {
                    try {
                        if (cls3.isAssignableFrom(cls5)) {
                            javaType3 = typeFactory.i(q2, cls3);
                        } else if (cls5.isAssignableFrom(cls3)) {
                            javaType3 = typeFactory.l(q2, cls3, false);
                        } else if (I0(cls5, cls3)) {
                            javaType3 = q2.a0();
                        } else {
                            throw new JsonMappingException((Closeable) null, String.format("Cannot refine serialization key type %s into %s; types not related", new Object[]{q2, cls3.getName()}));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new JsonMappingException((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls3.getName(), aVar.d(), e2.getMessage()}), (Throwable) e2);
                    }
                }
                javaType = ((MapLikeType) javaType).i0(javaType3);
            }
        }
        JavaType l = javaType.l();
        if (l == null) {
            return javaType;
        }
        if (jsonSerialize == null) {
            cls2 = null;
        } else {
            cls2 = E0(jsonSerialize.contentAs());
        }
        if (cls2 == null) {
            return javaType;
        }
        Class<?> cls6 = l.c;
        if (cls6 == cls2) {
            javaType2 = l.a0();
        } else {
            try {
                if (cls2.isAssignableFrom(cls6)) {
                    javaType2 = typeFactory.i(l, cls2);
                } else if (cls6.isAssignableFrom(cls2)) {
                    javaType2 = typeFactory.l(l, cls2, false);
                } else if (I0(cls6, cls2)) {
                    javaType2 = l.a0();
                } else {
                    throw new JsonMappingException((Closeable) null, String.format("Cannot refine serialization content type %s into %s; types not related", new Object[]{l, cls2.getName()}));
                }
            } catch (IllegalArgumentException e3) {
                throw new JsonMappingException((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls2.getName(), aVar.d(), e3.getMessage()}), (Throwable) e3);
            }
        }
        return javaType.W(javaType2);
    }

    public AnnotatedMethod D0(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<String> cls = String.class;
        Class<?> z = annotatedMethod.z(0);
        Class<?> z2 = annotatedMethod2.z(0);
        if (z.isPrimitive()) {
            if (!z2.isPrimitive()) {
                return annotatedMethod;
            }
        } else if (z2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (z == cls) {
            if (z2 != cls) {
                return annotatedMethod;
            }
            return null;
        } else if (z2 == cls) {
            return annotatedMethod2;
        } else {
            return null;
        }
    }

    public Object E(b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar == null) {
            return null;
        }
        return dVar.value();
    }

    public Class<?> E0(Class<?> cls) {
        if (cls == null || f.v(cls)) {
            return null;
        }
        return cls;
    }

    public Object F(a aVar) {
        Class<? extends g> nullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize == null || (nullsUsing = jsonSerialize.nullsUsing()) == g.a.class) {
            return null;
        }
        return nullsUsing;
    }

    public Class<?> F0(Class<?> cls, Class<?> cls2) {
        Class<?> E0 = E0(cls);
        if (E0 == null || E0 == cls2) {
            return null;
        }
        return E0;
    }

    public i0.f.a.c.n.n G(a aVar) {
        i iVar = (i) aVar.c(i.class);
        if (iVar == null || iVar.generator() == ObjectIdGenerators$None.class) {
            return null;
        }
        return new i0.f.a.c.n.n(PropertyName.a(iVar.property()), iVar.scope(), iVar.generator(), false, iVar.resolver());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: i0.f.a.c.p.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.p.d<?> G0(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5, i0.f.a.c.n.a r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
            r4 = this;
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            java.lang.annotation.Annotation r0 = r6.c(r0)
            com.fasterxml.jackson.annotation.JsonTypeInfo r0 = (com.fasterxml.jackson.annotation.JsonTypeInfo) r0
            java.lang.Class<i0.f.a.c.j.g> r1 = i0.f.a.c.j.g.class
            java.lang.annotation.Annotation r1 = r6.c(r1)
            i0.f.a.c.j.g r1 = (i0.f.a.c.j.g) r1
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.Class r1 = r1.value()
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r5.d
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r5.b()
            java.lang.Object r1 = i0.f.a.c.t.f.i(r1, r3)
            i0.f.a.c.p.d r1 = (i0.f.a.c.p.d) r1
            goto L_0x0043
        L_0x002a:
            if (r0 != 0) goto L_0x002d
            return r2
        L_0x002d:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r1 = r0.use()
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE
            if (r1 != r3) goto L_0x003e
            i0.f.a.c.p.f.h r5 = new i0.f.a.c.p.f.h
            r5.<init>()
            r5.j(r3, r2)
            return r5
        L_0x003e:
            i0.f.a.c.p.f.h r1 = new i0.f.a.c.p.f.h
            r1.<init>()
        L_0x0043:
            java.lang.Class<i0.f.a.c.j.f> r3 = i0.f.a.c.j.f.class
            java.lang.annotation.Annotation r3 = r6.c(r3)
            i0.f.a.c.j.f r3 = (i0.f.a.c.j.f) r3
            if (r3 != 0) goto L_0x004e
            goto L_0x0062
        L_0x004e:
            java.lang.Class r2 = r3.value()
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r5.d
            java.util.Objects.requireNonNull(r3)
            boolean r5 = r5.b()
            java.lang.Object r5 = i0.f.a.c.t.f.i(r2, r5)
            r2 = r5
            i0.f.a.c.p.c r2 = (i0.f.a.c.p.c) r2
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.c(r7)
        L_0x0067:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r5 = r0.use()
            i0.f.a.c.p.d r5 = r1.c(r5, r2)
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r7 = r0.include()
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY
            if (r7 != r1) goto L_0x007d
            boolean r6 = r6 instanceof i0.f.a.c.n.b
            if (r6 == 0) goto L_0x007d
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r7 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY
        L_0x007d:
            i0.f.a.c.p.d r5 = r5.g(r7)
            java.lang.String r6 = r0.property()
            i0.f.a.c.p.d r5 = r5.d(r6)
            java.lang.Class r6 = r0.defaultImpl()
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo$a> r7 = com.fasterxml.jackson.annotation.JsonTypeInfo.a.class
            if (r6 == r7) goto L_0x009b
            boolean r7 = r6.isAnnotation()
            if (r7 != 0) goto L_0x009b
            i0.f.a.c.p.d r5 = r5.e(r6)
        L_0x009b:
            boolean r6 = r0.visible()
            i0.f.a.c.p.d r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.G0(com.fasterxml.jackson.databind.cfg.MapperConfig, i0.f.a.c.n.a, com.fasterxml.jackson.databind.JavaType):i0.f.a.c.p.d");
    }

    public i0.f.a.c.n.n H(a aVar, i0.f.a.c.n.n nVar) {
        j jVar = (j) aVar.c(j.class);
        if (jVar == null) {
            return nVar;
        }
        if (nVar == null) {
            nVar = i0.f.a.c.n.n.a;
        }
        boolean alwaysAsId = jVar.alwaysAsId();
        return nVar.f == alwaysAsId ? nVar : new i0.f.a.c.n.n(nVar.b, nVar.e, nVar.c, alwaysAsId, nVar.d);
    }

    public final boolean H0(JavaType javaType, Class<?> cls) {
        if (javaType.Q()) {
            return javaType.A(f.F(cls));
        }
        if (!cls.isPrimitive() || cls != f.F(javaType.c)) {
            return false;
        }
        return true;
    }

    public Class<?> I(b bVar) {
        c cVar = (c) bVar.c(c.class);
        if (cVar == null) {
            return null;
        }
        return E0(cVar.builder());
    }

    public final boolean I0(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            if (cls == f.F(cls2)) {
                return true;
            }
            return false;
        } else if (!cls2.isPrimitive()) {
            return false;
        } else {
            if (cls2 == f.F(cls)) {
                return true;
            }
            return false;
        }
    }

    public e.a J(b bVar) {
        i0.f.a.c.j.e eVar = (i0.f.a.c.j.e) bVar.c(i0.f.a.c.j.e.class);
        if (eVar == null) {
            return null;
        }
        return new e.a(eVar);
    }

    public PropertyName J0(String str, String str2) {
        if (str.isEmpty()) {
            return PropertyName.c;
        }
        if (str2 == null || str2.isEmpty()) {
            return PropertyName.a(str);
        }
        return PropertyName.b(str, str2);
    }

    public JsonProperty.Access M(a aVar) {
        JsonProperty jsonProperty = (JsonProperty) aVar.c(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    public List<PropertyName> N(a aVar) {
        i0.f.a.a.b bVar = (i0.f.a.a.b) aVar.c(i0.f.a.a.b.class);
        if (bVar == null) {
            return null;
        }
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (String a : bVar.value()) {
            arrayList.add(PropertyName.a(a));
        }
        return arrayList;
    }

    public i0.f.a.c.p.d<?> O(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.l() != null) {
            return G0(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    public String Q(a aVar) {
        JsonProperty jsonProperty = (JsonProperty) aVar.c(JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String defaultValue = jsonProperty.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    public String R(a aVar) {
        p pVar = (p) aVar.c(p.class);
        if (pVar == null) {
            return null;
        }
        return pVar.value();
    }

    public JsonIgnoreProperties.Value T(MapperConfig<?> mapperConfig, a aVar) {
        HashSet hashSet;
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) aVar.c(JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return JsonIgnoreProperties.Value.c;
        }
        JsonIgnoreProperties.Value value = JsonIgnoreProperties.Value.c;
        String[] value2 = jsonIgnoreProperties.value();
        if (value2 == null || value2.length == 0) {
            hashSet = Collections.emptySet();
        } else {
            HashSet hashSet2 = new HashSet(value2.length);
            for (String add : value2) {
                hashSet2.add(add);
            }
            hashSet = hashSet2;
        }
        return JsonIgnoreProperties.Value.b(hashSet, jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
    }

    @Deprecated
    public JsonIgnoreProperties.Value U(a aVar) {
        return T((MapperConfig<?>) null, aVar);
    }

    public JsonInclude.Value V(a aVar) {
        JsonInclude.Value value;
        JsonSerialize jsonSerialize;
        JsonInclude.Value value2;
        JsonInclude jsonInclude = (JsonInclude) aVar.c(JsonInclude.class);
        if (jsonInclude == null) {
            value = JsonInclude.Value.c;
        } else {
            JsonInclude.Value value3 = JsonInclude.Value.c;
            JsonInclude.Include value4 = jsonInclude.value();
            JsonInclude.Include content = jsonInclude.content();
            JsonInclude.Include include = JsonInclude.Include.USE_DEFAULTS;
            if (value4 == include && content == include) {
                value = JsonInclude.Value.c;
            } else {
                Class<?> valueFilter = jsonInclude.valueFilter();
                Class<?> cls = null;
                if (valueFilter == Void.class) {
                    valueFilter = null;
                }
                Class<?> contentFilter = jsonInclude.contentFilter();
                if (contentFilter != Void.class) {
                    cls = contentFilter;
                }
                value = new JsonInclude.Value(value4, content, valueFilter, cls);
            }
        }
        if (value.d != JsonInclude.Include.USE_DEFAULTS || (jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class)) == null) {
            return value;
        }
        int ordinal = jsonSerialize.include().ordinal();
        if (ordinal == 0) {
            value2 = value.b(JsonInclude.Include.ALWAYS);
        } else if (ordinal == 1) {
            value2 = value.b(JsonInclude.Include.NON_NULL);
        } else if (ordinal == 2) {
            value2 = value.b(JsonInclude.Include.NON_DEFAULT);
        } else if (ordinal != 3) {
            return value;
        } else {
            value2 = value.b(JsonInclude.Include.NON_EMPTY);
        }
        return value2;
    }

    public JsonIncludeProperties.Value W(MapperConfig<?> mapperConfig, a aVar) {
        HashSet hashSet;
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) aVar.c(JsonIncludeProperties.class);
        if (jsonIncludeProperties == null) {
            return JsonIncludeProperties.Value.c;
        }
        String[] value = jsonIncludeProperties.value();
        if (value == null || value.length == 0) {
            hashSet = Collections.emptySet();
        } else {
            HashSet hashSet2 = new HashSet(value.length);
            for (String add : value) {
                hashSet2.add(add);
            }
            hashSet = hashSet2;
        }
        return new JsonIncludeProperties.Value(hashSet);
    }

    public Integer X(a aVar) {
        int index;
        JsonProperty jsonProperty = (JsonProperty) aVar.c(JsonProperty.class);
        if (jsonProperty == null || (index = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    public i0.f.a.c.p.d<?> Y(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.G() || javaType.d()) {
            return null;
        }
        return G0(mapperConfig, annotatedMember, javaType);
    }

    public AnnotationIntrospector.ReferenceProperty Z(AnnotatedMember annotatedMember) {
        n nVar = (n) annotatedMember.c(n.class);
        if (nVar != null) {
            return new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, nVar.value());
        }
        i0.f.a.a.e eVar = (i0.f.a.a.e) annotatedMember.c(i0.f.a.a.e.class);
        if (eVar == null) {
            return null;
        }
        return new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE, eVar.value());
    }

    public void a(MapperConfig<?> mapperConfig, b bVar, List<BeanPropertyWriter> list) {
        MapperConfig<?> mapperConfig2 = mapperConfig;
        b bVar2 = bVar;
        List<BeanPropertyWriter> list2 = list;
        i0.f.a.c.j.b bVar3 = (i0.f.a.c.j.b) bVar2.d2.a(i0.f.a.c.j.b.class);
        if (bVar3 != null) {
            boolean prepend = bVar3.prepend();
            b.a[] attrs = bVar3.attrs();
            int length = attrs.length;
            i0.f.a.c.s.a aVar = null;
            JavaType javaType = null;
            int i = 0;
            while (i < length) {
                if (javaType == null) {
                    javaType = mapperConfig2.d.d.b(aVar, Object.class, TypeFactory.q);
                }
                b.a aVar2 = attrs[i];
                PropertyMetadata propertyMetadata = aVar2.required() ? PropertyMetadata.c : PropertyMetadata.d;
                String value = aVar2.value();
                PropertyName J0 = J0(aVar2.propName(), aVar2.propNamespace());
                if (!J0.c()) {
                    J0 = PropertyName.a(value);
                }
                AttributePropertyWriter attributePropertyWriter = new AttributePropertyWriter(value, q.L(mapperConfig2, new VirtualAnnotatedMember(bVar2, bVar2.q, value, javaType), J0, propertyMetadata, aVar2.include()), bVar2.d2, javaType);
                if (prepend) {
                    list2.add(i, attributePropertyWriter);
                } else {
                    list2.add(attributePropertyWriter);
                }
                i++;
                aVar = null;
            }
            b.C0120b[] props = bVar3.props();
            int length2 = props.length;
            for (int i2 = 0; i2 < length2; i2++) {
                b.C0120b bVar4 = props[i2];
                PropertyMetadata propertyMetadata2 = bVar4.required() ? PropertyMetadata.c : PropertyMetadata.d;
                PropertyName J02 = J0(bVar4.name(), bVar4.namespace());
                JavaType d2 = mapperConfig2.d(bVar4.type());
                q L = q.L(mapperConfig2, new VirtualAnnotatedMember(bVar2, bVar2.q, J02.q, d2), J02, propertyMetadata2, bVar4.include());
                Class<? extends VirtualBeanPropertyWriter> value2 = bVar4.value();
                Objects.requireNonNull(mapperConfig2.d);
                VirtualBeanPropertyWriter q2 = ((VirtualBeanPropertyWriter) f.i(value2, mapperConfig.b())).q(mapperConfig2, bVar2, L, d2);
                if (prepend) {
                    list2.add(i2, q2);
                } else {
                    list2.add(q2);
                }
            }
        }
    }

    public PropertyName a0(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public VisibilityChecker<?> b(i0.f.a.c.n.b bVar, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) bVar.c(JsonAutoDetect.class);
        if (jsonAutoDetect == null) {
            return visibilityChecker;
        }
        VisibilityChecker.Std std = (VisibilityChecker.Std) visibilityChecker;
        Objects.requireNonNull(std);
        return std.b(std.a(std.d, jsonAutoDetect.getterVisibility()), std.a(std.q, jsonAutoDetect.isGetterVisibility()), std.a(std.x, jsonAutoDetect.setterVisibility()), std.a(std.y, jsonAutoDetect.creatorVisibility()), std.a(std.Y1, jsonAutoDetect.fieldVisibility()));
    }

    public PropertyName b0(i0.f.a.c.n.b bVar) {
        s sVar = (s) bVar.c(s.class);
        String str = null;
        if (sVar == null) {
            return null;
        }
        String namespace = sVar.namespace();
        if (namespace == null || !namespace.isEmpty()) {
            str = namespace;
        }
        return PropertyName.b(sVar.value(), str);
    }

    public Object c(a aVar) {
        Class<? extends i0.f.a.c.d> contentUsing;
        c cVar = (c) aVar.c(c.class);
        if (cVar == null || (contentUsing = cVar.contentUsing()) == d.a.class) {
            return null;
        }
        return contentUsing;
    }

    public Object c0(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotatedMember.c(JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return F0(jsonSerialize.contentConverter(), g.a.class);
    }

    public Object d(a aVar) {
        Class<? extends i0.f.a.c.g> contentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize == null || (contentUsing = jsonSerialize.contentUsing()) == g.a.class) {
            return null;
        }
        return contentUsing;
    }

    public Object d0(a aVar) {
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return F0(jsonSerialize.converter(), g.a.class);
    }

    public JsonCreator.Mode e(MapperConfig<?> mapperConfig, a aVar) {
        i0.f.a.c.m.c cVar;
        Boolean c2;
        JsonCreator jsonCreator = (JsonCreator) aVar.c(JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (!this.y || !mapperConfig.q(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) || !(aVar instanceof AnnotatedConstructor) || (cVar = q) == null || (c2 = cVar.c(aVar)) == null || !c2.booleanValue()) {
            return null;
        }
        return JsonCreator.Mode.PROPERTIES;
    }

    public String[] e0(i0.f.a.c.n.b bVar) {
        i0.f.a.a.q qVar = (i0.f.a.a.q) bVar.c(i0.f.a.a.q.class);
        if (qVar == null) {
            return null;
        }
        return qVar.value();
    }

    @Deprecated
    public JsonCreator.Mode f(a aVar) {
        JsonCreator jsonCreator = (JsonCreator) aVar.c(JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    public Boolean f0(a aVar) {
        i0.f.a.a.q qVar = (i0.f.a.a.q) aVar.c(i0.f.a.a.q.class);
        if (qVar == null || !qVar.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    public Enum<?> g(Class<Enum<?>> cls) {
        Class cls2 = i0.f.a.a.f.class;
        Annotation[] annotationArr = f.a;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> enumR : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(enumR.name())) {
                        return enumR;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public JsonSerialize.Typing g0(a aVar) {
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    public Object h(AnnotatedMember annotatedMember) {
        c cVar = (c) annotatedMember.c(c.class);
        if (cVar == null) {
            return null;
        }
        return F0(cVar.contentConverter(), g.a.class);
    }

    public Object h0(a aVar) {
        Class<? extends i0.f.a.c.g> using;
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize != null && (using = jsonSerialize.using()) != g.a.class) {
            return using;
        }
        r rVar = (r) aVar.c(r.class);
        if (rVar == null || !rVar.value()) {
            return null;
        }
        return new RawSerializer(aVar.e());
    }

    public Object i(a aVar) {
        c cVar = (c) aVar.c(c.class);
        if (cVar == null) {
            return null;
        }
        return F0(cVar.converter(), g.a.class);
    }

    public JsonSetter.Value i0(a aVar) {
        JsonSetter jsonSetter = (JsonSetter) aVar.c(JsonSetter.class);
        JsonSetter.Value value = JsonSetter.Value.c;
        if (jsonSetter == null) {
            return JsonSetter.Value.c;
        }
        return JsonSetter.Value.a(jsonSetter.nulls(), jsonSetter.contentNulls());
    }

    public List<NamedType> j0(a aVar) {
        t tVar = (t) aVar.c(t.class);
        if (tVar == null) {
            return null;
        }
        t.a[] value = tVar.value();
        ArrayList arrayList = new ArrayList(value.length);
        for (t.a aVar2 : value) {
            arrayList.add(new NamedType(aVar2.value(), aVar2.name()));
            for (String namedType : aVar2.names()) {
                arrayList.add(new NamedType(aVar2.value(), namedType));
            }
        }
        return arrayList;
    }

    public Object k(a aVar) {
        Class<? extends i0.f.a.c.d> using;
        c cVar = (c) aVar.c(c.class);
        if (cVar == null || (using = cVar.using()) == d.a.class) {
            return null;
        }
        return using;
    }

    public String k0(i0.f.a.c.n.b bVar) {
        v vVar = (v) bVar.c(v.class);
        if (vVar == null) {
            return null;
        }
        return vVar.value();
    }

    public void l(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        i0.f.a.a.b bVar;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (bVar = (i0.f.a.a.b) field.getAnnotation(i0.f.a.a.b.class)) != null) {
                String[] value = bVar.value();
                if (value.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = value;
                        }
                    }
                }
            }
        }
    }

    public i0.f.a.c.p.d<?> l0(MapperConfig<?> mapperConfig, i0.f.a.c.n.b bVar, JavaType javaType) {
        return G0(mapperConfig, bVar, javaType);
    }

    public String[] m(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String value = jsonProperty.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) hashMap.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    public NameTransformer m0(AnnotatedMember annotatedMember) {
        w wVar = (w) annotatedMember.c(w.class);
        if (wVar == null || !wVar.enabled()) {
            return null;
        }
        String prefix = wVar.prefix();
        String suffix = wVar.suffix();
        NameTransformer nameTransformer = NameTransformer.c;
        boolean z = true;
        boolean z2 = prefix != null && !prefix.isEmpty();
        if (suffix == null || suffix.isEmpty()) {
            z = false;
        }
        if (z2) {
            if (z) {
                return new i0.f.a.c.t.j(prefix, suffix);
            }
            return new k(prefix);
        } else if (z) {
            return new l(suffix);
        } else {
            return NameTransformer.c;
        }
    }

    public Object n(a aVar) {
        i0.f.a.a.g gVar = (i0.f.a.a.g) aVar.c(i0.f.a.a.g.class);
        if (gVar == null) {
            return null;
        }
        String value = gVar.value();
        if (!value.isEmpty()) {
            return value;
        }
        return null;
    }

    public Object n0(i0.f.a.c.n.b bVar) {
        i0.f.a.c.j.h hVar = (i0.f.a.c.j.h) bVar.c(i0.f.a.c.j.h.class);
        if (hVar == null) {
            return null;
        }
        return hVar.value();
    }

    public Class<?>[] o0(a aVar) {
        y yVar = (y) aVar.c(y.class);
        if (yVar == null) {
            return null;
        }
        return yVar.value();
    }

    public JsonFormat.Value p(a aVar) {
        JsonFormat jsonFormat = (JsonFormat) aVar.c(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        String pattern = jsonFormat.pattern();
        JsonFormat.Shape shape = jsonFormat.shape();
        String locale = jsonFormat.locale();
        String timezone = jsonFormat.timezone();
        JsonFormat.Feature[] with = jsonFormat.with();
        JsonFormat.Feature[] without = jsonFormat.without();
        int i = 0;
        for (JsonFormat.Feature ordinal : with) {
            i |= 1 << ordinal.ordinal();
        }
        int i2 = 0;
        for (JsonFormat.Feature ordinal2 : without) {
            i2 |= 1 << ordinal2.ordinal();
        }
        return new JsonFormat.Value(pattern, shape, locale, timezone, new JsonFormat.a(i, i2), jsonFormat.lenient().asBoolean());
    }

    public Boolean p0(a aVar) {
        i0.f.a.a.c cVar = (i0.f.a.a.c) aVar.c(i0.f.a.a.c.class);
        if (cVar == null) {
            return null;
        }
        return Boolean.valueOf(cVar.enabled());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String q(com.fasterxml.jackson.databind.introspect.AnnotatedMember r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedParameter
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedParameter) r3
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r3.q
            if (r0 == 0) goto L_0x0016
            i0.f.a.c.m.c r0 = q
            if (r0 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.PropertyName r3 = r0.a(r3)
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            if (r3 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = r3.q
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.q(com.fasterxml.jackson.databind.introspect.AnnotatedMember):java.lang.String");
    }

    @Deprecated
    public boolean q0(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.m(i0.f.a.a.c.class);
    }

    public Boolean r0(a aVar) {
        i0.f.a.a.d dVar = (i0.f.a.a.d) aVar.c(i0.f.a.a.d.class);
        if (dVar == null) {
            return null;
        }
        return Boolean.valueOf(dVar.enabled());
    }

    public Boolean s0(MapperConfig<?> mapperConfig, a aVar) {
        m mVar = (m) aVar.c(m.class);
        if (mVar == null) {
            return null;
        }
        return Boolean.valueOf(mVar.value());
    }

    public Boolean t0(a aVar) {
        x xVar = (x) aVar.c(x.class);
        if (xVar == null) {
            return null;
        }
        return Boolean.valueOf(xVar.value());
    }

    @Deprecated
    public boolean u0(AnnotatedMethod annotatedMethod) {
        x xVar = (x) annotatedMethod.c(x.class);
        return xVar != null && xVar.value();
    }

    public JacksonInject.Value v(AnnotatedMember annotatedMember) {
        String str;
        JacksonInject jacksonInject = (JacksonInject) annotatedMember.c(JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value a = JacksonInject.Value.a(jacksonInject.value(), jacksonInject.useInput().asBoolean());
        if (a.d != null) {
            return a;
        }
        if (!(annotatedMember instanceof AnnotatedMethod)) {
            str = annotatedMember.e().getName();
        } else {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.x() == 0) {
                str = annotatedMember.e().getName();
            } else {
                str = annotatedMethod.z(0).getName();
            }
        }
        return str.equals(a.d) ? a : new JacksonInject.Value(str, a.q);
    }

    @Deprecated
    public boolean v0(a aVar) {
        i0.f.a.c.m.c cVar;
        Boolean c2;
        JsonCreator jsonCreator = (JsonCreator) aVar.c(JsonCreator.class);
        if (jsonCreator != null) {
            if (jsonCreator.mode() != JsonCreator.Mode.DISABLED) {
                return true;
            }
            return false;
        } else if (!this.y || !(aVar instanceof AnnotatedConstructor) || (cVar = q) == null || (c2 = cVar.c(aVar)) == null) {
            return false;
        } else {
            return c2.booleanValue();
        }
    }

    @Deprecated
    public Object w(AnnotatedMember annotatedMember) {
        JacksonInject.Value v = v(annotatedMember);
        if (v == null) {
            return null;
        }
        return v.d;
    }

    public boolean w0(AnnotatedMember annotatedMember) {
        Boolean b;
        i0.f.a.a.k kVar = (i0.f.a.a.k) annotatedMember.c(i0.f.a.a.k.class);
        if (kVar != null) {
            return kVar.value();
        }
        i0.f.a.c.m.c cVar = q;
        if (cVar == null || (b = cVar.b(annotatedMember)) == null) {
            return false;
        }
        return b.booleanValue();
    }

    public Object x(a aVar) {
        Class<? extends i0.f.a.c.h> keyUsing;
        c cVar = (c) aVar.c(c.class);
        if (cVar == null || (keyUsing = cVar.keyUsing()) == h.a.class) {
            return null;
        }
        return keyUsing;
    }

    public Boolean x0(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    public Object y(a aVar) {
        Class<? extends i0.f.a.c.g> keyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) aVar.c(JsonSerialize.class);
        if (jsonSerialize == null || (keyUsing = jsonSerialize.keyUsing()) == g.a.class) {
            return null;
        }
        return keyUsing;
    }

    public boolean y0(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean bool = this.x.get(annotationType);
        if (bool == null) {
            bool = Boolean.valueOf(annotationType.getAnnotation(i0.f.a.a.a.class) != null);
            this.x.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    public Boolean z(a aVar) {
        o oVar = (o) aVar.c(o.class);
        if (oVar == null) {
            return null;
        }
        return oVar.value().asBoolean();
    }

    public Boolean z0(i0.f.a.c.n.b bVar) {
        i0.f.a.a.l lVar = (i0.f.a.a.l) bVar.c(i0.f.a.a.l.class);
        if (lVar == null) {
            return null;
        }
        return Boolean.valueOf(lVar.value());
    }
}
