package com.clubhouse.android.ui.clubs.create;

import com.clubhouse.android.data.models.remote.response.GetCreateClubResponse;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubMethod;
import com.clubhouse.android.ui.clubs.invites.GrowClubSource;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.l.v2.n;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.create.CreateClubFragment$onViewCreated$3", f = "CreateClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$onViewCreated$3 extends SuspendLambda implements p<GetCreateClubResponse, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CreateClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$onViewCreated$3(CreateClubFragment createClubFragment, m0.l.c<? super CreateClubFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.d = createClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CreateClubFragment$onViewCreated$3 createClubFragment$onViewCreated$3 = new CreateClubFragment$onViewCreated$3(this.d, cVar);
        createClubFragment$onViewCreated$3.c = obj;
        return createClubFragment$onViewCreated$3;
    }

    public Object invoke(Object obj, Object obj2) {
        CreateClubFragment$onViewCreated$3 createClubFragment$onViewCreated$3 = new CreateClubFragment$onViewCreated$3(this.d, (m0.l.c) obj2);
        createClubFragment$onViewCreated$3.c = (GetCreateClubResponse) obj;
        i iVar = i.a;
        createClubFragment$onViewCreated$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        GetCreateClubResponse getCreateClubResponse = (GetCreateClubResponse) this.c;
        v.V1(this.d, "club_created_id", new Integer(getCreateClubResponse.b));
        CreateClubFragment createClubFragment = this.d;
        GrowClubArgs growClubArgs = new GrowClubArgs(getCreateClubResponse.b, GrowClubMethod.INVITE, GrowClubSource.CLUB_CREATION);
        m0.n.b.i.e(growClubArgs, "mavericksArg");
        v.a1(createClubFragment, new n(growClubArgs), (q) null, 2);
        return i.a;
    }
}
