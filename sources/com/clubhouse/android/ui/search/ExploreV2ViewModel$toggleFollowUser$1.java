package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.UserRepo;
import h0.b0.v;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.search.ExploreV2ViewModel$toggleFollowUser$1", f = "ExploreV2ViewModel.kt", l = {128, 133}, m = "invokeSuspend")
/* compiled from: ExploreV2ViewModel.kt */
public final class ExploreV2ViewModel$toggleFollowUser$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ExploreV2ViewModel d;
    public final /* synthetic */ m q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2ViewModel$toggleFollowUser$1(ExploreV2ViewModel exploreV2ViewModel, m mVar, m0.l.c<? super ExploreV2ViewModel$toggleFollowUser$1> cVar) {
        super(1, cVar);
        this.d = exploreV2ViewModel;
        this.q = mVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ExploreV2ViewModel$toggleFollowUser$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ExploreV2ViewModel$toggleFollowUser$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            if (this.d.s.t(this.q.g.getId().intValue())) {
                UserRepo userRepo = this.d.s;
                int intValue = this.q.g.getId().intValue();
                this.c = 1;
                if (userRepo.x(intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                UserRepo userRepo2 = this.d.s;
                int intValue2 = this.q.g.getId().intValue();
                SourceLocation sourceLocation = SourceLocation.SEARCH;
                Map<String, Object> t2 = v.t2(this.q.k, sourceLocation);
                this.c = 2;
                if (userRepo2.i(intValue2, sourceLocation, t2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.d.n.a(SourceLocation.SEARCH, this.q.k);
                return i.a;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            this.d.n.a(SourceLocation.SEARCH, this.q.k);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.d.n.b(SourceLocation.SEARCH, this.q.k);
        return i.a;
    }
}
