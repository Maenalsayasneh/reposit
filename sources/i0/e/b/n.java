package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import i0.e.b.l;
import i0.e.e.j;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class n implements WaveCoordinatorViewModel.b {
    public final /* synthetic */ l.c.b a;

    public n(l.c.b bVar) {
        this.a = bVar;
    }

    public WaveCoordinatorViewModel a(j jVar) {
        l.c.b bVar = this.a.e;
        Objects.requireNonNull(bVar);
        return new WaveCoordinatorViewModel(jVar, bVar.c.h());
    }

    public MavericksViewModel c(i0.b.b.j jVar) {
        l.c.b bVar = this.a.e;
        Objects.requireNonNull(bVar);
        return new WaveCoordinatorViewModel((j) jVar, bVar.c.h());
    }
}
