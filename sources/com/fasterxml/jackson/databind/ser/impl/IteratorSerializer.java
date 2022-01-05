package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.b;
import java.io.IOException;
import java.util.Iterator;

@a
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    public IteratorSerializer(JavaType javaType, boolean z, e eVar) {
        super((Class<?>) Iterator.class, javaType, z, eVar, (g<Object>) null);
    }

    public boolean d(i iVar, Object obj) {
        return !((Iterator) obj).hasNext();
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Iterator it = (Iterator) obj;
        jsonGenerator.K0(it);
        x(it, jsonGenerator, iVar);
        jsonGenerator.T();
    }

    public ContainerSerializer<?> v(e eVar) {
        return new IteratorSerializer(this, this.x, eVar, this.a2, this.Y1);
    }

    public AsArraySerializerBase y(BeanProperty beanProperty, e eVar, g gVar, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, eVar, gVar, bool);
    }

    /* renamed from: z */
    public void x(Iterator<?> it, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar;
        if (it.hasNext()) {
            g<Object> gVar2 = this.a2;
            if (gVar2 == null) {
                e eVar = this.Z1;
                b bVar = this.b2;
                do {
                    Object next = it.next();
                    if (next == null) {
                        iVar.z(jsonGenerator);
                    } else {
                        Class<?> cls = next.getClass();
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
                        if (eVar == null) {
                            c.f(next, jsonGenerator, iVar);
                        } else {
                            c.g(next, jsonGenerator, iVar, eVar);
                        }
                    }
                } while (it.hasNext());
                return;
            }
            e eVar2 = this.Z1;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    iVar.z(jsonGenerator);
                } else if (eVar2 == null) {
                    gVar2.f(next2, jsonGenerator, iVar);
                } else {
                    gVar2.g(next2, jsonGenerator, iVar, eVar2);
                }
            } while (it.hasNext());
        }
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super((AsArraySerializerBase<?>) iteratorSerializer, beanProperty, eVar, gVar, bool);
    }
}
