package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.clubs.invites.GrowClubViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.l.x2.t;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class s1 implements a {
    public final /* synthetic */ l.e a;

    public s1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new GrowClubViewModel((t) jVar, eVar.b.h(), eVar.c(), eVar.b.K());
    }
}
