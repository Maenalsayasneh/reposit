package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import i0.e.b.l;
import i0.e.e.j;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class f2 implements WaveCoordinatorViewModel.b {
    public final /* synthetic */ l.e a;

    public f2(l.e eVar) {
        this.a = eVar;
    }

    public WaveCoordinatorViewModel a(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new WaveCoordinatorViewModel(jVar, eVar.b.h());
    }

    public MavericksViewModel c(i0.b.b.j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new WaveCoordinatorViewModel((j) jVar, eVar.b.h());
    }
}
