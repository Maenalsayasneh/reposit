package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class FlowKt__ErrorsKt$catchImpl$$inlined$collect$1 implements e<T> {
    public final /* synthetic */ e c;
    public final /* synthetic */ Ref$ObjectRef d;

    public FlowKt__ErrorsKt$catchImpl$$inlined$collect$1(e eVar, Ref$ObjectRef ref$ObjectRef) {
        this.c = eVar;
        this.d = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r5, m0.l.c<? super m0.i> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.x
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1) r5
            i0.j.f.p.h.d4(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0045
        L_0x002b:
            r6 = move-exception
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            i0.j.f.p.h.d4(r6)
            n0.a.g2.e r6 = r4.c     // Catch:{ all -> 0x0048 }
            r0.x = r4     // Catch:{ all -> 0x0048 }
            r0.d = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            m0.i r5 = m0.i.a
            return r5
        L_0x0048:
            r6 = move-exception
            r5 = r4
        L_0x004a:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.d
            r5.c = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
