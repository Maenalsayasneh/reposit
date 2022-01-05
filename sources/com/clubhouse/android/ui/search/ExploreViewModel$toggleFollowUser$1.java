package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.search.ExploreViewModel$toggleFollowUser$1", f = "ExploreViewModel.kt", l = {132, 136}, m = "invokeSuspend")
/* compiled from: ExploreViewModel.kt */
public final class ExploreViewModel$toggleFollowUser$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ExploreViewModel d;
    public final /* synthetic */ UserInList q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreViewModel$toggleFollowUser$1(ExploreViewModel exploreViewModel, UserInList userInList, m0.l.c<? super ExploreViewModel$toggleFollowUser$1> cVar) {
        super(1, cVar);
        this.d = exploreViewModel;
        this.q = userInList;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ExploreViewModel$toggleFollowUser$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ExploreViewModel$toggleFollowUser$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            if (this.d.q.t(this.q.getId().intValue())) {
                UserRepo userRepo = this.d.q;
                int intValue = this.q.getId().intValue();
                this.c = 1;
                if (userRepo.x(intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                UserRepo userRepo2 = this.d.q;
                int intValue2 = this.q.getId().intValue();
                SourceLocation sourceLocation = SourceLocation.EXPLORE;
                this.c = 2;
                if (UserRepo.j(userRepo2, intValue2, sourceLocation, (Map) null, this, 4, (Object) null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.d.n.a(SourceLocation.EXPLORE, this.q.b2);
                return i.a;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            this.d.n.a(SourceLocation.EXPLORE, this.q.b2);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.d.n.b(SourceLocation.EXPLORE, this.q.b2);
        return i.a;
    }
}
