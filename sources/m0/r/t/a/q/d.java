package m0.r.t.a.q;

import i0.j.f.p.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import m0.n.b.i;
import m0.n.b.p;

/* compiled from: CallerImpl.kt */
public abstract class d<M extends Member> implements c<M> {
    public final List<Type> a;
    public final M b;
    public final Type c;
    public final Class<?> d;

    /* compiled from: CallerImpl.kt */
    public static final class a extends d<Constructor<?>> implements b {
        public final Object e;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                m0.n.b.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                m0.n.b.i.d(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                m0.n.b.i.d(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = m0.j.g.k(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            c(objArr);
            p pVar = new p(3);
            pVar.a.add(this.e);
            pVar.a(objArr);
            pVar.a.add((Object) null);
            return ((Constructor) this.b).newInstance(pVar.a.toArray(new Object[pVar.b()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    public static final class b extends d<Constructor<?>> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                m0.n.b.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                m0.n.b.i.d(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                m0.n.b.i.d(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0025
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = m0.j.g.k(r0, r2, r1)
            L_0x0025:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            c(objArr);
            p pVar = new p(2);
            pVar.a(objArr);
            pVar.a.add((Object) null);
            return ((Constructor) this.b).newInstance(pVar.a.toArray(new Object[pVar.b()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    public static final class c extends d<Constructor<?>> implements b {
        public final Object e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                m0.n.b.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                m0.n.b.i.d(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                m0.n.b.i.d(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            c(objArr);
            p pVar = new p(2);
            pVar.a.add(this.e);
            pVar.a(objArr);
            return ((Constructor) this.b).newInstance(pVar.a.toArray(new Object[pVar.b()]));
        }
    }

    /* renamed from: m0.r.t.a.q.d$d  reason: collision with other inner class name */
    /* compiled from: CallerImpl.kt */
    public static final class C0245d extends d<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0245d(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                m0.n.b.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                m0.n.b.i.d(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.String r1 = "klass"
                m0.n.b.i.d(r0, r1)
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0029
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0029
                r4 = r1
                goto L_0x002b
            L_0x0029:
                r0 = 0
                r4 = r0
            L_0x002b:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                m0.n.b.i.d(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.C0245d.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            c(objArr);
            return ((Constructor) this.b).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    public static abstract class e extends d<Field> {

        /* compiled from: CallerImpl.kt */
        public static final class a extends e implements b {
            public final Object e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, (m0.n.b.f) null);
                i.e(field, "field");
                this.e = obj;
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                return ((Field) this.b).get(this.e);
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class b extends e implements b {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, (m0.n.b.f) null);
                i.e(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class c extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, (m0.n.b.f) null);
                i.e(field, "field");
            }
        }

        /* renamed from: m0.r.t.a.q.d$e$d  reason: collision with other inner class name */
        /* compiled from: CallerImpl.kt */
        public static final class C0246d extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0246d(Field field) {
                super(field, true, (m0.n.b.f) null);
                i.e(field, "field");
            }

            public void c(Object[] objArr) {
                i.e(objArr, "args");
                d.super.c(objArr);
                d(h.I0(objArr));
            }
        }

        /* renamed from: m0.r.t.a.q.d$e$e  reason: collision with other inner class name */
        /* compiled from: CallerImpl.kt */
        public static final class C0247e extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0247e(Field field) {
                super(field, false, (m0.n.b.f) null);
                i.e(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(java.lang.reflect.Field r7, boolean r8, m0.n.b.f r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r9 = "field.genericType"
                m0.n.b.i.d(r2, r9)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.e.<init>(java.lang.reflect.Field, boolean, m0.n.b.f):void");
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            c(objArr);
            return ((Field) this.b).get(this.d != null ? h.H0(objArr) : null);
        }
    }

    /* compiled from: CallerImpl.kt */
    public static abstract class f extends d<Field> {
        public final boolean e;

        /* compiled from: CallerImpl.kt */
        public static final class a extends f implements b {
            public final Object f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false, (m0.n.b.f) null);
                i.e(field, "field");
                this.f = obj;
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                ((Field) this.b).set(this.f, h.H0(objArr));
                return m0.i.a;
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class b extends f implements b {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z) {
                super(field, z, false, (m0.n.b.f) null);
                i.e(field, "field");
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                ((Field) this.b).set((Object) null, h.F2(objArr));
                return m0.i.a;
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class c extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z) {
                super(field, z, true, (m0.n.b.f) null);
                i.e(field, "field");
            }
        }

        /* renamed from: m0.r.t.a.q.d$f$d  reason: collision with other inner class name */
        /* compiled from: CallerImpl.kt */
        public static final class C0248d extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0248d(Field field, boolean z) {
                super(field, z, true, (m0.n.b.f) null);
                i.e(field, "field");
            }

            public void c(Object[] objArr) {
                i.e(objArr, "args");
                super.c(objArr);
                d(h.I0(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class e extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z) {
                super(field, z, false, (m0.n.b.f) null);
                i.e(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f(java.lang.reflect.Field r7, boolean r8, boolean r9, m0.n.b.f r10) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r10 = "Void.TYPE"
                m0.n.b.i.d(r2, r10)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r10 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                m0.n.b.i.d(r10, r0)
                r4[r9] = r10
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.f.<init>(java.lang.reflect.Field, boolean, boolean, m0.n.b.f):void");
        }

        public void c(Object[] objArr) {
            i.e(objArr, "args");
            d.super.c(objArr);
            if (this.e && h.F2(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            c(objArr);
            ((Field) this.b).set(this.d != null ? h.H0(objArr) : null, h.F2(objArr));
            return m0.i.a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r1 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4, m0.n.b.f r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            if (r3 == 0) goto L_0x002e
            m0.n.b.p r1 = new m0.n.b.p
            r2 = 2
            r1.<init>(r2)
            java.util.ArrayList<java.lang.Object> r2 = r1.a
            r2.add(r3)
            r1.a(r4)
            int r2 = r1.b()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.util.ArrayList<java.lang.Object> r1 = r1.a
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            java.util.List r1 = m0.j.g.K(r1)
            if (r1 == 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            java.util.List r1 = i0.j.f.p.h.l4(r4)
        L_0x0032:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[], m0.n.b.f):void");
    }

    public final M a() {
        return this.b;
    }

    public List<Type> b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        i.e(objArr, "args");
        h.B(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Type getReturnType() {
        return this.c;
    }

    /* compiled from: CallerImpl.kt */
    public static abstract class g extends d<Method> {
        public final boolean e;

        /* compiled from: CallerImpl.kt */
        public static final class a extends g implements b {
            public final Object f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4);
                i.e(method, "method");
                this.f = obj;
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                return e(this.f, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class b extends g implements b {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, (Type[]) null, 4);
                i.e(method, "method");
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                return e((Object) null, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class c extends g implements b {
            public final Object f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    m0.n.b.i.e(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    m0.n.b.i.d(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = m0.j.g.k(r0, r2, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>(r5, r3, r0)
                    r4.f = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.g.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                p pVar = new p(2);
                pVar.a.add(this.f);
                pVar.a(objArr);
                return e((Object) null, pVar.a.toArray(new Object[pVar.b()]));
            }
        }

        /* renamed from: m0.r.t.a.q.d$g$d  reason: collision with other inner class name */
        /* compiled from: CallerImpl.kt */
        public static final class C0249d extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0249d(Method method) {
                super(method, false, (Type[]) null, 6);
                i.e(method, "method");
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : m0.j.g.k(objArr, 1, objArr.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class e extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, (Type[]) null, 4);
                i.e(method, "method");
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                d(h.I0(objArr));
                return e((Object) null, objArr.length <= 1 ? new Object[0] : m0.j.g.k(objArr, 1, objArr.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        public static final class f extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, (Type[]) null, 6);
                i.e(method, "method");
            }

            public Object call(Object[] objArr) {
                i.e(objArr, "args");
                c(objArr);
                return e((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ g(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4) {
            /*
                r0 = this;
                r3 = r4 & 2
                if (r3 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r3 = r4 & 4
                if (r3 == 0) goto L_0x001c
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                m0.n.b.i.d(r3, r4)
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int):void");
        }

        public final Object e(Object obj, Object[] objArr) {
            i.e(objArr, "args");
            return this.e ? m0.i.a : ((Method) this.b).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(java.lang.reflect.Method r8, boolean r9, java.lang.reflect.Type[] r10) {
            /*
                r7 = this;
                java.lang.reflect.Type r6 = r8.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                m0.n.b.i.d(r6, r0)
                if (r9 == 0) goto L_0x0010
                java.lang.Class r9 = r8.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r9 = 0
            L_0x0011:
                r3 = r9
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r6
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r8 = m0.n.b.i.a(r6, r8)
                r7.e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.d.g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
