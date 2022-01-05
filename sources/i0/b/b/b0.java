package i0.b.b;

import com.airbnb.mvrx.MavericksViewModel;
import i0.b.b.j;

/* compiled from: MavericksStateFactory.kt */
public final class b0<VM extends MavericksViewModel<S>, S extends j> implements k<VM, S> {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf A[LOOP:0: B:11:0x0071->B:28:0x00bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db A[SYNTHETIC, Splitter:B:39:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130 A[Catch:{ all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00c3 A[EDGE_INSN: B:83:0x00c3->B:30:0x00c3 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S a(java.lang.Class<? extends VM> r12, java.lang.Class<? extends S> r13, i0.b.b.j0 r14, m0.n.a.l<? super S, ? extends S> r15) {
        /*
            r11 = this;
            java.lang.String r0 = "viewModelClass"
            m0.n.b.i.e(r12, r0)
            java.lang.String r1 = "stateClass"
            m0.n.b.i.e(r13, r1)
            java.lang.String r2 = "viewModelContext"
            m0.n.b.i.e(r14, r2)
            java.lang.String r3 = "stateRestorer"
            m0.n.b.i.e(r15, r3)
            java.lang.Class<i0.b.b.j0> r3 = i0.b.b.j0.class
            java.lang.String r4 = "initialState"
            m0.n.b.i.e(r12, r0)
            m0.n.b.i.e(r14, r2)
            java.lang.Class r2 = h0.b0.v.e0(r12)
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0051
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x003e }
            r8[r5] = r3     // Catch:{ NoSuchMethodException -> 0x003e }
            java.lang.reflect.Method r8 = r2.getMethod(r4, r8)     // Catch:{ NoSuchMethodException -> 0x003e }
            java.lang.Object r2 = h0.b0.v.z0(r2)     // Catch:{ NoSuchMethodException -> 0x003e }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ NoSuchMethodException -> 0x003e }
            r9[r5] = r14     // Catch:{ NoSuchMethodException -> 0x003e }
            java.lang.Object r2 = r8.invoke(r2, r9)     // Catch:{ NoSuchMethodException -> 0x003e }
            i0.b.b.j r2 = (i0.b.b.j) r2     // Catch:{ NoSuchMethodException -> 0x003e }
            goto L_0x0052
        L_0x003e:
            java.lang.Class[] r2 = new java.lang.Class[r7]
            r2[r5] = r3
            java.lang.reflect.Method r2 = r12.getMethod(r4, r2)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r5] = r14
            java.lang.Object r2 = r2.invoke(r6, r3)
            i0.b.b.j r2 = (i0.b.b.j) r2
            goto L_0x0052
        L_0x0051:
            r2 = r6
        L_0x0052:
            if (r2 == 0) goto L_0x0056
            goto L_0x0144
        L_0x0056:
            java.lang.Object r14 = r14.b()
            m0.n.b.i.e(r12, r0)
            m0.n.b.i.e(r13, r1)
            java.lang.String r0 = "stateClass.constructors"
            if (r14 == 0) goto L_0x00c2
            java.lang.Class r1 = r14.getClass()
            java.lang.reflect.Constructor[] r2 = r13.getConstructors()
            m0.n.b.i.d(r2, r0)
            int r3 = r2.length
            r4 = r5
        L_0x0071:
            if (r4 >= r3) goto L_0x00c2
            r8 = r2[r4]
            java.lang.String r9 = "constructor"
            m0.n.b.i.d(r8, r9)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != r7) goto L_0x00bb
            java.lang.Class[] r9 = r8.getParameterTypes()
            r9 = r9[r5]
            java.lang.String r10 = "constructor.parameterTypes[0]"
            m0.n.b.i.d(r9, r10)
            java.util.Map<? extends java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> r10 = i0.b.b.d0.a
            java.lang.String r10 = "from"
            m0.n.b.i.e(r1, r10)
            java.lang.String r10 = "to"
            m0.n.b.i.e(r9, r10)
            boolean r10 = r9.isAssignableFrom(r1)
            if (r10 == 0) goto L_0x00a0
            r9 = r7
            goto L_0x00b7
        L_0x00a0:
            boolean r10 = r1.isPrimitive()
            if (r10 == 0) goto L_0x00ab
            boolean r9 = i0.b.b.d0.a(r9, r1)
            goto L_0x00b7
        L_0x00ab:
            boolean r10 = r9.isPrimitive()
            if (r10 == 0) goto L_0x00b6
            boolean r9 = i0.b.b.d0.a(r1, r9)
            goto L_0x00b7
        L_0x00b6:
            r9 = r5
        L_0x00b7:
            if (r9 == 0) goto L_0x00bb
            r9 = r7
            goto L_0x00bc
        L_0x00bb:
            r9 = r5
        L_0x00bc:
            if (r9 == 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            int r4 = r4 + 1
            goto L_0x0071
        L_0x00c2:
            r8 = r6
        L_0x00c3:
            if (r8 == 0) goto L_0x00ce
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r14
            java.lang.Object r1 = r8.newInstance(r1)
            goto L_0x00cf
        L_0x00ce:
            r1 = r6
        L_0x00cf:
            boolean r2 = r1 instanceof i0.b.b.j
            if (r2 != 0) goto L_0x00d4
            r1 = r6
        L_0x00d4:
            i0.b.b.j r1 = (i0.b.b.j) r1
            if (r1 == 0) goto L_0x00db
            r2 = r1
            goto L_0x0142
        L_0x00db:
            int r1 = r13.getModifiers()     // Catch:{ all -> 0x0198 }
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch:{ all -> 0x0198 }
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r0 = r13.newInstance()     // Catch:{ all -> 0x0198 }
            r6 = r0
            i0.b.b.j r6 = (i0.b.b.j) r6     // Catch:{ all -> 0x0198 }
            goto L_0x0141
        L_0x00ed:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0198 }
            r2 = 26
            if (r1 < r2) goto L_0x0114
            java.lang.reflect.Constructor[] r1 = r13.getConstructors()     // Catch:{ all -> 0x0198 }
            m0.n.b.i.d(r1, r0)     // Catch:{ all -> 0x0198 }
            int r0 = r1.length     // Catch:{ all -> 0x0198 }
            r2 = r5
        L_0x00fc:
            if (r2 >= r0) goto L_0x0128
            r3 = r1[r2]     // Catch:{ all -> 0x0198 }
            java.lang.String r4 = "it"
            m0.n.b.i.d(r3, r4)     // Catch:{ all -> 0x0198 }
            int r4 = r3.getParameterCount()     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x010d
            r4 = r7
            goto L_0x010e
        L_0x010d:
            r4 = r5
        L_0x010e:
            if (r4 == 0) goto L_0x0111
            goto L_0x012e
        L_0x0111:
            int r2 = r2 + 1
            goto L_0x00fc
        L_0x0114:
            java.lang.reflect.Constructor[] r1 = r13.getConstructors()     // Catch:{ all -> 0x0198 }
            m0.n.b.i.d(r1, r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "$this$lastOrNull"
            m0.n.b.i.e(r1, r0)     // Catch:{ all -> 0x0198 }
            int r0 = r1.length     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x0125
            r0 = r7
            goto L_0x0126
        L_0x0125:
            r0 = r5
        L_0x0126:
            if (r0 == 0) goto L_0x012a
        L_0x0128:
            r3 = r6
            goto L_0x012e
        L_0x012a:
            int r0 = r1.length     // Catch:{ all -> 0x0198 }
            int r0 = r0 - r7
            r3 = r1[r0]     // Catch:{ all -> 0x0198 }
        L_0x012e:
            if (r3 == 0) goto L_0x0141
            r3.setAccessible(r7)     // Catch:{ all -> 0x0198 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0198 }
            java.lang.Object r0 = r3.newInstance(r0)     // Catch:{ all -> 0x0198 }
            boolean r1 = r0 instanceof i0.b.b.j     // Catch:{ all -> 0x0198 }
            if (r1 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r6 = r0
        L_0x013f:
            i0.b.b.j r6 = (i0.b.b.j) r6     // Catch:{ all -> 0x0198 }
        L_0x0141:
            r2 = r6
        L_0x0142:
            if (r2 == 0) goto L_0x014b
        L_0x0144:
            java.lang.Object r12 = r15.invoke(r2)
            i0.b.b.j r12 = (i0.b.b.j) r12
            return r12
        L_0x014b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to create the MvRx state class "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r13 = r13.getSimpleName()
            r0.append(r13)
            java.lang.String r13 = " has failed. One of the following must be true:"
            r0.append(r13)
            java.lang.String r13 = "\n 1) The state class has default values for every constructor property."
            r0.append(r13)
            java.lang.String r13 = "\n 2) The state class has a secondary constructor for "
            r0.append(r13)
            if (r14 == 0) goto L_0x0176
            java.lang.Class r13 = r14.getClass()
            if (r13 == 0) goto L_0x0176
            java.lang.String r13 = r13.getSimpleName()
            goto L_0x0178
        L_0x0176:
            java.lang.String r13 = "a fragment argument"
        L_0x0178:
            r0.append(r13)
            r13 = 46
            r0.append(r13)
            java.lang.String r13 = "\n 3) "
            r0.append(r13)
            java.lang.String r12 = r12.getSimpleName()
            r0.append(r12)
            java.lang.String r12 = " must have a companion object implementing MvRxFactory with an initialState function "
            java.lang.String r13 = "that does not return null. "
            java.lang.String r12 = i0.d.a.a.a.y0(r0, r12, r13)
            r15.<init>(r12)
            throw r15
        L_0x0198:
            r12 = move-exception
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Failed to create initial state!"
            r13.<init>(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.b.b0.a(java.lang.Class, java.lang.Class, i0.b.b.j0, m0.n.a.l):i0.b.b.j");
    }
}
