package i0.f.a.c.n;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import i0.f.a.c.t.a;
import i0.f.a.c.t.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: AnnotatedCreatorCollector */
public final class d extends l {
    public final q d;
    public final boolean e;
    public AnnotatedConstructor f;

    public d(AnnotationIntrospector annotationIntrospector, q qVar, boolean z) {
        super(annotationIntrospector);
        this.d = qVar;
        this.e = z;
    }

    public static boolean f(Method method) {
        return Modifier.isStatic(method.getModifiers()) && !method.isSynthetic();
    }

    public final h g(f.a aVar, f.a aVar2) {
        if (!this.e) {
            return new h();
        }
        Annotation[] annotationArr = aVar.b;
        if (annotationArr == null) {
            annotationArr = aVar.a.getDeclaredAnnotations();
            aVar.b = annotationArr;
        }
        AnnotationCollector c = c(annotationArr);
        if (aVar2 != null) {
            Annotation[] annotationArr2 = aVar2.b;
            if (annotationArr2 == null) {
                annotationArr2 = aVar2.a.getDeclaredAnnotations();
                aVar2.b = annotationArr2;
            }
            c = b(c, annotationArr2);
        }
        return c.b();
    }

    public final h h(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector c = c(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            c = b(c, annotatedElement2.getDeclaredAnnotations());
        }
        return c.b();
    }

    public final h[] i(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.e) {
            return l.a;
        }
        int length = annotationArr.length;
        h[] hVarArr = new h[length];
        for (int i = 0; i < length; i++) {
            a aVar = AnnotationCollector.a;
            AnnotationCollector b = b(AnnotationCollector.a.c, annotationArr[i]);
            if (annotationArr2 != null) {
                b = b(b, annotationArr2[i]);
            }
            hVarArr[i] = b.b();
        }
        return hVarArr;
    }

    public AnnotatedMethod j(Method method, q qVar, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this.c == null) {
            return new AnnotatedMethod(qVar, method, new h(), l.a(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(qVar, method, h(method, method2), l.a);
        }
        h h = h(method, method2);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(qVar, method, h, i(parameterAnnotations, annotationArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: i0.f.a.c.n.h[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: i0.f.a.c.n.h[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: i0.f.a.c.n.h[]} */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor k(i0.f.a.c.t.f.a r9, i0.f.a.c.t.f.a r10) {
        /*
            r8 = this;
            int r0 = r9.a()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r8.c
            if (r1 != 0) goto L_0x001b
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            i0.f.a.c.n.q r1 = r8.d
            java.lang.reflect.Constructor<?> r9 = r9.a
            i0.f.a.c.n.h r2 = new i0.f.a.c.n.h
            r2.<init>()
            i0.f.a.c.n.h[] r0 = i0.f.a.c.n.l.a(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001b:
            if (r0 != 0) goto L_0x002d
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            i0.f.a.c.n.q r1 = r8.d
            java.lang.reflect.Constructor<?> r2 = r9.a
            i0.f.a.c.n.h r9 = r8.g(r9, r10)
            i0.f.a.c.n.h[] r10 = i0.f.a.c.n.l.a
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x002d:
            java.lang.annotation.Annotation[][] r1 = r9.c
            if (r1 != 0) goto L_0x0039
            java.lang.reflect.Constructor<?> r1 = r9.a
            java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
            r9.c = r1
        L_0x0039:
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x00a5
            java.lang.reflect.Constructor<?> r2 = r9.a
            java.lang.Class r2 = r2.getDeclaringClass()
            boolean r4 = i0.f.a.c.t.f.w(r2)
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x005f
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x005f
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            i0.f.a.c.n.h[] r1 = r8.i(r2, r3)
        L_0x005c:
            r3 = r1
            r1 = r2
            goto L_0x007a
        L_0x005f:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x007a
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x007a
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = i0.f.a.c.n.l.b
            r2[r5] = r1
            i0.f.a.c.n.h[] r1 = r8.i(r2, r3)
            goto L_0x005c
        L_0x007a:
            if (r3 == 0) goto L_0x007d
            goto L_0x00b9
        L_0x007d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.reflect.Constructor<?> r9 = r9.a
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x00a5:
            if (r10 != 0) goto L_0x00a8
            goto L_0x00b5
        L_0x00a8:
            java.lang.annotation.Annotation[][] r0 = r10.c
            if (r0 != 0) goto L_0x00b4
            java.lang.reflect.Constructor<?> r0 = r10.a
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            r10.c = r0
        L_0x00b4:
            r3 = r0
        L_0x00b5:
            i0.f.a.c.n.h[] r3 = r8.i(r1, r3)
        L_0x00b9:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            i0.f.a.c.n.q r1 = r8.d
            java.lang.reflect.Constructor<?> r2 = r9.a
            i0.f.a.c.n.h r9 = r8.g(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.d.k(i0.f.a.c.t.f$a, i0.f.a.c.t.f$a):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }
}
