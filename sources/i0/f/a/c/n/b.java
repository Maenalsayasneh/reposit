package i0.f.a.c.n;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.n.e;
import i0.f.a.c.n.f;
import i0.f.a.c.n.k;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AnnotatedClass */
public final class b extends a implements q {
    public static final a c = new a((AnnotatedConstructor) null, Collections.emptyList(), Collections.emptyList());
    public final AnnotationIntrospector Y1;
    public final TypeFactory Z1;
    public final k.a a2;
    public final Class<?> b2;
    public final boolean c2;
    public final JavaType d;
    public final i0.f.a.c.t.a d2;
    public a e2;
    public g f2;
    public List<AnnotatedField> g2;
    public transient Boolean h2;
    public final Class<?> q;
    public final TypeBindings x;
    public final List<JavaType> y;

    /* compiled from: AnnotatedClass */
    public static final class a {
        public final AnnotatedConstructor a;
        public final List<AnnotatedConstructor> b;
        public final List<AnnotatedMethod> c;

        public a(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.a = annotatedConstructor;
            this.b = list;
            this.c = list2;
        }
    }

    public b(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, i0.f.a.c.t.a aVar, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, k.a aVar2, TypeFactory typeFactory, boolean z) {
        this.d = javaType;
        this.q = cls;
        this.y = list;
        this.b2 = cls2;
        this.d2 = aVar;
        this.x = typeBindings;
        this.Y1 = annotationIntrospector;
        this.a2 = aVar2;
        this.Z1 = typeFactory;
        this.c2 = z;
    }

    public JavaType a(Type type) {
        return this.Z1.b((i0.f.a.c.s.a) null, type, this.x);
    }

    public <A extends Annotation> A c(Class<A> cls) {
        return this.d2.a(cls);
    }

    public String d() {
        return this.q.getName();
    }

    public Class<?> e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!f.u(obj, b.class)) {
            return false;
        }
        if (((b) obj).q == this.q) {
            return true;
        }
        return false;
    }

    public JavaType f() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.f.a.c.n.b.a g() {
        /*
            r24 = this;
            r0 = r24
            i0.f.a.c.n.b$a r1 = r0.e2
            if (r1 != 0) goto L_0x0365
            com.fasterxml.jackson.databind.JavaType r1 = r0.d
            if (r1 != 0) goto L_0x000e
            i0.f.a.c.n.b$a r1 = c
            goto L_0x0363
        L_0x000e:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r0.Y1
            com.fasterxml.jackson.databind.type.TypeFactory r3 = r0.Z1
            java.lang.Class<?> r4 = r0.b2
            boolean r5 = r0.c2
            r6 = 1
            if (r4 == 0) goto L_0x001b
            r8 = r6
            goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            r5 = r5 | r8
            i0.f.a.c.n.d r8 = new i0.f.a.c.n.d
            r8.<init>(r2, r0, r5)
            boolean r2 = r1.I()
            r5 = 0
            if (r2 != 0) goto L_0x0056
            java.lang.Class<?> r2 = r1.c
            i0.f.a.c.t.f$a[] r2 = i0.f.a.c.t.f.p(r2)
            int r9 = r2.length
            r11 = r5
            r12 = r11
            r10 = 0
        L_0x0033:
            if (r10 >= r9) goto L_0x0058
            r13 = r2[r10]
            java.lang.reflect.Constructor<?> r14 = r13.a
            boolean r14 = r14.isSynthetic()
            r14 = r14 ^ r6
            if (r14 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            int r14 = r13.a()
            if (r14 != 0) goto L_0x0049
            r11 = r13
            goto L_0x0053
        L_0x0049:
            if (r12 != 0) goto L_0x0050
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0050:
            r12.add(r13)
        L_0x0053:
            int r10 = r10 + 1
            goto L_0x0033
        L_0x0056:
            r11 = r5
            r12 = r11
        L_0x0058:
            if (r12 != 0) goto L_0x0065
            java.util.List r2 = java.util.Collections.emptyList()
            if (r11 != 0) goto L_0x0062
            goto L_0x011d
        L_0x0062:
            r9 = r2
            r2 = 0
            goto L_0x0077
        L_0x0065:
            int r2 = r12.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            r10 = 0
        L_0x006f:
            if (r10 >= r2) goto L_0x0077
            r9.add(r5)
            int r10 = r10 + 1
            goto L_0x006f
        L_0x0077:
            if (r4 == 0) goto L_0x00ec
            i0.f.a.c.t.f$a[] r10 = i0.f.a.c.t.f.p(r4)
            int r13 = r10.length
            r15 = r5
            r14 = 0
        L_0x0080:
            if (r14 >= r13) goto L_0x00ec
            r6 = r10[r14]
            int r16 = r6.a()
            if (r16 != 0) goto L_0x00a4
            if (r11 == 0) goto L_0x00a1
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r7 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            i0.f.a.c.n.q r5 = r8.d
            r17 = r10
            java.lang.reflect.Constructor<?> r10 = r11.a
            i0.f.a.c.n.h r6 = r8.g(r11, r6)
            i0.f.a.c.n.h[] r11 = i0.f.a.c.n.l.a
            r7.<init>(r5, r10, r6, r11)
            r8.f = r7
            r11 = 0
            goto L_0x00e5
        L_0x00a1:
            r17 = r10
            goto L_0x00e5
        L_0x00a4:
            r17 = r10
            if (r12 == 0) goto L_0x00e5
            if (r15 != 0) goto L_0x00c2
            i0.f.a.c.n.m[] r5 = new i0.f.a.c.n.m[r2]
            r7 = 0
        L_0x00ad:
            if (r7 >= r2) goto L_0x00c1
            i0.f.a.c.n.m r10 = new i0.f.a.c.n.m
            java.lang.Object r15 = r12.get(r7)
            i0.f.a.c.t.f$a r15 = (i0.f.a.c.t.f.a) r15
            java.lang.reflect.Constructor<?> r15 = r15.a
            r10.<init>((java.lang.reflect.Constructor<?>) r15)
            r5[r7] = r10
            int r7 = r7 + 1
            goto L_0x00ad
        L_0x00c1:
            r15 = r5
        L_0x00c2:
            i0.f.a.c.n.m r5 = new i0.f.a.c.n.m
            java.lang.reflect.Constructor<?> r7 = r6.a
            r5.<init>((java.lang.reflect.Constructor<?>) r7)
            r7 = 0
        L_0x00ca:
            if (r7 >= r2) goto L_0x00e5
            r10 = r15[r7]
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x00e2
            java.lang.Object r5 = r12.get(r7)
            i0.f.a.c.t.f$a r5 = (i0.f.a.c.t.f.a) r5
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r5 = r8.k(r5, r6)
            r9.set(r7, r5)
            goto L_0x00e5
        L_0x00e2:
            int r7 = r7 + 1
            goto L_0x00ca
        L_0x00e5:
            int r14 = r14 + 1
            r10 = r17
            r5 = 0
            r6 = 1
            goto L_0x0080
        L_0x00ec:
            if (r11 == 0) goto L_0x0100
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r5 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            i0.f.a.c.n.q r6 = r8.d
            java.lang.reflect.Constructor<?> r7 = r11.a
            r10 = 0
            i0.f.a.c.n.h r11 = r8.g(r11, r10)
            i0.f.a.c.n.h[] r10 = i0.f.a.c.n.l.a
            r5.<init>(r6, r7, r11, r10)
            r8.f = r5
        L_0x0100:
            r5 = 0
        L_0x0101:
            if (r5 >= r2) goto L_0x011c
            java.lang.Object r6 = r9.get(r5)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r6 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r6
            if (r6 != 0) goto L_0x0119
            java.lang.Object r6 = r12.get(r5)
            i0.f.a.c.t.f$a r6 = (i0.f.a.c.t.f.a) r6
            r7 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r6 = r8.k(r6, r7)
            r9.set(r5, r6)
        L_0x0119:
            int r5 = r5 + 1
            goto L_0x0101
        L_0x011c:
            r2 = r9
        L_0x011d:
            java.lang.Class<?> r5 = r1.c
            java.lang.reflect.Method[] r5 = i0.f.a.c.t.f.o(r5)
            int r6 = r5.length
            r7 = 0
            r10 = 0
        L_0x0126:
            if (r7 >= r6) goto L_0x013e
            r9 = r5[r7]
            boolean r11 = i0.f.a.c.n.d.f(r9)
            if (r11 != 0) goto L_0x0131
            goto L_0x013b
        L_0x0131:
            if (r10 != 0) goto L_0x0138
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0138:
            r10.add(r9)
        L_0x013b:
            int r7 = r7 + 1
            goto L_0x0126
        L_0x013e:
            if (r10 != 0) goto L_0x0146
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0314
        L_0x0146:
            i0.f.a.c.n.q$b r6 = new i0.f.a.c.n.q$b
            r6.<init>(r3)
            int r7 = r10.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r7)
            r11 = 0
        L_0x0155:
            if (r11 >= r7) goto L_0x015e
            r12 = 0
            r9.add(r12)
            int r11 = r11 + 1
            goto L_0x0155
        L_0x015e:
            if (r4 == 0) goto L_0x01b9
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            int r11 = r4.length
            r12 = 0
            r13 = 0
        L_0x0167:
            if (r13 >= r11) goto L_0x01b9
            r14 = r4[r13]
            boolean r15 = i0.f.a.c.n.d.f(r14)
            if (r15 != 0) goto L_0x0174
            r19 = r4
            goto L_0x01b4
        L_0x0174:
            if (r12 != 0) goto L_0x0191
            i0.f.a.c.n.m[] r12 = new i0.f.a.c.n.m[r7]
            r15 = 0
        L_0x0179:
            if (r15 >= r7) goto L_0x0191
            i0.f.a.c.n.m r5 = new i0.f.a.c.n.m
            java.lang.Object r18 = r10.get(r15)
            r19 = r4
            r4 = r18
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r5.<init>((java.lang.reflect.Method) r4)
            r12[r15] = r5
            int r15 = r15 + 1
            r4 = r19
            goto L_0x0179
        L_0x0191:
            r19 = r4
            i0.f.a.c.n.m r4 = new i0.f.a.c.n.m
            r4.<init>((java.lang.reflect.Method) r14)
            r5 = 0
        L_0x0199:
            if (r5 >= r7) goto L_0x01b4
            r15 = r12[r5]
            boolean r15 = r4.equals(r15)
            if (r15 == 0) goto L_0x01b1
            java.lang.Object r4 = r10.get(r5)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r4 = r8.j(r4, r6, r14)
            r9.set(r5, r4)
            goto L_0x01b4
        L_0x01b1:
            int r5 = r5 + 1
            goto L_0x0199
        L_0x01b4:
            int r13 = r13 + 1
            r4 = r19
            goto L_0x0167
        L_0x01b9:
            r4 = 0
        L_0x01ba:
            if (r4 >= r7) goto L_0x0313
            java.lang.Object r5 = r9.get(r4)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r5
            if (r5 != 0) goto L_0x0303
            java.lang.Object r5 = r10.get(r4)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.reflect.TypeVariable[] r11 = r5.getTypeParameters()
            int r12 = r11.length
            if (r12 == 0) goto L_0x02ea
            com.fasterxml.jackson.databind.type.TypeBindings r12 = r1.k()
            boolean r12 = r12.f()
            if (r12 == 0) goto L_0x01dd
            goto L_0x02ea
        L_0x01dd:
            java.lang.reflect.Type r12 = r5.getGenericReturnType()
            boolean r13 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r13 != 0) goto L_0x01e7
            goto L_0x02ea
        L_0x01e7:
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.Class<?> r13 = r1.c
            java.lang.reflect.Type r14 = r12.getRawType()
            boolean r13 = java.util.Objects.equals(r13, r14)
            if (r13 != 0) goto L_0x01f7
            goto L_0x02ea
        L_0x01f7:
            java.lang.reflect.Type[] r12 = r12.getActualTypeArguments()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r11.length
            r13.<init>(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r11.length
            r14.<init>(r15)
            r18 = r7
            r15 = 0
        L_0x020a:
            int r7 = r12.length
            if (r15 >= r7) goto L_0x02b8
            r7 = r12[r15]
            java.lang.reflect.TypeVariable r7 = h0.b0.v.W0(r7)
            if (r7 == 0) goto L_0x02a4
            java.lang.String r7 = r7.getName()
            if (r7 != 0) goto L_0x021f
            r20 = r1
            goto L_0x02ee
        L_0x021f:
            r19 = r10
            com.fasterxml.jackson.databind.type.TypeBindings r10 = r1.k()
            com.fasterxml.jackson.databind.JavaType r10 = r10.d(r15)
            if (r10 != 0) goto L_0x022f
            r20 = r1
            goto L_0x02f0
        L_0x022f:
            r20 = r1
            int r1 = r11.length
            r21 = r12
            r12 = 0
        L_0x0235:
            if (r12 >= r1) goto L_0x024b
            r22 = r11[r12]
            r23 = r1
            java.lang.String r1 = r22.getName()
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0246
            goto L_0x024d
        L_0x0246:
            int r12 = r12 + 1
            r1 = r23
            goto L_0x0235
        L_0x024b:
            r22 = 0
        L_0x024d:
            if (r22 != 0) goto L_0x0251
            goto L_0x02f0
        L_0x0251:
            java.lang.reflect.Type[] r1 = r22.getBounds()
            int r12 = r1.length
            r22 = r11
            r11 = 0
        L_0x0259:
            if (r11 >= r12) goto L_0x026c
            r23 = r12
            r12 = r1[r11]
            boolean r12 = h0.b0.v.o1(r6, r10, r12)
            if (r12 != 0) goto L_0x0267
            r1 = 0
            goto L_0x026d
        L_0x0267:
            int r11 = r11 + 1
            r12 = r23
            goto L_0x0259
        L_0x026c:
            r1 = 1
        L_0x026d:
            if (r1 == 0) goto L_0x02ac
            int r1 = r13.indexOf(r7)
            r11 = -1
            if (r1 == r11) goto L_0x029d
            java.lang.Object r7 = r14.get(r1)
            com.fasterxml.jackson.databind.JavaType r7 = (com.fasterxml.jackson.databind.JavaType) r7
            boolean r11 = r10.equals(r7)
            if (r11 == 0) goto L_0x0283
            goto L_0x02ac
        L_0x0283:
            java.lang.Class<?> r11 = r10.c
            boolean r11 = r7.T(r11)
            java.lang.Class<?> r7 = r7.c
            boolean r7 = r10.T(r7)
            if (r11 != 0) goto L_0x0294
            if (r7 != 0) goto L_0x0294
            goto L_0x02f0
        L_0x0294:
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02ac
            if (r7 == 0) goto L_0x02ac
            r14.set(r1, r10)
            goto L_0x02ac
        L_0x029d:
            r13.add(r7)
            r14.add(r10)
            goto L_0x02ac
        L_0x02a4:
            r20 = r1
            r19 = r10
            r22 = r11
            r21 = r12
        L_0x02ac:
            int r15 = r15 + 1
            r10 = r19
            r1 = r20
            r12 = r21
            r11 = r22
            goto L_0x020a
        L_0x02b8:
            r20 = r1
            r19 = r10
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x02c3
            goto L_0x02f0
        L_0x02c3:
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x02e7
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x02d0
            goto L_0x02e7
        L_0x02d0:
            com.fasterxml.jackson.databind.type.TypeBindings r1 = new com.fasterxml.jackson.databind.type.TypeBindings
            java.lang.String[] r7 = com.fasterxml.jackson.databind.type.TypeBindings.c
            java.lang.Object[] r7 = r13.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            com.fasterxml.jackson.databind.JavaType[] r10 = com.fasterxml.jackson.databind.type.TypeBindings.d
            java.lang.Object[] r10 = r14.toArray(r10)
            com.fasterxml.jackson.databind.JavaType[] r10 = (com.fasterxml.jackson.databind.JavaType[]) r10
            r11 = 0
            r1.<init>(r7, r10, r11)
            goto L_0x02f1
        L_0x02e7:
            com.fasterxml.jackson.databind.type.TypeBindings r1 = com.fasterxml.jackson.databind.type.TypeBindings.q
            goto L_0x02f1
        L_0x02ea:
            r20 = r1
            r18 = r7
        L_0x02ee:
            r19 = r10
        L_0x02f0:
            r1 = 0
        L_0x02f1:
            if (r1 != 0) goto L_0x02f5
            r7 = r6
            goto L_0x02fa
        L_0x02f5:
            i0.f.a.c.n.q$a r7 = new i0.f.a.c.n.q$a
            r7.<init>(r3, r1)
        L_0x02fa:
            r1 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r5 = r8.j(r5, r7, r1)
            r9.set(r4, r5)
            goto L_0x0309
        L_0x0303:
            r20 = r1
            r18 = r7
            r19 = r10
        L_0x0309:
            int r4 = r4 + 1
            r7 = r18
            r10 = r19
            r1 = r20
            goto L_0x01ba
        L_0x0313:
            r1 = r9
        L_0x0314:
            boolean r3 = r8.e
            if (r3 == 0) goto L_0x035b
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r3 = r8.f
            if (r3 == 0) goto L_0x0327
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8.c
            boolean r3 = r4.w0(r3)
            if (r3 == 0) goto L_0x0327
            r3 = 0
            r8.f = r3
        L_0x0327:
            int r3 = r2.size()
        L_0x032b:
            r4 = -1
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x0341
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8.c
            java.lang.Object r5 = r2.get(r3)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r5
            boolean r4 = r4.w0(r5)
            if (r4 == 0) goto L_0x032b
            r2.remove(r3)
            goto L_0x032b
        L_0x0341:
            int r3 = r1.size()
            r4 = -1
        L_0x0346:
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x035b
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r8.c
            java.lang.Object r6 = r1.get(r3)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r6
            boolean r5 = r5.w0(r6)
            if (r5 == 0) goto L_0x0346
            r1.remove(r3)
            goto L_0x0346
        L_0x035b:
            i0.f.a.c.n.b$a r3 = new i0.f.a.c.n.b$a
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r4 = r8.f
            r3.<init>(r4, r2, r1)
            r1 = r3
        L_0x0363:
            r0.e2 = r1
        L_0x0365:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.b.g():i0.f.a.c.n.b$a");
    }

    public final g h() {
        boolean z;
        AnnotatedMethod annotatedMethod;
        Class<?> a3;
        g gVar = this.f2;
        if (gVar == null) {
            JavaType javaType = this.d;
            if (javaType == null) {
                gVar = new g();
            } else {
                AnnotationIntrospector annotationIntrospector = this.Y1;
                k.a aVar = this.a2;
                TypeFactory typeFactory = this.Z1;
                List<JavaType> list = this.y;
                Class<?> cls = this.b2;
                f fVar = new f(annotationIntrospector, aVar, this.c2);
                Class<Object> cls2 = Object.class;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                fVar.f(this, javaType.c, linkedHashMap, cls);
                Iterator<JavaType> it = list.iterator();
                while (true) {
                    Class<?> cls3 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    JavaType next = it.next();
                    k.a aVar2 = fVar.d;
                    if (aVar2 != null) {
                        cls3 = aVar2.a(next.c);
                    }
                    fVar.f(new q.a(typeFactory, next.k()), next.c, linkedHashMap, cls3);
                }
                k.a aVar3 = fVar.d;
                if (aVar3 == null || (a3 = aVar3.a(cls2)) == null) {
                    z = false;
                } else {
                    fVar.g(this, javaType.c, linkedHashMap, a3);
                    z = true;
                }
                if (z && fVar.c != null && !linkedHashMap.isEmpty()) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        m mVar = (m) entry.getKey();
                        if ("hashCode".equals(mVar.b) && mVar.c.length == 0) {
                            try {
                                Method declaredMethod = cls2.getDeclaredMethod(mVar.b, new Class[0]);
                                if (declaredMethod != null) {
                                    f.a aVar4 = (f.a) entry.getValue();
                                    aVar4.c = fVar.d(aVar4.c, declaredMethod.getDeclaredAnnotations());
                                    aVar4.b = declaredMethod;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    gVar = new g();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        f.a aVar5 = (f.a) entry2.getValue();
                        Method method = aVar5.b;
                        if (method == null) {
                            annotatedMethod = null;
                        } else {
                            annotatedMethod = new AnnotatedMethod(aVar5.a, method, aVar5.c.b(), (h[]) null);
                        }
                        if (annotatedMethod != null) {
                            linkedHashMap2.put(entry2.getKey(), annotatedMethod);
                        }
                    }
                    gVar = new g(linkedHashMap2);
                }
            }
            this.f2 = gVar;
        }
        return gVar;
    }

    public int hashCode() {
        return this.q.getName().hashCode();
    }

    public Iterable<AnnotatedField> i() {
        List<AnnotatedField> list = this.g2;
        if (list == null) {
            JavaType javaType = this.d;
            if (javaType == null) {
                list = Collections.emptyList();
            } else {
                Map<String, e.a> f = new e(this.Y1, this.Z1, this.a2, this.c2).f(this, javaType, (Map<String, e.a>) null);
                if (f == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList(f.size());
                    for (e.a next : f.values()) {
                        arrayList.add(new AnnotatedField(next.a, next.b, next.c.b()));
                    }
                    list = arrayList;
                }
            }
            this.g2 = list;
        }
        return list;
    }

    public List<AnnotatedConstructor> k() {
        return g().b;
    }

    public List<AnnotatedMethod> l() {
        return g().c;
    }

    public boolean m() {
        Boolean bool = this.h2;
        if (bool == null) {
            bool = Boolean.valueOf(i0.f.a.c.t.f.z(this.q));
            this.h2 = bool;
        }
        return bool.booleanValue();
    }

    public String toString() {
        return i0.d.a.a.a.Y(this.q, i0.d.a.a.a.P0("[AnnotedClass "), "]");
    }

    public b(Class<?> cls) {
        this.d = null;
        this.q = cls;
        this.y = Collections.emptyList();
        this.b2 = null;
        this.d2 = AnnotationCollector.a;
        this.x = TypeBindings.q;
        this.Y1 = null;
        this.a2 = null;
        this.Z1 = null;
        this.c2 = false;
    }
}
