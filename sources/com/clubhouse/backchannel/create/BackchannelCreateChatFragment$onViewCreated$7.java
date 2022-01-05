package com.clubhouse.backchannel.create;

import com.clubhouse.backchannel.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.backchannel.create.BackchannelCreateChatFragment$onViewCreated$7", f = "BackchannelCreateChatFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$onViewCreated$7 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelCreateChatFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$onViewCreated$7(BackchannelCreateChatFragment backchannelCreateChatFragment, m0.l.c<? super BackchannelCreateChatFragment$onViewCreated$7> cVar) {
        super(2, cVar);
        this.d = backchannelCreateChatFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelCreateChatFragment$onViewCreated$7 backchannelCreateChatFragment$onViewCreated$7 = new BackchannelCreateChatFragment$onViewCreated$7(this.d, cVar);
        backchannelCreateChatFragment$onViewCreated$7.c = obj;
        return backchannelCreateChatFragment$onViewCreated$7;
    }

    public Object invoke(Object obj, Object obj2) {
        final BackchannelCreateChatFragment backchannelCreateChatFragment = this.d;
        BackchannelCreateChatFragment$onViewCreated$7 backchannelCreateChatFragment$onViewCreated$7 = new BackchannelCreateChatFragment$onViewCreated$7(backchannelCreateChatFragment, (m0.l.c) obj2);
        backchannelCreateChatFragment$onViewCreated$7.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) backchannelCreateChatFragment$onViewCreated$7.c;
        v.f2(backchannelCreateChatFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = r3.getMessage();
                if (message == null) {
                    message = r0.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final Throwable th = (Throwable) this.c;
        final BackchannelCreateChatFragment backchannelCreateChatFragment = this.d;
        v.f2(backchannelCreateChatFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = backchannelCreateChatFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return i.a;
    }
}
