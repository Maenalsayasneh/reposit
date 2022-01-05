package m0.r.t.a.r.c.v0.b;

import i0.j.f.p.h;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import m0.n.b.i;
import m0.r.t.a.r.c.q0;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.g.f;

/* compiled from: ReflectJavaMember.kt */
public abstract class p extends l implements e, r, m0.r.t.a.r.e.a.w.p {
    public int C() {
        return Q().getModifiers();
    }

    public g O() {
        Class<?> declaringClass = Q().getDeclaringClass();
        i.d(declaringClass, "member.declaringClass");
        return new h(declaringClass);
    }

    public boolean P() {
        i.e(this, "this");
        return Modifier.isStatic(C());
    }

    public abstract Member Q();

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c A[LOOP:1: B:26:0x00a2->B:53:0x010c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152 A[EDGE_INSN: B:58:0x0152->B:56:0x0152 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<m0.r.t.a.r.e.a.w.z> R(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "parameterTypes"
            m0.n.b.i.e(r13, r0)
            java.lang.String r0 = "parameterAnnotations"
            m0.n.b.i.e(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            java.lang.reflect.Member r1 = r12.Q()
            java.lang.String r2 = "member"
            m0.n.b.i.e(r1, r2)
            m0.r.t.a.r.c.v0.b.a$a r3 = m0.r.t.a.r.c.v0.b.a.a
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x004f
            m0.n.b.i.e(r1, r2)
            java.lang.Class r2 = r1.getClass()
            java.lang.String r3 = "getParameters"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r6)     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.ClassLoader r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.e(r2)
            java.lang.String r6 = "java.lang.reflect.Parameter"
            java.lang.Class r2 = r2.loadClass(r6)
            m0.r.t.a.r.c.v0.b.a$a r6 = new m0.r.t.a.r.c.v0.b.a$a
            java.lang.Class[] r7 = new java.lang.Class[r5]
            java.lang.String r8 = "getName"
            java.lang.reflect.Method r2 = r2.getMethod(r8, r7)
            r6.<init>(r3, r2)
            r3 = r6
            goto L_0x004d
        L_0x0047:
            m0.r.t.a.r.c.v0.b.a$a r2 = new m0.r.t.a.r.c.v0.b.a$a
            r2.<init>(r4, r4)
            r3 = r2
        L_0x004d:
            m0.r.t.a.r.c.v0.b.a.a = r3
        L_0x004f:
            java.lang.reflect.Method r2 = r3.a
            if (r2 != 0) goto L_0x0054
            goto L_0x0058
        L_0x0054:
            java.lang.reflect.Method r3 = r3.b
            if (r3 != 0) goto L_0x005a
        L_0x0058:
            r2 = r4
            goto L_0x0086
        L_0x005a:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r1 = r2.invoke(r1, r6)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<*>"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r1.length
            r2.<init>(r6)
            int r6 = r1.length
            r7 = r5
        L_0x006f:
            if (r7 >= r6) goto L_0x0086
            r8 = r1[r7]
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r8 = r3.invoke(r8, r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            java.util.Objects.requireNonNull(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            r2.add(r8)
            int r7 = r7 + 1
            goto L_0x006f
        L_0x0086:
            if (r2 != 0) goto L_0x008a
            r1 = r4
            goto L_0x0092
        L_0x008a:
            int r1 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0092:
            if (r1 != 0) goto L_0x0096
            r1 = r5
            goto L_0x009c
        L_0x0096:
            int r1 = r1.intValue()
            int r3 = r13.length
            int r1 = r1 - r3
        L_0x009c:
            int r3 = r13.length
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0152
            r6 = r5
        L_0x00a2:
            int r7 = r6 + 1
            r8 = r13[r6]
            java.lang.String r9 = "type"
            m0.n.b.i.e(r8, r9)
            boolean r9 = r8 instanceof java.lang.Class
            if (r9 == 0) goto L_0x00be
            r10 = r8
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r11 = r10.isPrimitive()
            if (r11 == 0) goto L_0x00be
            m0.r.t.a.r.c.v0.b.t r8 = new m0.r.t.a.r.c.v0.b.t
            r8.<init>(r10)
            goto L_0x00e6
        L_0x00be:
            boolean r10 = r8 instanceof java.lang.reflect.GenericArrayType
            if (r10 != 0) goto L_0x00e0
            if (r9 == 0) goto L_0x00ce
            r9 = r8
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e0
        L_0x00ce:
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00da
            m0.r.t.a.r.c.v0.b.x r9 = new m0.r.t.a.r.c.v0.b.x
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            r9.<init>(r8)
            goto L_0x00e5
        L_0x00da:
            m0.r.t.a.r.c.v0.b.j r9 = new m0.r.t.a.r.c.v0.b.j
            r9.<init>(r8)
            goto L_0x00e5
        L_0x00e0:
            m0.r.t.a.r.c.v0.b.g r9 = new m0.r.t.a.r.c.v0.b.g
            r9.<init>(r8)
        L_0x00e5:
            r8 = r9
        L_0x00e6:
            if (r2 != 0) goto L_0x00ea
            r9 = r4
            goto L_0x00f4
        L_0x00ea:
            int r9 = r6 + r1
            java.lang.Object r9 = m0.j.g.z(r2, r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x010e
        L_0x00f4:
            if (r15 == 0) goto L_0x00fe
            int r10 = i0.j.f.p.h.t1(r13)
            if (r6 != r10) goto L_0x00fe
            r10 = 1
            goto L_0x00ff
        L_0x00fe:
            r10 = r5
        L_0x00ff:
            m0.r.t.a.r.c.v0.b.w r11 = new m0.r.t.a.r.c.v0.b.w
            r6 = r14[r6]
            r11.<init>(r8, r6, r9, r10)
            r0.add(r11)
            if (r7 <= r3) goto L_0x010c
            goto L_0x0152
        L_0x010c:
            r6 = r7
            goto L_0x00a2
        L_0x010e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "No parameter with index "
            r13.append(r14)
            r13.append(r6)
            r14 = 43
            r13.append(r14)
            r13.append(r1)
            java.lang.String r14 = " (name="
            r13.append(r14)
            m0.r.t.a.r.g.d r14 = r12.getName()
            r13.append(r14)
            java.lang.String r14 = " type="
            r13.append(r14)
            r13.append(r8)
            java.lang.String r14 = ") in "
            r13.append(r14)
            r13.append(r2)
            java.lang.String r14 = "@ReflectJavaMember"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0152:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.v0.b.p.R(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && i.a(Q(), ((p) obj).Q());
    }

    public a f(b bVar) {
        return h.B0(this, bVar);
    }

    public Collection getAnnotations() {
        return h.P0(this);
    }

    public d getName() {
        String name = Q().getName();
        d g = name == null ? null : d.g(name);
        if (g != null) {
            return g;
        }
        d dVar = f.a;
        i.d(dVar, "NO_NAME_PROVIDED");
        return dVar;
    }

    public q0 getVisibility() {
        return h.N1(this);
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public boolean isAbstract() {
        i.e(this, "this");
        return Modifier.isAbstract(C());
    }

    public boolean isFinal() {
        i.e(this, "this");
        return Modifier.isFinal(C());
    }

    public boolean m() {
        h.e2(this);
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }

    public AnnotatedElement u() {
        return (AnnotatedElement) Q();
    }
}
