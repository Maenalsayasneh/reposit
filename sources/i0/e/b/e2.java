package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.wave.WaveBarViewModel;
import i0.b.b.j;
import i0.e.b.l;
import i0.e.e.i;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class e2 implements WaveBarViewModel.b {
    public final /* synthetic */ l.e a;

    public e2(l.e eVar) {
        this.a = eVar;
    }

    public WaveBarViewModel b(i iVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new WaveBarViewModel(iVar, eVar.b.h());
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new WaveBarViewModel((i) jVar, eVar.b.h());
    }
}
