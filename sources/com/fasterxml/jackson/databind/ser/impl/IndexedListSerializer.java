package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.b;
import java.io.IOException;
import java.util.List;

@a
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    public IndexedListSerializer(JavaType javaType, boolean z, e eVar, g<Object> gVar) {
        super((Class<?>) List.class, javaType, z, eVar, gVar);
    }

    public boolean d(i iVar, Object obj) {
        return ((List) obj).isEmpty();
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || ((this.Y1 != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.Y1 != Boolean.TRUE)) {
            jsonGenerator.L0(list, size);
            x(list, jsonGenerator, iVar);
            jsonGenerator.T();
            return;
        }
        x(list, jsonGenerator, iVar);
    }

    public ContainerSerializer<?> v(e eVar) {
        return new IndexedListSerializer(this, this.x, eVar, this.a2, this.Y1);
    }

    public AsArraySerializerBase y(BeanProperty beanProperty, e eVar, g gVar, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, eVar, gVar, bool);
    }

    /* renamed from: z */
    public void x(List<?> list, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar;
        g<Object> gVar2;
        g<Object> gVar3 = this.a2;
        int i = 0;
        if (gVar3 != null) {
            int size = list.size();
            if (size != 0) {
                e eVar = this.Z1;
                while (i < size) {
                    Object obj = list.get(i);
                    if (obj == null) {
                        try {
                            iVar.z(jsonGenerator);
                        } catch (Exception e) {
                            p(iVar, e, list, i);
                            throw null;
                        }
                    } else if (eVar == null) {
                        gVar3.f(obj, jsonGenerator, iVar);
                    } else {
                        gVar3.g(obj, jsonGenerator, iVar, eVar);
                    }
                    i++;
                }
            }
        } else if (this.Z1 != null) {
            int size2 = list.size();
            if (size2 != 0) {
                try {
                    e eVar2 = this.Z1;
                    b bVar = this.b2;
                    while (i < size2) {
                        Object obj2 = list.get(i);
                        if (obj2 == null) {
                            iVar.z(jsonGenerator);
                        } else {
                            Class<?> cls = obj2.getClass();
                            g<Object> c = bVar.c(cls);
                            if (c == null) {
                                if (this.q.y()) {
                                    b.d a = bVar.a(iVar.y(this.q, cls), iVar, this.x);
                                    b bVar2 = a.b;
                                    if (bVar != bVar2) {
                                        this.b2 = bVar2;
                                    }
                                    gVar2 = a.a;
                                } else {
                                    gVar2 = w(bVar, cls, iVar);
                                }
                                c = gVar2;
                                bVar = this.b2;
                            }
                            c.g(obj2, jsonGenerator, iVar, eVar2);
                        }
                        i++;
                    }
                } catch (Exception e2) {
                    p(iVar, e2, list, 0);
                    throw null;
                }
            }
        } else {
            int size3 = list.size();
            if (size3 != 0) {
                try {
                    b bVar3 = this.b2;
                    while (i < size3) {
                        Object obj3 = list.get(i);
                        if (obj3 == null) {
                            iVar.z(jsonGenerator);
                        } else {
                            Class<?> cls2 = obj3.getClass();
                            g<Object> c2 = bVar3.c(cls2);
                            if (c2 == null) {
                                if (this.q.y()) {
                                    b.d a2 = bVar3.a(iVar.y(this.q, cls2), iVar, this.x);
                                    b bVar4 = a2.b;
                                    if (bVar3 != bVar4) {
                                        this.b2 = bVar4;
                                    }
                                    gVar = a2.a;
                                } else {
                                    gVar = w(bVar3, cls2, iVar);
                                }
                                c2 = gVar;
                                bVar3 = this.b2;
                            }
                            c2.f(obj3, jsonGenerator, iVar);
                        }
                        i++;
                    }
                } catch (Exception e3) {
                    p(iVar, e3, list, 0);
                    throw null;
                }
            }
        }
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super((AsArraySerializerBase<?>) indexedListSerializer, beanProperty, eVar, gVar, bool);
    }
}
