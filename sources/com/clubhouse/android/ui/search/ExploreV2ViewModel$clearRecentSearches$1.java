package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.search.ExploreV2ViewModel$clearRecentSearches$1", f = "ExploreV2ViewModel.kt", l = {149}, m = "invokeSuspend")
/* compiled from: ExploreV2ViewModel.kt */
public final class ExploreV2ViewModel$clearRecentSearches$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ExploreV2ViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2ViewModel$clearRecentSearches$1(ExploreV2ViewModel exploreV2ViewModel, m0.l.c<? super ExploreV2ViewModel$clearRecentSearches$1> cVar) {
        super(1, cVar);
        this.d = exploreV2ViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ExploreV2ViewModel$clearRecentSearches$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new ExploreV2ViewModel$clearRecentSearches$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.s;
            this.c = 1;
            obj = userRepo.c(this);
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
