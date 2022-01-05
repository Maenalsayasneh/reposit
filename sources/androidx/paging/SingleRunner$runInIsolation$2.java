package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {55, 59, 61, 61}, m = "invokeSuspend")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$runInIsolation$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ SingleRunner q;
    public final /* synthetic */ int x;
    public final /* synthetic */ l y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i, l lVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = singleRunner;
        this.x = i;
        this.y = lVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.q, this.x, this.y, cVar);
        singleRunner$runInIsolation$2.c = obj;
        return singleRunner$runInIsolation$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.q, this.x, this.y, cVar);
        singleRunner$runInIsolation$2.c = obj;
        return singleRunner$runInIsolation$2.invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 == r5) goto L_0x0032
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0023
            if (r1 == r2) goto L_0x001a
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001a:
            java.lang.Object r0 = r8.c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            i0.j.f.p.h.d4(r9)
            goto L_0x009a
        L_0x0023:
            i0.j.f.p.h.d4(r9)
            goto L_0x009b
        L_0x0028:
            java.lang.Object r1 = r8.c
            n0.a.f1 r1 = (n0.a.f1) r1
            i0.j.f.p.h.d4(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x007a
        L_0x0030:
            r9 = move-exception
            goto L_0x008a
        L_0x0032:
            java.lang.Object r1 = r8.c
            n0.a.f1 r1 = (n0.a.f1) r1
            i0.j.f.p.h.d4(r9)
            goto L_0x0065
        L_0x003a:
            i0.j.f.p.h.d4(r9)
            java.lang.Object r9 = r8.c
            n0.a.f0 r9 = (n0.a.f0) r9
            m0.l.e r9 = r9.C()
            int r1 = n0.a.f1.k
            n0.a.f1$a r1 = n0.a.f1.a.c
            m0.l.e$a r9 = r9.get(r1)
            if (r9 == 0) goto L_0x009e
            n0.a.f1 r9 = (n0.a.f1) r9
            androidx.paging.SingleRunner r1 = r8.q
            androidx.paging.SingleRunner$Holder r1 = r1.a
            int r6 = r8.x
            r8.c = r9
            r8.d = r5
            java.lang.Object r1 = r1.b(r6, r9, r8)
            if (r1 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0065:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x009b
            m0.n.a.l r9 = r8.y     // Catch:{ all -> 0x0030 }
            r8.c = r1     // Catch:{ all -> 0x0030 }
            r8.d = r4     // Catch:{ all -> 0x0030 }
            java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0030 }
            if (r9 != r0) goto L_0x007a
            return r0
        L_0x007a:
            androidx.paging.SingleRunner r9 = r8.q
            androidx.paging.SingleRunner$Holder r9 = r9.a
            r2 = 0
            r8.c = r2
            r8.d = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L_0x009b
            return r0
        L_0x008a:
            androidx.paging.SingleRunner r3 = r8.q
            androidx.paging.SingleRunner$Holder r3 = r3.a
            r8.c = r9
            r8.d = r2
            java.lang.Object r1 = r3.a(r1, r8)
            if (r1 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r0 = r9
        L_0x009a:
            throw r0
        L_0x009b:
            m0.i r9 = m0.i.a
            return r9
        L_0x009e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner$runInIsolation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
