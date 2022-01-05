package com.clubhouse.android.ui.clubs.create;

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

@c(c = "com.clubhouse.android.ui.clubs.create.CreateClubFragment$onViewCreated$2", f = "CreateClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$onViewCreated$2 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CreateClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$onViewCreated$2(CreateClubFragment createClubFragment, m0.l.c<? super CreateClubFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = createClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CreateClubFragment$onViewCreated$2 createClubFragment$onViewCreated$2 = new CreateClubFragment$onViewCreated$2(this.d, cVar);
        createClubFragment$onViewCreated$2.c = obj;
        return createClubFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        final CreateClubFragment createClubFragment = this.d;
        CreateClubFragment$onViewCreated$2 createClubFragment$onViewCreated$2 = new CreateClubFragment$onViewCreated$2(createClubFragment, (m0.l.c) obj2);
        createClubFragment$onViewCreated$2.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) createClubFragment$onViewCreated$2.c;
        v.f2(createClubFragment, new l<j, i>() {
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
        final CreateClubFragment createClubFragment = this.d;
        v.f2(createClubFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = createClubFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return i.a;
    }
}
