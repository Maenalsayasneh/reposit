package com.clubhouse.backchannel.chat;

import com.clubhouse.backchannel.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b0.v;
import h0.o.a.k;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.z2.f.e;
import i0.e.c.c.a0;
import i0.e.c.c.g0;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.backchannel.chat.BackchannelChatFragment$onViewCreated$12", f = "BackchannelChatFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$onViewCreated$12 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelChatFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$onViewCreated$12(BackchannelChatFragment backchannelChatFragment, m0.l.c<? super BackchannelChatFragment$onViewCreated$12> cVar) {
        super(2, cVar);
        this.d = backchannelChatFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelChatFragment$onViewCreated$12 backchannelChatFragment$onViewCreated$12 = new BackchannelChatFragment$onViewCreated$12(this.d, cVar);
        backchannelChatFragment$onViewCreated$12.c = obj;
        return backchannelChatFragment$onViewCreated$12;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelChatFragment$onViewCreated$12 backchannelChatFragment$onViewCreated$12 = new BackchannelChatFragment$onViewCreated$12(this.d, (m0.l.c) obj2);
        backchannelChatFragment$onViewCreated$12.c = (b) obj;
        i iVar = i.a;
        backchannelChatFragment$onViewCreated$12.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof a0) {
            k activity = this.d.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (bVar instanceof g0) {
            BackchannelChatFragment backchannelChatFragment = this.d;
            List<ChatMember> list = ((g0) bVar).a;
            m0.r.k<Object>[] kVarArr = BackchannelChatFragment.Z1;
            v.v2(backchannelChatFragment.P0(), new BackchannelChatFragment$showBlockWarning$1(backchannelChatFragment, list));
        } else if (bVar instanceof d) {
            final BackchannelChatFragment backchannelChatFragment2 = this.d;
            v.f2(backchannelChatFragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = backchannelChatFragment2.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof e) {
            BackchannelChatFragment backchannelChatFragment3 = this.d;
            i0.e.b.z2.f.c cVar = backchannelChatFragment3.a2;
            if (cVar != null) {
                cVar.a(backchannelChatFragment3, (e) bVar);
            } else {
                m0.n.b.i.m("channelNavigator");
                throw null;
            }
        }
        return i.a;
    }
}
