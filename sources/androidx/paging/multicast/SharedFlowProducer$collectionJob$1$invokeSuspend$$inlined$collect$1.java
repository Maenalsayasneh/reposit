package androidx.paging.multicast;

import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 implements e<T> {
    public final /* synthetic */ SharedFlowProducer$collectionJob$1 c;

    public SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(SharedFlowProducer$collectionJob$1 sharedFlowProducer$collectionJob$1) {
        this.c = sharedFlowProducer$collectionJob$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r8, m0.l.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            i0.j.f.p.h.d4(r9)
            goto L_0x0064
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.x
            n0.a.v r8 = (n0.a.v) r8
            i0.j.f.p.h.d4(r9)
            goto L_0x0059
        L_0x003b:
            i0.j.f.p.h.d4(r9)
            n0.a.v r9 = m0.r.t.a.r.m.a1.a.g(r3, r5)
            androidx.paging.multicast.SharedFlowProducer$collectionJob$1 r2 = r7.c
            androidx.paging.multicast.SharedFlowProducer r2 = r2.d
            m0.n.a.p<androidx.paging.multicast.ChannelManager$b$b<T>, m0.l.c<? super m0.i>, java.lang.Object> r2 = r2.d
            androidx.paging.multicast.ChannelManager$b$b$c r6 = new androidx.paging.multicast.ChannelManager$b$b$c
            r6.<init>(r8, r9)
            r0.x = r9
            r0.d = r5
            java.lang.Object r8 = r2.invoke(r6, r0)
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r8 = r9
        L_0x0059:
            r0.x = r3
            r0.d = r4
            java.lang.Object r8 = r8.w(r0)
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
