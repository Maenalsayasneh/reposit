package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.Iterator;

@a
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    public IterableSerializer(JavaType javaType, boolean z, e eVar) {
        super((Class<?>) Iterable.class, javaType, z, eVar, (g<Object>) null);
    }

    public boolean d(i iVar, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.lang.Object r3, com.fasterxml.jackson.core.JsonGenerator r4, i0.f.a.c.i r5) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Boolean r0 = r2.Y1
            if (r0 != 0) goto L_0x000e
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            boolean r0 = r5.Y(r0)
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            java.lang.Boolean r0 = r2.Y1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L_0x0032
        L_0x0014:
            if (r3 == 0) goto L_0x002b
            java.util.Iterator r0 = r3.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002b
            r0.next()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0032
            r2.x(r3, r4, r5)
            goto L_0x003b
        L_0x0032:
            r4.K0(r3)
            r2.x(r3, r4, r5)
            r4.T()
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.IterableSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, i0.f.a.c.i):void");
    }

    public ContainerSerializer<?> v(e eVar) {
        return new IterableSerializer(this, this.x, eVar, this.a2, this.Y1);
    }

    public AsArraySerializerBase y(BeanProperty beanProperty, e eVar, g gVar, Boolean bool) {
        return new IterableSerializer(this, beanProperty, eVar, gVar, bool);
    }

    /* renamed from: z */
    public void x(Iterable<?> iterable, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            e eVar = this.Z1;
            Class<?> cls = null;
            g<Object> gVar2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    iVar.z(jsonGenerator);
                } else {
                    g<Object> gVar3 = this.a2;
                    if (gVar3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            gVar2 = iVar.N(cls2, this.x);
                            cls = cls2;
                        }
                        gVar = gVar2;
                    } else {
                        g<Object> gVar4 = gVar3;
                        gVar = gVar2;
                        gVar2 = gVar4;
                    }
                    if (eVar == null) {
                        gVar2.f(next, jsonGenerator, iVar);
                    } else {
                        gVar2.g(next, jsonGenerator, iVar, eVar);
                    }
                    gVar2 = gVar;
                }
            } while (it.hasNext());
        }
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super((AsArraySerializerBase<?>) iterableSerializer, beanProperty, eVar, gVar, bool);
    }
}
