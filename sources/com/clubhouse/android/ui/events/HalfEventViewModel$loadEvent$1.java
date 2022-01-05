package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.remote.response.GetEventResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.events.HalfEventViewModel$loadEvent$1", f = "HalfEventViewModel.kt", l = {153}, m = "invokeSuspend")
/* compiled from: HalfEventViewModel.kt */
public final class HalfEventViewModel$loadEvent$1 extends SuspendLambda implements l<m0.l.c<? super GetEventResponse>, Object> {
    public int c;
    public final /* synthetic */ HalfEventViewModel d;
    public final /* synthetic */ HalfEventArgs q;
    public final /* synthetic */ EventInClub x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventViewModel$loadEvent$1(HalfEventViewModel halfEventViewModel, HalfEventArgs halfEventArgs, EventInClub eventInClub, m0.l.c<? super HalfEventViewModel$loadEvent$1> cVar) {
        super(1, cVar);
        this.d = halfEventViewModel;
        this.q = halfEventArgs;
        this.x = eventInClub;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new HalfEventViewModel$loadEvent$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new HalfEventViewModel$loadEvent$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            i0.j.f.p.h.d4(r10)
            goto L_0x004a
        L_0x000d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0015:
            i0.j.f.p.h.d4(r10)
            com.clubhouse.android.ui.events.HalfEventViewModel r10 = r9.d
            com.clubhouse.android.data.repos.EventRepo r3 = r10.p
            com.clubhouse.android.ui.events.HalfEventArgs r10 = r9.q
            java.lang.Integer r10 = r10.d
            if (r10 != 0) goto L_0x0031
            com.clubhouse.android.data.models.local.EventInClub r10 = r9.x
            if (r10 != 0) goto L_0x0028
            r10 = 0
            goto L_0x0031
        L_0x0028:
            int r10 = r10.Y1
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r10)
            r4 = r1
            goto L_0x0032
        L_0x0031:
            r4 = r10
        L_0x0032:
            com.clubhouse.android.ui.events.HalfEventArgs r10 = r9.q
            java.lang.String r5 = r10.c
            java.lang.String r6 = r10.x
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.Z1
            com.clubhouse.android.data.models.local.user.SourceLocation r10 = r10.Y1
            java.util.Map r7 = h0.b0.v.t2(r1, r10)
            r9.c = r2
            r8 = r9
            java.lang.Object r10 = r3.d(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L_0x004a
            return r0
        L_0x004a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.events.HalfEventViewModel$loadEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
