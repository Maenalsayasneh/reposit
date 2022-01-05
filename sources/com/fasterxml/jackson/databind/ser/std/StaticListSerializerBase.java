package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.r.d;
import java.util.Collection;

public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements d {
    public final Boolean q;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this.q = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            if (r7 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.O()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.a()
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r2.d(r3)
            if (r2 == 0) goto L_0x001a
            i0.f.a.c.g r2 = r6.c0(r3, r2)
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.Class<T> r3 = r5.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.m(r6, r7, r3)
            if (r3 == 0) goto L_0x002a
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r3 = r3.b(r4)
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            i0.f.a.c.g r2 = r5.l(r6, r7, r2)
            if (r2 != 0) goto L_0x0035
            i0.f.a.c.g r2 = r6.C(r0, r7)
        L_0x0035:
            boolean r4 = i0.f.a.c.t.f.y(r2)
            if (r4 == 0) goto L_0x0049
            java.lang.Boolean r6 = r5.q
            boolean r6 = java.util.Objects.equals(r3, r6)
            if (r6 == 0) goto L_0x0044
            return r5
        L_0x0044:
            i0.f.a.c.g r6 = r5.v(r7, r3)
            return r6
        L_0x0049:
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r7 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            com.fasterxml.jackson.databind.JavaType r6 = r6.f(r0)
            r0 = 1
            r7.<init>(r6, r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public boolean d(i iVar, Object obj) {
        Collection collection = (Collection) obj;
        return collection == null || collection.size() == 0;
    }

    public abstract g<?> v(BeanProperty beanProperty, Boolean bool);

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super((StdSerializer<?>) staticListSerializerBase);
        this.q = bool;
    }
}
