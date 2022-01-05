package com.airbnb.mvrx;

import com.airbnb.mvrx.MavericksViewModel;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.q.m0;
import i0.b.b.j;
import i0.b.b.j0;
import i0.b.b.k;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MavericksFactory.kt */
public final class MavericksFactory<VM extends MavericksViewModel<S>, S extends j> implements m0.b {
    public final Class<? extends VM> a;
    public final Class<? extends S> b;
    public final j0 c;
    public final String d;
    public final l<S, S> e;
    public final boolean f;
    public final k<VM, S> g;

    public MavericksFactory(Class<? extends VM> cls, Class<? extends S> cls2, j0 j0Var, String str, l<? super S, ? extends S> lVar, boolean z, k<VM, S> kVar) {
        i.e(cls, "viewModelClass");
        i.e(cls2, "stateClass");
        i.e(j0Var, "viewModelContext");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(kVar, "initialStateFactory");
        this.a = cls;
        this.b = cls2;
        this.c = j0Var;
        this.d = str;
        this.e = lVar;
        this.f = z;
        this.g = kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.airbnb.mvrx.MavericksViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.airbnb.mvrx.MavericksViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.airbnb.mvrx.MavericksViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.airbnb.mvrx.MavericksViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.airbnb.mvrx.MavericksViewModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends h0.q.k0> T create(java.lang.Class<T> r14) {
        /*
            r13 = this;
            java.lang.String r0 = "modelClass"
            m0.n.b.i.e(r14, r0)
            m0.n.a.l<S, S> r14 = r13.e
            if (r14 != 0) goto L_0x0051
            boolean r0 = r13.f
            if (r0 != 0) goto L_0x000e
            goto L_0x0051
        L_0x000e:
            com.airbnb.mvrx.ViewModelDoesNotExistException r14 = new com.airbnb.mvrx.ViewModelDoesNotExistException
            java.lang.Class<? extends VM> r0 = r13.a
            i0.b.b.j0 r1 = r13.c
            java.lang.String r2 = r13.d
            java.lang.String r3 = "viewModelClass"
            m0.n.b.i.e(r0, r3)
            java.lang.String r3 = "viewModelContext"
            m0.n.b.i.e(r1, r3)
            java.lang.String r3 = "key"
            m0.n.b.i.e(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ViewModel of type "
            r3.append(r4)
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = " for "
            r3.append(r0)
            h0.q.o0 r0 = r1.c()
            r3.append(r0)
            r0 = 91
            r3.append(r0)
            java.lang.String r0 = "] does not exist yet!"
            java.lang.String r0 = i0.d.a.a.a.y0(r3, r2, r0)
            r14.<init>(r0)
            throw r14
        L_0x0051:
            java.lang.Class<? extends VM> r0 = r13.a
            java.lang.Class<? extends S> r1 = r13.b
            i0.b.b.j0 r2 = r13.c
            if (r14 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            com.airbnb.mvrx.MavericksFactory$create$viewModel$1 r14 = com.airbnb.mvrx.MavericksFactory$create$viewModel$1.c
        L_0x005c:
            i0.b.b.k<VM, S> r3 = r13.g
            java.lang.Class<i0.b.b.j> r4 = i0.b.b.j.class
            java.lang.Class<i0.b.b.j0> r5 = i0.b.b.j0.class
            java.lang.String r6 = "create"
            i0.b.b.j r14 = r3.a(r0, r1, r2, r14)
            java.lang.Class r3 = h0.b0.v.e0(r0)
            r7 = 0
            r8 = 0
            r9 = 1
            if (r3 == 0) goto L_0x00a5
            r10 = 2
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x008d }
            r11[r8] = r5     // Catch:{ NoSuchMethodException -> 0x008d }
            r11[r9] = r4     // Catch:{ NoSuchMethodException -> 0x008d }
            java.lang.reflect.Method r11 = r3.getMethod(r6, r11)     // Catch:{ NoSuchMethodException -> 0x008d }
            java.lang.Object r3 = h0.b0.v.z0(r3)     // Catch:{ NoSuchMethodException -> 0x008d }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x008d }
            r12[r8] = r2     // Catch:{ NoSuchMethodException -> 0x008d }
            r12[r9] = r14     // Catch:{ NoSuchMethodException -> 0x008d }
            java.lang.Object r3 = r11.invoke(r3, r12)     // Catch:{ NoSuchMethodException -> 0x008d }
            com.airbnb.mvrx.MavericksViewModel r3 = (com.airbnb.mvrx.MavericksViewModel) r3     // Catch:{ NoSuchMethodException -> 0x008d }
            goto L_0x00a6
        L_0x008d:
            java.lang.Class[] r3 = new java.lang.Class[r10]
            r3[r8] = r5
            r3[r9] = r4
            java.lang.reflect.Method r3 = r0.getMethod(r6, r3)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r8] = r2
            r4[r9] = r14
            java.lang.Object r2 = r3.invoke(r7, r4)
            r3 = r2
            com.airbnb.mvrx.MavericksViewModel r3 = (com.airbnb.mvrx.MavericksViewModel) r3
            goto L_0x00a6
        L_0x00a5:
            r3 = r7
        L_0x00a6:
            if (r3 == 0) goto L_0x00a9
            goto L_0x00f6
        L_0x00a9:
            java.lang.reflect.Constructor[] r2 = r0.getConstructors()
            int r2 = r2.length
            if (r2 != r9) goto L_0x00f5
            java.lang.reflect.Constructor[] r2 = r0.getConstructors()
            r2 = r2[r8]
            java.lang.String r3 = "primaryConstructor"
            m0.n.b.i.d(r2, r3)
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            if (r3 != r9) goto L_0x00f5
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3 = r3[r8]
            java.lang.Class r4 = r14.getClass()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x00f5
            boolean r3 = r2.isAccessible()
            if (r3 != 0) goto L_0x00e5
            r2.setAccessible(r9)     // Catch:{ SecurityException -> 0x00dc }
            goto L_0x00e5
        L_0x00dc:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ViewModel class is not public and MvRx could not make the primary constructor accessible."
            r0.<init>(r1, r14)
            throw r0
        L_0x00e5:
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r8] = r14
            java.lang.Object r14 = r2.newInstance(r3)
            boolean r2 = r14 instanceof com.airbnb.mvrx.MavericksViewModel
            if (r2 != 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r7 = r14
        L_0x00f3:
            com.airbnb.mvrx.MavericksViewModel r7 = (com.airbnb.mvrx.MavericksViewModel) r7
        L_0x00f5:
            r3 = r7
        L_0x00f6:
            if (r3 != 0) goto L_0x0177
            java.lang.reflect.Constructor[] r14 = r0.getConstructors()
            java.lang.String r2 = "viewModelClass.constructors"
            m0.n.b.i.d(r14, r2)
            java.lang.Object r14 = i0.j.f.p.h.I0(r14)
            java.lang.reflect.Constructor r14 = (java.lang.reflect.Constructor) r14
            if (r14 == 0) goto L_0x0143
            java.lang.Class[] r14 = r14.getParameterTypes()
            if (r14 == 0) goto L_0x0143
            int r14 = r14.length
            if (r14 <= r9) goto L_0x0113
            r8 = r9
        L_0x0113:
            if (r8 != r9) goto L_0x0143
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = " takes dependencies other than initialState. "
            r14.append(r0)
            java.lang.String r0 = "It must have companion object implementing "
            r14.append(r0)
            java.lang.Class<i0.b.b.v> r0 = i0.b.b.v.class
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            r0 = 32
            r14.append(r0)
            java.lang.String r0 = "with a create method returning a non-null ViewModel."
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            goto L_0x016d
        L_0x0143:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = " must have primary constructor with a "
            r14.append(r0)
            java.lang.String r0 = "single non-optional parameter that takes initial state of "
            r14.append(r0)
            java.lang.String r0 = r1.getSimpleName()
            r14.append(r0)
            r0 = 46
            r14.append(r0)
            java.lang.String r14 = r14.toString()
        L_0x016d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x0177:
            i0.b.b.y r14 = new i0.b.b.y
            r14.<init>(r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.mvrx.MavericksFactory.create(java.lang.Class):h0.q.k0");
    }
}
