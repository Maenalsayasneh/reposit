package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.profile.HalfProfileViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.u.q4;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class d0 implements a {
    public final /* synthetic */ l.e a;

    public d0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new HalfProfileViewModel((q4) jVar, eVar.b.h(), eVar.b.K(), l.s(eVar.b), l.o(eVar.b));
    }
}
