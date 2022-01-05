package com.clubhouse.backchannel.members;

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

@c(c = "com.clubhouse.backchannel.members.BackchannelChatMembersFragment$onViewCreated$2", f = "BackchannelChatMembersFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelChatMembersFragment.kt */
public final class BackchannelChatMembersFragment$onViewCreated$2 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelChatMembersFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatMembersFragment$onViewCreated$2(BackchannelChatMembersFragment backchannelChatMembersFragment, m0.l.c<? super BackchannelChatMembersFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = backchannelChatMembersFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelChatMembersFragment$onViewCreated$2 backchannelChatMembersFragment$onViewCreated$2 = new BackchannelChatMembersFragment$onViewCreated$2(this.d, cVar);
        backchannelChatMembersFragment$onViewCreated$2.c = obj;
        return backchannelChatMembersFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelChatMembersFragment$onViewCreated$2 backchannelChatMembersFragment$onViewCreated$2 = new BackchannelChatMembersFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        backchannelChatMembersFragment$onViewCreated$2.c = (b) obj;
        i iVar = i.a;
        backchannelChatMembersFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final BackchannelChatMembersFragment backchannelChatMembersFragment = this.d;
            v.e2(backchannelChatMembersFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = backchannelChatMembersFragment.getString(R.string.common_error_try_again);
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
