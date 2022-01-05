package kotlin.reflect.jvm.internal;

import i0.d.a.a.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m0.n.b.i;
import m0.r.c;
import m0.r.n;
import m0.r.o;
import m0.r.t.a.h;
import m0.r.t.a.j;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.g.b;

/* compiled from: KCallableImpl.kt */
public abstract class KCallableImpl<R> implements c<R>, h {
    public final j<List<Annotation>> c;
    public final j<ArrayList<KParameter>> d;
    public final j<KTypeImpl> q;
    public final j<List<KTypeParameterImpl>> x;

    public KCallableImpl() {
        j<List<Annotation>> K2 = i0.j.f.p.h.K2(new KCallableImpl$_annotations$1(this));
        i.d(K2, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this.c = K2;
        j<ArrayList<KParameter>> K22 = i0.j.f.p.h.K2(new KCallableImpl$_parameters$1(this));
        i.d(K22, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.d = K22;
        j<KTypeImpl> K23 = i0.j.f.p.h.K2(new KCallableImpl$_returnType$1(this));
        i.d(K23, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this.q = K23;
        j<List<KTypeParameterImpl>> K24 = i0.j.f.p.h.K2(new KCallableImpl$_typeParameters$1(this));
        i.d(K24, "ReflectProperties.lazySo…this, descriptor) }\n    }");
        this.x = K24;
    }

    public R call(Object... objArr) {
        i.e(objArr, "args");
        try {
            return m().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        r11 = r11.y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R callBy(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "args"
            m0.n.b.i.e(r0, r2)
            boolean r3 = r17.q()
            java.lang.String r4 = "No argument provided for a required parameter: "
            java.lang.String r5 = "This callable does not support a default call: "
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00c4
            java.util.List r2 = r17.getParameters()
            java.util.ArrayList r3 = new java.util.ArrayList
            r9 = 10
            int r9 = i0.j.f.p.h.K(r2, r9)
            r3.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x008e
            java.lang.Object r9 = r2.next()
            kotlin.reflect.KParameter r9 = (kotlin.reflect.KParameter) r9
            boolean r10 = r0.containsKey(r9)
            if (r10 == 0) goto L_0x005f
            java.lang.Object r10 = r0.get(r9)
            if (r10 == 0) goto L_0x0043
            goto L_0x0075
        L_0x0043:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Annotation argument value cannot be null ("
            r2.append(r3)
            r2.append(r9)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x005f:
            boolean r10 = r9.k()
            if (r10 == 0) goto L_0x0067
            r10 = r7
            goto L_0x0075
        L_0x0067:
            boolean r10 = r9.g()
            if (r10 == 0) goto L_0x0079
            m0.r.n r9 = r9.getType()
            java.lang.Object r10 = r1.j(r9)
        L_0x0075:
            r3.add(r10)
            goto L_0x002a
        L_0x0079:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x008e:
            m0.r.t.a.q.c r0 = r17.o()
            if (r0 == 0) goto L_0x00af
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException -> 0x00a8 }
            java.lang.Object[] r2 = r3.toArray(r2)     // Catch:{ IllegalAccessException -> 0x00a8 }
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r0 = r0.call(r2)     // Catch:{ IllegalAccessException -> 0x00a8 }
            goto L_0x01d3
        L_0x00a2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x00a8 }
            r0.<init>(r6)     // Catch:{ IllegalAccessException -> 0x00a8 }
            throw r0     // Catch:{ IllegalAccessException -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r2 = new kotlin.reflect.full.IllegalCallableAccessException
            r2.<init>(r0)
            throw r2
        L_0x00af:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = r17.p()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00c4:
            m0.n.b.i.e(r0, r2)
            java.util.List r2 = r17.getParameters()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r9 = r2.size()
            r3.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
            r11 = r8
            r12 = r11
            r13 = r12
        L_0x00e1:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x019f
            java.lang.Object r14 = r2.next()
            kotlin.reflect.KParameter r14 = (kotlin.reflect.KParameter) r14
            if (r12 == 0) goto L_0x00fb
            int r15 = r12 % 32
            if (r15 != 0) goto L_0x00fb
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9.add(r13)
            r13 = r8
        L_0x00fb:
            boolean r15 = r0.containsKey(r14)
            if (r15 == 0) goto L_0x010a
            java.lang.Object r15 = r0.get(r14)
            r3.add(r15)
            goto L_0x017e
        L_0x010a:
            boolean r15 = r14.k()
            if (r15 == 0) goto L_0x016d
            m0.r.n r11 = r14.getType()
            m0.r.t.a.r.g.b r15 = m0.r.t.a.o.a
            java.lang.String r15 = "$this$isInlineClassType"
            m0.n.b.i.e(r11, r15)
            boolean r15 = r11 instanceof kotlin.reflect.jvm.internal.KTypeImpl
            if (r15 != 0) goto L_0x0120
            r11 = r7
        L_0x0120:
            kotlin.reflect.jvm.internal.KTypeImpl r11 = (kotlin.reflect.jvm.internal.KTypeImpl) r11
            if (r11 == 0) goto L_0x0130
            m0.r.t.a.r.m.v r11 = r11.y
            if (r11 == 0) goto L_0x0130
            boolean r11 = m0.r.t.a.r.j.e.c(r11)
            if (r11 != r10) goto L_0x0130
            r11 = r10
            goto L_0x0131
        L_0x0130:
            r11 = r8
        L_0x0131:
            if (r11 == 0) goto L_0x0135
            r11 = r7
            goto L_0x0162
        L_0x0135:
            m0.r.n r11 = r14.getType()
            java.lang.String r15 = "$this$javaType"
            m0.n.b.i.e(r11, r15)
            r16 = r11
            kotlin.reflect.jvm.internal.KTypeImpl r16 = (kotlin.reflect.jvm.internal.KTypeImpl) r16
            java.lang.reflect.Type r16 = r16.i()
            if (r16 == 0) goto L_0x0149
            goto L_0x015e
        L_0x0149:
            m0.n.b.i.e(r11, r15)
            boolean r15 = r11 instanceof m0.n.b.j
            if (r15 == 0) goto L_0x015a
            r15 = r11
            m0.n.b.j r15 = (m0.n.b.j) r15
            java.lang.reflect.Type r16 = r15.i()
            if (r16 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            java.lang.reflect.Type r16 = m0.r.r.b(r11, r8)
        L_0x015e:
            java.lang.Object r11 = m0.r.t.a.o.c(r16)
        L_0x0162:
            r3.add(r11)
            int r11 = r12 % 32
            int r11 = r10 << r11
            r11 = r11 | r13
            r13 = r11
            r11 = r10
            goto L_0x017e
        L_0x016d:
            boolean r15 = r14.g()
            if (r15 == 0) goto L_0x018a
            m0.r.n r15 = r14.getType()
            java.lang.Object r15 = r1.j(r15)
            r3.add(r15)
        L_0x017e:
            kotlin.reflect.KParameter$Kind r14 = r14.f()
            kotlin.reflect.KParameter$Kind r15 = kotlin.reflect.KParameter.Kind.VALUE
            if (r14 != r15) goto L_0x00e1
            int r12 = r12 + 1
            goto L_0x00e1
        L_0x018a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x019f:
            if (r11 != 0) goto L_0x01b4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.util.Objects.requireNonNull(r0, r6)
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.Object r0 = r1.call(r0)
            goto L_0x01d3
        L_0x01b4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r9.add(r0)
            m0.r.t.a.q.c r0 = r17.o()
            if (r0 == 0) goto L_0x01e1
            r3.addAll(r9)
            r3.add(r7)
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException -> 0x01da }
            java.lang.Object[] r2 = r3.toArray(r2)     // Catch:{ IllegalAccessException -> 0x01da }
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r0 = r0.call(r2)     // Catch:{ IllegalAccessException -> 0x01da }
        L_0x01d3:
            return r0
        L_0x01d4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x01da }
            r0.<init>(r6)     // Catch:{ IllegalAccessException -> 0x01da }
            throw r0     // Catch:{ IllegalAccessException -> 0x01da }
        L_0x01da:
            r0 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r2 = new kotlin.reflect.full.IllegalCallableAccessException
            r2.<init>(r0)
            throw r2
        L_0x01e1:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = r17.p()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KCallableImpl.callBy(java.util.Map):java.lang.Object");
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.c.invoke();
        i.d(invoke, "_annotations()");
        return invoke;
    }

    public List<KParameter> getParameters() {
        ArrayList<KParameter> invoke = this.d.invoke();
        i.d(invoke, "_parameters()");
        return invoke;
    }

    public n getReturnType() {
        KTypeImpl invoke = this.q.invoke();
        i.d(invoke, "_returnType()");
        return invoke;
    }

    public List<o> getTypeParameters() {
        List<KTypeParameterImpl> invoke = this.x.invoke();
        i.d(invoke, "_typeParameters()");
        return invoke;
    }

    public KVisibility getVisibility() {
        p visibility = p().getVisibility();
        i.d(visibility, "descriptor.visibility");
        b bVar = m0.r.t.a.o.a;
        i.e(visibility, "$this$toKVisibility");
        if (i.a(visibility, m0.r.t.a.r.c.o.e)) {
            return KVisibility.PUBLIC;
        }
        if (i.a(visibility, m0.r.t.a.r.c.o.c)) {
            return KVisibility.PROTECTED;
        }
        if (i.a(visibility, m0.r.t.a.r.c.o.d)) {
            return KVisibility.INTERNAL;
        }
        if (!i.a(visibility, m0.r.t.a.r.c.o.a) && !i.a(visibility, m0.r.t.a.r.c.o.b)) {
            return null;
        }
        return KVisibility.PRIVATE;
    }

    public boolean isAbstract() {
        return p().j() == Modality.ABSTRACT;
    }

    public boolean isFinal() {
        return p().j() == Modality.FINAL;
    }

    public boolean isOpen() {
        return p().j() == Modality.OPEN;
    }

    public final Object j(n nVar) {
        Class<?> l1 = i0.j.f.p.h.l1(i0.j.f.p.h.p1(nVar));
        if (l1.isArray()) {
            Object newInstance = Array.newInstance(l1.getComponentType(), 0);
            i.d(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        StringBuilder P0 = a.P0("Cannot instantiate the default empty array of type ");
        P0.append(l1.getSimpleName());
        P0.append(", because it is not an array type");
        throw new KotlinReflectionInternalError(P0.toString());
    }

    public abstract m0.r.t.a.q.c<?> m();

    public abstract KDeclarationContainerImpl n();

    public abstract m0.r.t.a.q.c<?> o();

    public abstract CallableMemberDescriptor p();

    public final boolean q() {
        return i.a(getName(), "<init>") && n().h().isAnnotation();
    }

    public abstract boolean r();
}
