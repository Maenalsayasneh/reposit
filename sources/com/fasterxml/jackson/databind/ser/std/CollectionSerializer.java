package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.b;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    public CollectionSerializer(JavaType javaType, boolean z, e eVar, g<Object> gVar) {
        super((Class<?>) Collection.class, javaType, z, eVar, gVar);
    }

    public boolean d(i iVar, Object obj) {
        return ((Collection) obj).isEmpty();
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size != 1 || ((this.Y1 != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.Y1 != Boolean.TRUE)) {
            jsonGenerator.L0(collection, size);
            x(collection, jsonGenerator, iVar);
            jsonGenerator.T();
            return;
        }
        x(collection, jsonGenerator, iVar);
    }

    public ContainerSerializer<?> v(e eVar) {
        return new CollectionSerializer(this, this.x, eVar, this.a2, this.Y1);
    }

    public AsArraySerializerBase y(BeanProperty beanProperty, e eVar, g gVar, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, eVar, gVar, bool);
    }

    /* renamed from: z */
    public void x(Collection<?> collection, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar;
        jsonGenerator.w(collection);
        g<Object> gVar2 = this.a2;
        int i = 0;
        if (gVar2 != null) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                e eVar = this.Z1;
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            iVar.z(jsonGenerator);
                        } catch (Exception e) {
                            p(iVar, e, collection, i);
                            throw null;
                        }
                    } else if (eVar == null) {
                        gVar2.f(next, jsonGenerator, iVar);
                    } else {
                        gVar2.g(next, jsonGenerator, iVar, eVar);
                    }
                    i++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator<?> it2 = collection.iterator();
        if (it2.hasNext()) {
            b bVar = this.b2;
            e eVar2 = this.Z1;
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        iVar.z(jsonGenerator);
                    } else {
                        Class<?> cls = next2.getClass();
                        g<Object> c = bVar.c(cls);
                        if (c == null) {
                            if (this.q.y()) {
                                b.d a = bVar.a(iVar.y(this.q, cls), iVar, this.x);
                                b bVar2 = a.b;
                                if (bVar != bVar2) {
                                    this.b2 = bVar2;
                                }
                                gVar = a.a;
                            } else {
                                gVar = w(bVar, cls, iVar);
                            }
                            c = gVar;
                            bVar = this.b2;
                        }
                        if (eVar2 == null) {
                            c.f(next2, jsonGenerator, iVar);
                        } else {
                            c.g(next2, jsonGenerator, iVar, eVar2);
                        }
                    }
                    i++;
                } catch (Exception e2) {
                    p(iVar, e2, collection, i);
                    throw null;
                }
            } while (it2.hasNext());
        }
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super((AsArraySerializerBase<?>) collectionSerializer, beanProperty, eVar, gVar, bool);
    }
}
