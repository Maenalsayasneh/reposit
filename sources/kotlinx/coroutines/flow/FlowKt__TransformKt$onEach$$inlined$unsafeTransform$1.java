package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import m0.n.a.p;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements d<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ p d;

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(d dVar, p pVar) {
        this.c = dVar;
        this.d = pVar;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final p pVar = this.d;
        Object collect = dVar.collect(new e<T>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, m0.l.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    i0.j.f.p.h.d4(r7)
                    goto L_0x0060
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    java.lang.Object r6 = r0.y
                    n0.a.g2.e r6 = (n0.a.g2.e) r6
                    java.lang.Object r2 = r0.x
                    i0.j.f.p.h.d4(r7)
                    goto L_0x0052
                L_0x003c:
                    i0.j.f.p.h.d4(r7)
                    n0.a.g2.e r7 = r4
                    m0.n.a.p r2 = r2
                    r0.x = r6
                    r0.y = r7
                    r0.d = r4
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    if (r2 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r2 = r6
                    r6 = r7
                L_0x0052:
                    r7 = 0
                    r0.x = r7
                    r0.y = r7
                    r0.d = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    m0.i r6 = m0.i.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
