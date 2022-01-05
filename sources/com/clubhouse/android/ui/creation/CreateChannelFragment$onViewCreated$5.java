package com.clubhouse.android.ui.creation;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.creation.CreateChannelFragment$onViewCreated$5", f = "CreateChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$onViewCreated$5 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CreateChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$onViewCreated$5(CreateChannelFragment createChannelFragment, m0.l.c<? super CreateChannelFragment$onViewCreated$5> cVar) {
        super(2, cVar);
        this.d = createChannelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CreateChannelFragment$onViewCreated$5 createChannelFragment$onViewCreated$5 = new CreateChannelFragment$onViewCreated$5(this.d, cVar);
        createChannelFragment$onViewCreated$5.c = obj;
        return createChannelFragment$onViewCreated$5;
    }

    public Object invoke(Object obj, Object obj2) {
        final CreateChannelFragment createChannelFragment = this.d;
        CreateChannelFragment$onViewCreated$5 createChannelFragment$onViewCreated$5 = new CreateChannelFragment$onViewCreated$5(createChannelFragment, (m0.l.c) obj2);
        createChannelFragment$onViewCreated$5.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) createChannelFragment$onViewCreated$5.c;
        v.e2(createChannelFragment, new l<j, i>() {
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
        final CreateChannelFragment createChannelFragment = this.d;
        v.e2(createChannelFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = createChannelFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return i.a;
    }
}
