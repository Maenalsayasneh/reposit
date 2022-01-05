package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.EventRepo;
import h0.b0.v;
import i0.e.b.b3.b.e.g;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.search.ExploreV2ViewModel$rsvpEvent$1", f = "ExploreV2ViewModel.kt", l = {157}, m = "invokeSuspend")
/* compiled from: ExploreV2ViewModel.kt */
public final class ExploreV2ViewModel$rsvpEvent$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ExploreV2ViewModel d;
    public final /* synthetic */ g q;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2ViewModel$rsvpEvent$1(ExploreV2ViewModel exploreV2ViewModel, g gVar, boolean z, m0.l.c<? super ExploreV2ViewModel$rsvpEvent$1> cVar) {
        super(1, cVar);
        this.d = exploreV2ViewModel;
        this.q = gVar;
        this.x = z;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ExploreV2ViewModel$rsvpEvent$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ExploreV2ViewModel$rsvpEvent$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            EventRepo eventRepo = this.d.t;
            g gVar = this.q;
            Map<String, Object> t2 = v.t2(gVar.e, SourceLocation.SEARCH);
            this.c = 1;
            obj = eventRepo.f(gVar.d.Y1, !this.x, t2, this);
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
