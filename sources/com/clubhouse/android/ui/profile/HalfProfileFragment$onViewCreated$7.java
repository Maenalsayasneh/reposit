package com.clubhouse.android.ui.profile;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b.a.d;
import h0.b0.v;
import h0.t.q;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileFragment$onViewCreated$7", f = "HalfProfileFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$onViewCreated$7 extends SuspendLambda implements p<GetCanCreateClubResponse, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfProfileFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$onViewCreated$7(HalfProfileFragment halfProfileFragment, m0.l.c<? super HalfProfileFragment$onViewCreated$7> cVar) {
        super(2, cVar);
        this.d = halfProfileFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfProfileFragment$onViewCreated$7 halfProfileFragment$onViewCreated$7 = new HalfProfileFragment$onViewCreated$7(this.d, cVar);
        halfProfileFragment$onViewCreated$7.c = obj;
        return halfProfileFragment$onViewCreated$7;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfProfileFragment$onViewCreated$7 halfProfileFragment$onViewCreated$7 = new HalfProfileFragment$onViewCreated$7(this.d, (m0.l.c) obj2);
        halfProfileFragment$onViewCreated$7.c = (GetCanCreateClubResponse) obj;
        i iVar = i.a;
        halfProfileFragment$onViewCreated$7.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        GetCanCreateClubResponse getCanCreateClubResponse = (GetCanCreateClubResponse) this.c;
        final HalfProfileFragment halfProfileFragment = this.d;
        AnonymousClass1 r1 = new a<i>() {
            public Object invoke() {
                v.a1(halfProfileFragment, new h0.t.a(R.id.action_halfprofileFragment_to_createClubFragment), (q) null, 2);
                return i.a;
            }
        };
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(getCanCreateClubResponse, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        m0.n.b.i.e(r1, "onCreateClubGrantedListener");
        if (!getCanCreateClubResponse.b) {
            ((AmplitudeAnalytics) v.l(halfProfileFragment)).a("CreateClub-PermissionDenied");
            HalfProfileUtil$handleCreateClubResponse$1 halfProfileUtil$handleCreateClubResponse$1 = new HalfProfileUtil$handleCreateClubResponse$1(getCanCreateClubResponse);
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$handleCreateClubResponse$1, "f");
            d.a aVar = new d.a(halfProfileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$handleCreateClubResponse$1.invoke(aVar);
            aVar.g();
        } else {
            ((AmplitudeAnalytics) v.l(halfProfileFragment)).a("CreateClub-PermissionGranted");
            r1.invoke();
        }
        return i.a;
    }
}
