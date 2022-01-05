package kotlin.coroutines.jvm.internal;

import i0.d.a.a.a;
import java.io.Serializable;
import m0.i;
import m0.l.c;
import m0.l.f.a.b;

/* compiled from: ContinuationImpl.kt */
public abstract class BaseContinuationImpl implements c<Object>, b, Serializable {
    private final c<Object> completion;

    public BaseContinuationImpl(c<Object> cVar) {
        this.completion = cVar;
    }

    public c<i> create(c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public b getCallerFrame() {
        c<Object> cVar = this.completion;
        if (!(cVar instanceof b)) {
            cVar = null;
        }
        return (b) cVar;
    }

    public final c<Object> getCompletion() {
        return this.completion;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement getStackTraceElement() {
        /*
            r9 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            m0.n.b.i.e(r9, r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.Class<m0.l.f.a.c> r1 = m0.l.f.a.c.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            m0.l.f.a.c r0 = (m0.l.f.a.c) r0
            r1 = 0
            if (r0 == 0) goto L_0x0112
            int r2 = r0.v()
            r3 = 1
            if (r2 > r3) goto L_0x00fe
            r2 = 0
            r4 = -1
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "field"
            m0.n.b.i.d(r5, r6)     // Catch:{ Exception -> 0x0044 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0044 }
            if (r6 != 0) goto L_0x0038
            r5 = r1
        L_0x0038:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            int r5 = r5 - r3
            goto L_0x0045
        L_0x0044:
            r5 = r4
        L_0x0045:
            if (r5 >= 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int[] r3 = r0.l()
            r4 = r3[r5]
        L_0x004e:
            java.lang.String r3 = "continuation"
            m0.n.b.i.e(r9, r3)
            m0.l.f.a.d$a r3 = m0.l.f.a.d.b
            if (r3 == 0) goto L_0x0058
            goto L_0x009b
        L_0x0058:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0097 }
            m0.l.f.a.d$a r7 = new m0.l.f.a.d$a     // Catch:{ Exception -> 0x0097 }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x0097 }
            m0.l.f.a.d.b = r7     // Catch:{ Exception -> 0x0097 }
            r3 = r7
            goto L_0x009b
        L_0x0097:
            m0.l.f.a.d$a r3 = m0.l.f.a.d.a
            m0.l.f.a.d.b = r3
        L_0x009b:
            m0.l.f.a.d$a r5 = m0.l.f.a.d.a
            if (r3 != r5) goto L_0x00a0
            goto L_0x00d0
        L_0x00a0:
            java.lang.reflect.Method r5 = r3.a
            if (r5 == 0) goto L_0x00d0
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r5.invoke(r6, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r6 = r3.b
            if (r6 == 0) goto L_0x00d0
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r6.invoke(r5, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r3 = r3.c
            if (r3 == 0) goto L_0x00c7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r2 = r3.invoke(r5, r2)
            goto L_0x00c8
        L_0x00c7:
            r2 = r1
        L_0x00c8:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r2
        L_0x00ce:
            java.lang.String r1 = (java.lang.String) r1
        L_0x00d0:
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = r0.c()
            goto L_0x00ef
        L_0x00d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 47
            r2.append(r1)
            java.lang.String r1 = r0.c()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00ef:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r2.<init>(r1, r3, r0, r4)
            r1 = r2
            goto L_0x0112
        L_0x00fe:
            java.lang.String r0 = "Debug metadata version mismatch. Expected: "
            java.lang.String r1 = ", got "
            java.lang.String r4 = ". Please update the Kotlin standard library."
            java.lang.String r0 = i0.d.a.a.a.j0(r0, r3, r1, r2, r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0112:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.BaseContinuationImpl.getStackTraceElement():java.lang.StackTraceElement");
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [m0.l.c<java.lang.Object>, java.lang.Object, m0.l.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resumeWith(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            java.lang.String r1 = "frame"
            m0.n.b.i.e(r0, r1)
            m0.l.c<java.lang.Object> r1 = r0.completion
            m0.n.b.i.c(r1)
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch:{ all -> 0x0014 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0014 }
            if (r4 != r2) goto L_0x0019
            return
        L_0x0014:
            r4 = move-exception
            java.lang.Object r4 = i0.j.f.p.h.l0(r4)
        L_0x0019:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L_0x0024
            r0 = r1
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r0 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r0
            goto L_0x0001
        L_0x0024:
            r1.resumeWith(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(java.lang.Object):void");
    }

    public String toString() {
        StringBuilder P0 = a.P0("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        P0.append(stackTraceElement);
        return P0.toString();
    }

    public c<i> create(Object obj, c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
