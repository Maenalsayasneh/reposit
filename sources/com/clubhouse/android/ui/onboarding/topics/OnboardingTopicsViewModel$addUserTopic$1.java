package com.clubhouse.android.ui.onboarding.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.data.repos.TopicRepo;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsViewModel$addUserTopic$1", f = "OnboardingTopicsViewModel.kt", l = {87}, m = "invokeSuspend")
/* compiled from: OnboardingTopicsViewModel.kt */
public final class OnboardingTopicsViewModel$addUserTopic$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ OnboardingTopicsViewModel d;
    public final /* synthetic */ Topic q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsViewModel$addUserTopic$1(OnboardingTopicsViewModel onboardingTopicsViewModel, Topic topic, m0.l.c<? super OnboardingTopicsViewModel$addUserTopic$1> cVar) {
        super(1, cVar);
        this.d = onboardingTopicsViewModel;
        this.q = topic;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new OnboardingTopicsViewModel$addUserTopic$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new OnboardingTopicsViewModel$addUserTopic$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingRepo onboardingRepo = this.d.o;
            int i2 = this.q.c;
            OnboardingState value = onboardingRepo.e.getValue();
            onboardingRepo.e.setValue(OnboardingState.a(value, (List) null, g.a0(value.b, Integer.valueOf(i2)), (List) null, (List) null, 13));
            TopicRepo topicRepo = this.d.n;
            Topic topic = this.q;
            this.c = 1;
            obj = topicRepo.a(topic, this);
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
