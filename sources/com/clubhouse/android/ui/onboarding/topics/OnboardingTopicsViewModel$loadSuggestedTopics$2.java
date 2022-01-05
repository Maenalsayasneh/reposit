package com.clubhouse.android.ui.onboarding.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.OnboardingSuggestedTopicsResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.g3.r.a3.f;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: OnboardingTopicsViewModel.kt */
public final class OnboardingTopicsViewModel$loadSuggestedTopics$2 extends Lambda implements p<f, b<? extends OnboardingSuggestedTopicsResponse>, f> {
    public final /* synthetic */ OnboardingTopicsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsViewModel$loadSuggestedTopics$2(OnboardingTopicsViewModel onboardingTopicsViewModel) {
        super(2);
        this.c = onboardingTopicsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        List<Topic> list;
        int i;
        f fVar = (f) obj;
        b bVar = (b) obj2;
        i.e(fVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof c) {
            OnboardingTopicsViewModel.q(this.c);
        }
        OnboardingSuggestedTopicsResponse onboardingSuggestedTopicsResponse = (OnboardingSuggestedTopicsResponse) bVar.a();
        String str = null;
        if (onboardingSuggestedTopicsResponse == null) {
            list = null;
        } else {
            list = onboardingSuggestedTopicsResponse.a;
        }
        boolean z = bVar instanceof i0.b.b.f;
        OnboardingSuggestedTopicsResponse onboardingSuggestedTopicsResponse2 = (OnboardingSuggestedTopicsResponse) bVar.a();
        if (onboardingSuggestedTopicsResponse2 != null) {
            str = onboardingSuggestedTopicsResponse2.b;
        }
        String str2 = str;
        OnboardingSuggestedTopicsResponse onboardingSuggestedTopicsResponse3 = (OnboardingSuggestedTopicsResponse) bVar.a();
        if (onboardingSuggestedTopicsResponse3 == null) {
            i = 0;
        } else {
            i = onboardingSuggestedTopicsResponse3.c;
        }
        return f.copy$default(fVar, z, str2, list, (Set) null, i, 8, (Object) null);
    }
}
