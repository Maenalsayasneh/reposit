package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.d;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.l.m.h;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@i0.f.a.c.j.a
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements c {
    public final d<Object> a2;
    public final i0.f.a.c.p.b b2;
    public final ValueInstantiator c2;
    public final d<Object> d2;

    public static final class a extends h.a {
        public final b c;
        public final List<Object> d = new ArrayList();

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.c = bVar;
        }

        public void a(Object obj, Object obj2) throws IOException {
            b bVar = this.c;
            Iterator<a> it = bVar.c.iterator();
            Collection collection = bVar.b;
            while (it.hasNext()) {
                a next = it.next();
                if (obj.equals(next.a.x.b.q)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.d);
                    return;
                }
                collection = next.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public static class b {
        public final Class<?> a;
        public final Collection<Object> b;
        public List<a> c = new ArrayList();

        public b(Class<?> cls, Collection<Object> collection) {
            this.a = cls;
            this.b = collection;
        }

        public void a(Object obj) {
            if (this.c.isEmpty()) {
                this.b.add(obj);
                return;
            }
            List<a> list = this.c;
            list.get(list.size() - 1).d.add(obj);
        }
    }

    public CollectionDeserializer(JavaType javaType, d<Object> dVar, i0.f.a.c.p.b bVar, ValueInstantiator valueInstantiator) {
        super(javaType, (i) null, (Boolean) null);
        this.a2 = dVar;
        this.b2 = bVar;
        this.c2 = valueInstantiator;
        this.d2 = null;
    }

    public Collection<Object> A0(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object obj;
        Object obj2;
        jsonParser.S0(collection);
        d<Object> dVar = this.a2;
        boolean z = false;
        if (dVar.m() == null) {
            i0.f.a.c.p.b bVar = this.b2;
            while (true) {
                JsonToken M0 = jsonParser.M0();
                if (M0 == JsonToken.END_ARRAY) {
                    return collection;
                }
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
                    collection.add(obj);
                } catch (Exception e) {
                    if (deserializationContext == null || deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        z = true;
                    }
                    if (!z) {
                        f.K(e);
                    }
                    throw JsonMappingException.i(e, collection, collection.size());
                }
            }
        } else if (!jsonParser.F0()) {
            return C0(jsonParser, deserializationContext, collection);
        } else {
            jsonParser.S0(collection);
            d<Object> dVar2 = this.a2;
            i0.f.a.c.p.b bVar2 = this.b2;
            b bVar3 = new b(this.x.l().c, collection);
            while (true) {
                JsonToken M02 = jsonParser.M0();
                if (M02 == JsonToken.END_ARRAY) {
                    return collection;
                }
                try {
                    if (M02 == JsonToken.VALUE_NULL) {
                        if (!this.Y1) {
                            obj2 = this.y.b(deserializationContext);
                        }
                    } else if (bVar2 == null) {
                        obj2 = dVar2.d(jsonParser, deserializationContext);
                    } else {
                        obj2 = dVar2.f(jsonParser, deserializationContext, bVar2);
                    }
                    bVar3.a(obj2);
                } catch (UnresolvedForwardReference e2) {
                    a aVar = new a(bVar3, e2, bVar3.a);
                    bVar3.c.add(aVar);
                    e2.x.a(aVar);
                } catch (Exception e3) {
                    if (deserializationContext == null || deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        z = true;
                    }
                    if (!z) {
                        f.K(e3);
                    }
                    throw JsonMappingException.i(e3, collection, collection.size());
                }
            }
        }
    }

    public Collection<Object> B0(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this.c2.C(deserializationContext);
    }

    public final Collection<Object> C0(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object obj;
        Boolean bool = this.Z1;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.d0(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            d<Object> dVar = this.a2;
            i0.f.a.c.p.b bVar = this.b2;
            try {
                if (jsonParser.y0(JsonToken.VALUE_NULL)) {
                    if (this.Y1) {
                        return collection;
                    }
                    obj = this.y.b(deserializationContext);
                } else if (bVar == null) {
                    obj = dVar.d(jsonParser, deserializationContext);
                } else {
                    obj = dVar.f(jsonParser, deserializationContext, bVar);
                }
                collection.add(obj);
                return collection;
            } catch (Exception e) {
                if (!deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    f.K(e);
                }
                throw JsonMappingException.i(e, Object.class, collection.size());
            }
        } else {
            deserializationContext.T(this.x, jsonParser);
            throw null;
        }
    }

    public CollectionDeserializer D0(d<?> dVar, d<?> dVar2, i0.f.a.c.p.b bVar, i iVar, Boolean bool) {
        return new CollectionDeserializer(this.x, dVar2, bVar, this.c2, dVar, iVar, bool);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d a(com.fasterxml.jackson.databind.DeserializationContext r9, com.fasterxml.jackson.databind.BeanProperty r10) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r8.c2
            r1 = 0
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.l()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r0 == 0) goto L_0x0039
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r8.c2
            com.fasterxml.jackson.databind.DeserializationConfig r5 = r9.q
            com.fasterxml.jackson.databind.JavaType r0 = r0.J(r5)
            if (r0 == 0) goto L_0x001d
            i0.f.a.c.d r0 = r9.y(r0, r10)
            goto L_0x004f
        L_0x001d:
            com.fasterxml.jackson.databind.JavaType r10 = r8.x
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r10
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r8.c2
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            java.lang.String r2 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r9.n(r10, r0)
            throw r1
        L_0x0039:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r8.c2
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x006d
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r8.c2
            com.fasterxml.jackson.databind.DeserializationConfig r5 = r9.q
            com.fasterxml.jackson.databind.JavaType r0 = r0.G(r5)
            if (r0 == 0) goto L_0x0051
            i0.f.a.c.d r0 = r9.y(r0, r10)
        L_0x004f:
            r3 = r0
            goto L_0x006e
        L_0x0051:
            com.fasterxml.jackson.databind.JavaType r10 = r8.x
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r10
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r8.c2
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            java.lang.String r2 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r9.n(r10, r0)
            throw r1
        L_0x006d:
            r3 = r1
        L_0x006e:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r2 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            com.fasterxml.jackson.annotation.JsonFormat$Value r0 = r8.t0(r9, r10, r0)
            if (r0 == 0) goto L_0x007c
            java.lang.Boolean r1 = r0.b(r2)
        L_0x007c:
            r7 = r1
            i0.f.a.c.d<java.lang.Object> r0 = r8.a2
            i0.f.a.c.d r0 = r8.s0(r9, r10, r0)
            com.fasterxml.jackson.databind.JavaType r1 = r8.x
            com.fasterxml.jackson.databind.JavaType r1 = r1.l()
            if (r0 != 0) goto L_0x0090
            i0.f.a.c.d r0 = r9.y(r1, r10)
            goto L_0x0094
        L_0x0090:
            i0.f.a.c.d r0 = r9.R(r0, r10, r1)
        L_0x0094:
            r4 = r0
            i0.f.a.c.p.b r0 = r8.b2
            if (r0 == 0) goto L_0x009d
            i0.f.a.c.p.b r0 = r0.f(r10)
        L_0x009d:
            r5 = r0
            i0.f.a.c.l.i r6 = r8.r0(r9, r10, r4)
            java.lang.Boolean r9 = r8.Z1
            boolean r9 = java.util.Objects.equals(r7, r9)
            if (r9 == 0) goto L_0x00bd
            i0.f.a.c.l.i r9 = r8.y
            if (r6 != r9) goto L_0x00bd
            i0.f.a.c.d<java.lang.Object> r9 = r8.d2
            if (r3 != r9) goto L_0x00bd
            i0.f.a.c.d<java.lang.Object> r9 = r8.a2
            if (r4 != r9) goto L_0x00bd
            i0.f.a.c.p.b r9 = r8.b2
            if (r5 == r9) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r9 = r8
            goto L_0x00c2
        L_0x00bd:
            r2 = r8
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r9 = r2.D0(r3, r4, r5, r6, r7)
        L_0x00c2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        d<Object> dVar = this.d2;
        if (dVar != null) {
            return (Collection) this.c2.E(deserializationContext, dVar.d(jsonParser, deserializationContext));
        }
        if (jsonParser.F0()) {
            return A0(jsonParser, deserializationContext, B0(deserializationContext));
        }
        if (!jsonParser.y0(JsonToken.VALUE_STRING)) {
            return C0(jsonParser, deserializationContext, B0(deserializationContext));
        }
        String Z = jsonParser.Z();
        Class<?> cls = this.d;
        if (Z.isEmpty()) {
            CoercionAction w = deserializationContext.w(LogicalType.Collection, cls, CoercionInputShape.EmptyString);
            x(deserializationContext, w, cls, Z, "empty String (\"\")");
            if (w != null) {
                return (Collection) J(deserializationContext, w, cls);
            }
        } else if (StdDeserializer.R(Z)) {
            return (Collection) J(deserializationContext, deserializationContext.x(LogicalType.Collection, cls, CoercionAction.Fail), cls);
        }
        return C0(jsonParser, deserializationContext, B0(deserializationContext));
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (jsonParser.F0()) {
            return A0(jsonParser, deserializationContext, collection);
        }
        return C0(jsonParser, deserializationContext, collection);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, i0.f.a.c.p.b bVar) throws IOException {
        return bVar.c(jsonParser, deserializationContext);
    }

    public boolean p() {
        return this.a2 == null && this.b2 == null && this.d2 == null;
    }

    public LogicalType q() {
        return LogicalType.Collection;
    }

    public ValueInstantiator u0() {
        return this.c2;
    }

    public d<Object> y0() {
        return this.a2;
    }

    public CollectionDeserializer(JavaType javaType, d<Object> dVar, i0.f.a.c.p.b bVar, ValueInstantiator valueInstantiator, d<Object> dVar2, i iVar, Boolean bool) {
        super(javaType, iVar, bool);
        this.a2 = dVar;
        this.b2 = bVar;
        this.c2 = valueInstantiator;
        this.d2 = dVar2;
    }
}
