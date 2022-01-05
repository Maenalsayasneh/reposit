package i0.f.a.c.p.f;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import i0.d.a.a.a;
import i0.f.a.c.p.c;
import i0.f.a.c.p.d;
import i0.f.a.c.p.e;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StdTypeResolverBuilder */
public class h implements d<h> {
    public JsonTypeInfo.Id a;
    public JsonTypeInfo.As b;
    public String c;
    public boolean d = false;
    public Class<?> e;
    public c f;

    public d a(boolean z) {
        this.d = z;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r16.C() == false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.p.b b(com.fasterxml.jackson.databind.DeserializationConfig r15, com.fasterxml.jackson.databind.JavaType r16, java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType> r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r0 = r7.a
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE
            r10 = 0
            if (r0 != r1) goto L_0x000c
            return r10
        L_0x000c:
            boolean r0 = r16.Q()
            if (r0 == 0) goto L_0x0013
            return r10
        L_0x0013:
            com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator r0 = r14.k(r15)
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r1 = r7.a
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS
            r11 = 2
            r12 = 0
            r13 = 1
            if (r1 == r2) goto L_0x0024
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS
            if (r1 != r2) goto L_0x0032
        L_0x0024:
            com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Validity r1 = r0.a(r15, r9)
            com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Validity r2 = com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity.DENIED
            if (r1 == r2) goto L_0x00f5
            com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Validity r2 = com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity.ALLOWED
            if (r1 != r2) goto L_0x0032
            com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator r0 = com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator.c
        L_0x0032:
            r3 = r0
            r5 = 0
            r6 = 1
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r17
            i0.f.a.c.p.c r2 = r0.i(r1, r2, r3, r4, r5, r6)
            java.lang.Class<?> r0 = r7.e
            if (r0 != 0) goto L_0x0052
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL
            boolean r0 = r15.q(r0)
            if (r0 == 0) goto L_0x0077
            boolean r0 = r16.C()
            if (r0 != 0) goto L_0x0077
            goto L_0x0064
        L_0x0052:
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            if (r0 == r1) goto L_0x0079
            java.lang.Class<i0.f.a.c.j.i> r1 = i0.f.a.c.j.i.class
            if (r0 != r1) goto L_0x005b
            goto L_0x0079
        L_0x005b:
            java.lang.Class<?> r1 = r9.c
            if (r1 != r0) goto L_0x0061
            r1 = r13
            goto L_0x0062
        L_0x0061:
            r1 = r12
        L_0x0062:
            if (r1 == 0) goto L_0x0066
        L_0x0064:
            r5 = r9
            goto L_0x0084
        L_0x0066:
            boolean r0 = r9.U(r0)
            if (r0 == 0) goto L_0x0077
            com.fasterxml.jackson.databind.cfg.BaseSettings r0 = r8.d
            com.fasterxml.jackson.databind.type.TypeFactory r0 = r0.d
            java.lang.Class<?> r1 = r7.e
            com.fasterxml.jackson.databind.JavaType r0 = r0.l(r9, r1, r12)
            goto L_0x0083
        L_0x0077:
            r5 = r10
            goto L_0x0084
        L_0x0079:
            com.fasterxml.jackson.databind.cfg.BaseSettings r1 = r8.d
            com.fasterxml.jackson.databind.type.TypeFactory r1 = r1.d
            com.fasterxml.jackson.databind.type.TypeBindings r3 = com.fasterxml.jackson.databind.type.TypeFactory.q
            com.fasterxml.jackson.databind.JavaType r0 = r1.b(r10, r0, r3)
        L_0x0083:
            r5 = r0
        L_0x0084:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r0 = r7.a
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION
            if (r0 != r1) goto L_0x0097
            com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeDeserializer r6 = new com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeDeserializer
            r0 = r6
            r1 = r16
            r3 = r5
            r4 = r15
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x0097:
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r0 = r7.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00e6
            if (r0 == r13) goto L_0x00d9
            if (r0 == r11) goto L_0x00cc
            r1 = 3
            if (r0 == r1) goto L_0x00bf
            r1 = 4
            if (r0 != r1) goto L_0x00aa
            goto L_0x00e6
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not know how to construct standard type serializer for inclusion type: "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r2 = r7.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer r6 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer
            java.lang.String r3 = r7.c
            boolean r4 = r7.d
            r0 = r6
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x00cc:
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer r6 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
            java.lang.String r3 = r7.c
            boolean r4 = r7.d
            r0 = r6
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x00d9:
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer r6 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer
            java.lang.String r3 = r7.c
            boolean r4 = r7.d
            r0 = r6
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x00e6:
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer r8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer
            java.lang.String r3 = r7.c
            boolean r4 = r7.d
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r6 = r7.b
            r0 = r8
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x00f5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r0 = i0.f.a.c.t.f.f(r0)
            r2[r12] = r0
            java.lang.Class<?> r0 = r9.c
            java.lang.String r0 = i0.f.a.c.t.f.f(r0)
            r2[r13] = r0
            java.lang.String r0 = "Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.p.f.h.b(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection):i0.f.a.c.p.b");
    }

    public /* bridge */ /* synthetic */ d c(JsonTypeInfo.Id id, c cVar) {
        j(id, cVar);
        return this;
    }

    public d d(String str) {
        if (str == null || str.isEmpty()) {
            str = this.a.getDefaultPropertyName();
        }
        this.c = str;
        return this;
    }

    public d e(Class cls) {
        this.e = cls;
        return this;
    }

    public e f(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this.a == JsonTypeInfo.Id.NONE || javaType.Q()) {
            return null;
        }
        c i = i(serializationConfig, javaType, k(serializationConfig), collection, true, false);
        if (this.a == JsonTypeInfo.Id.DEDUCTION) {
            return new b(i, (BeanProperty) null, this.c);
        }
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            return new d(i, (BeanProperty) null, this.c);
        }
        if (ordinal == 1) {
            return new e(i, (BeanProperty) null);
        }
        if (ordinal == 2) {
            return new a(i, (BeanProperty) null);
        }
        if (ordinal == 3) {
            return new c(i, (BeanProperty) null, this.c);
        }
        if (ordinal == 4) {
            return new b(i, (BeanProperty) null, this.c);
        }
        StringBuilder P0 = a.P0("Do not know how to construct standard type serializer for inclusion type: ");
        P0.append(this.b);
        throw new IllegalStateException(P0.toString());
    }

    public d g(JsonTypeInfo.As as) {
        if (as != null) {
            this.b = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    public Class<?> h() {
        return this.e;
    }

    public c i(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z, boolean z2) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        JsonTypeInfo.Id id = this.a;
        if (id != null) {
            int ordinal = id.ordinal();
            HashMap hashMap = null;
            if (ordinal == 0) {
                return null;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new g(javaType, mapperConfig.d.d, polymorphicTypeValidator);
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        StringBuilder P0 = a.P0("Do not know how to construct standard type id resolver for idType: ");
                        P0.append(this.a);
                        throw new IllegalStateException(P0.toString());
                    }
                } else if (z != z2) {
                    if (z) {
                        concurrentHashMap = new ConcurrentHashMap();
                    } else {
                        hashMap = new HashMap();
                        concurrentHashMap = new ConcurrentHashMap(4);
                    }
                    boolean q = mapperConfig.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
                    if (collection != null) {
                        for (NamedType next : collection) {
                            Class<?> cls = next.c;
                            if (next.a()) {
                                str = next.q;
                            } else {
                                str = k.g(cls);
                            }
                            if (z) {
                                concurrentHashMap.put(cls.getName(), str);
                            }
                            if (z2) {
                                if (q) {
                                    str = str.toLowerCase();
                                }
                                JavaType javaType2 = (JavaType) hashMap.get(str);
                                if (javaType2 == null || !cls.isAssignableFrom(javaType2.c)) {
                                    hashMap.put(str, mapperConfig.d(cls));
                                }
                            }
                        }
                    }
                    return new k(mapperConfig, javaType, concurrentHashMap, hashMap);
                } else {
                    throw new IllegalArgumentException();
                }
            }
            return new f(javaType, mapperConfig.d.d, polymorphicTypeValidator);
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    public h j(JsonTypeInfo.Id id, c cVar) {
        if (id != null) {
            this.a = id;
            this.f = cVar;
            this.c = id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public PolymorphicTypeValidator k(MapperConfig<?> mapperConfig) {
        PolymorphicTypeValidator polymorphicTypeValidator = mapperConfig.d.a2;
        return (polymorphicTypeValidator != LaissezFaireSubTypeValidator.c || !mapperConfig.q(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? polymorphicTypeValidator : new DefaultBaseTypeLimitingValidator();
    }
}
