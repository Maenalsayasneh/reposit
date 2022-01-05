package kotlinx.coroutines.flow.internal;

import n0.a.f2.d;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1 implements e<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ int d;

    public CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1(d dVar, int i) {
        this.c = dVar;
        this.d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r7, m0.l.c<? super m0.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            i0.j.f.p.h.d4(r8)
            goto L_0x0054
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            i0.j.f.p.h.d4(r8)
            goto L_0x004b
        L_0x0036:
            i0.j.f.p.h.d4(r8)
            n0.a.f2.d r8 = r6.c
            m0.j.l r2 = new m0.j.l
            int r5 = r6.d
            r2.<init>(r5, r7)
            r0.d = r4
            java.lang.Object r7 = r8.t(r2, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0.d = r3
            java.lang.Object r7 = n0.a.i.c(r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
