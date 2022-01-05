package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.a.b;
import m0.n.a.c;
import m0.n.a.d;
import m0.n.a.e;
import m0.n.a.f;
import m0.n.a.h;
import m0.n.a.i;
import m0.n.a.j;
import m0.n.a.k;
import m0.n.a.l;
import m0.n.a.m;
import m0.n.a.n;
import m0.n.a.o;
import m0.n.a.p;
import m0.n.a.q;
import m0.n.a.r;
import m0.n.a.s;
import m0.n.a.t;
import m0.n.a.u;
import m0.n.a.v;
import m0.n.a.w;
import m0.n.b.g;
import m0.r.t.a.q.d;
import m0.r.t.a.r.c.o0;

/* compiled from: KFunctionImpl.kt */
public final class KFunctionImpl extends KCallableImpl<Object> implements g<Object>, m0.r.g<Object>, m0.n.a.a, l, b, c, d, e, f, m0.n.a.g, h, i, j, k, p, m, n, o, q, r, s, t, u, v, w, m0.r.c {
    public static final /* synthetic */ m0.r.k[] y;
    public final m0.r.t.a.j Y1;
    public final m0.r.t.a.k Z1;
    public final m0.r.t.a.k a2;
    public final KDeclarationContainerImpl b2;
    public final String c2;
    public final Object d2;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements m0.n.a.a<m0.r.t.a.q.c<? extends Member>> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(0);
            this.c = i;
            this.d = obj;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke() {
            /*
                r13 = this;
                int r0 = r13.c
                java.lang.String r1 = "it"
                r2 = 0
                java.lang.String r3 = "desc"
                r4 = 10
                if (r0 == 0) goto L_0x01ca
                r5 = 0
                r6 = 1
                if (r0 != r6) goto L_0x01c9
                m0.r.t.a.n r0 = m0.r.t.a.n.b
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                m0.r.t.a.r.c.r r0 = r0.p()
                kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = m0.r.t.a.n.d(r0)
                boolean r7 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.c
                if (r7 == 0) goto L_0x0097
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r7 = r1.b2
                kotlin.reflect.jvm.internal.JvmFunctionSignature$c r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.c) r0
                m0.r.t.a.r.f.d.a.e$b r0 = r0.b
                java.lang.String r4 = r0.a
                java.lang.String r0 = r0.b
                m0.r.t.a.q.c r1 = r1.m()
                java.lang.reflect.Member r1 = r1.a()
                m0.n.b.i.c(r1)
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                r12 = r1 ^ 1
                java.util.Objects.requireNonNull(r7)
                java.lang.String r1 = "name"
                m0.n.b.i.e(r4, r1)
                m0.n.b.i.e(r0, r3)
                java.lang.String r1 = "<init>"
                boolean r1 = m0.n.b.i.a(r4, r1)
                if (r1 == 0) goto L_0x0059
                goto L_0x014f
            L_0x0059:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                if (r12 == 0) goto L_0x0067
                java.lang.Class r3 = r7.h()
                r1.add(r3)
            L_0x0067:
                r7.j(r1, r0, r2)
                java.lang.Class r8 = r7.r()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = "$default"
                r3.append(r4)
                java.lang.String r9 = r3.toString()
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r1, r2)
                r10 = r1
                java.lang.Class[] r10 = (java.lang.Class[]) r10
                java.lang.Class r11 = r7.u(r0)
                java.lang.reflect.Method r0 = r7.v(r8, r9, r10, r11, r12)
                goto L_0x0150
            L_0x0097:
                boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.b
                if (r2 == 0) goto L_0x010d
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                boolean r1 = r1.q()
                if (r1 == 0) goto L_0x00ea
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.b2
                java.lang.Class r6 = r0.h()
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                java.util.List r0 = r0.getParameters()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r1 = i0.j.f.p.h.K(r0, r4)
                r7.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x00c4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00db
                java.lang.Object r1 = r0.next()
                kotlin.reflect.KParameter r1 = (kotlin.reflect.KParameter) r1
                java.lang.String r1 = r1.getName()
                m0.n.b.i.c(r1)
                r7.add(r1)
                goto L_0x00c4
            L_0x00db:
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r8 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r9 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN
                r10 = 0
                r11 = 16
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                goto L_0x01c8
            L_0x00ea:
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r1.b2
                kotlin.reflect.jvm.internal.JvmFunctionSignature$b r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.b) r0
                m0.r.t.a.r.f.d.a.e$b r0 = r0.b
                java.lang.String r0 = r0.b
                java.util.Objects.requireNonNull(r1)
                m0.n.b.i.e(r0, r3)
                java.lang.Class r2 = r1.h()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.j(r3, r0, r6)
                java.lang.reflect.Constructor r0 = r1.x(r2, r3)
                goto L_0x0150
            L_0x010d:
                boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor
                if (r2 == 0) goto L_0x014f
                kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) r0
                java.util.List<java.lang.reflect.Method> r10 = r0.a
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.b2
                java.lang.Class r6 = r0.h()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r0 = i0.j.f.p.h.K(r10, r4)
                r7.<init>(r0)
                java.util.Iterator r0 = r10.iterator()
            L_0x012c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0143
                java.lang.Object r2 = r0.next()
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                m0.n.b.i.d(r2, r1)
                java.lang.String r2 = r2.getName()
                r7.add(r2)
                goto L_0x012c
            L_0x0143:
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r8 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r9 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                goto L_0x01c8
            L_0x014f:
                r0 = r5
            L_0x0150:
                boolean r1 = r0 instanceof java.lang.reflect.Constructor
                if (r1 == 0) goto L_0x0163
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                m0.r.t.a.r.c.r r2 = r1.p()
                m0.r.t.a.q.d r0 = kotlin.reflect.jvm.internal.KFunctionImpl.s(r1, r0, r2)
                goto L_0x01b9
            L_0x0163:
                boolean r1 = r0 instanceof java.lang.reflect.Method
                if (r1 == 0) goto L_0x01b8
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                m0.r.t.a.r.c.r r1 = r1.p()
                m0.r.t.a.r.c.r0.f r1 = r1.getAnnotations()
                m0.r.t.a.r.g.b r2 = m0.r.t.a.o.a
                m0.r.t.a.r.c.r0.c r1 = r1.f(r2)
                if (r1 == 0) goto L_0x01ad
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                m0.r.t.a.r.c.r r1 = r1.p()
                m0.r.t.a.r.c.i r1 = r1.b()
                java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                java.util.Objects.requireNonNull(r1, r2)
                m0.r.t.a.r.c.d r1 = (m0.r.t.a.r.c.d) r1
                boolean r1 = r1.w()
                if (r1 != 0) goto L_0x01ad
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                boolean r1 = r1.r()
                if (r1 == 0) goto L_0x01a6
                m0.r.t.a.q.d$g$b r1 = new m0.r.t.a.q.d$g$b
                r1.<init>(r0)
                goto L_0x01ab
            L_0x01a6:
                m0.r.t.a.q.d$g$e r1 = new m0.r.t.a.q.d$g$e
                r1.<init>(r0)
            L_0x01ab:
                r0 = r1
                goto L_0x01b9
            L_0x01ad:
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                m0.r.t.a.q.d$g r0 = kotlin.reflect.jvm.internal.KFunctionImpl.t(r1, r0)
                goto L_0x01b9
            L_0x01b8:
                r0 = r5
            L_0x01b9:
                if (r0 == 0) goto L_0x01c7
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                m0.r.t.a.r.c.r r1 = r1.p()
                m0.r.t.a.q.c r5 = i0.j.f.p.h.o0(r0, r1, r6)
            L_0x01c7:
                r0 = r5
            L_0x01c8:
                return r0
            L_0x01c9:
                throw r5
            L_0x01ca:
                m0.r.t.a.n r0 = m0.r.t.a.n.b
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                m0.r.t.a.r.c.r r0 = r0.p()
                kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = m0.r.t.a.n.d(r0)
                boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.b
                if (r5 == 0) goto L_0x024a
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                boolean r1 = r1.q()
                if (r1 == 0) goto L_0x022b
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.b2
                java.lang.Class r6 = r0.h()
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                java.util.List r0 = r0.getParameters()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r1 = i0.j.f.p.h.K(r0, r4)
                r7.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x0205:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x021c
                java.lang.Object r1 = r0.next()
                kotlin.reflect.KParameter r1 = (kotlin.reflect.KParameter) r1
                java.lang.String r1 = r1.getName()
                m0.n.b.i.c(r1)
                r7.add(r1)
                goto L_0x0205
            L_0x021c:
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r8 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r9 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN
                r10 = 0
                r11 = 16
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                goto L_0x035c
            L_0x022b:
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r1.b2
                kotlin.reflect.jvm.internal.JvmFunctionSignature$b r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.b) r0
                m0.r.t.a.r.f.d.a.e$b r0 = r0.b
                java.lang.String r0 = r0.b
                java.util.Objects.requireNonNull(r1)
                m0.n.b.i.e(r0, r3)
                java.lang.Class r3 = r1.h()
                java.util.List r0 = r1.t(r0)
                java.lang.reflect.Constructor r0 = r1.x(r3, r0)
                goto L_0x0272
            L_0x024a:
                boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.c
                if (r3 == 0) goto L_0x0261
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r1.b2
                kotlin.reflect.jvm.internal.JvmFunctionSignature$c r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.c) r0
                m0.r.t.a.r.f.d.a.e$b r0 = r0.b
                java.lang.String r3 = r0.a
                java.lang.String r0 = r0.b
                java.lang.reflect.Method r0 = r1.m(r3, r0)
                goto L_0x0272
            L_0x0261:
                boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.a
                if (r3 == 0) goto L_0x026a
                kotlin.reflect.jvm.internal.JvmFunctionSignature$a r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.a) r0
                java.lang.reflect.Method r0 = r0.a
                goto L_0x0272
            L_0x026a:
                boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor
                if (r3 == 0) goto L_0x031c
                kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor) r0
                java.lang.reflect.Constructor<?> r0 = r0.a
            L_0x0272:
                boolean r1 = r0 instanceof java.lang.reflect.Constructor
                if (r1 == 0) goto L_0x0285
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                m0.r.t.a.r.c.r r3 = r1.p()
                m0.r.t.a.q.d r0 = kotlin.reflect.jvm.internal.KFunctionImpl.s(r1, r0, r3)
                goto L_0x02e3
            L_0x0285:
                boolean r1 = r0 instanceof java.lang.reflect.Method
                if (r1 == 0) goto L_0x02f0
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                int r1 = r0.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L_0x02b1
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                boolean r3 = r1.r()
                if (r3 == 0) goto L_0x02aa
                m0.r.t.a.q.d$g$a r3 = new m0.r.t.a.q.d$g$a
                java.lang.Object r1 = r1.u()
                r3.<init>(r0, r1)
                r0 = r3
                goto L_0x02e3
            L_0x02aa:
                m0.r.t.a.q.d$g$d r1 = new m0.r.t.a.q.d$g$d
                r1.<init>(r0)
            L_0x02af:
                r0 = r1
                goto L_0x02e3
            L_0x02b1:
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                m0.r.t.a.r.c.r r1 = r1.p()
                m0.r.t.a.r.c.r0.f r1 = r1.getAnnotations()
                m0.r.t.a.r.g.b r3 = m0.r.t.a.o.a
                m0.r.t.a.r.c.r0.c r1 = r1.f(r3)
                if (r1 == 0) goto L_0x02db
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                boolean r1 = r1.r()
                if (r1 == 0) goto L_0x02d5
                m0.r.t.a.q.d$g$b r1 = new m0.r.t.a.q.d$g$b
                r1.<init>(r0)
                goto L_0x02af
            L_0x02d5:
                m0.r.t.a.q.d$g$e r1 = new m0.r.t.a.q.d$g$e
                r1.<init>(r0)
                goto L_0x02af
            L_0x02db:
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                m0.r.t.a.q.d$g r0 = kotlin.reflect.jvm.internal.KFunctionImpl.t(r1, r0)
            L_0x02e3:
                java.lang.Object r1 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r1 = (kotlin.reflect.jvm.internal.KFunctionImpl) r1
                m0.r.t.a.r.c.r r1 = r1.p()
                m0.r.t.a.q.c r0 = i0.j.f.p.h.o0(r0, r1, r2)
                goto L_0x035c
            L_0x02f0:
                kotlin.reflect.jvm.internal.KotlinReflectionInternalError r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Could not compute caller for function: "
                r2.append(r3)
                java.lang.Object r3 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r3 = (kotlin.reflect.jvm.internal.KFunctionImpl) r3
                m0.r.t.a.r.c.r r3 = r3.p()
                r2.append(r3)
                java.lang.String r3 = " (member = "
                r2.append(r3)
                r2.append(r0)
                r0 = 41
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x031c:
                boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor
                if (r2 == 0) goto L_0x035d
                kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) r0
                java.util.List<java.lang.reflect.Method> r10 = r0.a
                java.lang.Object r0 = r13.d
                kotlin.reflect.jvm.internal.KFunctionImpl r0 = (kotlin.reflect.jvm.internal.KFunctionImpl) r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.b2
                java.lang.Class r6 = r0.h()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r0 = i0.j.f.p.h.K(r10, r4)
                r7.<init>(r0)
                java.util.Iterator r0 = r10.iterator()
            L_0x033b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0352
                java.lang.Object r2 = r0.next()
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                m0.n.b.i.d(r2, r1)
                java.lang.String r2 = r2.getName()
                r7.add(r2)
                goto L_0x033b
            L_0x0352:
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r8 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r9 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
            L_0x035c:
                return r0
            L_0x035d:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.a.invoke():java.lang.Object");
        }
    }

    static {
        Class<KFunctionImpl> cls = KFunctionImpl.class;
        y = new m0.r.k[]{m0.n.b.m.c(new PropertyReference1Impl(m0.n.b.m.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), m0.n.b.m.c(new PropertyReference1Impl(m0.n.b.m.a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), m0.n.b.m.c(new PropertyReference1Impl(m0.n.b.m.a(cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, m0.r.t.a.r.c.r rVar, Object obj) {
        this.b2 = kDeclarationContainerImpl;
        this.c2 = str2;
        this.d2 = obj;
        this.Y1 = i0.j.f.p.h.J2(rVar, new KFunctionImpl$descriptor$2(this, str));
        this.Z1 = new m0.r.t.a.k(new a(0, this));
        this.a2 = new m0.r.t.a.k(new a(1, this));
    }

    public static final m0.r.t.a.q.d s(KFunctionImpl kFunctionImpl, Constructor constructor, m0.r.t.a.r.c.r rVar) {
        Objects.requireNonNull(kFunctionImpl);
        m0.n.b.i.e(rVar, "descriptor");
        m0.r.t.a.r.c.c cVar = rVar instanceof m0.r.t.a.r.c.c ? (m0.r.t.a.r.c.c) rVar : null;
        boolean z = false;
        if (cVar != null && !m0.r.t.a.r.c.o.e(cVar.getVisibility())) {
            m0.r.t.a.r.c.d y2 = cVar.y();
            m0.n.b.i.d(y2, "constructorDescriptor.constructedClass");
            if (!m0.r.t.a.r.j.e.b(y2) && !m0.r.t.a.r.j.d.v(cVar.y())) {
                List<o0> h = cVar.h();
                m0.n.b.i.d(h, "constructorDescriptor.valueParameters");
                if (!h.isEmpty()) {
                    Iterator<T> it = h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        m0.r.t.a.r.m.v type = ((o0) it.next()).getType();
                        m0.n.b.i.d(type, "it.type");
                        if (i0.j.f.p.h.w3(type)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        if (z) {
            if (kFunctionImpl.r()) {
                return new d.a(constructor, kFunctionImpl.u());
            }
            return new d.b(constructor);
        } else if (kFunctionImpl.r()) {
            return new d.c(constructor, kFunctionImpl.u());
        } else {
            return new d.C0245d(constructor);
        }
    }

    public static final d.g t(KFunctionImpl kFunctionImpl, Method method) {
        return kFunctionImpl.r() ? new d.g.c(method, kFunctionImpl.u()) : new d.g.f(method);
    }

    public boolean equals(Object obj) {
        KFunctionImpl a3 = m0.r.t.a.o.a(obj);
        if (a3 == null || !m0.n.b.i.a(this.b2, a3.b2) || !m0.n.b.i.a(getName(), a3.getName()) || !m0.n.b.i.a(this.c2, a3.c2) || !m0.n.b.i.a(this.d2, a3.d2)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return i0.j.f.p.h.S0(m());
    }

    public String getName() {
        String b = p().getName().b();
        m0.n.b.i.d(b, "descriptor.name.asString()");
        return b;
    }

    public Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return this.c2.hashCode() + ((hashCode + (this.b2.hashCode() * 31)) * 31);
    }

    public Object invoke() {
        return call(new Object[0]);
    }

    public boolean isExternal() {
        return p().isExternal();
    }

    public boolean isInfix() {
        return p().isInfix();
    }

    public boolean isInline() {
        return p().isInline();
    }

    public boolean isOperator() {
        return p().isOperator();
    }

    public boolean isSuspend() {
        return p().isSuspend();
    }

    public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public m0.r.t.a.q.c<?> m() {
        m0.r.t.a.k kVar = this.Z1;
        m0.r.k kVar2 = y[1];
        return (m0.r.t.a.q.c) kVar.invoke();
    }

    public KDeclarationContainerImpl n() {
        return this.b2;
    }

    public m0.r.t.a.q.c<?> o() {
        m0.r.t.a.k kVar = this.a2;
        m0.r.k kVar2 = y[2];
        return (m0.r.t.a.q.c) kVar.invoke();
    }

    public boolean r() {
        return !m0.n.b.i.a(this.d2, CallableReference.NO_RECEIVER);
    }

    public String toString() {
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.b;
        return ReflectionObjectRenderer.c(p());
    }

    public final Object u() {
        return i0.j.f.p.h.I(this.d2, p());
    }

    /* renamed from: v */
    public m0.r.t.a.r.c.r p() {
        m0.r.t.a.j jVar = this.Y1;
        m0.r.k kVar = y[0];
        return (m0.r.t.a.r.c.r) jVar.invoke();
    }

    public Object invoke(Object obj) {
        return call(obj);
    }

    public Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, m0.r.t.a.r.c.r r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r9, r0)
            m0.r.t.a.r.g.d r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            m0.n.b.i.d(r3, r0)
            m0.r.t.a.n r0 = m0.r.t.a.n.b
            kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = m0.r.t.a.n.d(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, m0.r.t.a.r.c.r):void");
    }
}
