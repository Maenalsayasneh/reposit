package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {355}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements q<f0, e<? super T>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ long Y1;
    public final /* synthetic */ d<T> Z1;
    public Object c;
    public Object d;
    public int q;
    public /* synthetic */ Object x;
    public /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, d<? extends T> dVar, m0.l.c<? super FlowKt__DelayKt$sample$2> cVar) {
        super(3, cVar);
        this.Y1 = j;
        this.Z1 = dVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.Y1, this.Z1, (m0.l.c) obj3);
        flowKt__DelayKt$sample$2.x = (f0) obj;
        flowKt__DelayKt$sample$2.y = (e) obj2;
        return flowKt__DelayKt$sample$2.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: n0.a.g2.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.q
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r14.d
            n0.a.f2.n r1 = (n0.a.f2.n) r1
            java.lang.Object r4 = r14.c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r14.y
            n0.a.f2.n r5 = (n0.a.f2.n) r5
            java.lang.Object r6 = r14.x
            n0.a.g2.e r6 = (n0.a.g2.e) r6
            i0.j.f.p.h.d4(r15)
            goto L_0x0066
        L_0x001e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0026:
            i0.j.f.p.h.d4(r15)
            java.lang.Object r15 = r14.x
            n0.a.f0 r15 = (n0.a.f0) r15
            java.lang.Object r1 = r14.y
            r6 = r1
            n0.a.g2.e r6 = (n0.a.g2.e) r6
            r1 = -1
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r4 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1
            n0.a.g2.d<T> r5 = r14.Z1
            r4.<init>(r5, r3)
            n0.a.f2.n r5 = kotlinx.coroutines.channels.ProduceKt.c(r15, r3, r1, r4, r2)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            long r10 = r14.Y1
            r7 = 0
            int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r13 = 0
            if (r1 < 0) goto L_0x004e
            r7 = r2
            goto L_0x004f
        L_0x004e:
            r7 = r13
        L_0x004f:
            java.lang.String r8 = " ms"
            if (r7 == 0) goto L_0x00bb
            if (r1 < 0) goto L_0x0057
            r1 = r2
            goto L_0x0058
        L_0x0057:
            r1 = r13
        L_0x0058:
            if (r1 == 0) goto L_0x00ab
            kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3
            r12 = 0
            r7 = r1
            r8 = r10
            r7.<init>(r8, r10, r12)
            n0.a.f2.n r1 = kotlinx.coroutines.channels.ProduceKt.c(r15, r3, r13, r1, r2)
        L_0x0066:
            T r15 = r4.c
            n0.a.h2.t r7 = n0.a.g2.d0.n.c
            if (r15 == r7) goto L_0x00a8
            r14.x = r6
            r14.y = r5
            r14.c = r4
            r14.d = r1
            r14.q = r2
            n0.a.j2.a r15 = new n0.a.j2.a
            r15.<init>(r14)
            n0.a.j2.b r7 = r5.h()     // Catch:{ all -> 0x0094 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1     // Catch:{ all -> 0x0094 }
            r8.<init>(r4, r1, r3)     // Catch:{ all -> 0x0094 }
            r7.d(r15, r8)     // Catch:{ all -> 0x0094 }
            n0.a.j2.b r7 = r1.g()     // Catch:{ all -> 0x0094 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2     // Catch:{ all -> 0x0094 }
            r8.<init>(r4, r6, r3)     // Catch:{ all -> 0x0094 }
            r7.d(r15, r8)     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r7 = move-exception
            r15.K(r7)
        L_0x0098:
            java.lang.Object r15 = r15.J()
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r15 != r7) goto L_0x00a5
            java.lang.String r7 = "frame"
            m0.n.b.i.e(r14, r7)
        L_0x00a5:
            if (r15 != r0) goto L_0x0066
            return r0
        L_0x00a8:
            m0.i r15 = m0.i.a
            return r15
        L_0x00ab:
            java.lang.String r15 = "Expected non-negative initial delay, but has "
            java.lang.String r15 = i0.d.a.a.a.l0(r15, r10, r8)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        L_0x00bb:
            java.lang.String r15 = "Expected non-negative delay, but has "
            java.lang.String r15 = i0.d.a.a.a.l0(r15, r10, r8)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
