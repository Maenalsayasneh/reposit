package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.hallway.HallwayViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.p.r;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class v implements a {
    public final /* synthetic */ l.e a;

    public v(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new HallwayViewModel((r) jVar, eVar.b.h(), eVar.b.K(), eVar.b.L());
    }
}
