package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.util.LRUMap;
import i0.f.a.c.e;
import i0.f.a.c.s.a;
import i0.f.a.c.t.f;
import i0.f.a.c.t.i;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class TypeFactory implements Serializable {
    public static final Class<?> Y1;
    public static final Class<?> Z1;
    public static final Class<?> a2;
    public static final Class<?> b2;
    public static final JavaType[] c = new JavaType[0];
    public static final Class<?> c2;
    public static final TypeFactory d = new TypeFactory();
    public static final Class<?> d2;
    public static final Class<?> e2;
    public static final SimpleType f2;
    public static final SimpleType g2;
    public static final SimpleType h2;
    public static final SimpleType i2;
    public static final SimpleType j2;
    public static final SimpleType k2;
    public static final SimpleType l2;
    public static final SimpleType m2;
    public static final SimpleType n2;
    public static final TypeBindings q = TypeBindings.q;
    public static final Class<?> x;
    public static final Class<?> y;
    public final i<Object, JavaType> o2 = new LRUMap(16, 200);
    public final TypeParser p2 = new TypeParser(this);

    static {
        Class<String> cls = String.class;
        x = cls;
        Class<Object> cls2 = Object.class;
        y = cls2;
        Class<Comparable> cls3 = Comparable.class;
        Y1 = cls3;
        Class<Class> cls4 = Class.class;
        Z1 = cls4;
        Class<Enum> cls5 = Enum.class;
        a2 = cls5;
        Class<e> cls6 = e.class;
        b2 = cls6;
        Class<?> cls7 = Boolean.TYPE;
        c2 = cls7;
        Class<?> cls8 = Integer.TYPE;
        d2 = cls8;
        Class<?> cls9 = Long.TYPE;
        e2 = cls9;
        f2 = new SimpleType(cls7);
        g2 = new SimpleType(cls8);
        h2 = new SimpleType(cls9);
        i2 = new SimpleType(cls);
        j2 = new SimpleType(cls2);
        k2 = new SimpleType(cls3);
        l2 = new SimpleType(cls5);
        m2 = new SimpleType(cls4);
        n2 = new SimpleType(cls6);
    }

    public static JavaType v() {
        Objects.requireNonNull(d);
        return j2;
    }

    public JavaType a(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == c2) {
                return f2;
            }
            if (cls == d2) {
                return g2;
            }
            if (cls == e2) {
                return h2;
            }
            return null;
        } else if (cls == x) {
            return i2;
        } else {
            if (cls == y) {
                return j2;
            }
            if (cls == b2) {
                return n2;
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType b(i0.f.a.c.s.a r6, java.lang.reflect.Type r7, com.fasterxml.jackson.databind.type.TypeBindings r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof java.lang.Class
            if (r0 == 0) goto L_0x000e
            java.lang.Class r7 = (java.lang.Class) r7
            com.fasterxml.jackson.databind.type.TypeBindings r8 = q
            com.fasterxml.jackson.databind.JavaType r6 = r5.c(r6, r7, r8)
            goto L_0x0114
        L_0x000e:
            boolean r0 = r7 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type r0 = r7.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<?> r2 = a2
            if (r0 != r2) goto L_0x0023
            com.fasterxml.jackson.databind.type.SimpleType r6 = l2
            goto L_0x0114
        L_0x0023:
            java.lang.Class<?> r2 = Y1
            if (r0 != r2) goto L_0x002b
            com.fasterxml.jackson.databind.type.SimpleType r6 = k2
            goto L_0x0114
        L_0x002b:
            java.lang.Class<?> r2 = Z1
            if (r0 != r2) goto L_0x0033
            com.fasterxml.jackson.databind.type.SimpleType r6 = m2
            goto L_0x0114
        L_0x0033:
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            if (r7 != 0) goto L_0x003b
            r2 = r1
            goto L_0x003c
        L_0x003b:
            int r2 = r7.length
        L_0x003c:
            if (r2 != 0) goto L_0x0041
            com.fasterxml.jackson.databind.type.TypeBindings r7 = q
            goto L_0x0054
        L_0x0041:
            com.fasterxml.jackson.databind.JavaType[] r3 = new com.fasterxml.jackson.databind.JavaType[r2]
        L_0x0043:
            if (r1 >= r2) goto L_0x0050
            r4 = r7[r1]
            com.fasterxml.jackson.databind.JavaType r4 = r5.b(r6, r4, r8)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L_0x0043
        L_0x0050:
            com.fasterxml.jackson.databind.type.TypeBindings r7 = com.fasterxml.jackson.databind.type.TypeBindings.c(r0, r3)
        L_0x0054:
            com.fasterxml.jackson.databind.JavaType r6 = r5.c(r6, r0, r7)
            goto L_0x0114
        L_0x005a:
            boolean r0 = r7 instanceof com.fasterxml.jackson.databind.JavaType
            if (r0 == 0) goto L_0x0061
            com.fasterxml.jackson.databind.JavaType r7 = (com.fasterxml.jackson.databind.JavaType) r7
            return r7
        L_0x0061:
            boolean r0 = r7 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0075
            java.lang.reflect.GenericArrayType r7 = (java.lang.reflect.GenericArrayType) r7
            java.lang.reflect.Type r7 = r7.getGenericComponentType()
            com.fasterxml.jackson.databind.JavaType r6 = r5.b(r6, r7, r8)
            com.fasterxml.jackson.databind.type.ArrayType r6 = com.fasterxml.jackson.databind.type.ArrayType.g0(r6, r8)
            goto L_0x0114
        L_0x0075:
            boolean r0 = r7 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0104
            java.lang.reflect.TypeVariable r7 = (java.lang.reflect.TypeVariable) r7
            java.lang.String r0 = r7.getName()
            if (r8 == 0) goto L_0x00f6
            java.lang.String[] r2 = r8.x
            int r2 = r2.length
            r3 = r1
        L_0x0085:
            if (r3 >= r2) goto L_0x00a5
            java.lang.String[] r4 = r8.x
            r4 = r4[r3]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00a2
            com.fasterxml.jackson.databind.JavaType[] r2 = r8.y
            r2 = r2[r3]
            boolean r3 = r2 instanceof com.fasterxml.jackson.databind.type.ResolvedRecursiveType
            if (r3 == 0) goto L_0x00a6
            r3 = r2
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType r3 = (com.fasterxml.jackson.databind.type.ResolvedRecursiveType) r3
            com.fasterxml.jackson.databind.JavaType r3 = r3.c2
            if (r3 == 0) goto L_0x00a6
            r2 = r3
            goto L_0x00a6
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0085
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r6 = r2
            goto L_0x0114
        L_0x00ab:
            java.lang.String[] r2 = r8.Y1
            r3 = 1
            if (r2 == 0) goto L_0x00c1
            int r2 = r2.length
        L_0x00b1:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00c1
            java.lang.String[] r4 = r8.Y1
            r4 = r4[r2]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00b1
            r2 = r3
            goto L_0x00c2
        L_0x00c1:
            r2 = r1
        L_0x00c2:
            if (r2 == 0) goto L_0x00c7
            com.fasterxml.jackson.databind.type.SimpleType r6 = j2
            goto L_0x0114
        L_0x00c7:
            java.lang.String[] r2 = r8.Y1
            if (r2 != 0) goto L_0x00cd
            r4 = r1
            goto L_0x00ce
        L_0x00cd:
            int r4 = r2.length
        L_0x00ce:
            if (r4 != 0) goto L_0x00d3
            java.lang.String[] r2 = new java.lang.String[r3]
            goto L_0x00db
        L_0x00d3:
            int r3 = r4 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
        L_0x00db:
            r2[r4] = r0
            com.fasterxml.jackson.databind.type.TypeBindings r0 = new com.fasterxml.jackson.databind.type.TypeBindings
            java.lang.String[] r3 = r8.x
            com.fasterxml.jackson.databind.JavaType[] r8 = r8.y
            r0.<init>(r3, r8, r2)
            monitor-enter(r7)
            java.lang.reflect.Type[] r8 = r7.getBounds()     // Catch:{ all -> 0x00f3 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f3 }
            r7 = r8[r1]
            com.fasterxml.jackson.databind.JavaType r6 = r5.b(r6, r7, r0)
            goto L_0x0114
        L_0x00f3:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f3 }
            throw r6
        L_0x00f6:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Null `bindings` passed (type variable \""
            java.lang.String r8 = "\")"
            java.lang.String r7 = i0.d.a.a.a.o0(r7, r0, r8)
            r6.<init>(r7)
            throw r6
        L_0x0104:
            boolean r0 = r7 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0115
            java.lang.reflect.WildcardType r7 = (java.lang.reflect.WildcardType) r7
            java.lang.reflect.Type[] r7 = r7.getUpperBounds()
            r7 = r7[r1]
            com.fasterxml.jackson.databind.JavaType r6 = r5.b(r6, r7, r8)
        L_0x0114:
            return r6
        L_0x0115:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unrecognized Type: "
            java.lang.StringBuilder r8 = i0.d.a.a.a.P0(r8)
            if (r7 != 0) goto L_0x0122
            java.lang.String r7 = "[null]"
            goto L_0x0126
        L_0x0122:
            java.lang.String r7 = r7.toString()
        L_0x0126:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.b(i0.f.a.c.s.a, java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings):com.fasterxml.jackson.databind.JavaType");
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType c(i0.f.a.c.s.a r20, java.lang.Class<?> r21, com.fasterxml.jackson.databind.type.TypeBindings r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r11 = r21
            r12 = r22
            com.fasterxml.jackson.databind.JavaType r2 = r0.a(r11)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            if (r12 == 0) goto L_0x0023
            boolean r2 = r22.f()
            if (r2 == 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            com.fasterxml.jackson.databind.type.TypeBindings$a r2 = new com.fasterxml.jackson.databind.type.TypeBindings$a
            com.fasterxml.jackson.databind.JavaType[] r3 = r12.y
            int r4 = r12.Z1
            r2.<init>(r11, r3, r4)
            r13 = r2
            goto L_0x0024
        L_0x0023:
            r13 = r11
        L_0x0024:
            i0.f.a.c.t.i<java.lang.Object, com.fasterxml.jackson.databind.JavaType> r2 = r0.o2
            java.lang.Object r2 = r2.get(r13)
            com.fasterxml.jackson.databind.JavaType r2 = (com.fasterxml.jackson.databind.JavaType) r2
            if (r2 == 0) goto L_0x002f
            return r2
        L_0x002f:
            if (r1 != 0) goto L_0x0038
            i0.f.a.c.s.a r1 = new i0.f.a.c.s.a
            r1.<init>(r11)
            r14 = r1
            goto L_0x006b
        L_0x0038:
            java.lang.Class<?> r3 = r1.b
            if (r3 != r11) goto L_0x003e
            r3 = r1
            goto L_0x004b
        L_0x003e:
            i0.f.a.c.s.a r3 = r1.a
        L_0x0040:
            if (r3 == 0) goto L_0x004a
            java.lang.Class<?> r4 = r3.b
            if (r4 != r11) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            i0.f.a.c.s.a r3 = r3.a
            goto L_0x0040
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x0065
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType r1 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType
            com.fasterxml.jackson.databind.type.TypeBindings r2 = q
            r1.<init>(r11, r2)
            java.util.ArrayList<com.fasterxml.jackson.databind.type.ResolvedRecursiveType> r2 = r3.c
            if (r2 != 0) goto L_0x005f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.c = r2
        L_0x005f:
            java.util.ArrayList<com.fasterxml.jackson.databind.type.ResolvedRecursiveType> r2 = r3.c
            r2.add(r1)
            return r1
        L_0x0065:
            i0.f.a.c.s.a r3 = new i0.f.a.c.s.a
            r3.<init>(r1, r11)
            r14 = r3
        L_0x006b:
            boolean r1 = r21.isArray()
            if (r1 == 0) goto L_0x0081
            java.lang.Class r1 = r21.getComponentType()
            com.fasterxml.jackson.databind.JavaType r1 = r0.b(r14, r1, r12)
            com.fasterxml.jackson.databind.type.ArrayType r1 = com.fasterxml.jackson.databind.type.ArrayType.g0(r1, r12)
            r18 = r13
            goto L_0x01cc
        L_0x0081:
            boolean r1 = r21.isInterface()
            if (r1 == 0) goto L_0x008f
            com.fasterxml.jackson.databind.JavaType[] r1 = r0.e(r14, r11, r12)
            r3 = 0
        L_0x008c:
            r15 = r1
            r10 = r3
            goto L_0x00a3
        L_0x008f:
            java.lang.annotation.Annotation[] r1 = i0.f.a.c.t.f.a
            java.lang.reflect.Type r1 = r21.getGenericSuperclass()
            if (r1 != 0) goto L_0x0099
            r1 = 0
            goto L_0x009d
        L_0x0099:
            com.fasterxml.jackson.databind.JavaType r1 = r0.b(r14, r1, r12)
        L_0x009d:
            r3 = r1
            com.fasterxml.jackson.databind.JavaType[] r1 = r0.e(r14, r11, r12)
            goto L_0x008c
        L_0x00a3:
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            if (r11 != r1) goto L_0x00b5
            com.fasterxml.jackson.databind.type.SimpleType r6 = i2
            r1 = r21
            r2 = r22
            r3 = r10
            r4 = r15
            r5 = r6
            com.fasterxml.jackson.databind.type.MapType r2 = com.fasterxml.jackson.databind.type.MapType.n0(r1, r2, r3, r4, r5, r6)
            goto L_0x00bb
        L_0x00b5:
            if (r10 == 0) goto L_0x00bb
            com.fasterxml.jackson.databind.JavaType r2 = r10.V(r11, r12, r10, r15)
        L_0x00bb:
            if (r2 != 0) goto L_0x01c9
            if (r12 != 0) goto L_0x00c3
            com.fasterxml.jackson.databind.type.TypeBindings r1 = q
            r3 = r1
            goto L_0x00c4
        L_0x00c3:
            r3 = r12
        L_0x00c4:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r2 = 0
            r4 = 1
            if (r11 != r1) goto L_0x0122
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            if (r11 != r1) goto L_0x00d1
            com.fasterxml.jackson.databind.type.SimpleType r1 = i2
            goto L_0x0116
        L_0x00d1:
            java.util.List r1 = r3.e()
            int r5 = r1.size()
            if (r5 == 0) goto L_0x0114
            r6 = 2
            if (r5 == r6) goto L_0x0105
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = i0.f.a.c.t.f.E(r21)
            r7[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r7[r4] = r2
            if (r5 != r4) goto L_0x00f4
            java.lang.String r2 = ""
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r2 = "s"
        L_0x00f6:
            r7[r6] = r2
            r2 = 3
            r7[r2] = r3
            java.lang.String r2 = "Strange Map type %s with %d type parameter%s (%s), can not resolve"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r1.<init>(r2)
            throw r1
        L_0x0105:
            java.lang.Object r2 = r1.get(r2)
            com.fasterxml.jackson.databind.JavaType r2 = (com.fasterxml.jackson.databind.JavaType) r2
            java.lang.Object r1 = r1.get(r4)
            com.fasterxml.jackson.databind.JavaType r1 = (com.fasterxml.jackson.databind.JavaType) r1
            r6 = r1
            r5 = r2
            goto L_0x0118
        L_0x0114:
            com.fasterxml.jackson.databind.type.SimpleType r1 = j2
        L_0x0116:
            r5 = r1
            r6 = r5
        L_0x0118:
            r1 = r21
            r2 = r3
            r3 = r10
            r4 = r15
            com.fasterxml.jackson.databind.type.MapType r1 = com.fasterxml.jackson.databind.type.MapType.n0(r1, r2, r3, r4, r5, r6)
            goto L_0x0151
        L_0x0122:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.String r5 = ": cannot determine type parameters"
            if (r11 != r1) goto L_0x0165
            java.util.List r1 = r3.e()
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0136
            com.fasterxml.jackson.databind.type.SimpleType r1 = j2
        L_0x0134:
            r6 = r1
            goto L_0x0143
        L_0x0136:
            int r6 = r1.size()
            if (r6 != r4) goto L_0x0155
            java.lang.Object r1 = r1.get(r2)
            com.fasterxml.jackson.databind.JavaType r1 = (com.fasterxml.jackson.databind.JavaType) r1
            goto L_0x0134
        L_0x0143:
            com.fasterxml.jackson.databind.type.CollectionType r16 = new com.fasterxml.jackson.databind.type.CollectionType
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r16
            r2 = r21
            r4 = r10
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0151:
            r18 = r13
            r13 = r10
            goto L_0x01ae
        L_0x0155:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Strange Collection type "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r2 = i0.d.a.a.a.Y(r11, r2, r5)
            r1.<init>(r2)
            throw r1
        L_0x0165:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r1 = java.util.concurrent.atomic.AtomicReference.class
            if (r11 != r1) goto L_0x01aa
            java.util.List r1 = r3.e()
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0177
            com.fasterxml.jackson.databind.type.SimpleType r1 = j2
        L_0x0175:
            r6 = r1
            goto L_0x0184
        L_0x0177:
            int r6 = r1.size()
            if (r6 != r4) goto L_0x019a
            java.lang.Object r1 = r1.get(r2)
            com.fasterxml.jackson.databind.JavaType r1 = (com.fasterxml.jackson.databind.JavaType) r1
            goto L_0x0175
        L_0x0184:
            com.fasterxml.jackson.databind.type.ReferenceType r16 = new com.fasterxml.jackson.databind.type.ReferenceType
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 0
            r1 = r16
            r2 = r21
            r4 = r10
            r5 = r15
            r18 = r13
            r13 = r10
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01ae
        L_0x019a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Strange Reference type "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r2 = i0.d.a.a.a.Y(r11, r2, r5)
            r1.<init>(r2)
            throw r1
        L_0x01aa:
            r18 = r13
            r13 = r10
            r1 = 0
        L_0x01ae:
            if (r1 != 0) goto L_0x01cc
            int r1 = r15.length
            r2 = 0
        L_0x01b2:
            if (r2 >= r1) goto L_0x01c1
            r3 = r15[r2]
            com.fasterxml.jackson.databind.JavaType r3 = r3.V(r11, r12, r13, r15)
            if (r3 == 0) goto L_0x01be
            r1 = r3
            goto L_0x01c2
        L_0x01be:
            int r2 = r2 + 1
            goto L_0x01b2
        L_0x01c1:
            r1 = 0
        L_0x01c2:
            if (r1 != 0) goto L_0x01cc
            com.fasterxml.jackson.databind.JavaType r1 = r0.d(r11, r12, r13, r15)
            goto L_0x01cc
        L_0x01c9:
            r18 = r13
            r1 = r2
        L_0x01cc:
            java.util.ArrayList<com.fasterxml.jackson.databind.type.ResolvedRecursiveType> r2 = r14.c
            if (r2 == 0) goto L_0x0204
            java.util.Iterator r2 = r2.iterator()
        L_0x01d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0204
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType r3 = (com.fasterxml.jackson.databind.type.ResolvedRecursiveType) r3
            com.fasterxml.jackson.databind.JavaType r4 = r3.c2
            if (r4 != 0) goto L_0x01e7
            r3.c2 = r1
            goto L_0x01d4
        L_0x01e7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r4 = "Trying to re-set self reference; old value = "
            java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
            com.fasterxml.jackson.databind.JavaType r3 = r3.c2
            r4.append(r3)
            java.lang.String r3 = ", new = "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x0204:
            boolean r2 = r1.z()
            if (r2 != 0) goto L_0x0211
            i0.f.a.c.t.i<java.lang.Object, com.fasterxml.jackson.databind.JavaType> r2 = r0.o2
            r11 = r18
            r2.putIfAbsent(r11, r1)
        L_0x0211:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.c(i0.f.a.c.s.a, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings):com.fasterxml.jackson.databind.JavaType");
    }

    public JavaType d(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr, (Object) null, (Object) null, false);
    }

    public JavaType[] e(a aVar, Class<?> cls, TypeBindings typeBindings) {
        Annotation[] annotationArr = f.a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return c;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = b(aVar, genericInterfaces[i], typeBindings);
        }
        return javaTypeArr;
    }

    public final boolean f(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).d2 = javaType;
            return true;
        } else if (javaType.c != javaType2.c) {
            return false;
        } else {
            List<JavaType> e = javaType.k().e();
            List<JavaType> e3 = javaType2.k().e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (!f(e.get(i), e3.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public CollectionType g(Class<? extends Collection> cls, JavaType javaType) {
        int i;
        TypeBindings typeBindings;
        String[] strArr = TypeBindings.c;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null) {
            i = 0;
        } else {
            i = typeParameters.length;
        }
        if (i == 0) {
            typeBindings = TypeBindings.q;
        } else if (i == 1) {
            typeBindings = new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Cannot create TypeBindings for class ");
            P0.append(cls.getName());
            P0.append(" with 1 type parameter: class expects ");
            P0.append(i);
            throw new IllegalArgumentException(P0.toString());
        }
        CollectionType collectionType = (CollectionType) c((a) null, cls, typeBindings);
        if (typeBindings.f() && javaType != null) {
            JavaType l = collectionType.i(Collection.class).l();
            if (!l.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{f.E(cls), javaType, l}));
            }
        }
        return collectionType;
    }

    public JavaType h(String str) throws IllegalArgumentException {
        TypeParser typeParser = this.p2;
        Objects.requireNonNull(typeParser);
        TypeParser.a aVar = new TypeParser.a(str.trim());
        JavaType b = typeParser.b(aVar);
        if (!aVar.hasMoreTokens()) {
            return b;
        }
        throw typeParser.a(aVar, "Unexpected tokens after complete type");
    }

    public JavaType i(JavaType javaType, Class<?> cls) {
        Class<?> cls2 = javaType.c;
        if (cls2 == cls) {
            return javaType;
        }
        JavaType i = javaType.i(cls);
        if (i != null) {
            return i;
        }
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[]{cls.getName(), javaType}));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), javaType}));
    }

    public MapType k(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings typeBindings;
        JavaType[] javaTypeArr = {javaType, javaType2};
        String[] strArr = TypeBindings.c;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            typeBindings = TypeBindings.q;
        } else {
            int length = typeParameters.length;
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = typeParameters[i].getName();
            }
            if (length != javaTypeArr.length) {
                StringBuilder P0 = i0.d.a.a.a.P0("Cannot create TypeBindings for class ");
                i0.d.a.a.a.p(cls, P0, " with ");
                P0.append(javaTypeArr.length);
                P0.append(" type parameter");
                P0.append(javaTypeArr.length == 1 ? "" : "s");
                P0.append(": class expects ");
                P0.append(length);
                throw new IllegalArgumentException(P0.toString());
            }
            typeBindings = new TypeBindings(strArr2, javaTypeArr, (String[]) null);
        }
        MapType mapType = (MapType) c((a) null, cls, typeBindings);
        if (typeBindings.f()) {
            JavaType i3 = mapType.i(Map.class);
            JavaType q2 = i3.q();
            if (q2.equals(javaType)) {
                JavaType l = i3.l();
                if (!l.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{f.E(cls), javaType2, l}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{f.E(cls), javaType, q2}));
            }
        }
        return mapType;
    }

    public JavaType l(JavaType javaType, Class<?> cls, boolean z) throws IllegalArgumentException {
        JavaType javaType2;
        String str;
        JavaType javaType3;
        JavaType v;
        JavaType javaType4 = javaType;
        Class<?> cls2 = cls;
        Class<Object> cls3 = Object.class;
        Class<?> cls4 = javaType4.c;
        if (cls4 == cls2) {
            return javaType4;
        }
        if (cls4 == cls3) {
            javaType2 = c((a) null, cls2, q);
        } else {
            if (cls4.isAssignableFrom(cls2)) {
                if (javaType.G()) {
                    if (javaType.O()) {
                        if (cls2 == HashMap.class || cls2 == LinkedHashMap.class || cls2 == EnumMap.class || cls2 == TreeMap.class) {
                            javaType2 = c((a) null, cls2, TypeBindings.b(cls2, javaType.q(), javaType.l()));
                        }
                    } else if (javaType.E()) {
                        if (cls2 == ArrayList.class || cls2 == LinkedList.class || cls2 == HashSet.class || cls2 == TreeSet.class) {
                            javaType2 = c((a) null, cls2, TypeBindings.a(cls2, javaType.l()));
                        } else if (cls4 == EnumSet.class) {
                            return javaType4;
                        }
                    }
                }
                if (javaType.k().f()) {
                    javaType2 = c((a) null, cls2, q);
                } else {
                    int length = cls.getTypeParameters().length;
                    if (length == 0) {
                        javaType2 = c((a) null, cls2, q);
                    } else {
                        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[length];
                        for (int i = 0; i < length; i++) {
                            placeholderForTypeArr[i] = new PlaceholderForType(i);
                        }
                        JavaType i3 = c((a) null, cls2, TypeBindings.c(cls2, placeholderForTypeArr)).i(javaType4.c);
                        if (i3 != null) {
                            List<JavaType> e = javaType.k().e();
                            List<JavaType> e3 = i3.k().e();
                            int size = e3.size();
                            int size2 = e.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    str = null;
                                    break;
                                }
                                javaType3 = e.get(i4);
                                v = i4 < size ? e3.get(i4) : v();
                                if (!f(javaType3, v)) {
                                    if (!(javaType3.c == cls3)) {
                                        if (i4 == 0 && javaType.O()) {
                                            if (v.c == cls3) {
                                                continue;
                                            }
                                        }
                                        if (!javaType3.M() || !javaType3.U(v.c)) {
                                            str = String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(size2), javaType3.e(), v.e()});
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i4++;
                            }
                            str = String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(size2), javaType3.e(), v.e()});
                            if (str == null || z) {
                                JavaType[] javaTypeArr = new JavaType[length];
                                for (int i5 = 0; i5 < length; i5++) {
                                    JavaType javaType5 = placeholderForTypeArr[i5].d2;
                                    if (javaType5 == null) {
                                        javaType5 = v();
                                    }
                                    javaTypeArr[i5] = javaType5;
                                }
                                javaType2 = c((a) null, cls2, TypeBindings.c(cls2, javaTypeArr));
                            } else {
                                StringBuilder P0 = i0.d.a.a.a.P0("Failed to specialize base type ");
                                P0.append(javaType.e());
                                P0.append(" as ");
                                P0.append(cls.getName());
                                P0.append(", problem: ");
                                P0.append(str);
                                throw new IllegalArgumentException(P0.toString());
                            }
                        } else {
                            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", new Object[]{javaType4.c.getName(), cls.getName()}));
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[]{f.E(cls), f.t(javaType)}));
            }
        }
        return javaType2.Z(javaType4);
    }

    public JavaType m(Type type) {
        return b((a) null, type, q);
    }

    public Class<?> n(String str) throws ClassNotFoundException {
        Class<?> cls;
        Throwable th = null;
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                cls = Integer.TYPE;
            } else if ("long".equals(str)) {
                cls = Long.TYPE;
            } else if ("float".equals(str)) {
                cls = Float.TYPE;
            } else if ("double".equals(str)) {
                cls = Double.TYPE;
            } else if ("boolean".equals(str)) {
                cls = Boolean.TYPE;
            } else if ("byte".equals(str)) {
                cls = Byte.TYPE;
            } else if ("char".equals(str)) {
                cls = Character.TYPE;
            } else if ("short".equals(str)) {
                cls = Short.TYPE;
            } else {
                cls = "void".equals(str) ? Void.TYPE : null;
            }
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e) {
                th = f.s(e);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e3) {
            if (th == null) {
                th = f.s(e3);
            }
            f.K(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public JavaType[] p(JavaType javaType, Class<?> cls) {
        JavaType i = javaType.i(cls);
        if (i == null) {
            return c;
        }
        return i.k().y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = a(r3);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType q(java.lang.Class<?> r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.type.TypeBindings r0 = q
            boolean r1 = r0.f()
            if (r1 == 0) goto L_0x000f
            com.fasterxml.jackson.databind.JavaType r1 = r2.a(r3)
            if (r1 == 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            r1 = 0
            com.fasterxml.jackson.databind.JavaType r1 = r2.d(r3, r0, r1, r1)
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.q(java.lang.Class):com.fasterxml.jackson.databind.JavaType");
    }
}
