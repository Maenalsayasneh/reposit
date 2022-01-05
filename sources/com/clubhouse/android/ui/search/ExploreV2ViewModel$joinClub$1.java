package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.e.b.b3.b.e.e;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.search.ExploreV2ViewModel$joinClub$1", f = "ExploreV2ViewModel.kt", l = {187}, m = "invokeSuspend")
/* compiled from: ExploreV2ViewModel.kt */
public final class ExploreV2ViewModel$joinClub$1 extends SuspendLambda implements l<m0.l.c<? super JoinClubResponse>, Object> {
    public int c;
    public final /* synthetic */ ExploreV2ViewModel d;
    public final /* synthetic */ e q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2ViewModel$joinClub$1(ExploreV2ViewModel exploreV2ViewModel, e eVar, m0.l.c<? super ExploreV2ViewModel$joinClub$1> cVar) {
        super(1, cVar);
        this.d = exploreV2ViewModel;
        this.q = eVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ExploreV2ViewModel$joinClub$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ExploreV2ViewModel$joinClub$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.u;
            e eVar = this.q;
            int i2 = eVar.b.x;
            SourceLocation sourceLocation = SourceLocation.SEARCH;
            Map<String, Object> map = eVar.d;
            this.c = 1;
            obj = ClubRepo.o(clubRepo, i2, (String) null, sourceLocation, map, this, 2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
