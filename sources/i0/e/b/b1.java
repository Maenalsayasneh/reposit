package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.clubs.HalfClubRulesViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.l.a2;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class b1 implements a {
    public final /* synthetic */ l.e a;

    public b1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new HalfClubRulesViewModel((a2) jVar, eVar.b.h());
    }
}
