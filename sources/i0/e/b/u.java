package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.r.z2.h;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class u implements a {
    public final /* synthetic */ l.e a;

    public u(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new OnboardingClubsViewModel((h) jVar, eVar.b.h(), eVar.b.K(), l.q(eVar.b), eVar.b.u(), l.o(eVar.b));
    }
}
