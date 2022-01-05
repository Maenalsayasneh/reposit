package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import m0.n.a.p;
import n0.a.g2.e;

/* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1  reason: invalid class name */
/* compiled from: Collect.kt */
public final class FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1 implements e<T> {
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ e d;
    public final /* synthetic */ p q;

    public FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1(Ref$BooleanRef ref$BooleanRef, e eVar, p pVar) {
        this.c = ref$BooleanRef;
        this.d = eVar;
        this.q = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r7, m0.l.c<? super m0.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            i0.j.f.p.h.d4(r8)
            goto L_0x0083
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.y
            java.lang.Object r2 = r0.x
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1) r2
            i0.j.f.p.h.d4(r8)
            goto L_0x0067
        L_0x003f:
            i0.j.f.p.h.d4(r8)
            goto L_0x0083
        L_0x0043:
            i0.j.f.p.h.d4(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.c
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x0057
            n0.a.g2.e r8 = r6.d
            r0.d = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0057:
            m0.n.a.p r8 = r6.q
            r0.x = r6
            r0.y = r7
            r0.d = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r6
        L_0x0067:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0083
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.c
            r8.c = r5
            n0.a.g2.e r8 = r2.d
            r2 = 0
            r0.x = r2
            r0.y = r2
            r0.d = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
