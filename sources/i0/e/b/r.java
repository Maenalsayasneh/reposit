package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsState;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class r implements a {
    public final /* synthetic */ l.e a;

    public r(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new FollowSuggestionsViewModel((FollowSuggestionsState) jVar, eVar.b.u(), l.q(eVar.b), eVar.b.h(), new q(eVar), l.m(eVar.b));
    }
}
