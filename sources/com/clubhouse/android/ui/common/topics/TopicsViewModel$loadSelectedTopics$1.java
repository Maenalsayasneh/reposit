package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.common.topics.TopicsViewModel$loadSelectedTopics$1", f = "TopicsViewModel.kt", l = {88}, m = "invokeSuspend")
/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel$loadSelectedTopics$1 extends SuspendLambda implements l<m0.l.c<? super GetProfileResponse>, Object> {
    public int c;
    public final /* synthetic */ TopicsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel$loadSelectedTopics$1(TopicsViewModel topicsViewModel, m0.l.c<? super TopicsViewModel$loadSelectedTopics$1> cVar) {
        super(1, cVar);
        this.d = topicsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new TopicsViewModel$loadSelectedTopics$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new TopicsViewModel$loadSelectedTopics$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            TopicsViewModel topicsViewModel = this.d;
            UserRepo userRepo = topicsViewModel.o;
            Integer b = topicsViewModel.p.b();
            this.c = 1;
            obj = UserRepo.q(userRepo, b, (String) null, (Map) null, this, 6, (Object) null);
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
