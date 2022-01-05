package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.l;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", l = {316, 318, 319}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$fixedPeriodTicker$3 extends SuspendLambda implements p<l<? super i>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long q;
    public final /* synthetic */ long x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$3(long j, long j2, m0.l.c<? super FlowKt__DelayKt$fixedPeriodTicker$3> cVar) {
        super(2, cVar);
        this.q = j;
        this.x = j2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.q, this.x, cVar);
        flowKt__DelayKt$fixedPeriodTicker$3.d = obj;
        return flowKt__DelayKt$fixedPeriodTicker$3;
    }

    public Object invoke(Object obj, Object obj2) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.q, this.x, (m0.l.c) obj2);
        flowKt__DelayKt$fixedPeriodTicker$3.d = (l) obj;
        return flowKt__DelayKt$fixedPeriodTicker$3.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: n0.a.f2.l} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r4) goto L_0x000f
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
        L_0x000f:
            java.lang.Object r1 = r7.d
            n0.a.f2.l r1 = (n0.a.f2.l) r1
            i0.j.f.p.h.d4(r8)
            goto L_0x003d
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001f:
            java.lang.Object r1 = r7.d
            n0.a.f2.l r1 = (n0.a.f2.l) r1
            i0.j.f.p.h.d4(r8)
            r8 = r7
            goto L_0x004f
        L_0x0028:
            i0.j.f.p.h.d4(r8)
            java.lang.Object r8 = r7.d
            r1 = r8
            n0.a.f2.l r1 = (n0.a.f2.l) r1
            long r5 = r7.q
            r7.d = r1
            r7.c = r4
            java.lang.Object r8 = m0.r.t.a.r.m.a1.a.d1(r5, r7)
            if (r8 != r0) goto L_0x003d
            return r0
        L_0x003d:
            r8 = r7
        L_0x003e:
            n0.a.f2.r r4 = r1.e()
            m0.i r5 = m0.i.a
            r8.d = r1
            r8.c = r3
            java.lang.Object r4 = r4.t(r5, r8)
            if (r4 != r0) goto L_0x004f
            return r0
        L_0x004f:
            long r4 = r8.x
            r8.d = r1
            r8.c = r2
            java.lang.Object r4 = m0.r.t.a.r.m.a1.a.d1(r4, r8)
            if (r4 != r0) goto L_0x003e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
