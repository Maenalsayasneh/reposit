package com.clubhouse.android.ui.onboarding.topics;

import com.clubhouse.android.data.models.local.Topic;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.r.a3.f;
import i0.e.b.g3.r.b3.g;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: OnboardingTopicsFragment.kt */
public final class OnboardingTopicsFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ OnboardingTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsFragment$buildModels$1(OnboardingTopicsFragment onboardingTopicsFragment) {
        super(1);
        this.c = onboardingTopicsFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        OnboardingTopicsFragment onboardingTopicsFragment = this.c;
        k<Object>[] kVarArr = OnboardingTopicsFragment.Z1;
        OnboardingTopicsViewModel O0 = onboardingTopicsFragment.O0();
        final OnboardingTopicsFragment onboardingTopicsFragment2 = this.c;
        v.v2(O0, new l<f, i>() {
            public Object invoke(Object obj) {
                f fVar = (f) obj;
                m0.n.b.i.e(fVar, "state");
                List<Topic> list = fVar.c;
                if (list != null) {
                    o oVar = o.this;
                    OnboardingTopicsFragment onboardingTopicsFragment = onboardingTopicsFragment2;
                    for (Topic topic : list) {
                        g gVar = new g();
                        gVar.L(new Number[]{Integer.valueOf(topic.c)});
                        gVar.P(topic.d);
                        gVar.O(fVar.d.contains(Integer.valueOf(topic.c)));
                        gVar.M(new OnboardingTopicsFragment$buildModels$1$1$1$1$1(onboardingTopicsFragment, topic));
                        gVar.N(new OnboardingTopicsFragment$buildModels$1$1$1$1$2(onboardingTopicsFragment, topic));
                        oVar.add(gVar);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
