package com.stripe.android.stripe3ds2.views;

import h0.q.v;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1", f = "ChallengeActivityViewModel.kt", l = {64, 64}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/q/v;", "", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivityViewModel.kt */
public final class ChallengeActivityViewModel$getTimeout$1 extends SuspendLambda implements p<v<Boolean>, m0.l.c<? super i>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$getTimeout$1(ChallengeActivityViewModel challengeActivityViewModel, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = challengeActivityViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        ChallengeActivityViewModel$getTimeout$1 challengeActivityViewModel$getTimeout$1 = new ChallengeActivityViewModel$getTimeout$1(this.this$0, cVar);
        challengeActivityViewModel$getTimeout$1.L$0 = obj;
        return challengeActivityViewModel$getTimeout$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeActivityViewModel$getTimeout$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h0.q.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x0019
            if (r1 != r3) goto L_0x0011
            i0.j.f.p.h.d4(r7)
            goto L_0x004e
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0019:
            java.lang.Object r1 = r6.L$0
            h0.q.v r1 = (h0.q.v) r1
            i0.j.f.p.h.d4(r7)
            goto L_0x0043
        L_0x0021:
            i0.j.f.p.h.d4(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            h0.q.v r1 = (h0.q.v) r1
            com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel r7 = r6.this$0
            com.stripe.android.stripe3ds2.transaction.TransactionTimer r7 = r7.transactionTimer
            n0.a.g2.d r7 = r7.getTimeout()
            com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1 r5 = new com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1
            r5.<init>(r2)
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r7 = m0.r.t.a.r.m.a1.a.w1(r7, r5, r6)
            if (r7 != r0) goto L_0x0043
            return r0
        L_0x0043:
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x004e:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
