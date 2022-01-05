package com.clubhouse.android.ui.onboarding.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.e.b.g3.r.a3.f;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: OnboardingTopicsViewModel.kt */
public final class OnboardingTopicsViewModel$removeUserTopic$2 extends Lambda implements p<f, b<? extends EmptySuccessResponse>, f> {
    public final /* synthetic */ Topic c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsViewModel$removeUserTopic$2(Topic topic) {
        super(2);
        this.c = topic;
    }

    public Object invoke(Object obj, Object obj2) {
        f fVar = (f) obj;
        i.e(fVar, "$this$execute");
        i.e((b) obj2, "it");
        return f.copy$default(fVar, false, (String) null, (List) null, g.T(fVar.d, Integer.valueOf(this.c.c)), 0, 23, (Object) null);
    }
}
