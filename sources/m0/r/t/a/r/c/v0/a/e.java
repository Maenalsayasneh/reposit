package m0.r.t.a.r.c.v0.a;

import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.e.b.a;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectKotlinClass.kt */
public final class e implements j {
    public final Class<?> a;
    public final KotlinClassHeader b;

    public e(Class cls, KotlinClassHeader kotlinClassHeader, f fVar) {
        this.a = cls;
        this.b = kotlinClassHeader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r0.h == null) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.c.v0.a.e d(java.lang.Class<?> r14) {
        /*
            java.lang.String r0 = "klass"
            m0.n.b.i.e(r14, r0)
            m0.r.t.a.r.e.b.t.a r0 = new m0.r.t.a.r.e.b.t.a
            r0.<init>()
            m0.r.t.a.r.c.v0.a.c.b(r14, r0)
            m0.r.t.a.r.c.v0.a.e r1 = new m0.r.t.a.r.c.v0.a.e
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.k
            r3 = 0
            if (r2 == 0) goto L_0x006c
            int[] r2 = r0.c
            if (r2 != 0) goto L_0x0019
            goto L_0x006c
        L_0x0019:
            m0.r.t.a.r.f.d.a.f r6 = new m0.r.t.a.r.f.d.a.f
            int[] r2 = r0.c
            int r4 = r0.f
            r4 = r4 & 8
            r5 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = r7
        L_0x0028:
            r6.<init>(r2, r4)
            boolean r2 = r6.c()
            if (r2 != 0) goto L_0x0038
            java.lang.String[] r2 = r0.h
            r0.j = r2
            r0.h = r3
            goto L_0x004f
        L_0x0038:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.k
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
            if (r2 == r4) goto L_0x0048
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE
            if (r2 == r4) goto L_0x0048
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
            if (r2 != r4) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r5 = r7
        L_0x0048:
            if (r5 == 0) goto L_0x004f
            java.lang.String[] r2 = r0.h
            if (r2 != 0) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r0.k
            m0.r.t.a.r.f.d.a.c r4 = r0.d
            if (r4 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            m0.r.t.a.r.f.d.a.c r4 = m0.r.t.a.r.f.d.a.c.f
        L_0x005a:
            r7 = r4
            java.lang.String[] r8 = r0.h
            java.lang.String[] r9 = r0.j
            java.lang.String[] r10 = r0.i
            java.lang.String r11 = r0.e
            int r12 = r0.f
            java.lang.String r13 = r0.g
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x006d
        L_0x006c:
            r2 = r3
        L_0x006d:
            if (r2 != 0) goto L_0x0070
            return r3
        L_0x0070:
            r1.<init>(r14, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.v0.a.e.d(java.lang.Class):m0.r.t.a.r.c.v0.a.e");
    }

    public KotlinClassHeader a() {
        return this.b;
    }

    public void b(j.c cVar, byte[] bArr) {
        i.e(cVar, "visitor");
        c.b(this.a, cVar);
    }

    public void c(j.d dVar, byte[] bArr) {
        String str;
        String str2;
        String str3;
        j.d dVar2 = dVar;
        i.e(dVar2, "visitor");
        Class<?> cls = this.a;
        i.e(cls, "klass");
        i.e(dVar2, "memberVisitor");
        Method[] declaredMethods = cls.getDeclaredMethods();
        i.d(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            str3 = "sb.toString()";
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            i++;
            d g = d.g(method.getName());
            i.d(g, "identifier(method.name)");
            i.d(method, "method");
            i.e(method, "method");
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Class[] parameterTypes = method.getParameterTypes();
            i.d(parameterTypes, "method.parameterTypes");
            int length2 = parameterTypes.length;
            int i2 = 0;
            while (i2 < length2) {
                Class cls2 = parameterTypes[i2];
                i2++;
                i.d(cls2, str2);
                sb.append(ReflectClassUtilKt.c(cls2));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            i.d(returnType, "method.returnType");
            sb.append(ReflectClassUtilKt.c(returnType));
            String sb2 = sb.toString();
            i.d(sb2, str3);
            j.e b2 = ((a) dVar2).b(g, sb2);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            i.d(declaredAnnotations, "method.declaredAnnotations");
            int length3 = declaredAnnotations.length;
            int i3 = 0;
            while (i3 < length3) {
                Annotation annotation = declaredAnnotations[i3];
                i3++;
                i.d(annotation, "annotation");
                c.c(b2, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            i.d(parameterAnnotations, "method.parameterAnnotations");
            int length4 = parameterAnnotations.length;
            int i4 = 0;
            while (i4 < length4) {
                Annotation[] annotationArr = parameterAnnotations[i4];
                int i5 = i4 + 1;
                i.d(annotationArr, str);
                int length5 = annotationArr.length;
                int i6 = 0;
                while (i6 < length5) {
                    Annotation annotation2 = annotationArr[i6];
                    i6++;
                    Method[] methodArr = declaredMethods;
                    Class l1 = h.l1(h.N0(annotation2));
                    int i7 = length;
                    m0.r.t.a.r.g.a b3 = ReflectClassUtilKt.b(l1);
                    int i8 = i;
                    i.d(annotation2, "annotation");
                    Annotation[][] annotationArr2 = parameterAnnotations;
                    j.a c = ((a.C0259a) b2).c(i4, b3, new b(annotation2));
                    if (c != null) {
                        c.d(c, annotation2, l1);
                    }
                    declaredMethods = methodArr;
                    length = i7;
                    i = i8;
                    parameterAnnotations = annotationArr2;
                }
                i4 = i5;
            }
            Method[] methodArr2 = declaredMethods;
            int i9 = length;
            int i10 = i;
            ((a.b) b2).a();
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        i.d(declaredConstructors, "klass.declaredConstructors");
        int length6 = declaredConstructors.length;
        int i11 = 0;
        while (i11 < length6) {
            Constructor constructor = declaredConstructors[i11];
            int i12 = i11 + 1;
            d j = d.j("<init>");
            i.d(j, "special(\"<init>\")");
            i.d(constructor, "constructor");
            i.e(constructor, "constructor");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("(");
            Class[] parameterTypes2 = constructor.getParameterTypes();
            i.d(parameterTypes2, "constructor.parameterTypes");
            int length7 = parameterTypes2.length;
            int i13 = 0;
            while (i13 < length7) {
                Constructor[] constructorArr = declaredConstructors;
                Class cls3 = parameterTypes2[i13];
                i13++;
                i.d(cls3, str2);
                sb3.append(ReflectClassUtilKt.c(cls3));
                declaredConstructors = constructorArr;
            }
            Constructor[] constructorArr2 = declaredConstructors;
            sb3.append(")V");
            String sb4 = sb3.toString();
            i.d(sb4, str3);
            j.e b4 = ((a) dVar2).b(j, sb4);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            i.d(declaredAnnotations2, "constructor.declaredAnnotations");
            int length8 = declaredAnnotations2.length;
            int i14 = 0;
            while (i14 < length8) {
                Annotation annotation3 = declaredAnnotations2[i14];
                i14++;
                i.d(annotation3, "annotation");
                c.c(b4, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            i.d(parameterAnnotations2, "parameterAnnotations");
            if (!(parameterAnnotations2.length == 0)) {
                int length9 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length10 = parameterAnnotations2.length;
                int i15 = 0;
                while (i15 < length10) {
                    Annotation[] annotationArr3 = parameterAnnotations2[i15];
                    int i16 = i15 + 1;
                    i.d(annotationArr3, str);
                    int i17 = length6;
                    int length11 = annotationArr3.length;
                    int i18 = i12;
                    int i19 = 0;
                    while (i19 < length11) {
                        int i20 = length11;
                        Annotation annotation4 = annotationArr3[i19];
                        int i21 = i19 + 1;
                        Class l12 = h.l1(h.N0(annotation4));
                        String str4 = str;
                        int i22 = i15 + length9;
                        int i23 = length9;
                        m0.r.t.a.r.g.a b5 = ReflectClassUtilKt.b(l12);
                        String str5 = str2;
                        i.d(annotation4, "annotation");
                        String str6 = str3;
                        j.a c2 = ((a.C0259a) b4).c(i22, b5, new b(annotation4));
                        if (c2 != null) {
                            c.d(c2, annotation4, l12);
                        }
                        length11 = i20;
                        str = str4;
                        i19 = i21;
                        length9 = i23;
                        str2 = str5;
                        str3 = str6;
                    }
                    i15 = i16;
                    length6 = i17;
                    i12 = i18;
                }
            }
            ((a.b) b4).a();
            declaredConstructors = constructorArr2;
            length6 = length6;
            i11 = i12;
            str = str;
            str2 = str2;
            str3 = str3;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        i.d(declaredFields, "klass.declaredFields");
        int length12 = declaredFields.length;
        int i24 = 0;
        while (i24 < length12) {
            Field field = declaredFields[i24];
            i24++;
            d g2 = d.g(field.getName());
            i.d(g2, "identifier(field.name)");
            i.d(field, "field");
            i.e(field, "field");
            Class<?> type = field.getType();
            i.d(type, "field.type");
            j.c a2 = ((a) dVar2).a(g2, ReflectClassUtilKt.c(type), (Object) null);
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            i.d(declaredAnnotations3, "field.declaredAnnotations");
            int length13 = declaredAnnotations3.length;
            int i25 = 0;
            while (i25 < length13) {
                Annotation annotation5 = declaredAnnotations3[i25];
                i25++;
                i.d(annotation5, "annotation");
                c.c(a2, annotation5);
            }
            ((a.b) a2).a();
        }
    }

    public m0.r.t.a.r.g.a e() {
        return ReflectClassUtilKt.b(this.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public String getLocation() {
        String name = this.a.getName();
        i.d(name, "klass.name");
        return i.k(StringsKt__IndentKt.A(name, '.', '/', false, 4), ".class");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        i0.d.a.a.a.p(e.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
