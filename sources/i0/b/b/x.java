package i0.b.b;

/* compiled from: MavericksViewModelProvider.kt */
public final class x {
    public static final x a = new x();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: i0.b.b.b0} */
    /* JADX WARNING: type inference failed for: r8v6, types: [i0.b.b.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.mvrx.MavericksViewModel a(i0.b.b.x r17, java.lang.Class r18, java.lang.Class r19, i0.b.b.j0 r20, java.lang.String r21, boolean r22, i0.b.b.k r23, int r24) {
        /*
            r0 = r20
            r1 = r24 & 8
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r18.getName()
            java.lang.String r2 = "viewModelClass.name"
            m0.n.b.i.d(r1, r2)
            goto L_0x0012
        L_0x0010:
            r1 = r21
        L_0x0012:
            r2 = r24 & 16
            if (r2 == 0) goto L_0x0019
            r2 = 0
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r22
        L_0x001b:
            r2 = r24 & 32
            if (r2 == 0) goto L_0x0026
            i0.b.b.b0 r2 = new i0.b.b.b0
            r2.<init>()
            r10 = r2
            goto L_0x0028
        L_0x0026:
            r10 = r23
        L_0x0028:
            java.lang.String r2 = "viewModelClass"
            r4 = r18
            m0.n.b.i.e(r4, r2)
            java.lang.String r2 = "stateClass"
            r5 = r19
            m0.n.b.i.e(r5, r2)
            java.lang.String r2 = "viewModelContext"
            m0.n.b.i.e(r0, r2)
            java.lang.String r2 = "key"
            m0.n.b.i.e(r1, r2)
            java.lang.String r2 = "initialStateFactory"
            m0.n.b.i.e(r10, r2)
            r2 = r0
            i0.b.b.d r2 = (i0.b.b.d) r2
            h0.x.a r3 = r2.e
            boolean r6 = r3.c
            if (r6 == 0) goto L_0x012a
            android.os.Bundle r3 = r3.a(r1)
            if (r3 == 0) goto L_0x00ba
            java.lang.String r7 = "mvrx:saved_args"
            java.lang.Object r13 = r3.get(r7)
            java.lang.String r7 = "mvrx:saved_instance_state"
            android.os.Bundle r3 = r3.getBundle(r7)
            if (r3 == 0) goto L_0x00ae
            boolean r7 = r0 instanceof i0.b.b.a
            java.lang.String r8 = "savedStateRegistry"
            java.lang.String r11 = "owner"
            java.lang.String r12 = "activity"
            if (r7 == 0) goto L_0x0084
            r7 = r0
            i0.b.b.a r7 = (i0.b.b.a) r7
            androidx.activity.ComponentActivity r14 = r7.a
            h0.q.o0 r15 = r7.c
            h0.x.a r7 = r7.d
            m0.n.b.i.e(r14, r12)
            m0.n.b.i.e(r15, r11)
            m0.n.b.i.e(r7, r8)
            i0.b.b.a r8 = new i0.b.b.a
            r8.<init>(r14, r13, r15, r7)
            goto L_0x00a3
        L_0x0084:
            androidx.activity.ComponentActivity r7 = r2.a
            androidx.fragment.app.Fragment r14 = r2.c
            h0.q.o0 r15 = r2.d
            h0.x.a r6 = r2.e
            m0.n.b.i.e(r7, r12)
            java.lang.String r12 = "fragment"
            m0.n.b.i.e(r14, r12)
            m0.n.b.i.e(r15, r11)
            m0.n.b.i.e(r6, r8)
            i0.b.b.d r8 = new i0.b.b.d
            r11 = r8
            r12 = r7
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x00a3:
            i0.b.b.e0 r6 = new i0.b.b.e0
            com.airbnb.mvrx.MavericksViewModelProvider$toStateRestorer$2 r7 = new com.airbnb.mvrx.MavericksViewModelProvider$toStateRestorer$2
            r7.<init>(r3)
            r6.<init>(r8, r7)
            goto L_0x00bb
        L_0x00ae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "State was not saved prior to restoring!"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            r6 = 0
        L_0x00bb:
            if (r6 == 0) goto L_0x00c3
            i0.b.b.j0 r3 = r6.a
            if (r3 == 0) goto L_0x00c3
            r11 = r3
            goto L_0x00c4
        L_0x00c3:
            r11 = r0
        L_0x00c4:
            h0.q.o0 r2 = r2.d
            com.airbnb.mvrx.MavericksFactory r12 = new com.airbnb.mvrx.MavericksFactory
            if (r6 == 0) goto L_0x00ce
            m0.n.a.l<S, S> r3 = r6.b
            r8 = r3
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            r3 = r12
            r4 = r18
            r5 = r19
            r6 = r11
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            h0.q.n0 r2 = r2.getViewModelStore()
            java.lang.Class<i0.b.b.y> r3 = i0.b.b.y.class
            java.util.HashMap<java.lang.String, h0.q.k0> r4 = r2.a
            java.lang.Object r4 = r4.get(r1)
            h0.q.k0 r4 = (h0.q.k0) r4
            boolean r5 = r3.isInstance(r4)
            if (r5 == 0) goto L_0x00f7
            boolean r2 = r12 instanceof h0.q.m0.e
            if (r2 == 0) goto L_0x0114
            h0.q.m0$e r12 = (h0.q.m0.e) r12
            r12.onRequery(r4)
            goto L_0x0114
        L_0x00f7:
            boolean r4 = r12 instanceof h0.q.m0.c
            if (r4 == 0) goto L_0x0102
            h0.q.m0$c r12 = (h0.q.m0.c) r12
            h0.q.k0 r3 = r12.create(r1, r3)
            goto L_0x0106
        L_0x0102:
            h0.q.k0 r3 = r12.create(r3)
        L_0x0106:
            r4 = r3
            java.util.HashMap<java.lang.String, h0.q.k0> r2 = r2.a
            java.lang.Object r2 = r2.put(r1, r4)
            h0.q.k0 r2 = (h0.q.k0) r2
            if (r2 == 0) goto L_0x0114
            r2.onCleared()
        L_0x0114:
            java.lang.String r2 = "null cannot be cast to non-null type com.airbnb.mvrx.MavericksViewModelWrapper<VM, S>"
            java.util.Objects.requireNonNull(r4, r2)
            i0.b.b.y r4 = (i0.b.b.y) r4
            i0.b.b.d r0 = (i0.b.b.d) r0     // Catch:{ IllegalArgumentException -> 0x0127 }
            h0.x.a r0 = r0.e     // Catch:{ IllegalArgumentException -> 0x0127 }
            i0.b.b.w r2 = new i0.b.b.w     // Catch:{ IllegalArgumentException -> 0x0127 }
            r2.<init>(r4, r11)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r0.b(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0127 }
        L_0x0127:
            VM r0 = r4.a
            return r0
        L_0x012a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You can only access a view model after super.onCreate of your activity/fragment has been called."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.b.x.a(i0.b.b.x, java.lang.Class, java.lang.Class, i0.b.b.j0, java.lang.String, boolean, i0.b.b.k, int):com.airbnb.mvrx.MavericksViewModel");
    }
}
