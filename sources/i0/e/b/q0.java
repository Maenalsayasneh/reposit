package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.events.EventsViewModel;
import com.clubhouse.android.ui.events.EventsViewState;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class q0 implements a {
    public final /* synthetic */ l.e a;

    public q0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new EventsViewModel((EventsViewState) jVar, eVar.b.h(), eVar.b.K(), eVar.b.u());
    }
}
