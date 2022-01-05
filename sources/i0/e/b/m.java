package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.wave.WaveBarViewModel;
import i0.b.b.j;
import i0.e.b.l;
import i0.e.e.i;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class m implements WaveBarViewModel.b {
    public final /* synthetic */ l.c.b a;

    public m(l.c.b bVar) {
        this.a = bVar;
    }

    public WaveBarViewModel b(i iVar) {
        l.c.b bVar = this.a.e;
        Objects.requireNonNull(bVar);
        return new WaveBarViewModel(iVar, bVar.c.h());
    }

    public MavericksViewModel c(j jVar) {
        l.c.b bVar = this.a.e;
        Objects.requireNonNull(bVar);
        return new WaveBarViewModel((i) jVar, bVar.c.h());
    }
}
