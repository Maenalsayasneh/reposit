package com.clubhouse.backchannel.inbox;

import com.clubhouse.backchannel.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.backchannel.inbox.BackchannelInboxFragment$onViewCreated$11", f = "BackchannelInboxFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$onViewCreated$11 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelInboxFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$onViewCreated$11(BackchannelInboxFragment backchannelInboxFragment, m0.l.c<? super BackchannelInboxFragment$onViewCreated$11> cVar) {
        super(2, cVar);
        this.d = backchannelInboxFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelInboxFragment$onViewCreated$11 backchannelInboxFragment$onViewCreated$11 = new BackchannelInboxFragment$onViewCreated$11(this.d, cVar);
        backchannelInboxFragment$onViewCreated$11.c = obj;
        return backchannelInboxFragment$onViewCreated$11;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelInboxFragment$onViewCreated$11 backchannelInboxFragment$onViewCreated$11 = new BackchannelInboxFragment$onViewCreated$11(this.d, (m0.l.c) obj2);
        backchannelInboxFragment$onViewCreated$11.c = (b) obj;
        i iVar = i.a;
        backchannelInboxFragment$onViewCreated$11.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final BackchannelInboxFragment backchannelInboxFragment = this.d;
            v.f2(backchannelInboxFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = backchannelInboxFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
