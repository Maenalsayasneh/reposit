package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.events.HalfEventViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.o.l0;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class t0 implements a {
    public final /* synthetic */ l.e a;

    public t0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new HalfEventViewModel((l0) jVar, eVar.b.h(), eVar.b.K());
    }
}
