package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.r.a3.f;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class t implements a {
    public final /* synthetic */ l.e a;

    public t(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new OnboardingTopicsViewModel((f) jVar, l.l(eVar.b), l.q(eVar.b), eVar.b.u());
    }
}
