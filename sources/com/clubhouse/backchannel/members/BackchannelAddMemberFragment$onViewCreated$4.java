package com.clubhouse.backchannel.members;

import com.clubhouse.backchannel.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.c.i.o;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.backchannel.members.BackchannelAddMemberFragment$onViewCreated$4", f = "BackchannelAddMemberFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelAddMemberFragment.kt */
public final class BackchannelAddMemberFragment$onViewCreated$4 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelAddMemberFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelAddMemberFragment$onViewCreated$4(BackchannelAddMemberFragment backchannelAddMemberFragment, m0.l.c<? super BackchannelAddMemberFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = backchannelAddMemberFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelAddMemberFragment$onViewCreated$4 backchannelAddMemberFragment$onViewCreated$4 = new BackchannelAddMemberFragment$onViewCreated$4(this.d, cVar);
        backchannelAddMemberFragment$onViewCreated$4.c = obj;
        return backchannelAddMemberFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelAddMemberFragment$onViewCreated$4 backchannelAddMemberFragment$onViewCreated$4 = new BackchannelAddMemberFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        backchannelAddMemberFragment$onViewCreated$4.c = (b) obj;
        i iVar = i.a;
        backchannelAddMemberFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final BackchannelAddMemberFragment backchannelAddMemberFragment = this.d;
            v.e2(backchannelAddMemberFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = backchannelAddMemberFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof o) {
            this.d.dismiss();
        }
        return i.a;
    }
}
