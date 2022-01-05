package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import i0.f.a.a.z;
import i0.f.a.c.d;
import i0.f.a.c.l.f;
import i0.f.a.c.l.k;
import i0.f.a.c.l.m.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    public transient LinkedHashMap<ObjectIdGenerator.IdKey, h> e2;
    public List<z> f2;

    public static final class Impl extends DefaultDeserializationContext {
        public Impl(f fVar) {
            super(fVar, (DeserializerCache) null);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser) {
            super(impl, deserializationConfig, jsonParser);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig) {
            super((DefaultDeserializationContext) impl, deserializationConfig);
        }
    }

    public DefaultDeserializationContext(f fVar, DeserializerCache deserializerCache) {
        super(fVar, (DeserializerCache) null);
    }

    public h E(Object obj, ObjectIdGenerator<?> objectIdGenerator, z zVar) {
        z zVar2 = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey e = objectIdGenerator.e(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, h> linkedHashMap = this.e2;
        if (linkedHashMap == null) {
            this.e2 = new LinkedHashMap<>();
        } else {
            h hVar = linkedHashMap.get(e);
            if (hVar != null) {
                return hVar;
            }
        }
        List<z> list = this.f2;
        if (list != null) {
            Iterator<z> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                z next = it.next();
                if (next.c(zVar)) {
                    zVar2 = next;
                    break;
                }
            }
        } else {
            this.f2 = new ArrayList(8);
        }
        if (zVar2 == null) {
            zVar2 = zVar.b(this);
            this.f2.add(zVar2);
        }
        h hVar2 = new h(e);
        hVar2.d = zVar2;
        this.e2.put(e, hVar2);
        return hVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<i0.f.a.c.h$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: i0.f.a.c.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.f.a.c.h f0(i0.f.a.c.n.a r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof i0.f.a.c.h
            if (r0 == 0) goto L_0x000b
            i0.f.a.c.h r4 = (i0.f.a.c.h) r4
            goto L_0x0038
        L_0x000b:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0056
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<i0.f.a.c.h$a> r0 = i0.f.a.c.h.a.class
            if (r4 == r0) goto L_0x0055
            boolean r0 = i0.f.a.c.t.f.v(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0055
        L_0x001c:
            java.lang.Class<i0.f.a.c.h> r3 = i0.f.a.c.h.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x0043
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2.q
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r3.d
            java.util.Objects.requireNonNull(r3)
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2.q
            boolean r3 = r3.b()
            java.lang.Object r3 = i0.f.a.c.t.f.i(r4, r3)
            r4 = r3
            i0.f.a.c.h r4 = (i0.f.a.c.h) r4
        L_0x0038:
            boolean r3 = r4 instanceof i0.f.a.c.l.j
            if (r3 == 0) goto L_0x0042
            r3 = r4
            i0.f.a.c.l.j r3 = (i0.f.a.c.l.j) r3
            r3.c(r2)
        L_0x0042:
            return r4
        L_0x0043:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = "; expected Class<KeyDeserializer>"
            java.lang.String r4 = i0.d.a.a.a.Y(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L_0x0055:
            return r3
        L_0x0056:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.String r4 = i0.d.a.a.a.d0(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.f0(i0.f.a.c.n.a, java.lang.Object):i0.f.a.c.h");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<i0.f.a.c.d$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: i0.f.a.c.d<java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<java.lang.Object> v(i0.f.a.c.n.a r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof i0.f.a.c.d
            if (r0 == 0) goto L_0x000b
            i0.f.a.c.d r4 = (i0.f.a.c.d) r4
            goto L_0x0038
        L_0x000b:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0056
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<i0.f.a.c.d$a> r0 = i0.f.a.c.d.a.class
            if (r4 == r0) goto L_0x0055
            boolean r0 = i0.f.a.c.t.f.v(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0055
        L_0x001c:
            java.lang.Class<i0.f.a.c.d> r3 = i0.f.a.c.d.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x0043
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2.q
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r3.d
            java.util.Objects.requireNonNull(r3)
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2.q
            boolean r3 = r3.b()
            java.lang.Object r3 = i0.f.a.c.t.f.i(r4, r3)
            r4 = r3
            i0.f.a.c.d r4 = (i0.f.a.c.d) r4
        L_0x0038:
            boolean r3 = r4 instanceof i0.f.a.c.l.j
            if (r3 == 0) goto L_0x0042
            r3 = r4
            i0.f.a.c.l.j r3 = (i0.f.a.c.l.j) r3
            r3.c(r2)
        L_0x0042:
            return r4
        L_0x0043:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = "; expected Class<JsonDeserializer>"
            java.lang.String r4 = i0.d.a.a.a.Y(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L_0x0055:
            return r3
        L_0x0056:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned deserializer definition of type "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = "; expected type JsonDeserializer or Class<JsonDeserializer> instead"
            java.lang.String r4 = i0.d.a.a.a.d0(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.v(i0.f.a.c.n.a, java.lang.Object):i0.f.a.c.d");
    }

    public void v0() throws UnresolvedForwardReference {
        Iterator it;
        if (this.e2 != null && d0(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            UnresolvedForwardReference unresolvedForwardReference = null;
            for (Map.Entry<ObjectIdGenerator.IdKey, h> value : this.e2.entrySet()) {
                h hVar = (h) value.getValue();
                LinkedList<h.a> linkedList = hVar.c;
                if (linkedList != null && !linkedList.isEmpty()) {
                    if (unresolvedForwardReference == null) {
                        unresolvedForwardReference = new UnresolvedForwardReference(this.Z1, "Unresolved forward references for: ");
                    }
                    Object obj = hVar.b.q;
                    LinkedList<h.a> linkedList2 = hVar.c;
                    if (linkedList2 == null) {
                        it = Collections.emptyList().iterator();
                    } else {
                        it = linkedList2.iterator();
                    }
                    while (it.hasNext()) {
                        h.a aVar = (h.a) it.next();
                        unresolvedForwardReference.y.add(new k(obj, aVar.b, aVar.a.c));
                    }
                }
            }
            if (unresolvedForwardReference != null) {
                throw unresolvedForwardReference;
            }
        }
    }

    public Object w0(JsonParser jsonParser, JavaType javaType, d<Object> dVar, Object obj) throws IOException {
        boolean z;
        DeserializationConfig deserializationConfig = this.q;
        PropertyName propertyName = deserializationConfig.a2;
        if (propertyName != null) {
            z = !propertyName.e();
        } else {
            z = deserializationConfig.F(DeserializationFeature.UNWRAP_ROOT_VALUE);
        }
        if (!z) {
            return dVar.d(jsonParser, this);
        }
        String str = this.q.w(javaType).q;
        JsonToken i = jsonParser.i();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (i == jsonToken) {
            JsonToken M0 = jsonParser.M0();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (M0 == jsonToken2) {
                String f = jsonParser.f();
                if (str.equals(f)) {
                    jsonParser.M0();
                    Object d = dVar.d(jsonParser, this);
                    JsonToken M02 = jsonParser.M0();
                    JsonToken jsonToken3 = JsonToken.END_OBJECT;
                    if (M02 == jsonToken3) {
                        return d;
                    }
                    p0(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", i0.f.a.c.t.f.D(str), jsonParser.i());
                    throw null;
                }
                o0(javaType, f, "Root name (%s) does not match expected (%s) for type %s", i0.f.a.c.t.f.D(f), i0.f.a.c.t.f.D(str), i0.f.a.c.t.f.t(javaType));
                throw null;
            }
            p0(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", i0.f.a.c.t.f.D(str), jsonParser.i());
            throw null;
        }
        p0(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", i0.f.a.c.t.f.D(str), jsonParser.i());
        throw null;
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig) {
        super((DeserializationContext) defaultDeserializationContext, deserializationConfig);
    }
}
