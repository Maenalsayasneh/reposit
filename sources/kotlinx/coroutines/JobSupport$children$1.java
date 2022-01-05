package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.s.j;
import n0.a.t;

@c(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
/* compiled from: JobSupport.kt */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements p<j<? super t>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ JobSupport Y1;
    public Object d;
    public Object q;
    public int x;
    public /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, m0.l.c<? super JobSupport$children$1> cVar) {
        super(2, cVar);
        this.Y1 = jobSupport;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.Y1, cVar);
        jobSupport$children$1.y = obj;
        return jobSupport$children$1;
    }

    public Object invoke(Object obj, Object obj2) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.Y1, (m0.l.c) obj2);
        jobSupport$children$1.y = (j) obj;
        return jobSupport$children$1.invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r7.q
            n0.a.h2.k r1 = (n0.a.h2.k) r1
            java.lang.Object r3 = r7.d
            n0.a.h2.i r3 = (n0.a.h2.i) r3
            java.lang.Object r4 = r7.y
            m0.s.j r4 = (m0.s.j) r4
            i0.j.f.p.h.d4(r8)
            r8 = r7
            goto L_0x007d
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            i0.j.f.p.h.d4(r8)
            goto L_0x0082
        L_0x0029:
            i0.j.f.p.h.d4(r8)
            java.lang.Object r8 = r7.y
            m0.s.j r8 = (m0.s.j) r8
            kotlinx.coroutines.JobSupport r1 = r7.Y1
            java.lang.Object r1 = r1.a0()
            boolean r4 = r1 instanceof n0.a.s
            if (r4 == 0) goto L_0x0047
            n0.a.s r1 = (n0.a.s) r1
            n0.a.t r1 = r1.y
            r7.x = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L_0x0082
            return r0
        L_0x0047:
            boolean r3 = r1 instanceof n0.a.a1
            if (r3 == 0) goto L_0x0082
            n0.a.a1 r1 = (n0.a.a1) r1
            n0.a.m1 r1 = r1.g()
            if (r1 != 0) goto L_0x0054
            goto L_0x0082
        L_0x0054:
            java.lang.Object r3 = r1.v()
            n0.a.h2.k r3 = (n0.a.h2.k) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x005f:
            boolean r5 = m0.n.b.i.a(r1, r3)
            if (r5 != 0) goto L_0x0082
            boolean r5 = r1 instanceof n0.a.s
            if (r5 == 0) goto L_0x007d
            r5 = r1
            n0.a.s r5 = (n0.a.s) r5
            n0.a.t r5 = r5.y
            r8.y = r4
            r8.d = r3
            r8.q = r1
            r8.x = r2
            java.lang.Object r5 = r4.a(r5, r8)
            if (r5 != r0) goto L_0x007d
            return r0
        L_0x007d:
            n0.a.h2.k r1 = r1.w()
            goto L_0x005f
        L_0x0082:
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
