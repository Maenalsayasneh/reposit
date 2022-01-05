package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.onboarding.CollectNameViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.r.o0;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class b2 implements a {
    public final /* synthetic */ l.e a;

    public b2(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new CollectNameViewModel((o0) jVar, l.q(eVar.b), eVar.b.u());
    }
}
