package kotlinx.coroutines.flow;

/* compiled from: Channels.kt */
public final /* synthetic */ class FlowKt__ChannelsKt {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f A[SYNTHETIC, Splitter:B:37:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(n0.a.g2.e<? super T> r7, n0.a.f2.n<? extends T> r8, boolean r9, m0.l.c<? super m0.i> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r7 = r0.q
            java.lang.Object r8 = r0.d
            n0.a.f2.n r8 = (n0.a.f2.n) r8
            java.lang.Object r9 = r0.c
            n0.a.g2.e r9 = (n0.a.g2.e) r9
            i0.j.f.p.h.d4(r10)     // Catch:{ all -> 0x0051 }
        L_0x0033:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x005a
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            boolean r7 = r0.q
            java.lang.Object r8 = r0.d
            n0.a.f2.n r8 = (n0.a.f2.n) r8
            java.lang.Object r9 = r0.c
            n0.a.g2.e r9 = (n0.a.g2.e) r9
            i0.j.f.p.h.d4(r10)     // Catch:{ all -> 0x0051 }
            n0.a.f2.g r10 = (n0.a.f2.g) r10     // Catch:{ all -> 0x0051 }
            java.lang.Object r10 = r10.c     // Catch:{ all -> 0x0051 }
            goto L_0x006c
        L_0x0051:
            r9 = move-exception
            goto L_0x00b3
        L_0x0053:
            i0.j.f.p.h.d4(r10)
            boolean r10 = r7 instanceof n0.a.g2.c0
            if (r10 != 0) goto L_0x00bb
        L_0x005a:
            r0.c = r7     // Catch:{ all -> 0x00af }
            r0.d = r8     // Catch:{ all -> 0x00af }
            r0.q = r9     // Catch:{ all -> 0x00af }
            r0.y = r4     // Catch:{ all -> 0x00af }
            java.lang.Object r10 = r8.n(r0)     // Catch:{ all -> 0x00af }
            if (r10 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x006c:
            r2 = 0
            boolean r5 = r10 instanceof n0.a.f2.g.a     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0080
            java.lang.Throwable r9 = n0.a.f2.g.a(r10)     // Catch:{ all -> 0x0051 }
            if (r9 != 0) goto L_0x007f
            if (r7 == 0) goto L_0x007c
            m0.r.t.a.r.m.a1.a.q0(r8, r2)
        L_0x007c:
            m0.i r7 = m0.i.a
            return r7
        L_0x007f:
            throw r9     // Catch:{ all -> 0x0051 }
        L_0x0080:
            boolean r2 = r10 instanceof n0.a.f2.g.c     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0093
            r0.c = r9     // Catch:{ all -> 0x0051 }
            r0.d = r8     // Catch:{ all -> 0x0051 }
            r0.q = r7     // Catch:{ all -> 0x0051 }
            r0.y = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch:{ all -> 0x0051 }
            if (r10 != r1) goto L_0x0033
            return r1
        L_0x0093:
            boolean r9 = r10 instanceof n0.a.f2.g.a     // Catch:{ all -> 0x0051 }
            if (r9 == 0) goto L_0x009f
            r9 = r10
            n0.a.f2.g$a r9 = (n0.a.f2.g.a) r9     // Catch:{ all -> 0x0051 }
            java.lang.Throwable r9 = r9.a     // Catch:{ all -> 0x0051 }
            if (r9 == 0) goto L_0x009f
            throw r9     // Catch:{ all -> 0x0051 }
        L_0x009f:
            java.lang.String r9 = "Trying to call 'getOrThrow' on a failed channel result: "
            java.lang.String r9 = m0.n.b.i.k(r9, r10)     // Catch:{ all -> 0x0051 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0051 }
            r10.<init>(r9)     // Catch:{ all -> 0x0051 }
            throw r10     // Catch:{ all -> 0x0051 }
        L_0x00af:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x00b3:
            throw r9     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r10 = move-exception
            if (r7 == 0) goto L_0x00ba
            m0.r.t.a.r.m.a1.a.q0(r8, r9)
        L_0x00ba:
            throw r10
        L_0x00bb:
            n0.a.g2.c0 r7 = (n0.a.g2.c0) r7
            java.lang.Throwable r7 = r7.c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.a(n0.a.g2.e, n0.a.f2.n, boolean, m0.l.c):java.lang.Object");
    }
}
